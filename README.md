# Jogo Pong com efeitos sonoros e placar mostrando a pontuação de cada jogador

## Game Pong escrito em java na IDE eclipse usando bibliotecas de audio para dar efeitos sonoros ao jogo.
#### * Logo no começo tem um menu simples usando arreys para escolha se quer iniciar o jogo ou sair e fechar a tela.
#### * O jogo conta com uma interface interativa usando classes como JFrame.
#### * O projeto em si contou com 10 classes cada uma desepenhando uma função importante para desemvolvimento do jogo.
#### * Principais classes como o Launch.java onde fica o metodo principal para execução do jogo e também a classe Game.java muito importante contendo as funcionalidades do jogo.
#### * Classe de Audio.java onde fica contido os efeitos sonoros como o toque de entrada e o toque no contato com a bolinha.
#### * Utilizei Threads, já que o jogo precisa executar tarefas ao mesmo tempo.

### Classes utilizadas

* [Launch do jogo](https://github.com/tchio1991/Jogo-Pong/blob/main/src/Launch.java)
* [Game, funcionalidade do jogo](https://github.com/tchio1991/Jogo-Pong/blob/main/src/Game.java)

#### Pacote audio

* [Audio do jogo](https://github.com/tchio1991/Jogo-Pong/blob/main/src/audio/AudioPlayer.java)

#### Pacote display

* [Display, fucionamento grafico do jogo](https://github.com/tchio1991/Jogo-Pong/blob/main/src/display/Display.java)

#### Pacote Imput 

* [Imput, comandos de entradas os controles do jogo](https://github.com/tchio1991/Jogo-Pong/blob/main/src/imput/KeyManager.java)

#### Pacote states, aqui fica localizadas as classes defidas para controlar a velocidade do jogo.

* [FPSState](https://github.com/tchio1991/Jogo-Pong/blob/main/src/states/FPSState.java)
* [Level1State](https://github.com/tchio1991/Jogo-Pong/blob/main/src/states/Level1State.java)
* [MenuState](https://github.com/tchio1991/Jogo-Pong/blob/main/src/states/MenuState.java)
* [State](https://github.com/tchio1991/Jogo-Pong/blob/main/src/states/State.java)
* [StateManager](https://github.com/tchio1991/Jogo-Pong/blob/main/src/states/StateManager.java)

