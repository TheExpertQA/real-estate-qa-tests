### Create User API - Manual Test Case

- **Endpoint**: POST https://reqres.in/api/users
- **Request Body**:
```json
{
  "name": "morpheus",
  "job": "leader"
}

Expected Response:

Status code: 201

Response should contain fields: id, createdAt