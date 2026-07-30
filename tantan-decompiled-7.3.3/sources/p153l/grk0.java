package p153l;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class grk0 extends xgu<grk0> {

    /* JADX INFO: renamed from: f */
    public DialogC12774a f106073f;

    /* JADX INFO: renamed from: g */
    public final xuk0 f106074g;

    /* JADX INFO: renamed from: h */
    public final ivk0 f106075h;

    /* JADX INFO: renamed from: i */
    public final uvk0 f106076i;

    /* JADX INFO: renamed from: j */
    public boolean f106077j;

    /* JADX INFO: renamed from: k */
    public vzl f106078k;

    /* JADX INFO: renamed from: l.grk0$a */
    public class C17281a implements OnFlingFrameLayout.InterfaceC12890b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VChatBeautyFilterView f106079a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC12774a f106080b;

        public C17281a(VChatBeautyFilterView vChatBeautyFilterView, DialogC12774a dialogC12774a) {
            this.f106079a = vChatBeautyFilterView;
            this.f106080b = dialogC12774a;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12890b
        /* JADX INFO: renamed from: a */
        public void mo73416a() {
            this.f106080b.dismiss();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12890b
        /* JADX INFO: renamed from: c */
        public void mo73417c(boolean z) {
            if (this.f106079a.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
                grk0.this.f106075h.m142343p3(z);
            } else if (this.f106079a.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
                grk0.this.f106076i.m198296w3(z);
            }
        }
    }

    /* JADX INFO: renamed from: l.grk0$b */
    public class C17282b implements ContrastView.InterfaceC12888b {
        public C17282b() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12888b
        /* JADX INFO: renamed from: a */
        public void mo73410a() {
            grk0.this.f106074g.reset();
            grk0.this.f106075h.reset();
            grk0.this.f106076i.reset();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12888b
        /* JADX INFO: renamed from: b */
        public void mo73411b() {
            grk0.this.f106074g.m213158r3();
            grk0.this.f106075h.m142336g3();
            grk0.this.f106076i.m198287k3();
        }
    }

    public grk0(knu knuVar, vzl vzlVar) {
        super(knuVar);
        this.f106078k = vzlVar;
        this.f106074g = (xuk0) m153103z2(new xuk0(knuVar));
        this.f106075h = (ivk0) m153103z2(new ivk0(knuVar, this));
        this.f106076i = (uvk0) m153103z2(new uvk0(knuVar, this));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97927I2(m97928K2().LiveVideoChatEvent.m70379f(), new y20() { // from class: l.brk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78031a.m131809Y2((vxj0) obj);
            }
        });
        m131813c3();
    }

    /* JADX INFO: renamed from: X2 */
    public final DialogC12774a m131808X2() {
        Act act = act();
        final VChatBeautyFilterView vChatBeautyFilterView = (VChatBeautyFilterView) View.inflate(act, xec0.f193798L1, null);
        this.f106074g.m213155o3(vChatBeautyFilterView);
        this.f106075h.m142334e3(vChatBeautyFilterView);
        this.f106076i.m198285i3(vChatBeautyFilterView);
        DialogC12774a dialogC12774a = new DialogC12774a(act, vChatBeautyFilterView);
        dialogC12774a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialogC12774a.setContentView(vChatBeautyFilterView);
        vChatBeautyFilterView.setOnEmptyFlingListener(new C17281a(vChatBeautyFilterView, dialogC12774a));
        vChatBeautyFilterView.setOnContrastListener(new C17282b());
        vChatBeautyFilterView.setOnPageChangeAction(new y20() { // from class: l.frk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100436a.m131810Z2(vChatBeautyFilterView, (BeautyTabItem) obj);
            }
        });
        vChatBeautyFilterView.setOnSeekBarChangeListener(this.f106074g);
        return dialogC12774a;
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m131809Y2(vxj0 vxj0Var) {
        m131814d3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m131810Z2(VChatBeautyFilterView vChatBeautyFilterView, BeautyTabItem beautyTabItem) {
        if (beautyTabItem == BeautyTabItem.BEAUTY) {
            vChatBeautyFilterView.setOnSeekBarChangeListener(this.f106074g);
            vChatBeautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f106074g.m213154n3();
        } else if (beautyTabItem == BeautyTabItem.MAKE_UP) {
            vChatBeautyFilterView.setOnSeekBarChangeListener(this.f106076i);
            vChatBeautyFilterView.setOnSecondSeekBarChangeListener(this.f106076i);
            this.f106076i.m198284h3();
        } else {
            vChatBeautyFilterView.setOnSeekBarChangeListener(this.f106075h);
            vChatBeautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f106075h.m142333d3();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m131811a3(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        this.f106077j = false;
        this.f106078k.mo143184z(coi.m111654o(), coi.m111656q());
        this.f106074g.m213145c3(bLiveBeautyFilterConfig.beautyConfig);
        this.f106075h.m142329Y2(bLiveBeautyFilterConfig.filterConfig);
        this.f106076i.m198281c3(bLiveBeautyFilterConfig.makeUpConfig);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m131812b3(Throwable th) {
        this.f106077j = false;
        this.f106075h.m142330Z2();
        this.f106076i.m198282d3();
        nsh0.m164608j("videoChat", "beauty filter failed");
    }

    /* JADX INFO: renamed from: c3 */
    public void m131813c3() {
        if (this.f106077j) {
            return;
        }
        this.f106077j = true;
        vzl vzlVar = this.f106078k;
        if (vzlVar == null || vzlVar.mo143182v() == null) {
            return;
        }
        duringCreated((C22421c) this.f106078k.mo143182v().take(1).flatMap(new qcj() { // from class: l.crk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zrv.f205801c.m193619S();
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.drk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90396a.m131811a3((BLiveBeautyFilterConfig) obj);
            }
        }, new y20() { // from class: l.erk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95483a.m131812b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d3 */
    public void m131814d3() {
        if (this.f106073f == null) {
            this.f106073f = m131808X2();
        }
        this.f106074g.m213156p3();
        this.f106073f.show();
    }
}
