package com.p051p1.mobile.putong.live.external.page.profile.myroom;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.d520;
import p153l.m520;
import p153l.npl;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileFrag extends LiveBaseFrag implements npl {

    /* JADX INFO: renamed from: A */
    public m520 f46786A;

    /* JADX INFO: renamed from: B */
    public String f46787B;

    /* JADX INFO: renamed from: C */
    public String f46788C;

    /* JADX INFO: renamed from: z */
    public d520 f46789z;

    /* JADX INFO: renamed from: M4 */
    public static PutongFrag m71693M4(String str, String str2) {
        MyRoomInProfileFrag myRoomInProfileFrag = new MyRoomInProfileFrag();
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString("from", str2);
        myRoomInProfileFrag.setArguments(bundle);
        return myRoomInProfileFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f46787B = arguments.getString("userId", "");
        this.f46788C = arguments.getString("from", "");
        if (TextUtils.isEmpty(this.f46787B)) {
            return;
        }
        this.f46789z = new d520(this, this.f46787B, this.f46788C);
        m520 m520Var = new m520();
        this.f46786A = m520Var;
        this.f46789z.mo52715C(m520Var);
        this.f46789z.mo40472Z();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        m520 m520Var = this.f46786A;
        if (m520Var == null) {
            return null;
        }
        return m520Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.npl
    /* JADX INFO: renamed from: l */
    public void mo71694l(boolean z) {
        d520 d520Var = this.f46789z;
        if (d520Var != null) {
            d520Var.m114252i0(z);
        }
    }
}
