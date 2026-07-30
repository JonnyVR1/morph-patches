package p153l;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dig extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f88636a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f88637b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f88638c;

    /* JADX INFO: renamed from: d */
    public View f88639d;

    /* JADX INFO: renamed from: e */
    public VText f88640e;

    /* JADX INFO: renamed from: f */
    public VText f88641f;

    /* JADX INFO: renamed from: g */
    public VText f88642g;

    /* JADX INFO: renamed from: h */
    public BFansRecallUser f88643h;

    /* JADX INFO: renamed from: i */
    public cm0 f88644i;

    /* JADX INFO: renamed from: j */
    public kcg0 f88645j;

    /* JADX INFO: renamed from: k */
    public final lag f88646k;

    public dig(lag lagVar) {
        this.f88646k = lagVar;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m115875I(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public BFansRecallUser m115878L() {
        return this.f88643h;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m115879N(ruf0 ruf0Var) {
        bnl0.m105525M0(this.f88637b, true);
        this.f88637b.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m115880O(View view) {
        this.f88646k.m153494v4(this.f88643h.userId);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2] */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m115881P(View view) {
        lig.m154374d(this.f88646k.m213810E2().m168532l0().f56859id, this.f88646k.m213810E2().m202191k(), "message");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f88643h.userId);
        this.f88646k.m213811F2().FansRecallEvent.showEditDialog().mo199273j(new kig(false, jSONArray.toJSONString()));
    }

    /* JADX INFO: renamed from: Q */
    public void m115882Q(BFansRecallUser bFansRecallUser, cm0 cm0Var) {
        this.f88643h = bFansRecallUser;
        this.f88644i = cm0Var;
    }

    /* JADX INFO: renamed from: R */
    public void m115883R(BFansRecallUser bFansRecallUser) {
        this.f88643h = bFansRecallUser;
    }

    /* JADX INFO: renamed from: S */
    public void m115884S() {
        VText vText = this.f88642g;
        if (vText == null) {
            return;
        }
        BFansRecallUser bFansRecallUser = this.f88643h;
        if (!bFansRecallUser.following) {
            vText.setEnabled(true);
            this.f88642g.setText(R$string.f47475D4);
            bnl0.m105509E0(this.f88642g, new View.OnClickListener() { // from class: l.big
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76873a.m115880O(view);
                }
            });
        } else if (bFansRecallUser.isRecalled) {
            vText.setEnabled(false);
            this.f88642g.setText(R$string.f48170jb);
        } else {
            vText.setEnabled(true);
            this.f88642g.setText(R$string.f47614Jb);
            bnl0.m105509E0(this.f88642g, new View.OnClickListener() { // from class: l.cig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81940a.m115881P(view);
                }
            });
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: m */
    public void mo72182m(View view) {
        super.mo72182m(view);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198860O0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        this.f88636a = (VDraweeView) view.findViewById(mdc0.f136299t);
        this.f88639d = view.findViewById(mdc0.f136358z4);
        this.f88640e = (VText) view.findViewById(mdc0.f136162e4);
        this.f88637b = (VDraweeView) view.findViewById(mdc0.f135921E1);
        this.f88638c = (VDraweeView) view.findViewById(mdc0.f136035Q7);
        this.f88641f = (VText) view.findViewById(mdc0.f136129b1);
        this.f88642g = (VText) view.findViewById(mdc0.f136090X);
        psd0.m173633z(this.f88645j);
        izs.m142864o("context_livingAct", this.f88636a, this.f88643h.avatar);
        this.f88639d.setVisibility(this.f88643h.isOnline ? 0 : 8);
        this.f88640e.setText(this.f88643h.name);
        this.f88641f.setText(this.f88643h.desc);
        m115884S();
        C22421c<ruf0> c22421cM200514h = vag.m200514h(this.f88643h.fanbaseGrade, this.f88644i.f82502b);
        if (c22421cM200514h != null) {
            this.f88645j = this.f88646k.duringCreated(c22421cM200514h).subscribe(dhw.m115826e(new y20() { // from class: l.zhg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204413a.m115879N((ruf0) obj);
                }
            }, new y20() { // from class: l.aig
                @Override // p153l.y20
                public final void call(Object obj) {
                    dig.m115875I((Throwable) obj);
                }
            }));
        } else {
            bnl0.m105525M0(this.f88637b, false);
        }
        BFansRecallUser bFansRecallUser = this.f88643h;
        i0k.m137976c(bFansRecallUser.getGradleUrl(), this.f88638c, bFansRecallUser.grade >= 38 ? i0k.f112379b : i0k.f112378a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: w */
    public void mo72183w(View view) {
        super.mo72183w(view);
        psd0.m173633z(this.f88645j);
    }
}
