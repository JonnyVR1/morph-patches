package p007l;

import android.app.Dialog;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.BottomSheetNestedProxyView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.e30;
import l.i0e;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.p4c0;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y31 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f15211f;

    /* JADX INFO: renamed from: g */
    public String f15212g;

    /* JADX INFO: renamed from: h */
    public Moment f15213h;

    /* JADX INFO: renamed from: i */
    public List<AttitudeConfigs> f15214i;

    /* JADX INFO: renamed from: j */
    public User f15215j;

    /* JADX INFO: renamed from: k */
    public cwf0 f15216k;

    /* JADX INFO: renamed from: l */
    public final int f15217l;

    /* JADX INFO: renamed from: m */
    public TabLayout f15218m;

    /* JADX INFO: renamed from: n */
    public VPager f15219n;

    /* JADX INFO: renamed from: o */
    public View f15220o;

    /* JADX INFO: renamed from: p */
    public BottomSheetNestedProxyView f15221p;

    /* JADX INFO: renamed from: q */
    public c41 f15222q;

    /* JADX INFO: renamed from: r */
    public BottomSheetBehavior f15223r;

    /* JADX INFO: renamed from: s */
    public BottomSheetBehavior.BottomSheetCallback f15224s;

    public y31(@NonNull @NotNull Act act, @NonNull @NotNull String str, @NonNull @NotNull Moment moment, @NonNull @NotNull List<AttitudeConfigs> list) {
        super(act);
        this.f15217l = (xdl0.w0() * 7) / 8;
        this.f15224s = new C2535a();
        m16889A(act);
        m16896z(str, moment, list);
    }

    /* JADX INFO: renamed from: A */
    private void m16889A(Act act) {
        this.f15211f = act;
        this.f15216k = i0e.c("p_position_user", Dialog.class.getName());
        setContentView(o6c0.f11039E);
        this.f15218m = findViewById(b5c0.f5991P1);
        this.f15219n = findViewById(b5c0.f6065k2);
        this.f15220o = findViewById(b5c0.f6093u);
        this.f15221p = (BottomSheetNestedProxyView) findViewById(b5c0.f6044f1);
        this.f15222q = new c41(this);
        duringCreated(act.lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.w31
            public final void call(Object obj) {
                this.f14380a.m16894E((c) obj);
            }
        }));
        duringCreated(oe40.m12541F()).subscribe(mkd0.G(new e30() { // from class: l.x31
            public final void call(Object obj) {
                this.f14750a.m16895F((Moment) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m16892C() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = this.f15217l;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m16893D() {
        return (this.f15212g == null || this.f15215j == null || this.f15213h == null || vwb.J(this.f15214i)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m16894E(c cVar) {
        if (cVar == c.m && isShowing()) {
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m16895F(Moment moment) {
        if (isShowing()) {
            dismiss();
        }
    }

    public void dismiss() {
        super.dismiss();
        this.f15216k.k();
        this.f15216k.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        if (!m16893D()) {
            lsi0.j("表态参数异常");
            return;
        }
        super/*android.app.Dialog*/.show();
        m16892C();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        this.f15223r = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f15211f.getResources().getDrawable(f3c0.f7644K0));
        this.f15223r.setState(3);
        this.f15223r.setBottomSheetCallback(this.f15224s);
        this.f15223r.setSkipCollapsed(true);
        this.f15223r.setPeekHeight(this.f15217l);
        this.f15216k.p(new j760[]{vwb.Y("source_page", this.f15212g), vwb.Y("moment_id", ((DbObject) this.f15213h).id)});
        this.f15216k.i();
        this.f15216k.l();
        this.f15222q.m9100g();
    }

    /* JADX INFO: renamed from: z */
    public void m16896z(@NonNull @NotNull String str, @NonNull @NotNull Moment moment, @NonNull @NotNull List<AttitudeConfigs> list) {
        this.f15212g = str;
        this.f15213h = moment;
        this.f15214i = list;
        if (NullChecker.a(moment)) {
            this.f15215j = FeedModule.f316d.m16628e8(moment.owner);
        } else {
            this.f15215j = null;
        }
    }

    /* JADX INFO: renamed from: l.y31$a */
    public class C2535a extends BottomSheetBehavior.BottomSheetCallback {
        public C2535a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                y31.this.dismiss();
                y31.this.f15223r.setState(4);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
