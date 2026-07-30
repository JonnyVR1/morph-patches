package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.view.HideLiveAnchorLevelView;

/* JADX INFO: loaded from: classes13.dex */
public class h1l extends uo80<HideLiveAnchorLevelView> {
    public h1l(gn80 gn80Var) {
        super(5, gn80Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m129035T(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43335) {
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44887Y));
        } else {
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44912l0));
        }
    }

    /* JADX INFO: renamed from: R */
    public String m129036R(Context context) {
        return context.getString(R$string.f44884V);
    }

    /* JADX INFO: renamed from: S */
    public String m129037S(Context context) {
        return context.getString(R$string.f44885W);
    }

    /* JADX INFO: renamed from: U */
    public final void m129038U(HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        hideLiveAnchorLevelView.setCheckBoxIsOpen(!hideLiveAnchorLevelView.getCheckBoxIsOpen());
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44886X));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m129039V(HideLiveAnchorLevelView hideLiveAnchorLevelView, soj0 soj0Var) {
        m129038U(hideLiveAnchorLevelView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo70566u(HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        super.mo70566u(hideLiveAnchorLevelView);
        hideLiveAnchorLevelView.m70797k0(this);
        m194544H().mo127117b(this, hideLiveAnchorLevelView);
    }

    @Override // p149l.uo80
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo99846J(rp80 rp80Var, final HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        rp80Var.duringCreated(LivePrivacyApiProvider.getHideConsumeRecordEnable(l9s.m149093o0())).subscribe(ffw.m121194e(new e30() { // from class: l.d1l
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = (BLiveHiddenConsumeRecordButton) obj;
                hideLiveAnchorLevelView.setCheckBoxIsOpen(bLiveHiddenConsumeRecordButton != null && bLiveHiddenConsumeRecordButton.hiddenAnchorHierarchyOn);
            }
        }, new e30() { // from class: l.e1l
            @Override // p149l.e30
            public final void call(Object obj) {
                hideLiveAnchorLevelView.setCheckBoxIsOpen(false);
            }
        }));
    }

    @Override // p149l.uo80
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo99847L(rp80 rp80Var, final HideLiveAnchorLevelView hideLiveAnchorLevelView) {
        rp80Var.duringCreated(LivePrivacyApiProvider.setHideLiveAnchorLevelEnable(l9s.m149093o0(), hideLiveAnchorLevelView.getCheckBoxIsOpen())).subscribe(ffw.m121194e(new e30() { // from class: l.f1l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94105a.m129039V(hideLiveAnchorLevelView, (soj0) obj);
            }
        }, new e30() { // from class: l.g1l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100184a.m129035T((Throwable) obj);
            }
        }));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162811y0;
    }
}
