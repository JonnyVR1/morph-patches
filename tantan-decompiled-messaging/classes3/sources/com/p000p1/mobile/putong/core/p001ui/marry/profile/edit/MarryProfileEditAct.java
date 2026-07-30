package com.p000p1.mobile.putong.core.p001ui.marry.profile.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.ProfileMediaAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p003l.e30;
import p003l.v1x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryProfileEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public v1x f280c;

    /* JADX INFO: renamed from: d */
    public MarryProfileEditPresenter f281d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m461Y1(Context context) {
        Intent intent = new Intent(context, (Class<?>) MarryProfileEditAct.class);
        intent.putExtra("jump_show_tab", "editTab");
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m462Z1(Context context, String str) {
        Intent intentM461Y1 = m461Y1(context);
        intentM461Y1.putExtra("marry_jump_marry", str);
        return intentM461Y1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setSwipeBackEnable(false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f280c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f281d = new MarryProfileEditPresenter(this);
        v1x v1xVar = new v1x(this);
        this.f280c = v1xVar;
        this.f281d.C(v1xVar);
        this.f281d.m476Z();
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f281d.m477a0();
        creates(new e30() { // from class: l.k1x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4797a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (i != 5001) {
            if (i == 786) {
                this.f281d.m490y0(i, i2, intent);
            }
        } else if (i2 == -1) {
            User serializableExtra = intent.getSerializableExtra("loop_edit_user");
            if (NullChecker.a(serializableExtra)) {
                this.f281d.m471C0(serializableExtra);
            }
        }
    }

    public void onBackPressed() {
        if (this.f281d.m481m0()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onCropImageResult(String str) {
        super/*com.p1.mobile.android.app.Act*/.onCropImageResult(str);
        this.f281d.m491z0(str);
    }

    public void onDestroyLifecycle() {
        if (!this.f280c.f8176j) {
            this.f281d.m472D0();
        }
        super/*com.p1.mobile.putong.core.ui.AutoReleaseVideoAct*/.onDestroyLifecycle();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onSaveInstanceState(bundle);
        if (NullChecker.a(this.f280c)) {
            this.f280c.m8291u(bundle);
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    public String pageId() {
        return "p_marriage_profile_edit";
    }
}
