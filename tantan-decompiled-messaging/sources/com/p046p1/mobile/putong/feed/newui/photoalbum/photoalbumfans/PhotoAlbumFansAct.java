package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumfans;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import p149l.b570;
import p149l.u470;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFansAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public u470 f42275c;

    /* JADX INFO: renamed from: d */
    public b570 f42276d;

    /* JADX INFO: renamed from: e */
    public String f42277e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m65009V1(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFansAct.class);
        intent.putExtra("from", str);
        intent.putExtra("hasUnreadFans", z);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        setStatusBarColor(-1);
        return this.f42276d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42276d = new b570(this);
        u470 u470Var = new u470(this);
        this.f42275c = u470Var;
        u470Var.mo51532C(this.f42276d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42275c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        if ("fans".equals(this.f42277e) || "activities_fans".equals(this.f42277e)) {
            return "p_fans";
        }
        return FollowshipStatus.following.equals(this.f42277e) ? "p_follow_list" : super.pageId();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        this.f42277e = stringExtra;
        this.f42275c.m191705F0(stringExtra, getIntent().getBooleanExtra("hasUnreadFans", false));
        this.pageHelper.m109041q(pageId());
        super.preCreateView(bundle);
    }
}
