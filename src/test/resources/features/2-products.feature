@Suite @ShoppingCart
Feature: CP02 - validar carrito de compras

  Background: Realizar 3 validaciones en el carrito de compras
    Given el usuario navega al sitio web
    When ingresa credenciales validas

    @ShoppingCartList
    Scenario: 1 - comprobar carrito de compras al seleccionar productos
      And agrega productos al carrito
      And da click en el icono del carrito
      Then la aplicacion debería listar los productos seleccionados en el carrito de compras

    @ShoppingCartEmpty
    Scenario: 2 - comprobar que al no seleccionar nada el carrito de compras esté vacio
      And da click en el icono del carrito
      Then la aplicacion deberia mostrar el carrito sin productos

    @ShoppingCartProcess
    Scenario: 3 - comprobar que al agregar productos al carrito se pueda realizar la compra exitosamente
      And agrega productos al carrito
      And da click en el icono del carrito
      When completa el registro de la orden
      Then la aplicacion deberia procesar la compra