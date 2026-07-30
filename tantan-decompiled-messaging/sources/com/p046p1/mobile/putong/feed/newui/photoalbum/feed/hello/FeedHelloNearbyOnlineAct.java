package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.hello;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import p149l.m7h;
import p149l.r7h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedHelloNearbyOnlineAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public r7h f41632c;

    /* JADX INFO: renamed from: d */
    public m7h f41633d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41632c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f41632c = new r7h(this);
        m7h m7hVar = new m7h(this);
        this.f41633d = m7hVar;
        m7hVar.mo51532C(this.f41632c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f41632c.m178135k();
        this.f41633d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m63859u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_nearby_online";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
