def invertir_vector(vector):
    n = len(vector)
    for i in range(n // 2):
        vector[i], vector[n - 1 - i] = vector[n - 1 - i], vector[i]


n = int(input("Cuantos numeros Desea ingreser : "))
vector = []

for i in range(n):
    numero = int(input("ingrese un numeero que sea entero porfavor : "))
    vector.append(numero)

print("Vector original:", vector)

invertir_vector(vector)

print("Vector invertido:", vector)

