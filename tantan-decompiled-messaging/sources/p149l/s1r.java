package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView;
import java.util.List;
import p133rx.C22306c;
import p149l.h1r;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class s1r<D extends nnn0, VM extends h1r> extends f1r<D, VM> implements KtvChooseSongPageView.InterfaceC12960b {

    /* JADX INFO: renamed from: j */
    public c4g0 f161931j;

    public s1r(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        mo51532C(vm);
    }

    /* JADX INFO: renamed from: n4 */
    private void m182030n4() {
        final String str;
        String str2;
        String searchString = ((h1r) this.viewModel).f105454a.getSearchString();
        boolean zIsEmpty = TextUtils.isEmpty(searchString);
        final boolean z = !zIsEmpty;
        if (zIsEmpty) {
            int listType = ((h1r) this.viewModel).f105454a.getListType();
            str = "";
            if (listType == 0) {
                str2 = "hot";
            } else if (listType == 1) {
                str2 = "recommend";
            } else if (listType != 2) {
                searchString = "";
            } else {
                str2 = "sung";
            }
            str = str2;
            searchString = "";
        } else {
            str = BLivePkInviteSource.query;
        }
        duringCreated(nhn0.m159425i(m206027E2().m149814k(), str, searchString)).subscribe(ffw.m121194e(new e30() { // from class: l.j1r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115834a.m182039m4(str, z, (List) obj);
            }
        }, new vud0()));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView.InterfaceC12960b
    /* JADX INFO: renamed from: L */
    public void mo77058L(int i) {
        m182030n4();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        this.f161931j.unsubscribe();
        ((h1r) this.viewModel).m129069b();
        super.mo94471O3();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView.InterfaceC12960b
    /* JADX INFO: renamed from: P */
    public void mo77059P(boolean z) {
        act().hideInput(((h1r) this.viewModel).m129070c());
        ((h1r) this.viewModel).f105454a.m77056v0(false);
        if (z) {
            m182030n4();
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.f1r
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public u1r mo114425S3() {
        return new u1r("KTV点歌", ((h1r) this.viewModel).m129070c(), 0);
    }

    @Override // p149l.f1r
    /* JADX INFO: renamed from: T3 */
    public int mo114426T3() {
        return 1;
    }

    @Override // p149l.f1r
    /* JADX INFO: renamed from: U3 */
    public void mo114427U3() {
        ((h1r) this.viewModel).f105454a._search_edit.clearFocus();
        ((h1r) this.viewModel).f105454a.m77050o0(false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView.InterfaceC12960b
    /* JADX INFO: renamed from: d2 */
    public void mo77060d2(@NonNull String str) {
        act().hideInput(((h1r) this.viewModel).m129070c());
        m182030n4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m182031e4(final BLiveVoiceKTVSong bLiveVoiceKTVSong, final int i) {
        if (alk0.m97309h(m206027E2().m160261Y2())) {
            m182040o4(false, bLiveVoiceKTVSong);
            duringCreated(nhn0.m159424h(m206027E2().m149814k())).flatMap(new w9j() { // from class: l.k1r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f120641a.m182032f4((BLiveVoiceKtvGameInfo) obj);
                }
            }).flatMap(new w9j() { // from class: l.l1r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f125678a.m182033g4(bLiveVoiceKTVSong, (BLiveVoiceKtvGameInfo) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.m1r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130850a.m182034h4(bLiveVoiceKTVSong, i, (BLiveEnvelope) obj);
                }
            }, new vud0()));
        } else if (!m206027E2().mo97490p()) {
            new xh0.C21150a(act()).m208740s("申请上麦演唱").m208731j("上麦后才能唱歌哦，向群主申请上麦吧").m208739r("发出申请").m208736o(new View.OnClickListener() { // from class: l.q1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152159a.m182037k4(view);
                }
            }).m208727f("取消").m208722a().m208721g();
        } else {
            m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
            duringCreated(m206027E2().m160262Z2()).filter(new w9j() { // from class: l.n1r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f136683a.m182035i4((BLiveVoiceCall) obj);
                }
            }).filter(new o1r()).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.p1r
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146758a.m182036j4(bLiveVoiceKTVSong, i, (BLiveVoiceCall) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ C22306c m182032f4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return (bLiveVoiceKtvGameInfo == null || TextUtils.isEmpty(bLiveVoiceKtvGameInfo.f44503id) || TextUtils.equals(bLiveVoiceKtvGameInfo.status, "end")) ? duringCreated(nhn0.m159430n(m206027E2().m149814k())) : C22306c.just(bLiveVoiceKtvGameInfo);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ C22306c m182033g4(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return nhn0.m159422f(m206027E2().m149814k(), bLiveVoiceKTVSong.songCode, bLiveVoiceKTVSong.provider);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m182034h4(BLiveVoiceKTVSong bLiveVoiceKTVSong, int i, BLiveEnvelope bLiveEnvelope) {
        m182041p4(bLiveVoiceKTVSong, i);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m182035i4(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(VirtualVoiceMotionType.ktv.equals(m206027E2().mo149813j().template));
    }

    public void init() {
        ((h1r) this.viewModel).m129071d(this);
        this.f161931j = duringCreated(m206027E2().m132160q1().f170417X0).subscribe(ffw.m121197h(new e30() { // from class: l.i1r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110492a.m182038l4((LongLinkVoiceKtv.VoiceKTVOrderRefresh) obj);
            }
        }));
        m182030n4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m182036j4(BLiveVoiceKTVSong bLiveVoiceKTVSong, int i, BLiveVoiceCall bLiveVoiceCall) {
        m182031e4(bLiveVoiceKTVSong, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m182037k4(View view) {
        m206028F2().KtvDialogEvent.closeKtvDialog().m172467p();
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m182038l4(LongLinkVoiceKtv.VoiceKTVOrderRefresh voiceKTVOrderRefresh) {
        if (ypv.f199493a.m199309D0().equals(voiceKTVOrderRefresh.getUserId()) && voiceKTVOrderRefresh.getAction() == LongLinkVoiceKtv.VoiceKTVOrderRefresh.Action.REMOVE) {
            m182030n4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m182039m4(String str, boolean z, List list) {
        ((h1r) this.viewModel).f105454a.m77055u0(str, vwb.m200296J(list));
        V v2 = this.viewModel;
        if (z) {
            ((h1r) v2).m129073f(list);
        } else {
            ((h1r) v2).m129072e(list);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m182040o4(boolean z, BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        int i;
        if (TextUtils.isEmpty(((h1r) this.viewModel).f105454a.getSearchString())) {
            int listType = ((h1r) this.viewModel).f105454a.getListType();
            if (listType == 0) {
                i = 3;
            } else if (listType != 1) {
                i = listType != 2 ? 2 : 1;
            } else {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (z) {
            p4r.m167406e(i, bLiveVoiceKTVSong.position, bLiveVoiceKTVSong.title, this);
        } else {
            p4r.m167405d(i, bLiveVoiceKTVSong.position, bLiveVoiceKTVSong.title, this);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m182041p4(BLiveVoiceKTVSong bLiveVoiceKTVSong, int i) {
        bLiveVoiceKTVSong.isOrdered = true;
        p4r.f147202a = false;
        boolean zIsEmpty = TextUtils.isEmpty(((h1r) this.viewModel).f105454a.getSearchString());
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((h1r) v2).f105455b.notifyItemChanged(i);
        } else {
            ((h1r) v2).f105456c.notifyItemChanged(i);
        }
        e51.m114743H(m104249C0(), new Runnable() { // from class: l.r1r
            @Override // java.lang.Runnable
            public final void run() {
                p4r.f147202a = true;
            }
        }, 100L);
    }
}
