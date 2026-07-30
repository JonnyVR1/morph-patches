package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"Ll/c1n;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Ljava/lang/String;", "customUserAgent", "", "b", "()Z", "isUnityApp$annotations", "isUnityApp", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class c1n {

    @NotNull
    public static final c1n INSTANCE = new c1n();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static volatile String customUserAgent;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m107627a() {
        return customUserAgent;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m107628b() {
        String str = customUserAgent;
        return str != null && C15493d.m94374J(str, "Unity.", false, 2, null);
    }
}
