package p006l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.i30;
import l.mep0;
import l.nx0;
import l.s5c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c6q0 extends nx0 {

    /* JADX INFO: renamed from: a */
    public final Act f9464a;

    public c6q0(@NonNull Act act) {
        this.f9464a = act;
    }

    /* JADX INFO: renamed from: a */
    public void m13246a() {
        boolean zA = NullChecker.a(this.f9464a.toolbar());
        Act act = this.f9464a;
        if (zA) {
            act.toolbar().setBackground(m13247b());
        } else if (NullChecker.a(act.getSupportActionBar())) {
            this.f9464a.getSupportActionBar().u(m13247b());
        }
        Act act2 = this.f9464a;
        if (act2 instanceof PutongAct) {
            ((PutongAct) act2).setStatusBarColorResId(m13257r());
        } else {
            act2.getWindow().setStatusBarColor(m13248d());
            PutongAct.setLightStatusBar(this.f9464a.getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public Drawable m13247b() {
        return new ColorDrawable(this.f9464a.color(v0c0.f23868p));
    }

    /* JADX INFO: renamed from: c */
    public Drawable mo12834c() {
        return this.f9464a.drawable(w2c0.f24811L0);
    }

    /* JADX INFO: renamed from: d */
    public int m13248d() {
        return this.f9464a.color(m13257r());
    }

    /* JADX INFO: renamed from: e */
    public int mo12835e() {
        return -14606047;
    }

    /* JADX INFO: renamed from: f */
    public int mo12836f() {
        return -14606047;
    }

    /* JADX INFO: renamed from: g */
    public Drawable m13249g() {
        return this.f9464a.drawable(v0c0.f23867o);
    }

    /* JADX INFO: renamed from: h */
    public void m13250h(i30 i30Var) {
        i30Var.C(mo12834c());
        i30Var.u(m13247b());
        i30Var.A(0.0f);
    }

    /* JADX INFO: renamed from: i */
    public void mo12837i(Toolbar toolbar) {
        toolbar.setTitleTextColor(mo12836f());
        toolbar.setSubtitleTextColor(mo12835e());
        try {
            ImageButton imageButton = (ImageButton) Act.TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar);
            if (NullChecker.a(imageButton)) {
                imageButton.setBackgroundResource(w2c0.f24809K0);
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo12838j(TextView textView) {
        textView.setTextSize(16.0f);
        textView.setTextColor(App.e.getResources().getColor(v0c0.f23860h));
    }

    /* JADX INFO: renamed from: k */
    public void m13251k(Window window) {
        window.setNavigationBarColor(this.f9464a.color(v0c0.f23868p));
    }

    /* JADX INFO: renamed from: l */
    public void mo12839l(SearchView searchView) {
        try {
            ImageView imageView = (ImageView) searchView.findViewById(s5c0.D);
            ImageView imageView2 = (ImageView) searchView.findViewById(s5c0.E);
            EditText editText = (EditText) searchView.findViewById(s5c0.J);
            imageView.setImageResource(w2c0.f24805I0);
            imageView2.setImageResource(w2c0.f24803H0);
            mep0.e1(editText, w2c0.f24807J0);
            editText.setTextColor(-14606047);
            editText.setHintTextColor(1713447201);
        } catch (Exception e) {
            CrashHelper.c(new Exception("reset searchView theme error: " + e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m13252m() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m13253n(boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m13254o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m13255p() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m13256q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public int m13257r() {
        return v0c0.f23868p;
    }
}
