package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.view.HideComsumeRecordSettingView;

/* JADX INFO: loaded from: classes9.dex */
public class r3l extends yw80<HideComsumeRecordSettingView> {
    public r3l(kv80 kv80Var) {
        super(2, kv80Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m179625T(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 43300) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165651y(tbs.f172988a.getString(R$string.f45760l0));
    }

    /* JADX INFO: renamed from: R */
    public String m179628R(Context context) {
        return context.getString(R$string.f45721K);
    }

    /* JADX INFO: renamed from: S */
    public String m179629S(Context context) {
        return context.getString(R$string.f45716F);
    }

    /* JADX INFO: renamed from: U */
    public final void m179630U(HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        hideComsumeRecordSettingView.setCheckBoxIsOpen(!hideComsumeRecordSettingView.getCheckBoxIsOpen());
        o1j0.m165651y(tbs.f172988a.getString(hideComsumeRecordSettingView.getCheckBoxIsOpen() ? R$string.f45759l : R$string.f45761m));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m179631V(HideComsumeRecordSettingView hideComsumeRecordSettingView, vxj0 vxj0Var) {
        m179630U(hideComsumeRecordSettingView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo71749u(HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        super.mo71749u(hideComsumeRecordSettingView);
        hideComsumeRecordSettingView.m71976k0(this);
        m217585H().mo151655b(this, hideComsumeRecordSettingView);
    }

    @Override // p153l.yw80
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo179626J(vx80 vx80Var, final HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        vx80Var.duringCreated(LivePrivacyApiProvider.getHideConsumeRecordEnable(mbs.m157870o0())).subscribe(dhw.m115826e(new y20() { // from class: l.n3l
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = (BLiveHiddenConsumeRecordButton) obj;
                hideComsumeRecordSettingView.setCheckBoxIsOpen(bLiveHiddenConsumeRecordButton != null && bLiveHiddenConsumeRecordButton.userHiddenConsumeRecordOn);
            }
        }, new y20() { // from class: l.o3l
            @Override // p153l.y20
            public final void call(Object obj) {
                hideComsumeRecordSettingView.setCheckBoxIsOpen(false);
            }
        }));
    }

    @Override // p153l.yw80
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo179627L(vx80 vx80Var, final HideComsumeRecordSettingView hideComsumeRecordSettingView) {
        vx80Var.duringCreated(LivePrivacyApiProvider.setHideConsumeRecordEnable(mbs.m157870o0(), m217586I() != 2, hideComsumeRecordSettingView.getCheckBoxIsOpen())).subscribe(dhw.m115826e(new y20() { // from class: l.p3l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150416a.m179631V(hideComsumeRecordSettingView, (vxj0) obj);
            }
        }, new y20() { // from class: l.q3l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155459a.m179625T((Throwable) obj);
            }
        }));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193770C0;
    }
}
