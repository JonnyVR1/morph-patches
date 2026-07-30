package p153l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dy4 {
    /* JADX INFO: renamed from: A */
    public static List<kcg0> m118586A(final SpannableStringBuilder spannableStringBuilder, final gt4 gt4Var, final TextView textView, final Act act, final int i) {
        rnd0[] rnd0VarArr = (rnd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rnd0.class);
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(Arrays.asList(rnd0VarArr), new y20() { // from class: l.ux4
            @Override // p153l.y20
            public final void call(Object obj) {
                rnd0 rnd0Var = (rnd0) obj;
                arrayList.add(gt4Var.mo68557c(act, ivr.m142355a((String) rnd0Var.f167246d, i)).compose(psd0.m173592C()).subscribe(dhw.m115826e(new y20() { // from class: l.by4
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        dy4.m118590E(textView, spannableStringBuilder, rnd0Var, (ruf0) obj2);
                    }
                }, new y20() { // from class: l.cy4
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        dy4.m118597g((Throwable) obj2);
                    }
                })));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static void m118587B(final View view) {
        view.setTag(jdc0.f120189e0, "loop");
        view.post(new Runnable() { // from class: l.qx4
            @Override // java.lang.Runnable
            public final void run() {
                dy4.m118600j(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static void m118588C(final SpannableStringBuilder spannableStringBuilder, final gt4 gt4Var, final TextView textView, final Act act) {
        jyb.m147537z(Arrays.asList((ben0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ben0.class)), new y20() { // from class: l.yx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118605o(gt4Var, act, textView, spannableStringBuilder, (ben0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m118589D(Drawable drawable, TextView textView) {
        if (drawable instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawable).m69784e(textView);
            m118587B(textView);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m118590E(TextView textView, SpannableStringBuilder spannableStringBuilder, sce<?> sceVar, ruf0 ruf0Var) {
        sceVar.mo182213f(ruf0Var);
        textView.setText(spannableStringBuilder);
        m118589D(ruf0Var, textView);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m118591a(View view) {
        view.invalidate();
        m118616z(view);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m118593c(TextView textView, SpannableStringBuilder spannableStringBuilder, t5g t5gVar, ruf0 ruf0Var) {
        m118590E(textView, spannableStringBuilder, t5gVar, ruf0Var);
        if (m118611u(ruf0Var)) {
            m118616z(textView);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m118596f(LiveMessage liveMessage, yql yqlVar, View view) {
        int i = liveMessage.actionType;
        if (i == 1) {
            yqlVar.mo73880e(liveMessage.liveUserInfo, liveMessage.seq);
            return;
        }
        if (i == 2) {
            yqlVar.mo73876a(liveMessage.h5Url);
        } else if (i == 3) {
            yqlVar.mo73881f(liveMessage.menu);
        } else {
            if (i != 4) {
                return;
            }
            yqlVar.mo73879d(liveMessage);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m118597g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m118598h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m118599i(rnd0 rnd0Var) {
        Drawable drawableM185370c = rnd0Var.m185370c();
        if (drawableM185370c instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawableM185370c).m69785f();
        }
        rnd0Var.m185369b();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m118600j(View view) {
        if (view.getTag(jdc0.f120189e0) != null) {
            view.invalidate();
            view.postInvalidateOnAnimation();
            m118587B(view);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m118601k(gt4 gt4Var, Act act, int i, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final hi20 hi20Var) {
        if (hi20Var.m185372e()) {
            return;
        }
        gt4Var.mo68557c(act, ik20.m140255e(hi20Var.m185371d().trim(), i)).subscribe(dhw.m115826e(new y20() { // from class: l.mx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118590E(textView, spannableStringBuilder, hi20Var, (ruf0) obj);
            }
        }, new y20() { // from class: l.nx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118598h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m118602l(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m118603m(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m118604n(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m118605o(gt4 gt4Var, Act act, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final ben0 ben0Var) {
        if (ben0Var.m185372e()) {
            return;
        }
        gt4Var.mo68557c(act, s5g.m184664e((nxp) ben0Var.f167246d)).subscribe(dhw.m115826e(new y20() { // from class: l.ox4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118590E(textView, spannableStringBuilder, ben0Var, (ruf0) obj);
            }
        }, new y20() { // from class: l.px4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118602l((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m118606p(final TextView textView, gt4 gt4Var, Act act, final SpannableStringBuilder spannableStringBuilder, final t5g t5gVar) {
        if (!t5gVar.m185372e()) {
            gt4Var.mo68557c(act, s5g.m184664e((nxp) t5gVar.f167246d)).subscribe(dhw.m115826e(new y20() { // from class: l.rx4
                @Override // p153l.y20
                public final void call(Object obj) {
                    dy4.m118593c(textView, spannableStringBuilder, t5gVar, (ruf0) obj);
                }
            }, new y20() { // from class: l.sx4
                @Override // p153l.y20
                public final void call(Object obj) {
                    dy4.m118603m((Throwable) obj);
                }
            }));
            return;
        }
        Drawable drawableM185370c = t5gVar.m185370c();
        if ((drawableM185370c instanceof n5g) && m118611u((n5g) drawableM185370c)) {
            m118616z(textView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m118609s(yql yqlVar, Act act, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final z5g z5gVar) {
        if (z5gVar.m185372e()) {
            return;
        }
        yqlVar.getAdapter().mo68557c(act, vag.m200517k((fbg) z5gVar.f167246d)).subscribe(dhw.m115826e(new y20() { // from class: l.zx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118590E(textView, spannableStringBuilder, z5gVar, (ruf0) obj);
            }
        }, new y20() { // from class: l.ay4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118604n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public static void m118610t(SpannableStringBuilder spannableStringBuilder, VText vText) {
        rnd0[] rnd0VarArr = (rnd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rnd0.class);
        if (jyb.m147480K(rnd0VarArr)) {
            return;
        }
        vText.setTag(jdc0.f120189e0, null);
        jyb.m147537z(Arrays.asList(rnd0VarArr), new y20() { // from class: l.kx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118599i((rnd0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static boolean m118611u(ruf0 ruf0Var) {
        if (ruf0Var instanceof n5g) {
            return ((n5g) ruf0Var).m161718f();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m118612v(final yql yqlVar, final LiveMessage liveMessage, View view) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.wx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dy4.m118596f(liveMessage, yqlVar, view2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m118613w(final SpannableStringBuilder spannableStringBuilder, final gt4 gt4Var, final TextView textView, final Act act) {
        jyb.m147537z(Arrays.asList((t5g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5g.class)), new y20() { // from class: l.lx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118606p(textView, gt4Var, act, spannableStringBuilder, (t5g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m118614x(final SpannableStringBuilder spannableStringBuilder, final TextView textView, final yql yqlVar, final Act act) {
        jyb.m147537z(Arrays.asList((z5g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5g.class)), new y20() { // from class: l.xx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118609s(yqlVar, act, textView, spannableStringBuilder, (z5g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static void m118615y(final SpannableStringBuilder spannableStringBuilder, final TextView textView, yql yqlVar, final int i) {
        final gt4 adapter = yqlVar.getAdapter();
        final Act act = adapter.act();
        if (!wft.m206159b(2)) {
            m118613w(spannableStringBuilder, adapter, textView, act);
            m118588C(spannableStringBuilder, adapter, textView, act);
        }
        jyb.m147537z(Arrays.asList((hi20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hi20.class)), new y20() { // from class: l.vx4
            @Override // p153l.y20
            public final void call(Object obj) {
                dy4.m118601k(adapter, act, i, textView, spannableStringBuilder, (hi20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static void m118616z(final View view) {
        view.post(new Runnable() { // from class: l.tx4
            @Override // java.lang.Runnable
            public final void run() {
                dy4.m118591a(view);
            }
        });
    }
}
