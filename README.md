##  Tabela de Implementação TDD (Detalhada)

| #P | Cenário / Setup (Dado) | Execução (Quando) | Resultado (Então / Asserts) |
|:---:|:---|:---|:---|
| *Aliffer* | java<br>@Test<br>void deveLiberarTresCursosAoFinalizarCursoComMediaAcimaDeSete() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno(media: 8.0);<br> | java<br>// QUANDO<br>aluno.finalizarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(3, aluno.getCursosLiberados());<br>}<br> |
| *Lucas* | java<br>@Test<br>void deveLiberarTresCursosAoFinalizarCursoComMediaAcimaDeSete() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno(media: 5.5);<br> | java<br>// QUANDO<br>aluno.fializarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(0, aluno.getCursosNãoLiberados());<br>}<br> |
| *Luis* | java<br>@Test<br>void quandoIniciadoUmCurso() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno(media: 8.0);<br> | java<br>// QUANDO<br>aluno.finalizarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(False, curso.IsFinalizado());<br>}<br> |
| *William* | java<br>@Test<br>void deveBloquearAcessoQuandoMensalidadeNaoForPaga() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno();<br>    var mensalidade = new Mensalidade(status: "PENDENTE");<br> | java<br>// QUANDO<br>aluno.fializarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(False, aluno.temAcessoAoCurso());<br>assertEquals(true, aluno.isPlataformaCongelada());<br>}<br> |

---
