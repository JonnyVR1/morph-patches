package com.p051p1.mobile.putong.core.p058ui.marry.profile.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.u4x;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MarryProfileEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public u4x f31237c;

    /* JADX INFO: renamed from: d */
    public MarryProfileEditPresenter f31238d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m48601Z1(Context context) {
        Intent intent = new Intent(context, (Class<?>) MarryProfileEditAct.class);
        intent.putExtra("jump_show_tab", "editTab");
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m48602a2(Context context, String str) {
        Intent intentM48601Z1 = m48601Z1(context);
        intentM48601Z1.putExtra("marry_jump_marry", str);
        return intentM48601Z1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31237c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31238d = new MarryProfileEditPresenter(this);
        u4x u4xVar = new u4x(this);
        this.f31237c = u4xVar;
        this.f31238d.mo52715C(u4xVar);
        this.f31238d.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31238d.mo40473a0();
        creates(new y20() { // from class: l.j4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118341a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 5001) {
            if (i == 786) {
                this.f31238d.m48628y0(i, i2, intent);
            }
        } else if (i2 == -1) {
            User user = (User) intent.getSerializableExtra("loop_edit_user");
            if (NullChecker.m82486a(user)) {
                this.f31238d.m48611C0(user);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31238d.m48619m0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        super.onCropImageResult(str);
        this.f31238d.m48629z0(str);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        if (!this.f31237c.f177556j) {
            this.f31238d.m48612D0();
        }
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m82486a(this.f31237c)) {
            this.f31237c.m194515u(bundle);
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_marriage_profile_edit";
    }
}
