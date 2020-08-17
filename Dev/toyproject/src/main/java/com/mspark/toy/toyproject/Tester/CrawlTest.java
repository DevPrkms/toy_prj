package com.mspark.toy.toyproject.Tester;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class CrawlTest {

    public static void main(String[] args) {
        System.out.println(" ### main 실행 ### ");
        getDongA(); // 동아닷컴
        getDigCho(); // 디지틀조선
        getIntHan(); // 인터넷한겨례
        getJoins(); // 조인스닷컴
        getMae(); // 매경닷컴
        getHan(); // 한경닷컴
        getMoney(); // 머니투데이
        getEdaily(); // 이데일리
        getOhmy(); // 오마이뉴스
        System.out.println(" ### main 종료 ### ");
    }

    public static void getDongA() {
        System.out.println(" ### getDongA 실행 ### ");

        String Title, Contents, Image = "";
        String main_url = "https://www.donga.com/news/List?p=1&prod=news&ymd=&m=NP";
        // 크롤링 url (동아닷컴 동아일보 기사만 링크)
        Document doc = null;
        // Document 초기화

        try {
            doc = Jsoup.connect(main_url).get();
            // Document 객체에 url 연결하여 접속
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" ### getDongA 종료 ### ");
    } // 동아닷컴

    public static void getDigCho() {
        System.out.println(" ### getDigCho 실행 ### ");
        System.out.println(" ### getDigCho 종료 ### ");
    } // 디지틀조선

    public static void getIntHan() {
        System.out.println(" ### getIntHan 실행 ### ");
        System.out.println(" ### getIntHan 종료 ### ");
    } // 인터넷한겨례

    public static void getJoins() {
        System.out.println(" ### getJoins 실행 ### ");
        System.out.println(" ### getJoins 종료 ### ");
    } // 조인스닷컴

    public static void getMae() {
        System.out.println(" ### getMae 실행 ### ");
        System.out.println(" ### getMae 종료 ### ");
    } // 매경닷컴

    public static void getHan() {
        System.out.println(" ### getHan 실행 ### ");
        System.out.println(" ### getHan 종료 ### ");
    } // 한경닷컴

    public static void getMoney() {
        System.out.println(" ### getMoney 실행 ### ");
        System.out.println(" ### getMoney 종료 ### ");
    } // 머니투데이

    public static void getEdaily() {
        System.out.println(" ### getEdaily 실행 ### ");
        System.out.println(" ### getEdaily 종료 ### ");
    } // 이데일리

    public static void getOhmy() {
        System.out.println(" ### getOhmy 실행 ### ");
        System.out.println(" ### getOhmy 종료 ### ");
    } // 오마이뉴스

}