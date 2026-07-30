package com.p051p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu;

import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.d3q;
import p153l.dhw;
import p153l.dvs;
import p153l.evs;
import p153l.fo0;
import p153l.i4g0;
import p153l.jyb;
import p153l.mbs;
import p153l.ner;
import p153l.nus;
import p153l.qcj;
import p153l.r7o;
import p153l.txn;
import p153l.y20;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveHomeMenuPresenter extends dvs<txn> {

    /* JADX INFO: renamed from: f */
    public InterfaceC12711b f46539f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveMenuItem> f46540g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveMenuItem> f46541h;

    /* JADX INFO: renamed from: i */
    public TabType f46542i;

    public enum TabType {
        LIVE,
        VOICE,
        GAME
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter$a */
    public static /* synthetic */ class C12710a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46543a;

        static {
            int[] iArr = new int[TabType.values().length];
            f46543a = iArr;
            try {
                iArr[TabType.GAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46543a[TabType.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46543a[TabType.VOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter$b */
    public interface InterfaceC12711b {
        /* JADX INFO: renamed from: a */
        void mo71392a(View view);
    }

    public IntlLiveHomeMenuPresenter(ner nerVar, nus nusVar, VDraweeView vDraweeView) {
        super(nerVar, nusVar);
        this.f46540g = new ArrayList();
        this.f46541h = new ArrayList();
        this.f46542i = TabType.LIVE;
        txn txnVar = new txn(vDraweeView);
        this.viewModel = txnVar;
        mo52715C(txnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m71376a3(String str) {
        if (y6u.m214509m(str)) {
            this.f46542i = TabType.GAME;
        } else if (y6u.m214511o(str)) {
            this.f46542i = TabType.LIVE;
        } else {
            this.f46542i = TabType.VOICE;
        }
        m71391o3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m71377b3(String str) {
        ((txn) this.viewModel).m193523j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m71378d3(BLiveMenuItem bLiveMenuItem, View view) {
        m71380j3(bLiveMenuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m71379e3(Throwable th) {
        m71391o3();
    }

    /* JADX INFO: renamed from: j3 */
    private void m71380j3(BLiveMenuItem bLiveMenuItem) {
        ((txn) this.viewModel).m193520d();
        mbs.m157834T(getAct(), Uri.parse(bLiveMenuItem.jumpUri));
        if (bLiveMenuItem.jumpUri.contains("moment/liveGroup")) {
            i4g0.m138520r("e_live_group_icon", "p_live_recommend");
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m71386h3();
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.gxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106964a.m71376a3((String) obj);
            }
        }));
        m113231o2(m160238F2().LiveHomeMenuEvent.skinConfig().m199270g(), false).subscribe(dhw.m115825d(new y20() { // from class: l.ixn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117442a.m71377b3((String) obj);
            }
        }));
        m71388k3(new InterfaceC12711b() { // from class: l.jxn
            @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter.InterfaceC12711b
            /* JADX INFO: renamed from: a */
            public final void mo71392a(View view) {
                this.f123050a.m71383c3(view);
            }
        });
        bnl0.m105509E0(((txn) this.viewModel).f176584b, new View.OnClickListener() { // from class: l.kxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129217a.m71387i3(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public List<d3q<?>> m71382Z2() {
        List<BLiveMenuItem> list;
        ArrayList arrayList = new ArrayList();
        int i = C12710a.f46543a[this.f46542i.ordinal()];
        if (i != 2) {
            if (i == 3) {
                list = this.f46541h;
            }
            return arrayList;
        }
        list = this.f46540g;
        int i2 = 0;
        for (final BLiveMenuItem bLiveMenuItem : list) {
            i2++;
            r7o r7oVar = new r7o(bLiveMenuItem, i2);
            r7oVar.mo113881A(new View.OnClickListener() { // from class: l.lxn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133970a.m71378d3(bLiveMenuItem, view);
                }
            });
            arrayList.add(r7oVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m71383c3(View view) {
        String str = (String) m160243N2(new evs());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138520r("e_live_recommend_setting", str);
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m71384f3(Throwable th) {
        m71391o3();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m71385g3(NetworkInfo networkInfo) {
        duringCreated(IntlLiveSquareApi.getSquareMenuItems()).subscribe(dhw.m115826e(new y20() { // from class: l.oxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149674a.m71389m3((List) obj);
            }
        }, new y20() { // from class: l.pxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154582a.m71379e3((Throwable) obj);
            }
        }));
        duringCreated(IntlLiveSquareApi.getVoiceSquareMenuItems()).subscribe(dhw.m115826e(new y20() { // from class: l.qxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160064a.m71390n3((List) obj);
            }
        }, new y20() { // from class: l.hxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112027a.m71384f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m71386h3() {
        duringCreated(ConnectivityReceiver.m82473m()).filter(new qcj() { // from class: l.mxn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144196a.m71385g3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public void m71387i3(View view) {
        InterfaceC12711b interfaceC12711b = this.f46539f;
        if (interfaceC12711b != null) {
            interfaceC12711b.mo71392a(view);
        }
        ((txn) this.viewModel).m193521f(view, m71382Z2());
    }

    /* JADX INFO: renamed from: k3 */
    public void m71388k3(InterfaceC12711b interfaceC12711b) {
        this.f46539f = interfaceC12711b;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m71389m3(@Nullable List<BLiveMenuItem> list) {
        this.f46540g.clear();
        if (!jyb.m147479J(list)) {
            this.f46540g.addAll(list);
        }
        m71391o3();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m71390n3(@Nullable List<BLiveMenuItem> list) {
        this.f46541h.clear();
        if (!jyb.m147479J(list)) {
            this.f46541h.addAll(list);
        }
        m71391o3();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m71391o3() {
        int i = C12710a.f46543a[this.f46542i.ordinal()];
        boolean z = false;
        if (i == 1) {
            ((txn) this.viewModel).m193522i(false);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((txn) this.viewModel).m193522i(!this.f46541h.isEmpty());
        } else {
            String str = (String) m160243N2(new evs());
            if (!this.f46540g.isEmpty() && !"p_audio_explore_recommend".equals(str)) {
                z = true;
            }
            ((txn) this.viewModel).m193522i(z);
        }
    }
}
