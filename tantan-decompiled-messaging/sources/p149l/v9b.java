package p149l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;

/* JADX INFO: loaded from: classes10.dex */
public class v9b {

    /* JADX INFO: renamed from: l.v9b$a */
    public class C20601a implements hd2.InterfaceC17283a {
        @Override // p149l.hd2.InterfaceC17283a
        /* JADX INFO: renamed from: a */
        public Animator mo40466a(View view) {
            return null;
        }

        @Override // p149l.hd2.InterfaceC17283a
        /* JADX INFO: renamed from: b */
        public Animator mo40467b(View view) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m197547a(Act act, View view, CoreInnerPush.C4716a c4716a) {
        if (view instanceof qsm) {
            ((qsm) view).mo39229a(act, c4716a, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m197548b(final Act act, CoreInnerPush.C4716a c4716a) {
        hd2 hd2Var = new hd2(act);
        hd2Var.m130557s(f6c0.f95978r7, true).m130564z((ViewGroup) act.getWindow().getDecorView()).m130562x(xdl0.m208331F0()).m130559u(200L).m130555q(3000L).m130554p(new C20601a()).m130563y(c4716a, new hd2.InterfaceC17284b() { // from class: l.u9b
            @Override // p149l.hd2.InterfaceC17284b
            /* JADX INFO: renamed from: a */
            public final void mo97843a(View view, Object obj) {
                v9b.m197547a(act, view, (CoreInnerPush.C4716a) obj);
            }
        });
        nd2.m158964j().m158980s(hd2Var);
    }
}
