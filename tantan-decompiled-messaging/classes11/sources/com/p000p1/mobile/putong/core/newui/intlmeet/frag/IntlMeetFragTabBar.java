package com.p000p1.mobile.putong.core.newui.intlmeet.frag;

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
import com.p1.mobile.android.app.Frag;
import l.f30;
import l.kr9;
import l.odo;
import l.t100;
import l.xdl0;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetFragTabBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public FrameLayout f2979a;

    /* JADX INFO: renamed from: b */
    public VText f2980b;

    /* JADX INFO: renamed from: c */
    public VLinear f2981c;

    /* JADX INFO: renamed from: d */
    public VText f2982d;

    /* JADX INFO: renamed from: e */
    public VText f2983e;

    /* JADX INFO: renamed from: f */
    public int f2984f;

    /* JADX INFO: renamed from: g */
    public final int f2985g;

    /* JADX INFO: renamed from: h */
    public final int f2986h;

    /* JADX INFO: renamed from: i */
    public int f2987i;

    /* JADX INFO: renamed from: j */
    public int f2988j;

    public IntlMeetFragTabBar(Context context) {
        super(context);
        this.f2984f = 0;
        this.f2985g = 0;
        this.f2986h = 1;
        this.f2987i = t100.d(44.0f);
        this.f2988j = 0;
        m3400v(context);
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#CC000000");
        int color2 = Color.parseColor("#66000000");
        if (i == 0) {
            this.f2980b.setTextColor(color);
            this.f2980b.setTypeface(Typeface.defaultFromStyle(1));
            this.f2980b.setText(kr9.N(this.f2980b.getText().toString(), Color.parseColor("#FE7E1D"), Typeface.DEFAULT_BOLD));
            this.f2980b.setTextColor(color);
            this.f2982d.setTypeface(Typeface.defaultFromStyle(0));
            this.f2982d.setTextColor(color2);
            return;
        }
        if (i == 1) {
            String string = this.f2980b.getText().toString();
            this.f2980b.setTypeface(Typeface.defaultFromStyle(0));
            this.f2980b.setText(string);
            this.f2980b.setTextColor(color2);
            this.f2982d.setTypeface(Typeface.defaultFromStyle(1));
            this.f2982d.setTextColor(color);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private void m3400v(Context context) {
        addView(m3405u(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m3401B(f30 f30Var, View view) {
        if (this.f2984f == 1) {
            return;
        }
        f30Var.call(1, Boolean.valueOf(xdl0.O0(this.f2983e)));
        m3403E(1);
    }

    /* JADX INFO: renamed from: C */
    public void m3402C(String str) {
        this.f2980b.setText(str);
        setBarStyle(this.f2984f);
    }

    /* JADX INFO: renamed from: E */
    public void m3403E(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        m3404F(i);
        if (i != this.f2984f) {
            this.f2984f = i;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m3404F(int i) {
        if (i == 1 || this.f2988j <= 0) {
            xdl0.M(this.f2983e, false);
        } else if (this.f2984f != 1) {
            xdl0.M(this.f2983e, true);
            VText vText = this.f2983e;
            int i2 = this.f2988j;
            vText.setText(i2 > 99 ? "99+" : String.valueOf(i2));
        }
    }

    public void setNewVisitorCount(int i) {
        this.f2988j = i;
        m3404F(this.f2984f);
    }

    /* JADX INFO: renamed from: u */
    public View m3405u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return odo.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public void m3406w(Frag frag, @NonNull final f30<Integer, Boolean> f30Var) {
        setBarStyle(0);
        xdl0.E0(this.f2980b, new View.OnClickListener() { // from class: l.mdo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16846a.m3407z(f30Var, view);
            }
        });
        xdl0.E0(this.f2982d, new View.OnClickListener() { // from class: l.ndo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17422a.m3401B(f30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m3407z(f30 f30Var, View view) {
        if (this.f2984f == 0) {
            return;
        }
        f30Var.call(0, Boolean.FALSE);
        m3403E(0);
    }

    public IntlMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2984f = 0;
        this.f2985g = 0;
        this.f2986h = 1;
        this.f2987i = t100.d(44.0f);
        this.f2988j = 0;
        m3400v(context);
    }

    public IntlMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2984f = 0;
        this.f2985g = 0;
        this.f2986h = 1;
        this.f2987i = t100.d(44.0f);
        this.f2988j = 0;
        m3400v(context);
    }
}
