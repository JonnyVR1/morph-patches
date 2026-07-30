package p002l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.c4g0;
import l.d5c0;
import l.e30;
import l.ffw;
import l.htr;
import l.imf0;
import l.mkd0;
import l.obe;
import l.vdt;
import l.vwb;
import l.xdl0;
import l.z920;
import l.zb20;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ex4 {
    /* JADX INFO: renamed from: A */
    public static List<c4g0> m12802A(final SpannableStringBuilder spannableStringBuilder, final hs4 hs4Var, final TextView textView, final Act act, final int i) {
        ofd0[] ofd0VarArr = (ofd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ofd0.class);
        final ArrayList arrayList = new ArrayList();
        vwb.z(Arrays.asList(ofd0VarArr), new e30() { // from class: l.vw4
            public final void call(Object obj) {
                ofd0 ofd0Var = (ofd0) obj;
                arrayList.add(hs4Var.c(act, htr.a((String) ((obe) ofd0Var).d, i)).compose(mkd0.C()).subscribe(ffw.e(new e30() { // from class: l.cx4
                    public final void call(Object obj2) {
                        ex4.m12806E(textView, spannableStringBuilder, ofd0Var, (imf0) obj2);
                    }
                }, new e30() { // from class: l.dx4
                    public final void call(Object obj2) {
                        ex4.m12813g((Throwable) obj2);
                    }
                })));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static void m12803B(final View view) {
        view.setTag(d5c0.e0, "loop");
        view.post(new Runnable() { // from class: l.rw4
            @Override // java.lang.Runnable
            public final void run() {
                ex4.m12816j(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static void m12804C(final SpannableStringBuilder spannableStringBuilder, final hs4 hs4Var, final TextView textView, final Act act) {
        vwb.z(Arrays.asList((x4n0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x4n0.class)), new e30() { // from class: l.zw4
            public final void call(Object obj) {
                ex4.m12821o(hs4Var, act, textView, spannableStringBuilder, (x4n0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static void m12805D(Drawable drawable, TextView textView) {
        if (drawable instanceof LiveAnimatedWebpSpanDrawable) {
            ((LiveAnimatedWebpSpanDrawable) drawable).e(textView);
            m12803B(textView);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m12806E(TextView textView, SpannableStringBuilder spannableStringBuilder, obe<?> obeVar, imf0 imf0Var) {
        obeVar.f(imf0Var);
        textView.setText(spannableStringBuilder);
        m12805D(imf0Var, textView);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12807a(View view) {
        view.invalidate();
        m12832z(view);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12809c(TextView textView, SpannableStringBuilder spannableStringBuilder, f4g f4gVar, imf0 imf0Var) {
        m12806E(textView, spannableStringBuilder, f4gVar, imf0Var);
        if (m12827u(imf0Var)) {
            m12832z(textView);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m12812f(LiveMessage liveMessage, nol nolVar, View view) {
        int i = liveMessage.actionType;
        if (i == 1) {
            nolVar.mo6200e(liveMessage.liveUserInfo, liveMessage.seq);
            return;
        }
        if (i == 2) {
            nolVar.mo6196a(liveMessage.h5Url);
        } else if (i == 3) {
            nolVar.mo6201f(liveMessage.menu);
        } else {
            if (i != 4) {
                return;
            }
            nolVar.mo6199d(liveMessage);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m12813g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12814h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m12815i(ofd0 ofd0Var) {
        LiveAnimatedWebpSpanDrawable liveAnimatedWebpSpanDrawableC = ofd0Var.c();
        if (liveAnimatedWebpSpanDrawableC instanceof LiveAnimatedWebpSpanDrawable) {
            liveAnimatedWebpSpanDrawableC.f();
        }
        ofd0Var.b();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m12816j(View view) {
        if (view.getTag(d5c0.e0) != null) {
            view.invalidate();
            view.postInvalidateOnAnimation();
            m12803B(view);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12817k(hs4 hs4Var, Act act, int i, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final z920 z920Var) {
        if (z920Var.e()) {
            return;
        }
        hs4Var.c(act, zb20.e(((String) z920Var.d()).trim(), i)).subscribe(ffw.e(new e30() { // from class: l.nw4
            public final void call(Object obj) {
                ex4.m12806E(textView, spannableStringBuilder, z920Var, (imf0) obj);
            }
        }, new e30() { // from class: l.ow4
            public final void call(Object obj) {
                ex4.m12814h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12818l(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12819m(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m12820n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12821o(hs4 hs4Var, Act act, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final x4n0 x4n0Var) {
        if (x4n0Var.e()) {
            return;
        }
        hs4Var.c(act, e4g.m12184e((nvp) ((obe) x4n0Var).d)).subscribe(ffw.e(new e30() { // from class: l.pw4
            public final void call(Object obj) {
                ex4.m12806E(textView, spannableStringBuilder, x4n0Var, (imf0) obj);
            }
        }, new e30() { // from class: l.qw4
            public final void call(Object obj) {
                ex4.m12818l((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m12822p(final TextView textView, hs4 hs4Var, Act act, final SpannableStringBuilder spannableStringBuilder, final f4g f4gVar) {
        if (!f4gVar.e()) {
            hs4Var.c(act, e4g.m12184e((nvp) ((obe) f4gVar).d)).subscribe(ffw.e(new e30() { // from class: l.sw4
                public final void call(Object obj) {
                    ex4.m12809c(textView, spannableStringBuilder, f4gVar, (imf0) obj);
                }
            }, new e30() { // from class: l.tw4
                public final void call(Object obj) {
                    ex4.m12819m((Throwable) obj);
                }
            }));
            return;
        }
        Object objC = f4gVar.c();
        if ((objC instanceof z3g) && m12827u((z3g) objC)) {
            m12832z(textView);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m12825s(nol nolVar, Act act, final TextView textView, final SpannableStringBuilder spannableStringBuilder, final l4g l4gVar) {
        if (l4gVar.e()) {
            return;
        }
        nolVar.getAdapter().c(act, h9g.m14301k((r9g) ((obe) l4gVar).d)).subscribe(ffw.e(new e30() { // from class: l.ax4
            public final void call(Object obj) {
                ex4.m12806E(textView, spannableStringBuilder, l4gVar, (imf0) obj);
            }
        }, new e30() { // from class: l.bx4
            public final void call(Object obj) {
                ex4.m12820n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public static void m12826t(SpannableStringBuilder spannableStringBuilder, VText vText) {
        ofd0[] ofd0VarArr = (ofd0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ofd0.class);
        if (vwb.K(ofd0VarArr)) {
            return;
        }
        vText.setTag(d5c0.e0, null);
        vwb.z(Arrays.asList(ofd0VarArr), new e30() { // from class: l.lw4
            public final void call(Object obj) {
                ex4.m12815i((ofd0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static boolean m12827u(imf0 imf0Var) {
        if (imf0Var instanceof z3g) {
            return ((z3g) imf0Var).m27057f();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m12828v(final nol nolVar, final LiveMessage liveMessage, View view) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.xw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ex4.m12812f(liveMessage, nolVar, view2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m12829w(final SpannableStringBuilder spannableStringBuilder, final hs4 hs4Var, final TextView textView, final Act act) {
        vwb.z(Arrays.asList((f4g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f4g.class)), new e30() { // from class: l.mw4
            public final void call(Object obj) {
                ex4.m12822p(textView, hs4Var, act, spannableStringBuilder, (f4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m12830x(final SpannableStringBuilder spannableStringBuilder, final TextView textView, final nol nolVar, final Act act) {
        vwb.z(Arrays.asList((l4g[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l4g.class)), new e30() { // from class: l.yw4
            public final void call(Object obj) {
                ex4.m12825s(nolVar, act, textView, spannableStringBuilder, (l4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static void m12831y(final SpannableStringBuilder spannableStringBuilder, final TextView textView, nol nolVar, final int i) {
        final hs4 adapter = nolVar.getAdapter();
        final Act act = adapter.act();
        if (!vdt.b(2)) {
            m12829w(spannableStringBuilder, adapter, textView, act);
            m12804C(spannableStringBuilder, adapter, textView, act);
        }
        vwb.z(Arrays.asList((z920[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z920.class)), new e30() { // from class: l.ww4
            public final void call(Object obj) {
                ex4.m12817k(adapter, act, i, textView, spannableStringBuilder, (z920) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static void m12832z(final View view) {
        view.post(new Runnable() { // from class: l.uw4
            @Override // java.lang.Runnable
            public final void run() {
                ex4.m12807a(view);
            }
        });
    }
}
