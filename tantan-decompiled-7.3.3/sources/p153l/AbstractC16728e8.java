package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.e8 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00060\u0007j\u0002`\b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/e8;", "", "<init>", "()V", "", "a", "()J", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "h", "(Ljava/lang/Runnable;)Ljava/lang/Runnable;", "", Constants.INAPP_DATA_TAG, "e", "c", "g", "blocker", "nanos", "b", "(Ljava/lang/Object;J)V", "Ljava/lang/Thread;", "thread", "f", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class AbstractC16728e8 {
    /* JADX INFO: renamed from: a */
    public abstract long m119781a();

    /* JADX INFO: renamed from: b */
    public abstract void m119782b(@NotNull Object blocker, long nanos);

    /* JADX INFO: renamed from: c */
    public abstract void m119783c();

    /* JADX INFO: renamed from: d */
    public abstract void m119784d();

    /* JADX INFO: renamed from: e */
    public abstract void m119785e();

    /* JADX INFO: renamed from: f */
    public abstract void m119786f(@NotNull Thread thread);

    /* JADX INFO: renamed from: g */
    public abstract void m119787g();

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract Runnable m119788h(@NotNull Runnable block);
}
