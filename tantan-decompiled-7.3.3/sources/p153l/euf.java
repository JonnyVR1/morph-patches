package p153l;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/euf;", "", "<init>", "()V", "", "b", "a", "Ll/duf;", "Ll/duf;", "mFDTWebSocketClient", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/disposables/Disposable;", "mHeartbeatDisposable", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class euf {
    public static final euf INSTANCE = new euf();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static duf mFDTWebSocketClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static Disposable mHeartbeatDisposable;

    private euf() {
    }

    /* JADX INFO: renamed from: b */
    private final void m122561b() {
        Disposable disposable = mHeartbeatDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m122562a() {
        m122561b();
    }
}
