bool isValid(char* s) {
        int n = strlen(s);
    char stack[n+1];   // safer
    int top = -1;
    for(int i = 0; i < n; i++) {
        if(s[i] == '(' || s[i] == '[' || s[i] == '{') {
            stack[++top] = s[i];
        }
        else {
            if(top == -1)
                return false;
            char x = stack[top--];
            if((s[i] == ')' && x != '(') ||
               (s[i] == ']' && x != '[') ||
               (s[i] == '}' && x != '{')) {
                return false;
            }
        }
    }
    return top == -1;
}