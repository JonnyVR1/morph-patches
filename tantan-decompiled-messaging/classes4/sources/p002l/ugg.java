package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import l.c4g0;
import l.d1q;
import l.e30;
import l.ffw;
import l.hxs;
import l.imf0;
import l.mcr;
import l.mkd0;
import l.sxj;
import l.xdl0;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ugg extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public VImage f20633a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f20634b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f20635c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f20636d;

    /* JADX INFO: renamed from: e */
    public View f20637e;

    /* JADX INFO: renamed from: f */
    public VText f20638f;

    /* JADX INFO: renamed from: g */
    public VText f20639g;

    /* JADX INFO: renamed from: h */
    public c4g0 f20640h;

    /* JADX INFO: renamed from: i */
    public final mcr f20641i;

    /* JADX INFO: renamed from: j */
    public BFansRecallUser f20642j;

    /* JADX INFO: renamed from: k */
    public gm0 f20643k;

    /* JADX INFO: renamed from: l */
    public y2m f20644l;

    public ugg(mcr mcrVar, y2m y2mVar) {
        this.f20641i = mcrVar;
        this.f20644l = y2mVar;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m23449H(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m23452L(imf0 imf0Var) {
        xdl0.M0(this.f20635c, true);
        this.f20635c.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: K */
    public BFansRecallUser m23453K() {
        return this.f20642j;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m23454N(View view) {
        VImage vImage = this.f20633a;
        vImage.setSelected(!vImage.isSelected());
        this.f20642j.setSelected(this.f20633a.isSelected());
        y2m y2mVar = this.f20644l;
        if (y2mVar != null) {
            y2mVar.mo9632a(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m23455O(BFansRecallUser bFansRecallUser, gm0 gm0Var) {
        this.f20642j = bFansRecallUser;
        this.f20643k = gm0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m23456m(View view) {
        super.m(view);
    }

    /* JADX INFO: renamed from: o */
    public int m23457o() {
        return t6c0.f19636P0;
    }

    /* JADX INFO: renamed from: u */
    public void m23458u(View view) {
        super.u(view);
        this.f20633a = view.findViewById(g5c0.f10830E5);
        this.f20634b = view.findViewById(g5c0.f11204t);
        this.f20637e = view.findViewById(g5c0.f11263z4);
        this.f20638f = view.findViewById(g5c0.f11067e4);
        this.f20635c = view.findViewById(g5c0.f10826E1);
        this.f20636d = view.findViewById(g5c0.f10940Q7);
        this.f20639g = view.findViewById(g5c0.f11034b1);
        mkd0.z(this.f20640h);
        hxs.o("context_livingAct", this.f20634b, this.f20642j.avatar);
        this.f20637e.setVisibility(this.f20642j.isOnline ? 0 : 8);
        this.f20638f.setText(this.f20642j.name);
        this.f20639g.setText(this.f20642j.desc);
        c<imf0> cVarM14298h = h9g.m14298h(this.f20642j.fanbaseGrade, this.f20643k.f11510b);
        if (cVarM14298h != null) {
            this.f20640h = this.f20641i.duringCreated(cVarM14298h).subscribe(ffw.e(new e30() { // from class: l.rgg
                public final void call(Object obj) {
                    this.f18507a.m23452L((imf0) obj);
                }
            }, new e30() { // from class: l.sgg
                public final void call(Object obj) {
                    ugg.m23449H((Throwable) obj);
                }
            }));
        } else {
            xdl0.M0(this.f20635c, false);
        }
        BFansRecallUser bFansRecallUser = this.f20642j;
        sxj.c(bFansRecallUser.getGradleUrl(), this.f20636d, bFansRecallUser.grade >= 38 ? sxj.b : sxj.a);
        this.f20633a.setSelected(this.f20642j.isSelected());
        xdl0.E0(view, new View.OnClickListener() { // from class: l.tgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20229a.m23454N(view2);
            }
        });
    }
}
