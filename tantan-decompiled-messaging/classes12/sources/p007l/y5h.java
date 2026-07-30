package p007l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.xh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y5h implements r5h {

    /* JADX INFO: renamed from: a */
    public Act f15264a;

    /* JADX INFO: renamed from: b */
    public xh0 f15265b;

    public y5h(Act act) {
        this.f15264a = act;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m16938e(d30 d30Var, Envelope envelope) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // p007l.r5h
    /* JADX INFO: renamed from: a */
    public void mo13832a(tek tekVar, d30 d30Var) {
        m16946m(tekVar);
    }

    @Override // p007l.r5h
    /* JADX INFO: renamed from: b */
    public void mo13833b(final tek tekVar, final d30 d30Var) {
        xh0.a aVar = new xh0.a(this.f15264a);
        aVar.j("确认要退出" + tekVar.m14504i() + "？").r("再想想").o(new View.OnClickListener() { // from class: l.s5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12798a.m16942i(view);
            }
        }).f("确认").m(new DialogInterface.OnDismissListener() { // from class: l.t5h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q770.m13441l0(false);
            }
        }).c(new View.OnClickListener() { // from class: l.u5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13548a.m16943j(tekVar, d30Var, view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f15265b = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m16942i(View view) {
        this.f15265b.c();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m16943j(tek tekVar, d30 d30Var, View view) {
        this.f15265b.c();
        m16945l(tekVar, d30Var);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m16944k(tek tekVar, j9h j9hVar) {
        Act act = this.f15264a;
        oe40.m12548M(act, new NewPostAct.C2088a(act).m3697c("nearby").m3698d(tekVar.m14500e()).m3700f(vwb.f0(new Media[0])));
        oe40.m12550O(this.f15264a, null, "nearby");
        j9hVar.dismiss();
        p6j0.m12913c("e_moment_post", "p_circle_detail_join_popup", j760.a("album_post_source", "circle_ popup"));
    }

    /* JADX INFO: renamed from: l */
    public void m16945l(tek tekVar, final d30 d30Var) {
        this.f15264a.duringCreated(FeedModule.f316d.m16599a7(tekVar.m14500e(), ((DbObject) FeedModule.m1140H().me_()).id)).subscribe(mkd0.H(new e30() { // from class: l.w5h
            public final void call(Object obj) {
                y5h.m16938e(d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.x5h
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m16946m(final tek tekVar) {
        String strValueOf = String.valueOf(tekVar.m14506k() + 1);
        String strM14504i = tekVar.m14504i();
        StringBuilder sb = new StringBuilder("欢迎来到");
        sb.append(strM14504i);
        sb.append("，发布 1 条动态，即可成为第 ");
        sb.append(strValueOf);
        sb.append(" 位");
        sb.append(tekVar.m14497b().isGroupAnonymousType() ? "圈友" : tekVar.m14497b().memberRole);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f15264a.getResources().getColor(e1c0.f7154n)), strM14504i.length() + 8, strM14504i.length() + 9, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f15264a.getResources().getColor(e1c0.f7154n)), strM14504i.length() + 20, strM14504i.length() + 20 + strValueOf.length(), 33);
        final j9h j9hVarM11116F = new j9h(this.f15264a, a8c0.f5636e).m11120u(spannableStringBuilder).m11116F(tekVar.m14497b().headIcon);
        j9hVarM11116F.m11118H(false);
        j9hVarM11116F.m11113C(new Runnable() { // from class: l.v5h
            @Override // java.lang.Runnable
            public final void run() {
                this.f14069a.m16944k(tekVar, j9hVarM11116F);
            }
        });
        j9hVarM11116F.show();
    }
}
