package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
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
import l.t100;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ImageSticker extends VImage implements InterfaceC0325c {

    /* JADX INFO: renamed from: d */
    public float f4666d;

    /* JADX INFO: renamed from: e */
    public float f4667e;

    /* JADX INFO: renamed from: f */
    public String f4668f;

    /* JADX INFO: renamed from: g */
    public String f4669g;

    /* JADX INFO: renamed from: h */
    public String f4670h;

    /* JADX INFO: renamed from: i */
    public int f4671i;

    /* JADX INFO: renamed from: j */
    public int f4672j;

    public ImageSticker(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo5719C() {
        return new FrameLayout.LayoutParams(this.f4672j, this.f4671i);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: L */
    public boolean mo5720L() {
        return false;
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
                        if (bitmapDecodeStream == null) {
                            try {
                                fileInputStream2.close();
                                return;
                            } catch (IOException e) {
                                CrashHelper.c(e);
                                return;
                            }
                        }
                        this.f4671i = bitmapDecodeStream.getHeight();
                        this.f4672j = bitmapDecodeStream.getWidth();
                        setImageBitmap(bitmapDecodeStream);
                        fileInputStream2.close();
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

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: T */
    public void mo5722T(BLiveAddStickerResult bLiveAddStickerResult, String str) {
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: e */
    public void mo5723e(float f, float f2) {
        this.f4666d = f;
        this.f4667e = f2;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getCategory() {
        return this.f4670h;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getContent() {
        return "";
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getCustomId() {
        return this.f4669g;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public int getMaxCount() {
        return 0;
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
        return new Pair<>(Float.valueOf(this.f4666d), Float.valueOf(this.f4667e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public String getTemplateId() {
        return this.f4668f;
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

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setCategory(String str) {
        this.f4670h = str;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setCustomId(String str) {
        this.f4669g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setOnClickListener(final InterfaceC0325c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.pim
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
        setOnTouchListener(new View.OnTouchListener() { // from class: l.oim
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo5955a((InterfaceC0325c) view, motionEvent);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    public void setTemplateId(String str) {
        this.f4668f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c
    /* JADX INFO: renamed from: v */
    public void mo5727v(int i) {
        setTranslationY(i + getTranslationY());
    }
}
