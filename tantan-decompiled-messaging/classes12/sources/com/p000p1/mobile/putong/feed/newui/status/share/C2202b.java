package com.p000p1.mobile.putong.feed.newui.status.share;

import android.view.View;
import p007l.nkg;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2202b implements FeedGalleryLayoutManager.InterfaceC2197c {
    @Override // com.p000p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager.InterfaceC2197c
    /* JADX INFO: renamed from: a */
    public void mo7013a(FeedGalleryLayoutManager feedGalleryLayoutManager, View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float fAbs = 1.0f - (Math.abs(f) * 0.3f);
        if (nkg.m12199A()) {
            fAbs = 1.0f - (Math.abs(f) * 0.4f);
        }
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
