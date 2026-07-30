package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m88121d2 = {"", "propertyName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class cqh0 {

    /* JADX INFO: renamed from: a */
    public static final int f83088a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static final int m111902a() {
        return f83088a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m111903b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
