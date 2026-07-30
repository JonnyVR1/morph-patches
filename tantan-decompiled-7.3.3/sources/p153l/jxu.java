package p153l;

import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVChatView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class jxu extends dvs<mxu> implements sm50 {

    /* JADX INFO: renamed from: f */
    public InterfaceC18055b f123081f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveMenuItem> f123082g;

    /* JADX INFO: renamed from: l.jxu$b */
    public interface InterfaceC18055b {
        /* JADX INFO: renamed from: a */
        void mo147424a(View view);

        /* JADX INFO: renamed from: b */
        void mo147425b();

        /* JADX INFO: renamed from: c */
        void mo147426c();
    }

    public jxu(ner nerVar, nus nusVar, LiveSquareTopButtonVChatView liveSquareTopButtonVChatView) {
        super(nerVar, nusVar);
        this.f123082g = new ArrayList();
        mxu mxuVar = new mxu(liveSquareTopButtonVChatView.f45883c);
        this.viewModel = mxuVar;
        mo52715C(mxuVar);
    }

    /* JADX INFO: renamed from: Y2 */
    private void m147407Y2() {
        InterfaceC18055b interfaceC18055b;
        boolean zIsEmpty = this.f123082g.isEmpty();
        String str = (String) m160243N2(new evs());
        ((mxu) this.viewModel).f139289e = !zIsEmpty;
        ((mxu) this.viewModel).m160704j(!zIsEmpty && "p_live_video_quickchat".equals(str));
        if (zIsEmpty || (interfaceC18055b = this.f123081f) == null) {
            return;
        }
        interfaceC18055b.mo147425b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m147408Z2(vxj0 vxj0Var) {
        m147422j3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m147409a3(String str) {
        ((mxu) this.viewModel).m160705k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m147410b3(BLiveMenuItem bLiveMenuItem, View view) {
        m147411i3(bLiveMenuItem);
    }

    /* JADX INFO: renamed from: i3 */
    private void m147411i3(BLiveMenuItem bLiveMenuItem) {
        ((mxu) this.viewModel).m160702e();
        mbs.m157834T(getAct(), Uri.parse(bLiveMenuItem.jumpUri));
        if (TextUtils.equals(bLiveMenuItem.f45247id, Constants.VIA_SHARE_TYPE_MINI_PROGRAM)) {
            i4g0.m138520r("e_live_anchor_center_entrance", "p_live_video_quickchat");
        }
    }

    /* JADX INFO: renamed from: m3 */
    private void m147412m3(@Nullable List<BLiveMenuItem> list) {
        this.f123082g.clear();
        if (jyb.m147479J(list)) {
            return;
        }
        this.f123082g.addAll(list);
    }

    @Override // p153l.sm50
    /* JADX INFO: renamed from: S */
    public void mo147413S(boolean z, String str) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((mxu) v2).m160701d(z);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m147420g3();
        duringCreated(m160238F2().LiveVideoChatEvent.refreshVideoChat().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.axu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73914a.m147408Z2((vxj0) obj);
            }
        }));
        m113231o2(m160238F2().LiveHomeMenuEvent.skinConfig().m199270g(), false).subscribe(dhw.m115825d(new y20() { // from class: l.bxu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78913a.m147409a3((String) obj);
            }
        }));
        m147423k3(new C18054a());
        bnl0.m105509E0(((mxu) this.viewModel).f139286b, new View.OnClickListener() { // from class: l.cxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84275a.m147421h3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public List<d3q<?>> m147414X2() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (final BLiveMenuItem bLiveMenuItem : this.f123082g) {
            i++;
            o4u o4uVar = new o4u(bLiveMenuItem, i);
            o4uVar.mo113881A(new View.OnClickListener() { // from class: l.fxu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f101302a.m147410b3(bLiveMenuItem, view);
                }
            });
            arrayList.add(o4uVar);
            if (TextUtils.equals(bLiveMenuItem.f45247id, Constants.VIA_SHARE_TYPE_MINI_PROGRAM)) {
                i4g0.m138526x("e_live_anchor_center_entrance", "p_live_video_quickchat");
            }
        }
        return arrayList;
    }

    @Override // p153l.sm50
    /* JADX INFO: renamed from: b2 */
    public boolean mo147415b2(String str) {
        return "videoChat".equals(str);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m147416c3(NetworkInfo networkInfo) {
        m147422j3();
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m147417d3(Boolean bool) {
        ((mxu) this.viewModel).f139288d = bool.booleanValue();
        m147407Y2();
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m147418e3(BLiveEnvelope bLiveEnvelope) {
        gm3 gm3Var = (gm3) tbs.m190077m(itd0.f116821c);
        BLiveData bLiveData = bLiveEnvelope.data;
        gm3Var.f104918h = bLiveData.isAnchor;
        m147412m3(bLiveData.menuItems);
        m147407Y2();
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m147419f3(Throwable th) {
        m147407Y2();
    }

    /* JADX INFO: renamed from: g3 */
    public void m147420g3() {
        duringCreated(ConnectivityReceiver.m82473m()).filter(new qcj() { // from class: l.gxu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.hxu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112052a.m147416c3((NetworkInfo) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.ixu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117463a.m147417d3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m147421h3(View view) {
        InterfaceC18055b interfaceC18055b = this.f123081f;
        if (interfaceC18055b != null) {
            interfaceC18055b.mo147424a(view);
            ((mxu) this.viewModel).m160703i(view, m147414X2(), this.f123081f);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final void m147422j3() {
        duringCreated(jwu.m147235J()).subscribe(dhw.m115826e(new y20() { // from class: l.dxu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91112a.m147418e3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.exu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96342a.m147419f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public void m147423k3(InterfaceC18055b interfaceC18055b) {
        this.f123081f = interfaceC18055b;
    }

    /* JADX INFO: renamed from: l.jxu$a */
    public class C18054a implements InterfaceC18055b {
        public C18054a() {
        }

        @Override // p153l.jxu.InterfaceC18055b
        /* JADX INFO: renamed from: a */
        public void mo147424a(View view) {
            String str = (String) jxu.this.m160243N2(new evs());
            if ("p_live_featured".equals(str)) {
                jxu.this.m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().mo199273j(Boolean.FALSE);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i4g0.m138520r("e_live_recommend_setting", str);
        }

        @Override // p153l.jxu.InterfaceC18055b
        /* JADX INFO: renamed from: c */
        public void mo147426c() {
            if ("p_live_featured".equals((String) jxu.this.m160243N2(new evs()))) {
                jxu.this.m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().mo199273j(Boolean.TRUE);
            }
        }

        @Override // p153l.jxu.InterfaceC18055b
        /* JADX INFO: renamed from: b */
        public void mo147425b() {
        }
    }
}
