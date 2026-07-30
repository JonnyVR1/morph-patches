package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VRadioButton;
import p147v.VText;
import p149l.i3c0;
import p149l.kc60;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class PayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Group f50916d;

    /* JADX INFO: renamed from: e */
    public VImage f50917e;

    /* JADX INFO: renamed from: f */
    public VText f50918f;

    /* JADX INFO: renamed from: g */
    public VImage f50919g;

    /* JADX INFO: renamed from: h */
    public VRadioButton f50920h;

    public PayItemView(Context context) {
        super(context);
    }

    private void init() {
        this.f50919g.setOnClickListener(new View.OnClickListener() { // from class: l.jc60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117266a.m75152j0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m75152j0(View view) {
        if (getContext() instanceof Act) {
            ypv.f199493a.m199359m0((Act) getContext());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75153i0(View view) {
        kc60.m145347a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m75154k0(PayMethod payMethod) {
        if (TEnum.equals(payMethod, ypv.f199493a.m199350i())) {
            this.f50917e.setImageResource(i3c0.f111174t8);
            this.f50918f.setText(R$string.f46831Mb);
        } else if (TEnum.equals(payMethod, ypv.f199493a.m199348h())) {
            this.f50917e.setImageResource(i3c0.f111186u8);
            this.f50918f.setText(R$string.f46707Gi);
        } else if (TEnum.equals(payMethod, ypv.f199493a.m199354k())) {
            this.f50917e.setImageResource(i3c0.f111198v8);
            this.f50918f.setText(R$string.f46729Hi);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75153i0(this);
        init();
    }

    public void setCheckBoxStyle(Drawable drawable) {
        this.f50920h.setBackground(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f50920h.setSelected(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f50918f.setTextColor(i);
    }

    public PayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
