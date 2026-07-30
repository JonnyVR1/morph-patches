package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VRadioButton;
import p151v.VText;
import p153l.obc0;
import p153l.pk60;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class PayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Group f51764d;

    /* JADX INFO: renamed from: e */
    public VImage f51765e;

    /* JADX INFO: renamed from: f */
    public VText f51766f;

    /* JADX INFO: renamed from: g */
    public VImage f51767g;

    /* JADX INFO: renamed from: h */
    public VRadioButton f51768h;

    public PayItemView(Context context) {
        super(context);
    }

    private void init() {
        this.f51767g.setOnClickListener(new View.OnClickListener() { // from class: l.ok60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147736a.m76335j0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m76335j0(View view) {
        if (getContext() instanceof Act) {
            zrv.f205799a.m207681m0((Act) getContext());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76336i0(View view) {
        pk60.m172589a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m76337k0(PayMethod payMethod) {
        if (TEnum.equals(payMethod, zrv.f205799a.m207672i())) {
            this.f51765e.setImageResource(obc0.f146502t8);
            this.f51766f.setText(R$string.f47679Mb);
        } else if (TEnum.equals(payMethod, zrv.f205799a.m207670h())) {
            this.f51765e.setImageResource(obc0.f146514u8);
            this.f51766f.setText(R$string.f47555Gi);
        } else if (TEnum.equals(payMethod, zrv.f205799a.m207676k())) {
            this.f51765e.setImageResource(obc0.f146526v8);
            this.f51766f.setText(R$string.f47577Hi);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76336i0(this);
        init();
    }

    public void setCheckBoxStyle(Drawable drawable) {
        this.f51768h.setBackground(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f51768h.setSelected(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f51766f.setTextColor(i);
    }

    public PayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
