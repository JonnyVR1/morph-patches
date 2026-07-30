package p153l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;

/* JADX INFO: loaded from: classes13.dex */
public class n7h implements g7h {

    /* JADX INFO: renamed from: a */
    public Act f140605a;

    /* JADX INFO: renamed from: b */
    public th0 f140606b;

    public n7h(Act act) {
        this.f140605a = act;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m161879e(x20 x20Var, Envelope envelope) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @Override // p153l.g7h
    /* JADX INFO: renamed from: a */
    public void mo129317a(jhk jhkVar, x20 x20Var) {
        m161887m(jhkVar);
    }

    @Override // p153l.g7h
    /* JADX INFO: renamed from: b */
    public void mo129318b(final jhk jhkVar, final x20 x20Var) {
        th0.C20312a c20312a = new th0.C20312a(this.f140605a);
        c20312a.m191151j("确认要退出" + jhkVar.m144911i() + "？").m191159r("再想想").m191156o(new View.OnClickListener() { // from class: l.h7h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108128a.m161883i(view);
            }
        }).m191147f("确认").m191154m(new DialogInterface.OnDismissListener() { // from class: l.i7h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wf70.m206060l0(false);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.j7h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118685a.m161884j(jhkVar, x20Var, view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f140606b = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m161883i(View view) {
        this.f140606b.m191137c();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m161884j(jhk jhkVar, x20 x20Var, View view) {
        this.f140606b.m191137c();
        m161886l(jhkVar, x20Var);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m161885k(jhk jhkVar, yah yahVar) {
        Act act = this.f140605a;
        cn40.m111361M(act, new NewPostAct.C11407a(act).m63875c("nearby").m63876d(jhkVar.m144907e()).m63878f(jyb.m147507f0(new Media[0])));
        cn40.m111363O(this.f140605a, null, "nearby");
        yahVar.dismiss();
        tfj0.m190940c("e_moment_post", "p_circle_detail_join_popup", pf60.m172085a("album_post_source", "circle_ popup"));
    }

    /* JADX INFO: renamed from: l */
    public void m161886l(jhk jhkVar, final x20 x20Var) {
        this.f140605a.duringCreated(FeedModule.f39703d.m145659a7(jhkVar.m144907e(), FeedModule.m61406H().me_().f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.l7h
            @Override // p153l.y20
            public final void call(Object obj) {
                n7h.m161879e(x20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.m7h
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m161887m(final jhk jhkVar) {
        String strValueOf = String.valueOf(jhkVar.m144913k() + 1);
        String strM144911i = jhkVar.m144911i();
        StringBuilder sb = new StringBuilder("欢迎来到");
        sb.append(strM144911i);
        sb.append("，发布 1 条动态，即可成为第 ");
        sb.append(strValueOf);
        sb.append(" 位");
        sb.append(jhkVar.m144904b().isGroupAnonymousType() ? "圈友" : jhkVar.m144904b().memberRole);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f140605a.getResources().getColor(k9c0.f124521n)), strM144911i.length() + 8, strM144911i.length() + 9, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f140605a.getResources().getColor(k9c0.f124521n)), strM144911i.length() + 20, strM144911i.length() + 20 + strValueOf.length(), 33);
        final yah yahVarM214880F = new yah(this.f140605a, fgc0.f98902e).m214884u(spannableStringBuilder).m214880F(jhkVar.m144904b().headIcon);
        yahVarM214880F.m214882H(false);
        yahVarM214880F.m214877C(new Runnable() { // from class: l.k7h
            @Override // java.lang.Runnable
            public final void run() {
                this.f124266a.m161885k(jhkVar, yahVarM214880F);
            }
        });
        yahVarM214880F.show();
    }
}
