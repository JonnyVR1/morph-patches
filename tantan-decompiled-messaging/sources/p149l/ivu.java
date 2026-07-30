package p149l;

import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVChatView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ivu extends cts<lvu> implements le50 {

    /* JADX INFO: renamed from: f */
    public InterfaceC17629b f115199f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveMenuItem> f115200g;

    /* JADX INFO: renamed from: l.ivu$b */
    public interface InterfaceC17629b {
        /* JADX INFO: renamed from: a */
        void mo138663a(View view);

        /* JADX INFO: renamed from: b */
        void mo138664b();

        /* JADX INFO: renamed from: c */
        void mo138665c();
    }

    public ivu(mcr mcrVar, mss mssVar, LiveSquareTopButtonVChatView liveSquareTopButtonVChatView) {
        super(mcrVar, mssVar);
        this.f115200g = new ArrayList();
        lvu lvuVar = new lvu(liveSquareTopButtonVChatView.f45035c);
        this.viewModel = lvuVar;
        mo51532C(lvuVar);
    }

    /* JADX INFO: renamed from: Y2 */
    private void m138646Y2() {
        InterfaceC17629b interfaceC17629b;
        boolean zIsEmpty = this.f115200g.isEmpty();
        String str = (String) m151646N2(new dts());
        ((lvu) this.viewModel).f130202e = !zIsEmpty;
        ((lvu) this.viewModel).m151914j(!zIsEmpty && "p_live_video_quickchat".equals(str));
        if (zIsEmpty || (interfaceC17629b = this.f115199f) == null) {
            return;
        }
        interfaceC17629b.mo138664b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m138647Z2(soj0 soj0Var) {
        m138661j3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m138648a3(String str) {
        ((lvu) this.viewModel).m151915k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m138649b3(BLiveMenuItem bLiveMenuItem, View view) {
        m138650i3(bLiveMenuItem);
    }

    /* JADX INFO: renamed from: i3 */
    private void m138650i3(BLiveMenuItem bLiveMenuItem) {
        ((lvu) this.viewModel).m151912e();
        l9s.m149057T(getAct(), Uri.parse(bLiveMenuItem.jumpUri));
        if (TextUtils.equals(bLiveMenuItem.f44399id, Constants.VIA_SHARE_TYPE_MINI_PROGRAM)) {
            zvf0.m220396r("e_live_anchor_center_entrance", "p_live_video_quickchat");
        }
    }

    /* JADX INFO: renamed from: m3 */
    private void m138651m3(@Nullable List<BLiveMenuItem> list) {
        this.f115200g.clear();
        if (vwb.m200296J(list)) {
            return;
        }
        this.f115200g.addAll(list);
    }

    @Override // p149l.le50
    /* JADX INFO: renamed from: S */
    public void mo138652S(boolean z, String str) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((lvu) v2).m151911d(z);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m138659g3();
        duringCreated(m151642F2().LiveVideoChatEvent.refreshVideoChat().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zuu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204891a.m138647Z2((soj0) obj);
            }
        }));
        m104250o2(m151642F2().LiveHomeMenuEvent.skinConfig().m172460g(), false).subscribe(ffw.m121193d(new e30() { // from class: l.avu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71967a.m138648a3((String) obj);
            }
        }));
        m138662k3(new C17628a());
        xdl0.m208329E0(((lvu) this.viewModel).f130199b, new View.OnClickListener() { // from class: l.bvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77493a.m138660h3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public List<d1q<?>> m138653X2() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (final BLiveMenuItem bLiveMenuItem : this.f115200g) {
            i++;
            n2u n2uVar = new n2u(bLiveMenuItem, i);
            n2uVar.mo109662A(new View.OnClickListener() { // from class: l.evu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93382a.m138649b3(bLiveMenuItem, view);
                }
            });
            arrayList.add(n2uVar);
            if (TextUtils.equals(bLiveMenuItem.f44399id, Constants.VIA_SHARE_TYPE_MINI_PROGRAM)) {
                zvf0.m220402x("e_live_anchor_center_entrance", "p_live_video_quickchat");
            }
        }
        return arrayList;
    }

    @Override // p149l.le50
    /* JADX INFO: renamed from: b2 */
    public boolean mo138654b2(String str) {
        return "videoChat".equals(str);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m138655c3(NetworkInfo networkInfo) {
        m138661j3();
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m138656d3(Boolean bool) {
        ((lvu) this.viewModel).f130201d = bool.booleanValue();
        m138646Y2();
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m138657e3(BLiveEnvelope bLiveEnvelope) {
        hl3 hl3Var = (hl3) s9s.m182763m(gld0.f103313c);
        BLiveData bLiveData = bLiveEnvelope.data;
        hl3Var.f108315h = bLiveData.isAnchor;
        m138651m3(bLiveData.menuItems);
        m138646Y2();
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m138658f3(Throwable th) {
        m138646Y2();
    }

    /* JADX INFO: renamed from: g3 */
    public void m138659g3() {
        duringCreated(ConnectivityReceiver.m81290m()).filter(new w9j() { // from class: l.fvu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.gvu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104607a.m138655c3((NetworkInfo) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.hvu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109701a.m138656d3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m138660h3(View view) {
        InterfaceC17629b interfaceC17629b = this.f115199f;
        if (interfaceC17629b != null) {
            interfaceC17629b.mo138663a(view);
            ((lvu) this.viewModel).m151913i(view, m138653X2(), this.f115199f);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final void m138661j3() {
        duringCreated(iuu.m138449J()).subscribe(ffw.m121194e(new e30() { // from class: l.cvu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82687a.m138657e3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dvu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88102a.m138658f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public void m138662k3(InterfaceC17629b interfaceC17629b) {
        this.f115199f = interfaceC17629b;
    }

    /* JADX INFO: renamed from: l.ivu$a */
    public class C17628a implements InterfaceC17629b {
        public C17628a() {
        }

        @Override // p149l.ivu.InterfaceC17629b
        /* JADX INFO: renamed from: a */
        public void mo138663a(View view) {
            String str = (String) ivu.this.m151646N2(new dts());
            if ("p_live_featured".equals(str)) {
                ivu.this.m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().mo172463j(Boolean.FALSE);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zvf0.m220396r("e_live_recommend_setting", str);
        }

        @Override // p149l.ivu.InterfaceC17629b
        /* JADX INFO: renamed from: c */
        public void mo138665c() {
            if ("p_live_featured".equals((String) ivu.this.m151646N2(new dts()))) {
                ivu.this.m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().mo172463j(Boolean.TRUE);
            }
        }

        @Override // p149l.ivu.InterfaceC17629b
        /* JADX INFO: renamed from: b */
        public void mo138664b() {
        }
    }
}
