O bug ocorria porque o laço de `calcularMedia` começava no índice `1`, ignorando a primeira nota de cada aluno. O início foi alterado para o índice `0`, fazendo com que todas as notas sejam somadas antes da divisão pela quantidade de notas.

A constante `MEDIA_RECUPERACAO` estava definida como `6.5`, embora o README estabeleça recuperação para médias a partir de `5.0`. O valor foi alterado para `5.0`, permitindo que médias iguais ou superiores a 5.0 e inferiores ao limite de aprovação sejam classificadas como `Recuperação`.
