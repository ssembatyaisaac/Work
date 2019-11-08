lists = [4,8,2,3,6,3,78,2,67,5,8,3,7,9,2,6,9,9,4,2,6,0,9,3,2,-4,-7,-1]

print(lists)

n = int(input("Enter number to be searched in the list: "))

def linearsearch(lists,n):
    for i in range(len(lists)):
        if n == lists[i]:
            print(n ," found at index " , i)
    return -1

linearsearch(lists,n)