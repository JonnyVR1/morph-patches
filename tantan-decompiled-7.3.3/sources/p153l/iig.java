package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iig extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public VImage f115089a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f115090b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f115091c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f115092d;

    /* JADX INFO: renamed from: e */
    public View f115093e;

    /* JADX INFO: renamed from: f */
    public VText f115094f;

    /* JADX INFO: renamed from: g */
    public VText f115095g;

    /* JADX INFO: renamed from: h */
    public kcg0 f115096h;

    /* JADX INFO: renamed from: i */
    public final ner f115097i;

    /* JADX INFO: renamed from: j */
    public BFansRecallUser f115098j;

    /* JADX INFO: renamed from: k */
    public cm0 f115099k;

    /* JADX INFO: renamed from: l */
    public q5m f115100l;

    public iig(ner nerVar, q5m q5mVar) {
        this.f115097i = nerVar;
        this.f115100l = q5mVar;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m140063H(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m140066L(ruf0 ruf0Var) {
        bnl0.m105525M0(this.f115091c, true);
        this.f115091c.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: K */
    public BFansRecallUser m140067K() {
        return this.f115098j;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m140068N(View view) {
        VImage vImage = this.f115089a;
        vImage.setSelected(!vImage.isSelected());
        this.f115098j.setSelected(this.f115089a.isSelected());
        q5m q5mVar = this.f115100l;
        if (q5mVar != null) {
            q5mVar.mo167701a(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m140069O(BFansRecallUser bFansRecallUser, cm0 cm0Var) {
        this.f115098j = bFansRecallUser;
        this.f115099k = cm0Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: m */
    public void mo72182m(View view) {
        super.mo72182m(view);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198872P0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        this.f115089a = (VImage) view.findViewById(mdc0.f135925E5);
        this.f115090b = (VDraweeView) view.findViewById(mdc0.f136299t);
        this.f115093e = view.findViewById(mdc0.f136358z4);
        this.f115094f = (VText) view.findViewById(mdc0.f136162e4);
        this.f115091c = (VDraweeView) view.findViewById(mdc0.f135921E1);
        this.f115092d = (VDraweeView) view.findViewById(mdc0.f136035Q7);
        this.f115095g = (VText) view.findViewById(mdc0.f136129b1);
        psd0.m173633z(this.f115096h);
        izs.m142864o("context_livingAct", this.f115090b, this.f115098j.avatar);
        this.f115093e.setVisibility(this.f115098j.isOnline ? 0 : 8);
        this.f115094f.setText(this.f115098j.name);
        this.f115095g.setText(this.f115098j.desc);
        C22421c<ruf0> c22421cM200514h = vag.m200514h(this.f115098j.fanbaseGrade, this.f115099k.f82502b);
        if (c22421cM200514h != null) {
            this.f115096h = this.f115097i.duringCreated(c22421cM200514h).subscribe(dhw.m115826e(new y20() { // from class: l.fig
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99187a.m140066L((ruf0) obj);
                }
            }, new y20() { // from class: l.gig
                @Override // p153l.y20
                public final void call(Object obj) {
                    iig.m140063H((Throwable) obj);
                }
            }));
        } else {
            bnl0.m105525M0(this.f115091c, false);
        }
        BFansRecallUser bFansRecallUser = this.f115098j;
        i0k.m137976c(bFansRecallUser.getGradleUrl(), this.f115092d, bFansRecallUser.grade >= 38 ? i0k.f112379b : i0k.f112378a);
        this.f115089a.setSelected(this.f115098j.isSelected());
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.hig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f110025a.m140068N(view2);
            }
        });
    }
}
