package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class akp0 extends i6t<rwn0, ujp0> {
    public akp0(dum dumVar) {
        super(dumVar);
        mo52715C(new ujp0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m98586O3(String str) {
        final BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        bLiveVoiceRoom.title = str;
        bLiveVoiceRoom.addField("title,topic");
        if (((rwn0) m213810E2()).mo183440n() != null && !((rwn0) m213810E2()).mo183440n().topics.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((rwn0) m213810E2()).mo183440n().topics.get(0).f45362id);
            bLiveVoiceRoom.topicIds = arrayList;
        }
        act().progress("");
        AntiSpamHelper.m81451c(this.f196919f, str, DetectCategoryType.get(DetectCategoryType.voice_room_name), AuthenticationTokenClaims.JSON_KEY_NAME, mo78457R2(), new x20() { // from class: l.wjp0
            @Override // p153l.x20
            public final void call() {
                this.f189484a.m98590T3(bLiveVoiceRoom);
            }
        }, new x20() { // from class: l.xjp0
            @Override // p153l.x20
            public final void call() {
                this.f194633a.m98591U3();
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m98587P3(moo0 moo0Var) {
        ((ujp0) this.viewModel).m196444z(moo0Var);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m98588R3(BLiveVoiceRoom bLiveVoiceRoom) {
        act().progressDismiss();
        m98592V3(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m98589S3(Throwable th) {
        act().progressDismiss();
        r35.m179578c(th);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceTopicEvent.showVoiceVirtualEditTitleDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.vjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184434a.m98587P3((moo0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m98590T3(BLiveVoiceRoom bLiveVoiceRoom) {
        duringCreated(itv.m142085I(((rwn0) m213810E2()).m202194o(), bLiveVoiceRoom)).subscribe(dhw.m115826e(new y20() { // from class: l.yjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200323a.m98588R3((BLiveVoiceRoom) obj);
            }
        }, new y20() { // from class: l.zjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204694a.m98589S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m98591U3() {
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final void m98592V3(BLiveVoiceRoom bLiveVoiceRoom) {
        ((rwn0) m213810E2()).m183409O2().mo122894o(bLiveVoiceRoom);
        m213811F2().VirtualRoomInfoEvent.updateRoomInfoDialogTitle().mo199273j(bLiveVoiceRoom.title);
        ((ujp0) this.viewModel).m196443y();
    }
}
