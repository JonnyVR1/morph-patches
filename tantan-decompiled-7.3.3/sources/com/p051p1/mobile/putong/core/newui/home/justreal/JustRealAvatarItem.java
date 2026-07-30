package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.User;
import p153l.qa00;
import p153l.uqb0;
import p153l.wlj;
import p153l.xlj;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealAvatarItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f23806a;

    /* JADX INFO: renamed from: b */
    public Paint f23807b;

    /* JADX INFO: renamed from: c */
    public float f23808c;

    public JustRealAvatarItem(@NonNull Context context) {
        super(context);
        m39634a();
    }

    /* JADX INFO: renamed from: a */
    public final void m39634a() {
        this.f23806a = new SimpleDraweeView(getContext());
        xlj xljVar = new xlj(getResources());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.m175859d(14.0f));
        roundingParams.m8322v(true);
        wlj wljVarM211638a = xljVar.m211636K(roundingParams).m211638a();
        wljVarM211638a.m207064y(0);
        this.f23806a.setHierarchy(wljVarM211638a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iM175859d = qa00.m175859d(1.0f);
        layoutParams.leftMargin = iM175859d;
        layoutParams.topMargin = iM175859d;
        layoutParams.rightMargin = iM175859d;
        layoutParams.bottomMargin = iM175859d;
        addView(this.f23806a, layoutParams);
        Paint paint = new Paint();
        this.f23807b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f23807b.setAntiAlias(true);
        this.f23807b.setColor(-3738881);
        float fM175859d = qa00.m175859d(1.5f);
        this.f23808c = fM175859d;
        this.f23807b.setStrokeWidth(fM175859d);
    }

    /* JADX INFO: renamed from: b */
    public void m39635b(User user) {
        this.f23806a.setAlpha(1.0f);
        uqb0.f180374G.m127115L0(this.f23806a, user.m61308fp().profileSmall().formatted());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.f23808c;
        canvas.drawRoundRect(f, f, getWidth() - this.f23808c, getHeight() - this.f23808c, getWidth() / 2, getWidth() / 2, this.f23807b);
    }

    public JustRealAvatarItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m39634a();
    }

    public JustRealAvatarItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m39634a();
    }
}
