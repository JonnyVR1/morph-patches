package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, m87232d2 = {"Ll/eoj;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "Ll/zfv$a;", "message", "", "N3", "(Ll/zfv$a;)V", "P3", "()V", "T3", "R3", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;", Item.TYPE, "S3", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Ll/zfv$a;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/base/data/BLiveSendActivityGiftTrace;)V", j6f.GPS_DIRECTION_TRUE, "O3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class eoj extends pat<ho2> {
    public eoj(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m117341J3(zfv.C21687a c21687a, Integer num) {
        c21687a.f202984c.mo67167b();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m117342K3(eoj eojVar, zfv.C21687a c21687a, BLiveGiftItem bLiveGiftItem, BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bLiveGivenGiftBrief.getClass();
        bLiveGiftItem.getClass();
        bLiveSendActivityGiftTrace.getClass();
        eojVar.m117348S3(bLiveGivenGiftBrief, c21687a, bLiveGiftItem, bLiveSendActivityGiftTrace);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m117343L3(zfv.C21687a c21687a, Throwable th) {
        c21687a.f202984c.mo67168c();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m117344M3(eoj eojVar, zfv.C21687a c21687a) {
        eojVar.m117345N3(c21687a);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m117345N3(zfv.C21687a message) {
        if (message == null) {
            return;
        }
        if (message.m218621d()) {
            m117347R3(message);
            return;
        }
        if (message.m218622e()) {
            m117349T3();
        } else if (message.m218619b()) {
            m117350O3();
        } else if (message.m218620c()) {
            m117346P3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    private final void m117346P3() {
        zfv.m218577k1();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    private final void m117347R3(final zfv.C21687a message) {
        String str;
        try {
            final BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = BLiveSendActivityGiftTrace.JSON_ADAPTER.parse(message.f202983b);
            Pair pair = (Pair) m129297F3(new ynj(0, bLiveSendActivityGiftTrace.userId));
            final BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(bLiveSendActivityGiftTrace.giftId);
            BLiveTraceServerData h5TraceServerData = BLiveTraceServerData.getH5TraceServerData(bLiveSendActivityGiftTrace.traceActivityName, bLiveSendActivityGiftTrace.traceModule);
            String str2 = bLiveSendActivityGiftTrace.giftId;
            e30 e30Var = new e30() { // from class: l.boj
                @Override // p149l.e30
                public final void call(Object obj) {
                    eoj.m117342K3(this.f76525a, message, bLiveGiftItemM126027m, bLiveSendActivityGiftTrace, (BLiveGivenGiftBrief) obj);
                }
            };
            e30 e30Var2 = new e30() { // from class: l.coj
                @Override // p149l.e30
                public final void call(Object obj) {
                    eoj.m117343L3(message, (Throwable) obj);
                }
            };
            e30 e30Var3 = new e30() { // from class: l.doj
                @Override // p149l.e30
                public final void call(Object obj) {
                    eoj.m117341J3(message, (Integer) obj);
                }
            };
            int realGiftCount = bLiveSendActivityGiftTrace.getRealGiftCount();
            if (pair == null || (str = (String) pair.first) == null) {
                str = "live";
            }
            pge0 pge0VarM168694t = pge0.m168675d(str2, null, e30Var, e30Var2, e30Var3, false, realGiftCount, str, pair != null ? (mnj) pair.second : null, h5TraceServerData).m168690p(bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag).m168689o(bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag).m168695u(bLiveSendActivityGiftTrace.traceModule).m168694t(bLiveSendActivityGiftTrace.traceActivityName);
            pge0VarM168694t.f148638B = m206027E2().mo132054A0();
            pge0VarM168694t.f148637A = "js";
            pge0VarM168694t.f148650N = bLiveSendActivityGiftTrace.fromTag;
            if (TextUtils.isEmpty(bLiveSendActivityGiftTrace.userId)) {
                pge0VarM168694t.f148666o = bLiveSendActivityGiftTrace.toUserId;
            } else {
                pge0VarM168694t.f148666o = bLiveSendActivityGiftTrace.userId;
            }
            m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106534y(pge0VarM168694t));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private final void m117348S3(BLiveGivenGiftBrief brief, zfv.C21687a message, BLiveGiftItem giftItem, BLiveSendActivityGiftTrace item) {
        message.m218618a(brief);
        if (giftItem.isPacketGift()) {
            m206028F2().GiftDialogEventGroup.reloadGift().mo172463j(900);
        }
        axj.m99445s(giftItem, mo77274R2(), item.getRealGiftCount(), mo96662j3());
    }

    /* JADX INFO: renamed from: T3 */
    private final void m117349T3() {
        m206028F2().GiftDialogEventGroup.openGoWallet().mo172463j(new ip50().m137454d(false).m137455e(null).m137456f("liveGiftH5Click"));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m117350O3() {
        m206028F2().GiftDialogEventGroup.closeH5Skin().m172467p();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((ggv) ypv.m215673l(fld0.f98148c)).m126032r()).subscribe(ffw.m121197h(new e30() { // from class: l.aoj
            @Override // p149l.e30
            public final void call(Object obj) {
                eoj.m117344M3(this.f70872a, (zfv.C21687a) obj);
            }
        }));
    }
}
