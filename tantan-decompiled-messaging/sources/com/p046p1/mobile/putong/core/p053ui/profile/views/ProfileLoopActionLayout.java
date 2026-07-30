package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VText;
import p149l.e3c0;
import p149l.qea0;
import p149l.xdl0;
import p149l.xha0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopActionLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f34162a;

    /* JADX INFO: renamed from: b */
    public VButton f34163b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f34164c;

    /* JADX INFO: renamed from: d */
    public xha0 f34165d;

    /* JADX INFO: renamed from: e */
    public boolean f34166e;

    public ProfileLoopActionLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m52958a(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m52962e(View view) {
        qea0.m174187a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m52963f() {
        if (NullChecker.m81303a(this.f34165d)) {
            this.f34165d.mo51586H();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m52964g() {
        xdl0.m208344M(getNextButton(), false);
    }

    public TextView getNextButton() {
        return this.f34166e ? this.f34164c : this.f34163b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m52965h(View view) {
        if (NullChecker.m81303a(this.f34165d)) {
            this.f34165d.mo51609h1();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m52966i(View view) {
        if (NullChecker.m81303a(this.f34165d) && this.f34165d.mo51598X()) {
            this.f34165d.mo51586H();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m52967j(View view) {
        if (NullChecker.m81303a(this.f34165d) && this.f34165d.mo51598X()) {
            this.f34165d.mo51586H();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m52968k() {
        xdl0.m208344M(getNextButton(), true);
        boolean zMo51598X = this.f34165d.mo51598X();
        VButton vButton = this.f34163b;
        if (zMo51598X) {
            vButton.setBackground(getContext().getDrawable(e3c0.f89103f));
            this.f34164c.setEnabled(true);
        } else {
            vButton.setBackground(getContext().getDrawable(e3c0.f89099e));
            this.f34164c.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m52969l(xha0 xha0Var) {
        this.f34165d = xha0Var;
        if (xha0Var.isLast()) {
            getNextButton().setText(R$string.f27839e);
        } else {
            getNextButton().setText(R$string.f27845f);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m52970m() {
        this.f34166e = true;
        xdl0.m208344M(this.f34164c, true);
        xdl0.m208344M(this.f34163b, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m52962e(this);
        xdl0.m208329E0(this.f34162a, new View.OnClickListener() { // from class: l.mea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133385a.m52965h(view);
            }
        });
        xdl0.m208329E0(this.f34163b, new View.OnClickListener() { // from class: l.nea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138598a.m52966i(view);
            }
        });
        xdl0.m208329E0(this.f34164c, new View.OnClickListener() { // from class: l.oea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143298a.m52967j(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.pea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileLoopActionLayout.m52958a(view);
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
