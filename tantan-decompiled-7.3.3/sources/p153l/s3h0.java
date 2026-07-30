package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"", "anchorId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;", "c", "(Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s3h0 {
    /* JADX INFO: renamed from: a */
    public static BLiveSuperGodDetail m184276a(Function1 function1, Object obj) {
        return (BLiveSuperGodDetail) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static BLiveSuperGodDetail m184277b(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.superUserBirthdayDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final C22421c<BLiveSuperGodDetail> m184278c(@NotNull String str) {
        str.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live-campaigns/superRichUserBirthday/anchors/" + str + "/details/superRichUserBirthdayTask")).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("getSuperGodPageDetails");
        sb.append(str);
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnlVarM182301d, sb.toString());
        final Function1 function1 = new Function1() { // from class: l.q3h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s3h0.m184277b((BLiveEnvelope) obj);
            }
        };
        return c22421cM202562w.map(new qcj() { // from class: l.r3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s3h0.m184276a(function1, obj);
            }
        });
    }
}
