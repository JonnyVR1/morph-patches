package kotlin.coroutines.jvm.internal;

import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.vivo.push.PushClientConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@SinceKotlin
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0011\b\u0081\u0002\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m88121d2 = {"Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", "", WBConstants.AUTH_PARAMS_VERSION, "", "sourceFile", "", "lineNumbers", "", "localNames", "spilled", "indexToLabel", "methodName", PushClientConstants.TAG_CLASS_NAME, "nextLineNumbers", "<init>", "(ILjava/lang/String;[ILkotlin/Array;Lkotlin/Array;[ILjava/lang/String;Ljava/lang/String;[I)V", ResourceDirection.f39656v, "()I", "f", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45292l, "()[I", "m", "c", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@PublishedApi
public @interface DebugMetadata {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DefaultImpls {
    }

    @JvmName
    /* JADX INFO: renamed from: c */
    String m88262c() default "";

    @JvmName
    /* JADX INFO: renamed from: f */
    String m88263f() default "";

    @JvmName
    /* JADX INFO: renamed from: l */
    int[] m88264l() default {};

    @JvmName
    /* JADX INFO: renamed from: m */
    String m88265m() default "";

    @JvmName
    /* JADX INFO: renamed from: v */
    int m88266v() default 2;
}
