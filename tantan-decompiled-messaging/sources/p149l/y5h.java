package p149l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;

/* JADX INFO: loaded from: classes12.dex */
public class y5h implements r5h {

    /* JADX INFO: renamed from: a */
    public Act f196437a;

    /* JADX INFO: renamed from: b */
    public xh0 f196438b;

    public y5h(Act act) {
        this.f196437a = act;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m212990e(d30 d30Var, Envelope envelope) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // p149l.r5h
    /* JADX INFO: renamed from: a */
    public void mo177943a(tek tekVar, d30 d30Var) {
        m212998m(tekVar);
    }

    @Override // p149l.r5h
    /* JADX INFO: renamed from: b */
    public void mo177944b(final tek tekVar, final d30 d30Var) {
        xh0.C21150a c21150a = new xh0.C21150a(this.f196437a);
        c21150a.m208731j("确认要退出" + tekVar.m188517i() + "？").m208739r("再想想").m208736o(new View.OnClickListener() { // from class: l.s5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162553a.m212994i(view);
            }
        }).m208727f("确认").m208734m(new DialogInterface.OnDismissListener() { // from class: l.t5h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q770.m173197l0(false);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.u5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174708a.m212995j(tekVar, d30Var, view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f196438b = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m212994i(View view) {
        this.f196438b.m208717c();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m212995j(tek tekVar, d30 d30Var, View view) {
        this.f196438b.m208717c();
        m212997l(tekVar, d30Var);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m212996k(tek tekVar, j9h j9hVar) {
        Act act = this.f196437a;
        oe40.m163811M(act, new NewPostAct.C11244a(act).m62692c("nearby").m62693d(tekVar.m188513e()).m62695f(vwb.m200324f0(new Media[0])));
        oe40.m163813O(this.f196437a, null, "nearby");
        j9hVar.dismiss();
        p6j0.m167669c("e_moment_post", "p_circle_detail_join_popup", j760.m140076a("album_post_source", "circle_ popup"));
    }

    /* JADX INFO: renamed from: l */
    public void m212997l(tek tekVar, final d30 d30Var) {
        this.f196437a.duringCreated(FeedModule.f38855d.m209418a7(tekVar.m188513e(), FeedModule.m60222H().me_().f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.w5h
            @Override // p149l.e30
            public final void call(Object obj) {
                y5h.m212990e(d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.x5h
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m212998m(final tek tekVar) {
        String strValueOf = String.valueOf(tekVar.m188519k() + 1);
        String strM188517i = tekVar.m188517i();
        StringBuilder sb = new StringBuilder("欢迎来到");
        sb.append(strM188517i);
        sb.append("，发布 1 条动态，即可成为第 ");
        sb.append(strValueOf);
        sb.append(" 位");
        sb.append(tekVar.m188510b().isGroupAnonymousType() ? "圈友" : tekVar.m188510b().memberRole);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f196437a.getResources().getColor(e1c0.f88798n)), strM188517i.length() + 8, strM188517i.length() + 9, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f196437a.getResources().getColor(e1c0.f88798n)), strM188517i.length() + 20, strM188517i.length() + 20 + strValueOf.length(), 33);
        final j9h j9hVarM140561F = new j9h(this.f196437a, a8c0.f68016e).m140565u(spannableStringBuilder).m140561F(tekVar.m188510b().headIcon);
        j9hVarM140561F.m140563H(false);
        j9hVarM140561F.m140558C(new Runnable() { // from class: l.v5h
            @Override // java.lang.Runnable
            public final void run() {
                this.f180046a.m212996k(tekVar, j9hVarM140561F);
            }
        });
        j9hVarM140561F.show();
    }
}
