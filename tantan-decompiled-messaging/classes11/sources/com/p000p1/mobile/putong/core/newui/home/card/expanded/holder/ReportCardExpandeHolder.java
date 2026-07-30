package com.p000p1.mobile.putong.core.newui.home.card.expanded.holder;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.c4g0;
import l.j760;
import l.lsc0;
import l.mkd0;
import l.o6j0;
import l.xdl0;
import p009l.p3l;
import rx.subjects.a;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ReportCardExpandeHolder extends p3l {

    /* JADX INFO: renamed from: f */
    public VFrame f1207f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f1208g;

    /* JADX INFO: renamed from: h */
    public CoreSuggested.UserInfo f1209h;

    /* JADX INFO: renamed from: i */
    public User f1210i;

    /* JADX INFO: renamed from: j */
    public c4g0 f1211j;

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f1209h = userInfo;
        this.f1210i = user;
        this.f1208g.setText(App.e.getString(R.string.r1) + " " + user.name);
    }

    /* JADX INFO: renamed from: E */
    public final void m2125E(View view) {
        lsc0.a(this, view);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m2126F(Act act, View view) {
        String str = ((DbObject) this.f1210i).id;
        act.startActivity(ReportAct.e2(act, str, CoreModule.c.f0.xh(str), this.f1210i.publicId, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.newui.home.card.expanded.holder.ReportCardExpandeHolder.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    a aVar = CoreModule.c.m0.I2;
                    SwipeDirection swipeDirection = SwipeDirection.LEFT;
                    aVar.onNext(j760.a(swipeDirection, (Object) null));
                    if (ReportCardExpandeHolder.this.m20098w() instanceof ProfileAct) {
                        ReportCardExpandeHolder.this.m20098w().setResult(swipeDirection.getValue());
                        ReportCardExpandeHolder.this.m20098w().finish();
                    }
                }
            }
        }));
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m2125E(view);
        final Act context = view.getContext();
        xdl0.E0(this.f1207f, new View.OnClickListener() { // from class: l.ksc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15834a.m2126F(context, view2);
            }
        });
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        User user;
        super.mo2128q(z);
        if (!z || (user = this.f1210i) == null) {
            return;
        }
        o6j0.n("e_clone_swipe_to_bottom", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("receiver_user_id", ((DbObject) user).id)});
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: r */
    public void mo2129r() {
        super.mo2129r();
        mkd0.z(this.f1211j);
    }
}
