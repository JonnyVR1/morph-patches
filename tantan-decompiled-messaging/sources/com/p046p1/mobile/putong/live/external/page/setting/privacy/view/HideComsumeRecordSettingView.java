package com.p046p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VSwitch;
import p147v.VText;
import p149l.b1l;
import p149l.w0l;

/* JADX INFO: loaded from: classes13.dex */
public class HideComsumeRecordSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f46200d;

    /* JADX INFO: renamed from: e */
    public VSwitch f46201e;

    /* JADX INFO: renamed from: f */
    public VText f46202f;

    /* JADX INFO: renamed from: g */
    public b1l f46203g;

    public HideComsumeRecordSettingView(Context context) {
        super(context);
    }

    public boolean getCheckBoxIsOpen() {
        return this.f46201e.isChecked();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70791i0(View view) {
        w0l.m200894a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m70792j0(b1l b1lVar, View view) {
        b1lVar.m194544H().mo127118c(b1lVar, this);
    }

    /* JADX INFO: renamed from: k0 */
    public void m70793k0(final b1l b1lVar) {
        this.f46203g = b1lVar;
        this.f46200d.setText(b1lVar.m99849S(getContext()));
        this.f46202f.setText(b1lVar.m99848R(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.v0l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179122a.m70792j0(b1lVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70791i0(this);
    }

    public void setCheckBoxIsOpen(boolean z) {
        this.f46201e.setChecked(z);
    }

    public HideComsumeRecordSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideComsumeRecordSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
