package p149l;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pgg extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f148692a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f148693b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f148694c;

    /* JADX INFO: renamed from: d */
    public View f148695d;

    /* JADX INFO: renamed from: e */
    public VText f148696e;

    /* JADX INFO: renamed from: f */
    public VText f148697f;

    /* JADX INFO: renamed from: g */
    public VText f148698g;

    /* JADX INFO: renamed from: h */
    public BFansRecallUser f148699h;

    /* JADX INFO: renamed from: i */
    public gm0 f148700i;

    /* JADX INFO: renamed from: j */
    public c4g0 f148701j;

    /* JADX INFO: renamed from: k */
    public final x8g f148702k;

    public pgg(x8g x8gVar) {
        this.f148702k = x8gVar;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m168715I(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public BFansRecallUser m168718L() {
        return this.f148699h;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m168719N(imf0 imf0Var) {
        xdl0.m208345M0(this.f148693b, true);
        this.f148693b.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m168720O(View view) {
        this.f148702k.m207389v4(this.f148699h.userId);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m168721P(View view) {
        xgg.m208676d(this.f148702k.m206027E2().m132146l0().f56011id, this.f148702k.m206027E2().m149814k(), "message");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f148699h.userId);
        this.f148702k.m206028F2().FansRecallEvent.showEditDialog().mo172463j(new wgg(false, jSONArray.toJSONString()));
    }

    /* JADX INFO: renamed from: Q */
    public void m168722Q(BFansRecallUser bFansRecallUser, gm0 gm0Var) {
        this.f148699h = bFansRecallUser;
        this.f148700i = gm0Var;
    }

    /* JADX INFO: renamed from: R */
    public void m168723R(BFansRecallUser bFansRecallUser) {
        this.f148699h = bFansRecallUser;
    }

    /* JADX INFO: renamed from: S */
    public void m168724S() {
        VText vText = this.f148698g;
        if (vText == null) {
            return;
        }
        BFansRecallUser bFansRecallUser = this.f148699h;
        if (!bFansRecallUser.following) {
            vText.setEnabled(true);
            this.f148698g.setText(R$string.f46627D4);
            xdl0.m208329E0(this.f148698g, new View.OnClickListener() { // from class: l.ngg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f138871a.m168720O(view);
                }
            });
        } else if (bFansRecallUser.isRecalled) {
            vText.setEnabled(false);
            this.f148698g.setText(R$string.f47322jb);
        } else {
            vText.setEnabled(true);
            this.f148698g.setText(R$string.f46766Jb);
            xdl0.m208329E0(this.f148698g, new View.OnClickListener() { // from class: l.ogg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f143858a.m168721P(view);
                }
            });
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: m */
    public void mo70999m(View view) {
        super.mo70999m(view);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168128O0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        this.f148692a = (VDraweeView) view.findViewById(g5c0.f101054t);
        this.f148695d = view.findViewById(g5c0.f101113z4);
        this.f148696e = (VText) view.findViewById(g5c0.f100917e4);
        this.f148693b = (VDraweeView) view.findViewById(g5c0.f100676E1);
        this.f148694c = (VDraweeView) view.findViewById(g5c0.f100790Q7);
        this.f148697f = (VText) view.findViewById(g5c0.f100884b1);
        this.f148698g = (VText) view.findViewById(g5c0.f100845X);
        mkd0.m154992z(this.f148701j);
        hxs.m133402o("context_livingAct", this.f148692a, this.f148699h.avatar);
        this.f148695d.setVisibility(this.f148699h.isOnline ? 0 : 8);
        this.f148696e.setText(this.f148699h.name);
        this.f148697f.setText(this.f148699h.desc);
        m168724S();
        C22306c<imf0> c22306cM129999h = h9g.m129999h(this.f148699h.fanbaseGrade, this.f148700i.f103418b);
        if (c22306cM129999h != null) {
            this.f148701j = this.f148702k.duringCreated(c22306cM129999h).subscribe(ffw.m121194e(new e30() { // from class: l.lgg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127982a.m168719N((imf0) obj);
                }
            }, new e30() { // from class: l.mgg
                @Override // p149l.e30
                public final void call(Object obj) {
                    pgg.m168715I((Throwable) obj);
                }
            }));
        } else {
            xdl0.m208345M0(this.f148693b, false);
        }
        BFansRecallUser bFansRecallUser = this.f148699h;
        sxj.m186442c(bFansRecallUser.getGradleUrl(), this.f148694c, bFansRecallUser.grade >= 38 ? sxj.f166798b : sxj.f166797a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: w */
    public void mo71000w(View view) {
        super.mo71000w(view);
        mkd0.m154992z(this.f148701j);
    }
}
