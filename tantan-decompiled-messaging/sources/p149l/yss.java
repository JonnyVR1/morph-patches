package p149l;

import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class yss extends cts<bts> {

    /* JADX INFO: renamed from: f */
    public InterfaceC21505b f199822f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveMenuItem> f199823g;

    /* JADX INFO: renamed from: l.yss$b */
    public interface InterfaceC21505b {
        /* JADX INFO: renamed from: a */
        void mo215951a(View view);

        /* JADX INFO: renamed from: b */
        void mo215952b();

        /* JADX INFO: renamed from: c */
        void mo215953c();
    }

    public yss(mcr mcrVar, mss mssVar, VDraweeView vDraweeView) {
        super(mcrVar, mssVar);
        this.f199823g = new ArrayList();
        bts btsVar = new bts(vDraweeView);
        this.viewModel = btsVar;
        mo51532C(btsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m215937Z2(String str) {
        ((bts) this.viewModel).m103888d(x4u.m207028n(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m215938a3(String str) {
        ((bts) this.viewModel).m103893k(str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m215946g3();
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.pss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151051a.m215937Z2((String) obj);
            }
        }));
        m104250o2(m151642F2().LiveHomeMenuEvent.skinConfig().m172460g(), false).subscribe(ffw.m121193d(new e30() { // from class: l.qss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156270a.m215938a3((String) obj);
            }
        }));
        m215949j3(new C21504a());
        xdl0.m208329E0(((bts) this.viewModel).f77260b, new View.OnClickListener() { // from class: l.rss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160890a.m215947h3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public List<d1q<?>> m215939X2() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (final BLiveMenuItem bLiveMenuItem : this.f199823g) {
            i++;
            n2u n2uVar = new n2u(bLiveMenuItem, i);
            n2uVar.mo109662A(new View.OnClickListener() { // from class: l.sss
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166239a.m215941b3(bLiveMenuItem, view);
                }
            });
            arrayList.add(n2uVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m215940Y2() {
        InterfaceC21505b interfaceC21505b;
        boolean zIsEmpty = this.f199823g.isEmpty();
        String str = (String) m151646N2(new rws());
        ((bts) this.viewModel).f77263e = !zIsEmpty;
        ((bts) this.viewModel).m103892j(!zIsEmpty && x4u.m207028n(str));
        if (zIsEmpty || (interfaceC21505b = this.f199822f) == null) {
            return;
        }
        interfaceC21505b.mo215952b();
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m215941b3(BLiveMenuItem bLiveMenuItem, View view) {
        m215948i3(bLiveMenuItem);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m215942c3(List list) {
        m215950k3(list);
        m215940Y2();
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m215943d3(Throwable th) {
        m215940Y2();
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m215944e3(NetworkInfo networkInfo) {
        duringCreated(LiveSquareApi.getSquareMenuItems()).subscribe(ffw.m121194e(new e30() { // from class: l.wss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187966a.m215942c3((List) obj);
            }
        }, new e30() { // from class: l.xss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194303a.m215943d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m215945f3(Boolean bool) {
        ((bts) this.viewModel).f77262d = bool.booleanValue();
        m215940Y2();
    }

    /* JADX INFO: renamed from: g3 */
    public void m215946g3() {
        duringCreated(ConnectivityReceiver.m81290m()).filter(new w9j() { // from class: l.tss
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.uss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178194a.m215944e3((NetworkInfo) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.vss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182884a.m215945f3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m215947h3(View view) {
        InterfaceC21505b interfaceC21505b = this.f199822f;
        if (interfaceC21505b != null) {
            interfaceC21505b.mo215951a(view);
            ((bts) this.viewModel).m103891i(view, m215939X2(), this.f199822f);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public final void m215948i3(BLiveMenuItem bLiveMenuItem) {
        ((bts) this.viewModel).m103889e();
        l9s.m149057T(getAct(), Uri.parse(bLiveMenuItem.jumpUri));
    }

    /* JADX INFO: renamed from: j3 */
    public void m215949j3(InterfaceC21505b interfaceC21505b) {
        this.f199822f = interfaceC21505b;
    }

    /* JADX INFO: renamed from: k3 */
    public final void m215950k3(@Nullable List<BLiveMenuItem> list) {
        this.f199823g.clear();
        if (vwb.m200296J(list)) {
            return;
        }
        this.f199823g.addAll(list);
    }

    /* JADX INFO: renamed from: l.yss$a */
    public class C21504a implements InterfaceC21505b {
        public C21504a() {
        }

        @Override // p149l.yss.InterfaceC21505b
        /* JADX INFO: renamed from: a */
        public void mo215951a(View view) {
            String str = (String) yss.this.m151646N2(new dts());
            if ("p_live_featured".equals(str)) {
                yss.this.m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().mo172463j(Boolean.FALSE);
            }
            if (!TextUtils.isEmpty(str)) {
                zvf0.m220396r("e_live_recommend_setting", str);
            }
            yss.this.m151642F2().LiveHomeMenuEvent.onMenuDialogShow().mo172463j(Boolean.TRUE);
        }

        @Override // p149l.yss.InterfaceC21505b
        /* JADX INFO: renamed from: c */
        public void mo215953c() {
            if ("p_live_featured".equals((String) yss.this.m151646N2(new dts()))) {
                yss.this.m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().mo172463j(Boolean.TRUE);
            }
            yss.this.m151642F2().LiveHomeMenuEvent.onMenuDialogShow().mo172463j(Boolean.FALSE);
        }

        @Override // p149l.yss.InterfaceC21505b
        /* JADX INFO: renamed from: b */
        public void mo215952b() {
        }
    }
}
