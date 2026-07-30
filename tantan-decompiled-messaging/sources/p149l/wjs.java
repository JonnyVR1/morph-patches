package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.LiveGiftSkinEventGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/wjs;", "Ll/x6s;", "Ll/ho2;", "Ll/cjs;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "isEquip", "V3", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "Y3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "skinDetailInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wjs extends x6s<ho2, cjs> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveNewGiftSkin skinDetailInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjs(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m203489S3(wjs wjsVar, BLiveNewGiftSkin bLiveNewGiftSkin) {
        bLiveNewGiftSkin.getClass();
        wjsVar.m203495Y3(bLiveNewGiftSkin);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m203492W3(boolean z, wjs wjsVar, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            osi0.m165783g("穿戴成功");
            BLiveNewGiftSkin bLiveNewGiftSkin = wjsVar.skinDetailInfo;
            if (bLiveNewGiftSkin != null) {
                bLiveNewGiftSkin.status = "equipped";
                ((cjs) wjsVar.viewModel).m107255U(bLiveNewGiftSkin);
            }
        } else {
            osi0.m165783g("卸下成功");
            BLiveNewGiftSkin bLiveNewGiftSkin2 = wjsVar.skinDetailInfo;
            if (bLiveNewGiftSkin2 != null) {
                bLiveNewGiftSkin2.status = "unlocked";
                ((cjs) wjsVar.viewModel).m107255U(bLiveNewGiftSkin2);
            }
        }
        wjsVar.m206028F2().GiftDialogEventGroup.reloadGift().mo172463j(7014);
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m203493X3(Throwable th) {
        osi0.m165783g(th.getMessage());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: V3 */
    public final void m203494V3(final boolean isEquip) {
        BLiveNewGiftSkin bLiveNewGiftSkin = this.skinDetailInfo;
        if (bLiveNewGiftSkin != null) {
            duringCreated(zfv.m218591p0(isEquip, bLiveNewGiftSkin.f44409id, m206027E2().m149818o(), m206027E2().mo149813j().liveMode, x350.m206896R2(m206027E2(), m206027E2().m132140j0()), w220.m201014a())).subscribe(ffw.m121194e(new e30() { // from class: l.ujs
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjs.m203492W3(isEquip, this, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.vjs
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjs.m203493X3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m203495Y3(BLiveNewGiftSkin info) {
        this.skinDetailInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            cjs cjsVar = new cjs(act, this);
            this.viewModel = cjsVar;
            cjsVar.mo21065i1(this);
        }
        ((cjs) this.viewModel).m71834E();
        ((cjs) this.viewModel).m107255U(info);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        duringCreated(liveEventBusM206028F2.new LiveGiftSkinEventGroup().showGiftSkinDetail().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.tjs
            @Override // p149l.e30
            public final void call(Object obj) {
                wjs.m203489S3(this.f170797a, (BLiveNewGiftSkin) obj);
            }
        }));
    }
}
