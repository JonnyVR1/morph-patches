package p149l;

import android.net.NetworkInfo;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class fzl0 implements yyl0 {

    /* JADX INFO: renamed from: a */
    public C22392a<List<VirtualVoiceGroupConversationCell>> f99977a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public final C22392a<Integer> f99978b = C22392a.m221513c(0);

    /* JADX INFO: renamed from: c */
    public boolean f99979c = true;

    public fzl0() {
        l9s.m149076g().mo30841yr().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.zyl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205698a.m123880l((TabName) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.azl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72364a.m123881m((TabName) obj);
            }
        }));
        ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.bzl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(Network.isConnected(App.f15369e));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.czl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83097a.m123882n((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m123874k(Runnable runnable, BLiveEnvelope bLiveEnvelope) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p149l.yyl0
    /* JADX INFO: renamed from: a */
    public void mo123875a() {
        du2.m113670a("DbCheck", "update voice step release");
        this.f99977a.m132487l(null);
        this.f99978b.m132487l(0);
    }

    @Override // p149l.yyl0
    /* JADX INFO: renamed from: b */
    public void mo123876b(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        du2.m113670a("DbCheck", "update voice step other");
        this.f99977a.m132487l(vwb.m200324f0(virtualVoiceGroupConversationCell));
    }

    @Override // p149l.yyl0
    /* JADX INFO: renamed from: c */
    public void mo123877c(String str, String str2, long j, String str3, final Runnable runnable) {
        LiveVoiceInternalSquareApi.doConversationAction(str, str2, j, str3).subscribe(ffw.m121197h(new e30() { // from class: l.dzl0
            @Override // p149l.e30
            public final void call(Object obj) {
                fzl0.m123874k(runnable, (BLiveEnvelope) obj);
            }
        }));
    }

    @Override // p149l.yyl0
    /* JADX INFO: renamed from: d */
    public C22392a<Integer> mo123878d() {
        return this.f99978b;
    }

    @Override // p149l.yyl0
    /* JADX INFO: renamed from: e */
    public void mo123879e(String str, String str2, long j, Runnable runnable) {
        mo123877c(str, str2, j, "", runnable);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m123880l(TabName tabName) {
        return Boolean.valueOf((tabName != null && tabName.equals(TabName.Msg)) || this.f99979c);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m123881m(TabName tabName) {
        m123884p("tab change");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m123882n(NetworkInfo networkInfo) {
        m123884p("connect change");
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m123883o(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope == null || bLiveEnvelope.data.cells == null) {
            return;
        }
        du2.m113670a("DbCheck", "update voice step request done");
        this.f99977a.m132487l(bLiveEnvelope.data.cells);
    }

    /* JADX INFO: renamed from: p */
    public final void m123884p(String str) {
        du2.m113670a("DbCheck", "update voice step start request " + str);
        this.f99979c = false;
        LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/live-chat/message-cells"), new mt0[0]), "message-cells").subscribe(ffw.m121197h(new e30() { // from class: l.ezl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93912a.m123883o((BLiveEnvelope) obj);
            }
        }));
    }
}
