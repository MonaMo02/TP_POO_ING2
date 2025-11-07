#include <stdio.h>

#define NUMBER_OF_SIDES 4

float calculateArea(double length, double width){
        return length*width;
    }

float calculatePerimeter(double length, double width){
    return NUMBER_OF_SIDES / 2.0 * (length + width);
    }

int main(){

    float length;
    float width;

    printf("Enter the length of the rectangle: ");
    scanf("%f", &length);

    printf("Enter the width of the rectangle: ");
    scanf("%f", &width);

    float area = calculateArea(length, width);
    float perimeter = calculatePerimeter(length, width);


    printf("The area of the rectangle is: %lf \n", area);
    printf("The perimeter of the rectangle is: %lf \n", perimeter);


    return 0;

    }
