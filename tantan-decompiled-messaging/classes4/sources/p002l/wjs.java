package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.tantan.live.eventbus.LiveEventBus;
import kotlin.Metadata;
import l.bwr;
import l.e30;
import l.ffw;
import l.osi0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll/wjs;", "Ll/x6s;", "Ll/ho2;", "Ll/cjs;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "", "isEquip", "V3", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "Y3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "skinDetailInfo", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m24678S3(wjs wjsVar, BLiveNewGiftSkin bLiveNewGiftSkin) {
        bLiveNewGiftSkin.getClass();
        wjsVar.m24684Y3(bLiveNewGiftSkin);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m24681W3(boolean z, wjs wjsVar, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            osi0.g("穿戴成功");
            BLiveNewGiftSkin bLiveNewGiftSkin = wjsVar.skinDetailInfo;
            if (bLiveNewGiftSkin != null) {
                bLiveNewGiftSkin.status = "equipped";
                ((cjs) ((bwr) wjsVar).viewModel).m11078U(bLiveNewGiftSkin);
            }
        } else {
            osi0.g("卸下成功");
            BLiveNewGiftSkin bLiveNewGiftSkin2 = wjsVar.skinDetailInfo;
            if (bLiveNewGiftSkin2 != null) {
                bLiveNewGiftSkin2.status = "unlocked";
                ((cjs) ((bwr) wjsVar).viewModel).m11078U(bLiveNewGiftSkin2);
            }
        }
        wjsVar.m25548F2().GiftDialogEventGroup.reloadGift().j(7014);
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m24682X3(Throwable th) {
        osi0.g(th.getMessage());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: V3 */
    public final void m24683V3(final boolean isEquip) {
        BLiveNewGiftSkin bLiveNewGiftSkin = this.skinDetailInfo;
        if (bLiveNewGiftSkin != null) {
            duringCreated(zfv.m27294p0(isEquip, bLiveNewGiftSkin.id, m25547E2().m17239o(), m25547E2().m17234j().liveMode, x350.m25673R2(m25547E2(), m25547E2().m14576j0()), w220.m24290a())).subscribe(ffw.e(new e30() { // from class: l.ujs
                public final void call(Object obj) {
                    wjs.m24681W3(isEquip, this, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.vjs
                public final void call(Object obj) {
                    wjs.m24682X3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m24684Y3(BLiveNewGiftSkin info) {
        this.skinDetailInfo = info;
        if (((bwr) this).viewModel == null) {
            Act act = this.f22037f;
            act.getClass();
            cjs cjsVar = new cjs(act, this);
            ((bwr) this).viewModel = cjsVar;
            cjsVar.mo5212i1(this);
        }
        ((cjs) ((bwr) this).viewModel).m5211E();
        ((cjs) ((bwr) this).viewModel).m11078U(info);
    }

    /* JADX INFO: renamed from: t */
    public void m24685t() {
        super.t();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        duringCreated((c) new LiveEventBus.LiveGiftSkinEventGroup(liveEventBusM25548F2).showGiftSkinDetail().g()).subscribe(ffw.h(new e30() { // from class: l.tjs
            public final void call(Object obj) {
                wjs.m24678S3(this.f20279a, (BLiveNewGiftSkin) obj);
            }
        }));
    }
}
