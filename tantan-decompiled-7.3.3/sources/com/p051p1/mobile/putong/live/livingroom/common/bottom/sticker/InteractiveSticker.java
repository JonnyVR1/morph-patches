package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p151v.VText;
import p153l.bnl0;
import p153l.l51;
import p153l.ls40;
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class InteractiveSticker extends VText implements InterfaceC12899c {

    /* JADX INFO: renamed from: i */
    public float f49479i;

    /* JADX INFO: renamed from: j */
    public float f49480j;

    /* JADX INFO: renamed from: k */
    public String f49481k;

    /* JADX INFO: renamed from: l */
    public String f49482l;

    /* JADX INFO: renamed from: m */
    public String f49483m;

    /* JADX INFO: renamed from: n */
    public int f49484n;

    /* JADX INFO: renamed from: o */
    public int f49485o;

    /* JADX INFO: renamed from: p */
    public String f49486p;

    public InteractiveSticker(Context context) {
        super(context);
        setTextSize(14.0f);
        setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        setGravity(17);
        setSingleLine();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo73429C() {
        int i = this.f49485o;
        if (i == 0) {
            i = -2;
        }
        return new FrameLayout.LayoutParams(-2, i);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: L */
    public boolean mo73430L() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: Q */
    public void mo73431Q(final BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        this.f49486p = str;
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
                            this.f49485o = bitmapDecodeStream.getHeight();
                            l51.m152888H(getContext(), new Runnable() { // from class: l.xym
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f196765a.m73443q(bitmapDecodeStream, bLiveAddStickerResult);
                                }
                            }, 50L);
                            fileInputStream2.close();
                        } else {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e) {
                                CrashHelper.m82479c(e);
                            }
                        }
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
    public void mo73432T(BLiveAddStickerResult bLiveAddStickerResult, String str) throws Throwable {
        setText(str);
        if (TextUtils.isEmpty(this.f49486p)) {
            return;
        }
        mo73431Q(bLiveAddStickerResult, this.f49486p);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: e */
    public void mo73433e(float f, float f2) {
        this.f49479i = f;
        this.f49480j = f2;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getCategory() {
        return this.f49483m;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getContent() {
        return getText().toString();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getCustomId() {
        return this.f49482l;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public int getMaxCount() {
        return this.f49484n;
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
        return new Pair<>(Float.valueOf(this.f49479i), Float.valueOf(this.f49480j));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getTemplateId() {
        return this.f49481k;
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), i2);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m73443q(Bitmap bitmap, BLiveAddStickerResult bLiveAddStickerResult) {
        ls40.m155674b(this, bitmap, bLiveAddStickerResult);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setCategory(String str) {
        this.f49483m = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setCustomId(String str) {
        this.f49482l = str;
    }

    public void setMaxCount(int i) {
        this.f49484n = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setOnClickListener(final InterfaceC12899c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.wym
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo73652a((InterfaceC12899c) view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC12899c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.vym
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo73653a((InterfaceC12899c) view, motionEvent);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setTemplateId(String str) {
        this.f49481k = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: v */
    public void mo73437v(int i) {
        setTranslationY(i + getTranslationY());
    }
}
