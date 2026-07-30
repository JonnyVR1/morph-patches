package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VFrame;
import p151v.VImage;
import p153l.b8d0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cri0;
import p153l.dbc0;
import p153l.g5w;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class LookUpView extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f39428a;

    /* JADX INFO: renamed from: b */
    public VImage f39429b;

    /* JADX INFO: renamed from: c */
    public TextView f39430c;

    /* JADX INFO: renamed from: d */
    public int f39431d;

    public LookUpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39431d = -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60726s(this);
        this.f39428a.setBackground(getResources().getDrawable(dbc0.f86002Ap));
        this.f39428a.setTextColor(getResources().getColor(c9c0.f80407c2));
    }

    /* JADX INFO: renamed from: s */
    public final void m60726s(View view) {
        g5w.m129075a(this, view);
    }

    public void setNumbersBackground(@DrawableRes int i) {
        if (this.f39431d != i) {
            this.f39431d = i;
            this.f39430c.setBackgroundResource(i);
        }
    }

    public void setText(String str) {
        if (NullChecker.m82486a(this.f39428a)) {
            this.f39428a.setText(str);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m60727u(final int i) {
        m60728v(i, i > 99 ? "99+" : String.format(Locale.getDefault(), "+%d", Integer.valueOf(i)));
        if (i <= 0) {
            m60729w(false);
            return;
        }
        if (b8d0.m102963b().m102968c() < i) {
            m60729w(true);
            cri0.m112078h(this.f39430c, new x20() { // from class: l.f5w
                @Override // p153l.x20
                public final void call() {
                    b8d0.m102963b().m102972k(i);
                }
            });
        } else {
            m60729w(true);
            bnl0.m105524M(this.f39430c, false);
            b8d0.m102963b().m102972k(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m60728v(int i, String str) {
        if (NullChecker.m82486a(this.f39430c)) {
            bnl0.m105524M(this.f39430c, i > 0);
            this.f39430c.setText(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m60729w(boolean z) {
        if (NullChecker.m82486a(this.f39429b)) {
            bnl0.m105524M(this.f39429b, z);
        }
    }

    public LookUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LookUpView(Context context) {
        this(context, null);
    }
}
