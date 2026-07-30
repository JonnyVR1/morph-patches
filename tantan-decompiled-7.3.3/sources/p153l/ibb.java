package p153l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;

/* JADX INFO: loaded from: classes12.dex */
public class ibb {

    /* JADX INFO: renamed from: l.ibb$a */
    public class C17691a implements od2.InterfaceC19106a {
        @Override // p153l.od2.InterfaceC19106a
        /* JADX INFO: renamed from: a */
        public Animator mo41477a(View view) {
            return null;
        }

        @Override // p153l.od2.InterfaceC19106a
        /* JADX INFO: renamed from: b */
        public Animator mo41478b(View view) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m139302a(Act act, View view, CoreInnerPush.C4867a c4867a) {
        if (view instanceof sum) {
            ((sum) view).mo40232a(act, c4867a, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m139303b(final Act act, CoreInnerPush.C4867a c4867a) {
        od2 od2Var = new od2(act);
        od2Var.m167268s(kec0.f126151y7, true).m167275z((ViewGroup) act.getWindow().getDecorView()).m167273x(bnl0.m105511F0()).m167270u(200L).m167266q(3000L).m167265p(new C17691a()).m167274y(c4867a, new od2.InterfaceC19107b() { // from class: l.hbb
            @Override // p153l.od2.InterfaceC19107b
            /* JADX INFO: renamed from: a */
            public final void mo99267a(View view, Object obj) {
                ibb.m139302a(act, view, (CoreInnerPush.C4867a) obj);
            }
        });
        ud2.m195456j().m195472s(od2Var);
    }
}
