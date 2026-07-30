package p002l;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.HashMap;
import java.util.Map;
import l.d30;
import l.e30;
import l.ffw;
import l.hfw;
import l.soj0;
import l.w9j;
import l.ypv;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xu2<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public C0200a f22461i;

    /* JADX INFO: renamed from: j */
    public final qw2<D> f22462j;

    /* JADX INFO: renamed from: k */
    public final xji<D> f22463k;

    /* JADX INFO: renamed from: l */
    public final tqw<D> f22464l;

    /* JADX INFO: renamed from: m */
    public boolean f22465m;

    /* JADX INFO: renamed from: l.xu2$a */
    public class C0901a implements OnFlingFrameLayout.InterfaceC0316b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BeautyFilterView f22466a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f22467b;

        public C0901a(BeautyFilterView beautyFilterView, d30 d30Var) {
            this.f22466a = beautyFilterView;
            this.f22467b = d30Var;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC0316b
        /* JADX INFO: renamed from: a */
        public void mo5706a() {
            d30 d30Var = this.f22467b;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout.InterfaceC0316b
        /* JADX INFO: renamed from: c */
        public void mo5707c(boolean z) {
            if (this.f22466a.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
                xu2.this.f22463k.m26021k4(z);
            } else if (this.f22466a.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
                xu2.this.f22464l.m23150r4(z);
            }
        }
    }

    /* JADX INFO: renamed from: l.xu2$b */
    public class C0902b implements ContrastView.InterfaceC0314b {
        public C0902b() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC0314b
        /* JADX INFO: renamed from: a */
        public void mo5700a() {
            xu2.this.f22462j.reset();
            xu2.this.f22463k.reset();
            xu2.this.f22464l.reset();
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView.InterfaceC0314b
        /* JADX INFO: renamed from: b */
        public void mo5701b() {
            xu2.this.f22462j.m21619m4();
            xu2.this.f22463k.m26018c4();
            xu2.this.f22464l.m23147g4();
        }
    }

    public xu2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f22462j = (qw2) z2(new qw2(bsmVar));
        this.f22463k = (xji) z2(new xji(bsmVar));
        this.f22464l = (tqw) z2(new tqw(bsmVar));
    }

    /* JADX INFO: renamed from: X3 */
    private C0200a m26135X3() {
        BeautyFilterView beautyFilterView = (BeautyFilterView) View.inflate(act(), t6c0.f19949o, null);
        final byr byrVar = new byr(this, beautyFilterView);
        m26138Y3(beautyFilterView, new d30() { // from class: l.su2
            public final void call() {
                byrVar.dismiss();
            }
        });
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tu2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f20378a.m26143d4(dialogInterface);
            }
        });
        return byrVar;
    }

    /* JADX INFO: renamed from: h4 */
    private void m26136h4() {
        if (this.f22465m) {
            return;
        }
        this.f22465m = true;
        bxl bxlVar = (bxl) m14184F3(new bu00(2500));
        if (bxlVar == null || bxlVar.mo5263v() == null) {
            return;
        }
        duringCreated(bxlVar.mo5263v().take(1).flatMap(new w9j() { // from class: l.uu2
            public final Object call(Object obj) {
                return ypv.c.m22741S();
            }
        })).subscribe(ffw.e(new e30() { // from class: l.vu2
            public final void call(Object obj) {
                this.f21324a.m26145f4((BLiveBeautyFilterConfig) obj);
            }
        }, new e30() { // from class: l.wu2
            public final void call(Object obj) {
                this.f21979a.m26146g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m26137T() {
        super.T();
        duringCreated((c) m25548F2().BottomEvent.showDialog().g()).filter(new w9j() { // from class: l.mu2
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "beauty"));
            }
        }).subscribe(ffw.h(new e30() { // from class: l.ou2
            public final void call(Object obj) {
                this.f16793a.m26139Z3((BLiveButtonType) obj);
            }
        }));
        m14188d3(rw2.class, new w9j() { // from class: l.pu2
            public final Object call(Object obj) {
                return this.f17651a.m26140a4((rw2) obj);
            }
        });
        duringCreated((c) m25548F2().BeautyEvent.loadBeautyConfig().g()).subscribe(ffw.h(new e30() { // from class: l.qu2
            public final void call(Object obj) {
                this.f18233a.m26141b4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().MultiCallEvent.hangUpSelfCall().g()).subscribe(ffw.h(new e30() { // from class: l.ru2
            public final void call(Object obj) {
                this.f18681a.m26142c4((BLiveMultiCall) obj);
            }
        }));
        m26136h4();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m26138Y3(final BeautyFilterView beautyFilterView, d30 d30Var) {
        this.f22462j.m21616g4(beautyFilterView);
        this.f22463k.m26016Y3(beautyFilterView);
        this.f22464l.m23145c4(beautyFilterView);
        beautyFilterView.setOnEmptyFlingListener(new C0901a(beautyFilterView, d30Var));
        beautyFilterView.setOnContrastListener(new C0902b());
        beautyFilterView.setOnPageChangeAction(new e30() { // from class: l.nu2
            public final void call(Object obj) {
                this.f16197a.m26144e4(beautyFilterView, (BeautyTabItem) obj);
            }
        });
        beautyFilterView.setOnSeekBarChangeListener(this.f22462j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m26139Z3(BLiveButtonType bLiveButtonType) {
        m26147i4();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Map m26140a4(rw2 rw2Var) {
        HashMap map = new HashMap();
        map.putAll(this.f22462j.m21607W3());
        map.putAll(this.f22463k.m26011R3());
        map.putAll(this.f22464l.m23141V3());
        return map;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m26141b4(soj0 soj0Var) {
        m26136h4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m26142c4(BLiveMultiCall bLiveMultiCall) {
        a aVar = this.f22461i;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f22461i.dismiss();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m26143d4(DialogInterface dialogInterface) {
        m25548F2().LivePusherEvent.dismissBeautyDialog().p();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m26144e4(BeautyFilterView beautyFilterView, BeautyTabItem beautyTabItem) {
        if (beautyTabItem == BeautyTabItem.BEAUTY) {
            beautyFilterView.setOnSeekBarChangeListener(this.f22462j);
            beautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f22462j.m21617j4();
        } else if (beautyTabItem == BeautyTabItem.MAKE_UP) {
            beautyFilterView.setOnSeekBarChangeListener(this.f22464l);
            beautyFilterView.setOnSecondSeekBarChangeListener(this.f22464l);
            this.f22464l.m23146e4();
        } else {
            beautyFilterView.setOnSeekBarChangeListener(this.f22463k);
            beautyFilterView.setOnSecondSeekBarChangeListener(null);
            this.f22463k.m26017a4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m26145f4(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
        this.f22465m = false;
        ((bxl) m14184F3(new bu00(2303))).mo5265z(gli.m13892o(), gli.m13894q());
        this.f22462j.m21608X3(bLiveBeautyFilterConfig.beautyConfig);
        this.f22463k.m26012S3(bLiveBeautyFilterConfig.filterConfig);
        this.f22464l.m23142W3(bLiveBeautyFilterConfig.makeUpConfig);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m26146g4(Throwable th) {
        this.f22465m = false;
        this.f22463k.m26014T3();
        this.f22464l.m23143X3();
        StringBuilder sb = new StringBuilder("beauty filter failed:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.a("[live]beauty_filter", sb.toString());
    }

    /* JADX INFO: renamed from: i4 */
    public void m26147i4() {
        if (this.f22461i == null) {
            this.f22461i = m26135X3();
        }
        this.f22461i.show();
    }
}
