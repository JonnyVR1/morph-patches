package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.myj;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class GiftSticker extends ConstraintLayout implements InterfaceC12899c {

    /* JADX INFO: renamed from: d */
    public VText f49463d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49464e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49465f;

    /* JADX INFO: renamed from: g */
    public float f49466g;

    /* JADX INFO: renamed from: h */
    public float f49467h;

    /* JADX INFO: renamed from: i */
    public String f49468i;

    /* JADX INFO: renamed from: j */
    public String f49469j;

    /* JADX INFO: renamed from: k */
    public String f49470k;

    /* JADX INFO: renamed from: l */
    public int f49471l;

    public GiftSticker(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: C */
    public FrameLayout.LayoutParams mo73429C() {
        return new FrameLayout.LayoutParams(-2, qa00.m175859d(60.0f));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: L */
    public boolean mo73430L() {
        return true;
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
                        if (bitmapDecodeStream != null) {
                            this.f49463d.setBackgroundDrawable(new BitmapDrawable(bitmapDecodeStream));
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
                } catch (IOException e4) {
                    CrashHelper.m82479c(e4);
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: T */
    public void mo73432T(BLiveAddStickerResult bLiveAddStickerResult, String str) {
        this.f49463d.setText(str);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: e */
    public void mo73433e(float f, float f2) {
        this.f49466g = f;
        this.f49467h = f2;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getCategory() {
        return this.f49470k;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getContent() {
        return this.f49463d.getText().toString();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getCustomId() {
        return this.f49469j;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public int getMaxCount() {
        return this.f49471l;
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
        return new Pair<>(Float.valueOf(this.f49466g), Float.valueOf(this.f49467h));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public Rect getSize() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public String getTemplateId() {
        return this.f49468i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public Pair<Integer, Integer> getTranslation() {
        return new Pair<>(Integer.valueOf((int) getTranslationX()), Integer.valueOf((int) getTranslationY()));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m73434j0(View view) {
        myj.m160796a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m73435k0(String str, String str2) {
        izs.m142870u("context_single_room", this.f49464e, str2, qa00.m175859d(38.0f), qa00.m175859d(38.0f));
        izs.m142870u("context_single_room", this.f49465f, str, qa00.m175859d(30.0f), qa00.m175859d(30.0f));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: n */
    public void mo73436n(int i) {
        setTranslationX(i + getTranslationX());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73434j0(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), i2);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setCategory(String str) {
        this.f49470k = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setCustomId(String str) {
        this.f49469j = str;
    }

    public void setGiftClick(View.OnClickListener onClickListener) {
        this.f49464e.setOnClickListener(onClickListener);
    }

    public void setGiftPosition(int i) {
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(qa00.m175859d(38.0f), qa00.m175859d(38.0f));
        if (i == 1) {
            c0221a.f1251h = 0;
            c0221a.f1266q = 0;
        } else if (i == 2) {
            c0221a.f1257k = 0;
            c0221a.f1266q = 0;
        } else if (i == 3) {
            c0221a.f1251h = 0;
            c0221a.f1268s = 0;
        } else {
            c0221a.f1257k = 0;
            c0221a.f1268s = 0;
        }
        this.f49464e.setLayoutParams(c0221a);
    }

    public void setMaxCount(int i) {
        this.f49471l = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setOnClickListener(final InterfaceC12899c.a aVar) {
        setOnClickListener(new View.OnClickListener() { // from class: l.iyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.mo73652a((InterfaceC12899c) view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(final InterfaceC12899c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() { // from class: l.hyj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bVar.mo73653a((InterfaceC12899c) view, motionEvent);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    public void setTemplateId(String str) {
        this.f49468i = str;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c
    /* JADX INFO: renamed from: v */
    public void mo73437v(int i) {
        setTranslationY(i + getTranslationY());
    }

    public GiftSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftSticker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
