package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvSuggestViewModel;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class j4r extends h4t<nnn0, KtvSuggestViewModel> {

    /* JADX INFO: renamed from: i */
    public Pagination f116231i;

    /* JADX INFO: renamed from: j */
    public String f116232j;

    public j4r(bsm<? extends nnn0> bsmVar, KtvSuggestViewModel ktvSuggestViewModel) {
        super(bsmVar);
        this.f116232j = "";
        mo51532C(ktvSuggestViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m139764T3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if ((bLiveVoiceKtvGameInfo == null || bLiveVoiceKtvGameInfo.playInfo == null) && ((KtvSuggestViewModel) this.viewModel).m77108m0()) {
            m139775d4(this.f116232j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m139765S3(final BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        if (alk0.m97309h(((nnn0) m206027E2()).m160261Y2())) {
            duringCreated(nhn0.m159424h(((nnn0) m206027E2()).m149814k())).flatMap(new w9j() { // from class: l.d4r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f84336a.m139767V3((BLiveVoiceKtvGameInfo) obj);
                }
            }).flatMap(new w9j() { // from class: l.e4r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f89315a.m139768W3(bLiveVoiceKTVSong, (BLiveVoiceKtvGameInfo) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.f4r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94921a.m139769X3(bLiveVoiceKTVSong, (BLiveEnvelope) obj);
                }
            }, new vud0()));
        } else if (!((nnn0) m206027E2()).mo97490p()) {
            new xh0.C21150a(act()).m208740s("申请上麦演唱").m208731j("上麦后才能唱歌哦，向群主申请上麦吧").m208739r("发出申请").m208736o(new View.OnClickListener() { // from class: l.i4r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111476a.m139772a4(view);
                }
            }).m208727f("取消").m208722a().m208721g();
        } else {
            m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
            duringCreated(((nnn0) m206027E2()).m160262Z2()).filter(new w9j() { // from class: l.g4r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f100582a.m139770Y3((BLiveVoiceCall) obj);
                }
            }).filter(new o1r()).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.h4r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f105868a.m139771Z3(bLiveVoiceKTVSong, (BLiveVoiceCall) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m139775d4("");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m139766U3(BLiveEnvelope bLiveEnvelope, boolean z) {
        this.f116231i = bLiveEnvelope.pagination;
        ((KtvSuggestViewModel) this.viewModel).m77109p0(bLiveEnvelope.data.voiceKTVSongs, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ C22306c m139767V3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return (bLiveVoiceKtvGameInfo == null || TextUtils.isEmpty(bLiveVoiceKtvGameInfo.f44503id) || TextUtils.equals(bLiveVoiceKtvGameInfo.status, "end")) ? duringCreated(nhn0.m159430n(((nnn0) m206027E2()).m149814k())) : C22306c.just(bLiveVoiceKtvGameInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ C22306c m139768W3(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return nhn0.m159422f(((nnn0) m206027E2()).m149814k(), bLiveVoiceKTVSong.songCode, bLiveVoiceKTVSong.provider);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m139769X3(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveEnvelope bLiveEnvelope) {
        m139776e4(bLiveVoiceKTVSong);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m139770Y3(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(VirtualVoiceMotionType.ktv.equals(((nnn0) m206027E2()).mo149813j().template));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m139771Z3(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveVoiceCall bLiveVoiceCall) {
        m139765S3(bLiveVoiceKTVSong);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m139772a4(View view) {
        m206028F2().KtvDialogEvent.closeKtvDialog().m172467p();
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m139773b4(String str, BLiveEnvelope bLiveEnvelope) {
        m139766U3(bLiveEnvelope, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: c4 */
    public void m139774c4() {
        Links links;
        Pagination pagination = this.f116231i;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next)) {
            lsi0.m151595y("没有更多数据了");
        } else {
            m139775d4(this.f116231i.links.next);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m139775d4(final String str) {
        this.f116232j = str;
        duringCreated(nhn0.m159427k(((nnn0) m206027E2()).m149814k(), str)).subscribe(ffw.m121197h(new e30() { // from class: l.b4r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73397a.m139773b4(str, (BLiveEnvelope) obj);
            }
        }));
        m129304h3(m206028F2().VoiceKtvEvent.changeCurrentKtvPlayInfo(), new e30() { // from class: l.c4r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79290a.m139764T3((BLiveVoiceKtvGameInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final void m139776e4(BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        bLiveVoiceKTVSong.isOrdered = true;
        ((KtvSuggestViewModel) this.viewModel).setSongSelected(bLiveVoiceKTVSong);
    }
}
