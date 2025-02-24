class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
       unordered_map<int,int> sqmap;
       int longest=0;
        for(int num:nums){
            if(sqmap.find(num)==sqmap.end()){
                int left=sqmap.count(num-1)?sqmap[num-1]:0;
                int right=sqmap.count(num+1)?sqmap[num+1]:0;
                int length=left+1+right;
                sqmap[num]=length;
                sqmap[num-left]=length;
                sqmap[num+right]=length;
                longest=max(longest,length);

            }
        }
        return longest;
    }
};