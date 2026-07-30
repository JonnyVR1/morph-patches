package p149l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ex4 {
    /* JADX INFO: renamed from: A */
    public static List<c4g0> m118545A(final SpannableStringBuilder spannableStringBuilder, final hs4 hs4Var, final TextView textView, final Act act, final int i) {
        ofd0[] ofd0VarArr = (ofd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ofd0.class);
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(Arrays.asList(ofd0VarArr), new e30() { // from class: l.vw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ofd0 ofd0Var = (ofd0) obj;
                arrayList.add(hs4Var.mo67374c(act, htr.m132937a((String) ofd0Var.f142903d, i)).compose(mkd0.m154951C()).subscribe(ffw.m121194e(new e30() { // from class: l.cx4
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        ex4.m118549E(textView, spannableStringBuilder, ofd0Var, (imf0) obj2);
                    }
                }, new e30() { // from class: l.dx4
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        ex4.m118556g((Throwable) obj2);
                    }
                })));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static void m118546B(final View view) {
        view.setTag(d5c0.f84471e0, "loop");
        view.post(new Runnable() { // from class: l.rw4
            @Override // java.lang.Runnable
            public final void run() {
                ex4.m118559j(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static void m118547C(final SpannableStringBuilder spannableStringBuilder, final hs4 hs4Var, final TextView textView, final Act act) {
        vwb.m200354z(Arrays.asList((x4n0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x4n0.class)), new e30() { // from class: l.zw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118564o(hs4Var, act, textView, spannableStringBuilder, (x4n0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m118548D(Drawable drawable, TextView textView) {
        if (drawable instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawable).m68601e(textView);
            m118546B(textView);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m118549E(TextView textView, SpannableStringBuilder spannableStringBuilder, obe<?> obeVar, imf0 imf0Var) {
        obeVar.mo163417f(imf0Var);
        textView.setText(spannableStringBuilder);
        m118548D(imf0Var, textView);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m118550a(View view) {
        view.invalidate();
        m118575z(view);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m118552c(TextView textView, SpannableStringBuilder spannableStringBuilder, f4g f4gVar, imf0 imf0Var) {
        m118549E(textView, spannableStringBuilder, f4gVar, imf0Var);
        if (m118570u(imf0Var)) {
            m118575z(textView);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m118555f(LiveMessage liveMessage, nol nolVar, View view) {
        int i = liveMessage.actionType;
        if (i == 1) {
            nolVar.mo72697e(liveMessage.liveUserInfo, liveMessage.seq);
            return;
        }
        if (i == 2) {
            nolVar.mo72693a(liveMessage.h5Url);
        } else if (i == 3) {
            nolVar.mo72698f(liveMessage.menu);
        } else {
            if (i != 4) {
                return;
            }
            nolVar.mo72696d(liveMessage);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m118556g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m118557h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m118558i(ofd0 ofd0Var) {
        Drawable drawableM163414c = ofd0Var.m163414c();
        if (drawableM163414c instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawableM163414c).m68602f();
        }
        ofd0Var.m163413b();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m118559j(View view) {
        if (view.getTag(d5c0.f84471e0) != null) {
            view.invalidate();
            view.postInvalidateOnAnimation();
            m118546B(view);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m118560k(hs4 hs4Var, Act act, int i, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final z920 z920Var) {
        if (z920Var.m163416e()) {
            return;
        }
        hs4Var.mo67374c(act, zb20.m217821e(z920Var.m163415d().trim(), i)).subscribe(ffw.m121194e(new e30() { // from class: l.nw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118549E(textView, spannableStringBuilder, z920Var, (imf0) obj);
            }
        }, new e30() { // from class: l.ow4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118557h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m118561l(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m118562m(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m118563n(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m118564o(hs4 hs4Var, Act act, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final x4n0 x4n0Var) {
        if (x4n0Var.m163416e()) {
            return;
        }
        hs4Var.mo67374c(act, e4g.m114681e((nvp) x4n0Var.f142903d)).subscribe(ffw.m121194e(new e30() { // from class: l.pw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118549E(textView, spannableStringBuilder, x4n0Var, (imf0) obj);
            }
        }, new e30() { // from class: l.qw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118561l((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m118565p(final TextView textView, hs4 hs4Var, Act act, final SpannableStringBuilder spannableStringBuilder, final f4g f4gVar) {
        if (!f4gVar.m163416e()) {
            hs4Var.mo67374c(act, e4g.m114681e((nvp) f4gVar.f142903d)).subscribe(ffw.m121194e(new e30() { // from class: l.sw4
                @Override // p149l.e30
                public final void call(Object obj) {
                    ex4.m118552c(textView, spannableStringBuilder, f4gVar, (imf0) obj);
                }
            }, new e30() { // from class: l.tw4
                @Override // p149l.e30
                public final void call(Object obj) {
                    ex4.m118562m((Throwable) obj);
                }
            }));
            return;
        }
        Drawable drawableM163414c = f4gVar.m163414c();
        if ((drawableM163414c instanceof z3g) && m118570u((z3g) drawableM163414c)) {
            m118575z(textView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m118568s(nol nolVar, Act act, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final l4g l4gVar) {
        if (l4gVar.m163416e()) {
            return;
        }
        nolVar.getAdapter().mo67374c(act, h9g.m130002k((r9g) l4gVar.f142903d)).subscribe(ffw.m121194e(new e30() { // from class: l.ax4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118549E(textView, spannableStringBuilder, l4gVar, (imf0) obj);
            }
        }, new e30() { // from class: l.bx4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118563n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public static void m118569t(SpannableStringBuilder spannableStringBuilder, VText vText) {
        ofd0[] ofd0VarArr = (ofd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ofd0.class);
        if (vwb.m200297K(ofd0VarArr)) {
            return;
        }
        vText.setTag(d5c0.f84471e0, null);
        vwb.m200354z(Arrays.asList(ofd0VarArr), new e30() { // from class: l.lw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118558i((ofd0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static boolean m118570u(imf0 imf0Var) {
        if (imf0Var instanceof z3g) {
            return ((z3g) imf0Var).m217038f();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m118571v(final nol nolVar, final LiveMessage liveMessage, View view) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.xw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ex4.m118555f(liveMessage, nolVar, view2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m118572w(final SpannableStringBuilder spannableStringBuilder, final hs4 hs4Var, final TextView textView, final Act act) {
        vwb.m200354z(Arrays.asList((f4g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f4g.class)), new e30() { // from class: l.mw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118565p(textView, hs4Var, act, spannableStringBuilder, (f4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m118573x(final SpannableStringBuilder spannableStringBuilder, final TextView textView, final nol nolVar, final Act act) {
        vwb.m200354z(Arrays.asList((l4g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l4g.class)), new e30() { // from class: l.yw4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118568s(nolVar, act, textView, spannableStringBuilder, (l4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static void m118574y(final SpannableStringBuilder spannableStringBuilder, final TextView textView, nol nolVar, final int i) {
        final hs4 adapter = nolVar.getAdapter();
        final Act act = adapter.act();
        if (!vdt.m198092b(2)) {
            m118572w(spannableStringBuilder, adapter, textView, act);
            m118547C(spannableStringBuilder, adapter, textView, act);
        }
        vwb.m200354z(Arrays.asList((z920[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z920.class)), new e30() { // from class: l.ww4
            @Override // p149l.e30
            public final void call(Object obj) {
                ex4.m118560k(adapter, act, i, textView, spannableStringBuilder, (z920) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static void m118575z(final View view) {
        view.post(new Runnable() { // from class: l.uw4
            @Override // java.lang.Runnable
            public final void run() {
                ex4.m118550a(view);
            }
        });
    }
}
