package patters;

import patters.facade.Facade;
import patters.singleton.SingletonEager;
import patters.singleton.SingletonLazy;
import patters.singleton.SingletonLazyHolder;
import patters.strategy.*;

public class Main {
    public static void main(String[] args) {

        /** SINGLETON

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
         */

        /** STRATEGY

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


        */

        /** FACADE
         *


        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "89170000");

         */

    }
}
