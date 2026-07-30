package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, m88121d2 = {"Ll/uqj;", "Ll/qct;", "Ll/oo2;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Ll/aiv$a;", "message", "", "N3", "(Ll/aiv$a;)V", "P3", "()V", "T3", "R3", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;", Item.TYPE, "S3", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Ll/aiv$a;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;)V", p7f.GPS_DIRECTION_TRUE, "O3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class uqj extends qct<oo2> {
    public uqj(@Nullable dum<?> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m197362J3(aiv.C15716a c15716a, Integer num) {
        c15716a.f71580c.mo68350b();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m197363K3(uqj uqjVar, aiv.C15716a c15716a, BLiveGiftItem bLiveGiftItem, BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.getClass();
        bLiveGiftItem.getClass();
        bLiveSendActivityGiftTrace.getClass();
        uqjVar.m197369S3(bLiveGivenGiftBrief, c15716a, bLiveGiftItem, bLiveSendActivityGiftTrace);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m197364L3(aiv.C15716a c15716a, Throwable th) {
        c15716a.f71580c.mo68351c();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m197365M3(uqj uqjVar, aiv.C15716a c15716a) {
        uqjVar.m197366N3(c15716a);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m197366N3(aiv.C15716a message) {
        if (message == null) {
            return;
        }
        if (message.m98155d()) {
            m197368R3(message);
            return;
        }
        if (message.m98156e()) {
            m197370T3();
        } else if (message.m98153b()) {
            m197371O3();
        } else if (message.m98154c()) {
            m197367P3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    private final void m197367P3() {
        aiv.m98111k1();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    private final void m197368R3(final aiv.C15716a message) {
        String str;
        try {
            final BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = BLiveSendActivityGiftTrace.JSON_ADAPTER.parse(message.f71579b);
            Pair pair = (Pair) m138856F3(new oqj(0, bLiveSendActivityGiftTrace.userId));
            final BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(bLiveSendActivityGiftTrace.giftId);
            BLiveTraceServerData h5TraceServerData = BLiveTraceServerData.getH5TraceServerData(bLiveSendActivityGiftTrace.traceActivityName, bLiveSendActivityGiftTrace.traceModule);
            String str2 = bLiveSendActivityGiftTrace.giftId;
            y20 y20Var = new y20() { // from class: l.rqj
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqj.m197363K3(this.f164495a, message, bLiveGiftItemM135161m, bLiveSendActivityGiftTrace, (BLiveGivenGiftBrief) obj);
                }
            };
            y20 y20Var2 = new y20() { // from class: l.sqj
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqj.m197364L3(message, (Throwable) obj);
                }
            };
            y20 y20Var3 = new y20() { // from class: l.tqj
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqj.m197362J3(message, (Integer) obj);
                }
            };
            int realGiftCount = bLiveSendActivityGiftTrace.getRealGiftCount();
            if (pair == null || (str = (String) pair.first) == null) {
                str = "live";
            }
            uoe0 uoe0VarM196993t = uoe0.m196974d(str2, null, y20Var, y20Var2, y20Var3, false, realGiftCount, str, pair != null ? (cqj) pair.second : null, h5TraceServerData).m196989p(bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag).m196988o(bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag).m196994u(bLiveSendActivityGiftTrace.traceModule).m196993t(bLiveSendActivityGiftTrace.traceActivityName);
            uoe0VarM196993t.f180039B = m213810E2().mo118362A0();
            uoe0VarM196993t.f180038A = "js";
            uoe0VarM196993t.f180051N = bLiveSendActivityGiftTrace.fromTag;
            if (TextUtils.isEmpty(bLiveSendActivityGiftTrace.userId)) {
                uoe0VarM196993t.f180067o = bLiveSendActivityGiftTrace.toUserId;
            } else {
                uoe0VarM196993t.f180067o = bLiveSendActivityGiftTrace.userId;
            }
            m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136088y(uoe0VarM196993t));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private final void m197369S3(BLiveGivenGiftBrief brief, aiv.C15716a message, BLiveGiftItem giftItem, BLiveSendActivityGiftTrace item) {
        message.m98152a(brief);
        if (giftItem.isPacketGift()) {
            m213811F2().GiftDialogEventGroup.reloadGift().mo199273j(900);
        }
        qzj.m178802s(giftItem, mo78457R2(), item.getRealGiftCount(), mo104749j3());
    }

    /* JADX INFO: renamed from: T3 */
    private final void m197370T3() {
        m213811F2().GiftDialogEventGroup.openGoWallet().mo199273j(new ox50().m169679d(false).m169680e(null).m169681f("liveGiftH5Click"));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m197371O3() {
        m213811F2().GiftDialogEventGroup.closeH5Skin().m199277p();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((hiv) zrv.m221194l(htd0.f111521c)).m135166r()).subscribe(dhw.m115829h(new y20() { // from class: l.qqj
            @Override // p153l.y20
            public final void call(Object obj) {
                uqj.m197365M3(this.f159013a, (aiv.C15716a) obj);
            }
        }));
    }
}
