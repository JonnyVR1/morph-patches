package p153l;

import android.net.NetworkInfo;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class j8m0 implements c8m0 {

    /* JADX INFO: renamed from: a */
    public C22507a<List<VirtualVoiceGroupConversationCell>> f118790a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public final C22507a<Integer> f118791b = C22507a.m222759c(0);

    /* JADX INFO: renamed from: c */
    public boolean f118792c = true;

    public j8m0() {
        mbs.m157853g().mo31844yr().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.d8m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85654a.m143845l((TabName) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.e8m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92550a.m143846m((TabName) obj);
            }
        }));
        ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.f8m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(Network.isConnected(App.f16088e));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.g8m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102699a.m143847n((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m143844k(Runnable runnable, BLiveEnvelope bLiveEnvelope) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p153l.c8m0
    /* JADX INFO: renamed from: a */
    public void mo108367a() {
        tu2.m192703a("DbCheck", "update voice step release");
        this.f118790a.m137019l(null);
        this.f118791b.m137019l(0);
    }

    @Override // p153l.c8m0
    /* JADX INFO: renamed from: b */
    public void mo108368b(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        tu2.m192703a("DbCheck", "update voice step other");
        this.f118790a.m137019l(jyb.m147507f0(virtualVoiceGroupConversationCell));
    }

    @Override // p153l.c8m0
    /* JADX INFO: renamed from: c */
    public void mo108369c(String str, String str2, long j, String str3, final Runnable runnable) {
        LiveVoiceInternalSquareApi.doConversationAction(str, str2, j, str3).subscribe(dhw.m115829h(new y20() { // from class: l.h8m0
            @Override // p153l.y20
            public final void call(Object obj) {
                j8m0.m143844k(runnable, (BLiveEnvelope) obj);
            }
        }));
    }

    @Override // p153l.c8m0
    /* JADX INFO: renamed from: d */
    public C22507a<Integer> mo108370d() {
        return this.f118791b;
    }

    @Override // p153l.c8m0
    /* JADX INFO: renamed from: e */
    public void mo108371e(String str, String str2, long j, Runnable runnable) {
        mo108369c(str, str2, j, "", runnable);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m143845l(TabName tabName) {
        return Boolean.valueOf((tabName != null && tabName.equals(TabName.Msg)) || this.f118792c);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m143846m(TabName tabName) {
        m143849p("tab change");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m143847n(NetworkInfo networkInfo) {
        m143849p("connect change");
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m143848o(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope == null || bLiveEnvelope.data.cells == null) {
            return;
        }
        tu2.m192703a("DbCheck", "update voice step request done");
        this.f118790a.m137019l(bLiveEnvelope.data.cells);
    }

    /* JADX INFO: renamed from: p */
    public final void m143849p(String str) {
        tu2.m192703a("DbCheck", "update voice step start request " + str);
        this.f118792c = false;
        LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/live-chat/message-cells"), new st0[0]), "message-cells").subscribe(dhw.m115829h(new y20() { // from class: l.i8m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113359a.m143848o((BLiveEnvelope) obj);
            }
        }));
    }
}
