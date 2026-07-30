package com.p046p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VText;
import p149l.n0l;
import p149l.p0l;

/* JADX INFO: loaded from: classes13.dex */
public class HideAvatarSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f46196d;

    /* JADX INFO: renamed from: e */
    public VImage f46197e;

    /* JADX INFO: renamed from: f */
    public VText f46198f;

    /* JADX INFO: renamed from: g */
    public n0l f46199g;

    public HideAvatarSettingView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70788i0(View view) {
        p0l.m166988a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m70789j0(final n0l n0lVar) {
        this.f46199g = n0lVar;
        this.f46196d.setText(n0lVar.m157281Q(getContext()));
        this.f46198f.setText(n0lVar.m157280P(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.o0l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0l n0lVar2 = n0lVar;
                n0lVar2.m194544H().mo127116a(n0lVar2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70788i0(this);
    }

    public HideAvatarSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideAvatarSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
