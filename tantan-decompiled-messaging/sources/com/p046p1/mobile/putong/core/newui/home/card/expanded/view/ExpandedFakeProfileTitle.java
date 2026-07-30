package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedFakeProfileTitle;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileShareHelper;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.data.User;
import p149l.d30;
import p149l.f9k0;
import p149l.lra0;
import p149l.mm90;
import p149l.qmf;
import p149l.t100;
import p149l.upa;
import p149l.vi90;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zl4;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedFakeProfileTitle extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ProfileCustomBar f22582a;

    /* JADX INFO: renamed from: b */
    public vi90 f22583b;

    /* JADX INFO: renamed from: c */
    public ProfileShareHelper f22584c;

    public ExpandedFakeProfileTitle(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38308b() {
        lra0.m151149h("button");
        ExpandedCardStyleHelper.m38090o().m38107w("top back");
    }

    /* JADX INFO: renamed from: d */
    public final void m38310d(View view) {
        qmf.m175567a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final Act m38311e() {
        return (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m38312f() {
        this.f22584c.m52708O();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m38313g() {
        this.f22584c.m52707N();
    }

    /* JADX INFO: renamed from: h */
    public void m38314h(User user) {
        mm90 mm90Var = new mm90();
        mm90Var.f134562a = user.f56011id;
        mm90Var.f134566e = "home_card";
        zl4 zl4Var = new zl4(getContext(), mm90Var);
        this.f22583b = zl4Var;
        this.f22584c = new ProfileShareHelper(zl4Var);
        this.f22582a.m52954l(user, "", false, false, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38310d(this);
        if (upa.m194847z()) {
            this.f22582a.f34158l.setImageDrawable(m38311e().drawable(x2c0.f189786U6));
            this.f22582a.f34150d.setImageResource(x2c0.f189217C);
        }
        this.f22582a.f34147a.setMinHeight(t100.m186890d(44.0f));
        this.f22582a.f34149c.setMinHeight(t100.m186890d(44.0f));
        this.f22582a.f34149c.setVisibility(0);
        this.f22582a.setBackCallBack(new d30() { // from class: l.nmf
            @Override // p149l.d30
            public final void call() {
                ExpandedFakeProfileTitle.m38308b();
            }
        });
        boolean zM120088a = f9k0.m120088a();
        ProfileCustomBar profileCustomBar = this.f22582a;
        if (zM120088a) {
            profileCustomBar.setMoreCallBack(new d30() { // from class: l.pmf
                @Override // p149l.d30
                public final void call() {
                    this.f150216a.m38313g();
                }
            });
        } else {
            profileCustomBar.setMoreCallBack(new d30() { // from class: l.omf
                @Override // p149l.d30
                public final void call() {
                    this.f144615a.m38312f();
                }
            });
        }
        xdl0.m208344M(this.f22582a.f34160n, false);
    }

    public ExpandedFakeProfileTitle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedFakeProfileTitle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
