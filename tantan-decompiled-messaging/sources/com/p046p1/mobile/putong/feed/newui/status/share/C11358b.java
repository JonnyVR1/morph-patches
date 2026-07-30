package com.p046p1.mobile.putong.feed.newui.status.share;

import android.view.View;
import p149l.nkg;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11358b implements FeedGalleryLayoutManager.InterfaceC11353c {
    @Override // com.p046p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager.InterfaceC11353c
    /* JADX INFO: renamed from: a */
    public void mo65866a(FeedGalleryLayoutManager feedGalleryLayoutManager, View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float fAbs = 1.0f - (Math.abs(f) * 0.3f);
        if (nkg.m159840A()) {
            fAbs = 1.0f - (Math.abs(f) * 0.4f);
        }
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
