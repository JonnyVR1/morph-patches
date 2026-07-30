package p149l;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class hxp extends d1q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public User f109899a;

    /* JADX INFO: renamed from: b */
    public BLiveCallInvite f109900b;

    /* JADX INFO: renamed from: c */
    public e30<String> f109901c;

    /* JADX INFO: renamed from: d */
    public e30<String> f109902d;

    public hxp(BLiveCallInvite bLiveCallInvite, User user) {
        this.f109900b = bLiveCallInvite;
        this.f109899a = user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m133358L(View view) {
        m133360P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m133359N(View view) {
        m133361J(this.f109902d, this.f109899a.f56011id);
    }

    /* JADX INFO: renamed from: P */
    private void m133360P() {
        if (TEnum.equals(this.f109900b.state, "not-invited")) {
            m133361J(this.f109901c, this.f109899a.f56011id);
        }
    }

    /* JADX INFO: renamed from: J */
    public final <T> void m133361J(e30<T> e30Var, T t) {
        if (e30Var == null || t == null) {
            return;
        }
        e30Var.call(t);
    }

    /* JADX INFO: renamed from: K */
    public User m133362K() {
        return this.f109899a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RelativeLayout relativeLayout) {
        super.mo70566u(relativeLayout);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(g5c0.f100803S2);
        TextView textView = (TextView) relativeLayout.findViewById(g5c0.f101026p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(g5c0.f100890b7);
        VDraweeView vDraweeView2 = (VDraweeView) relativeLayout.findViewById(g5c0.f100790Q7);
        TextView textView3 = (TextView) relativeLayout.findViewById(g5c0.f100920e7);
        TextView textView4 = (TextView) relativeLayout.findViewById(g5c0.f100999m7);
        hxs.m133405r("context_single_room", vDraweeView, this.f109899a.m60124fp().profileSmall());
        textView.setText(this.f109899a.name);
        textView3.setText(x8u.m207433c(this.f109900b.rewardPoint) + relativeLayout.getContext().getString(R$string.f47014V5));
        BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(this.f109899a.hierarchy.grade);
        if (this.f109899a.hierarchy.grade == 0 || bLiveUserLevelM126036v == null) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            hxs.m133406s("context_livingAct", vDraweeView2, bLiveUserLevelM126036v.backendUrl);
            xdl0.m208344M(vDraweeView2, true);
        }
        deu.m111398a(this.f109899a.isFemale(), this.f109899a.age.intValue(), textView2);
        if (TEnum.equals(this.f109900b.state, "unknown_") || TEnum.equals(this.f109900b.state, "not-invited")) {
            textView4.setText(R$string.f46783K6);
            textView4.setBackgroundResource(i3c0.f111238z0);
            textView4.setTextColor(-1);
        } else {
            textView4.setText(R$string.f46805L6);
            textView4.setTextColor(-4210753);
            textView4.setBackgroundResource(i3c0.f111046j0);
        }
        xdl0.m208329E0(textView4, new View.OnClickListener() { // from class: l.fxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99781a.m133358L(view);
            }
        });
        xdl0.m208329E0(relativeLayout, new View.OnClickListener() { // from class: l.gxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104913a.m133359N(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public hxp m133364Q(e30<String> e30Var) {
        this.f109901c = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public hxp m133365R(e30<String> e30Var) {
        this.f109902d = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m133366S(BLiveCallInvite bLiveCallInvite) {
        this.f109900b = bLiveCallInvite;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168043H;
    }
}
