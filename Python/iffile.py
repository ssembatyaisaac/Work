amount=int(input('Enter amount: '))

if amount<=500:
    discount=amount*0.10
    print('Dicount: ',discount)
elif amount<=1000:
    discount=amount*0.15
    print('Dicount: ',discount)
else:
    discount=amount*0.20
    print('Dicount: ',discount)

print('Cash to be paid: ',amount-discount)

for letter in 'Ssembatya':
    print(letter)

numbers = [11,33,55,39,55,48,75,37,21,23,41,13]

for num in numbers:
    if num%2==0:
        print("There's an even number in the list")
        break
else:
    print("its an odd list")