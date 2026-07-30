package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedFakeProfileTitle;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileShareHelper;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.data.User;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.lik0;
import p153l.pza0;
import p153l.qa00;
import p153l.qu90;
import p153l.wnf;
import p153l.x20;
import p153l.ym4;
import p153l.zq90;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedFakeProfileTitle extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ProfileCustomBar f23324a;

    /* JADX INFO: renamed from: b */
    public zq90 f23325b;

    /* JADX INFO: renamed from: c */
    public ProfileShareHelper f23326c;

    public ExpandedFakeProfileTitle(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39311b() {
        pza0.m174356h("button");
        ExpandedCardStyleHelper.m39093o().m39110w("top back");
    }

    /* JADX INFO: renamed from: d */
    public final void m39313d(View view) {
        wnf.m207198a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final Act m39314e() {
        return (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m39315f() {
        this.f23326c.m53891O();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m39316g() {
        this.f23326c.m53890N();
    }

    /* JADX INFO: renamed from: h */
    public void m39317h(User user) {
        qu90 qu90Var = new qu90();
        qu90Var.f159534a = user.f56859id;
        qu90Var.f159538e = "home_card";
        ym4 ym4Var = new ym4(getContext(), qu90Var);
        this.f23325b = ym4Var;
        this.f23326c = new ProfileShareHelper(ym4Var);
        this.f23324a.m54137l(user, "", false, false, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39313d(this);
        if (gra.m131778z()) {
            this.f23324a.f35006l.setImageDrawable(m39314e().drawable(dbc0.f86655V6));
            this.f23324a.f34998d.setImageResource(dbc0.f86072D);
        }
        this.f23324a.f34995a.setMinHeight(qa00.m175859d(44.0f));
        this.f23324a.f34997c.setMinHeight(qa00.m175859d(44.0f));
        this.f23324a.f34997c.setVisibility(0);
        this.f23324a.setBackCallBack(new x20() { // from class: l.tnf
            @Override // p153l.x20
            public final void call() {
                ExpandedFakeProfileTitle.m39311b();
            }
        });
        boolean zM154375a = lik0.m154375a();
        ProfileCustomBar profileCustomBar = this.f23324a;
        if (zM154375a) {
            profileCustomBar.setMoreCallBack(new x20() { // from class: l.vnf
                @Override // p153l.x20
                public final void call() {
                    this.f184877a.m39316g();
                }
            });
        } else {
            profileCustomBar.setMoreCallBack(new x20() { // from class: l.unf
                @Override // p153l.x20
                public final void call() {
                    this.f179725a.m39315f();
                }
            });
        }
        bnl0.m105524M(this.f23324a.f35008n, false);
    }

    public ExpandedFakeProfileTitle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedFakeProfileTitle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
