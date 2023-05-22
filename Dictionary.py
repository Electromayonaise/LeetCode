names = [
    'Martin',
    'Michael',
    'James',
    'David',
]

#List Comprehension

lenght = [len(name) for name in names]
print(lenght)

#Dictionary Comprehension

lenght = {name:len(name) for name in names}
print(lenght)