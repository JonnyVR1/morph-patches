package com.p000p1.mobile.putong.account.p002ui.accountnew.facebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.SignUpData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.List;
import l.vwb;
import p006l.lvf;
import p006l.ovf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FacebookSignUpProfileImageAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public SignUpData f488c;

    /* JADX INFO: renamed from: d */
    public ovf f489d;

    /* JADX INFO: renamed from: e */
    public lvf f490e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m480V1(Act act, SignUpData signUpData) {
        return new Intent((Context) act, (Class<?>) FacebookSignUpProfileImageAct.class).putExtra("signUpData", (Serializable) signUpData);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f489d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f489d = new ovf(this);
        lvf lvfVar = new lvf(this);
        this.f490e = lvfVar;
        lvfVar.C(this.f489d);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f490e.m19068a0();
    }

    public void onBackPressed() {
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (vwb.J(list)) {
            return;
        }
        this.f490e.m19070p0(list.get(0));
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("signUpData", this.f488c);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_fbimagepage_signup_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        if (NullChecker.a(bundle) && NullChecker.c(bundle.getSerializable("signUpData"), "account", CrashHelper.ReportLevel.p9)) {
            this.f488c = bundle.getSerializable("signUpData");
        } else {
            this.f488c = getIntent().getSerializableExtra("signUpData");
        }
        this.f490e.m19071r0(this.f488c);
        super.preCreateView(bundle);
    }
}
