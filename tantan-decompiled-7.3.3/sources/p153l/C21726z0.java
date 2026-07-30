package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.z0 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/z0;", "", "<init>", "()V", "", "tag", "msg", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)V", "a", "b", "", "tr", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "Z", "isDebug", "()Z", "e", "(Z)V", "Ll/kol;", "Ll/kol;", "getLog", "()Ll/kol;", "f", "(Ll/kol;)V", "log", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C21726z0 {

    @NotNull
    public static final C21726z0 INSTANCE = new C21726z0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isDebug;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static kol log;

    /* JADX INFO: renamed from: a */
    public final void m218092a(@NotNull String tag, @NotNull String msg) {
        kol kolVar;
        tag.getClass();
        msg.getClass();
        if (!isDebug || (kolVar = log) == null) {
            return;
        }
        kolVar.mo75438d(tag, msg);
    }

    /* JADX INFO: renamed from: b */
    public final void m218093b(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        kol kolVar = log;
        if (kolVar != null) {
            kolVar.mo75439e(tag, msg);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m218094c(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr) {
        tag.getClass();
        msg.getClass();
        tr.getClass();
        kol kolVar = log;
        if (kolVar != null) {
            kolVar.mo75437a(tag, msg, tr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m218095d(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        kol kolVar = log;
        if (kolVar != null) {
            kolVar.mo75440i(tag, msg);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m218096e(boolean z) {
        isDebug = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m218097f(@Nullable kol kolVar) {
        log = kolVar;
    }
}
