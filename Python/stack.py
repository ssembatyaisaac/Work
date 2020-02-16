a=b=c=1
print(a)
b=2
print(c)
a,b,c = 3,'Mine',True
print(c)

#del a
#print(a)

timo = [1, 23, 'Mine', 'Ducky', False, 345, -244]
i=0
for me in timo:
    print(me)
if('Mine' in timo):
    print('Mine is present')
jane = ['ringer', 'cashmeouside']

print(timo[3] + jane[0])
print(timo)
print(jane *2)
print(timo[1:3])

games = ('football', 'rugby', 'hockey', 'cricket', 'basketball', 'golf', 234)
print(games)
print(games * 3)
print(games[1:3])

timo[2] = 'Melk'
print(timo)
#games[3] = 'Chess'
#print(games)

newwords = {'john': 'Peter', 'mandate': 2343, 35: 34}
print(newwords)
#print(newwords[0])
print(newwords.keys())
print(newwords.items())
print(newwords.values())

print(int('10001111001101110',base=2))
print(9.999999//2)
print(9//2)