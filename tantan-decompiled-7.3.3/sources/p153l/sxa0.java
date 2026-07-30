package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class sxa0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f171101f;

    /* JADX INFO: renamed from: g */
    public VLinear f171102g;

    /* JADX INFO: renamed from: h */
    public VImage f171103h;

    /* JADX INFO: renamed from: i */
    public VImage f171104i;

    /* JADX INFO: renamed from: j */
    public TextView f171105j;

    /* JADX INFO: renamed from: k */
    public VText f171106k;

    /* JADX INFO: renamed from: l */
    public TextView f171107l;

    /* JADX INFO: renamed from: m */
    public TextView f171108m;

    /* JADX INFO: renamed from: n */
    public TextView f171109n;

    /* JADX INFO: renamed from: o */
    public Act f171110o;

    /* JADX INFO: renamed from: p */
    public String f171111p;

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior f171112q;

    /* JADX INFO: renamed from: r */
    public l4g0 f171113r;

    /* JADX INFO: renamed from: s */
    public String f171114s;

    /* JADX INFO: renamed from: t */
    public final BottomSheetBehavior.BottomSheetCallback f171115t;

    /* JADX INFO: renamed from: l.sxa0$a */
    public class ViewOnClickListenerC20176a implements View.OnClickListener {
        public ViewOnClickListenerC20176a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sxa0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.sxa0$b */
    public class ViewOnClickListenerC20177b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f171117a;

        public ViewOnClickListenerC20177b(x20 x20Var) {
            this.f171117a = x20Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f171117a)) {
                this.f171117a.call();
            }
            sxa0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.sxa0$c */
    public class ViewOnClickListenerC20178c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f171119a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f171120b;

        /* JADX INFO: renamed from: l.sxa0$c$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                x20 x20Var = ViewOnClickListenerC20178c.this.f171120b;
                if (x20Var != null) {
                    x20Var.call();
                }
            }
        }

        public ViewOnClickListenerC20178c(int i, x20 x20Var) {
            this.f171119a = i;
            this.f171120b = x20Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138520r("e_selected_users_complete_profile", sxa0.this.m188464E(this.f171119a));
            ou90.m169279m(sxa0.this.f171110o, new a(), null);
            sxa0.this.dismiss();
        }
    }

    public sxa0(Act act, String str) {
        super(act, agc0.f71117c);
        this.f171111p = "";
        this.f171114s = "";
        this.f171115t = new C20179d();
        this.f171110o = act;
        this.f171111p = str;
        m188465G(act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public String m188464E(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return "p_selected_users_complete_profile";
        }
        return (i == 4 || i == 5) ? "p_selected_users_profile_review" : "";
    }

    /* JADX INFO: renamed from: G */
    private void m188465G(Context context) {
        setContentView(m188471D(LayoutInflater.from(context), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m188466H(DialogInterface dialogInterface) {
        w1e.m204401e(this.f171113r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m188467I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m188471D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return txa0.m193487b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public final String m188472F(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return "selected_users_complete_profile_showfrom";
        }
        return (i == 4 || i == 5) ? "selected_users_profile_review_showfrom" : "";
    }

    /* JADX INFO: renamed from: J */
    public void m188473J(String str) {
        this.f171114s = str;
    }

    /* JADX INFO: renamed from: K */
    public void m188474K(int i, x20 x20Var) {
        m188475L(i, x20Var, null);
    }

    /* JADX INFO: renamed from: L */
    public void m188475L(int i, x20 x20Var, x20 x20Var2) {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f171112q = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f171112q.setBottomSheetCallback(this.f171115t);
        frameLayout.setBackgroundResource(dbc0.f86974f1);
        this.f171108m.setVisibility(8);
        this.f171109n.setVisibility(8);
        if (gra.m131778z()) {
            this.f171107l.setBackgroundResource(dbc0.f86520R);
        }
        if (i == 4 || i == 5) {
            this.f171104i.setBackgroundResource(gra.m131778z() ? dbc0.f87089ii : dbc0.f86288Jn);
            this.f171105j.setText("资料正在审核中");
            this.f171107l.setText("知道了");
            boolean zEquals = TextUtils.equals(this.f171111p, "home_selected_users_card");
            VText vText = this.f171106k;
            if (zEquals) {
                vText.setText("审核通过后，你的喜欢将自动送达给对方");
            } else {
                vText.setText("审核结果将通过小助手告知，请耐心等待");
            }
            bnl0.m105509E0(this.f171107l, new ViewOnClickListenerC20176a());
        } else if (i == 1 || i == 2 || i == 3) {
            i4g0.m138526x("e_selected_users_complete_profile", m188464E(i));
            this.f171104i.setBackgroundResource(gra.m131778z() ? dbc0.f87121ji : dbc0.f86320Kn);
            if (TextUtils.equals(this.f171111p, "home_selected_users_card")) {
                this.f171108m.setVisibility(0);
                this.f171108m.setText("狠心错过");
                this.f171108m.setTextColor(App.f16088e.getResources().getColor(c9c0.f80384W));
                bnl0.m105509E0(this.f171108m, new ViewOnClickListenerC20177b(x20Var2));
            }
            bnl0.m105509E0(this.f171107l, new ViewOnClickListenerC20178c(i, x20Var));
        }
        if (this.f171113r == null) {
            this.f171113r = w1e.m204399c(m188464E(i), sxa0.class.getSimpleName());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m188472F(i), this.f171111p);
            this.f171113r.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
        w1e.m204402f(this.f171113r);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qxa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f160025a.m188466H(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
        bnl0.m105509E0(this.f171103h, new View.OnClickListener() { // from class: l.rxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165322a.m188467I(view);
            }
        });
        CoreModule.f18264c.f20419q2.m197491p3();
    }

    @Override // android.app.Dialog
    @Deprecated
    public void show() {
    }

    /* JADX INFO: renamed from: l.sxa0$d */
    public class C20179d extends BottomSheetBehavior.BottomSheetCallback {
        public C20179d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                sxa0.this.f171112q.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
