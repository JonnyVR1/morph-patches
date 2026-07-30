package p153l;

import android.R;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.poplevel.PopAction;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class u3x extends pej0 implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public View[] f177381A;

    /* JADX INFO: renamed from: B */
    public int f177382B;

    /* JADX INFO: renamed from: C */
    public boolean f177383C;

    /* JADX INFO: renamed from: D */
    public final int f177384D;

    /* JADX INFO: renamed from: E */
    public boolean f177385E;

    /* JADX INFO: renamed from: f */
    public Act f177386f;

    /* JADX INFO: renamed from: g */
    public String f177387g;

    /* JADX INFO: renamed from: h */
    public l4g0 f177388h;

    /* JADX INFO: renamed from: i */
    public VImage f177389i;

    /* JADX INFO: renamed from: j */
    public VImage f177390j;

    /* JADX INFO: renamed from: k */
    public VImage f177391k;

    /* JADX INFO: renamed from: l */
    public VImage f177392l;

    /* JADX INFO: renamed from: m */
    public VImage f177393m;

    /* JADX INFO: renamed from: n */
    public VImage f177394n;

    /* JADX INFO: renamed from: o */
    public VImage f177395o;

    /* JADX INFO: renamed from: p */
    public VImage f177396p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f177397q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f177398r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f177399s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f177400t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f177401u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f177402v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f177403w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f177404x;

    /* JADX INFO: renamed from: y */
    public List<pf60<Purpose, String>> f177405y;

    /* JADX INFO: renamed from: z */
    public VImage[] f177406z;

    /* JADX INFO: renamed from: l.u3x$a */
    public class ViewOnClickListenerC20480a implements View.OnClickListener {
        public ViewOnClickListenerC20480a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4522a.m22099p().m22118o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.USER_CLOSE);
            u3x.this.m176562T();
        }
    }

    public u3x(@NonNull Act act, String str) {
        super(act, agc0.f71117c);
        this.f177382B = -1;
        this.f177383C = false;
        this.f177384D = 7;
        this.f177385E = false;
        this.f177386f = act;
        this.f177387g = str;
        setCancelable(true);
        this.f177388h = w1e.m204399c("p_dating_purpose_popup", getClass().getName());
    }

    /* JADX INFO: renamed from: G */
    private void m194427G() {
        final Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(dbc0.f86899co);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20481b(bottomSheetBehaviorFrom));
        }
        l51.m152887G(new Runnable() { // from class: l.s3x
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71125k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m194428L(View view) {
        C4522a.m22099p().m22118o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.OTHER_ACTION);
        this.f177383C = !this.f177383C;
        m194430N();
    }

    /* JADX INFO: renamed from: M */
    private void m194429M() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: N */
    private void m194430N() {
        this.f177393m.setRotation(this.f177383C ? 180.0f : 0.0f);
        int i = 4;
        while (true) {
            View[] viewArr = this.f177381A;
            if (i >= viewArr.length) {
                break;
            }
            bnl0.m105524M(viewArr[i], this.f177383C);
            i++;
        }
        if (this.f177383C) {
            BottomSheetBehavior.from((FrameLayout) findViewById(adc0.f70516q2)).setState(3);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m194434E(int i) {
        if (this.f177385E) {
            return;
        }
        this.f177385E = true;
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        if (!NullChecker.m82486a(userMo225055clone.profile)) {
            userMo225055clone.profile = new Profile();
        }
        if (!NullChecker.m82486a(userMo225055clone.profile.extensions)) {
            userMo225055clone.profile.extensions = new Extensions();
        }
        if (!NullChecker.m82486a(userMo225055clone.profile.extensions.basic)) {
            userMo225055clone.profile.extensions.basic = new ProfileExtensionBasic();
        }
        final pf60<Purpose, String> pf60Var = this.f177405y.get(i);
        userMo225055clone.profile.extensions.basic.friendPurpose = jyb.m147482M(pf60Var.f152156a);
        if (TEnum.equals(pf60Var.f152156a, "marriage")) {
            if (!NullChecker.m82486a(userMo225055clone.profile.extensions.marriage)) {
                userMo225055clone.profile.extensions.marriage = new ProfileExtensionMarriage();
            }
            userMo225055clone.profile.extensions.marriage.expectedTime = jyb.m147482M(pf60Var.f152157b);
        }
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na());
        if (userSubtract == null) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.p3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150474a.m194437I(pf60Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.q3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155499a.m194438J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public final void m194435F() {
        int i = 0;
        while (true) {
            VImage[] vImageArr = this.f177406z;
            if (i >= vImageArr.length) {
                return;
            }
            vImageArr[i].setImageResource(i == this.f177382B ? dbc0.f86662Vd : dbc0.f86630Ud);
            i++;
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m194436H() {
        y5x.m214336d(this.f177386f, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m194437I(pf60 pf60Var, uxj0 uxj0Var) {
        boolean z = false;
        this.f177385E = false;
        if (gra.m131676e2() && TEnum.equals((Purpose) pf60Var.f152156a, "marriage")) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.t3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171958a.m194436H();
                }
            });
            z = true;
        }
        m176562T();
        if (!z && baj.m103173N(CoreModule.m30930K().me_(), this.f177405y.get(this.f177382B).f152156a.toString())) {
            baj.m103189b0(this.f177386f);
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (TextUtils.equals(this.f177387g, baj.f75707h)) {
            Pair<String, String> pairM103206s = baj.m103206s();
            if (NullChecker.m82486a(pairM103206s)) {
                baj.m103184Y((String) pairM103206s.first, userM116600p9);
                if (z || baj.m103169J(userM116600p9)) {
                    return;
                }
                baj.m103185Z(this.f177386f, (String) pairM103206s.first, (String) pairM103206s.second);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m194438J(Throwable th) {
        this.f177385E = false;
        o1j0.m165636j(this.f177386f.getString(R$string.f18525Hm));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m194439K() {
        super.m176562T();
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m176562T() {
        this.f177388h.m152776k();
        this.f177388h.m152775j();
        getWindow().setWindowAnimations(agc0.f71115a);
        l51.m152887G(new Runnable() { // from class: l.o3x
            @Override // java.lang.Runnable
            public final void run() {
                this.f144864a.m194439K();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f177382B = ((Integer) view.getTag()).intValue();
        m194435F();
        m194434E(this.f177382B);
        C4522a.m22099p().m22118o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.OTHER_ACTION);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f177386f).inflate(kec0.f125744a7, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m194429M();
        findViewById(adc0.f69806A1).setOnClickListener(new ViewOnClickListenerC20480a());
        VText vText = (VText) findViewById(adc0.f70305db);
        VText vText2 = (VText) findViewById(adc0.f70140Tc);
        VText vText3 = (VText) findViewById(adc0.f70157Uc);
        VText vText4 = (VText) findViewById(adc0.f70174Vc);
        VText vText5 = (VText) findViewById(adc0.f70191Wc);
        VText vText6 = (VText) findViewById(adc0.f70207Xc);
        vText.setTypeface(lyh0.m156283c(3), 1);
        vText2.setTypeface(lyh0.m156283c(3), 1);
        vText3.setTypeface(lyh0.m156283c(3), 1);
        vText4.setTypeface(lyh0.m156283c(3), 1);
        vText5.setTypeface(lyh0.m156283c(3), 1);
        vText6.setTypeface(lyh0.m156283c(3), 1);
        this.f177389i = (VImage) findViewById(adc0.f69987Kc);
        this.f177390j = (VImage) findViewById(adc0.f70004Lc);
        this.f177391k = (VImage) findViewById(adc0.f70021Mc);
        this.f177392l = (VImage) findViewById(adc0.f70038Nc);
        this.f177393m = (VImage) findViewById(adc0.f70123Sc);
        this.f177404x = (LinearLayout) findViewById(adc0.f70106Rc);
        this.f177394n = (VImage) findViewById(adc0.f70055Oc);
        this.f177395o = (VImage) findViewById(adc0.f70072Pc);
        VImage vImage = (VImage) findViewById(adc0.f70089Qc);
        this.f177396p = vImage;
        this.f177406z = new VImage[]{this.f177389i, this.f177390j, this.f177391k, this.f177392l, this.f177394n, this.f177395o, vImage};
        this.f177397q = (LinearLayout) findViewById(adc0.f69851Cc);
        this.f177398r = (LinearLayout) findViewById(adc0.f69868Dc);
        this.f177399s = (LinearLayout) findViewById(adc0.f69885Ec);
        this.f177400t = (LinearLayout) findViewById(adc0.f69902Fc);
        this.f177401u = (LinearLayout) findViewById(adc0.f69919Gc);
        this.f177402v = (LinearLayout) findViewById(adc0.f69936Hc);
        LinearLayout linearLayout = (LinearLayout) findViewById(adc0.f69953Ic);
        this.f177403w = linearLayout;
        this.f177381A = new View[]{this.f177397q, this.f177398r, this.f177399s, this.f177400t, this.f177401u, this.f177402v, linearLayout};
        for (int i = 0; i < 7; i++) {
            this.f177381A[i].setOnClickListener(this);
            this.f177381A[i].setTag(Integer.valueOf(i));
        }
        bnl0.m105509E0(this.f177404x, new View.OnClickListener() { // from class: l.r3x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161125a.m194428L(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        this.f177405y = arrayList;
        arrayList.add(pf60.m172085a(Purpose.get(Purpose.thinking), ""));
        this.f177405y.add(pf60.m172085a(Purpose.get("friend"), ""));
        this.f177405y.add(pf60.m172085a(Purpose.get("date"), ""));
        this.f177405y.add(pf60.m172085a(Purpose.get("relationship"), ""));
        this.f177405y.add(pf60.m172085a(Purpose.get("marriage"), "in_one_year"));
        this.f177405y.add(pf60.m172085a(Purpose.get("marriage"), "in_two_years"));
        this.f177405y.add(pf60.m172085a(Purpose.get("marriage"), "at_right_time"));
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Profile profile = userM116600p9.profile;
        if (profile != null && (extensions = profile.extensions) != null && (profileExtensionBasic = extensions.basic) != null && !jyb.m147479J(profileExtensionBasic.friendPurpose)) {
            Purpose purpose = userM116600p9.profile.extensions.basic.friendPurpose.get(0);
            for (int i2 = 0; i2 < this.f177405y.size(); i2++) {
                pf60<Purpose, String> pf60Var = this.f177405y.get(i2);
                if (TEnum.equals(pf60Var.f152156a, purpose)) {
                    this.f177382B = i2;
                    if (TEnum.equals(pf60Var.f152156a, Purpose.get("marriage"))) {
                        m194430N();
                    }
                }
            }
        }
        m194435F();
        m194430N();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f177388h.m152781p(jyb.m147494Y("tooltips_trigger_mode", TextUtils.equals(this.f177387g, baj.f75707h) ? Active.TYPE : "passive"), jyb.m147494Y("dating_purpose_popup_from", this.f177387g));
        this.f177388h.m152768c();
        this.f177388h.m152783r();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m194427G();
    }

    /* JADX INFO: renamed from: l.u3x$b */
    public class C20481b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f177408a;

        public C20481b(BottomSheetBehavior bottomSheetBehavior) {
            this.f177408a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f177408a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                u3x.this.m176562T();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
