Endpoints
Usuarios
GET /api/usuarios
Devuelve una lista de todos los usuarios registrados en el sistema.

GET /api/usuarios/{id}
Devuelve el usuario correspondiente al ID proporcionado.

POST /api/usuarios
Crea un nuevo usuario en el sistema.

PUT /api/usuarios/{id}
Actualiza los detalles de un usuario existente.

DELETE /api/usuarios/{id}
Elimina un usuario del sistema por su ID.

Pedidos
POST /api/pedidos
Crea un nuevo pedido en el sistema. Verifica el stock de los productos antes de crear el pedido.

GET /api/pedidos
Devuelve una lista de todos los pedidos registrados en el sistema.

DELETE /api/pedidos/{id}
Elimina un pedido del sistema por su ID.

