package com.p046p1.mobile.putong.core.newui.home.card.expanded.holder;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.data.User;
import java.util.HashMap;
import p133rx.subjects.C22392a;
import p147v.VFrame;
import p149l.c4g0;
import p149l.j760;
import p149l.lsc0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.p3l;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ReportCardExpandeHolder extends p3l {

    /* JADX INFO: renamed from: f */
    public VFrame f22429f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f22430g;

    /* JADX INFO: renamed from: h */
    public CoreSuggested.UserInfo f22431h;

    /* JADX INFO: renamed from: i */
    public User f22432i;

    /* JADX INFO: renamed from: j */
    public c4g0 f22433j;

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f22431h = userInfo;
        this.f22432i = user;
        this.f22430g.setText(App.f15369e.getString(R$string.f18870r1) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user.name);
    }

    /* JADX INFO: renamed from: E */
    public final void m38151E(View view) {
        lsc0.m151556a(this, view);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m38152F(Act act, View view) {
        String str = this.f22432i.f56011id;
        act.startActivity(ReportAct.m54632e2(act, str, CoreModule.f17545c.f19642f0.m33182xh(str), this.f22432i.publicId, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.newui.home.card.expanded.holder.ReportCardExpandeHolder.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    C22392a<j760<SwipeDirection, HashMap>> c22392a = CoreModule.f17545c.f19663m0.f19346I2;
                    SwipeDirection swipeDirection = SwipeDirection.LEFT;
                    c22392a.onNext(j760.m140076a(swipeDirection, null));
                    if (ReportCardExpandeHolder.this.m167252w() instanceof ProfileAct) {
                        ReportCardExpandeHolder.this.m167252w().setResult(swipeDirection.getValue());
                        ReportCardExpandeHolder.this.m167252w().lambda$debugItems$19();
                    }
                }
            }
        }));
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m38151E(view);
        final Act act = (Act) view.getContext();
        xdl0.m208329E0(this.f22429f, new View.OnClickListener() { // from class: l.ksc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124439a.m38152F(act, view2);
            }
        });
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        User user;
        super.mo38154q(z);
        if (!z || (user = this.f22432i) == null) {
            return;
        }
        o6j0.m162870n("e_clone_swipe_to_bottom", "p_suggest_users_home_view", o6j0.C18854a.m162878h("receiver_user_id", user.f56011id));
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: r */
    public void mo38155r() {
        super.mo38155r();
        mkd0.m154992z(this.f22433j);
    }
}
