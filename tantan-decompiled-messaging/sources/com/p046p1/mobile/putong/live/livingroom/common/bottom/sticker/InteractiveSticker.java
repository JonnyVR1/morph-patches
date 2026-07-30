package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p147v.VText;
import p149l.e51;
import p149l.t100;
import p149l.xdl0;
import p149l.xj40;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class InteractiveSticker extends VText implements InterfaceC12736c {

    /* JADX INFO: renamed from: i */
    public float f48631i;

    /* JADX INFO: renamed from: j */
    public float f48632j;

    /* JADX INFO: renamed from: k */
    public String f48633k;

    /* JADX INFO: renamed from: l */
    public String f48634l;

    /* JADX INFO: renamed from: m */
    public String f48635m;

    /* JADX INFO: renamed from: n */
    public int f48636n;

    /* JADX INFO: renamed from: o */
    public int f48637o;

    /* JADX INFO: renamed from: p */
    public String f48638p;

    public InteractiveSticker(Context context) {
        super(context);
        setTextSize(14.0f);
        setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        setGravity(17);
        setSingleLine();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo72246C() {
        int i = this.f48637o;
        if (i == 0) {
            i = -2;
        }
        return new FrameLayout.LayoutParams(-2, i);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: L */
    public boolean mo72247L() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: Q */
    public void mo72248Q(final BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        this.f48638p = str;
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
                            this.f48637o = bitmapDecodeStream.getHeight();
                            e51.m114743H(getContext(), new Runnable() { // from class: l.wwm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f188385a.m72260q(bitmapDecodeStream, bLiveAddStickerResult);
                                }
                            }, 50L);
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
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            CrashHelper.m81296c(e5);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: T */
    public void mo72249T(BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        setText(str);
        if (TextUtils.isEmpty(this.f48638p)) {
            return;
        }
        mo72248Q(bLiveAddStickerResult, this.f48638p);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: e */
    public void mo72250e(float f, float f2) {
        this.f48631i = f;
        this.f48632j = f2;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getCategory() {
        return this.f48635m;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getContent() {
        return getText().toString();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getCustomId() {
        return this.f48634l;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public int getMaxCount() {
        return this.f48636n;
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
        return new Pair<>(Float.valueOf(this.f48631i), Float.valueOf(this.f48632j));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getTemplateId() {
        return this.f48633k;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public Pair<Integer, Integer> getTranslation() {
        return new Pair<>(Integer.valueOf((int) getTranslationX()), Integer.valueOf((int) getTranslationY()));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: n */
    public void mo72253n(int i) {
        setTranslationX(i + getTranslationX());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), i2);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m72260q(Bitmap bitmap, BLiveAddStickerResult bLiveAddStickerResult) {
        xj40.m209685b(this, bitmap, bLiveAddStickerResult);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setCategory(String str) {
        this.f48635m = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setCustomId(String str) {
        this.f48634l = str;
    }

    public void setMaxCount(int i) {
        this.f48636n = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setOnClickListener(final InterfaceC12736c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.vwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo72469a((InterfaceC12736c) view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC12736c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.uwm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo72470a((InterfaceC12736c) view, motionEvent);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setTemplateId(String str) {
        this.f48633k = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: v */
    public void mo72254v(int i) {
        setTranslationY(i + getTranslationY());
    }
}
