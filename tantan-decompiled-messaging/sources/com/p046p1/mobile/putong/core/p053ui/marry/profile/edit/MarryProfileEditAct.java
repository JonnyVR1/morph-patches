package com.p046p1.mobile.putong.core.p053ui.marry.profile.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.v1x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryProfileEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public v1x f30389c;

    /* JADX INFO: renamed from: d */
    public MarryProfileEditPresenter f30390d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m47418Y1(Context context) {
        Intent intent = new Intent(context, (Class<?>) MarryProfileEditAct.class);
        intent.putExtra("jump_show_tab", "editTab");
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m47419Z1(Context context, String str) {
        Intent intentM47418Y1 = m47418Y1(context);
        intentM47418Y1.putExtra("marry_jump_marry", str);
        return intentM47418Y1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30389c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30390d = new MarryProfileEditPresenter(this);
        v1x v1xVar = new v1x(this);
        this.f30389c = v1xVar;
        this.f30390d.mo51532C(v1xVar);
        this.f30390d.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30390d.mo39470a0();
        creates(new e30() { // from class: l.k1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120664a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 5001) {
            if (i == 786) {
                this.f30390d.m47445y0(i, i2, intent);
            }
        } else if (i2 == -1) {
            User user = (User) intent.getSerializableExtra("loop_edit_user");
            if (NullChecker.m81303a(user)) {
                this.f30390d.m47428C0(user);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f30390d.m47436m0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        super.onCropImageResult(str);
        this.f30390d.m47446z0(str);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        if (!this.f30389c.f179295j) {
            this.f30390d.m47429D0();
        }
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m81303a(this.f30389c)) {
            this.f30389c.m196666u(bundle);
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_marriage_profile_edit";
    }
}
