package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kof implements p3m<lof.C18270a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final String f123997a = RelationshipStatus.LIKED;

    /* JADX INFO: renamed from: b */
    public final String f123998b = "DISLIKED";

    /* JADX INFO: renamed from: e */
    public Counter m146701e() {
        return CoreModule.f17545c.m31484o3();
    }

    /* JADX INFO: renamed from: f */
    public void m146702f(boolean z, String str, User user, boolean z2, final lof.C18270a c18270a) {
        CoreModule.f17545c.f19605S1.m200712C3(str, user.f56011id, z ? RelationshipStatus.LIKED : "DISLIKED", upa.m194665L3()).subscribe(mkd0.m154956H(new e30() { // from class: l.iof
            @Override // p149l.e30
            public final void call(Object obj) {
                c18270a.f129101k.mo36360f3(((Explore) obj).can_swiped);
            }
        }, new e30() { // from class: l.jof
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
        if (z2) {
            zvf0.m220399u(z ? "e_tantanx_card_like" : "e_tantanx_card_dislike", "p_tantanx_card", vwb.m200311Y("tantanx_scene_name", str), vwb.m200311Y("tantanx_receive_uid", user.f56011id));
        } else {
            zvf0.m220401w(z ? "e_tantanx_card_like" : "e_tantanx_card_dislike", "p_tantanx_card", vwb.m200311Y("tantanx_scene_name", str), vwb.m200311Y("tantanx_receive_uid", user.f56011id));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m146703g(lof.C18270a c18270a) {
        return c18270a.f129099i == SwipeDirection.RIGHT;
    }
}
