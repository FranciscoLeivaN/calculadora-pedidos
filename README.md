Ejercicio Guiado: Pruebas Unitarias con JUnit en una Calculadora.

Grupo 2: Francisco Leiva / Guillermo Torres.

¿Qué te ayudaron a identificar las pruebas unitarias?
Las pruebas unitarias ayudaron a identificar las dependencias de la estructura del proyecto, los comportamientos esperados y la identificación de parametros requeridos para cada metodo.

¿Cuál fue el beneficio de usar mock para simular las dependencia?
Permitio un mayor control y aislamiento para probar pedidoService independientemente del comportamento real en DescuentoRepository.

¿Qué pasaría si se modifica la lógica de descuentos sin actualizar las pruebas?
Las pruebas fallidas alertarian inmediatamente sobre cambios que afectan el comportamiento esperado.

¿Cómo escalamos esta estrategia para un sistema más grande?
Se puede realizar una organización por capas:
* Pruebas unitarias para componenetes individuales.
* Pruebas de integración para verificar interacciones entre componentes.
* Pruebas de extremo a extremo para flujos complejos.

Tambien se puede agregar automatización para ejecutar pruebas en cada cambio realizado.
