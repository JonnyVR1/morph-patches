package com.p046p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu;

import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.cts;
import p149l.d1q;
import p149l.dts;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.l9s;
import p149l.mcr;
import p149l.mss;
import p149l.r5o;
import p149l.tvn;
import p149l.vwb;
import p149l.w9j;
import p149l.x4u;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveHomeMenuPresenter extends cts<tvn> {

    /* JADX INFO: renamed from: f */
    public InterfaceC12548b f45691f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveMenuItem> f45692g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveMenuItem> f45693h;

    /* JADX INFO: renamed from: i */
    public TabType f45694i;

    public enum TabType {
        LIVE,
        VOICE,
        GAME
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter$a */
    public static /* synthetic */ class C12547a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45695a;

        static {
            int[] iArr = new int[TabType.values().length];
            f45695a = iArr;
            try {
                iArr[TabType.GAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45695a[TabType.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45695a[TabType.VOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter$b */
    public interface InterfaceC12548b {
        /* JADX INFO: renamed from: a */
        void mo70209a(View view);
    }

    public IntlLiveHomeMenuPresenter(mcr mcrVar, mss mssVar, VDraweeView vDraweeView) {
        super(mcrVar, mssVar);
        this.f45692g = new ArrayList();
        this.f45693h = new ArrayList();
        this.f45694i = TabType.LIVE;
        tvn tvnVar = new tvn(vDraweeView);
        this.viewModel = tvnVar;
        mo51532C(tvnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m70193a3(String str) {
        if (x4u.m207027m(str)) {
            this.f45694i = TabType.GAME;
        } else if (x4u.m207029o(str)) {
            this.f45694i = TabType.LIVE;
        } else {
            this.f45694i = TabType.VOICE;
        }
        m70208o3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m70194b3(String str) {
        ((tvn) this.viewModel).m190767j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m70195d3(BLiveMenuItem bLiveMenuItem, View view) {
        m70197j3(bLiveMenuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m70196e3(Throwable th) {
        m70208o3();
    }

    /* JADX INFO: renamed from: j3 */
    private void m70197j3(BLiveMenuItem bLiveMenuItem) {
        ((tvn) this.viewModel).m190764d();
        l9s.m149057T(getAct(), Uri.parse(bLiveMenuItem.jumpUri));
        if (bLiveMenuItem.jumpUri.contains("moment/liveGroup")) {
            zvf0.m220396r("e_live_group_icon", "p_live_recommend");
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m70203h3();
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.gvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104583a.m70193a3((String) obj);
            }
        }));
        m104250o2(m151642F2().LiveHomeMenuEvent.skinConfig().m172460g(), false).subscribe(ffw.m121193d(new e30() { // from class: l.ivn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115185a.m70194b3((String) obj);
            }
        }));
        m70205k3(new InterfaceC12548b() { // from class: l.jvn
            @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter.InterfaceC12548b
            /* JADX INFO: renamed from: a */
            public final void mo70209a(View view) {
                this.f119961a.m70200c3(view);
            }
        });
        xdl0.m208329E0(((tvn) this.viewModel).f172328b, new View.OnClickListener() { // from class: l.kvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124783a.m70204i3(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public List<d1q<?>> m70199Z2() {
        List<BLiveMenuItem> list;
        ArrayList arrayList = new ArrayList();
        int i = C12547a.f45695a[this.f45694i.ordinal()];
        if (i != 2) {
            if (i == 3) {
                list = this.f45693h;
            }
            return arrayList;
        }
        list = this.f45692g;
        int i2 = 0;
        for (final BLiveMenuItem bLiveMenuItem : list) {
            i2++;
            r5o r5oVar = new r5o(bLiveMenuItem, i2);
            r5oVar.mo109662A(new View.OnClickListener() { // from class: l.lvn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130175a.m70195d3(bLiveMenuItem, view);
                }
            });
            arrayList.add(r5oVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m70200c3(View view) {
        String str = (String) m151646N2(new dts());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.m220396r("e_live_recommend_setting", str);
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m70201f3(Throwable th) {
        m70208o3();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m70202g3(NetworkInfo networkInfo) {
        duringCreated(IntlLiveSquareApi.getSquareMenuItems()).subscribe(ffw.m121194e(new e30() { // from class: l.ovn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145822a.m70206m3((List) obj);
            }
        }, new e30() { // from class: l.pvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151494a.m70196e3((Throwable) obj);
            }
        }));
        duringCreated(IntlLiveSquareApi.getVoiceSquareMenuItems()).subscribe(ffw.m121194e(new e30() { // from class: l.qvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156613a.m70207n3((List) obj);
            }
        }, new e30() { // from class: l.hvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109684a.m70201f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m70203h3() {
        duringCreated(ConnectivityReceiver.m81290m()).filter(new w9j() { // from class: l.mvn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.nvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140781a.m70202g3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public void m70204i3(View view) {
        InterfaceC12548b interfaceC12548b = this.f45691f;
        if (interfaceC12548b != null) {
            interfaceC12548b.mo70209a(view);
        }
        ((tvn) this.viewModel).m190765f(view, m70199Z2());
    }

    /* JADX INFO: renamed from: k3 */
    public void m70205k3(InterfaceC12548b interfaceC12548b) {
        this.f45691f = interfaceC12548b;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m70206m3(@Nullable List<BLiveMenuItem> list) {
        this.f45692g.clear();
        if (!vwb.m200296J(list)) {
            this.f45692g.addAll(list);
        }
        m70208o3();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m70207n3(@Nullable List<BLiveMenuItem> list) {
        this.f45693h.clear();
        if (!vwb.m200296J(list)) {
            this.f45693h.addAll(list);
        }
        m70208o3();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m70208o3() {
        int i = C12547a.f45695a[this.f45694i.ordinal()];
        boolean z = false;
        if (i == 1) {
            ((tvn) this.viewModel).m190766i(false);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((tvn) this.viewModel).m190766i(!this.f45693h.isEmpty());
        } else {
            String str = (String) m151646N2(new dts());
            if (!this.f45692g.isEmpty() && !"p_audio_explore_recommend".equals(str)) {
                z = true;
            }
            ((tvn) this.viewModel).m190766i(z);
        }
    }
}
