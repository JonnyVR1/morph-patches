package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
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
import p149l.qou;
import p149l.ypv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatPayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Group f45413d;

    /* JADX INFO: renamed from: e */
    public VImage f45414e;

    /* JADX INFO: renamed from: f */
    public VText f45415f;

    /* JADX INFO: renamed from: g */
    public VImage f45416g;

    /* JADX INFO: renamed from: h */
    public VRadioButton f45417h;

    public LiveVChatPayItemView(Context context) {
        super(context);
    }

    private void init() {
        this.f45416g.setOnClickListener(new View.OnClickListener() { // from class: l.pou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150562a.m69769j0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m69769j0(View view) {
        if (getContext() instanceof Act) {
            ypv.f199493a.m199359m0((Act) getContext());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69770i0(View view) {
        qou.m175772a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m69771k0(PayMethod payMethod) {
        if (TEnum.equals(payMethod, ypv.f199493a.m199350i())) {
            this.f45414e.setImageResource(i3c0.f111174t8);
            this.f45415f.setText(R$string.f46831Mb);
        } else if (TEnum.equals(payMethod, ypv.f199493a.m199348h())) {
            this.f45414e.setImageResource(i3c0.f111186u8);
            this.f45415f.setText(R$string.f46707Gi);
        } else if (TEnum.equals(payMethod, ypv.f199493a.m199354k())) {
            this.f45414e.setImageResource(i3c0.f111198v8);
            this.f45415f.setText(R$string.f46729Hi);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69770i0(this);
        init();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f45417h.setSelected(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f45415f.setTextColor(i);
    }

    public LiveVChatPayItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatPayItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
