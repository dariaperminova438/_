class HashTable:
    def __init__(self): self.t=[[] for _ in range(10)]
    def put(self,k,v): [b.append((k,v)) for b in [self.t[hash(k)%10]] if k not in [p[0] for p in b]]
    def get(self,k): return next((v for key,v in self.t[hash(k)%10] if key==k),None)
