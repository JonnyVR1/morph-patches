package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Explore;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.j760;
import l.mkd0;
import l.upa;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class kof implements p3m<lof.C1021a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final String f15784a = "LIKED";

    /* JADX INFO: renamed from: b */
    public final String f15785b = "DISLIKED";

    /* JADX INFO: renamed from: e */
    public Counter m17567e() {
        return CoreModule.c.o3();
    }

    /* JADX INFO: renamed from: f */
    public void m17568f(boolean z, String str, User user, boolean z2, final lof.C1021a c1021a) {
        CoreModule.c.S1.C3(str, ((DbObject) user).id, z ? "LIKED" : "DISLIKED", upa.L3()).subscribe(mkd0.H(new e30() { // from class: l.iof
            public final void call(Object obj) {
                c1021a.f16284k.mo288f3(((Explore) obj).can_swiped);
            }
        }, new e30() { // from class: l.jof
            public final void call(Object obj) {
                yij0.m25382D((Throwable) obj);
            }
        }));
        if (z2) {
            zvf0.u(z ? "e_tantanx_card_like" : "e_tantanx_card_dislike", "p_tantanx_card", new j760[]{vwb.Y("tantanx_scene_name", str), vwb.Y("tantanx_receive_uid", ((DbObject) user).id)});
        } else {
            zvf0.w(z ? "e_tantanx_card_like" : "e_tantanx_card_dislike", "p_tantanx_card", new j760[]{vwb.Y("tantanx_scene_name", str), vwb.Y("tantanx_receive_uid", ((DbObject) user).id)});
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m17569g(lof.C1021a c1021a) {
        return c1021a.f16282i == SwipeDirection.RIGHT;
    }
}
