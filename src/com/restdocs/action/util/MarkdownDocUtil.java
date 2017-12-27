package com.restdocs.action.util;

import com.restdocs.action.common.RestServiceNode;

public class MarkdownDocUtil {
    public static String generateDoc(RestServiceNode serviceNode) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name" + serviceNode.getPsiMethod().getName());
        return stringBuilder.toString();
    }
}
