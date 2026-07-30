package com.p051p1.mobile.putong.core.newui.intlmeet.frag;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Frag;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.ofo;
import p153l.qa00;
import p153l.vs9;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFragTabBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public FrameLayout f24943a;

    /* JADX INFO: renamed from: b */
    public VText f24944b;

    /* JADX INFO: renamed from: c */
    public VLinear f24945c;

    /* JADX INFO: renamed from: d */
    public VText f24946d;

    /* JADX INFO: renamed from: e */
    public VText f24947e;

    /* JADX INFO: renamed from: f */
    public int f24948f;

    /* JADX INFO: renamed from: g */
    public final int f24949g;

    /* JADX INFO: renamed from: h */
    public final int f24950h;

    /* JADX INFO: renamed from: i */
    public int f24951i;

    /* JADX INFO: renamed from: j */
    public int f24952j;

    public IntlMeetFragTabBar(Context context) {
        super(context);
        this.f24948f = 0;
        this.f24949g = 0;
        this.f24950h = 1;
        this.f24951i = qa00.m175859d(44.0f);
        this.f24952j = 0;
        m40365v(context);
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#CC000000");
        int color2 = Color.parseColor("#66000000");
        if (i == 0) {
            this.f24944b.setTextColor(color);
            this.f24944b.setTypeface(Typeface.defaultFromStyle(1));
            this.f24944b.setText(vs9.m202574N(this.f24944b.getText().toString(), Color.parseColor("#FE7E1D"), Typeface.DEFAULT_BOLD));
            this.f24944b.setTextColor(color);
            this.f24946d.setTypeface(Typeface.defaultFromStyle(0));
            this.f24946d.setTextColor(color2);
            return;
        }
        if (i == 1) {
            String string = this.f24944b.getText().toString();
            this.f24944b.setTypeface(Typeface.defaultFromStyle(0));
            this.f24944b.setText(string);
            this.f24944b.setTextColor(color2);
            this.f24946d.setTypeface(Typeface.defaultFromStyle(1));
            this.f24946d.setTextColor(color);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m40365v(Context context) {
        addView(m40370u(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m40366B(z20 z20Var, View view) {
        if (this.f24948f == 1) {
            return;
        }
        z20Var.call(1, Boolean.valueOf(bnl0.m105529O0(this.f24947e)));
        m40368E(1);
    }

    /* JADX INFO: renamed from: C */
    public void m40367C(String str) {
        this.f24944b.setText(str);
        setBarStyle(this.f24948f);
    }

    /* JADX INFO: renamed from: E */
    public void m40368E(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        m40369F(i);
        if (i != this.f24948f) {
            this.f24948f = i;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m40369F(int i) {
        if (i == 1 || this.f24952j <= 0) {
            bnl0.m105524M(this.f24947e, false);
        } else if (this.f24948f != 1) {
            bnl0.m105524M(this.f24947e, true);
            VText vText = this.f24947e;
            int i2 = this.f24952j;
            vText.setText(i2 > 99 ? "99+" : String.valueOf(i2));
        }
    }

    public void setNewVisitorCount(int i) {
        this.f24952j = i;
        m40369F(this.f24948f);
    }

    /* JADX INFO: renamed from: u */
    public View m40370u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofo.m167469b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public void m40371w(Frag frag, @NonNull final z20<Integer, Boolean> z20Var) {
        setBarStyle(0);
        bnl0.m105509E0(this.f24944b, new View.OnClickListener() { // from class: l.mfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136660a.m40372z(z20Var, view);
            }
        });
        bnl0.m105509E0(this.f24946d, new View.OnClickListener() { // from class: l.nfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141749a.m40366B(z20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m40372z(z20 z20Var, View view) {
        if (this.f24948f == 0) {
            return;
        }
        z20Var.call(0, Boolean.FALSE);
        m40368E(0);
    }

    public IntlMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24948f = 0;
        this.f24949g = 0;
        this.f24950h = 1;
        this.f24951i = qa00.m175859d(44.0f);
        this.f24952j = 0;
        m40365v(context);
    }

    public IntlMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24948f = 0;
        this.f24949g = 0;
        this.f24950h = 1;
        this.f24951i = qa00.m175859d(44.0f);
        this.f24952j = 0;
        m40365v(context);
    }
}
