package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.User;
import p149l.djj;
import p149l.ejj;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealAvatarItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f23064a;

    /* JADX INFO: renamed from: b */
    public Paint f23065b;

    /* JADX INFO: renamed from: c */
    public float f23066c;

    public JustRealAvatarItem(@NonNull Context context) {
        super(context);
        m38631a();
    }

    /* JADX INFO: renamed from: a */
    public final void m38631a() {
        this.f23064a = new SimpleDraweeView(getContext());
        ejj ejjVar = new ejj(getResources());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.m186890d(14.0f));
        roundingParams.m8268v(true);
        djj djjVarM116872a = ejjVar.m116870K(roundingParams).m116872a();
        djjVarM116872a.m112078y(0);
        this.f23064a.setHierarchy(djjVarM116872a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iM186890d = t100.m186890d(1.0f);
        layoutParams.leftMargin = iM186890d;
        layoutParams.topMargin = iM186890d;
        layoutParams.rightMargin = iM186890d;
        layoutParams.bottomMargin = iM186890d;
        addView(this.f23064a, layoutParams);
        Paint paint = new Paint();
        this.f23065b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f23065b.setAntiAlias(true);
        this.f23065b.setColor(-3738881);
        float fM186890d = t100.m186890d(1.5f);
        this.f23066c = fM186890d;
        this.f23065b.setStrokeWidth(fM186890d);
    }

    /* JADX INFO: renamed from: b */
    public void m38632b(User user) {
        this.f23064a.setAlpha(1.0f);
        qib0.f154691G.m102331L0(this.f23064a, user.m60124fp().profileSmall().formatted());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.f23066c;
        canvas.drawRoundRect(f, f, getWidth() - this.f23066c, getHeight() - this.f23066c, getWidth() / 2, getWidth() / 2, this.f23065b);
    }

    public JustRealAvatarItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m38631a();
    }

    public JustRealAvatarItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m38631a();
    }
}
