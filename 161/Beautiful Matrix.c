#include <stdio.h>

int a[6][6];

int main () {
    
    int i, j, x, y;
    
    for (i = 1; i < 6; i++) {
        for (j = 1; j < 6; j++) {
            scanf ("%d", &a[i][j]);
            if (a[i][j] == 1) {
                x = i - 3;
                y = j - 3;
                printf("%d", (x>0?x:-x)+(y>0?y:-y));
                return 0;
            }
        }
    }
    
    
    
    
    return 0;
}
