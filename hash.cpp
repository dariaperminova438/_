#include <vector>
#include <list>
template<class K,class V>
struct H{
    std::vector<std::list<std::pair<K,V>>> t{10};
    void p(K k,V v){auto&b=t[std::hash<K>{}(k)%10];for(auto&p:b)if(p.first==k){p.second=v;return;}b.push_back({k,v});}
    V*g(K k){for(auto&p:t[std::hash<K>{}(k)%10])if(p.first==k)return&p.second;return 0;}
};
