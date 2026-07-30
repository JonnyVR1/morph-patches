package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ugg extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public VImage f176380a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f176381b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f176382c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f176383d;

    /* JADX INFO: renamed from: e */
    public View f176384e;

    /* JADX INFO: renamed from: f */
    public VText f176385f;

    /* JADX INFO: renamed from: g */
    public VText f176386g;

    /* JADX INFO: renamed from: h */
    public c4g0 f176387h;

    /* JADX INFO: renamed from: i */
    public final mcr f176388i;

    /* JADX INFO: renamed from: j */
    public BFansRecallUser f176389j;

    /* JADX INFO: renamed from: k */
    public gm0 f176390k;

    /* JADX INFO: renamed from: l */
    public y2m f176391l;

    public ugg(mcr mcrVar, y2m y2mVar) {
        this.f176388i = mcrVar;
        this.f176391l = y2mVar;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m193555H(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m193558L(imf0 imf0Var) {
        xdl0.m208345M0(this.f176382c, true);
        this.f176382c.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: K */
    public BFansRecallUser m193559K() {
        return this.f176389j;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m193560N(View view) {
        VImage vImage = this.f176380a;
        vImage.setSelected(!vImage.isSelected());
        this.f176389j.setSelected(this.f176380a.isSelected());
        y2m y2mVar = this.f176391l;
        if (y2mVar != null) {
            y2mVar.mo96309a(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m193561O(BFansRecallUser bFansRecallUser, gm0 gm0Var) {
        this.f176389j = bFansRecallUser;
        this.f176390k = gm0Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: m */
    public void mo70999m(View view) {
        super.mo70999m(view);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168140P0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        this.f176380a = (VImage) view.findViewById(g5c0.f100680E5);
        this.f176381b = (VDraweeView) view.findViewById(g5c0.f101054t);
        this.f176384e = view.findViewById(g5c0.f101113z4);
        this.f176385f = (VText) view.findViewById(g5c0.f100917e4);
        this.f176382c = (VDraweeView) view.findViewById(g5c0.f100676E1);
        this.f176383d = (VDraweeView) view.findViewById(g5c0.f100790Q7);
        this.f176386g = (VText) view.findViewById(g5c0.f100884b1);
        mkd0.m154992z(this.f176387h);
        hxs.m133402o("context_livingAct", this.f176381b, this.f176389j.avatar);
        this.f176384e.setVisibility(this.f176389j.isOnline ? 0 : 8);
        this.f176385f.setText(this.f176389j.name);
        this.f176386g.setText(this.f176389j.desc);
        C22306c<imf0> c22306cM129999h = h9g.m129999h(this.f176389j.fanbaseGrade, this.f176390k.f103418b);
        if (c22306cM129999h != null) {
            this.f176387h = this.f176388i.duringCreated(c22306cM129999h).subscribe(ffw.m121194e(new e30() { // from class: l.rgg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159247a.m193558L((imf0) obj);
                }
            }, new e30() { // from class: l.sgg
                @Override // p149l.e30
                public final void call(Object obj) {
                    ugg.m193555H((Throwable) obj);
                }
            }));
        } else {
            xdl0.m208345M0(this.f176382c, false);
        }
        BFansRecallUser bFansRecallUser = this.f176389j;
        sxj.m186442c(bFansRecallUser.getGradleUrl(), this.f176383d, bFansRecallUser.grade >= 38 ? sxj.f166798b : sxj.f166797a);
        this.f176380a.setSelected(this.f176389j.isSelected());
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.tgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f170094a.m193560N(view2);
            }
        });
    }
}
