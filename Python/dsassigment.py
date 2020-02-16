n = int(input("Enter the number of elements: "))

lists = list(map(int, input("\nEnter the numbers : ").strip().split()))[:n]

print("\nList is ", lists)
pos =1
max1 = float("-inf")
max2 = float("-inf")

for i in range(len(lists)):
    if (lists[i] > max1):
        max1 = lists[i]
        pos = i

for i in range(len(lists)):
    if(i==pos):
        continue
    elif lists[i] > max2:
        max2 = lists[i]

product= max1 * max2
print(product)