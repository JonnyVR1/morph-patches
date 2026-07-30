package com.p051p1.mobile.putong.account.p055ui.accountnew.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignUpData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.cxf;
import p153l.jyb;
import p153l.zwf;

/* JADX INFO: loaded from: classes9.dex */
public class FacebookSignUpProfileImageAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public SignUpData f17218c;

    /* JADX INFO: renamed from: d */
    public cxf f17219d;

    /* JADX INFO: renamed from: e */
    public zwf f17220e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29582X1(Act act, SignUpData signUpData) {
        return new Intent(act, (Class<?>) FacebookSignUpProfileImageAct.class).putExtra("signUpData", signUpData);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17219d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17219d = new cxf(this);
        zwf zwfVar = new zwf(this);
        this.f17220e = zwfVar;
        zwfVar.mo52715C(this.f17219d);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17220e.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (jyb.m147479J(list)) {
            return;
        }
        this.f17220e.m221895p0(list.get(0));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("signUpData", this.f17218c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_fbimagepage_signup_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        if (NullChecker.m82486a(bundle) && NullChecker.m82488c(bundle.getSerializable("signUpData"), SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            this.f17218c = (SignUpData) bundle.getSerializable("signUpData");
        } else {
            this.f17218c = (SignUpData) getIntent().getSerializableExtra("signUpData");
        }
        this.f17220e.m221896r0(this.f17218c);
        super.preCreateView(bundle);
    }
}
