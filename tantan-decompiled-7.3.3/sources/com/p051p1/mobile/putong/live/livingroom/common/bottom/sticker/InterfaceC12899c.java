package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.graphics.Rect;
import android.util.Pair;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12899c {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo73652a(InterfaceC12899c interfaceC12899c);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo73653a(InterfaceC12899c interfaceC12899c, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: C */
    FrameLayout.LayoutParams mo73429C();

    /* JADX INFO: renamed from: L */
    boolean mo73430L();

    /* JADX INFO: renamed from: Q */
    void mo73431Q(BLiveAddStickerResult bLiveAddStickerResult, String str);

    /* JADX INFO: renamed from: T */
    void mo73432T(BLiveAddStickerResult bLiveAddStickerResult, String str);

    /* JADX INFO: renamed from: e */
    void mo73433e(float f, float f2);

    String getCategory();

    String getContent();

    String getCustomId();

    int getMaxCount();

    Pair<Float, Float> getPosition();

    Rect getSize();

    String getTemplateId();

    Pair<Integer, Integer> getTranslation();

    /* JADX INFO: renamed from: n */
    void mo73436n(int i);

    boolean performClick();

    void setCategory(String str);

    void setCustomId(String str);

    void setOnClickListener(a aVar);

    void setOnTouchListener(b bVar);

    void setTemplateId(String str);

    /* JADX INFO: renamed from: v */
    void mo73437v(int i);
}
