package p009l;

import android.R;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.da;
import l.e51;
import l.g83;
import l.j760;
import l.k6c0;
import l.l5j0;
import l.lac0;
import l.oey;
import l.t100;
import l.vwb;
import l.w7c0;
import l.x4c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x83 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VImage f22460f;

    /* JADX INFO: renamed from: g */
    public View f22461g;

    /* JADX INFO: renamed from: h */
    public TextView f22462h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f22463i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f22464j;

    /* JADX INFO: renamed from: k */
    public String f22465k;

    /* JADX INFO: renamed from: l */
    public Act f22466l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f22467m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior.BottomSheetCallback f22468n;

    /* JADX WARN: Multi-variable type inference failed */
    public x83(@NonNull final Act act, final String str) {
        super(act, w7c0.d);
        this.f22465k = "";
        this.f22468n = new C1297a();
        this.f22466l = act;
        setCancelable(false);
        this.f22465k = str;
        setContentView(k6c0.I0);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(x4c0.h);
        frameLayout.setBackgroundResource(R.color.transparent);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f22467m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f22467m.setSkipCollapsed(true);
        this.f22467m.setBottomSheetCallback(this.f22468n);
        VImage vImageFindViewById = findViewById(x4c0.d);
        this.f22460f = vImageFindViewById;
        vImageFindViewById.setImageAlpha(153);
        View viewFindViewById = findViewById(x4c0.C);
        this.f22461g = viewFindViewById;
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.v83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21478a.m24741D(act, view);
            }
        });
        TextView textView = (TextView) findViewById(x4c0.v);
        this.f22462h = textView;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM = lac0.m();
        TextView textView2 = this.f22462h;
        if (zM) {
            xdl0.H0(textView2, xma.R3() ? "立即获取" : "立即使用");
        } else {
            xdl0.H0(textView2, CoreModule.P().a().s8() ? "立即获取" : "立即使用");
        }
        xdl0.U(this.f22462h, oey.a(getContext()) ? t100.j : t100.A);
        xdl0.E0(this.f22462h, new View.OnClickListener() { // from class: l.w83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21941a.m24742E(act, str, view);
            }
        });
        xdl0.I(getContext());
        this.f22463i = findViewById(x4c0.e);
        this.f22464j = findViewById(x4c0.c);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/c8af9bff-3dbd-425d-9be3-058125b716eb13.svga").autoPlay(false).into(this.f22463i);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/31429bf5-9bbd-42df-b607-5a5929f6256b12.svga").autoPlay(false).repeatCount(1).into(this.f22464j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m24736F() {
        this.f22463i.startAnimation();
        this.f22464j.startAnimation();
    }

    /* JADX INFO: renamed from: C */
    public final String m24740C() {
        return this.f22466l.pageId();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m24741D(Act act, View view) {
        zvf0.u("e_boost_guide", m24740C(), new j760[]{vwb.Y("button_type", "close")});
        dismiss();
        if (lac0.m()) {
            da.Companion.r(act);
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m24742E(Act act, String str, View view) {
        zvf0.u("e_boost_guide", m24740C(), new j760[]{vwb.Y("button_type", "open")});
        dismiss();
        if (lac0.m()) {
            da.Companion.t(act, false, str);
        } else {
            g83.f(act, false, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        zvf0.x("e_boost_guide", m24740C());
        e51.H(this.f22466l, new Runnable() { // from class: l.u83
            @Override // java.lang.Runnable
            public final void run() {
                this.f21013a.m24736F();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: l.x83$a */
    public class C1297a extends BottomSheetBehavior.BottomSheetCallback {
        public C1297a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                x83.this.f22467m.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
