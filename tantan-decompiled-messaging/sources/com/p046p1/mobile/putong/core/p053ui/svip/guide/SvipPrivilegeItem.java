package com.p046p1.mobile.putong.core.p053ui.svip.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.d6h0;
import p149l.wx80;

/* JADX INFO: loaded from: classes9.dex */
public class SvipPrivilegeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f36507a;

    /* JADX INFO: renamed from: b */
    public VText f36508b;

    public SvipPrivilegeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55846a(View view) {
        d6h0.m110167a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55847b(Privilege privilege) {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(privilege);
        this.f36508b.setText(wx80VarMo35049bf.m205968t());
        Privilege privilege2 = Privilege.see_who_likes_me;
        VImage vImage = this.f36507a;
        if (privilege == privilege2) {
            vImage.setImageResource(b3c0.f73104m5);
        } else {
            vImage.setImageResource(wx80VarMo35049bf.m205958j());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55846a(this);
    }

    public SvipPrivilegeItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SvipPrivilegeItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
