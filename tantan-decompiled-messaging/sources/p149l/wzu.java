package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p046p1.mobile.putong.live.external.module.api.VoiceCenterApiProvider;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.C12596b;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wzu extends jq2<C12596b> {

    /* JADX INFO: renamed from: a */
    public Act f188763a;

    public wzu(mcr mcrVar) {
        super(mcrVar);
        this.f188763a = (Act) mcrVar;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m206310k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m206307h0() {
        ((C12596b) this.viewModel).m71013B();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m206308i0(List list) {
        ((C12596b) this.viewModel).m71022w(list);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m206309j0(Throwable th) {
        ((C12596b) this.viewModel).m71012A();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m206310k0() {
        duringCreated(VoiceCenterApiProvider.getVoiceNoticeList()).doOnSubscribe(new d30() { // from class: l.tzu
            @Override // p149l.d30
            public final void call() {
                this.f172758a.m206307h0();
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.uzu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179036a.m206308i0((List) obj);
            }
        }, new e30() { // from class: l.vzu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183670a.m206309j0((Throwable) obj);
            }
        }));
        VoiceCenterApiProvider.postVoiceActivitiesToZero();
    }

    /* JADX INFO: renamed from: l0 */
    public void m206311l0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Act act = this.f188763a;
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(str).m67604O("live-activity").m67615y("").m67606Q(true).m67616z(str2).m67611u()));
    }

    /* JADX INFO: renamed from: m0 */
    public void m206312m0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j2e0.m139446m(this.f188763a, Uri.parse(str));
    }

    /* JADX INFO: renamed from: n0 */
    public void m206313n0() {
        m206310k0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m206314o0(int i, BLiveMemberActivityData bLiveMemberActivityData) {
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

    @Override // p149l.q0m
    public void destroy() {
    }
}
