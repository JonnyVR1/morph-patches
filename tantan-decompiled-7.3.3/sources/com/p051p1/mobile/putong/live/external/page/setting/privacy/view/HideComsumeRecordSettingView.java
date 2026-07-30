package com.p051p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VSwitch;
import p151v.VText;
import p153l.m3l;
import p153l.r3l;

/* JADX INFO: loaded from: classes9.dex */
public class HideComsumeRecordSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f47048d;

    /* JADX INFO: renamed from: e */
    public VSwitch f47049e;

    /* JADX INFO: renamed from: f */
    public VText f47050f;

    /* JADX INFO: renamed from: g */
    public r3l f47051g;

    public HideComsumeRecordSettingView(Context context) {
        super(context);
    }

    public boolean getCheckBoxIsOpen() {
        return this.f47049e.isChecked();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71974i0(View view) {
        m3l.m156934a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m71975j0(r3l r3lVar, View view) {
        r3lVar.m217585H().mo151656c(r3lVar, this);
    }

    /* JADX INFO: renamed from: k0 */
    public void m71976k0(final r3l r3lVar) {
        this.f47051g = r3lVar;
        this.f47048d.setText(r3lVar.m179629S(getContext()));
        this.f47050f.setText(r3lVar.m179628R(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.l3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129890a.m71975j0(r3lVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71974i0(this);
    }

    public void setCheckBoxIsOpen(boolean z) {
        this.f47049e.setChecked(z);
    }

    public HideComsumeRecordSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideComsumeRecordSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
