# Bilateral-Selection-Sort
Bilateral Selection Sort Technique Sorts is the modified version of Selection Sort in terms of minimizing the number of iterations by selecting smallest and largest element and placing them in appropriate location

> ## Pseudo Code
> START PROCEDURE\
> &nbsp;&nbsp;list: Array of elements\
> &nbsp;&nbsp;n: Size of list\
> &nbsp;&nbsp;rightshrink: n-1\
> &nbsp;&nbsp;FOR i = 0 till n/2\
> &nbsp;&nbsp;&nbsp;&nbsp;min = i\
> &nbsp;&nbsp;&nbsp;&nbsp;max = i\
> &nbsp;&nbsp;&nbsp;&nbsp;FOR leftshrink = i till rightshrink\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF list[leftshrink] > max\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;THEN max = list[ leftshrink ] AND getindexmax = leftshrink\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF list [leftshrink] < min\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;THEN min = list [ leftshrink ] AND getindexmin = leftshrink\
> &nbsp;&nbsp;&nbsp;&nbsp;END-FOR\
> &nbsp;&nbsp;&nbsp;&nbsp;Swap in list (list[ i ] with list[getindexmin])\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF list[ getindexmax ] == max\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Swap in list ( list[ rightshrink ] with list[getindexmin ])\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ELSE\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Swap in list ( list[ rightshrink ] with list [ getindexmax ])\
> &nbsp;&nbsp;--rightshrink\
> &nbsp;&nbsp;END-FOR\
>END PROCEDURE

## Iterations Comparison
![image](https://user-images.githubusercontent.com/61224114/130558063-4de827c1-47d3-465e-8e0f-67c417c4f6a3.png)

## Test Analysis
![image](https://user-images.githubusercontent.com/61224114/130557665-eff7682f-6207-4f79-94d8-93679128235c.png)

