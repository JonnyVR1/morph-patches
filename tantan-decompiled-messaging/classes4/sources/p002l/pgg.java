package p002l;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import com.tantanapp.common.data.DbObject;
import l.c4g0;
import l.d1q;
import l.e30;
import l.ffw;
import l.hxs;
import l.imf0;
import l.mkd0;
import l.sxj;
import l.xdl0;
import rx.c;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pgg extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17302a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f17303b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f17304c;

    /* JADX INFO: renamed from: d */
    public View f17305d;

    /* JADX INFO: renamed from: e */
    public VText f17306e;

    /* JADX INFO: renamed from: f */
    public VText f17307f;

    /* JADX INFO: renamed from: g */
    public VText f17308g;

    /* JADX INFO: renamed from: h */
    public BFansRecallUser f17309h;

    /* JADX INFO: renamed from: i */
    public gm0 f17310i;

    /* JADX INFO: renamed from: j */
    public c4g0 f17311j;

    /* JADX INFO: renamed from: k */
    public final x8g f17312k;

    public pgg(x8g x8gVar) {
        this.f17312k = x8gVar;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m20263I(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public BFansRecallUser m20266L() {
        return this.f17309h;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m20267N(imf0 imf0Var) {
        xdl0.M0(this.f17303b, true);
        this.f17303b.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m20268O(View view) {
        this.f17312k.m25766v4(this.f17309h.userId);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m20269P(View view) {
        xgg.m25929d(((DbObject) this.f17312k.m25547E2().m14582l0()).id, this.f17312k.m25547E2().m17235k(), "message");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f17309h.userId);
        this.f17312k.m25548F2().FansRecallEvent.showEditDialog().j(new wgg(false, jSONArray.toJSONString()));
    }

    /* JADX INFO: renamed from: Q */
    public void m20270Q(BFansRecallUser bFansRecallUser, gm0 gm0Var) {
        this.f17309h = bFansRecallUser;
        this.f17310i = gm0Var;
    }

    /* JADX INFO: renamed from: R */
    public void m20271R(BFansRecallUser bFansRecallUser) {
        this.f17309h = bFansRecallUser;
    }

    /* JADX INFO: renamed from: S */
    public void m20272S() {
        VText vText = this.f17308g;
        if (vText == null) {
            return;
        }
        BFansRecallUser bFansRecallUser = this.f17309h;
        if (!bFansRecallUser.following) {
            vText.setEnabled(true);
            this.f17308g.setText(R$string.f2669D4);
            xdl0.E0(this.f17308g, new View.OnClickListener() { // from class: l.ngg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16018a.m20268O(view);
                }
            });
        } else if (bFansRecallUser.isRecalled) {
            vText.setEnabled(false);
            this.f17308g.setText(R$string.f3364jb);
        } else {
            vText.setEnabled(true);
            this.f17308g.setText(R$string.f2808Jb);
            xdl0.E0(this.f17308g, new View.OnClickListener() { // from class: l.ogg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16578a.m20269P(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public void m20273m(View view) {
        super.m(view);
    }

    /* JADX INFO: renamed from: o */
    public int m20274o() {
        return t6c0.f19624O0;
    }

    /* JADX INFO: renamed from: u */
    public void m20275u(View view) {
        super.u(view);
        this.f17302a = view.findViewById(g5c0.f11204t);
        this.f17305d = view.findViewById(g5c0.f11263z4);
        this.f17306e = view.findViewById(g5c0.f11067e4);
        this.f17303b = view.findViewById(g5c0.f10826E1);
        this.f17304c = view.findViewById(g5c0.f10940Q7);
        this.f17307f = view.findViewById(g5c0.f11034b1);
        this.f17308g = view.findViewById(g5c0.f10995X);
        mkd0.z(this.f17311j);
        hxs.o("context_livingAct", this.f17302a, this.f17309h.avatar);
        this.f17305d.setVisibility(this.f17309h.isOnline ? 0 : 8);
        this.f17306e.setText(this.f17309h.name);
        this.f17307f.setText(this.f17309h.desc);
        m20272S();
        c<imf0> cVarM14298h = h9g.m14298h(this.f17309h.fanbaseGrade, this.f17310i.f11510b);
        if (cVarM14298h != null) {
            this.f17311j = this.f17312k.duringCreated(cVarM14298h).subscribe(ffw.e(new e30() { // from class: l.lgg
                public final void call(Object obj) {
                    this.f14856a.m20267N((imf0) obj);
                }
            }, new e30() { // from class: l.mgg
                public final void call(Object obj) {
                    pgg.m20263I((Throwable) obj);
                }
            }));
        } else {
            xdl0.M0(this.f17303b, false);
        }
        BFansRecallUser bFansRecallUser = this.f17309h;
        sxj.c(bFansRecallUser.getGradleUrl(), this.f17304c, bFansRecallUser.grade >= 38 ? sxj.b : sxj.a);
    }

    /* JADX INFO: renamed from: w */
    public void m20276w(View view) {
        super.w(view);
        mkd0.z(this.f17311j);
    }
}
