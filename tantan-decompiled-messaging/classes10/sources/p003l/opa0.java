package p003l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.i0e;
import l.l5j0;
import l.p4c0;
import l.upa;
import l.v7c0;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class opa0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f6705f;

    /* JADX INFO: renamed from: g */
    public VLinear f6706g;

    /* JADX INFO: renamed from: h */
    public VImage f6707h;

    /* JADX INFO: renamed from: i */
    public VImage f6708i;

    /* JADX INFO: renamed from: j */
    public TextView f6709j;

    /* JADX INFO: renamed from: k */
    public VText f6710k;

    /* JADX INFO: renamed from: l */
    public TextView f6711l;

    /* JADX INFO: renamed from: m */
    public TextView f6712m;

    /* JADX INFO: renamed from: n */
    public TextView f6713n;

    /* JADX INFO: renamed from: o */
    public Act f6714o;

    /* JADX INFO: renamed from: p */
    public String f6715p;

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior f6716q;

    /* JADX INFO: renamed from: r */
    public cwf0 f6717r;

    /* JADX INFO: renamed from: s */
    public String f6718s;

    /* JADX INFO: renamed from: t */
    public final BottomSheetBehavior.BottomSheetCallback f6719t;

    /* JADX INFO: renamed from: l.opa0$a */
    public class ViewOnClickListenerC3397a implements View.OnClickListener {
        public ViewOnClickListenerC3397a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            opa0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.opa0$b */
    public class ViewOnClickListenerC3398b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f6721a;

        public ViewOnClickListenerC3398b(d30 d30Var) {
            this.f6721a = d30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f6721a)) {
                this.f6721a.call();
            }
            opa0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.opa0$c */
    public class ViewOnClickListenerC3399c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6723a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f6724b;

        /* JADX INFO: renamed from: l.opa0$c$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                d30 d30Var = ViewOnClickListenerC3399c.this.f6724b;
                if (d30Var != null) {
                    d30Var.call();
                }
            }
        }

        public ViewOnClickListenerC3399c(int i, d30 d30Var) {
            this.f6723a = i;
            this.f6724b = d30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.r("e_selected_users_complete_profile", opa0.this.m8568E(this.f6723a));
            km90.m7622m(opa0.this.f6714o, new a(), null);
            opa0.this.dismiss();
        }
    }

    public opa0(Act act, String str) {
        super(act, v7c0.c);
        this.f6715p = "";
        this.f6718s = "";
        this.f6719t = new C3400d();
        this.f6714o = act;
        this.f6715p = str;
        m8569G(act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public String m8568E(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return "p_selected_users_complete_profile";
        }
        return (i == 4 || i == 5) ? "p_selected_users_profile_review" : "";
    }

    /* JADX INFO: renamed from: G */
    private void m8569G(Context context) {
        setContentView(m8575D(LayoutInflater.from(context), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m8570H(DialogInterface dialogInterface) {
        i0e.e(this.f6717r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m8571I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m8575D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ppa0.m8789b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public final String m8576F(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return "selected_users_complete_profile_showfrom";
        }
        return (i == 4 || i == 5) ? "selected_users_profile_review_showfrom" : "";
    }

    /* JADX INFO: renamed from: J */
    public void m8577J(String str) {
        this.f6718s = str;
    }

    /* JADX INFO: renamed from: K */
    public void m8578K(int i, d30 d30Var) {
        m8579L(i, d30Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public void m8579L(int i, d30 d30Var, d30 d30Var2) {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f6716q = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f6716q.setBottomSheetCallback(this.f6719t);
        frameLayout.setBackgroundResource(x2c0.e1);
        this.f6712m.setVisibility(8);
        this.f6713n.setVisibility(8);
        if (upa.z()) {
            this.f6711l.setBackgroundResource(x2c0.Q);
        }
        if (i == 4 || i == 5) {
            this.f6708i.setBackgroundResource(upa.z() ? x2c0.uh : x2c0.Vm);
            this.f6709j.setText("资料正在审核中");
            this.f6711l.setText("知道了");
            boolean zEquals = TextUtils.equals(this.f6715p, "home_selected_users_card");
            VText vText = this.f6710k;
            if (zEquals) {
                vText.setText("审核通过后，你的喜欢将自动送达给对方");
            } else {
                vText.setText("审核结果将通过小助手告知，请耐心等待");
            }
            xdl0.E0(this.f6711l, new ViewOnClickListenerC3397a());
        } else if (i == 1 || i == 2 || i == 3) {
            zvf0.x("e_selected_users_complete_profile", m8568E(i));
            this.f6708i.setBackgroundResource(upa.z() ? x2c0.vh : x2c0.Wm);
            if (TextUtils.equals(this.f6715p, "home_selected_users_card")) {
                this.f6712m.setVisibility(0);
                this.f6712m.setText("狠心错过");
                this.f6712m.setTextColor(App.e.getResources().getColor(w0c0.V));
                xdl0.E0(this.f6712m, new ViewOnClickListenerC3398b(d30Var2));
            }
            xdl0.E0(this.f6711l, new ViewOnClickListenerC3399c(i, d30Var));
        }
        if (this.f6717r == null) {
            this.f6717r = i0e.c(m8568E(i), opa0.class.getSimpleName());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m8576F(i), this.f6715p);
            this.f6717r.o(jSONObject);
        } catch (JSONException unused) {
        }
        i0e.f(this.f6717r);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mpa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6397a.m8570H(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
        xdl0.E0(this.f6707h, new View.OnClickListener() { // from class: l.npa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6540a.m8571I(view);
            }
        });
        CoreModule.c.q2.p3();
    }

    @Deprecated
    public void show() {
    }

    /* JADX INFO: renamed from: l.opa0$d */
    public class C3400d extends BottomSheetBehavior.BottomSheetCallback {
        public C3400d() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                opa0.this.f6716q.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
