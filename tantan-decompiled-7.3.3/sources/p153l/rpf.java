package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public abstract class rpf implements g6m<spf.C20128a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final String f164362a = RelationshipStatus.LIKED;

    /* JADX INFO: renamed from: b */
    public final String f164363b = "DISLIKED";

    /* JADX INFO: renamed from: e */
    public Counter m182526e() {
        return CoreModule.f18264c.m32487o3();
    }

    /* JADX INFO: renamed from: f */
    public void m182527f(boolean z, String str, User user, boolean z2, final spf.C20128a c20128a) {
        CoreModule.f18264c.f20347S1.m113536C3(str, user.f56859id, z ? RelationshipStatus.LIKED : "DISLIKED", gra.m131596L3()).subscribe(psd0.m173597H(new y20() { // from class: l.ppf
            @Override // p153l.y20
            public final void call(Object obj) {
                c20128a.f170049k.mo37363f3(((Explore) obj).can_swiped);
            }
        }, new y20() { // from class: l.qpf
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
        if (z2) {
            i4g0.m138523u(z ? "e_tantanx_card_like" : "e_tantanx_card_dislike", "p_tantanx_card", jyb.m147494Y("tantanx_scene_name", str), jyb.m147494Y("tantanx_receive_uid", user.f56859id));
        } else {
            i4g0.m138525w(z ? "e_tantanx_card_like" : "e_tantanx_card_dislike", "p_tantanx_card", jyb.m147494Y("tantanx_scene_name", str), jyb.m147494Y("tantanx_receive_uid", user.f56859id));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m182528g(spf.C20128a c20128a) {
        return c20128a.f170047i == SwipeDirection.RIGHT;
    }
}
