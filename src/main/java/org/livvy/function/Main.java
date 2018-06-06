package org.livvy.function;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author guozheng
 * @date 2018/06/06
 */
public class Main {

    public static void main(String[] args) {
        List<Apple> apples = Lists.newArrayList();

    }

    public static List<Apple> filter(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = Lists.newArrayList();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;

    }
}
