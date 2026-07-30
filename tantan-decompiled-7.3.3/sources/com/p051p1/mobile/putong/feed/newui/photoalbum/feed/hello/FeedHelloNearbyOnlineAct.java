package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.hello;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import p153l.b9h;
import p153l.g9h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedHelloNearbyOnlineAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public g9h f42480c;

    /* JADX INFO: renamed from: d */
    public b9h f42481d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42480c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42480c = new g9h(this);
        b9h b9hVar = new b9h(this);
        this.f42481d = b9hVar;
        b9hVar.mo52715C(this.f42480c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42480c.m129581k();
        this.f42481d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m65042u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_nearby_online";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
