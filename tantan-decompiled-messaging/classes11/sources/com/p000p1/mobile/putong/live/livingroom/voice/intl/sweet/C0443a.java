package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet;

import android.view.View;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0443a implements SweetGalleryLayoutManager.InterfaceC0439c {
    @Override // com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC0439c
    /* JADX INFO: renamed from: a */
    public void mo8698a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float fAbs = 1.0f - (Math.abs(f) * 0.3f);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        view.setAlpha(1.0f - (Math.abs(f) * 0.6f));
    }
}
