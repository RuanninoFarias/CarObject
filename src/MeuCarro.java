import java.util.Scanner;

public class MeuCarro {
    public void exibirMenu(){
        Scanner tec = new Scanner(System.in);
        int op = 0;
        Carro myCar = new Carro();

        while (op != 4) {
            System.out.println("MENU DE CARROS");
            System.out.println("1 - Cadastrar carro\n" +
                    "2 - Editar carro\n" +
                    "3 - Exibir informações\n" +
                    "4 - Sair");
            System.out.println("Sua opção: ");
            op = tec.nextInt();

            switch (op) {
                case 1:
                    System.out.println("CADASTRAR VEICULO");
                    System.out.println("Marca do carro: ");
                    String mar1 = tec.nextLine();
                    tec.nextLine();
                    myCar.setMarca(mar1);

                    System.out.println("Modelo do carro: ");
                    String mod1 = tec.nextLine();
                    myCar.setModelo(mod1);

                    System.out.println("Ano do carro: ");
                    int an1 = tec.nextInt();
                    myCar.setAno(an1);

                    System.out.println("Carro cadastrado com Sucesso!");
                    break;
                case 2:
                    int op2 = 0;
                    while (op2 != 5) {
                        System.out.println("EDITAR VEICULO");
                        System.out.println("Qual informação você quer modificar? ");

                        System.out.println("1 - Marca | 2 - Modelo | 3- Ano | 4 - Todas | 5 - Voltar");
                        op2 = tec.nextInt();
                        tec.nextLine();

                        if (op2 == 1) {
                            System.out.println("Atualizar marca: ");
                            String ma = tec.nextLine();
                            myCar.setMarca(ma);
                        } if (op2 == 2) {
                            System.out.println("Atualizar modelo: ");
                            String md = tec.nextLine();
                            myCar.setModelo(md);
                        } if (op2 == 3) {
                            System.out.println("Atualizar ano: ");
                            int ano2 = tec.nextInt();
                            myCar.setAno(ano2);
                        } if (op2 == 4) {
                            System.out.println("Atualizar marca: ");
                            String ma2 = tec.nextLine();
                            myCar.setMarca(ma2);
                            System.out.println("Atualizar modelo: ");
                            String md2 = tec.nextLine();
                            myCar.setModelo(md2);
                            System.out.println("Atualizar ano: ");
                            int an2 = tec.nextInt();
                            myCar.setAno(an2);
                            }
                        else {
                            System.out.println("Opção Inválida!");
                        }
                    }
                    break;
                case 3:
                    myCar.exibirCarro();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        tec.close();
    }
}

