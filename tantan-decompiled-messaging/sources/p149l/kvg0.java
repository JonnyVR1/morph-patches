package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"", "anchorId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;", "c", "(Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kvg0 {
    /* JADX INFO: renamed from: a */
    public static BLiveSuperGodDetail m147371a(Function1 function1, Object obj) {
        return (BLiveSuperGodDetail) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static BLiveSuperGodDetail m147372b(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.superUserBirthdayDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final C22306c<BLiveSuperGodDetail> m147373c(@NotNull String str) {
        str.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live-campaigns/superRichUserBirthday/anchors/" + str + "/details/superRichUserBirthdayTask")).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("getSuperGodPageDetails");
        sb.append(str);
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cllVarM107537d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.ivg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kvg0.m147372b((BLiveEnvelope) obj);
            }
        };
        return c22306cM194935w.map(new w9j() { // from class: l.jvg0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return kvg0.m147371a(function1, obj);
            }
        });
    }
}
