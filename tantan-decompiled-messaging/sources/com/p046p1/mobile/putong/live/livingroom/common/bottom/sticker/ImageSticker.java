package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p147v.VImage;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class ImageSticker extends VImage implements InterfaceC12736c {

    /* JADX INFO: renamed from: d */
    public float f48624d;

    /* JADX INFO: renamed from: e */
    public float f48625e;

    /* JADX INFO: renamed from: f */
    public String f48626f;

    /* JADX INFO: renamed from: g */
    public String f48627g;

    /* JADX INFO: renamed from: h */
    public String f48628h;

    /* JADX INFO: renamed from: i */
    public int f48629i;

    /* JADX INFO: renamed from: j */
    public int f48630j;

    public ImageSticker(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo72246C() {
        return new FrameLayout.LayoutParams(this.f48630j, this.f48629i);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: L */
    public boolean mo72247L() {
        return false;
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
                        if (bitmapDecodeStream == null) {
                            try {
                                fileInputStream2.close();
                                return;
                            } catch (IOException e) {
                                CrashHelper.m81296c(e);
                                return;
                            }
                        }
                        this.f48629i = bitmapDecodeStream.getHeight();
                        this.f48630j = bitmapDecodeStream.getWidth();
                        setImageBitmap(bitmapDecodeStream);
                        fileInputStream2.close();
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
    public void mo72249T(BLiveAddStickerResult bLiveAddStickerResult, String str) {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: e */
    public void mo72250e(float f, float f2) {
        this.f48624d = f;
        this.f48625e = f2;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getCategory() {
        return this.f48628h;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getContent() {
        return "";
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getCustomId() {
        return this.f48627g;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public int getMaxCount() {
        return 0;
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
        return new Pair<>(Float.valueOf(this.f48624d), Float.valueOf(this.f48625e));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public String getTemplateId() {
        return this.f48626f;
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

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setCategory(String str) {
        this.f48628h = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setCustomId(String str) {
        this.f48627g = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setOnClickListener(final InterfaceC12736c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.pim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo72469a((InterfaceC12736c) view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC12736c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.oim
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo72470a((InterfaceC12736c) view, motionEvent);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    public void setTemplateId(String str) {
        this.f48626f = str;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c
    /* JADX INFO: renamed from: v */
    public void mo72254v(int i) {
        setTranslationY(i + getTranslationY());
    }
}
