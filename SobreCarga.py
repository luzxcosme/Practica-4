import math
class FiguraGeometrica:
    def area_circulo(self, radio):
        return math.pi * radio * radio  # circulo

    def area_rectangulo(self, base, altura):
        return base * altura  # rectangulo

    def area_triangulo(self, base, altura):
        return (base * altura) / 2  # triangulo rectangulo

    def area_trapecio(self, base_mayor, base_menor, altura):
        return ((base_mayor + base_menor) * altura) / 2  # trapecio

    def area_pentagono(self, lado, apotema):
        return (5 * lado * apotema) / 2  # pentagono

f = FiguraGeometrica()

print("circulo:", f.area_circulo(1))
print("rectangulo:", f.area_rectangulo(4, 3))
print("triangulo:", f.area_triangulo(4, 8))
print("trapecio:", f.area_trapecio(2, 4, 6))
print("pentagono:", f.area_pentagono(5, 3))
