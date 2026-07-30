package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.j760;
import l.jw80;
import l.n3b0;
import l.sb90;
import l.t100;
import l.xdl0;
import p006l.qib0;
import p006l.xma;
import v.AutoVDraweeView;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListSeeImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f4824a;

    /* JADX INFO: renamed from: b */
    public VLinear_FillerMeasure f4825b;

    /* JADX INFO: renamed from: c */
    public VText f4826c;

    /* JADX INFO: renamed from: d */
    public VText f4827d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f4828e;

    /* JADX INFO: renamed from: f */
    public VText f4829f;

    /* JADX INFO: renamed from: g */
    public VText f4830g;

    public PrivilegeDescListSeeImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7570a(View view) {
        jw80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7571b(User user) {
        xdl0.M(this.f4828e, false);
        xdl0.M(this.f4825b, true);
        this.f4826c.setText(user.name);
        if ((!xma.m27355L3() && n3b0.q()) || sb90.c(user)) {
            qib0.f19782G.m12749O(this.f4824a, user.fp().profileSmall().formatted(), 2, t100.d(3.0f));
            xdl0.M(this.f4827d, false);
            return;
        }
        qib0.f19782G.m12736H0(this.f4824a, user.fp().profileMiddle(), t100.d(90.0f), t100.d(120.0f));
        xdl0.M(this.f4827d, true);
        this.f4827d.setText(user.age + "");
    }

    /* JADX INFO: renamed from: c */
    public void m7572c(User user) {
        xdl0.M(this.f4828e, false);
        xdl0.M(this.f4825b, true);
        this.f4826c.setText(user.name);
        xdl0.M(this.f4827d, false);
        if (!xma.m27357N3() || sb90.c(user)) {
            qib0.f19782G.m12749O(this.f4824a, user.fp().profileSmall().formatted(), 2, t100.d(3.0f));
        } else {
            qib0.f19782G.m12736H0(this.f4824a, user.fp().profileMiddle(), t100.d(90.0f), t100.d(120.0f));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7573d(j760<User, Integer> j760Var, int i) {
        xdl0.M(this.f4828e, true);
        xdl0.M(this.f4825b, false);
        User user = (User) j760Var.a;
        int i2 = user.location.distance;
        String str = "1km";
        if (i2 >= 100 && i2 >= 1000) {
            str = (i2 / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + "km";
        }
        this.f4829f.setText(str);
        this.f4830g.setText(String.format("访问%s次", j760Var.b));
        if (xma.m27351F3()) {
            this.f4824a.setImageUrl(((Media) user.fp()).url);
        } else if (i == 0) {
            this.f4824a.setImageUrl(((Media) user.fp()).url);
        } else {
            qib0.f19782G.m12749O(this.f4824a, user.fp().profileSmall().formatted(), 2, t100.d(3.0f));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7570a(this);
    }

    public PrivilegeDescListSeeImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSeeImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
