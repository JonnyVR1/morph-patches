package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.j760;
import p149l.jw80;
import p149l.n3b0;
import p149l.qib0;
import p149l.sb90;
import p149l.t100;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListSeeImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35043a;

    /* JADX INFO: renamed from: b */
    public VLinear_FillerMeasure f35044b;

    /* JADX INFO: renamed from: c */
    public VText f35045c;

    /* JADX INFO: renamed from: d */
    public VText f35046d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f35047e;

    /* JADX INFO: renamed from: f */
    public VText f35048f;

    /* JADX INFO: renamed from: g */
    public VText f35049g;

    public PrivilegeDescListSeeImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54235a(View view) {
        jw80.m143650a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54236b(User user) {
        xdl0.m208344M(this.f35047e, false);
        xdl0.m208344M(this.f35044b, true);
        this.f35045c.setText(user.name);
        if ((!xma.m210047L3() && n3b0.m157742q()) || sb90.m183207c(user)) {
            qib0.f154691G.m102336O(this.f35043a, user.m60124fp().profileSmall().formatted(), 2, t100.m186890d(3.0f));
            xdl0.m208344M(this.f35046d, false);
            return;
        }
        qib0.f154691G.m102323H0(this.f35043a, user.m60124fp().profileMiddle(), t100.m186890d(90.0f), t100.m186890d(120.0f));
        xdl0.m208344M(this.f35046d, true);
        this.f35046d.setText(user.age + "");
    }

    /* JADX INFO: renamed from: c */
    public void m54237c(User user) {
        xdl0.m208344M(this.f35047e, false);
        xdl0.m208344M(this.f35044b, true);
        this.f35045c.setText(user.name);
        xdl0.m208344M(this.f35046d, false);
        if (!xma.m210049N3() || sb90.m183207c(user)) {
            qib0.f154691G.m102336O(this.f35043a, user.m60124fp().profileSmall().formatted(), 2, t100.m186890d(3.0f));
        } else {
            qib0.f154691G.m102323H0(this.f35043a, user.m60124fp().profileMiddle(), t100.m186890d(90.0f), t100.m186890d(120.0f));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m54238d(j760<User, Integer> j760Var, int i) {
        xdl0.m208344M(this.f35047e, true);
        xdl0.m208344M(this.f35044b, false);
        User user = j760Var.f116564a;
        int i2 = user.location.distance;
        String str = "1km";
        if (i2 >= 100 && i2 >= 1000) {
            str = (i2 / 1000) + "km";
        }
        this.f35048f.setText(str);
        this.f35049g.setText(String.format("访问%s次", j760Var.f116565b));
        if (xma.m210043F3()) {
            this.f35043a.setImageUrl(user.m60124fp().url);
        } else if (i == 0) {
            this.f35043a.setImageUrl(user.m60124fp().url);
        } else {
            qib0.f154691G.m102336O(this.f35043a, user.m60124fp().profileSmall().formatted(), 2, t100.m186890d(3.0f));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54235a(this);
    }

    public PrivilegeDescListSeeImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSeeImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
