package com.p051p1.mobile.putong.feed.newui.photoalbum.feed;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import java.util.ArrayList;
import java.util.List;
import p153l.hg70;
import p153l.jxd0;
import p153l.jyb;
import p153l.lf70;
import p153l.n2m;
import p153l.ner;
import p153l.pf60;
import p153l.tfj0;
import p153l.w1j0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFeedAct extends PutongAct implements w1j0 {

    /* JADX INFO: renamed from: e */
    public static final jxd0 f42469e = new jxd0("has_matched_first_time", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public hg70 f42470c;

    /* JADX INFO: renamed from: d */
    public lf70 f42471d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m65538X1(Context context, String str, String str2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFeedAct.class);
        intent.putExtra("user_id", str);
        intent.putExtra("from", str2);
        intent.putExtra("selected_item_position", i);
        intent.putExtra("target_moment_id", User.ID_TEAM_ACCOUNT);
        intent.putExtra("page_type", i2);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m65539Y1(Context context, String str, String str2, int i, String str3, int i2) {
        Intent intentM65538X1 = m65538X1(context, str, str2, i, i2);
        intentM65538X1.putExtra("target_moment_id", str3);
        return intentM65538X1;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m65540Z1(Context context, String str, String str2, int i, String str3, int i2, String str4, boolean z) {
        Intent intentM65538X1 = m65538X1(context, str, str2, i, i2);
        intentM65538X1.putExtra("target_moment_id", str3);
        intentM65538X1.putExtra("source_page_id", str4);
        intentM65538X1.putExtra("start_home_card", z);
        return intentM65538X1;
    }

    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
    }

    /* JADX INFO: renamed from: a2 */
    public String m65541a2() {
        String str;
        lf70 lf70Var = this.f42471d;
        return (lf70Var == null || (str = lf70Var.f131827g) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: b2 */
    public void m65542b2(String str) {
        this.pageHelper.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("is_personal_page", FeedModule.m61406H().me_().f56859id.equals(str) ? "true" : "false"), tfj0.C20302a.m190949g("album_owner_id", str)));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        return ((Frag) fragmentManager().m2555h0(R.id.content)) instanceof PhotoAlbumFeedFrag ? jyb.m147507f0(new pf60[0]) : jyb.m147507f0(new pf60[0]);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42470c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42470c = new hg70(this);
        lf70 lf70Var = new lf70(this);
        this.f42471d = lf70Var;
        lf70Var.mo52715C(this.f42470c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42471d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ner nerVar = (Frag) fragmentManager().m2555h0(R.id.content);
        if (nerVar instanceof n2m) {
            ((n2m) nerVar).mo63217o();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m65042u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f42471d.m153996j0(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_album";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f42471d.m153995g0();
        super.preCreateView(bundle);
        m65542b2(this.f42471d.f131822b);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
