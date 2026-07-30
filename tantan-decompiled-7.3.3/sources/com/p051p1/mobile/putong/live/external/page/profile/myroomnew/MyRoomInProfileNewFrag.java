package com.p051p1.mobile.putong.live.external.page.profile.myroomnew;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.npl;
import p153l.r420;
import p153l.w420;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileNewFrag extends LiveBaseFrag implements npl {

    /* JADX INFO: renamed from: A */
    public w420 f46846A;

    /* JADX INFO: renamed from: B */
    public String f46847B;

    /* JADX INFO: renamed from: C */
    public String f46848C;

    /* JADX INFO: renamed from: z */
    public r420 f46849z;

    /* JADX INFO: renamed from: M4 */
    public static PutongFrag m71733M4(String str, String str2) {
        MyRoomInProfileNewFrag myRoomInProfileNewFrag = new MyRoomInProfileNewFrag();
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString("from", str2);
        myRoomInProfileNewFrag.setArguments(bundle);
        return myRoomInProfileNewFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f46847B = arguments.getString("userId", "");
        this.f46848C = arguments.getString("from", "");
        if (TextUtils.isEmpty(this.f46847B)) {
            return;
        }
        this.f46849z = new r420(this, this.f46847B, this.f46848C);
        w420 w420Var = new w420();
        this.f46846A = w420Var;
        this.f46849z.mo52715C(w420Var);
        this.f46849z.mo40472Z();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        w420 w420Var = this.f46846A;
        if (w420Var == null) {
            return null;
        }
        return w420Var.inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.npl
    /* JADX INFO: renamed from: l */
    public void mo71694l(boolean z) {
    }
}
