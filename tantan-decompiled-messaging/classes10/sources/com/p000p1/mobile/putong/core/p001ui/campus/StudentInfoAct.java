package com.p000p1.mobile.putong.core.p001ui.campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.campus.detailinfo.C3073a;
import com.p000p1.mobile.putong.core.p001ui.campus.detailinfo.StudentInfoPresenter;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.rol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class StudentInfoAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public StudentInfoPresenter f1058c;

    /* JADX INFO: renamed from: d */
    public C3073a f1059d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m1784V1(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StudentInfoAct.class);
        intent.putExtra("from_channel", str);
        if (z) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1059d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1058c = new StudentInfoPresenter(this);
        C3073a c3073a = new C3073a(this);
        this.f1059d = c3073a;
        this.f1058c.C(c3073a);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1058c.m1813a0();
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public boolean needRefreshUser() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0) {
                this.f1058c.m1815p0(intent);
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        }
        if (i2 == 1 && i == 1) {
            this.f1058c.m1814o0();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        this.f1058c.m1816q0();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.a(list) || list.size() <= 0) {
            return;
        }
        this.f1058c.m1809R0();
        this.f1058c.m1807P0(list);
    }

    public void onTakePictureResult(String str) {
        this.f1058c.m1809R0();
        this.f1058c.m1810S0(str);
    }

    public String pageId() {
        return "p_student_verification_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f1058c.m1808Q0(getIntent().getStringExtra("from_channel"));
    }
}
