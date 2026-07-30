package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.LiveGiftSkinEventGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/xls;", "Ll/y8s;", "Ll/oo2;", "Ll/dls;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "isEquip", "V3", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "Y3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "skinDetailInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xls extends y8s<oo2, dls> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveNewGiftSkin skinDetailInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xls(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m211673S3(xls xlsVar, BLiveNewGiftSkin bLiveNewGiftSkin) {
        bLiveNewGiftSkin.getClass();
        xlsVar.m211679Y3(bLiveNewGiftSkin);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m211676W3(boolean z, xls xlsVar, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            r1j0.m179420g("穿戴成功");
            BLiveNewGiftSkin bLiveNewGiftSkin = xlsVar.skinDetailInfo;
            if (bLiveNewGiftSkin != null) {
                bLiveNewGiftSkin.status = "equipped";
                ((dls) xlsVar.viewModel).m116861U(bLiveNewGiftSkin);
            }
        } else {
            r1j0.m179420g("卸下成功");
            BLiveNewGiftSkin bLiveNewGiftSkin2 = xlsVar.skinDetailInfo;
            if (bLiveNewGiftSkin2 != null) {
                bLiveNewGiftSkin2.status = "unlocked";
                ((dls) xlsVar.viewModel).m116861U(bLiveNewGiftSkin2);
            }
        }
        xlsVar.m213811F2().GiftDialogEventGroup.reloadGift().mo199273j(7014);
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m211677X3(Throwable th) {
        r1j0.m179420g(th.getMessage());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: V3 */
    public final void m211678V3(final boolean isEquip) {
        BLiveNewGiftSkin bLiveNewGiftSkin = this.skinDetailInfo;
        if (bLiveNewGiftSkin != null) {
            duringCreated(aiv.m98125p0(isEquip, bLiveNewGiftSkin.f45257id, m213810E2().m202194o(), m213810E2().mo183435j().liveMode, mc50.m157912R2(m213810E2(), m213810E2().m168526j0()), eb20.m120148a())).subscribe(dhw.m115826e(new y20() { // from class: l.vls
                @Override // p153l.y20
                public final void call(Object obj) {
                    xls.m211676W3(isEquip, this, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.wls
                @Override // p153l.y20
                public final void call(Object obj) {
                    xls.m211677X3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m211679Y3(BLiveNewGiftSkin info) {
        this.skinDetailInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            dls dlsVar = new dls(act, this);
            this.viewModel = dlsVar;
            dlsVar.mo22064i1(this);
        }
        ((dls) this.viewModel).m73017E();
        ((dls) this.viewModel).m116861U(info);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        duringCreated(liveEventBusM213811F2.new LiveGiftSkinEventGroup().showGiftSkinDetail().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.uls
            @Override // p153l.y20
            public final void call(Object obj) {
                xls.m211673S3(this.f179554a, (BLiveNewGiftSkin) obj);
            }
        }));
    }
}
