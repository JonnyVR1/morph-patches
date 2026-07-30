package com.p000p1.mobile.putong.feed.newui.photoalbum.feed;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.hpd0;
import l.j760;
import l.tsi0;
import l.vwb;
import p007l.b870;
import p007l.f770;
import p007l.p6j0;
import p007l.tzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFeedAct extends PutongAct implements tsi0 {

    /* JADX INFO: renamed from: e */
    public static final hpd0 f3082e = new hpd0("has_matched_first_time", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public b870 f3083c;

    /* JADX INFO: renamed from: d */
    public f770 f3084d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m5428V1(Context context, String str, String str2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFeedAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra("from", str2);
        intent.putExtra("selected_item_position", i);
        intent.putExtra("target_moment_id", User.ID_TEAM_ACCOUNT);
        intent.putExtra("page_type", i2);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m5429X1(Context context, String str, String str2, int i, String str3, int i2) {
        Intent intentM5428V1 = m5428V1(context, str, str2, i, i2);
        intentM5428V1.putExtra("target_moment_id", str3);
        return intentM5428V1;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m5430Y1(Context context, String str, String str2, int i, String str3, int i2, String str4, boolean z) {
        Intent intentM5428V1 = m5428V1(context, str, str2, i, i2);
        intentM5428V1.putExtra("target_moment_id", str3);
        intentM5428V1.putExtra("source_page_id", str4);
        intentM5428V1.putExtra("start_home_card", z);
        return intentM5428V1;
    }

    /* JADX INFO: renamed from: F */
    public boolean m5431F() {
        return false;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m5432Z1() {
        String str;
        f770 f770Var = this.f3084d;
        return (f770Var == null || (str = f770Var.f8009g) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: a2 */
    public void m5433a2(String str) {
        ((PutongAct) this).pageHelper.o(p6j0.m12911a(p6j0.C2456a.m12922g("is_personal_page", ((DbObject) FeedModule.m1140H().me_()).id.equals(str) ? "true" : "false"), p6j0.C2456a.m12922g("album_owner_id", str)));
    }

    public ArrayList<j760<String, d30>> debugItems() {
        return fragmentManager().h0(R.id.content) instanceof PhotoAlbumFeedFrag ? vwb.f0(new j760[0]) : vwb.f0(new j760[0]);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3083c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f3083c = new b870(this);
        f770 f770Var = new f770(this);
        this.f3084d = f770Var;
        f770Var.C(this.f3083c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f3084d.m10075a0();
    }

    public void onBackPressed() {
        tzl tzlVar = (Frag) fragmentManager().h0(R.id.content);
        if (tzlVar instanceof tzl) {
            tzlVar.mo3012o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m4886u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    public void onPickImagesResult(List<Media> list) {
        this.f3084d.m10077j0(list);
    }

    public String pageId() {
        return "p_album";
    }

    public void preCreateView(Bundle bundle) {
        this.f3084d.m10076g0();
        super.preCreateView(bundle);
        m5433a2(this.f3084d.f8004b);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
