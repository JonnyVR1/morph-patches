package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class o34 implements s7m<a44> {

    /* JADX INFO: renamed from: a */
    public View f141610a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f141611b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f141612c;

    /* JADX INFO: renamed from: d */
    public TextView f141613d;

    /* JADX INFO: renamed from: e */
    public TextView f141614e;

    /* JADX INFO: renamed from: f */
    public CallManageItemView f141615f;

    /* JADX INFO: renamed from: g */
    public CallManageItemView f141616g;

    /* JADX INFO: renamed from: h */
    public CallManageItemView f141617h;

    /* JADX INFO: renamed from: i */
    public CallManageItemView f141618i;

    /* JADX INFO: renamed from: j */
    public CallManageItemView f141619j;

    /* JADX INFO: renamed from: k */
    public CallManageItemView f141620k;

    /* JADX INFO: renamed from: l */
    public CallManageItemView f141621l;

    /* JADX INFO: renamed from: m */
    public DialogC12611a f141622m;

    /* JADX INFO: renamed from: n */
    public a44 f141623n;

    /* JADX INFO: renamed from: r */
    private void m162387r() {
        xdl0.m208329E0(this.f141611b, new View.OnClickListener() { // from class: l.i34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110607a.m162388s(view);
            }
        });
        xdl0.m208329E0(this.f141615f, new View.OnClickListener() { // from class: l.j34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115999a.m162389u(view);
            }
        });
        xdl0.m208329E0(this.f141616g, new View.OnClickListener() { // from class: l.k34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120793a.m162390v(view);
            }
        });
        xdl0.m208329E0(this.f141621l, new View.OnClickListener() { // from class: l.l34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125842a.m162391w(view);
            }
        });
        xdl0.m208329E0(this.f141620k, new View.OnClickListener() { // from class: l.m34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131011a.m162392x(view);
            }
        });
        xdl0.m208329E0(this.f141610a, new View.OnClickListener() { // from class: l.n34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136909a.m162393y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m162388s(View view) {
        this.f141623n.m94792i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m162389u(View view) {
        this.f141623n.m94791h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m162390v(View view) {
        this.f141623n.m94790g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m162391w(View view) {
        this.f141623n.m94777T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m162392x(View view) {
        this.f141623n.mo94780W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m162393y(View view) {
        this.f141623n.mo94776S3();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m162394A(View view) {
        this.f141623n.mo94795l4();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m162395B(View view) {
        this.f141623n.mo94781X3();
    }

    /* JADX INFO: renamed from: C */
    public void m162396C(BLiveCall bLiveCall, i54 i54Var) {
        xdl0.m208344M(this.f141620k, false);
        if (i54Var == null) {
            return;
        }
        h54.m129377d("callManageDialog setData " + bLiveCall.toString());
        this.f141613d.setText(i54Var.f111521b);
        hxs.m133406s("context_single_room", this.f141612c, i54Var.f111522c);
        this.f141614e.setText(x8u.m207433c(bLiveCall.userRecvRewardPoint));
        this.f141615f.m75900b(i3c0.f110941a3).m75905g(R$string.f47390md);
        this.f141616g.m75900b(i3c0.f111215x1);
        this.f141621l.m75900b(i3c0.f111155s1).m75905g(R$string.f46561A4);
        this.f141620k.m75900b(i3c0.f111203w1);
        m162397E(bLiveCall);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f141623n.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m162397E(BLiveCall bLiveCall) {
        StringBuilder sb = new StringBuilder("callManageDialog setMuteStatus: ");
        sb.append(bLiveCall.mutedByUser || bLiveCall.mutedByAnchor);
        h54.m129377d(sb.toString());
        if (!bLiveCall.mutedByUser && !bLiveCall.mutedByAnchor) {
            this.f141616g.m75907i(Color.parseColor("#212121"));
            this.f141616g.m75901c(1.0f);
            this.f141616g.m75905g(R$string.f47518s9);
            this.f141616g.m75900b(i3c0.f111215x1);
            return;
        }
        if (!(this.f141623n.m206032L2() && bLiveCall.mutedByAnchor) && (this.f141623n.m206032L2() || !bLiveCall.mutedByUser)) {
            this.f141616g.m75901c(0.3f);
            this.f141616g.m75907i(Color.parseColor("#bfbfbf"));
            this.f141616g.m75905g(R$string.f47518s9);
            this.f141616g.m75900b(i3c0.f111215x1);
            return;
        }
        this.f141616g.m75901c(1.0f);
        this.f141616g.m75905g(R$string.f46968T1);
        this.f141616g.m75900b(i3c0.f111227y1);
        this.f141616g.m75907i(Color.parseColor("#212121"));
    }

    /* JADX INFO: renamed from: F */
    public void m162398F(boolean z) {
        xdl0.m208344M(this.f141617h, z);
        xdl0.m208344M(this.f141618i, z);
        xdl0.m208344M(this.f141619j, z);
        if (z) {
            xdl0.m208329E0(this.f141617h, new View.OnClickListener() { // from class: l.f34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94244a.m162405z(view);
                }
            });
            xdl0.m208329E0(this.f141618i, new View.OnClickListener() { // from class: l.g34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f100339a.m162394A(view);
                }
            });
            xdl0.m208329E0(this.f141619j, new View.OnClickListener() { // from class: l.h34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f105576a.m162395B(view);
                }
            });
            this.f141617h.m75900b(i3c0.f111095n1).m75905g(R$string.f47201e);
            this.f141618i.m75900b(i3c0.f110663C1).m75905g(R$string.f47245g);
            this.f141619j.m75900b(i3c0.f111179u1).m75905g(R$string.f46888P5);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m162399G(@NonNull BLiveCall bLiveCall, i54 i54Var) {
        if (this.f141622m == null) {
            this.f141622m = new byr(this.f141623n, m162400l(act().inflater(), null));
            m162387r();
            m162398F(false);
        }
        m162396C(bLiveCall, i54Var);
        this.f141622m.show();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f141623n.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        m162402n();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public View m162400l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p34.m167242b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a44 a44Var) {
        this.f141623n = a44Var;
    }

    /* JADX INFO: renamed from: n */
    public void m162402n() {
        uep0.m193327n(this.f141622m);
    }

    /* JADX INFO: renamed from: p */
    public void m162403p(boolean z, String str) {
        h54.m129377d("callManageDialog enableVideo: " + z);
        xdl0.m208344M(this.f141620k, true);
        this.f141620k.setEnabled(z);
        this.f141620k.m75906h(str);
        CallManageItemView callManageItemView = this.f141620k;
        if (z) {
            callManageItemView.m75901c(1.0f);
            this.f141620k.m75907i(Color.parseColor("#212121"));
        } else {
            callManageItemView.m75901c(0.3f);
            this.f141620k.m75907i(Color.parseColor("#bfbfbf"));
        }
    }

    /* JADX INFO: renamed from: q */
    public Boolean m162404q() {
        return Boolean.valueOf(uep0.m193339z(this.f141622m));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m162405z(View view) {
        this.f141623n.mo94793j4();
    }
}
