package com.changyoun.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if aIf = new A_if();
//        aIf.testSimpleIfStatement();

        B_ifElse b = new B_ifElse();
//        b.testSimpleIfElseStatement();

        C_IfElseIf c = new C_IfElseIf();
//        c.testSimpleIfElseIfStatement();
//        c.testNestedIfElseIfStatement();
//        c.improveNestedIfElseIfStatement();

        D_switch d = new D_switch();
//        d.testSimpleSwitchStatement();
        d.improveSwitchStatement();
    }
}
