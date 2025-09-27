class HashTable:
    def __init__(self, size=10):
        self.table = [[] for _ in range(size)]
    
    def __setitem__(self, key, value):
        bucket = self.table[hash(key) % len(self.table)]
        for i, (k, v) in enumerate(bucket):
            if k == key:
                bucket[i] = (key, value)
                return
        bucket.append((key, value))
    
    def __getitem__(self, key):
        for k, v in self.table[hash(key) % len(self.table)]:
            if k == key:
                return v
        raise KeyError(key)

# Использование
ht = HashTable()
ht["apple"] = 5
ht["banana"] = 3
print(ht["apple"])  # 5
