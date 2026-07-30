package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView;
import java.util.List;
import p137rx.C22421c;
import p153l.i3r;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class t3r<D extends rwn0, VM extends i3r> extends g3r<D, VM> implements KtvChooseSongPageView.InterfaceC13123b {

    /* JADX INFO: renamed from: j */
    public kcg0 f171948j;

    public t3r(dum<D> dumVar, VM vm) {
        super(dumVar);
        mo52715C(vm);
    }

    /* JADX INFO: renamed from: n4 */
    private void m189123n4() {
        final String str;
        String str2;
        String searchString = ((i3r) this.viewModel).f112779a.getSearchString();
        boolean zIsEmpty = TextUtils.isEmpty(searchString);
        final boolean z = !zIsEmpty;
        if (zIsEmpty) {
            int listType = ((i3r) this.viewModel).f112779a.getListType();
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
        duringCreated(rqn0.m182666i(m213810E2().m202191k(), str, searchString)).subscribe(dhw.m115826e(new y20() { // from class: l.k3r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123766a.m189132m4(str, z, (List) obj);
            }
        }, new z2e0()));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView.InterfaceC13123b
    /* JADX INFO: renamed from: L */
    public void mo78241L(int i) {
        m189123n4();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        this.f171948j.unsubscribe();
        ((i3r) this.viewModel).m138333b();
        super.mo96836O3();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView.InterfaceC13123b
    /* JADX INFO: renamed from: P */
    public void mo78242P(boolean z) {
        act().hideInput(((i3r) this.viewModel).m138334c());
        ((i3r) this.viewModel).f112779a.m78239v0(false);
        if (z) {
            m189123n4();
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.g3r
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public v3r mo123780S3() {
        return new v3r("KTV点歌", ((i3r) this.viewModel).m138334c(), 0);
    }

    @Override // p153l.g3r
    /* JADX INFO: renamed from: T3 */
    public int mo123781T3() {
        return 1;
    }

    @Override // p153l.g3r
    /* JADX INFO: renamed from: U3 */
    public void mo123782U3() {
        ((i3r) this.viewModel).f112779a._search_edit.clearFocus();
        ((i3r) this.viewModel).f112779a.m78233o0(false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView.InterfaceC13123b
    /* JADX INFO: renamed from: d2 */
    public void mo78243d2(@NonNull String str) {
        act().hideInput(((i3r) this.viewModel).m138334c());
        m189123n4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m189124e4(final BLiveVoiceKTVSong bLiveVoiceKTVSong, final int i) {
        if (guk0.m132329h(m213810E2().m183423Y2())) {
            m189133o4(false, bLiveVoiceKTVSong);
            duringCreated(rqn0.m182665h(m213810E2().m202191k())).flatMap(new qcj() { // from class: l.l3r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f129903a.m189125f4((BLiveVoiceKtvGameInfo) obj);
                }
            }).flatMap(new qcj() { // from class: l.m3r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f134697a.m189126g4(bLiveVoiceKTVSong, (BLiveVoiceKtvGameInfo) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.n3r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140029a.m189127h4(bLiveVoiceKTVSong, i, (BLiveEnvelope) obj);
                }
            }, new z2e0()));
        } else if (!m213810E2().mo118373p()) {
            new th0.C20312a(act()).m191160s("申请上麦演唱").m191151j("上麦后才能唱歌哦，向群主申请上麦吧").m191159r("发出申请").m191156o(new View.OnClickListener() { // from class: l.r3r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161077a.m189130k4(view);
                }
            }).m191147f("取消").m191142a().m191141g();
        } else {
            m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
            duringCreated(m213810E2().m183424Z2()).filter(new qcj() { // from class: l.o3r
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f144848a.m189128i4((BLiveVoiceCall) obj);
                }
            }).filter(new p3r()).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.q3r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155484a.m189129j4(bLiveVoiceKTVSong, i, (BLiveVoiceCall) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ C22421c m189125f4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return (bLiveVoiceKtvGameInfo == null || TextUtils.isEmpty(bLiveVoiceKtvGameInfo.f45351id) || TextUtils.equals(bLiveVoiceKtvGameInfo.status, "end")) ? duringCreated(rqn0.m182671n(m213810E2().m202191k())) : C22421c.just(bLiveVoiceKtvGameInfo);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ C22421c m189126g4(BLiveVoiceKTVSong bLiveVoiceKTVSong, BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        return rqn0.m182663f(m213810E2().m202191k(), bLiveVoiceKTVSong.songCode, bLiveVoiceKTVSong.provider);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m189127h4(BLiveVoiceKTVSong bLiveVoiceKTVSong, int i, BLiveEnvelope bLiveEnvelope) {
        m189134p4(bLiveVoiceKTVSong, i);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m189128i4(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(VirtualVoiceMotionType.ktv.equals(m213810E2().mo183435j().template));
    }

    public void init() {
        ((i3r) this.viewModel).m138335d(this);
        this.f171948j = duringCreated(m213810E2().m168545q1().f71684X0).subscribe(dhw.m115829h(new y20() { // from class: l.j3r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118211a.m189131l4((LongLinkVoiceKtv.VoiceKTVOrderRefresh) obj);
            }
        }));
        m189123n4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m189129j4(BLiveVoiceKTVSong bLiveVoiceKTVSong, int i, BLiveVoiceCall bLiveVoiceCall) {
        m189124e4(bLiveVoiceKTVSong, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m189130k4(View view) {
        m213811F2().KtvDialogEvent.closeKtvDialog().m199277p();
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m189131l4(LongLinkVoiceKtv.VoiceKTVOrderRefresh voiceKTVOrderRefresh) {
        if (zrv.f205799a.m207631D0().equals(voiceKTVOrderRefresh.getUserId()) && voiceKTVOrderRefresh.getAction() == LongLinkVoiceKtv.VoiceKTVOrderRefresh.Action.REMOVE) {
            m189123n4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m189132m4(String str, boolean z, List list) {
        ((i3r) this.viewModel).f112779a.m78238u0(str, jyb.m147479J(list));
        V v2 = this.viewModel;
        if (z) {
            ((i3r) v2).m138337f(list);
        } else {
            ((i3r) v2).m138336e(list);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m189133o4(boolean z, BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        int i;
        if (TextUtils.isEmpty(((i3r) this.viewModel).f112779a.getSearchString())) {
            int listType = ((i3r) this.viewModel).f112779a.getListType();
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
            q6r.m175605e(i, bLiveVoiceKTVSong.position, bLiveVoiceKTVSong.title, this);
        } else {
            q6r.m175604d(i, bLiveVoiceKTVSong.position, bLiveVoiceKTVSong.title, this);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m189134p4(BLiveVoiceKTVSong bLiveVoiceKTVSong, int i) {
        bLiveVoiceKTVSong.isOrdered = true;
        q6r.f155835a = false;
        boolean zIsEmpty = TextUtils.isEmpty(((i3r) this.viewModel).f112779a.getSearchString());
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((i3r) v2).f112780b.notifyItemChanged(i);
        } else {
            ((i3r) v2).f112781c.notifyItemChanged(i);
        }
        l51.m152888H(m113230C0(), new Runnable() { // from class: l.s3r
            @Override // java.lang.Runnable
            public final void run() {
                q6r.f155835a = true;
            }
        }, 100L);
    }
}
