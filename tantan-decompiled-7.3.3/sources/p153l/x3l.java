package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.view.HideLiveAnchorLevelView;

/* JADX INFO: loaded from: classes9.dex */
public class x3l extends yw80<HideLiveAnchorLevelView> {
    public x3l(kv80 kv80Var) {
        super(5, kv80Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m209250T(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43335) {
            o1j0.m165651y(tbs.f172988a.getString(R$string.f45735Y));
        } else {
            o1j0.m165651y(tbs.f172988a.getString(R$string.f45760l0));
        }
    }

    /* JADX INFO: renamed from: R */
    public String m209251R(Context context) {
        return context.getString(R$string.f45732V);
    }

    /* JADX INFO: renamed from: S */
    public String m209252S(Context context) {
        return context.getString(R$string.f45733W);
    }

    /* JADX INFO: renamed from: U */
    public final void m209253U(HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        hideLiveAnchorLevelView.setCheckBoxIsOpen(!hideLiveAnchorLevelView.getCheckBoxIsOpen());
        o1j0.m165651y(tbs.f172988a.getString(R$string.f45734X));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m209254V(HideLiveAnchorLevelView hideLiveAnchorLevelView, vxj0 vxj0Var) {
        m209253U(hideLiveAnchorLevelView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo71749u(HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        super.mo71749u(hideLiveAnchorLevelView);
        hideLiveAnchorLevelView.m71980k0(this);
        m217585H().mo151655b(this, hideLiveAnchorLevelView);
    }

    @Override // p153l.yw80
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo179626J(vx80 vx80Var, final HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        vx80Var.duringCreated(LivePrivacyApiProvider.getHideConsumeRecordEnable(mbs.m157870o0())).subscribe(dhw.m115826e(new y20() { // from class: l.t3l
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = (BLiveHiddenConsumeRecordButton) obj;
                hideLiveAnchorLevelView.setCheckBoxIsOpen(bLiveHiddenConsumeRecordButton != null && bLiveHiddenConsumeRecordButton.hiddenAnchorHierarchyOn);
            }
        }, new y20() { // from class: l.u3l
            @Override // p153l.y20
            public final void call(Object obj) {
                hideLiveAnchorLevelView.setCheckBoxIsOpen(false);
            }
        }));
    }

    @Override // p153l.yw80
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo179627L(vx80 vx80Var, final HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        vx80Var.duringCreated(LivePrivacyApiProvider.setHideLiveAnchorLevelEnable(mbs.m157870o0(), hideLiveAnchorLevelView.getCheckBoxIsOpen())).subscribe(dhw.m115826e(new y20() { // from class: l.v3l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182217a.m209254V(hideLiveAnchorLevelView, (vxj0) obj);
            }
        }, new y20() { // from class: l.w3l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187147a.m209250T((Throwable) obj);
            }
        }));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193925y0;
    }
}
