class MyHashSet {
    int size;
    vector<list<int>> buckets;
    int hash(int key){
        return key% size;
    }
public:
    MyHashSet() {
         size=1000;
         buckets.resize(size);
    }
    
    void add(int key) {
                int index=hash(key);
            if(!contains(key))
        buckets[index].push_back(key);
    }
    
    void remove(int key) {
        int index=hash(key);
        buckets[index].remove(key);

    }
    
    bool contains(int key) {
                int index=hash(key);
                for(int n : buckets[index]){
                    if(n==key) return true;
                }
                return false;
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */