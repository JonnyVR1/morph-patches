package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumfans;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import p153l.ad70;
import p153l.hd70;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFansAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ad70 f43123c;

    /* JADX INFO: renamed from: d */
    public hd70 f43124d;

    /* JADX INFO: renamed from: e */
    public String f43125e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m66192X1(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFansAct.class);
        intent.putExtra("from", str);
        intent.putExtra("hasUnreadFans", z);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        setStatusBarColor(-1);
        return this.f43124d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43124d = new hd70(this);
        ad70 ad70Var = new ad70(this);
        this.f43123c = ad70Var;
        ad70Var.mo52715C(this.f43124d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43123c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        if ("fans".equals(this.f43125e) || "activities_fans".equals(this.f43125e)) {
            return "p_fans";
        }
        return FollowshipStatus.following.equals(this.f43125e) ? "p_follow_list" : super.pageId();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        this.f43125e = stringExtra;
        this.f43123c.m97048F0(stringExtra, getIntent().getBooleanExtra("hasUnreadFans", false));
        this.pageHelper.m152782q(pageId());
        super.preCreateView(bundle);
    }
}
