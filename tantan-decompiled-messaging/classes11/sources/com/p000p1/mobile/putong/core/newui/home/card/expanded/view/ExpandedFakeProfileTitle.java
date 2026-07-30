package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedFakeProfileTitle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileShareHelper;
import com.p1.mobile.putong.core.ui.profile.views.ProfileCustomBar;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.f9k0;
import l.mm90;
import l.qmf;
import l.t100;
import l.upa;
import l.vi90;
import l.x2c0;
import l.xdl0;
import l.zl4;
import p009l.lra0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedFakeProfileTitle extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ProfileCustomBar f1360a;

    /* JADX INFO: renamed from: b */
    public vi90 f1361b;

    /* JADX INFO: renamed from: c */
    public ProfileShareHelper f1362c;

    public ExpandedFakeProfileTitle(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2286b() {
        lra0.m17994h("button");
        ExpandedCardStyleHelper.m2064o().m2081w("top back");
    }

    /* JADX INFO: renamed from: d */
    public final void m2288d(View view) {
        qmf.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final Act m2289e() {
        return xdl0.E(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2290f() {
        this.f1362c.O();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2291g() {
        this.f1362c.N();
    }

    /* JADX INFO: renamed from: h */
    public void m2292h(User user) {
        mm90 mm90Var = new mm90();
        mm90Var.a = ((DbObject) user).id;
        mm90Var.e = "home_card";
        zl4 zl4Var = new zl4(getContext(), mm90Var);
        this.f1361b = zl4Var;
        this.f1362c = new ProfileShareHelper(zl4Var);
        this.f1360a.l(user, "", false, false, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2288d(this);
        if (upa.z()) {
            this.f1360a.l.setImageDrawable(m2289e().drawable(x2c0.U6));
            this.f1360a.d.setImageResource(x2c0.C);
        }
        this.f1360a.a.setMinHeight(t100.d(44.0f));
        this.f1360a.c.setMinHeight(t100.d(44.0f));
        this.f1360a.c.setVisibility(0);
        this.f1360a.setBackCallBack(new d30() { // from class: l.nmf
            public final void call() {
                ExpandedFakeProfileTitle.m2286b();
            }
        });
        boolean zA = f9k0.a();
        ProfileCustomBar profileCustomBar = this.f1360a;
        if (zA) {
            profileCustomBar.setMoreCallBack(new d30() { // from class: l.pmf
                public final void call() {
                    this.f18786a.m2291g();
                }
            });
        } else {
            profileCustomBar.setMoreCallBack(new d30() { // from class: l.omf
                public final void call() {
                    this.f18171a.m2290f();
                }
            });
        }
        xdl0.M(this.f1360a.n, false);
    }

    public ExpandedFakeProfileTitle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedFakeProfileTitle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
