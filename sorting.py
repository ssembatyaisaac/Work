lists = [4,8,2,3,6,3,78,2,67,5,8,3,7,9,2,6,9,9,4,2,6,0,9,3,2,-4,-7,-1]
def SelectionSort(list):
    for i in range(len(list)):
        imin = i
        for j in range(len(list)):
            if(list[j] > list[imin]):
                imin = j
                temp = list[i]
                list[i] = list[imin]
                list[imin] = temp

SelectionSort(lists)
print(lists)