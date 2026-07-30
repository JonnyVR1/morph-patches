package p153l;

import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/n0m0;", "", "<init>", "()V", "", "giftId", "Lrx/c;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftDetail;", "c", "(Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class n0m0 {

    @NotNull
    public static final n0m0 INSTANCE = new n0m0();

    /* JADX INFO: renamed from: a */
    public static List m161011a(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.giftDetails;
    }

    /* JADX INFO: renamed from: b */
    public static List m161012b(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C22421c<List<BLiveGiftDetail>> m161013c(@NotNull String giftId) {
        giftId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221805e("/voice-gift/" + giftId), new st0[0]).m182288p().m182301d(), "requestCpGiftDetail" + giftId);
        final Function1 function1 = new Function1() { // from class: l.l0m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n0m0.m161011a((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.m0m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return n0m0.m161012b(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
