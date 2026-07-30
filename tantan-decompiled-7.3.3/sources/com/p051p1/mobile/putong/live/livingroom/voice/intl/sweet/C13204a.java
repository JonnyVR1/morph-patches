package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet;

import android.view.View;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.a */
/* JADX INFO: loaded from: classes10.dex */
public class C13204a implements SweetGalleryLayoutManager.InterfaceC13200c {
    @Override // com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13200c
    /* JADX INFO: renamed from: a */
    public void mo79672a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float fAbs = 1.0f - (Math.abs(f) * 0.3f);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        view.setAlpha(1.0f - (Math.abs(f) * 0.6f));
    }
}
