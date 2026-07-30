package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import l.e51;
import l.t100;
import l.xdl0;
import l.xj40;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class InteractiveSticker extends VText implements InterfaceC0325c {

    /* JADX INFO: renamed from: i */
    public float f4673i;

    /* JADX INFO: renamed from: j */
    public float f4674j;

    /* JADX INFO: renamed from: k */
    public String f4675k;

    /* JADX INFO: renamed from: l */
    public String f4676l;

    /* JADX INFO: renamed from: m */
    public String f4677m;

    /* JADX INFO: renamed from: n */
    public int f4678n;

    /* JADX INFO: renamed from: o */
    public int f4679o;

    /* JADX INFO: renamed from: p */
    public String f4680p;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractiveSticker(Context context) {
        super(context);
        setTextSize(14.0f);
        setTextColor(-16777216);
        setGravity(17);
        setSingleLine();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo5719C() {
        int i = this.f4679o;
        if (i == 0) {
            i = -2;
        }
        return new FrameLayout.LayoutParams(-2, i);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: L */
    public boolean mo5720L() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: Q */
    public void mo5721Q(final BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        this.f4680p = str;
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
                        final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                        if (bitmapDecodeStream != null) {
                            this.f4679o = bitmapDecodeStream.getHeight();
                            e51.H(getContext(), new Runnable() { // from class: l.wwm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f22025a.m5733q(bitmapDecodeStream, bLiveAddStickerResult);
                                }
                            }, 50L);
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
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            CrashHelper.c(e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: T */
    public void mo5722T(BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        setText(str);
        if (TextUtils.isEmpty(this.f4680p)) {
            return;
        }
        mo5721Q(bLiveAddStickerResult, this.f4680p);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: e */
    public void mo5723e(float f, float f2) {
        this.f4673i = f;
        this.f4674j = f2;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getCategory() {
        return this.f4677m;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getContent() {
        return getText().toString();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getCustomId() {
        return this.f4676l;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public int getMaxCount() {
        return this.f4678n;
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
        return new Pair<>(Float.valueOf(this.f4673i), Float.valueOf(this.f4674j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getTemplateId() {
        return this.f4675k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public Pair<Integer, Integer> getTranslation() {
        return new Pair<>(Integer.valueOf((int) getTranslationX()), Integer.valueOf((int) getTranslationY()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: n */
    public void mo5726n(int i) {
        setTranslationX(i + getTranslationX());
    }

    public void onMeasure(int i, int i2) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m5733q(Bitmap bitmap, BLiveAddStickerResult bLiveAddStickerResult) {
        xj40.b(this, bitmap, bLiveAddStickerResult);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setCategory(String str) {
        this.f4677m = str;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setCustomId(String str) {
        this.f4676l = str;
    }

    public void setMaxCount(int i) {
        this.f4678n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setOnClickListener(final InterfaceC0325c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.vwm
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
        setOnTouchListener(new View.OnTouchListener() { // from class: l.uwm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo5955a((InterfaceC0325c) view, motionEvent);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setTemplateId(String str) {
        this.f4675k = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: v */
    public void mo5727v(int i) {
        setTranslationY(i + getTranslationY());
    }
}
