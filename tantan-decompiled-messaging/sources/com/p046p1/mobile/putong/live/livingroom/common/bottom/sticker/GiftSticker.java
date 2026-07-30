package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.t100;
import p149l.wvj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftSticker extends ConstraintLayout implements InterfaceC12736c {

    /* JADX INFO: renamed from: d */
    public VText f48615d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48616e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48617f;

    /* JADX INFO: renamed from: g */
    public float f48618g;

    /* JADX INFO: renamed from: h */
    public float f48619h;

    /* JADX INFO: renamed from: i */
    public String f48620i;

    /* JADX INFO: renamed from: j */
    public String f48621j;

    /* JADX INFO: renamed from: k */
    public String f48622k;

    /* JADX INFO: renamed from: l */
    public int f48623l;

    public GiftSticker(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo72246C() {
        return new FrameLayout.LayoutParams(-2, t100.m186890d(60.0f));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: L */
    public boolean mo72247L() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: Q */
    public void mo72248Q(BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        Rect rect = new Rect();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScreenDensity = getResources().getDisplayMetrics().densityDpi;
                        options.inDensity = 320;
                        options.inTargetDensity = getResources().getDisplayMetrics().densityDpi;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                        if (bitmapDecodeStream != null) {
                            this.f48615d.setBackgroundDrawable(new BitmapDrawable(bitmapDecodeStream));
                            fileInputStream2.close();
                        } else {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e) {
                                CrashHelper.m81296c(e);
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        CrashHelper.m81296c(e);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e3) {
                                CrashHelper.m81296c(e3);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    CrashHelper.m81296c(e4);
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: T */
    public void mo72249T(BLiveAddStickerResult bLiveAddStickerResult, String str) {
        this.f48615d.setText(str);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: e */
    public void mo72250e(float f, float f2) {
        this.f48618g = f;
        this.f48619h = f2;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getCategory() {
        return this.f48622k;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getContent() {
        return this.f48615d.getText().toString();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getCustomId() {
        return this.f48621j;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public int getMaxCount() {
        return this.f48623l;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public Pair<Float, Float> getPosition() {
        ViewParent parent = getParent();
        if (parent instanceof LiveStickerContainer) {
            LiveStickerContainer liveStickerContainer = (LiveStickerContainer) parent;
            if (liveStickerContainer.getWidth() > 0 && liveStickerContainer.getHeight() > 0 && getWidth() > 0 && getHeight() > 0) {
                return new Pair<>(Float.valueOf(Math.round(((getLeft() + getTranslationX()) / liveStickerContainer.getWidth()) * 10000.0f) / 10000.0f), Float.valueOf(Math.round((((getTop() + getTranslationY()) - t100.m186890d(154.0f)) / (liveStickerContainer.getHeight() - t100.m186890d(154.0f))) * 10000.0f) / 10000.0f));
            }
        }
        return new Pair<>(Float.valueOf(this.f48618g), Float.valueOf(this.f48619h));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getTemplateId() {
        return this.f48620i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public Pair<Integer, Integer> getTranslation() {
        return new Pair<>(Integer.valueOf((int) getTranslationX()), Integer.valueOf((int) getTranslationY()));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m72251j0(View view) {
        wvj.m205747a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m72252k0(String str, String str2) {
        hxs.m133408u("context_single_room", this.f48616e, str2, t100.m186890d(38.0f), t100.m186890d(38.0f));
        hxs.m133408u("context_single_room", this.f48617f, str, t100.m186890d(30.0f), t100.m186890d(30.0f));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: n */
    public void mo72253n(int i) {
        setTranslationX(i + getTranslationX());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72251j0(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), i2);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setCategory(String str) {
        this.f48622k = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setCustomId(String str) {
        this.f48621j = str;
    }

    public void setGiftClick(View.OnClickListener onClickListener) {
        this.f48616e.setOnClickListener(onClickListener);
    }

    public void setGiftPosition(int i) {
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(t100.m186890d(38.0f), t100.m186890d(38.0f));
        if (i == 1) {
            c0220a.f1251h = 0;
            c0220a.f1266q = 0;
        } else if (i == 2) {
            c0220a.f1257k = 0;
            c0220a.f1266q = 0;
        } else if (i == 3) {
            c0220a.f1251h = 0;
            c0220a.f1268s = 0;
        } else {
            c0220a.f1257k = 0;
            c0220a.f1268s = 0;
        }
        this.f48616e.setLayoutParams(c0220a);
    }

    public void setMaxCount(int i) {
        this.f48623l = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setOnClickListener(final InterfaceC12736c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.svj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo72469a((InterfaceC12736c) view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC12736c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.rvj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo72470a((InterfaceC12736c) view, motionEvent);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setTemplateId(String str) {
        this.f48620i = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: v */
    public void mo72254v(int i) {
        setTranslationY(i + getTranslationY());
    }

    public GiftSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftSticker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
