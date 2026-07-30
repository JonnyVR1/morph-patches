package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvSuggestViewModel;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class k6r extends i6t<rwn0, KtvSuggestViewModel> {

    /* JADX INFO: renamed from: i */
    public Pagination f124199i;

    /* JADX INFO: renamed from: j */
    public String f124200j;

    public k6r(dum<? extends rwn0> dumVar, KtvSuggestViewModel ktvSuggestViewModel) {
        super(dumVar);
        this.f124200j = "";
        mo52715C(ktvSuggestViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m148548T3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if ((bLiveVoiceKtvGameInfo == null || bLiveVoiceKtvGameInfo.playInfo == null) && ((KtvSuggestViewModel) this.viewModel).m78291m0()) {
            m148559d4(this.f124200j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m148549S3(final BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        if (guk0.m132329h(((rwn0) m213810E2()).m183423Y2())) {
            duringCreated(rqn0.m182665h(((rwn0) m213810E2()).m202191k())).flatMap(new qcj() { // from class: l.e6r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f92341a.m148551V3((BLiveVoiceKtvGameInfo) obj);
                }
            }).flatMap(new qcj() { // from class: l.f6r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f97439a.m148552W3(bLiveVoiceKTVSong, (BLiveVoiceKtvGameInfo) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.g6r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102476a.m148553X3(bLiveVoiceKTVSong, (BLiveEnvelope) obj);
                }
            }, new z2e0()));
        } else if (!((rwn0) m213810E2()).mo118373p()) {
            new th0.C20312a(act()).m191160s("申请上麦演唱").m191151j("上麦后才能唱歌哦，向群主申请上麦吧").m191159r("发出申请").m191156o(new View.OnClickListener() { // from class: l.j6r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118593a.m148556a4(view);
                }
            }).m191147f("取消").m191142a().m191141g();
        } else {
            m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
            duringCreated(((rwn0) m213810E2()).m183424Z2()).filter(new qcj() { // from class: l.h6r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f108046a.m148554Y3((BLiveVoiceCall) obj);
                }
            }).filter(new p3r()).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.i6r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f113180a.m148555Z3(bLiveVoiceKTVSong, (BLiveVoiceCall) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m148559d4("");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m148550U3(BLiveEnvelope bLiveEnvelope, boolean z) {
        this.f124199i = bLiveEnvelope.pagination;
        ((KtvSuggestViewModel) this.viewModel).m78292p0(bLiveEnvelope.data.voiceKTVSongs, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ C22421c m148551V3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return (bLiveVoiceKtvGameInfo == null || TextUtils.isEmpty(bLiveVoiceKtvGameInfo.f45351id) || TextUtils.equals(bLiveVoiceKtvGameInfo.status, "end")) ? duringCreated(rqn0.m182671n(((rwn0) m213810E2()).m202191k())) : C22421c.just(bLiveVoiceKtvGameInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ C22421c m148552W3(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return rqn0.m182663f(((rwn0) m213810E2()).m202191k(), bLiveVoiceKTVSong.songCode, bLiveVoiceKTVSong.provider);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m148553X3(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveEnvelope bLiveEnvelope) {
        m148560e4(bLiveVoiceKTVSong);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m148554Y3(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(VirtualVoiceMotionType.ktv.equals(((rwn0) m213810E2()).mo183435j().template));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m148555Z3(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveVoiceCall bLiveVoiceCall) {
        m148549S3(bLiveVoiceKTVSong);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m148556a4(View view) {
        m213811F2().KtvDialogEvent.closeKtvDialog().m199277p();
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m148557b4(String str, BLiveEnvelope bLiveEnvelope) {
        m148550U3(bLiveEnvelope, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: c4 */
    public void m148558c4() {
        Links links;
        Pagination pagination = this.f124199i;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next)) {
            o1j0.m165651y("没有更多数据了");
        } else {
            m148559d4(this.f124199i.links.next);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m148559d4(final String str) {
        this.f124200j = str;
        duringCreated(rqn0.m182668k(((rwn0) m213810E2()).m202191k(), str)).subscribe(dhw.m115829h(new y20() { // from class: l.c6r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79988a.m148557b4(str, (BLiveEnvelope) obj);
            }
        }));
        m138863h3(m213811F2().VoiceKtvEvent.changeCurrentKtvPlayInfo(), new y20() { // from class: l.d6r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85394a.m148548T3((BLiveVoiceKtvGameInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final void m148560e4(BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        bLiveVoiceKTVSong.isOrdered = true;
        ((KtvSuggestViewModel) this.viewModel).setSongSelected(bLiveVoiceKTVSong);
    }
}
