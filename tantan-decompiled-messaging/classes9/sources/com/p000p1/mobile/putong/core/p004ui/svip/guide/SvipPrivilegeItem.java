package com.p000p1.mobile.putong.core.p004ui.svip.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import l.b3c0;
import l.d6h0;
import p006l.wx80;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SvipPrivilegeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f6288a;

    /* JADX INFO: renamed from: b */
    public VText f6289b;

    public SvipPrivilegeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9244a(View view) {
        d6h0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9245b(Privilege privilege) {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(privilege);
        this.f6289b.setText(wx80VarM6986bf.m26849t());
        Privilege privilege2 = Privilege.see_who_likes_me;
        VImage vImage = this.f6288a;
        if (privilege == privilege2) {
            vImage.setImageResource(b3c0.m5);
        } else {
            vImage.setImageResource(wx80VarM6986bf.m26839j());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9244a(this);
    }

    public SvipPrivilegeItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SvipPrivilegeItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
