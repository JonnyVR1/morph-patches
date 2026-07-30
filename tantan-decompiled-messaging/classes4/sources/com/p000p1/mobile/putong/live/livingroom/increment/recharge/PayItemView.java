package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.ypv;
import p002l.i3c0;
import p002l.kc60;
import v.VImage;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Group f6958d;

    /* JADX INFO: renamed from: e */
    public VImage f6959e;

    /* JADX INFO: renamed from: f */
    public VText f6960f;

    /* JADX INFO: renamed from: g */
    public VImage f6961g;

    /* JADX INFO: renamed from: h */
    public VRadioButton f6962h;

    public PayItemView(Context context) {
        super(context);
    }

    private void init() {
        this.f6961g.setOnClickListener(new View.OnClickListener() { // from class: l.jc60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13677a.m8768j0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m8768j0(View view) {
        if (getContext() instanceof Act) {
            ypv.a.m0(getContext());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8769i0(View view) {
        kc60.m16599a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m8770k0(PayMethod payMethod) {
        if (TEnum.equals(payMethod, ypv.a.i())) {
            this.f6959e.setImageResource(i3c0.f12959t8);
            this.f6960f.setText(R$string.f2873Mb);
        } else if (TEnum.equals(payMethod, ypv.a.h())) {
            this.f6959e.setImageResource(i3c0.f12971u8);
            this.f6960f.setText(R$string.f2749Gi);
        } else if (TEnum.equals(payMethod, ypv.a.k())) {
            this.f6959e.setImageResource(i3c0.f12983v8);
            this.f6960f.setText(R$string.f2771Hi);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8769i0(this);
        init();
    }

    public void setCheckBoxStyle(Drawable drawable) {
        this.f6962h.setBackground(drawable);
    }

    public void setSelected(boolean z) {
        this.f6962h.setSelected(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f6960f.setTextColor(i);
    }

    public PayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
