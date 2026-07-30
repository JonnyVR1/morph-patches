package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus.C12663d;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/alu;", "Ll/xgu;", "Ll/knu;", BaseSei.INFO, "<init>", "(Ll/knu;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "Ll/aiv$a;", "message", "W2", "(Ll/aiv$a;)V", "X2", "a3", "Y2", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;", Item.TYPE, "Z2", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Ll/aiv$a;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class alu extends xgu<alu> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alu(@NotNull knu knuVar) {
        super(knuVar);
        knuVar.getClass();
    }

    /* JADX INFO: renamed from: S2 */
    public static void m98723S2(aiv.C15716a c15716a, Throwable th) {
        c15716a.f71580c.mo68351c();
    }

    /* JADX INFO: renamed from: T2 */
    public static void m98724T2(alu aluVar, aiv.C15716a c15716a, BLiveGiftItem bLiveGiftItem, BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.getClass();
        bLiveGiftItem.getClass();
        bLiveSendActivityGiftTrace.getClass();
        aluVar.m98730Z2(bLiveGivenGiftBrief, c15716a, bLiveGiftItem, bLiveSendActivityGiftTrace);
    }

    /* JADX INFO: renamed from: U2 */
    public static void m98725U2(aiv.C15716a c15716a, Integer num) {
        c15716a.f71580c.mo68350b();
    }

    /* JADX INFO: renamed from: V2 */
    public static void m98726V2(alu aluVar, aiv.C15716a c15716a) {
        aluVar.m98727W2(c15716a);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((hiv) zrv.m221194l(htd0.f111521c)).m135166r()).subscribe(dhw.m115829h(new y20() { // from class: l.wku
            @Override // p153l.y20
            public final void call(Object obj) {
                alu.m98726V2(this.f189592a, (aiv.C15716a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m98727W2(aiv.C15716a message) {
        if (message == null) {
            return;
        }
        if (message.m98155d()) {
            m98729Y2(message);
        } else if (message.m98156e()) {
            m98731a3();
        } else if (message.m98154c()) {
            m98728X2();
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final void m98728X2() {
        aiv.m98111k1();
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m98729Y2(final aiv.C15716a message) {
        String str;
        try {
            final BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = BLiveSendActivityGiftTrace.JSON_ADAPTER.parse(message.f71579b);
            Pair pair = (Pair) m97933Q2(new oqj(0, bLiveSendActivityGiftTrace.userId));
            final BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(bLiveSendActivityGiftTrace.giftId);
            BLiveTraceServerData h5TraceServerData = BLiveTraceServerData.getH5TraceServerData(bLiveSendActivityGiftTrace.traceActivityName, bLiveSendActivityGiftTrace.traceModule);
            String str2 = bLiveSendActivityGiftTrace.giftId;
            y20 y20Var = new y20() { // from class: l.xku
                @Override // p153l.y20
                public final void call(Object obj) {
                    alu.m98724T2(this.f194817a, message, bLiveGiftItemM135161m, bLiveSendActivityGiftTrace, (BLiveGivenGiftBrief) obj);
                }
            };
            y20 y20Var2 = new y20() { // from class: l.yku
                @Override // p153l.y20
                public final void call(Object obj) {
                    alu.m98723S2(message, (Throwable) obj);
                }
            };
            y20 y20Var3 = new y20() { // from class: l.zku
                @Override // p153l.y20
                public final void call(Object obj) {
                    alu.m98725U2(message, (Integer) obj);
                }
            };
            int realGiftCount = bLiveSendActivityGiftTrace.getRealGiftCount();
            if (pair == null || (str = (String) pair.first) == null) {
                str = "live";
            }
            uoe0 uoe0VarM196993t = uoe0.m196974d(str2, bLiveGiftItemM135161m, y20Var, y20Var2, y20Var3, false, realGiftCount, str, pair != null ? (cqj) pair.second : null, h5TraceServerData).m196989p(bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag).m196988o(bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag).m196994u(bLiveSendActivityGiftTrace.traceModule).m196993t(bLiveSendActivityGiftTrace.traceActivityName);
            uoe0VarM196993t.f180039B = "videoChat";
            uoe0VarM196993t.f180038A = "js";
            uoe0VarM196993t.f180051N = bLiveSendActivityGiftTrace.fromTag;
            if (TextUtils.isEmpty(bLiveSendActivityGiftTrace.userId)) {
                uoe0VarM196993t.f180067o = bLiveSendActivityGiftTrace.toUserId;
            } else {
                uoe0VarM196993t.f180067o = bLiveSendActivityGiftTrace.userId;
            }
            m97928K2().SendGiftEventGroup.m70386a().mo199273j(new hne0.C17513a().m136088y(uoe0VarM196993t));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m98730Z2(BLiveGivenGiftBrief brief, aiv.C15716a message, BLiveGiftItem giftItem, BLiveSendActivityGiftTrace item) {
        message.m98152a(brief);
        qzj.m178802s(giftItem, "", item.getRealGiftCount(), m97926H2().m212345o());
    }

    /* JADX INFO: renamed from: a3 */
    public final void m98731a3() {
        LiveVChatEventBus liveVChatEventBusM97928K2 = m97928K2();
        liveVChatEventBusM97928K2.getClass();
        liveVChatEventBusM97928K2.new C12663d().m70372a().m199277p();
        C12668a.m70428o(act(), false, null);
    }
}
