<h2 align="center">
  URL Shortener (Encurtador de URL) ✂️
</h2>

Resolução do desafio proposto pelo repositorio Backend Brasil, confira detalhes [neste link](https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md).

## :rocket: Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data MongoDB
* Docker
* MongoDB
* Insomnia

### Clonando o Repositório

Clone este repositório em sua máquina local:

```bash
git clone https://github.com/Rvictorio/UrlShortener
```

## Exemplo

Seu serviço recebe uma chamada para encurtar uma URL.

**[POST]** `{{host}}/shorten-url`

```json
{
    "url": "https://github.com/Rvictorio/UrlShortener"
}
```

E retorna um JSON com a URL encurtada:

```
HTTP/1.1 200 OK
```

```json
{
    "url": "https://xxx.com/DXB6V"
}
```

## 📨 Requisições

| Método | URL                            | Descrição                       | Corpo da requisição     |
| ------ | ------------------------------ | ------------------------------- | ----------------------- |
| POST   | /v1/shorten-url                | Encurte uma nova URL.           | [JSON](#encurtarurl)    |


## Colaboradores:
<table>
  <tr>
    <td align="center">
      <a href="http://github.com/rvictorio">
        <img src="https://avatars.githubusercontent.com/rvictorio" width="100px;" alt="Foto de Rafael Victorio no GitHub"/><br>
        <sub>
          <b>Rafael</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
