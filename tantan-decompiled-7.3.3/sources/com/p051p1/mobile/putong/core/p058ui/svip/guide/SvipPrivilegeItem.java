package com.p051p1.mobile.putong.core.p058ui.svip.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.gbc0;
import p153l.leh0;

/* JADX INFO: loaded from: classes12.dex */
public class SvipPrivilegeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f37355a;

    /* JADX INFO: renamed from: b */
    public VText f37356b;

    public SvipPrivilegeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57029a(View view) {
        leh0.m153893a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57030b(Privilege privilege) {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(privilege);
        this.f37356b.setText(a690VarMo36052bf.m96314t());
        Privilege privilege2 = Privilege.see_who_likes_me;
        VImage vImage = this.f37355a;
        if (privilege == privilege2) {
            vImage.setImageResource(gbc0.f103355m5);
        } else {
            vImage.setImageResource(a690VarMo36052bf.m96304j());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57029a(this);
    }

    public SvipPrivilegeItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SvipPrivilegeItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
