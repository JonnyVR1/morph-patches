package com.p051p1.mobile.putong.live.external.page.setting.privacy.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.ey80;
import p153l.vx80;

/* JADX INFO: loaded from: classes9.dex */
public class LivePrivacySettingFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public vx80 f47042A;

    /* JADX INFO: renamed from: z */
    public ey80 f47043z;

    /* JADX INFO: renamed from: M4 */
    public static LivePrivacySettingFrag m71969M4(@Nullable Bundle bundle) {
        LivePrivacySettingFrag livePrivacySettingFrag = new LivePrivacySettingFrag();
        if (bundle != null) {
            livePrivacySettingFrag.setArguments(bundle);
        }
        return livePrivacySettingFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f47043z = new ey80();
        vx80 vx80Var = new vx80(act());
        this.f47042A = vx80Var;
        vx80Var.mo52715C(this.f47043z);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f47042A.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47043z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
