package p153l;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class hzp extends d3q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public User f112276a;

    /* JADX INFO: renamed from: b */
    public BLiveCallInvite f112277b;

    /* JADX INFO: renamed from: c */
    public y20<String> f112278c;

    /* JADX INFO: renamed from: d */
    public y20<String> f112279d;

    public hzp(BLiveCallInvite bLiveCallInvite, User user) {
        this.f112277b = bLiveCallInvite;
        this.f112276a = user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m137907L(View view) {
        m137909P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m137908N(View view) {
        m137910J(this.f112279d, this.f112276a.f56859id);
    }

    /* JADX INFO: renamed from: P */
    private void m137909P() {
        if (TEnum.equals(this.f112277b.state, "not-invited")) {
            m137910J(this.f112278c, this.f112276a.f56859id);
        }
    }

    /* JADX INFO: renamed from: J */
    public final <T> void m137910J(y20<T> y20Var, T t) {
        if (y20Var == null || t == null) {
            return;
        }
        y20Var.call(t);
    }

    /* JADX INFO: renamed from: K */
    public User m137911K() {
        return this.f112276a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RelativeLayout relativeLayout) {
        super.mo71749u(relativeLayout);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(mdc0.f136048S2);
        TextView textView = (TextView) relativeLayout.findViewById(mdc0.f136271p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(mdc0.f136135b7);
        VDraweeView vDraweeView2 = (VDraweeView) relativeLayout.findViewById(mdc0.f136035Q7);
        TextView textView3 = (TextView) relativeLayout.findViewById(mdc0.f136165e7);
        TextView textView4 = (TextView) relativeLayout.findViewById(mdc0.f136244m7);
        izs.m142867r("context_single_room", vDraweeView, this.f112276a.m61308fp().profileSmall());
        textView.setText(this.f112276a.name);
        textView3.setText(yau.m214935c(this.f112277b.rewardPoint) + relativeLayout.getContext().getString(R$string.f47862V5));
        BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(this.f112276a.hierarchy.grade);
        if (this.f112276a.hierarchy.grade == 0 || bLiveUserLevelM135170v == null) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            izs.m142868s("context_livingAct", vDraweeView2, bLiveUserLevelM135170v.backendUrl);
            bnl0.m105524M(vDraweeView2, true);
        }
        egu.m120806a(this.f112276a.isFemale(), this.f112276a.age.intValue(), textView2);
        if (TEnum.equals(this.f112277b.state, "unknown_") || TEnum.equals(this.f112277b.state, "not-invited")) {
            textView4.setText(R$string.f47631K6);
            textView4.setBackgroundResource(obc0.f146566z0);
            textView4.setTextColor(-1);
        } else {
            textView4.setText(R$string.f47653L6);
            textView4.setTextColor(-4210753);
            textView4.setBackgroundResource(obc0.f146374j0);
        }
        bnl0.m105509E0(textView4, new View.OnClickListener() { // from class: l.fzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101493a.m137907L(view);
            }
        });
        bnl0.m105509E0(relativeLayout, new View.OnClickListener() { // from class: l.gzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107218a.m137908N(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public hzp m137913Q(y20<String> y20Var) {
        this.f112278c = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public hzp m137914R(y20<String> y20Var) {
        this.f112279d = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m137915S(BLiveCallInvite bLiveCallInvite) {
        this.f112277b = bLiveCallInvite;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198775H;
    }
}
