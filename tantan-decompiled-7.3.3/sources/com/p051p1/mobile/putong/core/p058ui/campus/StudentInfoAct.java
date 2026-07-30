package com.p051p1.mobile.putong.core.p058ui.campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.campus.detailinfo.C8461a;
import com.p051p1.mobile.putong.core.p058ui.campus.detailinfo.StudentInfoPresenter;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import p153l.crl;

/* JADX INFO: loaded from: classes9.dex */
public class StudentInfoAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public StudentInfoPresenter f29512c;

    /* JADX INFO: renamed from: d */
    public C8461a f29513d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m45668X1(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StudentInfoAct.class);
        intent.putExtra("from_channel", str);
        if (z) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addFlags(524288);
        }
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29513d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29512c = new StudentInfoPresenter(this);
        C8461a c8461a = new C8461a(this);
        this.f29513d = c8461a;
        this.f29512c.mo52715C(c8461a);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29512c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needRefreshUser() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0) {
                this.f29512c.m45698p0(intent);
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        }
        if (i2 == 1 && i == 1) {
            this.f29512c.m45697o0();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f29512c.m45699q0();
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        this.f29512c.m45693R0();
        this.f29512c.m45691P0(list);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        this.f29512c.m45693R0();
        this.f29512c.m45694S0(str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_student_verification_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f29512c.m45692Q0(getIntent().getStringExtra("from_channel"));
    }
}
