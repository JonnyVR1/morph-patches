package com.p051p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VSwitch;
import p151v.VText;
import p153l.x3l;
import p153l.z3l;

/* JADX INFO: loaded from: classes9.dex */
public class HideLiveAnchorLevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f47052d;

    /* JADX INFO: renamed from: e */
    public VSwitch f47053e;

    /* JADX INFO: renamed from: f */
    public VText f47054f;

    public HideLiveAnchorLevelView(Context context) {
        super(context);
    }

    public boolean getCheckBoxIsOpen() {
        return this.f47053e.isChecked();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71978i0(View view) {
        z3l.m218488a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m71979j0(x3l x3lVar, View view) {
        x3lVar.m217585H().mo151656c(x3lVar, this);
    }

    /* JADX INFO: renamed from: k0 */
    public void m71980k0(final x3l x3lVar) {
        this.f47052d.setText(x3lVar.m209252S(getContext()));
        this.f47054f.setText(x3lVar.m209251R(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.y3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197370a.m71979j0(x3lVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71978i0(this);
    }

    public void setCheckBoxIsOpen(boolean z) {
        this.f47053e.setChecked(z);
    }

    public HideLiveAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideLiveAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
