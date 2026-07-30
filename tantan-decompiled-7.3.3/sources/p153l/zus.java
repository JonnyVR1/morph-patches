package p153l;

import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class zus extends dvs<cvs> {

    /* JADX INFO: renamed from: f */
    public InterfaceC21902b f206152f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveMenuItem> f206153g;

    /* JADX INFO: renamed from: l.zus$b */
    public interface InterfaceC21902b {
        /* JADX INFO: renamed from: a */
        void mo221726a(View view);

        /* JADX INFO: renamed from: b */
        void mo221727b();

        /* JADX INFO: renamed from: c */
        void mo221728c();
    }

    public zus(ner nerVar, nus nusVar, VDraweeView vDraweeView) {
        super(nerVar, nusVar);
        this.f206153g = new ArrayList();
        cvs cvsVar = new cvs(vDraweeView);
        this.viewModel = cvsVar;
        mo52715C(cvsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m221712Z2(String str) {
        ((cvs) this.viewModel).m112865d(y6u.m214510n(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m221713a3(String str) {
        ((cvs) this.viewModel).m112870k(str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m221721g3();
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.qus
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159618a.m221712Z2((String) obj);
            }
        }));
        m113231o2(m160238F2().LiveHomeMenuEvent.skinConfig().m199270g(), false).subscribe(dhw.m115825d(new y20() { // from class: l.rus
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164937a.m221713a3((String) obj);
            }
        }));
        m221724j3(new C21901a());
        bnl0.m105509E0(((cvs) this.viewModel).f84059b, new View.OnClickListener() { // from class: l.sus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170759a.m221722h3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public List<d3q<?>> m221714X2() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (final BLiveMenuItem bLiveMenuItem : this.f206153g) {
            i++;
            o4u o4uVar = new o4u(bLiveMenuItem, i);
            o4uVar.mo113881A(new View.OnClickListener() { // from class: l.tus
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176208a.m221716b3(bLiveMenuItem, view);
                }
            });
            arrayList.add(o4uVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m221715Y2() {
        InterfaceC21902b interfaceC21902b;
        boolean zIsEmpty = this.f206153g.isEmpty();
        String str = (String) m160243N2(new sys());
        ((cvs) this.viewModel).f84062e = !zIsEmpty;
        ((cvs) this.viewModel).m112869j(!zIsEmpty && y6u.m214510n(str));
        if (zIsEmpty || (interfaceC21902b = this.f206152f) == null) {
            return;
        }
        interfaceC21902b.mo221727b();
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m221716b3(BLiveMenuItem bLiveMenuItem, View view) {
        m221723i3(bLiveMenuItem);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m221717c3(List list) {
        m221725k3(list);
        m221715Y2();
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m221718d3(Throwable th) {
        m221715Y2();
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m221719e3(NetworkInfo networkInfo) {
        duringCreated(LiveSquareApi.getSquareMenuItems()).subscribe(dhw.m115826e(new y20() { // from class: l.xus
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196318a.m221717c3((List) obj);
            }
        }, new y20() { // from class: l.yus
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201660a.m221718d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m221720f3(Boolean bool) {
        ((cvs) this.viewModel).f84061d = bool.booleanValue();
        m221715Y2();
    }

    /* JADX INFO: renamed from: g3 */
    public void m221721g3() {
        duringCreated(ConnectivityReceiver.m82473m()).filter(new qcj() { // from class: l.uus
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.vus
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185844a.m221719e3((NetworkInfo) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.wus
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190883a.m221720f3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m221722h3(View view) {
        InterfaceC21902b interfaceC21902b = this.f206152f;
        if (interfaceC21902b != null) {
            interfaceC21902b.mo221726a(view);
            ((cvs) this.viewModel).m112868i(view, m221714X2(), this.f206152f);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public final void m221723i3(BLiveMenuItem bLiveMenuItem) {
        ((cvs) this.viewModel).m112866e();
        mbs.m157834T(getAct(), Uri.parse(bLiveMenuItem.jumpUri));
    }

    /* JADX INFO: renamed from: j3 */
    public void m221724j3(InterfaceC21902b interfaceC21902b) {
        this.f206152f = interfaceC21902b;
    }

    /* JADX INFO: renamed from: k3 */
    public final void m221725k3(@Nullable List<BLiveMenuItem> list) {
        this.f206153g.clear();
        if (jyb.m147479J(list)) {
            return;
        }
        this.f206153g.addAll(list);
    }

    /* JADX INFO: renamed from: l.zus$a */
    public class C21901a implements InterfaceC21902b {
        public C21901a() {
        }

        @Override // p153l.zus.InterfaceC21902b
        /* JADX INFO: renamed from: a */
        public void mo221726a(View view) {
            String str = (String) zus.this.m160243N2(new evs());
            if ("p_live_featured".equals(str)) {
                zus.this.m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().mo199273j(Boolean.FALSE);
            }
            if (!TextUtils.isEmpty(str)) {
                i4g0.m138520r("e_live_recommend_setting", str);
            }
            zus.this.m160238F2().LiveHomeMenuEvent.onMenuDialogShow().mo199273j(Boolean.TRUE);
        }

        @Override // p153l.zus.InterfaceC21902b
        /* JADX INFO: renamed from: c */
        public void mo221728c() {
            if ("p_live_featured".equals((String) zus.this.m160243N2(new evs()))) {
                zus.this.m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().mo199273j(Boolean.TRUE);
            }
            zus.this.m160238F2().LiveHomeMenuEvent.onMenuDialogShow().mo199273j(Boolean.FALSE);
        }

        @Override // p153l.zus.InterfaceC21902b
        /* JADX INFO: renamed from: b */
        public void mo221727b() {
        }
    }
}
