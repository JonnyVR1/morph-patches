package p153l;

import android.app.Dialog;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.BottomSheetNestedProxyView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class f41 extends pej0 {

    /* JADX INFO: renamed from: f */
    public Act f97030f;

    /* JADX INFO: renamed from: g */
    public String f97031g;

    /* JADX INFO: renamed from: h */
    public Moment f97032h;

    /* JADX INFO: renamed from: i */
    public List<AttitudeConfigs> f97033i;

    /* JADX INFO: renamed from: j */
    public User f97034j;

    /* JADX INFO: renamed from: k */
    public l4g0 f97035k;

    /* JADX INFO: renamed from: l */
    public final int f97036l;

    /* JADX INFO: renamed from: m */
    public TabLayout f97037m;

    /* JADX INFO: renamed from: n */
    public VPager f97038n;

    /* JADX INFO: renamed from: o */
    public View f97039o;

    /* JADX INFO: renamed from: p */
    public BottomSheetNestedProxyView f97040p;

    /* JADX INFO: renamed from: q */
    public j41 f97041q;

    /* JADX INFO: renamed from: r */
    public BottomSheetBehavior f97042r;

    /* JADX INFO: renamed from: s */
    public BottomSheetBehavior.BottomSheetCallback f97043s;

    public f41(@NonNull @NotNull Act act, @NonNull @NotNull String str, @NonNull @NotNull Moment moment, @NonNull @NotNull List<AttitudeConfigs> list) {
        super(act);
        this.f97036l = (bnl0.m105588w0() * 7) / 8;
        this.f97043s = new C16888a();
        m123858A(act);
        m123865z(str, moment, list);
    }

    /* JADX INFO: renamed from: A */
    private void m123858A(Act act) {
        this.f97030f = act;
        this.f97035k = w1e.m204399c("p_position_user", Dialog.class.getName());
        setContentView(tec0.f173489E);
        this.f97037m = (TabLayout) findViewById(hdc0.f108863P1);
        this.f97038n = (VPager) findViewById(hdc0.f108937k2);
        this.f97039o = findViewById(hdc0.f108965u);
        this.f97040p = (BottomSheetNestedProxyView) findViewById(hdc0.f108916f1);
        this.f97041q = new j41(this);
        duringCreated(act.lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.d41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84995a.m123863E((C4470c) obj);
            }
        }));
        duringCreated(cn40.m111354F()).subscribe(psd0.m173596G(new y20() { // from class: l.e41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92024a.m123864F((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m123861C() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = this.f97036l;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m123862D() {
        return (this.f97031g == null || this.f97034j == null || this.f97032h == null || jyb.m147479J(this.f97033i)) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m123863E(C4470c c4470c) {
        if (c4470c == C4470c.f16271m && isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m123864F(Moment moment) {
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f97035k.m152776k();
        this.f97035k.m152775j();
    }

    @Override // android.app.Dialog
    public void show() {
        if (!m123862D()) {
            o1j0.m165636j("表态参数异常");
            return;
        }
        super.show();
        m123861C();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        this.f97042r = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f97030f.getResources().getDrawable(lbc0.f130879K0));
        this.f97042r.setState(3);
        this.f97042r.setBottomSheetCallback(this.f97043s);
        this.f97042r.setSkipCollapsed(true);
        this.f97042r.setPeekHeight(this.f97036l);
        this.f97035k.m152781p(jyb.m147494Y("source_page", this.f97031g), jyb.m147494Y("moment_id", this.f97032h.f56859id));
        this.f97035k.m152774i();
        this.f97035k.m152777l();
        this.f97041q.m143385g();
    }

    /* JADX INFO: renamed from: z */
    public void m123865z(@NonNull @NotNull String str, @NonNull @NotNull Moment moment, @NonNull @NotNull List<AttitudeConfigs> list) {
        this.f97031g = str;
        this.f97032h = moment;
        this.f97033i = list;
        if (NullChecker.m82486a(moment)) {
            this.f97034j = FeedModule.f39703d.m145688e8(moment.owner);
        } else {
            this.f97034j = null;
        }
    }

    /* JADX INFO: renamed from: l.f41$a */
    public class C16888a extends BottomSheetBehavior.BottomSheetCallback {
        public C16888a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                f41.this.dismiss();
                f41.this.f97042r.setState(4);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
