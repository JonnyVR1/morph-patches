package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.graphics.Rect;
import android.util.Pair;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12736c {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo72469a(InterfaceC12736c interfaceC12736c);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo72470a(InterfaceC12736c interfaceC12736c, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: C */
    FrameLayout.LayoutParams mo72246C();

    /* JADX INFO: renamed from: L */
    boolean mo72247L();

    /* JADX INFO: renamed from: Q */
    void mo72248Q(BLiveAddStickerResult bLiveAddStickerResult, String str);

    /* JADX INFO: renamed from: T */
    void mo72249T(BLiveAddStickerResult bLiveAddStickerResult, String str);

    /* JADX INFO: renamed from: e */
    void mo72250e(float f, float f2);

    String getCategory();

    String getContent();

    String getCustomId();

    int getMaxCount();

    Pair<Float, Float> getPosition();

    Rect getSize();

    String getTemplateId();

    Pair<Integer, Integer> getTranslation();

    /* JADX INFO: renamed from: n */
    void mo72253n(int i);

    boolean performClick();

    void setCategory(String str);

    void setCustomId(String str);

    void setOnClickListener(a aVar);

    void setOnTouchListener(b bVar);

    void setTemplateId(String str);

    /* JADX INFO: renamed from: v */
    void mo72254v(int i);
}
