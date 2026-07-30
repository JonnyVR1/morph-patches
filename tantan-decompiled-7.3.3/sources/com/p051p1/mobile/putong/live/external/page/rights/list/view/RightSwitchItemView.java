package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VSwitch;
import p151v.VText;
import p153l.add0;
import p153l.bnl0;
import p153l.j9d0;
import p153l.ycd0;

/* JADX INFO: loaded from: classes9.dex */
public class RightSwitchItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightSwitchItemView f46968d;

    /* JADX INFO: renamed from: e */
    public VText f46969e;

    /* JADX INFO: renamed from: f */
    public VSwitch f46970f;

    /* JADX INFO: renamed from: g */
    public View f46971g;

    /* JADX INFO: renamed from: h */
    public VText f46972h;

    /* JADX INFO: renamed from: i */
    public ycd0 f46973i;

    public RightSwitchItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71831i0(View view) {
        add0.m97065a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m71832j0(final ycd0 ycd0Var, final j9d0 j9d0Var) {
        this.f46973i = ycd0Var;
        this.f46970f.setChecked(ycd0Var.isChecked());
        bnl0.m105509E0(this.f46971g, new View.OnClickListener() { // from class: l.zcd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j9d0Var.mo143939d(ycd0Var);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m71833k0() {
        this.f46970f.setChecked(this.f46973i.isChecked());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71831i0(this);
    }

    public RightSwitchItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightSwitchItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
