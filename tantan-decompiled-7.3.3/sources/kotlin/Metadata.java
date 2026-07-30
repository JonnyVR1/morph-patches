package kotlin;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.data.OMSMercuryType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@SinceKotlin
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0096\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0002\u0012\f\b\u0002\u0010\u0004\u001a\u00020\u0005B\u0002\b\f\u0012\u001e\b\u0002\u0010\u0006\u001a\u00020\u0005B\u0014\b\fJ\u0004\b\u0003\u0010\u0002J\u0004\b\u0003\u0010\u0000J\u0004\b\u0003\u0010\u0006\u0012\u0012\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bB\u0002\b\f\u0012\u0012\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bB\u0002\b\f\u0012\u000e\b\u0002\u0010\u000b\u001a\u00020\tB\u0004\b\b(\f\u0012\u000e\b\u0002\u0010\r\u001a\u00020\tB\u0004\b\b(\f\u0012\u000e\b\u0002\u0010\u000e\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0000R\u0011\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u00020\u0005X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u00020\tX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u000e\u001a\u00020\u0003X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, m88121d2 = {"Lkotlin/Metadata;", "", "kind", "", "metadataVersion", "", "bytecodeVersion", "data1", "", "", "data2", "extraString", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "extraInt", "k", "()I", OMSMercuryType.f39640mv, "()[I", "bv$annotations", "()V", "bv", "d1", "()[Ljava/lang/String;", "d2", "xs", "()Ljava/lang/String;", "pn$annotations", "pn", "xi$annotations", "xi", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
public @interface Metadata {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DefaultImpls {
    }

    @JvmName
    /* JADX INFO: renamed from: bv */
    int[] m88119bv() default {1, 0, 3};

    @JvmName
    /* JADX INFO: renamed from: d1 */
    String[] m88120d1() default {};

    @JvmName
    /* JADX INFO: renamed from: d2 */
    String[] m88121d2() default {};

    @JvmName
    /* JADX INFO: renamed from: k */
    int m88122k() default 1;

    @JvmName
    /* JADX INFO: renamed from: mv */
    int[] m88123mv() default {};

    @JvmName
    /* JADX INFO: renamed from: pn */
    String m88124pn() default "";

    @JvmName
    /* JADX INFO: renamed from: xi */
    int m88125xi() default 0;

    @JvmName
    /* JADX INFO: renamed from: xs */
    String m88126xs() default "";
}
