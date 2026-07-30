package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.b2x;
import p153l.jyb;
import p153l.y1x;
import p153l.z7c0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileSeriesAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public y1x f31244c;

    /* JADX INFO: renamed from: d */
    public b2x f31245d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m48634Y1(Context context, User user, ArrayList<MarrySeriesType> arrayList, boolean z) {
        return m48635Z1(context, user, arrayList, z, false, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m48635Z1(Context context, User user, ArrayList<MarrySeriesType> arrayList, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) MarryEditProfileSeriesAct.class);
        intent.putExtra("args_edit_user", user);
        intent.putExtra("args_type_list", arrayList);
        intent.putExtra("args_loop", z);
        intent.putExtra("args_patch_user_at_once", z2);
        intent.putExtra("args_secondary_page", z3);
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: a2 */
    public y1x m48636a2() {
        return this.f31244c;
    }

    @NonNull
    /* JADX INFO: renamed from: b2 */
    public b2x m48637b2() {
        return this.f31245d;
    }

    /* JADX INFO: renamed from: c2 */
    public boolean m48638c2() {
        return TextUtils.equals(getIntent().getStringExtra("from"), "from_ideal_type_swipe_guide");
    }

    /* JADX INFO: renamed from: d2 */
    public boolean m48639d2() {
        if (getIntent().getExtras() == null) {
            return false;
        }
        return getIntent().getBooleanExtra("from_profile_featured", false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(z7c0.f203233b, z7c0.f203238g);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31245d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31244c = new y1x(this);
        b2x b2xVar = new b2x(this);
        this.f31245d = b2xVar;
        this.f31244c.mo52715C(b2xVar);
        this.f31244c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31244c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m48636a2().m213992p0().onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m48636a2().m213986I0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        super.onCropImageResult(str);
        m48636a2().m213992p0().mo48684S3(str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (!NullChecker.m82486a(this.f31244c.m213992p0()) || jyb.m147479J(list)) {
            return;
        }
        this.f31244c.m213992p0().mo48682Q4(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
