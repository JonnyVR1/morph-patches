package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VFrame;
import p147v.VImage;
import p149l.cii0;
import p149l.d30;
import p149l.i3w;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yzc0;

/* JADX INFO: loaded from: classes10.dex */
public class LookUpView extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f38580a;

    /* JADX INFO: renamed from: b */
    public VImage f38581b;

    /* JADX INFO: renamed from: c */
    public TextView f38582c;

    /* JADX INFO: renamed from: d */
    public int f38583d;

    public LookUpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38583d = -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59542s(this);
        this.f38580a.setBackground(getResources().getDrawable(x2c0.f189556Mo));
        this.f38580a.setTextColor(getResources().getColor(w0c0.f183834b2));
    }

    /* JADX INFO: renamed from: s */
    public final void m59542s(View view) {
        i3w.m134303a(this, view);
    }

    public void setNumbersBackground(@DrawableRes int i) {
        if (this.f38583d != i) {
            this.f38583d = i;
            this.f38582c.setBackgroundResource(i);
        }
    }

    public void setText(String str) {
        if (NullChecker.m81303a(this.f38580a)) {
            this.f38580a.setText(str);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m59543u(final int i) {
        m59544v(i, i > 99 ? "99+" : String.format(Locale.getDefault(), "+%d", Integer.valueOf(i)));
        if (i <= 0) {
            m59545w(false);
            return;
        }
        if (yzc0.m216634b().m216639c() < i) {
            m59545w(true);
            cii0.m107078h(this.f38582c, new d30() { // from class: l.h3w
                @Override // p149l.d30
                public final void call() {
                    yzc0.m216634b().m216643k(i);
                }
            });
        } else {
            m59545w(true);
            xdl0.m208344M(this.f38582c, false);
            yzc0.m216634b().m216643k(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m59544v(int i, String str) {
        if (NullChecker.m81303a(this.f38582c)) {
            xdl0.m208344M(this.f38582c, i > 0);
            this.f38582c.setText(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m59545w(boolean z) {
        if (NullChecker.m81303a(this.f38581b)) {
            xdl0.m208344M(this.f38581b, z);
        }
    }

    public LookUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LookUpView(Context context) {
        this(context, null);
    }
}
