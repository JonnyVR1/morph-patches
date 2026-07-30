package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.data.User;
import l.djj;
import l.ejj;
import l.qib0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealAvatarItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f1842a;

    /* JADX INFO: renamed from: b */
    public Paint f1843b;

    /* JADX INFO: renamed from: c */
    public float f1844c;

    public JustRealAvatarItem(@NonNull Context context) {
        super(context);
        m2617a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2617a() {
        this.f1842a = new SimpleDraweeView(getContext());
        ejj ejjVar = new ejj(getResources());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.d(14.0f));
        roundingParams.v(true);
        djj djjVarA = ejjVar.K(roundingParams).a();
        djjVarA.y(0);
        this.f1842a.setHierarchy(djjVarA);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iD = t100.d(1.0f);
        layoutParams.leftMargin = iD;
        layoutParams.topMargin = iD;
        layoutParams.rightMargin = iD;
        layoutParams.bottomMargin = iD;
        addView(this.f1842a, layoutParams);
        Paint paint = new Paint();
        this.f1843b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f1843b.setAntiAlias(true);
        this.f1843b.setColor(-3738881);
        float fD = t100.d(1.5f);
        this.f1844c = fD;
        this.f1843b.setStrokeWidth(fD);
    }

    /* JADX INFO: renamed from: b */
    public void m2618b(User user) {
        this.f1842a.setAlpha(1.0f);
        qib0.G.L0(this.f1842a, user.fp().profileSmall().formatted());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.f1844c;
        canvas.drawRoundRect(f, f, getWidth() - this.f1844c, getHeight() - this.f1844c, getWidth() / 2, getWidth() / 2, this.f1843b);
    }

    public JustRealAvatarItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2617a();
    }

    public JustRealAvatarItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2617a();
    }
}
