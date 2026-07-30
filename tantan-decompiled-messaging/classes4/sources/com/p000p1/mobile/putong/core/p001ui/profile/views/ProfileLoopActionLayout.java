package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import l.e3c0;
import l.qea0;
import l.xdl0;
import p002l.xha0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopActionLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f1984a;

    /* JADX INFO: renamed from: b */
    public VButton f1985b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f1986c;

    /* JADX INFO: renamed from: d */
    public xha0 f1987d;

    /* JADX INFO: renamed from: e */
    public boolean f1988e;

    public ProfileLoopActionLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3516a(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m3520e(View view) {
        qea0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m3521f() {
        if (NullChecker.a(this.f1987d)) {
            this.f1987d.mo2072H();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3522g() {
        xdl0.M(getNextButton(), false);
    }

    public TextView getNextButton() {
        return this.f1988e ? this.f1986c : this.f1985b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m3523h(View view) {
        if (NullChecker.a(this.f1987d)) {
            this.f1987d.mo2095h1();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m3524i(View view) {
        if (NullChecker.a(this.f1987d) && this.f1987d.mo2084X()) {
            this.f1987d.mo2072H();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m3525j(View view) {
        if (NullChecker.a(this.f1987d) && this.f1987d.mo2084X()) {
            this.f1987d.mo2072H();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3526k() {
        xdl0.M(getNextButton(), true);
        boolean zMo2084X = this.f1987d.mo2084X();
        VButton vButton = this.f1985b;
        if (zMo2084X) {
            vButton.setBackground(getContext().getDrawable(e3c0.f));
            this.f1986c.setEnabled(true);
        } else {
            vButton.setBackground(getContext().getDrawable(e3c0.e));
            this.f1986c.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3527l(xha0 xha0Var) {
        this.f1987d = xha0Var;
        if (xha0Var.isLast()) {
            getNextButton().setText(R.string.e);
        } else {
            getNextButton().setText(R.string.f);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3528m() {
        this.f1988e = true;
        xdl0.M(this.f1986c, true);
        xdl0.M(this.f1985b, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3520e(this);
        xdl0.E0(this.f1984a, new View.OnClickListener() { // from class: l.mea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15357a.m3523h(view);
            }
        });
        xdl0.E0(this.f1985b, new View.OnClickListener() { // from class: l.nea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15967a.m3524i(view);
            }
        });
        xdl0.E0(this.f1986c, new View.OnClickListener() { // from class: l.oea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16548a.m3525j(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.pea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileLoopActionLayout.m3516a(view);
            }
        });
    }

    public void setNextButton(String str) {
        getNextButton().setText(str);
    }

    public ProfileLoopActionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopActionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
