package p153l;

import android.content.DialogInterface;
import android.view.View;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import java.util.HashMap;
import java.util.Map;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class nv2<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public DialogC12774a f143759i;

    /* JADX INFO: renamed from: j */
    public final gx2<D> f143760j;

    /* JADX INFO: renamed from: k */
    public final tmi<D> f143761k;

    /* JADX INFO: renamed from: l */
    public final stw<D> f143762l;

    /* JADX INFO: renamed from: m */
    public boolean f143763m;

    /* JADX INFO: renamed from: l.nv2$a */
    public class C18955a implements OnFlingFrameLayout.InterfaceC12890b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BeautyFilterView f143764a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f143765b;

        public C18955a(BeautyFilterView beautyFilterView, x20 x20Var) {
            this.f143764a = beautyFilterView;
            this.f143765b = x20Var;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12890b
        /* JADX INFO: renamed from: a */
        public void mo73416a() {
            x20 x20Var = this.f143765b;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12890b
        /* JADX INFO: renamed from: c */
        public void mo73417c(boolean z) {
            if (this.f143764a.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
                nv2.this.f143761k.m191793k4(z);
            } else if (this.f143764a.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
                nv2.this.f143762l.m187974r4(z);
            }
        }
    }

    /* JADX INFO: renamed from: l.nv2$b */
    public class C18956b implements ContrastView.InterfaceC12888b {
        public C18956b() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12888b
        /* JADX INFO: renamed from: a */
        public void mo73410a() {
            nv2.this.f143760j.reset();
            nv2.this.f143761k.reset();
            nv2.this.f143762l.reset();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12888b
        /* JADX INFO: renamed from: b */
        public void mo73411b() {
            nv2.this.f143760j.m132740m4();
            nv2.this.f143761k.m191790c4();
            nv2.this.f143762l.m187971g4();
        }
    }

    public nv2(dum<D> dumVar) {
        super(dumVar);
        this.f143760j = (gx2) m153103z2(new gx2(dumVar));
        this.f143761k = (tmi) m153103z2(new tmi(dumVar));
        this.f143762l = (stw) m153103z2(new stw(dumVar));
    }

    /* JADX INFO: renamed from: X3 */
    private DialogC12774a m164834X3() {
        BeautyFilterView beautyFilterView = (BeautyFilterView) View.inflate(act(), yec0.f199185o, null);
        final c0s c0sVar = new c0s(this, beautyFilterView);
        m164836Y3(beautyFilterView, new x20() { // from class: l.iv2
            @Override // p153l.x20
            public final void call() {
                c0sVar.dismiss();
            }
        });
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jv2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f122761a.m164841d4(dialogInterface);
            }
        });
        return c0sVar;
    }

    /* JADX INFO: renamed from: h4 */
    private void m164835h4() {
        if (this.f143763m) {
            return;
        }
        this.f143763m = true;
        uzl uzlVar = (uzl) m138856F3(new k210(2500));
        if (uzlVar == null || uzlVar.mo73068v() == null) {
            return;
        }
        duringCreated(uzlVar.mo73068v().take(1).flatMap(new qcj() { // from class: l.kv2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zrv.f205801c.m193619S();
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.lv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133676a.m164843f4((BLiveBeautyFilterConfig) obj);
            }
        }, new y20() { // from class: l.mv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138867a.m164844g4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().BottomEvent.showDialog().m199270g()).filter(new qcj() { // from class: l.cv2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "beauty"));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ev2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95975a.m164837Z3((BLiveButtonType) obj);
            }
        }));
        m138860d3(hx2.class, new qcj() { // from class: l.fv2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100981a.m164838a4((hx2) obj);
            }
        });
        duringCreated((C22421c) m213811F2().BeautyEvent.loadBeautyConfig().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.gv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106597a.m164839b4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiCallEvent.hangUpSelfCall().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.hv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111723a.m164840c4((BLiveMultiCall) obj);
            }
        }));
        m164835h4();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m164836Y3(final BeautyFilterView beautyFilterView, x20 x20Var) {
        this.f143760j.m132737g4(beautyFilterView);
        this.f143761k.m191788Y3(beautyFilterView);
        this.f143762l.m187969c4(beautyFilterView);
        beautyFilterView.setOnEmptyFlingListener(new C18955a(beautyFilterView, x20Var));
        beautyFilterView.setOnContrastListener(new C18956b());
        beautyFilterView.setOnPageChangeAction(new y20() { // from class: l.dv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90905a.m164842e4(beautyFilterView, (BeautyTabItem) obj);
            }
        });
        beautyFilterView.setOnSeekBarChangeListener(this.f143760j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m164837Z3(BLiveButtonType bLiveButtonType) {
        m164845i4();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Map m164838a4(hx2 hx2Var) {
        HashMap map = new HashMap();
        map.putAll(this.f143760j.m132728W3());
        map.putAll(this.f143761k.m191784R3());
        map.putAll(this.f143762l.m187965V3());
        return map;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m164839b4(vxj0 vxj0Var) {
        m164835h4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m164840c4(BLiveMultiCall bLiveMultiCall) {
        DialogC12774a dialogC12774a = this.f143759i;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f143759i.dismiss();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m164841d4(DialogInterface dialogInterface) {
        m213811F2().LivePusherEvent.dismissBeautyDialog().m199277p();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m164842e4(BeautyFilterView beautyFilterView, BeautyTabItem beautyTabItem) {
        if (beautyTabItem == BeautyTabItem.BEAUTY) {
            beautyFilterView.setOnSeekBarChangeListener(this.f143760j);
            beautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f143760j.m132738j4();
        } else if (beautyTabItem == BeautyTabItem.MAKE_UP) {
            beautyFilterView.setOnSeekBarChangeListener(this.f143762l);
            beautyFilterView.setOnSecondSeekBarChangeListener(this.f143762l);
            this.f143762l.m187970e4();
        } else {
            beautyFilterView.setOnSeekBarChangeListener(this.f143761k);
            beautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f143761k.m191789a4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m164843f4(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        this.f143763m = false;
        ((uzl) m138856F3(new k210(2303))).mo73070z(coi.m111654o(), coi.m111656q());
        this.f143760j.m132729X3(bLiveBeautyFilterConfig.beautyConfig);
        this.f143761k.m191785S3(bLiveBeautyFilterConfig.filterConfig);
        this.f143762l.m187966W3(bLiveBeautyFilterConfig.makeUpConfig);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m164844g4(Throwable th) {
        this.f143763m = false;
        this.f143761k.m191786T3();
        this.f143762l.m187967X3();
        StringBuilder sb = new StringBuilder("beauty filter failed:");
        sb.append(th == null ? "null" : th.getMessage());
        fhw.m125605a("[live]beauty_filter", sb.toString());
    }

    /* JADX INFO: renamed from: i4 */
    public void m164845i4() {
        if (this.f143759i == null) {
            this.f143759i = m164834X3();
        }
        this.f143759i.show();
    }
}
