import sys

for i in range(1,11):
    for j in range(1,11):
        k=i*j
        print(k, end='  ')
    print()

for letter in 'Python':
    if letter == 'h':
        pass
        print('This a pass')
    print ('Current Letter :', letter)