package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.lsw;
import p153l.n3d0;
import p153l.qa00;
import p153l.tts;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeRightItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeRightItem f51345d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51346e;

    /* JADX INFO: renamed from: f */
    public VText f51347f;

    /* JADX INFO: renamed from: g */
    public VText f51348g;

    public LiveGuardPrivilegeRightItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75871h0(View view) {
        tts.m192692a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75872i0(lsw.C18452b c18452b) {
        izs.m142870u("context_livingAct", this.f51346e, c18452b.f133501a, qa00.m175859d(44.0f), qa00.m175859d(44.0f));
        this.f51348g.setText(c18452b.f133503c);
        this.f51348g.setTextColor(Color.parseColor(c18452b.f133502b));
        if (c18452b.f133504d > 0) {
            this.f51347f.setBackground(n3d0.m161279c("#ff3938", 4));
            VText vText = this.f51347f;
            int i = c18452b.f133504d;
            vText.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75871h0(this);
    }

    public LiveGuardPrivilegeRightItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeRightItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
