package com.p051p1.mobile.putong.live.external.page.setting.hideavatar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.a3l;
import p153l.i3l;

/* JADX INFO: loaded from: classes9.dex */
public class LiveHideAvatarFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public a3l f47030A;

    /* JADX INFO: renamed from: z */
    public i3l f47031z;

    /* JADX INFO: renamed from: M4 */
    public static LiveHideAvatarFrag m71959M4(@Nullable Bundle bundle) {
        LiveHideAvatarFrag liveHideAvatarFrag = new LiveHideAvatarFrag();
        if (bundle != null) {
            liveHideAvatarFrag.setArguments(bundle);
        }
        return liveHideAvatarFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f47031z = new i3l();
        a3l a3lVar = new a3l(act());
        this.f47030A = a3lVar;
        a3lVar.mo52715C(this.f47031z);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f47030A.m95822t0(getArguments());
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47031z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
