package com.p046p1.mobile.putong.core.newui.intlmeet.frag;

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
import com.p046p1.mobile.android.app.Frag;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.f30;
import p149l.kr9;
import p149l.odo;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFragTabBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public FrameLayout f24201a;

    /* JADX INFO: renamed from: b */
    public VText f24202b;

    /* JADX INFO: renamed from: c */
    public VLinear f24203c;

    /* JADX INFO: renamed from: d */
    public VText f24204d;

    /* JADX INFO: renamed from: e */
    public VText f24205e;

    /* JADX INFO: renamed from: f */
    public int f24206f;

    /* JADX INFO: renamed from: g */
    public final int f24207g;

    /* JADX INFO: renamed from: h */
    public final int f24208h;

    /* JADX INFO: renamed from: i */
    public int f24209i;

    /* JADX INFO: renamed from: j */
    public int f24210j;

    public IntlMeetFragTabBar(Context context) {
        super(context);
        this.f24206f = 0;
        this.f24207g = 0;
        this.f24208h = 1;
        this.f24209i = t100.m186890d(44.0f);
        this.f24210j = 0;
        m39362v(context);
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#CC000000");
        int color2 = Color.parseColor("#66000000");
        if (i == 0) {
            this.f24202b.setTextColor(color);
            this.f24202b.setTypeface(Typeface.defaultFromStyle(1));
            this.f24202b.setText(kr9.m146969N(this.f24202b.getText().toString(), Color.parseColor("#FE7E1D"), Typeface.DEFAULT_BOLD));
            this.f24202b.setTextColor(color);
            this.f24204d.setTypeface(Typeface.defaultFromStyle(0));
            this.f24204d.setTextColor(color2);
            return;
        }
        if (i == 1) {
            String string = this.f24202b.getText().toString();
            this.f24202b.setTypeface(Typeface.defaultFromStyle(0));
            this.f24202b.setText(string);
            this.f24202b.setTextColor(color2);
            this.f24204d.setTypeface(Typeface.defaultFromStyle(1));
            this.f24204d.setTextColor(color);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m39362v(Context context) {
        addView(m39367u(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m39363B(f30 f30Var, View view) {
        if (this.f24206f == 1) {
            return;
        }
        f30Var.call(1, Boolean.valueOf(xdl0.m208349O0(this.f24205e)));
        m39365E(1);
    }

    /* JADX INFO: renamed from: C */
    public void m39364C(String str) {
        this.f24202b.setText(str);
        setBarStyle(this.f24206f);
    }

    /* JADX INFO: renamed from: E */
    public void m39365E(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        m39366F(i);
        if (i != this.f24206f) {
            this.f24206f = i;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m39366F(int i) {
        if (i == 1 || this.f24210j <= 0) {
            xdl0.m208344M(this.f24205e, false);
        } else if (this.f24206f != 1) {
            xdl0.m208344M(this.f24205e, true);
            VText vText = this.f24205e;
            int i2 = this.f24210j;
            vText.setText(i2 > 99 ? "99+" : String.valueOf(i2));
        }
    }

    public void setNewVisitorCount(int i) {
        this.f24210j = i;
        m39366F(this.f24206f);
    }

    /* JADX INFO: renamed from: u */
    public View m39367u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return odo.m163698b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public void m39368w(Frag frag, @NonNull final f30<Integer, Boolean> f30Var) {
        setBarStyle(0);
        xdl0.m208329E0(this.f24202b, new View.OnClickListener() { // from class: l.mdo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133280a.m39369z(f30Var, view);
            }
        });
        xdl0.m208329E0(this.f24204d, new View.OnClickListener() { // from class: l.ndo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138293a.m39363B(f30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m39369z(f30 f30Var, View view) {
        if (this.f24206f == 0) {
            return;
        }
        f30Var.call(0, Boolean.FALSE);
        m39365E(0);
    }

    public IntlMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24206f = 0;
        this.f24207g = 0;
        this.f24208h = 1;
        this.f24209i = t100.m186890d(44.0f);
        this.f24210j = 0;
        m39362v(context);
    }

    public IntlMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24206f = 0;
        this.f24207g = 0;
        this.f24208h = 1;
        this.f24209i = t100.m186890d(44.0f);
        this.f24210j = 0;
        m39362v(context);
    }
}
