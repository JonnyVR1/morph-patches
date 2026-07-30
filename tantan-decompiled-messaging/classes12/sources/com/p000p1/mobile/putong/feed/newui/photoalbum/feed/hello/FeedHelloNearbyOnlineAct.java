package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.hello;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p1.mobile.putong.app.PutongAct;
import p007l.m7h;
import p007l.r7h;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedHelloNearbyOnlineAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public r7h f3093c;

    /* JADX INFO: renamed from: d */
    public m7h f3094d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3093c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f3093c = new r7h(this);
        m7h m7hVar = new m7h(this);
        this.f3094d = m7hVar;
        m7hVar.C(this.f3093c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f3093c.m13848k();
        this.f3094d.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m4886u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    public String pageId() {
        return "p_nearby_online";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
