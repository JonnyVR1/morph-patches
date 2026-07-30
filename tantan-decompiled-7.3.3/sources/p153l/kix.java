package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/kix;", "", "<init>", "()V", "", "c", "()Z", "", "fallbackCount", Constants.INAPP_DATA_TAG, "(J)J", "", "Lcom/p1/mobile/putong/core/data/LikeUser;", "likeUsers", "", "b", "(Ljava/util/List;)I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kix {

    @NotNull
    public static final kix INSTANCE = new kix();

    /* JADX INFO: renamed from: a */
    public static void m149984a(long j, long j2, Ref.IntRef intRef, LikeUser likeUser) {
        if (j2 - C15274a.m88487c((j - likeUser.createTime) / 1000, 0L) > 0) {
            intRef.element++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m149985b(@Nullable List<? extends LikeUser> likeUsers) {
        List<? extends LikeUser> list = likeUsers;
        if (jyb.m147479J(list)) {
            return 0;
        }
        final long j = !joa.m146386f4() ? 259200L : 86400L;
        final Ref.IntRef intRef = new Ref.IntRef();
        final long jM174454o = pzi0.m174454o();
        jyb.m147537z(list, new y20() { // from class: l.jix
            @Override // p153l.y20
            public final void call(Object obj) {
                kix.m149984a(jM174454o, j, intRef, (LikeUser) obj);
            }
        });
        return intRef.element;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m149986c() {
        if (CoreModule.f18264c.f20414p0.m219062g3()) {
            return !joa.m146392i4();
        }
        return !joa.m146386f4();
    }

    /* JADX INFO: renamed from: d */
    public final long m149987d(long fallbackCount) {
        Integer numM109150F3 = CoreModule.f18264c.f20304E1.m109150F3();
        return (!NullChecker.m82486a(numM109150F3) || numM109150F3.intValue() < 0) ? fallbackCount : numM109150F3.intValue();
    }
}
