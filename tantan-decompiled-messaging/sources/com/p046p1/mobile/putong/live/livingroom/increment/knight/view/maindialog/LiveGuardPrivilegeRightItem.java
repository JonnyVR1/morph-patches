package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.kvc0;
import p149l.mpw;
import p149l.srs;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeRightItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeRightItem f50497d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50498e;

    /* JADX INFO: renamed from: f */
    public VText f50499f;

    /* JADX INFO: renamed from: g */
    public VText f50500g;

    public LiveGuardPrivilegeRightItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74688h0(View view) {
        srs.m185705a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74689i0(mpw.C18529b c18529b) {
        hxs.m133408u("context_livingAct", this.f50498e, c18529b.f135125a, t100.m186890d(44.0f), t100.m186890d(44.0f));
        this.f50500g.setText(c18529b.f135127c);
        this.f50500g.setTextColor(Color.parseColor(c18529b.f135126b));
        if (c18529b.f135128d > 0) {
            this.f50499f.setBackground(kvc0.m147354c("#ff3938", 4));
            VText vText = this.f50499f;
            int i = c18529b.f135128d;
            vText.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74688h0(this);
    }

    public LiveGuardPrivilegeRightItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeRightItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
