package p006l;

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
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.PopAction;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.e30;
import l.e51;
import l.eqh0;
import l.h7j;
import l.i0e;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.z2x;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v0x extends l5j0 implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public View[] f23874A;

    /* JADX INFO: renamed from: B */
    public int f23875B;

    /* JADX INFO: renamed from: C */
    public boolean f23876C;

    /* JADX INFO: renamed from: D */
    public final int f23877D;

    /* JADX INFO: renamed from: E */
    public boolean f23878E;

    /* JADX INFO: renamed from: f */
    public Act f23879f;

    /* JADX INFO: renamed from: g */
    public String f23880g;

    /* JADX INFO: renamed from: h */
    public cwf0 f23881h;

    /* JADX INFO: renamed from: i */
    public VImage f23882i;

    /* JADX INFO: renamed from: j */
    public VImage f23883j;

    /* JADX INFO: renamed from: k */
    public VImage f23884k;

    /* JADX INFO: renamed from: l */
    public VImage f23885l;

    /* JADX INFO: renamed from: m */
    public VImage f23886m;

    /* JADX INFO: renamed from: n */
    public VImage f23887n;

    /* JADX INFO: renamed from: o */
    public VImage f23888o;

    /* JADX INFO: renamed from: p */
    public VImage f23889p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f23890q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f23891r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f23892s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f23893t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f23894u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f23895v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f23896w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f23897x;

    /* JADX INFO: renamed from: y */
    public List<j760<Purpose, String>> f23898y;

    /* JADX INFO: renamed from: z */
    public VImage[] f23899z;

    /* JADX INFO: renamed from: l.v0x$a */
    public class ViewOnClickListenerC1365a implements View.OnClickListener {
        public ViewOnClickListenerC1365a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.p().o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.USER_CLOSE);
            v0x.this.dismiss();
        }
    }

    public v0x(@NonNull Act act, String str) {
        super(act, v7c0.f24183c);
        this.f23875B = -1;
        this.f23876C = false;
        this.f23877D = 7;
        this.f23878E = false;
        this.f23879f = act;
        this.f23880g = str;
        setCancelable(true);
        this.f23881h = i0e.c("p_dating_purpose_popup", getClass().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private void m25663G() {
        final Window window = getWindow();
        if (NullChecker.a(window)) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f23139o2);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            frameLayout.setBackgroundResource(x2c0.f26970on);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C1366b(bottomSheetBehaviorFrom));
        }
        e51.G(new Runnable() { // from class: l.t0x
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f24191k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m25664L(View view) {
        a.p().o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.OTHER_ACTION);
        this.f23876C = !this.f23876C;
        m25666N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    private void m25665M() {
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: N */
    private void m25666N() {
        this.f23886m.setRotation(this.f23876C ? 180.0f : 0.0f);
        int i = 4;
        while (true) {
            View[] viewArr = this.f23874A;
            if (i >= viewArr.length) {
                break;
            }
            xdl0.M(viewArr[i], this.f23876C);
            i++;
        }
        if (this.f23876C) {
            BottomSheetBehavior.from((FrameLayout) findViewById(u4c0.f23139o2)).setState(3);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m25670E(int i) {
        if (this.f23878E) {
            return;
        }
        this.f23878E = true;
        User userClone = CoreModule.f1534c.f3628e0.m21483na().clone();
        if (!NullChecker.a(userClone.profile)) {
            userClone.profile = new Profile();
        }
        if (!NullChecker.a(userClone.profile.extensions)) {
            userClone.profile.extensions = new Extensions();
        }
        if (!NullChecker.a(userClone.profile.extensions.basic)) {
            userClone.profile.extensions.basic = new ProfileExtensionBasic();
        }
        final j760<Purpose, String> j760Var = this.f23898y.get(i);
        userClone.profile.extensions.basic.friendPurpose = vwb.M((Purpose) j760Var.a);
        if (TEnum.equals((Purpose) j760Var.a, "marriage")) {
            if (!NullChecker.a(userClone.profile.extensions.marriage)) {
                userClone.profile.extensions.marriage = new ProfileExtensionMarriage();
            }
            userClone.profile.extensions.marriage.expectedTime = vwb.M((String) j760Var.b);
        }
        User userSubtract = userClone.subtract(CoreModule.f1534c.f3628e0.m21483na());
        if (userSubtract == null) {
            return;
        }
        duringCreated(CoreModule.f1534c.f3628e0.m21510u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.q0x
            public final void call(Object obj) {
                this.f19507a.m25673I(j760Var, (roj0) obj);
            }
        }, new e30() { // from class: l.r0x
            public final void call(Object obj) {
                this.f20225a.m25674J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public final void m25671F() {
        int i = 0;
        while (true) {
            AppCompatImageView[] appCompatImageViewArr = this.f23899z;
            if (i >= appCompatImageViewArr.length) {
                return;
            }
            appCompatImageViewArr[i].setImageResource(i == this.f23875B ? x2c0.f26329Ud : x2c0.f26298Td);
            i++;
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m25672H() {
        z2x.d(this.f23879f, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m25673I(j760 j760Var, roj0 roj0Var) {
        boolean z = false;
        this.f23878E = false;
        if (upa.m25443e2() && TEnum.equals((Purpose) j760Var.a, "marriage")) {
            e51.F(getContext(), new Runnable() { // from class: l.u0x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22417a.m25672H();
                }
            });
            z = true;
        }
        dismiss();
        if (!z && h7j.N(CoreModule.m1851K().me_(), ((Purpose) this.f23898y.get(this.f23875B).a).toString())) {
            h7j.b0(this.f23879f);
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (TextUtils.equals(this.f23880g, h7j.h)) {
            Pair pairS = h7j.s();
            if (NullChecker.a(pairS)) {
                h7j.Y((String) pairS.first, userM21490p9);
                if (z || h7j.J(userM21490p9)) {
                    return;
                }
                h7j.Z(this.f23879f, (String) pairS.first, (String) pairS.second);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m25674J(Throwable th) {
        this.f23878E = false;
        lsi0.j(this.f23879f.getString(R$string.f2696lm));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m25675K() {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f23881h.k();
        this.f23881h.j();
        getWindow().setWindowAnimations(v7c0.f24181a);
        e51.G(new Runnable() { // from class: l.p0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f18545a.m25675K();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f23875B = ((Integer) view.getTag()).intValue();
        m25671F();
        m25670E(this.f23875B);
        a.p().o(CorePopLevel.datingPurposePopup.getOnlyName(), PopAction.OTHER_ACTION);
    }

    public void onCreate(Bundle bundle) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f23879f).inflate(f6c0.f12087Z6, (ViewGroup) null, false), new FrameLayout.LayoutParams(-1, -1));
        m25665M();
        findViewById(u4c0.f22466A1).setOnClickListener(new ViewOnClickListenerC1365a());
        VText vTextFindViewById = findViewById(u4c0.f22928bb);
        VText vTextFindViewById2 = findViewById(u4c0.f22766Rc);
        VText vTextFindViewById3 = findViewById(u4c0.f22783Sc);
        VText vTextFindViewById4 = findViewById(u4c0.f22800Tc);
        VText vTextFindViewById5 = findViewById(u4c0.f22816Uc);
        VText vTextFindViewById6 = findViewById(u4c0.f22832Vc);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        vTextFindViewById2.setTypeface(eqh0.c(3), 1);
        vTextFindViewById3.setTypeface(eqh0.c(3), 1);
        vTextFindViewById4.setTypeface(eqh0.c(3), 1);
        vTextFindViewById5.setTypeface(eqh0.c(3), 1);
        vTextFindViewById6.setTypeface(eqh0.c(3), 1);
        this.f23882i = findViewById(u4c0.f22613Ic);
        this.f23883j = findViewById(u4c0.f22630Jc);
        this.f23884k = findViewById(u4c0.f22647Kc);
        this.f23885l = findViewById(u4c0.f22664Lc);
        this.f23886m = findViewById(u4c0.f22749Qc);
        this.f23897x = (LinearLayout) findViewById(u4c0.f22732Pc);
        this.f23887n = findViewById(u4c0.f22681Mc);
        this.f23888o = findViewById(u4c0.f22698Nc);
        VImage vImageFindViewById = findViewById(u4c0.f22715Oc);
        this.f23889p = vImageFindViewById;
        this.f23899z = new VImage[]{this.f23882i, this.f23883j, this.f23884k, this.f23885l, this.f23887n, this.f23888o, vImageFindViewById};
        this.f23890q = (LinearLayout) findViewById(u4c0.f22477Ac);
        this.f23891r = (LinearLayout) findViewById(u4c0.f22494Bc);
        this.f23892s = (LinearLayout) findViewById(u4c0.f22511Cc);
        this.f23893t = (LinearLayout) findViewById(u4c0.f22528Dc);
        this.f23894u = (LinearLayout) findViewById(u4c0.f22545Ec);
        this.f23895v = (LinearLayout) findViewById(u4c0.f22562Fc);
        LinearLayout linearLayout = (LinearLayout) findViewById(u4c0.f22579Gc);
        this.f23896w = linearLayout;
        this.f23874A = new View[]{this.f23890q, this.f23891r, this.f23892s, this.f23893t, this.f23894u, this.f23895v, linearLayout};
        for (int i = 0; i < 7; i++) {
            this.f23874A[i].setOnClickListener(this);
            this.f23874A[i].setTag(Integer.valueOf(i));
        }
        xdl0.E0(this.f23897x, new View.OnClickListener() { // from class: l.s0x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20973a.m25664L(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        this.f23898y = arrayList;
        arrayList.add(j760.a(Purpose.get("thinking"), ""));
        this.f23898y.add(j760.a(Purpose.get("friend"), ""));
        this.f23898y.add(j760.a(Purpose.get("date"), ""));
        this.f23898y.add(j760.a(Purpose.get("relationship"), ""));
        this.f23898y.add(j760.a(Purpose.get("marriage"), "in_one_year"));
        this.f23898y.add(j760.a(Purpose.get("marriage"), "in_two_years"));
        this.f23898y.add(j760.a(Purpose.get("marriage"), "at_right_time"));
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        Profile profile = userM21490p9.profile;
        if (profile != null && (extensions = profile.extensions) != null && (profileExtensionBasic = extensions.basic) != null && !vwb.J(profileExtensionBasic.friendPurpose)) {
            Purpose purpose = (Purpose) userM21490p9.profile.extensions.basic.friendPurpose.get(0);
            for (int i2 = 0; i2 < this.f23898y.size(); i2++) {
                j760<Purpose, String> j760Var = this.f23898y.get(i2);
                if (TEnum.equals((Purpose) j760Var.a, purpose)) {
                    this.f23875B = i2;
                    if (TEnum.equals((Purpose) j760Var.a, Purpose.get("marriage"))) {
                        m25666N();
                    }
                }
            }
        }
        m25671F();
        m25666N();
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        this.f23881h.p(new j760[]{vwb.Y("tooltips_trigger_mode", TextUtils.equals(this.f23880g, h7j.h) ? "active" : "passive"), vwb.Y("dating_purpose_popup_from", this.f23880g)});
        this.f23881h.c();
        this.f23881h.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m25663G();
    }

    /* JADX INFO: renamed from: l.v0x$b */
    public class C1366b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f23901a;

        public C1366b(BottomSheetBehavior bottomSheetBehavior) {
            this.f23901a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f23901a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                v0x.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
