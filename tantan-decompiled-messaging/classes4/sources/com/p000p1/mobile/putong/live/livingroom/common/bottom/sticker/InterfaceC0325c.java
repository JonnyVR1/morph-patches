package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.graphics.Rect;
import android.util.Pair;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface InterfaceC0325c {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5954a(InterfaceC0325c interfaceC0325c);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo5955a(InterfaceC0325c interfaceC0325c, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: C */
    FrameLayout.LayoutParams mo5719C();

    /* JADX INFO: renamed from: L */
    boolean mo5720L();

    /* JADX INFO: renamed from: Q */
    void mo5721Q(BLiveAddStickerResult bLiveAddStickerResult, String str);

    /* JADX INFO: renamed from: T */
    void mo5722T(BLiveAddStickerResult bLiveAddStickerResult, String str);

    /* JADX INFO: renamed from: e */
    void mo5723e(float f, float f2);

    String getCategory();

    String getContent();

    String getCustomId();

    int getMaxCount();

    Pair<Float, Float> getPosition();

    Rect getSize();

    String getTemplateId();

    Pair<Integer, Integer> getTranslation();

    /* JADX INFO: renamed from: n */
    void mo5726n(int i);

    boolean performClick();

    void setCategory(String str);

    void setCustomId(String str);

    void setOnClickListener(a aVar);

    void setOnTouchListener(b bVar);

    void setTemplateId(String str);

    /* JADX INFO: renamed from: v */
    void mo5727v(int i);
}
