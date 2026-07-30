package p002l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.ynj;
import l.ypv;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Ll/eoj;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "Ll/zfv$a;", "message", "", "N3", "(Ll/zfv$a;)V", "P3", "()V", "T3", "R3", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;", "item", "S3", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Ll/zfv$a;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;)V", "T", "O3", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class eoj extends pat<ho2> {
    public eoj(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m12629J3(zfv.C0940a c0940a, Integer num) {
        c0940a.f23386c.mo5856b();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m12630K3(eoj eojVar, zfv.C0940a c0940a, BLiveGiftItem bLiveGiftItem, BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.getClass();
        bLiveGiftItem.getClass();
        bLiveSendActivityGiftTrace.getClass();
        eojVar.m12636S3(bLiveGivenGiftBrief, c0940a, bLiveGiftItem, bLiveSendActivityGiftTrace);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m12631L3(zfv.C0940a c0940a, Throwable th) {
        c0940a.f23386c.mo5857c();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m12632M3(eoj eojVar, zfv.C0940a c0940a) {
        eojVar.m12633N3(c0940a);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m12633N3(zfv.C0940a message) {
        if (message == null) {
            return;
        }
        if (message.m27324d()) {
            m12635R3(message);
            return;
        }
        if (message.m27325e()) {
            m12637T3();
        } else if (message.m27322b()) {
            m12638O3();
        } else if (message.m27323c()) {
            m12634P3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    private final void m12634P3() {
        zfv.m27280k1();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    private final void m12635R3(final zfv.C0940a message) {
        String str;
        try {
            final BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = (BLiveSendActivityGiftTrace) BLiveSendActivityGiftTrace.JSON_ADAPTER.parse(message.f23385b);
            Pair pair = (Pair) m14184F3(new ynj(0, bLiveSendActivityGiftTrace.userId));
            final BLiveGiftItem bLiveGiftItemM = ((ggv) ypv.l(fld0.c)).m(bLiveSendActivityGiftTrace.giftId);
            BLiveTraceServerData h5TraceServerData = BLiveTraceServerData.getH5TraceServerData(bLiveSendActivityGiftTrace.traceActivityName, bLiveSendActivityGiftTrace.traceModule);
            String str2 = bLiveSendActivityGiftTrace.giftId;
            e30 e30Var = new e30() { // from class: l.boj
                public final void call(Object obj) {
                    eoj.m12630K3(this.f8294a, message, bLiveGiftItemM, bLiveSendActivityGiftTrace, (BLiveGivenGiftBrief) obj);
                }
            };
            e30 e30Var2 = new e30() { // from class: l.coj
                public final void call(Object obj) {
                    eoj.m12631L3(message, (Throwable) obj);
                }
            };
            e30 e30Var3 = new e30() { // from class: l.doj
                public final void call(Object obj) {
                    eoj.m12629J3(message, (Integer) obj);
                }
            };
            int realGiftCount = bLiveSendActivityGiftTrace.getRealGiftCount();
            if (pair == null || (str = (String) pair.first) == null) {
                str = "live";
            }
            pge0 pge0VarM20259t = pge0.m20240d(str2, null, e30Var, e30Var2, e30Var3, false, realGiftCount, str, pair != null ? (mnj) pair.second : null, h5TraceServerData).m20255p(bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag).m20254o(bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag).m20260u(bLiveSendActivityGiftTrace.traceModule).m20259t(bLiveSendActivityGiftTrace.traceActivityName);
            pge0VarM20259t.f17262B = m25547E2().mo14489A0();
            pge0VarM20259t.f17261A = "js";
            pge0VarM20259t.f17274N = bLiveSendActivityGiftTrace.fromTag;
            if (TextUtils.isEmpty(bLiveSendActivityGiftTrace.userId)) {
                pge0VarM20259t.f17290o = bLiveSendActivityGiftTrace.toUserId;
            } else {
                pge0VarM20259t.f17290o = bLiveSendActivityGiftTrace.userId;
            }
            m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10987y(pge0VarM20259t));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private final void m12636S3(BLiveGivenGiftBrief brief, zfv.C0940a message, BLiveGiftItem giftItem, BLiveSendActivityGiftTrace item) {
        message.m27321a(brief);
        if (giftItem.isPacketGift()) {
            m25548F2().GiftDialogEventGroup.reloadGift().j(900);
        }
        axj.m10105s(giftItem, mo21430R2(), item.getRealGiftCount(), mo9759j3());
    }

    /* JADX INFO: renamed from: T3 */
    private final void m12637T3() {
        m25548F2().GiftDialogEventGroup.openGoWallet().j(new ip50().m15280d(false).m15281e(null).m15282f("liveGiftH5Click"));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m12638O3() {
        m25548F2().GiftDialogEventGroup.closeH5Skin().p();
    }

    /* JADX INFO: renamed from: T */
    public void m12639T() {
        super.T();
        duringCreated(((ggv) ypv.l(fld0.c)).r()).subscribe(ffw.h(new e30() { // from class: l.aoj
            public final void call(Object obj) {
                eoj.m12632M3(this.f7818a, (zfv.C0940a) obj);
            }
        }));
    }
}
