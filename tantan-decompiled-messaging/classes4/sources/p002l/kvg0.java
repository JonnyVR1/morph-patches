package p002l;

import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.cll;
import l.upv;
import l.w9j;
import l.ytr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "anchorId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;", "c", "(Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class kvg0 {
    /* JADX INFO: renamed from: a */
    public static BLiveSuperGodDetail m16832a(Function1 function1, Object obj) {
        return (BLiveSuperGodDetail) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static BLiveSuperGodDetail m16833b(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.superUserBirthdayDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final c<BLiveSuperGodDetail> m16834c(@NotNull String str) {
        str.getClass();
        cll cllVarD = cll.l(ytr.b("/live-campaigns/superRichUserBirthday/anchors/" + str + "/details/superRichUserBirthdayTask")).p().d();
        StringBuilder sb = new StringBuilder("getSuperGodPageDetails");
        sb.append(str);
        c cVarW = upv.w(cllVarD, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.ivg0
            public final Object invoke(Object obj) {
                return kvg0.m16833b((BLiveEnvelope) obj);
            }
        };
        return cVarW.map(new w9j() { // from class: l.jvg0
            public final Object call(Object obj) {
                return kvg0.m16832a(function1, obj);
            }
        });
    }
}
