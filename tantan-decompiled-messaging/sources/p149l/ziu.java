package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus.C12500d;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/ziu;", "Ll/weu;", "Ll/jlu;", BaseSei.INFO, "<init>", "(Ll/jlu;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "Ll/zfv$a;", "message", "W2", "(Ll/zfv$a;)V", "X2", "a3", "Y2", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;", Item.TYPE, "Z2", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Ll/zfv$a;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ziu extends weu<ziu> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ziu(@NotNull jlu jluVar) {
        super(jluVar);
        jluVar.getClass();
    }

    /* JADX INFO: renamed from: S2 */
    public static void m219064S2(zfv.C21687a c21687a, Throwable th) {
        c21687a.f202984c.mo67168c();
    }

    /* JADX INFO: renamed from: T2 */
    public static void m219065T2(ziu ziuVar, zfv.C21687a c21687a, BLiveGiftItem bLiveGiftItem, BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.getClass();
        bLiveGiftItem.getClass();
        bLiveSendActivityGiftTrace.getClass();
        ziuVar.m219071Z2(bLiveGivenGiftBrief, c21687a, bLiveGiftItem, bLiveSendActivityGiftTrace);
    }

    /* JADX INFO: renamed from: U2 */
    public static void m219066U2(zfv.C21687a c21687a, Integer num) {
        c21687a.f202984c.mo67167b();
    }

    /* JADX INFO: renamed from: V2 */
    public static void m219067V2(ziu ziuVar, zfv.C21687a c21687a) {
        ziuVar.m219068W2(c21687a);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((ggv) ypv.m215673l(fld0.f98148c)).m126032r()).subscribe(ffw.m121197h(new e30() { // from class: l.viu
            @Override // p149l.e30
            public final void call(Object obj) {
                ziu.m219067V2(this.f181642a, (zfv.C21687a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m219068W2(zfv.C21687a message) {
        if (message == null) {
            return;
        }
        if (message.m218621d()) {
            m219070Y2(message);
        } else if (message.m218622e()) {
            m219072a3();
        } else if (message.m218620c()) {
            m219069X2();
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final void m219069X2() {
        zfv.m218577k1();
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m219070Y2(final zfv.C21687a message) {
        String str;
        try {
            final BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = BLiveSendActivityGiftTrace.JSON_ADAPTER.parse(message.f202983b);
            Pair pair = (Pair) m218416Q2(new ynj(0, bLiveSendActivityGiftTrace.userId));
            final BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(bLiveSendActivityGiftTrace.giftId);
            BLiveTraceServerData h5TraceServerData = BLiveTraceServerData.getH5TraceServerData(bLiveSendActivityGiftTrace.traceActivityName, bLiveSendActivityGiftTrace.traceModule);
            String str2 = bLiveSendActivityGiftTrace.giftId;
            e30 e30Var = new e30() { // from class: l.wiu
                @Override // p149l.e30
                public final void call(Object obj) {
                    ziu.m219065T2(this.f186570a, message, bLiveGiftItemM126027m, bLiveSendActivityGiftTrace, (BLiveGivenGiftBrief) obj);
                }
            };
            e30 e30Var2 = new e30() { // from class: l.xiu
                @Override // p149l.e30
                public final void call(Object obj) {
                    ziu.m219064S2(message, (Throwable) obj);
                }
            };
            e30 e30Var3 = new e30() { // from class: l.yiu
                @Override // p149l.e30
                public final void call(Object obj) {
                    ziu.m219066U2(message, (Integer) obj);
                }
            };
            int realGiftCount = bLiveSendActivityGiftTrace.getRealGiftCount();
            if (pair == null || (str = (String) pair.first) == null) {
                str = "live";
            }
            pge0 pge0VarM168694t = pge0.m168675d(str2, bLiveGiftItemM126027m, e30Var, e30Var2, e30Var3, false, realGiftCount, str, pair != null ? (mnj) pair.second : null, h5TraceServerData).m168690p(bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag).m168689o(bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag).m168695u(bLiveSendActivityGiftTrace.traceModule).m168694t(bLiveSendActivityGiftTrace.traceActivityName);
            pge0VarM168694t.f148638B = "videoChat";
            pge0VarM168694t.f148637A = "js";
            pge0VarM168694t.f148650N = bLiveSendActivityGiftTrace.fromTag;
            if (TextUtils.isEmpty(bLiveSendActivityGiftTrace.userId)) {
                pge0VarM168694t.f148666o = bLiveSendActivityGiftTrace.toUserId;
            } else {
                pge0VarM168694t.f148666o = bLiveSendActivityGiftTrace.userId;
            }
            m218411K2().SendGiftEventGroup.m69203a().mo172463j(new cfe0.C16123a().m106534y(pge0VarM168694t));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m219071Z2(BLiveGivenGiftBrief brief, zfv.C21687a message, BLiveGiftItem giftItem, BLiveSendActivityGiftTrace item) {
        message.m218618a(brief);
        axj.m99445s(giftItem, "", item.getRealGiftCount(), m218409H2().m203938o());
    }

    /* JADX INFO: renamed from: a3 */
    public final void m219072a3() {
        LiveVChatEventBus liveVChatEventBusM218411K2 = m218411K2();
        liveVChatEventBusM218411K2.getClass();
        liveVChatEventBusM218411K2.new C12500d().m69189a().m172467p();
        C12505a.m69245o(act(), false, null);
    }
}
