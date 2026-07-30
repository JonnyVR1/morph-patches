package com.p046p1.mobile.putong.feed.newui.photoalbum.feed;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import java.util.ArrayList;
import java.util.List;
import p149l.b870;
import p149l.d30;
import p149l.f770;
import p149l.hpd0;
import p149l.j760;
import p149l.p6j0;
import p149l.pcl0;
import p149l.tsi0;
import p149l.tzl;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFeedAct extends PutongAct implements tsi0 {

    /* JADX INFO: renamed from: e */
    public static final hpd0 f41621e = new hpd0("has_matched_first_time", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public b870 f41622c;

    /* JADX INFO: renamed from: d */
    public f770 f41623d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m64355V1(Context context, String str, String str2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFeedAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra("from", str2);
        intent.putExtra("selected_item_position", i);
        intent.putExtra("target_moment_id", User.ID_TEAM_ACCOUNT);
        intent.putExtra("page_type", i2);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m64356X1(Context context, String str, String str2, int i, String str3, int i2) {
        Intent intentM64355V1 = m64355V1(context, str, str2, i, i2);
        intentM64355V1.putExtra("target_moment_id", str3);
        return intentM64355V1;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m64357Y1(Context context, String str, String str2, int i, String str3, int i2, String str4, boolean z) {
        Intent intentM64355V1 = m64355V1(context, str, str2, i, i2);
        intentM64355V1.putExtra("target_moment_id", str3);
        intentM64355V1.putExtra("source_page_id", str4);
        intentM64355V1.putExtra("start_home_card", z);
        return intentM64355V1;
    }

    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m64358Z1() {
        String str;
        f770 f770Var = this.f41623d;
        return (f770Var == null || (str = f770Var.f96218g) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: a2 */
    public void m64359a2(String str) {
        this.pageHelper.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("is_personal_page", FeedModule.m60222H().me_().f56011id.equals(str) ? "true" : "false"), p6j0.C19147a.m167678g("album_owner_id", str)));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return ((Frag) fragmentManager().m2554h0(R.id.content)) instanceof PhotoAlbumFeedFrag ? vwb.m200324f0(new j760[0]) : vwb.m200324f0(new j760[0]);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41622c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f41622c = new b870(this);
        f770 f770Var = new f770(this);
        this.f41623d = f770Var;
        f770Var.mo51532C(this.f41622c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f41623d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        pcl0 pcl0Var = (Frag) fragmentManager().m2554h0(R.id.content);
        if (pcl0Var instanceof tzl) {
            ((tzl) pcl0Var).mo62034o();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m63859u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f41623d.m119783j0(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_album";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f41623d.m119782g0();
        super.preCreateView(bundle);
        m64359a2(this.f41623d.f96213b);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
