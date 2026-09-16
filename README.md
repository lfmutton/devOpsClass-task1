##  Tabela de Implementação TDD (Detalhada)

| #P | Cenário / Setup (Dado) | Execução (Quando) | Resultado (Então / Asserts) |
|:---:|:---|:---|:---|
| *Aliffer* | java<br>@Test<br>void deveLiberarTresCursosAoFinalizarCursoComMediaAcimaDeSete() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno(media: 8.0);<br> | java<br>// QUANDO<br>aluno.finalizarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(3, aluno.getCursosLiberados());<br>}<br> |
| *Lucas* | java<br>@Test<br>void deveLiberarTresCursosAoFinalizarCursoComMediaAcimaDeSete() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno(media: 5.5);<br> | java<br>// QUANDO<br>aluno.fializarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(0, aluno.getCursosNãoLiberados());<br>}<br> |
| *Luis* | java<br>@Test<br>void quandoIniciadoUmCurso() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno(media: 8.0);<br> | java<br>// QUANDO<br>aluno.finalizarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(False, curso.IsFinalizado());<br>}<br> |
| *William* | java<br>@Test<br>void deveBloquearAcessoQuandoMensalidadeNaoForPaga() {<br>    // DADO<br>    var curso = new Curso();<br>    var aluno = new Aluno();<br>    var mensalidade = new Mensalidade(status: "PENDENTE");<br> | java<br>// QUANDO<br>aluno.fializarCurso(curso);<br> | java<br>// ENTÃO<br>assertEquals(False, aluno.temAcessoAoCurso());<br>assertEquals(true, aluno.isPlataformaCongelada());<br>}<br> |

---


## <h1> Resultados </h1>

## RED 
<img width="1586" height="462" alt="image" src="https://github.com/user-attachments/assets/eb33b4fc-1ef9-418d-8df8-9c925796ed89" />

## GREEN
<img width="763" height="583" alt="image" src="https://github.com/user-attachments/assets/a420715f-ffe5-41be-a6c1-0c537dd415f6" />

## BLUE
<img width="830" height="697" alt="image" src="https://github.com/user-attachments/assets/cef593d3-54a5-4f9e-b7f0-5ac243b03178" />


