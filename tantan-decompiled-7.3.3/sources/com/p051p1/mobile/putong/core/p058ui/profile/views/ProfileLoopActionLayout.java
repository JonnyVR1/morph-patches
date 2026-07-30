package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VText;
import p153l.bnl0;
import p153l.bqa0;
import p153l.kbc0;
import p153l.uma0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopActionLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f35010a;

    /* JADX INFO: renamed from: b */
    public VButton f35011b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f35012c;

    /* JADX INFO: renamed from: d */
    public bqa0 f35013d;

    /* JADX INFO: renamed from: e */
    public boolean f35014e;

    public ProfileLoopActionLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m54141a(View view) {
    }

    /* JADX INFO: renamed from: e */
    public final void m54145e(View view) {
        uma0.m196641a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m54146f() {
        if (NullChecker.m82486a(this.f35013d)) {
            this.f35013d.mo52769H();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m54147g() {
        bnl0.m105524M(getNextButton(), false);
    }

    public TextView getNextButton() {
        return this.f35014e ? this.f35012c : this.f35011b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m54148h(View view) {
        if (NullChecker.m82486a(this.f35013d)) {
            this.f35013d.mo52792h1();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m54149i(View view) {
        if (NullChecker.m82486a(this.f35013d) && this.f35013d.mo52781X()) {
            this.f35013d.mo52769H();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m54150j(View view) {
        if (NullChecker.m82486a(this.f35013d) && this.f35013d.mo52781X()) {
            this.f35013d.mo52769H();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m54151k() {
        bnl0.m105524M(getNextButton(), true);
        boolean zMo52781X = this.f35013d.mo52781X();
        VButton vButton = this.f35011b;
        if (zMo52781X) {
            vButton.setBackground(getContext().getDrawable(kbc0.f124866f));
            this.f35012c.setEnabled(true);
        } else {
            vButton.setBackground(getContext().getDrawable(kbc0.f124862e));
            this.f35012c.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m54152l(bqa0 bqa0Var) {
        this.f35013d = bqa0Var;
        if (bqa0Var.isLast()) {
            getNextButton().setText(R$string.f28687e);
        } else {
            getNextButton().setText(R$string.f28693f);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m54153m() {
        this.f35014e = true;
        bnl0.m105524M(this.f35012c, true);
        bnl0.m105524M(this.f35011b, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54145e(this);
        bnl0.m105509E0(this.f35010a, new View.OnClickListener() { // from class: l.qma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158308a.m54148h(view);
            }
        });
        bnl0.m105509E0(this.f35011b, new View.OnClickListener() { // from class: l.rma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163838a.m54149i(view);
            }
        });
        bnl0.m105509E0(this.f35012c, new View.OnClickListener() { // from class: l.sma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169533a.m54150j(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.tma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileLoopActionLayout.m54141a(view);
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
