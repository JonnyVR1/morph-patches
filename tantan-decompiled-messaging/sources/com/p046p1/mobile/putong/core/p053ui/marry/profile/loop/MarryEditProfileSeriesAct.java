package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.czw;
import p149l.tzb0;
import p149l.vwb;
import p149l.zyw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileSeriesAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public zyw f30396c;

    /* JADX INFO: renamed from: d */
    public czw f30397d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m47451X1(Context context, User user, ArrayList<MarrySeriesType> arrayList, boolean z) {
        return m47452Y1(context, user, arrayList, z, false, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m47452Y1(Context context, User user, ArrayList<MarrySeriesType> arrayList, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) MarryEditProfileSeriesAct.class);
        intent.putExtra("args_edit_user", user);
        intent.putExtra("args_type_list", arrayList);
        intent.putExtra("args_loop", z);
        intent.putExtra("args_patch_user_at_once", z2);
        intent.putExtra("args_secondary_page", z3);
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: Z1 */
    public zyw m47453Z1() {
        return this.f30396c;
    }

    @NonNull
    /* JADX INFO: renamed from: a2 */
    public czw m47454a2() {
        return this.f30397d;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m47455b2() {
        return TextUtils.equals(getIntent().getStringExtra("from"), "from_ideal_type_swipe_guide");
    }

    /* JADX INFO: renamed from: c2 */
    public boolean m47456c2() {
        if (getIntent().getExtras() == null) {
            return false;
        }
        return getIntent().getBooleanExtra("from_profile_featured", false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(tzb0.f172715b, tzb0.f172720g);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30397d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30396c = new zyw(this);
        czw czwVar = new czw(this);
        this.f30397d = czwVar;
        this.f30396c.mo51532C(czwVar);
        this.f30396c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30396c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m47453Z1().m220975p0().onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m47453Z1().m220969I0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        super.onCropImageResult(str);
        m47453Z1().m220975p0().mo47501S3(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (!NullChecker.m81303a(this.f30396c.m220975p0()) || vwb.m200296J(list)) {
            return;
        }
        this.f30396c.m220975p0().mo47499Q4(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
