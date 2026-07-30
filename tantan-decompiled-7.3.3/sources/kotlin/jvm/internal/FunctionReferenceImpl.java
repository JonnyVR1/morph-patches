package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).mo88354d(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @SinceKotlin
    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    @SinceKotlin
    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
