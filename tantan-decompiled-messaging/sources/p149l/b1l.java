package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.view.HideComsumeRecordSettingView;

/* JADX INFO: loaded from: classes13.dex */
public class b1l extends uo80<HideComsumeRecordSettingView> {
    public b1l(gn80 gn80Var) {
        super(2, gn80Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m99845T(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 43300) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44912l0));
    }

    /* JADX INFO: renamed from: R */
    public String m99848R(Context context) {
        return context.getString(R$string.f44873K);
    }

    /* JADX INFO: renamed from: S */
    public String m99849S(Context context) {
        return context.getString(R$string.f44868F);
    }

    /* JADX INFO: renamed from: U */
    public final void m99850U(HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        hideComsumeRecordSettingView.setCheckBoxIsOpen(!hideComsumeRecordSettingView.getCheckBoxIsOpen());
        lsi0.m151595y(s9s.f163227a.getString(hideComsumeRecordSettingView.getCheckBoxIsOpen() ? R$string.f44911l : R$string.f44913m));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m99851V(HideComsumeRecordSettingView hideComsumeRecordSettingView, soj0 soj0Var) {
        m99850U(hideComsumeRecordSettingView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo70566u(HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        super.mo70566u(hideComsumeRecordSettingView);
        hideComsumeRecordSettingView.m70793k0(this);
        m194544H().mo127117b(this, hideComsumeRecordSettingView);
    }

    @Override // p149l.uo80
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo99846J(rp80 rp80Var, final HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        rp80Var.duringCreated(LivePrivacyApiProvider.getHideConsumeRecordEnable(l9s.m149093o0())).subscribe(ffw.m121194e(new e30() { // from class: l.x0l
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = (BLiveHiddenConsumeRecordButton) obj;
                hideComsumeRecordSettingView.setCheckBoxIsOpen(bLiveHiddenConsumeRecordButton != null && bLiveHiddenConsumeRecordButton.userHiddenConsumeRecordOn);
            }
        }, new e30() { // from class: l.y0l
            @Override // p149l.e30
            public final void call(Object obj) {
                hideComsumeRecordSettingView.setCheckBoxIsOpen(false);
            }
        }));
    }

    @Override // p149l.uo80
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo99847L(rp80 rp80Var, final HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        rp80Var.duringCreated(LivePrivacyApiProvider.setHideConsumeRecordEnable(l9s.m149093o0(), m194545I() != 2, hideComsumeRecordSettingView.getCheckBoxIsOpen())).subscribe(ffw.m121194e(new e30() { // from class: l.z0l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201001a.m99851V(hideComsumeRecordSettingView, (soj0) obj);
            }
        }, new e30() { // from class: l.a1l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67185a.m99845T((Throwable) obj);
            }
        }));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162656C0;
    }
}
