package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p153l.bnl0;
import p153l.gsj0;
import p153l.q7y;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class MediaView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f17126c;

    /* JADX INFO: renamed from: d */
    public x20 f17127d;

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29467r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m29466R(View view) {
        if (NullChecker.m82486a(this.f17127d)) {
            this.f17127d.call();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m29467r() {
        setOrientation(1);
        m29468Q(LayoutInflater.from(getContext()), this);
        bnl0.m105509E0(this.f17126c, new View.OnClickListener() { // from class: l.p7y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150971a.m29466R(view);
            }
        });
        if (gsj0.m132062f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17126c.getLayoutParams();
            layoutParams.height = qa00.f156339z;
            this.f17126c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Q */
    public View m29468Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q7y.m175714b(this, layoutInflater, viewGroup);
    }

    public void setButtonText(String str) {
        if (!NullChecker.m82486a(this.f17126c) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f17126c.setText(str);
    }

    public void setClickListener(x20 x20Var) {
        this.f17127d = x20Var;
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaView(Context context) {
        this(context, null);
    }
}
