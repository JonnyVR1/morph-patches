package p153l;

import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import java.util.List;
import p153l.rwn0;
import p153l.y2r;

/* JADX INFO: loaded from: classes5.dex */
public class f3r<D extends rwn0, VM extends y2r> extends g3r<D, VM> {

    /* JADX INFO: renamed from: j */
    public final e4r f97005j;

    /* JADX INFO: renamed from: k */
    public String f97006k;

    public f3r(dum<D> dumVar, VM vm, e4r e4rVar) {
        super(dumVar);
        this.f97006k = "已点";
        mo52715C(vm);
        this.f97005j = e4rVar;
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m123776X3(BLiveEnvelope bLiveEnvelope) {
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((y2r) this.viewModel).init();
        m123787f4();
        duringCreated(m213810E2().m168545q1().m98221C0()).subscribe(dhw.m115829h(new y20() { // from class: l.z2r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202728a.m123792k4((LongLinkVoiceKtv.VoiceKTVOrderRefresh) obj);
            }
        }));
    }

    @Override // p153l.g3r
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public v3r mo123780S3() {
        return new v3r(this.f97006k, ((y2r) this.viewModel).m214093b(), 1);
    }

    @Override // p153l.g3r
    /* JADX INFO: renamed from: T3 */
    public int mo123781T3() {
        return 2;
    }

    @Override // p153l.g3r
    /* JADX INFO: renamed from: U3 */
    public void mo123782U3() {
        act().hideInput(((y2r) this.viewModel).m214093b());
    }

    /* JADX INFO: renamed from: b4 */
    public void m123783b4(Pair<Integer, BLiveVoiceKTVOrder> pair) {
        int iIntValue = ((Integer) pair.first).intValue();
        if (iIntValue == 0) {
            if (qd80.f156678m.equals(((BLiveVoiceKTVOrder) pair.second).status)) {
                m213811F2().VoiceKtvEvent.resumeMusic().m199277p();
                return;
            } else {
                m213811F2().VoiceKtvEvent.pauseMusic().m199277p();
                return;
            }
        }
        if (iIntValue == 1) {
            m123786e4();
        } else {
            if (iIntValue != 2) {
                return;
            }
            m123785d4((BLiveVoiceKTVOrder) pair.second);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m123784c4(String str) {
        duringCreated(rqn0.m182664g(m213810E2().m202191k(), str)).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.e3r
            @Override // p153l.y20
            public final void call(Object obj) {
                f3r.m123776X3((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m123785d4(final BLiveVoiceKTVOrder bLiveVoiceKTVOrder) {
        new th0.C20312a(act()).m191151j("是否删除该歌曲").m191159r("删除").m191156o(new View.OnClickListener() { // from class: l.d3r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84935a.m123788g4(bLiveVoiceKTVOrder, view);
            }
        }).m191147f("取消").m191142a().m191141g();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m123786e4() {
        new th0.C20312a(act()).m191151j("切歌会结束当前歌曲，是否切歌？").m191159r("切歌").m191156o(new View.OnClickListener() { // from class: l.c3r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79641a.m123789h4(view);
            }
        }).m191147f("取消").m191142a().m191141g();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m123787f4() {
        duringCreated(rqn0.m182667j(m213810E2().m202191k())).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.a3r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68314a.m123790i4((List) obj);
            }
        }, new y20() { // from class: l.b3r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74806a.m123791j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m123788g4(BLiveVoiceKTVOrder bLiveVoiceKTVOrder, View view) {
        m123784c4(bLiveVoiceKTVOrder.f45349id);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m123789h4(View view) {
        m213811F2().VoiceKtvEvent.switchNext().m199277p();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m123790i4(List list) {
        if (list == null || list.size() == 0) {
            ((y2r) this.viewModel).m214094c();
            m123793l4(0);
        } else {
            ((y2r) this.viewModel).m214095d(list);
            m123793l4(list.size());
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m123791j4(Throwable th) {
        ((y2r) this.viewModel).m214094c();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m123792k4(LongLinkVoiceKtv.VoiceKTVOrderRefresh voiceKTVOrderRefresh) {
        m123787f4();
    }

    /* JADX INFO: renamed from: l4 */
    public void m123793l4(int i) {
        if (i > 99) {
            this.f97006k = "已点 99+";
        } else if (i != 0) {
            this.f97006k = "已点 " + i;
        } else {
            this.f97006k = "已点 0";
        }
        this.f97005j.m119471e4();
    }
}
