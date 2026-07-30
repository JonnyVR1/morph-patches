package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.cii0;
import l.d30;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.yzc0;
import p003l.i3w;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LookUpView extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f2522a;

    /* JADX INFO: renamed from: b */
    public VImage f2523b;

    /* JADX INFO: renamed from: c */
    public TextView f2524c;

    /* JADX INFO: renamed from: d */
    public int f2525d;

    public LookUpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2525d = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4951s(this);
        this.f2522a.setBackground(getResources().getDrawable(x2c0.Mo));
        this.f2522a.setTextColor(getResources().getColor(w0c0.b2));
    }

    /* JADX INFO: renamed from: s */
    public final void m4951s(View view) {
        i3w.m7126a(this, view);
    }

    public void setNumbersBackground(@DrawableRes int i) {
        if (this.f2525d != i) {
            this.f2525d = i;
            this.f2524c.setBackgroundResource(i);
        }
    }

    public void setText(String str) {
        if (NullChecker.a(this.f2522a)) {
            this.f2522a.setText(str);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m4952u(final int i) {
        m4953v(i, i > 99 ? "99+" : String.format(Locale.getDefault(), "+%d", Integer.valueOf(i)));
        if (i <= 0) {
            m4954w(false);
            return;
        }
        if (yzc0.b().c() < i) {
            m4954w(true);
            cii0.h(this.f2524c, new d30() { // from class: l.h3w
                public final void call() {
                    yzc0.b().k(i);
                }
            });
        } else {
            m4954w(true);
            xdl0.M(this.f2524c, false);
            yzc0.b().k(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4953v(int i, String str) {
        if (NullChecker.a(this.f2524c)) {
            xdl0.M(this.f2524c, i > 0);
            this.f2524c.setText(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m4954w(boolean z) {
        if (NullChecker.a(this.f2523b)) {
            xdl0.M(this.f2523b, z);
        }
    }

    public LookUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LookUpView(Context context) {
        this(context, null);
    }
}
