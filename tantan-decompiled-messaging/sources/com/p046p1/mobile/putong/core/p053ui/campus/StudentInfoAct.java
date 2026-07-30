package com.p046p1.mobile.putong.core.p053ui.campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.campus.detailinfo.C8298a;
import com.p046p1.mobile.putong.core.p053ui.campus.detailinfo.StudentInfoPresenter;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.rol;

/* JADX INFO: loaded from: classes10.dex */
public class StudentInfoAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public StudentInfoPresenter f28664c;

    /* JADX INFO: renamed from: d */
    public C8298a f28665d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m44485V1(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StudentInfoAct.class);
        intent.putExtra("from_channel", str);
        if (z) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28665d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28664c = new StudentInfoPresenter(this);
        C8298a c8298a = new C8298a(this);
        this.f28665d = c8298a;
        this.f28664c.mo51532C(c8298a);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28664c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needRefreshUser() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0) {
                this.f28664c.m44515p0(intent);
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        }
        if (i2 == 1 && i == 1) {
            this.f28664c.m44514o0();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f28664c.m44516q0();
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        this.f28664c.m44510R0();
        this.f28664c.m44508P0(list);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        this.f28664c.m44510R0();
        this.f28664c.m44511S0(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_student_verification_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f28664c.m44509Q0(getIntent().getStringExtra("from_channel"));
    }
}
