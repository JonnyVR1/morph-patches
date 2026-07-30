package com.p046p1.mobile.putong.live.external.page.setting.privacy.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.aq80;
import p149l.rp80;

/* JADX INFO: loaded from: classes13.dex */
public class LivePrivacySettingFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public rp80 f46194A;

    /* JADX INFO: renamed from: z */
    public aq80 f46195z;

    /* JADX INFO: renamed from: M4 */
    public static LivePrivacySettingFrag m70786M4(@Nullable Bundle bundle) {
        LivePrivacySettingFrag livePrivacySettingFrag = new LivePrivacySettingFrag();
        if (bundle != null) {
            livePrivacySettingFrag.setArguments(bundle);
        }
        return livePrivacySettingFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f46195z = new aq80();
        rp80 rp80Var = new rp80(act());
        this.f46194A = rp80Var;
        rp80Var.mo51532C(this.f46195z);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f46194A.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46195z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
