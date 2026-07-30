package p149l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.data.Evaluation;
import com.p046p1.mobile.putong.core.member.R$string;

/* JADX INFO: loaded from: classes10.dex */
public class z8y {

    /* JADX INFO: renamed from: a */
    public static long f202243a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m217643a(d30 d30Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        d30Var.call();
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m217644b(Act act, Throwable th) {
        act.progressDismiss();
        lsi0.m151580j("支付失败，请重新操作");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m217646d(l5j0 l5j0Var, roj0 roj0Var) {
        f202243a = CoreModule.f17545c.f19570H0.m210347Y4();
        if (l5j0Var.isShowing()) {
            ((TextView) l5j0Var.findViewById(x4c0.f190984S)).setText(i0g0.m133861b0(String.format("余额：%s 探探币", Long.valueOf(f202243a)), vwb.m200324f0(f202243a + ""), Color.parseColor("#e6000000"), Typeface.create("sans-serif", 1)));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m217648f(Act act, l5j0 l5j0Var, e30 e30Var, Evaluation evaluation) {
        act.progressDismiss();
        l5j0Var.m101651T();
        e30Var.call(evaluation.detailUrl);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m217649g(int i, final Act act, long j, String str, final l5j0 l5j0Var, final e30 e30Var, View view) {
        if (i > f202243a) {
            CoreModule.m29935P().m94651a().mo33629ye(act, new g30() { // from class: l.w8y
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    CoreModule.f17545c.f19570H0.m210361k5().subscribe(mkd0.m154956H(new e30() { // from class: l.x8y
                        @Override // p149l.e30
                        public final void call(Object obj4) {
                            z8y.m217646d(l5j0Var, (roj0) obj4);
                        }
                    }, new e30() { // from class: l.y8y
                        @Override // p149l.e30
                        public final void call(Object obj4) {
                            z8y.m217650h((Throwable) obj4);
                        }
                    }));
                }
            });
        } else {
            act.progress(R$string.f20587I);
            act.duringCreated(CoreModule.f17545c.f19661l1.m34346i3(j, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.u8y
                @Override // p149l.e30
                public final void call(Object obj) {
                    z8y.m217648f(act, l5j0Var, e30Var, (Evaluation) obj);
                }
            }, new e30() { // from class: l.v8y
                @Override // p149l.e30
                public final void call(Object obj) {
                    z8y.m217644b(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m217650h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m217651i(final Act act, final long j, final String str, final e30<String> e30Var, final d30 d30Var) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_knowmyself_purchase", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("test_id", Long.valueOf(j)));
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(k6c0.f121381g);
        View viewMo302g = l5j0Var.getDelegate().mo302g(p4c0.f147063E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo302g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo302g.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.r8y
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        l5j0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.s8y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                z8y.m217643a(d30Var, cwf0VarM133794c, dialogInterface);
            }
        });
        final int iM34340k3 = C4749o.m34340k3(str);
        f202243a = CoreModule.f17545c.f19570H0.m210347Y4();
        ((TextView) l5j0Var.findViewById(x4c0.f190982Q)).setText(iM34340k3 + "");
        ((TextView) l5j0Var.findViewById(x4c0.f190984S)).setText(i0g0.m133861b0(String.format("余额：%s 探探币", Long.valueOf(f202243a)), vwb.m200324f0(f202243a + ""), Color.parseColor("#e6000000"), Typeface.create("sans-serif", 1)));
        xdl0.m208329E0(l5j0Var.findViewById(x4c0.f190981P), new View.OnClickListener() { // from class: l.t8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z8y.m217649g(iM34340k3, act, j, str, l5j0Var, e30Var, view);
            }
        });
        l5j0Var.show();
    }
}
