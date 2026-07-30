package com.p046p1.mobile.putong.live.external.page.profile.myroomnew;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.cnl;
import p149l.jw10;
import p149l.ow10;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileNewFrag extends LiveBaseFrag implements cnl {

    /* JADX INFO: renamed from: A */
    public ow10 f45998A;

    /* JADX INFO: renamed from: B */
    public String f45999B;

    /* JADX INFO: renamed from: C */
    public String f46000C;

    /* JADX INFO: renamed from: z */
    public jw10 f46001z;

    /* JADX INFO: renamed from: M4 */
    public static PutongFrag m70550M4(String str, String str2) {
        MyRoomInProfileNewFrag myRoomInProfileNewFrag = new MyRoomInProfileNewFrag();
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString("from", str2);
        myRoomInProfileNewFrag.setArguments(bundle);
        return myRoomInProfileNewFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f45999B = arguments.getString("userId", "");
        this.f46000C = arguments.getString("from", "");
        if (TextUtils.isEmpty(this.f45999B)) {
            return;
        }
        this.f46001z = new jw10(this, this.f45999B, this.f46000C);
        ow10 ow10Var = new ow10();
        this.f45998A = ow10Var;
        this.f46001z.mo51532C(ow10Var);
        this.f46001z.mo39469Z();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ow10 ow10Var = this.f45998A;
        if (ow10Var == null) {
            return null;
        }
        return ow10Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.cnl
    /* JADX INFO: renamed from: l */
    public void mo70511l(boolean z) {
    }
}
