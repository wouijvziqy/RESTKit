package io.github.newhoo.restkit.restful;

import com.intellij.psi.PsiElement;
import io.github.newhoo.restkit.common.KV;
import io.github.newhoo.restkit.common.PsiRestItem;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * resolver params from psiElement
 *
 * @author huzunrong
 * @since 2.0.2
 */
public interface ParamResolver {

    /**
     * 根据 psiElement 构造Header
     * <p>
     * return format:
     * <pre>
     *     header1: value1
     *     header2: value2
     * </pre>
     *
     * @param psiElement {@link PsiRestItem#psiElement}
     */
    @NotNull
    List<KV> buildHeaders(@NotNull PsiElement psiElement);

    /**
     * 根据 psiElement 构造Param: URL参数
     * <p>
     * return format:
     * <pre>
     *     key1: value1
     *     key2: value2
     * </pre>
     *
     * @param psiElement {@link PsiRestItem#psiElement}
     */
    @NotNull
    List<KV> buildParams(@NotNull PsiElement psiElement);

    /**
     * 根据 psiElement 构造request body
     *
     * @param psiElement {@link PsiRestItem#psiElement}
     * @return json string
     */
    @NotNull
    String buildRequestBodyJson(@NotNull PsiElement psiElement);

    /**
     * 根据 psiElement 构造request description
     *
     * @param psiElement {@link PsiRestItem#psiElement}
     * @return json string
     */
    @NotNull
    String buildDescription(@NotNull PsiElement psiElement);
}