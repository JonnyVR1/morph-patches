package com.p051p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VText;
import p153l.d3l;
import p153l.f3l;

/* JADX INFO: loaded from: classes9.dex */
public class HideAvatarSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f47044d;

    /* JADX INFO: renamed from: e */
    public VImage f47045e;

    /* JADX INFO: renamed from: f */
    public VText f47046f;

    /* JADX INFO: renamed from: g */
    public d3l f47047g;

    public HideAvatarSettingView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71971i0(View view) {
        f3l.m123740a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m71972j0(final d3l d3lVar) {
        this.f47047g = d3lVar;
        this.f47044d.setText(d3lVar.m113840Q(getContext()));
        this.f47046f.setText(d3lVar.m113839P(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.e3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d3l d3lVar2 = d3lVar;
                d3lVar2.m217585H().mo151654a(d3lVar2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71971i0(this);
    }

    public HideAvatarSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideAvatarSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
