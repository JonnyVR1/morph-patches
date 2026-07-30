package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.wvj;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftSticker extends ConstraintLayout implements InterfaceC0325c {

    /* JADX INFO: renamed from: d */
    public VText f4657d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4658e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4659f;

    /* JADX INFO: renamed from: g */
    public float f4660g;

    /* JADX INFO: renamed from: h */
    public float f4661h;

    /* JADX INFO: renamed from: i */
    public String f4662i;

    /* JADX INFO: renamed from: j */
    public String f4663j;

    /* JADX INFO: renamed from: k */
    public String f4664k;

    /* JADX INFO: renamed from: l */
    public int f4665l;

    public GiftSticker(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo5719C() {
        return new FrameLayout.LayoutParams(-2, t100.d(60.0f));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: L */
    public boolean mo5720L() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: Q */
    public void mo5721Q(BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
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
                            this.f4657d.setBackgroundDrawable(new BitmapDrawable(bitmapDecodeStream));
                            fileInputStream2.close();
                        } else {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e) {
                                CrashHelper.c(e);
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        CrashHelper.c(e);
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
                                CrashHelper.c(e3);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    CrashHelper.c(e4);
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: T */
    public void mo5722T(BLiveAddStickerResult bLiveAddStickerResult, String str) {
        this.f4657d.setText(str);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: e */
    public void mo5723e(float f, float f2) {
        this.f4660g = f;
        this.f4661h = f2;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getCategory() {
        return this.f4664k;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getContent() {
        return this.f4657d.getText().toString();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getCustomId() {
        return this.f4663j;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public int getMaxCount() {
        return this.f4665l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public Pair<Float, Float> getPosition() {
        ViewParent parent = getParent();
        if (parent instanceof LiveStickerContainer) {
            LiveStickerContainer liveStickerContainer = (LiveStickerContainer) parent;
            if (liveStickerContainer.getWidth() > 0 && liveStickerContainer.getHeight() > 0 && getWidth() > 0 && getHeight() > 0) {
                return new Pair<>(Float.valueOf(Math.round(((getLeft() + getTranslationX()) / liveStickerContainer.getWidth()) * 10000.0f) / 10000.0f), Float.valueOf(Math.round((((getTop() + getTranslationY()) - t100.d(154.0f)) / (liveStickerContainer.getHeight() - t100.d(154.0f))) * 10000.0f) / 10000.0f));
            }
        }
        return new Pair<>(Float.valueOf(this.f4660g), Float.valueOf(this.f4661h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getTemplateId() {
        return this.f4662i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public Pair<Integer, Integer> getTranslation() {
        return new Pair<>(Integer.valueOf((int) getTranslationX()), Integer.valueOf((int) getTranslationY()));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m5724j0(View view) {
        wvj.m25504a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m5725k0(String str, String str2) {
        hxs.u("context_single_room", this.f4658e, str2, t100.d(38.0f), t100.d(38.0f));
        hxs.u("context_single_room", this.f4659f, str, t100.d(30.0f), t100.d(30.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: n */
    public void mo5726n(int i) {
        setTranslationX(i + getTranslationX());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5724j0(this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), i2);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setCategory(String str) {
        this.f4664k = str;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setCustomId(String str) {
        this.f4663j = str;
    }

    public void setGiftClick(View.OnClickListener onClickListener) {
        this.f4658e.setOnClickListener(onClickListener);
    }

    public void setGiftPosition(int i) {
        ViewGroup.LayoutParams aVar = new ConstraintLayout.a(t100.d(38.0f), t100.d(38.0f));
        if (i == 1) {
            ((ConstraintLayout.a) aVar).h = 0;
            ((ConstraintLayout.a) aVar).q = 0;
        } else if (i == 2) {
            ((ConstraintLayout.a) aVar).k = 0;
            ((ConstraintLayout.a) aVar).q = 0;
        } else if (i == 3) {
            ((ConstraintLayout.a) aVar).h = 0;
            ((ConstraintLayout.a) aVar).s = 0;
        } else {
            ((ConstraintLayout.a) aVar).k = 0;
            ((ConstraintLayout.a) aVar).s = 0;
        }
        this.f4658e.setLayoutParams(aVar);
    }

    public void setMaxCount(int i) {
        this.f4665l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setOnClickListener(final InterfaceC0325c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.svj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo5954a((InterfaceC0325c) view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC0325c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.rvj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo5955a((InterfaceC0325c) view, motionEvent);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setTemplateId(String str) {
        this.f4662i = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: v */
    public void mo5727v(int i) {
        setTranslationY(i + getTranslationY());
    }

    public GiftSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftSticker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
