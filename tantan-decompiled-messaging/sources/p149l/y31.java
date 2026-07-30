package p149l;

import android.app.Dialog;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.BottomSheetNestedProxyView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VPager;

/* JADX INFO: loaded from: classes12.dex */
public class y31 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f195727f;

    /* JADX INFO: renamed from: g */
    public String f195728g;

    /* JADX INFO: renamed from: h */
    public Moment f195729h;

    /* JADX INFO: renamed from: i */
    public List<AttitudeConfigs> f195730i;

    /* JADX INFO: renamed from: j */
    public User f195731j;

    /* JADX INFO: renamed from: k */
    public cwf0 f195732k;

    /* JADX INFO: renamed from: l */
    public final int f195733l;

    /* JADX INFO: renamed from: m */
    public TabLayout f195734m;

    /* JADX INFO: renamed from: n */
    public VPager f195735n;

    /* JADX INFO: renamed from: o */
    public View f195736o;

    /* JADX INFO: renamed from: p */
    public BottomSheetNestedProxyView f195737p;

    /* JADX INFO: renamed from: q */
    public c41 f195738q;

    /* JADX INFO: renamed from: r */
    public BottomSheetBehavior f195739r;

    /* JADX INFO: renamed from: s */
    public BottomSheetBehavior.BottomSheetCallback f195740s;

    public y31(@NonNull @NotNull Act act, @NonNull @NotNull String str, @NonNull @NotNull Moment moment, @NonNull @NotNull List<AttitudeConfigs> list) {
        super(act);
        this.f195733l = (xdl0.m208408w0() * 7) / 8;
        this.f195740s = new C21299a();
        m212756A(act);
        m212763z(str, moment, list);
    }

    /* JADX INFO: renamed from: A */
    private void m212756A(Act act) {
        this.f195727f = act;
        this.f195732k = i0e.m133794c("p_position_user", Dialog.class.getName());
        setContentView(o6c0.f142020E);
        this.f195734m = (TabLayout) findViewById(b5c0.f73510P1);
        this.f195735n = (VPager) findViewById(b5c0.f73584k2);
        this.f195736o = findViewById(b5c0.f73612u);
        this.f195737p = (BottomSheetNestedProxyView) findViewById(b5c0.f73563f1);
        this.f195738q = new c41(this);
        duringCreated(act.lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.w31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184297a.m212761E((C4319c) obj);
            }
        }));
        duringCreated(oe40.m163804F()).subscribe(mkd0.m154955G(new e30() { // from class: l.x31
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190858a.m212762F((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m212759C() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = this.f195733l;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m212760D() {
        return (this.f195728g == null || this.f195731j == null || this.f195729h == null || vwb.m200296J(this.f195730i)) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m212761E(C4319c c4319c) {
        if (c4319c == C4319c.f15552m && isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m212762F(Moment moment) {
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f195732k.m109035k();
        this.f195732k.m109034j();
    }

    @Override // android.app.Dialog
    public void show() {
        if (!m212760D()) {
            lsi0.m151580j("表态参数异常");
            return;
        }
        super.show();
        m212759C();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        this.f195739r = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f195727f.getResources().getDrawable(f3c0.f94361K0));
        this.f195739r.setState(3);
        this.f195739r.setBottomSheetCallback(this.f195740s);
        this.f195739r.setSkipCollapsed(true);
        this.f195739r.setPeekHeight(this.f195733l);
        this.f195732k.m109040p(vwb.m200311Y("source_page", this.f195728g), vwb.m200311Y("moment_id", this.f195729h.f56011id));
        this.f195732k.m109033i();
        this.f195732k.m109036l();
        this.f195738q.m105198g();
    }

    /* JADX INFO: renamed from: z */
    public void m212763z(@NonNull @NotNull String str, @NonNull @NotNull Moment moment, @NonNull @NotNull List<AttitudeConfigs> list) {
        this.f195728g = str;
        this.f195729h = moment;
        this.f195730i = list;
        if (NullChecker.m81303a(moment)) {
            this.f195731j = FeedModule.f38855d.m209447e8(moment.owner);
        } else {
            this.f195731j = null;
        }
    }

    /* JADX INFO: renamed from: l.y31$a */
    public class C21299a extends BottomSheetBehavior.BottomSheetCallback {
        public C21299a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                y31.this.dismiss();
                y31.this.f195739r.setState(4);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
