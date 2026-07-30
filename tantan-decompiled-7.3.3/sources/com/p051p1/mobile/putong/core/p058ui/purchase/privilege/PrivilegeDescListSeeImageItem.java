package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.joa;
import p153l.n490;
import p153l.pf60;
import p153l.qa00;
import p153l.rbb0;
import p153l.uqb0;
import p153l.wj90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListSeeImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35891a;

    /* JADX INFO: renamed from: b */
    public VLinear_FillerMeasure f35892b;

    /* JADX INFO: renamed from: c */
    public VText f35893c;

    /* JADX INFO: renamed from: d */
    public VText f35894d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f35895e;

    /* JADX INFO: renamed from: f */
    public VText f35896f;

    /* JADX INFO: renamed from: g */
    public VText f35897g;

    public PrivilegeDescListSeeImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55418a(View view) {
        n490.m161556a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55419b(User user) {
        bnl0.m105524M(this.f35895e, false);
        bnl0.m105524M(this.f35892b, true);
        this.f35893c.setText(user.name);
        if ((!joa.m146361M3() && rbb0.m180744q()) || wj90.m206620c(user)) {
            uqb0.f180374G.m127120O(this.f35891a, user.m61308fp().profileSmall().formatted(), 2, qa00.m175859d(3.0f));
            bnl0.m105524M(this.f35894d, false);
            return;
        }
        uqb0.f180374G.m127107H0(this.f35891a, user.m61308fp().profileMiddle(), qa00.m175859d(90.0f), qa00.m175859d(120.0f));
        bnl0.m105524M(this.f35894d, true);
        this.f35894d.setText(user.age + "");
    }

    /* JADX INFO: renamed from: c */
    public void m55420c(User user) {
        bnl0.m105524M(this.f35895e, false);
        bnl0.m105524M(this.f35892b, true);
        this.f35893c.setText(user.name);
        bnl0.m105524M(this.f35894d, false);
        if (!joa.m146363O3() || wj90.m206620c(user)) {
            uqb0.f180374G.m127120O(this.f35891a, user.m61308fp().profileSmall().formatted(), 2, qa00.m175859d(3.0f));
        } else {
            uqb0.f180374G.m127107H0(this.f35891a, user.m61308fp().profileMiddle(), qa00.m175859d(90.0f), qa00.m175859d(120.0f));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m55421d(pf60<User, Integer> pf60Var, int i) {
        bnl0.m105524M(this.f35895e, true);
        bnl0.m105524M(this.f35892b, false);
        User user = pf60Var.f152156a;
        int i2 = user.location.distance;
        String str = "1km";
        if (i2 >= 100 && i2 >= 1000) {
            str = (i2 / 1000) + "km";
        }
        this.f35896f.setText(str);
        this.f35897g.setText(String.format("访问%s次", pf60Var.f152157b));
        if (joa.m146357G3()) {
            this.f35891a.setImageUrl(user.m61308fp().url);
        } else if (i == 0) {
            this.f35891a.setImageUrl(user.m61308fp().url);
        } else {
            uqb0.f180374G.m127120O(this.f35891a, user.m61308fp().profileSmall().formatted(), 2, qa00.m175859d(3.0f));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55418a(this);
    }

    public PrivilegeDescListSeeImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSeeImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
