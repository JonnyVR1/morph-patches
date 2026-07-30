package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p151v.VImage;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ImageSticker extends VImage implements InterfaceC12899c {

    /* JADX INFO: renamed from: d */
    public float f49472d;

    /* JADX INFO: renamed from: e */
    public float f49473e;

    /* JADX INFO: renamed from: f */
    public String f49474f;

    /* JADX INFO: renamed from: g */
    public String f49475g;

    /* JADX INFO: renamed from: h */
    public String f49476h;

    /* JADX INFO: renamed from: i */
    public int f49477i;

    /* JADX INFO: renamed from: j */
    public int f49478j;

    public ImageSticker(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo73429C() {
        return new FrameLayout.LayoutParams(this.f49478j, this.f49477i);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: L */
    public boolean mo73430L() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: Q */
    public void mo73431Q(BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
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
                                CrashHelper.m82479c(e);
                                return;
                            }
                        }
                        this.f49477i = bitmapDecodeStream.getHeight();
                        this.f49478j = bitmapDecodeStream.getWidth();
                        setImageBitmap(bitmapDecodeStream);
                        fileInputStream2.close();
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        CrashHelper.m82479c(e);
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
                                CrashHelper.m82479c(e3);
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
            CrashHelper.m82479c(e5);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: T */
    public void mo73432T(BLiveAddStickerResult bLiveAddStickerResult, String str) {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: e */
    public void mo73433e(float f, float f2) {
        this.f49472d = f;
        this.f49473e = f2;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getCategory() {
        return this.f49476h;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getContent() {
        return "";
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getCustomId() {
        return this.f49475g;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public int getMaxCount() {
        return 0;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public Pair<Float, Float> getPosition() {
        ViewParent parent = getParent();
        if (parent instanceof LiveStickerContainer) {
            LiveStickerContainer liveStickerContainer = (LiveStickerContainer) parent;
            if (liveStickerContainer.getWidth() > 0 && liveStickerContainer.getHeight() > 0 && getWidth() > 0 && getHeight() > 0) {
                return new Pair<>(Float.valueOf(Math.round(((getLeft() + getTranslationX()) / liveStickerContainer.getWidth()) * 10000.0f) / 10000.0f), Float.valueOf(Math.round((((getTop() + getTranslationY()) - qa00.m175859d(154.0f)) / (liveStickerContainer.getHeight() - qa00.m175859d(154.0f))) * 10000.0f) / 10000.0f));
            }
        }
        return new Pair<>(Float.valueOf(this.f49472d), Float.valueOf(this.f49473e));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getTemplateId() {
        return this.f49474f;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public Pair<Integer, Integer> getTranslation() {
        return new Pair<>(Integer.valueOf((int) getTranslationX()), Integer.valueOf((int) getTranslationY()));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: n */
    public void mo73436n(int i) {
        setTranslationX(i + getTranslationX());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setCategory(String str) {
        this.f49476h = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setCustomId(String str) {
        this.f49475g = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setOnClickListener(final InterfaceC12899c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.skm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo73652a((InterfaceC12899c) view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC12899c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.rkm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo73653a((InterfaceC12899c) view, motionEvent);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setTemplateId(String str) {
        this.f49474f = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: v */
    public void mo73437v(int i) {
        setTranslationY(i + getTranslationY());
    }
}
