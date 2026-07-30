package com.p051p1.mobile.putong.core.newui.home.card.expanded.holder;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.data.User;
import java.util.HashMap;
import p137rx.subjects.C22507a;
import p151v.VFrame;
import p153l.bnl0;
import p153l.f6l;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.q0d0;
import p153l.sfj0;

/* JADX INFO: loaded from: classes11.dex */
public class ReportCardExpandeHolder extends f6l {

    /* JADX INFO: renamed from: f */
    public VFrame f23171f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f23172g;

    /* JADX INFO: renamed from: h */
    public CoreSuggested.UserInfo f23173h;

    /* JADX INFO: renamed from: i */
    public User f23174i;

    /* JADX INFO: renamed from: j */
    public kcg0 f23175j;

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f23173h = userInfo;
        this.f23174i = user;
        this.f23172g.setText(App.f16088e.getString(R$string.f19602r1) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user.name);
    }

    /* JADX INFO: renamed from: E */
    public final void m39154E(View view) {
        q0d0.m174688a(this, view);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m39155F(Act act, View view) {
        String str = this.f23174i.f56859id;
        act.startActivity(ReportAct.m55815g2(act, str, CoreModule.f18264c.f20384f0.m34185xh(str), this.f23174i.publicId, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.newui.home.card.expanded.holder.ReportCardExpandeHolder.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    C22507a<pf60<SwipeDirection, HashMap>> c22507a = CoreModule.f18264c.f20405m0.f20088I2;
                    SwipeDirection swipeDirection = SwipeDirection.LEFT;
                    c22507a.onNext(pf60.m172085a(swipeDirection, null));
                    if (ReportCardExpandeHolder.this.m124283w() instanceof ProfileAct) {
                        ReportCardExpandeHolder.this.m124283w().setResult(swipeDirection.getValue());
                        ReportCardExpandeHolder.this.m124283w().lambda$debugItems$19();
                    }
                }
            }
        }));
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m39154E(view);
        final Act act = (Act) view.getContext();
        bnl0.m105509E0(this.f23171f, new View.OnClickListener() { // from class: l.p0d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f150040a.m39155F(act, view2);
            }
        });
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        User user;
        super.mo39157q(z);
        if (!z || (user = this.f23174i) == null) {
            return;
        }
        sfj0.m185607n("e_clone_swipe_to_bottom", "p_suggest_users_home_view", sfj0.C20032a.m185615h("receiver_user_id", user.f56859id));
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: r */
    public void mo39158r() {
        super.mo39158r();
        psd0.m173633z(this.f23175j);
    }
}
