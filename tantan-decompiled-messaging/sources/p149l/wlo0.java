package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR8\u0010\u000f\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u0005 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/wlo0;", "", "<init>", "()V", "Lrx/c;", "", "a", "()Lrx/c;", "hidden", "", "b", "(Z)V", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "mVoiceSquareHiddenChangeBs", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wlo0 {

    @NotNull
    public static final wlo0 INSTANCE = new wlo0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final C22392a<Boolean> mVoiceSquareHiddenChangeBs = C22392a.m221513c(Boolean.TRUE);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C22306c<Boolean> m203843a() {
        C22392a<Boolean> c22392a = mVoiceSquareHiddenChangeBs;
        c22392a.getClass();
        return c22392a;
    }

    /* JADX INFO: renamed from: b */
    public final void m203844b(boolean hidden) {
        mVoiceSquareHiddenChangeBs.onNext(Boolean.valueOf(hidden));
    }
}
