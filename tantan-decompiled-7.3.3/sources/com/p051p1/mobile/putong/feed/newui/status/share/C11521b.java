package com.p051p1.mobile.putong.feed.newui.status.share;

import android.view.View;
import p153l.cmg;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11521b implements FeedGalleryLayoutManager.InterfaceC11516c {
    @Override // com.p051p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager.InterfaceC11516c
    /* JADX INFO: renamed from: a */
    public void mo67049a(FeedGalleryLayoutManager feedGalleryLayoutManager, View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float fAbs = 1.0f - (Math.abs(f) * 0.3f);
        if (cmg.m111169A()) {
            fAbs = 1.0f - (Math.abs(f) * 0.4f);
        }
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
