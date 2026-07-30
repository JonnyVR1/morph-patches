package com.p046p1.mobile.putong.live.external.page.setting.hideavatar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.k0l;
import p149l.s0l;

/* JADX INFO: loaded from: classes13.dex */
public class LiveHideAvatarFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public k0l f46182A;

    /* JADX INFO: renamed from: z */
    public s0l f46183z;

    /* JADX INFO: renamed from: M4 */
    public static LiveHideAvatarFrag m70776M4(@Nullable Bundle bundle) {
        LiveHideAvatarFrag liveHideAvatarFrag = new LiveHideAvatarFrag();
        if (bundle != null) {
            liveHideAvatarFrag.setArguments(bundle);
        }
        return liveHideAvatarFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f46183z = new s0l();
        k0l k0lVar = new k0l(act());
        this.f46182A = k0lVar;
        k0lVar.mo51532C(this.f46183z);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f46182A.m144067t0(getArguments());
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46183z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
