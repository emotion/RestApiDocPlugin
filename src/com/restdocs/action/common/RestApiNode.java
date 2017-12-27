package com.restdocs.action.common;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiMethod;

public class RestApiNode {
    private PsiClass  psiClass;
    private PsiMethod psiMethod;

    public RestApiNode(PsiClass psiClass, PsiMethod psiMethod) {
        this.psiClass = psiClass;
        this.psiMethod = psiMethod;
    }

    public PsiClass getPsiClass() {
        return psiClass;
    }

    public void setPsiClass(PsiClass psiClass) {
        this.psiClass = psiClass;
    }

    public PsiMethod getPsiMethod() {
        return psiMethod;
    }

    public void setPsiMethod(PsiMethod psiMethod) {
        this.psiMethod = psiMethod;
    }
}
