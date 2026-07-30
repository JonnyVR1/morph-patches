package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p051p1.mobile.putong.live.external.module.api.VoiceCenterApiProvider;
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.C12759b;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class x1v extends ar2<C12759b> {

    /* JADX INFO: renamed from: a */
    public Act f192099a;

    public x1v(ner nerVar) {
        super(nerVar);
        this.f192099a = (Act) nerVar;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m209111k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m209108h0() {
        ((C12759b) this.viewModel).m72196B();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m209109i0(List list) {
        ((C12759b) this.viewModel).m72205w(list);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m209110j0(Throwable th) {
        ((C12759b) this.viewModel).m72195A();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m209111k0() {
        duringCreated(VoiceCenterApiProvider.getVoiceNoticeList()).doOnSubscribe(new x20() { // from class: l.u1v
            @Override // p153l.x20
            public final void call() {
                this.f177137a.m209108h0();
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.v1v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182020a.m209109i0((List) obj);
            }
        }, new y20() { // from class: l.w1v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186843a.m209110j0((Throwable) obj);
            }
        }));
        VoiceCenterApiProvider.postVoiceActivitiesToZero();
    }

    /* JADX INFO: renamed from: l0 */
    public void m209112l0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Act act = this.f192099a;
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(str).m68787O("live-activity").m68798y("").m68789Q(true).m68799z(str2).m68794u()));
    }

    /* JADX INFO: renamed from: m0 */
    public void m209113m0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nae0.m162083m(this.f192099a, Uri.parse(str));
    }

    /* JADX INFO: renamed from: n0 */
    public void m209114n0() {
        m209111k0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m209115o0(int i, BLiveMemberActivityData bLiveMemberActivityData) {
        String str;
        if (i == 0) {
            str = "all";
        } else if (i == 2) {
            str = "match";
        } else {
            str = i == 3 ? "likeother" : "follow";
        }
        VoiceCenterApiProvider.cancelRelationships(bLiveMemberActivityData.userId, str);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
