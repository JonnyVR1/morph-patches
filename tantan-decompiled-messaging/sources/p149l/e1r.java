package p149l;

import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import java.util.List;
import p149l.nnn0;
import p149l.x0r;

/* JADX INFO: loaded from: classes5.dex */
public class e1r<D extends nnn0, VM extends x0r> extends f1r<D, VM> {

    /* JADX INFO: renamed from: j */
    public final d2r f88843j;

    /* JADX INFO: renamed from: k */
    public String f88844k;

    public e1r(bsm<D> bsmVar, VM vm, d2r d2rVar) {
        super(bsmVar);
        this.f88844k = "已点";
        mo51532C(vm);
        this.f88843j = d2rVar;
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m114421X3(BLiveEnvelope bLiveEnvelope) {
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((x0r) this.viewModel).init();
        m114432f4();
        duringCreated(m206027E2().m132160q1().m189039C0()).subscribe(ffw.m121197h(new e30() { // from class: l.y0r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195324a.m114437k4((LongLinkVoiceKtv.VoiceKTVOrderRefresh) obj);
            }
        }));
    }

    @Override // p149l.f1r
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public u1r mo114425S3() {
        return new u1r(this.f88844k, ((x0r) this.viewModel).m206645b(), 1);
    }

    @Override // p149l.f1r
    /* JADX INFO: renamed from: T3 */
    public int mo114426T3() {
        return 2;
    }

    @Override // p149l.f1r
    /* JADX INFO: renamed from: U3 */
    public void mo114427U3() {
        act().hideInput(((x0r) this.viewModel).m206645b());
    }

    /* JADX INFO: renamed from: b4 */
    public void m114428b4(Pair<Integer, BLiveVoiceKTVOrder> pair) {
        int iIntValue = ((Integer) pair.first).intValue();
        if (iIntValue == 0) {
            if (k580.f121167m.equals(((BLiveVoiceKTVOrder) pair.second).status)) {
                m206028F2().VoiceKtvEvent.resumeMusic().m172467p();
                return;
            } else {
                m206028F2().VoiceKtvEvent.pauseMusic().m172467p();
                return;
            }
        }
        if (iIntValue == 1) {
            m114431e4();
        } else {
            if (iIntValue != 2) {
                return;
            }
            m114430d4((BLiveVoiceKTVOrder) pair.second);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m114429c4(String str) {
        duringCreated(nhn0.m159423g(m206027E2().m149814k(), str)).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.d1r
            @Override // p149l.e30
            public final void call(Object obj) {
                e1r.m114421X3((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m114430d4(final BLiveVoiceKTVOrder bLiveVoiceKTVOrder) {
        new xh0.C21150a(act()).m208731j("是否删除该歌曲").m208739r("删除").m208736o(new View.OnClickListener() { // from class: l.c1r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78295a.m114433g4(bLiveVoiceKTVOrder, view);
            }
        }).m208727f("取消").m208722a().m208721g();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m114431e4() {
        new xh0.C21150a(act()).m208731j("切歌会结束当前歌曲，是否切歌？").m208739r("切歌").m208736o(new View.OnClickListener() { // from class: l.b1r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72621a.m114434h4(view);
            }
        }).m208727f("取消").m208722a().m208721g();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m114432f4() {
        duringCreated(nhn0.m159426j(m206027E2().m149814k())).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.z0r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201009a.m114435i4((List) obj);
            }
        }, new e30() { // from class: l.a1r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67196a.m114436j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m114433g4(BLiveVoiceKTVOrder bLiveVoiceKTVOrder, View view) {
        m114429c4(bLiveVoiceKTVOrder.f44501id);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m114434h4(View view) {
        m206028F2().VoiceKtvEvent.switchNext().m172467p();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m114435i4(List list) {
        if (list == null || list.size() == 0) {
            ((x0r) this.viewModel).m206646c();
            m114438l4(0);
        } else {
            ((x0r) this.viewModel).m206647d(list);
            m114438l4(list.size());
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m114436j4(Throwable th) {
        ((x0r) this.viewModel).m206646c();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m114437k4(LongLinkVoiceKtv.VoiceKTVOrderRefresh voiceKTVOrderRefresh) {
        m114432f4();
    }

    /* JADX INFO: renamed from: l4 */
    public void m114438l4(int i) {
        if (i > 99) {
            this.f88844k = "已点 99+";
        } else if (i != 0) {
            this.f88844k = "已点 " + i;
        } else {
            this.f88844k = "已点 0";
        }
        this.f88843j.m109827e4();
    }
}
