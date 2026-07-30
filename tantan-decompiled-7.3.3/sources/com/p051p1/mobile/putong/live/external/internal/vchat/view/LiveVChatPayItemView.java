package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
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
import p153l.rqu;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatPayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Group f46261d;

    /* JADX INFO: renamed from: e */
    public VImage f46262e;

    /* JADX INFO: renamed from: f */
    public VText f46263f;

    /* JADX INFO: renamed from: g */
    public VImage f46264g;

    /* JADX INFO: renamed from: h */
    public VRadioButton f46265h;

    public LiveVChatPayItemView(Context context) {
        super(context);
    }

    private void init() {
        this.f46264g.setOnClickListener(new View.OnClickListener() { // from class: l.qqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159042a.m70952j0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m70952j0(View view) {
        if (getContext() instanceof Act) {
            zrv.f205799a.m207681m0((Act) getContext());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70953i0(View view) {
        rqu.m182673a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m70954k0(PayMethod payMethod) {
        if (TEnum.equals(payMethod, zrv.f205799a.m207672i())) {
            this.f46262e.setImageResource(obc0.f146502t8);
            this.f46263f.setText(R$string.f47679Mb);
        } else if (TEnum.equals(payMethod, zrv.f205799a.m207670h())) {
            this.f46262e.setImageResource(obc0.f146514u8);
            this.f46263f.setText(R$string.f47555Gi);
        } else if (TEnum.equals(payMethod, zrv.f205799a.m207676k())) {
            this.f46262e.setImageResource(obc0.f146526v8);
            this.f46263f.setText(R$string.f47577Hi);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70953i0(this);
        init();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f46265h.setSelected(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f46263f.setTextColor(i);
    }

    public LiveVChatPayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatPayItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
