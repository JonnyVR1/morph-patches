package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class n44 implements iam<z44> {

    /* JADX INFO: renamed from: a */
    public View f140166a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f140167b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f140168c;

    /* JADX INFO: renamed from: d */
    public TextView f140169d;

    /* JADX INFO: renamed from: e */
    public TextView f140170e;

    /* JADX INFO: renamed from: f */
    public CallManageItemView f140171f;

    /* JADX INFO: renamed from: g */
    public CallManageItemView f140172g;

    /* JADX INFO: renamed from: h */
    public CallManageItemView f140173h;

    /* JADX INFO: renamed from: i */
    public CallManageItemView f140174i;

    /* JADX INFO: renamed from: j */
    public CallManageItemView f140175j;

    /* JADX INFO: renamed from: k */
    public CallManageItemView f140176k;

    /* JADX INFO: renamed from: l */
    public CallManageItemView f140177l;

    /* JADX INFO: renamed from: m */
    public DialogC12774a f140178m;

    /* JADX INFO: renamed from: n */
    public z44 f140179n;

    /* JADX INFO: renamed from: r */
    private void m161518r() {
        bnl0.m105509E0(this.f140167b, new View.OnClickListener() { // from class: l.h44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107751a.m161519s(view);
            }
        });
        bnl0.m105509E0(this.f140171f, new View.OnClickListener() { // from class: l.i44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112828a.m161520u(view);
            }
        });
        bnl0.m105509E0(this.f140172g, new View.OnClickListener() { // from class: l.j44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118258a.m161521v(view);
            }
        });
        bnl0.m105509E0(this.f140177l, new View.OnClickListener() { // from class: l.k44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123826a.m161522w(view);
            }
        });
        bnl0.m105509E0(this.f140176k, new View.OnClickListener() { // from class: l.l44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129928a.m161523x(view);
            }
        });
        bnl0.m105509E0(this.f140166a, new View.OnClickListener() { // from class: l.m44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134746a.m161524y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m161519s(View view) {
        this.f140179n.m218546i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m161520u(View view) {
        this.f140179n.m218545h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m161521v(View view) {
        this.f140179n.m218544g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m161522w(View view) {
        this.f140179n.m218534T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m161523x(View view) {
        this.f140179n.mo95317W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m161524y(View view) {
        this.f140179n.mo95315S3();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m161525A(View view) {
        this.f140179n.mo188844l4();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m161526B(View view) {
        this.f140179n.mo188842X3();
    }

    /* JADX INFO: renamed from: C */
    public void m161527C(BLiveCall bLiveCall, h64 h64Var) {
        bnl0.m105524M(this.f140176k, false);
        if (h64Var == null) {
            return;
        }
        g64.m129083d("callManageDialog setData " + bLiveCall.toString());
        this.f140169d.setText(h64Var.f107998b);
        izs.m142868s("context_single_room", this.f140168c, h64Var.f107999c);
        this.f140170e.setText(yau.m214935c(bLiveCall.userRecvRewardPoint));
        this.f140171f.m77083b(obc0.f146269a3).m77088g(R$string.f48238md);
        this.f140172g.m77083b(obc0.f146543x1);
        this.f140177l.m77083b(obc0.f146483s1).m77088g(R$string.f47409A4);
        this.f140176k.m77083b(obc0.f146531w1);
        m161528E(bLiveCall);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f140179n.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m161528E(BLiveCall bLiveCall) {
        StringBuilder sb = new StringBuilder("callManageDialog setMuteStatus: ");
        sb.append(bLiveCall.mutedByUser || bLiveCall.mutedByAnchor);
        g64.m129083d(sb.toString());
        if (!bLiveCall.mutedByUser && !bLiveCall.mutedByAnchor) {
            this.f140172g.m77090i(Color.parseColor("#212121"));
            this.f140172g.m77084c(1.0f);
            this.f140172g.m77088g(R$string.f48366s9);
            this.f140172g.m77083b(obc0.f146543x1);
            return;
        }
        if (!(this.f140179n.m213815L2() && bLiveCall.mutedByAnchor) && (this.f140179n.m213815L2() || !bLiveCall.mutedByUser)) {
            this.f140172g.m77084c(0.3f);
            this.f140172g.m77090i(Color.parseColor("#bfbfbf"));
            this.f140172g.m77088g(R$string.f48366s9);
            this.f140172g.m77083b(obc0.f146543x1);
            return;
        }
        this.f140172g.m77084c(1.0f);
        this.f140172g.m77088g(R$string.f47816T1);
        this.f140172g.m77083b(obc0.f146555y1);
        this.f140172g.m77090i(Color.parseColor("#212121"));
    }

    /* JADX INFO: renamed from: F */
    public void m161529F(boolean z) {
        bnl0.m105524M(this.f140173h, z);
        bnl0.m105524M(this.f140174i, z);
        bnl0.m105524M(this.f140175j, z);
        if (z) {
            bnl0.m105509E0(this.f140173h, new View.OnClickListener() { // from class: l.e44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92050a.m161536z(view);
                }
            });
            bnl0.m105509E0(this.f140174i, new View.OnClickListener() { // from class: l.f44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97049a.m161525A(view);
                }
            });
            bnl0.m105509E0(this.f140175j, new View.OnClickListener() { // from class: l.g44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102131a.m161526B(view);
                }
            });
            this.f140173h.m77083b(obc0.f146423n1).m77088g(R$string.f48049e);
            this.f140174i.m77083b(obc0.f145991C1).m77088g(R$string.f48093g);
            this.f140175j.m77083b(obc0.f146507u1).m77088g(R$string.f47736P5);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m161530G(@NonNull BLiveCall bLiveCall, h64 h64Var) {
        if (this.f140178m == null) {
            this.f140178m = new c0s(this.f140179n, m161531l(act().inflater(), null));
            m161518r();
            m161529F(false);
        }
        m161527C(bLiveCall, h64Var);
        this.f140178m.show();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f140179n.act();
    }

    @Override // p153l.iam
    public void destroy() {
        m161533n();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public View m161531l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o44.m165968b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z44 z44Var) {
        this.f140179n = z44Var;
    }

    /* JADX INFO: renamed from: n */
    public void m161533n() {
        ynp0.m216937n(this.f140178m);
    }

    /* JADX INFO: renamed from: p */
    public void m161534p(boolean z, String str) {
        g64.m129083d("callManageDialog enableVideo: " + z);
        bnl0.m105524M(this.f140176k, true);
        this.f140176k.setEnabled(z);
        this.f140176k.m77089h(str);
        CallManageItemView callManageItemView = this.f140176k;
        if (z) {
            callManageItemView.m77084c(1.0f);
            this.f140176k.m77090i(Color.parseColor("#212121"));
        } else {
            callManageItemView.m77084c(0.3f);
            this.f140176k.m77090i(Color.parseColor("#bfbfbf"));
        }
    }

    /* JADX INFO: renamed from: q */
    public Boolean m161535q() {
        return Boolean.valueOf(ynp0.m216949z(this.f140178m));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m161536z(View view) {
        this.f140179n.mo188843j4();
    }
}
