#include <vector>
#include <list>

template<typename K, typename V>
class SimpleHashTable {
    std::vector<std::list<std::pair<K,V>>> table{10};
    
    size_t hash(const K& key) const {
        return std::hash<K>{}(key) % table.size();
    }
    
public:
    void put(const K& key, const V& value) {
        auto& bucket = table[hash(key)];
        for (auto& p : bucket) 
            if (p.first == key) { p.second = value; return; }
        bucket.push_back({key, value});
    }
    
    V* get(const K& key) {
        for (auto& p : table[hash(key)]) 
            if (p.first == key) return &p.second;
        return nullptr;
    }
};
