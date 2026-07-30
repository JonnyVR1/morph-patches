package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.ui.profile.ProfileMediaAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.tzb0;
import l.vwb;
import p003l.czw;
import p003l.zyw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileSeriesAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public zyw f287c;

    /* JADX INFO: renamed from: d */
    public czw f288d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m498X1(Context context, User user, ArrayList<MarrySeriesType> arrayList, boolean z) {
        return m499Y1(context, user, arrayList, z, false, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m499Y1(Context context, User user, ArrayList<MarrySeriesType> arrayList, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) MarryEditProfileSeriesAct.class);
        intent.putExtra("args_edit_user", (Serializable) user);
        intent.putExtra("args_type_list", arrayList);
        intent.putExtra("args_loop", z);
        intent.putExtra("args_patch_user_at_once", z2);
        intent.putExtra("args_secondary_page", z3);
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: Z1 */
    public zyw m500Z1() {
        return this.f287c;
    }

    @NonNull
    /* JADX INFO: renamed from: a2 */
    public czw m501a2() {
        return this.f288d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public boolean m502b2() {
        return TextUtils.equals(getIntent().getStringExtra("from"), "from_ideal_type_swipe_guide");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public boolean m503c2() {
        if (getIntent().getExtras() == null) {
            return false;
        }
        return getIntent().getBooleanExtra("from_profile_featured", false);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(tzb0.b, tzb0.g);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f288d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f287c = new zyw(this);
        czw czwVar = new czw(this);
        this.f288d = czwVar;
        this.f287c.m9533C(czwVar);
        this.f287c.m9544Z();
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f287c.m9545a0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        m500Z1().m9548p0().onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        m500Z1().m9540I0();
    }

    public void onCropImageResult(String str) {
        super/*com.p1.mobile.android.app.Act*/.onCropImageResult(str);
        m500Z1().m9548p0().mo549S3(str);
    }

    public void onPickImagesResult(List<Media> list) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (picture instanceof Picture) {
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            }
        }
        if (!NullChecker.a(this.f287c.m9548p0()) || vwb.J(list)) {
            return;
        }
        this.f287c.m9548p0().mo547Q4(list);
    }

    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
