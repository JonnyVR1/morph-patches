package com.p046p1.mobile.putong.live.external.page.profile.myroom;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.cnl;
import p149l.ex10;
import p149l.vw10;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileFrag extends LiveBaseFrag implements cnl {

    /* JADX INFO: renamed from: A */
    public ex10 f45938A;

    /* JADX INFO: renamed from: B */
    public String f45939B;

    /* JADX INFO: renamed from: C */
    public String f45940C;

    /* JADX INFO: renamed from: z */
    public vw10 f45941z;

    /* JADX INFO: renamed from: M4 */
    public static PutongFrag m70510M4(String str, String str2) {
        MyRoomInProfileFrag myRoomInProfileFrag = new MyRoomInProfileFrag();
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString("from", str2);
        myRoomInProfileFrag.setArguments(bundle);
        return myRoomInProfileFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f45939B = arguments.getString("userId", "");
        this.f45940C = arguments.getString("from", "");
        if (TextUtils.isEmpty(this.f45939B)) {
            return;
        }
        this.f45941z = new vw10(this, this.f45939B, this.f45940C);
        ex10 ex10Var = new ex10();
        this.f45938A = ex10Var;
        this.f45941z.mo51532C(ex10Var);
        this.f45941z.mo39469Z();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ex10 ex10Var = this.f45938A;
        if (ex10Var == null) {
            return null;
        }
        return ex10Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.cnl
    /* JADX INFO: renamed from: l */
    public void mo70511l(boolean z) {
        vw10 vw10Var = this.f45941z;
        if (vw10Var != null) {
            vw10Var.m200272i0(z);
        }
    }
}
