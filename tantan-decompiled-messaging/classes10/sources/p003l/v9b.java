package p003l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.newui.main.base.TabName;
import l.f6c0;
import l.hd2;
import l.nd2;
import l.qsm;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v9b {

    /* JADX INFO: renamed from: l.v9b$a */
    public class C3451a implements hd2.a {
        /* JADX INFO: renamed from: a */
        public Animator m10202a(View view) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public Animator m10203b(View view) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10200a(Act act, View view, CoreInnerPush.a aVar) {
        if (view instanceof qsm) {
            ((qsm) view).a(act, aVar, (TabName) null, (Frag) null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10201b(final Act act, CoreInnerPush.a aVar) {
        hd2 hd2Var = new hd2(act);
        hd2Var.s(f6c0.r7, true).z((ViewGroup) act.getWindow().getDecorView()).x(xdl0.F0()).u(200L).q(3000L).p(new C3451a()).y(aVar, new hd2.b() { // from class: l.u9b
            /* JADX INFO: renamed from: a */
            public final void m9693a(View view, Object obj) {
                v9b.m10200a(act, view, (CoreInnerPush.a) obj);
            }
        });
        nd2.j().s(hd2Var);
    }
}
