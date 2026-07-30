package p149l;

import android.content.Context;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.view.HideAvatarSettingView;

/* JADX INFO: loaded from: classes13.dex */
public class n0l extends uo80<HideAvatarSettingView> {
    public n0l(gn80 gn80Var) {
        super(1, gn80Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m157279R(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 42200) {
                lsi0.m151595y(coreService.metaMessage);
            }
        }
    }

    @Override // p149l.uo80
    /* JADX INFO: renamed from: K */
    public void mo114505K(final rp80 rp80Var) {
        rp80Var.duringCreated(LivePrivacyApiProvider.getHideAvatarEnable()).subscribe(ffw.m121194e(new e30() { // from class: l.l0l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125551a.m157283T(rp80Var, (BLiveHideAvatarEnterConfig) obj);
            }
        }, new e30() { // from class: l.m0l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130747a.m157279R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public String m157280P(Context context) {
        return context.getString(R$string.f44882T);
    }

    /* JADX INFO: renamed from: Q */
    public String m157281Q(Context context) {
        return context.getString(R$string.f44883U);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m157283T(rp80 rp80Var, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        Act act = rp80Var.act();
        if (act == null || act.isFinishing()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("enter_hide_avatar_config", bLiveHideAvatarEnterConfig);
        act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "hide_avatar", bundle));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo70566u(HideAvatarSettingView hideAvatarSettingView) {
        super.mo70566u(hideAvatarSettingView);
        hideAvatarSettingView.m70789j0(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162653B0;
    }
}
