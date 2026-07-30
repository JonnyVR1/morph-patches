package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class opa0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f144961f;

    /* JADX INFO: renamed from: g */
    public VLinear f144962g;

    /* JADX INFO: renamed from: h */
    public VImage f144963h;

    /* JADX INFO: renamed from: i */
    public VImage f144964i;

    /* JADX INFO: renamed from: j */
    public TextView f144965j;

    /* JADX INFO: renamed from: k */
    public VText f144966k;

    /* JADX INFO: renamed from: l */
    public TextView f144967l;

    /* JADX INFO: renamed from: m */
    public TextView f144968m;

    /* JADX INFO: renamed from: n */
    public TextView f144969n;

    /* JADX INFO: renamed from: o */
    public Act f144970o;

    /* JADX INFO: renamed from: p */
    public String f144971p;

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior f144972q;

    /* JADX INFO: renamed from: r */
    public cwf0 f144973r;

    /* JADX INFO: renamed from: s */
    public String f144974s;

    /* JADX INFO: renamed from: t */
    public final BottomSheetBehavior.BottomSheetCallback f144975t;

    /* JADX INFO: renamed from: l.opa0$a */
    public class ViewOnClickListenerC18989a implements View.OnClickListener {
        public ViewOnClickListenerC18989a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            opa0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.opa0$b */
    public class ViewOnClickListenerC18990b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f144977a;

        public ViewOnClickListenerC18990b(d30 d30Var) {
            this.f144977a = d30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f144977a)) {
                this.f144977a.call();
            }
            opa0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.opa0$c */
    public class ViewOnClickListenerC18991c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f144979a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f144980b;

        /* JADX INFO: renamed from: l.opa0$c$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                d30 d30Var = ViewOnClickListenerC18991c.this.f144980b;
                if (d30Var != null) {
                    d30Var.call();
                }
            }
        }

        public ViewOnClickListenerC18991c(int i, d30 d30Var) {
            this.f144979a = i;
            this.f144980b = d30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220396r("e_selected_users_complete_profile", opa0.this.m165317E(this.f144979a));
            km90.m146485m(opa0.this.f144970o, new a(), null);
            opa0.this.dismiss();
        }
    }

    public opa0(Act act, String str) {
        super(act, v7c0.f180356c);
        this.f144971p = "";
        this.f144974s = "";
        this.f144975t = new C18992d();
        this.f144970o = act;
        this.f144971p = str;
        m165318G(act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public String m165317E(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return "p_selected_users_complete_profile";
        }
        return (i == 4 || i == 5) ? "p_selected_users_profile_review" : "";
    }

    /* JADX INFO: renamed from: G */
    private void m165318G(Context context) {
        setContentView(m165324D(LayoutInflater.from(context), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m165319H(DialogInterface dialogInterface) {
        i0e.m133796e(this.f144973r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m165320I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m165324D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ppa0.m170713b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public final String m165325F(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return "selected_users_complete_profile_showfrom";
        }
        return (i == 4 || i == 5) ? "selected_users_profile_review_showfrom" : "";
    }

    /* JADX INFO: renamed from: J */
    public void m165326J(String str) {
        this.f144974s = str;
    }

    /* JADX INFO: renamed from: K */
    public void m165327K(int i, d30 d30Var) {
        m165328L(i, d30Var, null);
    }

    /* JADX INFO: renamed from: L */
    public void m165328L(int i, d30 d30Var, d30 d30Var2) {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f144972q = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f144972q.setBottomSheetCallback(this.f144975t);
        frameLayout.setBackgroundResource(x2c0.f190094e1);
        this.f144968m.setVisibility(8);
        this.f144969n.setVisibility(8);
        if (upa.m194847z()) {
            this.f144967l.setBackgroundResource(x2c0.f189655Q);
        }
        if (i == 4 || i == 5) {
            this.f144964i.setBackgroundResource(upa.m194847z() ? x2c0.f190620uh : x2c0.f189833Vm);
            this.f144965j.setText("资料正在审核中");
            this.f144967l.setText("知道了");
            boolean zEquals = TextUtils.equals(this.f144971p, "home_selected_users_card");
            VText vText = this.f144966k;
            if (zEquals) {
                vText.setText("审核通过后，你的喜欢将自动送达给对方");
            } else {
                vText.setText("审核结果将通过小助手告知，请耐心等待");
            }
            xdl0.m208329E0(this.f144967l, new ViewOnClickListenerC18989a());
        } else if (i == 1 || i == 2 || i == 3) {
            zvf0.m220402x("e_selected_users_complete_profile", m165317E(i));
            this.f144964i.setBackgroundResource(upa.m194847z() ? x2c0.f190652vh : x2c0.f189864Wm);
            if (TextUtils.equals(this.f144971p, "home_selected_users_card")) {
                this.f144968m.setVisibility(0);
                this.f144968m.setText("狠心错过");
                this.f144968m.setTextColor(App.f15369e.getResources().getColor(w0c0.f183812V));
                xdl0.m208329E0(this.f144968m, new ViewOnClickListenerC18990b(d30Var2));
            }
            xdl0.m208329E0(this.f144967l, new ViewOnClickListenerC18991c(i, d30Var));
        }
        if (this.f144973r == null) {
            this.f144973r = i0e.m133794c(m165317E(i), opa0.class.getSimpleName());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m165325F(i), this.f144971p);
            this.f144973r.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
        i0e.m133797f(this.f144973r);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mpa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f135030a.m165319H(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
        xdl0.m208329E0(this.f144963h, new View.OnClickListener() { // from class: l.npa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139944a.m165320I(view);
            }
        });
        CoreModule.f17545c.f19677q2.m137710p3();
    }

    @Override // android.app.Dialog
    @Deprecated
    public void show() {
    }

    /* JADX INFO: renamed from: l.opa0$d */
    public class C18992d extends BottomSheetBehavior.BottomSheetCallback {
        public C18992d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                opa0.this.f144972q.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
