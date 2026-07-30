package p149l;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class aik0 extends weu<aik0> {

    /* JADX INFO: renamed from: f */
    public DialogC12611a f69999f;

    /* JADX INFO: renamed from: g */
    public final rlk0 f70000g;

    /* JADX INFO: renamed from: h */
    public final cmk0 f70001h;

    /* JADX INFO: renamed from: i */
    public final omk0 f70002i;

    /* JADX INFO: renamed from: j */
    public boolean f70003j;

    /* JADX INFO: renamed from: k */
    public cxl f70004k;

    /* JADX INFO: renamed from: l.aik0$a */
    public class C15630a implements OnFlingFrameLayout.InterfaceC12727b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VChatBeautyFilterView f70005a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DialogC12611a f70006b;

        public C15630a(VChatBeautyFilterView vChatBeautyFilterView, DialogC12611a dialogC12611a) {
            this.f70005a = vChatBeautyFilterView;
            this.f70006b = dialogC12611a;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12727b
        /* JADX INFO: renamed from: a */
        public void mo72233a() {
            this.f70006b.dismiss();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12727b
        /* JADX INFO: renamed from: c */
        public void mo72234c(boolean z) {
            if (this.f70005a.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
                aik0.this.f70001h.m107664p3(z);
            } else if (this.f70005a.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
                aik0.this.f70002i.m165140w3(z);
            }
        }
    }

    /* JADX INFO: renamed from: l.aik0$b */
    public class C15631b implements ContrastView.InterfaceC12725b {
        public C15631b() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12725b
        /* JADX INFO: renamed from: a */
        public void mo72227a() {
            aik0.this.f70000g.reset();
            aik0.this.f70001h.reset();
            aik0.this.f70002i.reset();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12725b
        /* JADX INFO: renamed from: b */
        public void mo72228b() {
            aik0.this.f70000g.m179809r3();
            aik0.this.f70001h.m107657g3();
            aik0.this.f70002i.m165131k3();
        }
    }

    public aik0(jlu jluVar, cxl cxlVar) {
        super(jluVar);
        this.f70004k = cxlVar;
        this.f70000g = (rlk0) m144512z2(new rlk0(jluVar));
        this.f70001h = (cmk0) m144512z2(new cmk0(jluVar, this));
        this.f70002i = (omk0) m144512z2(new omk0(jluVar, this));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218410I2(m218411K2().LiveVideoChatEvent.m69196f(), new e30() { // from class: l.vhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181514a.m96824Y2((soj0) obj);
            }
        });
        m96828c3();
    }

    /* JADX INFO: renamed from: X2 */
    public final DialogC12611a m96823X2() {
        Act act = act();
        final VChatBeautyFilterView vChatBeautyFilterView = (VChatBeautyFilterView) View.inflate(act, s6c0.f162684L1, null);
        this.f70000g.m179806o3(vChatBeautyFilterView);
        this.f70001h.m107655e3(vChatBeautyFilterView);
        this.f70002i.m165129i3(vChatBeautyFilterView);
        DialogC12611a dialogC12611a = new DialogC12611a(act, vChatBeautyFilterView);
        dialogC12611a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialogC12611a.setContentView(vChatBeautyFilterView);
        vChatBeautyFilterView.setOnEmptyFlingListener(new C15630a(vChatBeautyFilterView, dialogC12611a));
        vChatBeautyFilterView.setOnContrastListener(new C15631b());
        vChatBeautyFilterView.setOnPageChangeAction(new e30() { // from class: l.zhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203190a.m96825Z2(vChatBeautyFilterView, (BeautyTabItem) obj);
            }
        });
        vChatBeautyFilterView.setOnSeekBarChangeListener(this.f70000g);
        return dialogC12611a;
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m96824Y2(soj0 soj0Var) {
        m96829d3();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m96825Z2(VChatBeautyFilterView vChatBeautyFilterView, BeautyTabItem beautyTabItem) {
        if (beautyTabItem == BeautyTabItem.BEAUTY) {
            vChatBeautyFilterView.setOnSeekBarChangeListener(this.f70000g);
            vChatBeautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f70000g.m179805n3();
        } else if (beautyTabItem == BeautyTabItem.MAKE_UP) {
            vChatBeautyFilterView.setOnSeekBarChangeListener(this.f70002i);
            vChatBeautyFilterView.setOnSecondSeekBarChangeListener(this.f70002i);
            this.f70002i.m165128h3();
        } else {
            vChatBeautyFilterView.setOnSeekBarChangeListener(this.f70001h);
            vChatBeautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f70001h.m107654d3();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m96826a3(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        this.f70003j = false;
        this.f70004k.mo98907z(gli.m126765o(), gli.m126767q());
        this.f70000g.m179796c3(bLiveBeautyFilterConfig.beautyConfig);
        this.f70001h.m107650Y2(bLiveBeautyFilterConfig.filterConfig);
        this.f70002i.m165125c3(bLiveBeautyFilterConfig.makeUpConfig);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m96827b3(Throwable th) {
        this.f70003j = false;
        this.f70001h.m107651Z2();
        this.f70002i.m165126d3();
        gkh0.m126627j("videoChat", "beauty filter failed");
    }

    /* JADX INFO: renamed from: c3 */
    public void m96828c3() {
        if (this.f70003j) {
            return;
        }
        this.f70003j = true;
        cxl cxlVar = this.f70004k;
        if (cxlVar == null || cxlVar.mo98905v() == null) {
            return;
        }
        duringCreated((C22306c) this.f70004k.mo98905v().take(1).flatMap(new w9j() { // from class: l.whk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ypv.f199495c.m186354S();
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.xhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192897a.m96826a3((BLiveBeautyFilterConfig) obj);
            }
        }, new e30() { // from class: l.yhk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198355a.m96827b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d3 */
    public void m96829d3() {
        if (this.f69999f == null) {
            this.f69999f = m96823X2();
        }
        this.f70000g.m179807p3();
        this.f69999f.show();
    }
}
