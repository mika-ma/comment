package com.main;

import com.season.core.spring.SeasonApplication;
import com.season.core.spring.SeasonRunner;

/**
 * Created by mwkang on 2016/12/19.
 * 启动类
 */
public class App extends SeasonApplication {
    public static void main(String[] args) {
        SeasonRunner.run(App.class);
    }
}
