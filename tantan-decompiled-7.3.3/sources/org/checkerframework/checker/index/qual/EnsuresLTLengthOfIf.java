package org.checkerframework.checker.index.qual;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.ConditionalPostconditionAnnotation;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.JavaExpression;
import org.checkerframework.framework.qual.QualifierArgument;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@InheritedAnnotation
@ConditionalPostconditionAnnotation(qualifier = LTLengthOf.class)
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresLTLengthOfIf {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InheritedAnnotation
    @ConditionalPostconditionAnnotation(qualifier = LTLengthOf.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresLTLengthOfIf[] value();
    }

    String[] expression();

    @QualifierArgument(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET)
    @JavaExpression
    String[] offset() default {};

    boolean result();

    @QualifierArgument("value")
    @JavaExpression
    String[] targetValue();
}
