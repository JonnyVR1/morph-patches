package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumfans;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p1.mobile.putong.app.PutongAct;
import p007l.b570;
import p007l.u470;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFansAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public u470 f3736c;

    /* JADX INFO: renamed from: d */
    public b570 f3737d;

    /* JADX INFO: renamed from: e */
    public String f3738e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m6110V1(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) PhotoAlbumFansAct.class);
        intent.putExtra("from", str);
        intent.putExtra("hasUnreadFans", z);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        setStatusBarColor(-1);
        return this.f3737d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f3737d = new b570(this);
        u470 u470Var = new u470(this);
        this.f3736c = u470Var;
        u470Var.C(this.f3737d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f3736c.m14766a0();
    }

    public boolean isAnonymousMode() {
        return true;
    }

    public String pageId() {
        if ("fans".equals(this.f3738e) || "activities_fans".equals(this.f3738e)) {
            return "p_fans";
        }
        return FollowshipStatus.following.equals(this.f3738e) ? "p_follow_list" : super.pageId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        this.f3738e = stringExtra;
        this.f3736c.m14753F0(stringExtra, getIntent().getBooleanExtra("hasUnreadFans", false));
        ((PutongAct) this).pageHelper.q(pageId());
        super.preCreateView(bundle);
    }
}
