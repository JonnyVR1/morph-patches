package p153l;

import android.R;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class m93 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VImage f135329f;

    /* JADX INFO: renamed from: g */
    public View f135330g;

    /* JADX INFO: renamed from: h */
    public TextView f135331h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f135332i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f135333j;

    /* JADX INFO: renamed from: k */
    public String f135334k;

    /* JADX INFO: renamed from: l */
    public Act f135335l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f135336m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior.BottomSheetCallback f135337n;

    public m93(@NonNull final Act act, final String str) {
        super(act, bgc0.f76583d);
        this.f135334k = "";
        this.f135337n = new C18571a();
        this.f135335l = act;
        setCancelable(false);
        this.f135334k = str;
        setContentView(pec0.f151912I0);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(ddc0.f87902h);
        frameLayout.setBackgroundResource(R.color.transparent);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f135336m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f135336m.setSkipCollapsed(true);
        this.f135336m.setBottomSheetCallback(this.f135337n);
        VImage vImage = (VImage) findViewById(ddc0.f87898d);
        this.f135329f = vImage;
        vImage.setImageAlpha(153);
        View viewFindViewById = findViewById(ddc0.f87873C);
        this.f135330g = viewFindViewById;
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.k93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124434a.m157547D(act, view);
            }
        });
        TextView textView = (TextView) findViewById(ddc0.f87916v);
        this.f135331h = textView;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM181583m = ric0.m181583m();
        TextView textView2 = this.f135331h;
        if (zM181583m) {
            bnl0.m105515H0(textView2, joa.m146367S3() ? "立即获取" : "立即使用");
        } else {
            bnl0.m105515H0(textView2, CoreModule.m30933P().m143405a().mo34589s8() ? "立即获取" : "立即使用");
        }
        bnl0.m105537U(this.f135331h, lny.m155032a(getContext()) ? qa00.f156323j : qa00.f156288A);
        bnl0.m105509E0(this.f135331h, new View.OnClickListener() { // from class: l.l93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130536a.m157548E(act, str, view);
            }
        });
        bnl0.m105516I(getContext());
        this.f135332i = (SVGAnimationView) findViewById(ddc0.f87899e);
        this.f135333j = (SVGAnimationView) findViewById(ddc0.f87897c);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/c8af9bff-3dbd-425d-9be3-058125b716eb13.svga").autoPlay(false).into(this.f135332i);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/31429bf5-9bbd-42df-b607-5a5929f6256b12.svga").autoPlay(false).repeatCount(1).into(this.f135333j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m157542F() {
        this.f135332i.startAnimation();
        this.f135333j.startAnimation();
    }

    /* JADX INFO: renamed from: C */
    public final String m157546C() {
        return this.f135335l.pageId();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m157547D(Act act, View view) {
        i4g0.m138523u("e_boost_guide", m157546C(), jyb.m147494Y("button_type", "close"));
        dismiss();
        if (ric0.m181583m()) {
            C21545y9.INSTANCE.m214803r(act);
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m157548E(Act act, String str, View view) {
        i4g0.m138523u("e_boost_guide", m157546C(), jyb.m147494Y("button_type", "open"));
        dismiss();
        if (ric0.m181583m()) {
            C21545y9.INSTANCE.m214805t(act, false, str);
        } else {
            v83.m200286f(act, false, str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        i4g0.m138526x("e_boost_guide", m157546C());
        l51.m152888H(this.f135335l, new Runnable() { // from class: l.j93
            @Override // java.lang.Runnable
            public final void run() {
                this.f118844a.m157542F();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: l.m93$a */
    public class C18571a extends BottomSheetBehavior.BottomSheetCallback {
        public C18571a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                m93.this.f135336m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
