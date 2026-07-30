package p149l;

import android.content.DialogInterface;
import android.view.View;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import java.util.HashMap;
import java.util.Map;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class xu2<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public DialogC12611a f194461i;

    /* JADX INFO: renamed from: j */
    public final qw2<D> f194462j;

    /* JADX INFO: renamed from: k */
    public final xji<D> f194463k;

    /* JADX INFO: renamed from: l */
    public final tqw<D> f194464l;

    /* JADX INFO: renamed from: m */
    public boolean f194465m;

    /* JADX INFO: renamed from: l.xu2$a */
    public class C21218a implements OnFlingFrameLayout.InterfaceC12727b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BeautyFilterView f194466a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f194467b;

        public C21218a(BeautyFilterView beautyFilterView, d30 d30Var) {
            this.f194466a = beautyFilterView;
            this.f194467b = d30Var;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12727b
        /* JADX INFO: renamed from: a */
        public void mo72233a() {
            d30 d30Var = this.f194467b;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC12727b
        /* JADX INFO: renamed from: c */
        public void mo72234c(boolean z) {
            if (this.f194466a.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
                xu2.this.f194463k.m209727k4(z);
            } else if (this.f194466a.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
                xu2.this.f194464l.m190197r4(z);
            }
        }
    }

    /* JADX INFO: renamed from: l.xu2$b */
    public class C21219b implements ContrastView.InterfaceC12725b {
        public C21219b() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12725b
        /* JADX INFO: renamed from: a */
        public void mo72227a() {
            xu2.this.f194462j.reset();
            xu2.this.f194463k.reset();
            xu2.this.f194464l.reset();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC12725b
        /* JADX INFO: renamed from: b */
        public void mo72228b() {
            xu2.this.f194462j.m176769m4();
            xu2.this.f194463k.m209724c4();
            xu2.this.f194464l.m190194g4();
        }
    }

    public xu2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f194462j = (qw2) m144512z2(new qw2(bsmVar));
        this.f194463k = (xji) m144512z2(new xji(bsmVar));
        this.f194464l = (tqw) m144512z2(new tqw(bsmVar));
    }

    /* JADX INFO: renamed from: X3 */
    private DialogC12611a m211066X3() {
        BeautyFilterView beautyFilterView = (BeautyFilterView) View.inflate(act(), t6c0.f168453o, null);
        final byr byrVar = new byr(this, beautyFilterView);
        m211068Y3(beautyFilterView, new d30() { // from class: l.su2
            @Override // p149l.d30
            public final void call() {
                byrVar.dismiss();
            }
        });
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tu2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f172112a.m211073d4(dialogInterface);
            }
        });
        return byrVar;
    }

    /* JADX INFO: renamed from: h4 */
    private void m211067h4() {
        if (this.f194465m) {
            return;
        }
        this.f194465m = true;
        bxl bxlVar = (bxl) m129297F3(new bu00(2500));
        if (bxlVar == null || bxlVar.mo71885v() == null) {
            return;
        }
        duringCreated(bxlVar.mo71885v().take(1).flatMap(new w9j() { // from class: l.uu2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ypv.f199495c.m186354S();
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.vu2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183024a.m211075f4((BLiveBeautyFilterConfig) obj);
            }
        }, new e30() { // from class: l.wu2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188077a.m211076g4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().BottomEvent.showDialog().m172460g()).filter(new w9j() { // from class: l.mu2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "beauty"));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ou2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145651a.m211069Z3((BLiveButtonType) obj);
            }
        }));
        m129301d3(rw2.class, new w9j() { // from class: l.pu2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151240a.m211070a4((rw2) obj);
            }
        });
        duringCreated((C22306c) m206028F2().BeautyEvent.loadBeautyConfig().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.qu2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156422a.m211071b4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiCallEvent.hangUpSelfCall().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ru2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161015a.m211072c4((BLiveMultiCall) obj);
            }
        }));
        m211067h4();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m211068Y3(final BeautyFilterView beautyFilterView, d30 d30Var) {
        this.f194462j.m176766g4(beautyFilterView);
        this.f194463k.m209722Y3(beautyFilterView);
        this.f194464l.m190192c4(beautyFilterView);
        beautyFilterView.setOnEmptyFlingListener(new C21218a(beautyFilterView, d30Var));
        beautyFilterView.setOnContrastListener(new C21219b());
        beautyFilterView.setOnPageChangeAction(new e30() { // from class: l.nu2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140562a.m211074e4(beautyFilterView, (BeautyTabItem) obj);
            }
        });
        beautyFilterView.setOnSeekBarChangeListener(this.f194462j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m211069Z3(BLiveButtonType bLiveButtonType) {
        m211077i4();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Map m211070a4(rw2 rw2Var) {
        HashMap map = new HashMap();
        map.putAll(this.f194462j.m176757W3());
        map.putAll(this.f194463k.m209718R3());
        map.putAll(this.f194464l.m190188V3());
        return map;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m211071b4(soj0 soj0Var) {
        m211067h4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m211072c4(BLiveMultiCall bLiveMultiCall) {
        DialogC12611a dialogC12611a = this.f194461i;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f194461i.dismiss();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m211073d4(DialogInterface dialogInterface) {
        m206028F2().LivePusherEvent.dismissBeautyDialog().m172467p();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m211074e4(BeautyFilterView beautyFilterView, BeautyTabItem beautyTabItem) {
        if (beautyTabItem == BeautyTabItem.BEAUTY) {
            beautyFilterView.setOnSeekBarChangeListener(this.f194462j);
            beautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f194462j.m176767j4();
        } else if (beautyTabItem == BeautyTabItem.MAKE_UP) {
            beautyFilterView.setOnSeekBarChangeListener(this.f194464l);
            beautyFilterView.setOnSecondSeekBarChangeListener(this.f194464l);
            this.f194464l.m190193e4();
        } else {
            beautyFilterView.setOnSeekBarChangeListener(this.f194463k);
            beautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f194463k.m209723a4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m211075f4(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        this.f194465m = false;
        ((bxl) m129297F3(new bu00(2303))).mo71887z(gli.m126765o(), gli.m126767q());
        this.f194462j.m176758X3(bLiveBeautyFilterConfig.beautyConfig);
        this.f194463k.m209719S3(bLiveBeautyFilterConfig.filterConfig);
        this.f194464l.m190189W3(bLiveBeautyFilterConfig.makeUpConfig);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m211076g4(Throwable th) {
        this.f194465m = false;
        this.f194463k.m209720T3();
        this.f194464l.m190190X3();
        StringBuilder sb = new StringBuilder("beauty filter failed:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.m130790a("[live]beauty_filter", sb.toString());
    }

    /* JADX INFO: renamed from: i4 */
    public void m211077i4() {
        if (this.f194461i == null) {
            this.f194461i = m211066X3();
        }
        this.f194461i.show();
    }
}
