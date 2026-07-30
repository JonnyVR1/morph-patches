package p153l;

import android.content.Context;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.view.HideAvatarSettingView;

/* JADX INFO: loaded from: classes9.dex */
public class d3l extends yw80<HideAvatarSettingView> {
    public d3l(kv80 kv80Var) {
        super(1, kv80Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m113837R(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 42200) {
                o1j0.m165651y(coreService.metaMessage);
            }
        }
    }

    @Override // p153l.yw80
    /* JADX INFO: renamed from: K */
    public void mo113838K(final vx80 vx80Var) {
        vx80Var.duringCreated(LivePrivacyApiProvider.getHideAvatarEnable()).subscribe(dhw.m115826e(new y20() { // from class: l.b3l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74784a.m113842T(vx80Var, (BLiveHideAvatarEnterConfig) obj);
            }
        }, new y20() { // from class: l.c3l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79630a.m113837R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public String m113839P(Context context) {
        return context.getString(R$string.f45730T);
    }

    /* JADX INFO: renamed from: Q */
    public String m113840Q(Context context) {
        return context.getString(R$string.f45731U);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m113842T(vx80 vx80Var, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        Act act = vx80Var.act();
        if (act == null || act.isFinishing()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("enter_hide_avatar_config", bLiveHideAvatarEnterConfig);
        act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "hide_avatar", bundle));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo71749u(HideAvatarSettingView hideAvatarSettingView) {
        super.mo71749u(hideAvatarSettingView);
        hideAvatarSettingView.m71972j0(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193767B0;
    }
}
