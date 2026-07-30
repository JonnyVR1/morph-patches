package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.poplevel.PopAction;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class v0x extends l5j0 implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public View[] f179147A;

    /* JADX INFO: renamed from: B */
    public int f179148B;

    /* JADX INFO: renamed from: C */
    public boolean f179149C;

    /* JADX INFO: renamed from: D */
    public final int f179150D;

    /* JADX INFO: renamed from: E */
    public boolean f179151E;

    /* JADX INFO: renamed from: f */
    public Act f179152f;

    /* JADX INFO: renamed from: g */
    public String f179153g;

    /* JADX INFO: renamed from: h */
    public cwf0 f179154h;

    /* JADX INFO: renamed from: i */
    public VImage f179155i;

    /* JADX INFO: renamed from: j */
    public VImage f179156j;

    /* JADX INFO: renamed from: k */
    public VImage f179157k;

    /* JADX INFO: renamed from: l */
    public VImage f179158l;

    /* JADX INFO: renamed from: m */
    public VImage f179159m;

    /* JADX INFO: renamed from: n */
    public VImage f179160n;

    /* JADX INFO: renamed from: o */
    public VImage f179161o;

    /* JADX INFO: renamed from: p */
    public VImage f179162p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f179163q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f179164r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f179165s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f179166t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f179167u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f179168v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f179169w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f179170x;

    /* JADX INFO: renamed from: y */
    public List<j760<Purpose, String>> f179171y;

    /* JADX INFO: renamed from: z */
    public VImage[] f179172z;

    /* JADX INFO: renamed from: l.v0x$a */
    public class ViewOnClickListenerC20556a implements View.OnClickListener {
        public ViewOnClickListenerC20556a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4371a.m21100p().m21119o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.USER_CLOSE);
            v0x.this.m101651T();
        }
    }

    public v0x(@NonNull Act act, String str) {
        super(act, v7c0.f180356c);
        this.f179148B = -1;
        this.f179149C = false;
        this.f179150D = 7;
        this.f179151E = false;
        this.f179152f = act;
        this.f179153g = str;
        setCancelable(true);
        this.f179154h = i0e.m133794c("p_dating_purpose_popup", getClass().getName());
    }

    /* JADX INFO: renamed from: G */
    private void m196521G() {
        final Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(x2c0.f190434on);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20557b(bottomSheetBehaviorFrom));
        }
        e51.m114742G(new Runnable() { // from class: l.t0x
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180364k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m196522L(View view) {
        C4371a.m21100p().m21119o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.OTHER_ACTION);
        this.f179149C = !this.f179149C;
        m196524N();
    }

    /* JADX INFO: renamed from: M */
    private void m196523M() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: N */
    private void m196524N() {
        this.f179159m.setRotation(this.f179149C ? 180.0f : 0.0f);
        int i = 4;
        while (true) {
            View[] viewArr = this.f179147A;
            if (i >= viewArr.length) {
                break;
            }
            xdl0.m208344M(viewArr[i], this.f179149C);
            i++;
        }
        if (this.f179149C) {
            BottomSheetBehavior.from((FrameLayout) findViewById(u4c0.f174391o2)).setState(3);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m196528E(int i) {
        if (this.f179151E) {
            return;
        }
        this.f179151E = true;
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        if (!NullChecker.m81303a(userMo223809clone.profile)) {
            userMo223809clone.profile = new Profile();
        }
        if (!NullChecker.m81303a(userMo223809clone.profile.extensions)) {
            userMo223809clone.profile.extensions = new Extensions();
        }
        if (!NullChecker.m81303a(userMo223809clone.profile.extensions.basic)) {
            userMo223809clone.profile.extensions.basic = new ProfileExtensionBasic();
        }
        final j760<Purpose, String> j760Var = this.f179171y.get(i);
        userMo223809clone.profile.extensions.basic.friendPurpose = vwb.m200299M(j760Var.f116564a);
        if (TEnum.equals(j760Var.f116564a, "marriage")) {
            if (!NullChecker.m81303a(userMo223809clone.profile.extensions.marriage)) {
                userMo223809clone.profile.extensions.marriage = new ProfileExtensionMarriage();
            }
            userMo223809clone.profile.extensions.marriage.expectedTime = vwb.m200299M(j760Var.f116565b);
        }
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na());
        if (userSubtract == null) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.q0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152087a.m196531I(j760Var, (roj0) obj);
            }
        }, new e30() { // from class: l.r0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157207a.m196532J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public final void m196529F() {
        int i = 0;
        while (true) {
            VImage[] vImageArr = this.f179172z;
            if (i >= vImageArr.length) {
                return;
            }
            vImageArr[i].setImageResource(i == this.f179148B ? x2c0.f189793Ud : x2c0.f189762Td);
            i++;
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m196530H() {
        z2x.m217001d(this.f179152f, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m196531I(j760 j760Var, roj0 roj0Var) {
        boolean z = false;
        this.f179151E = false;
        if (upa.m194745e2() && TEnum.equals((Purpose) j760Var.f116564a, "marriage")) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.u0x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172955a.m196530H();
                }
            });
            z = true;
        }
        m101651T();
        if (!z && h7j.m129702N(CoreModule.m29932K().me_(), this.f179171y.get(this.f179148B).f116564a.toString())) {
            h7j.m129718b0(this.f179152f);
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (TextUtils.equals(this.f179153g, h7j.f106290h)) {
            Pair<String, String> pairM129735s = h7j.m129735s();
            if (NullChecker.m81303a(pairM129735s)) {
                h7j.m129713Y((String) pairM129735s.first, userM169527p9);
                if (z || h7j.m129698J(userM169527p9)) {
                    return;
                }
                h7j.m129714Z(this.f179152f, (String) pairM129735s.first, (String) pairM129735s.second);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m196532J(Throwable th) {
        this.f179151E = false;
        lsi0.m151580j(this.f179152f.getString(R$string.f18707lm));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m196533K() {
        super.m101651T();
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m101651T() {
        this.f179154h.m109035k();
        this.f179154h.m109034j();
        getWindow().setWindowAnimations(v7c0.f180354a);
        e51.m114742G(new Runnable() { // from class: l.p0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f146627a.m196533K();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f179148B = ((Integer) view.getTag()).intValue();
        m196529F();
        m196528E(this.f179148B);
        C4371a.m21100p().m21119o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.OTHER_ACTION);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f179152f).inflate(f6c0.f95673Z6, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m196523M();
        findViewById(u4c0.f173718A1).setOnClickListener(new ViewOnClickListenerC20556a());
        VText vText = (VText) findViewById(u4c0.f174180bb);
        VText vText2 = (VText) findViewById(u4c0.f174018Rc);
        VText vText3 = (VText) findViewById(u4c0.f174035Sc);
        VText vText4 = (VText) findViewById(u4c0.f174052Tc);
        VText vText5 = (VText) findViewById(u4c0.f174068Uc);
        VText vText6 = (VText) findViewById(u4c0.f174084Vc);
        vText.setTypeface(eqh0.m117752c(3), 1);
        vText2.setTypeface(eqh0.m117752c(3), 1);
        vText3.setTypeface(eqh0.m117752c(3), 1);
        vText4.setTypeface(eqh0.m117752c(3), 1);
        vText5.setTypeface(eqh0.m117752c(3), 1);
        vText6.setTypeface(eqh0.m117752c(3), 1);
        this.f179155i = (VImage) findViewById(u4c0.f173865Ic);
        this.f179156j = (VImage) findViewById(u4c0.f173882Jc);
        this.f179157k = (VImage) findViewById(u4c0.f173899Kc);
        this.f179158l = (VImage) findViewById(u4c0.f173916Lc);
        this.f179159m = (VImage) findViewById(u4c0.f174001Qc);
        this.f179170x = (LinearLayout) findViewById(u4c0.f173984Pc);
        this.f179160n = (VImage) findViewById(u4c0.f173933Mc);
        this.f179161o = (VImage) findViewById(u4c0.f173950Nc);
        VImage vImage = (VImage) findViewById(u4c0.f173967Oc);
        this.f179162p = vImage;
        this.f179172z = new VImage[]{this.f179155i, this.f179156j, this.f179157k, this.f179158l, this.f179160n, this.f179161o, vImage};
        this.f179163q = (LinearLayout) findViewById(u4c0.f173729Ac);
        this.f179164r = (LinearLayout) findViewById(u4c0.f173746Bc);
        this.f179165s = (LinearLayout) findViewById(u4c0.f173763Cc);
        this.f179166t = (LinearLayout) findViewById(u4c0.f173780Dc);
        this.f179167u = (LinearLayout) findViewById(u4c0.f173797Ec);
        this.f179168v = (LinearLayout) findViewById(u4c0.f173814Fc);
        LinearLayout linearLayout = (LinearLayout) findViewById(u4c0.f173831Gc);
        this.f179169w = linearLayout;
        this.f179147A = new View[]{this.f179163q, this.f179164r, this.f179165s, this.f179166t, this.f179167u, this.f179168v, linearLayout};
        for (int i = 0; i < 7; i++) {
            this.f179147A[i].setOnClickListener(this);
            this.f179147A[i].setTag(Integer.valueOf(i));
        }
        xdl0.m208329E0(this.f179170x, new View.OnClickListener() { // from class: l.s0x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161820a.m196522L(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        this.f179171y = arrayList;
        arrayList.add(j760.m140076a(Purpose.get(Purpose.thinking), ""));
        this.f179171y.add(j760.m140076a(Purpose.get("friend"), ""));
        this.f179171y.add(j760.m140076a(Purpose.get("date"), ""));
        this.f179171y.add(j760.m140076a(Purpose.get("relationship"), ""));
        this.f179171y.add(j760.m140076a(Purpose.get("marriage"), "in_one_year"));
        this.f179171y.add(j760.m140076a(Purpose.get("marriage"), "in_two_years"));
        this.f179171y.add(j760.m140076a(Purpose.get("marriage"), "at_right_time"));
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Profile profile = userM169527p9.profile;
        if (profile != null && (extensions = profile.extensions) != null && (profileExtensionBasic = extensions.basic) != null && !vwb.m200296J(profileExtensionBasic.friendPurpose)) {
            Purpose purpose = userM169527p9.profile.extensions.basic.friendPurpose.get(0);
            for (int i2 = 0; i2 < this.f179171y.size(); i2++) {
                j760<Purpose, String> j760Var = this.f179171y.get(i2);
                if (TEnum.equals(j760Var.f116564a, purpose)) {
                    this.f179148B = i2;
                    if (TEnum.equals(j760Var.f116564a, Purpose.get("marriage"))) {
                        m196524N();
                    }
                }
            }
        }
        m196529F();
        m196524N();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f179154h.m109040p(vwb.m200311Y("tooltips_trigger_mode", TextUtils.equals(this.f179153g, h7j.f106290h) ? Active.TYPE : "passive"), vwb.m200311Y("dating_purpose_popup_from", this.f179153g));
        this.f179154h.m109027c();
        this.f179154h.m109042r();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m196521G();
    }

    /* JADX INFO: renamed from: l.v0x$b */
    public class C20557b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f179174a;

        public C20557b(BottomSheetBehavior bottomSheetBehavior) {
            this.f179174a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f179174a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                v0x.this.m101651T();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
