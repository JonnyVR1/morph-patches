package com.p046p1.mobile.putong.account.p050ui.accountnew.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignUpData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.lvf;
import p149l.ovf;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class FacebookSignUpProfileImageAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public SignUpData f16499c;

    /* JADX INFO: renamed from: d */
    public ovf f16500d;

    /* JADX INFO: renamed from: e */
    public lvf f16501e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28583V1(Act act, SignUpData signUpData) {
        return new Intent(act, (Class<?>) FacebookSignUpProfileImageAct.class).putExtra("signUpData", signUpData);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16500d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16500d = new ovf(this);
        lvf lvfVar = new lvf(this);
        this.f16501e = lvfVar;
        lvfVar.mo51532C(this.f16500d);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16501e.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (vwb.m200296J(list)) {
            return;
        }
        this.f16501e.m151892p0(list.get(0));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("signUpData", this.f16499c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_fbimagepage_signup_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        if (NullChecker.m81303a(bundle) && NullChecker.m81305c(bundle.getSerializable("signUpData"), SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            this.f16499c = (SignUpData) bundle.getSerializable("signUpData");
        } else {
            this.f16499c = (SignUpData) getIntent().getSerializableExtra("signUpData");
        }
        this.f16501e.m151893r0(this.f16499c);
        super.preCreateView(bundle);
    }
}
