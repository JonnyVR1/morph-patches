package p149l;

import android.R;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class x83 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VImage f191427f;

    /* JADX INFO: renamed from: g */
    public View f191428g;

    /* JADX INFO: renamed from: h */
    public TextView f191429h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f191430i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f191431j;

    /* JADX INFO: renamed from: k */
    public String f191432k;

    /* JADX INFO: renamed from: l */
    public Act f191433l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f191434m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior.BottomSheetCallback f191435n;

    public x83(@NonNull final Act act, final String str) {
        super(act, w7c0.f185041d);
        this.f191432k = "";
        this.f191435n = new C21042a();
        this.f191433l = act;
        setCancelable(false);
        this.f191432k = str;
        setContentView(k6c0.f121304I0);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(x4c0.f190997h);
        frameLayout.setBackgroundResource(R.color.transparent);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f191434m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f191434m.setSkipCollapsed(true);
        this.f191434m.setBottomSheetCallback(this.f191435n);
        VImage vImage = (VImage) findViewById(x4c0.f190993d);
        this.f191427f = vImage;
        vImage.setImageAlpha(153);
        View viewFindViewById = findViewById(x4c0.f190968C);
        this.f191428g = viewFindViewById;
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.v83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180444a.m207366D(act, view);
            }
        });
        TextView textView = (TextView) findViewById(x4c0.f191011v);
        this.f191429h = textView;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM149136m = lac0.m149136m();
        TextView textView2 = this.f191429h;
        if (zM149136m) {
            xdl0.m208335H0(textView2, xma.m210053R3() ? "立即获取" : "立即使用");
        } else {
            xdl0.m208335H0(textView2, CoreModule.m29935P().m94651a().mo33586s8() ? "立即获取" : "立即使用");
        }
        xdl0.m208357U(this.f191429h, oey.m164038a(getContext()) ? t100.f167261j : t100.f167226A);
        xdl0.m208329E0(this.f191429h, new View.OnClickListener() { // from class: l.w83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185137a.m207367E(act, str, view);
            }
        });
        xdl0.m208336I(getContext());
        this.f191430i = (SVGAnimationView) findViewById(x4c0.f190994e);
        this.f191431j = (SVGAnimationView) findViewById(x4c0.f190992c);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/c8af9bff-3dbd-425d-9be3-058125b716eb13.svga").autoPlay(false).into(this.f191430i);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/31429bf5-9bbd-42df-b607-5a5929f6256b12.svga").autoPlay(false).repeatCount(1).into(this.f191431j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m207361F() {
        this.f191430i.startAnimation();
        this.f191431j.startAnimation();
    }

    /* JADX INFO: renamed from: C */
    public final String m207365C() {
        return this.f191433l.pageId();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m207366D(Act act, View view) {
        zvf0.m220399u("e_boost_guide", m207365C(), vwb.m200311Y("button_type", "close"));
        dismiss();
        if (lac0.m149136m()) {
            C16319da.INSTANCE.m110516r(act);
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m207367E(Act act, String str, View view) {
        zvf0.m220399u("e_boost_guide", m207365C(), vwb.m200311Y("button_type", "open"));
        dismiss();
        if (lac0.m149136m()) {
            C16319da.INSTANCE.m110518t(act, false, str);
        } else {
            g83.m124743f(act, false, str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        zvf0.m220402x("e_boost_guide", m207365C());
        e51.m114743H(this.f191433l, new Runnable() { // from class: l.u83
            @Override // java.lang.Runnable
            public final void run() {
                this.f175093a.m207361F();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: l.x83$a */
    public class C21042a extends BottomSheetBehavior.BottomSheetCallback {
        public C21042a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                x83.this.f191434m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
