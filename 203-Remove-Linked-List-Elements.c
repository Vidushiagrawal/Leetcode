/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
   struct  ListNode *t,*p;
   if(head!=NULL){
    if(head->val==val)
    head=head->next;
    if(head!=NULL){
        t=head;
    while(t->next!=NULL){
        if(t->next->val==val){
            t->next=t->next->next;
        }
        else{
            t=t->next;
        }
    }
    if(t->val==val)
    head->next=NULL;
    if(head->val==val)
    head=head->next;

        
    }
   }
   return head;
   }