package com.p046p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VSwitch;
import p147v.VText;
import p149l.h1l;
import p149l.j1l;

/* JADX INFO: loaded from: classes13.dex */
public class HideLiveAnchorLevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f46204d;

    /* JADX INFO: renamed from: e */
    public VSwitch f46205e;

    /* JADX INFO: renamed from: f */
    public VText f46206f;

    public HideLiveAnchorLevelView(Context context) {
        super(context);
    }

    public boolean getCheckBoxIsOpen() {
        return this.f46205e.isChecked();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70795i0(View view) {
        j1l.m139329a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m70796j0(h1l h1lVar, View view) {
        h1lVar.m194544H().mo127118c(h1lVar, this);
    }

    /* JADX INFO: renamed from: k0 */
    public void m70797k0(final h1l h1lVar) {
        this.f46204d.setText(h1lVar.m129037S(getContext()));
        this.f46206f.setText(h1lVar.m129036R(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.i1l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110465a.m70796j0(h1lVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70795i0(this);
    }

    public void setCheckBoxIsOpen(boolean z) {
        this.f46205e.setChecked(z);
    }

    public HideLiveAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideLiveAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
