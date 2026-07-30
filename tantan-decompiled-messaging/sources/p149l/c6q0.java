package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class c6q0 extends nx0 {

    /* JADX INFO: renamed from: a */
    public final Act f79561a;

    public c6q0(@NonNull Act act) {
        this.f79561a = act;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: a */
    public void mo105491a() {
        boolean zM81303a = NullChecker.m81303a(this.f79561a.toolbar());
        Act act = this.f79561a;
        if (zM81303a) {
            act.toolbar().setBackground(mo105492b());
        } else if (NullChecker.m81303a(act.getSupportActionBar())) {
            this.f79561a.getSupportActionBar().mo134134u(mo105492b());
        }
        Act act2 = this.f79561a;
        if (act2 instanceof PutongAct) {
            ((PutongAct) act2).setStatusBarColorResId(m105502r());
        } else {
            act2.getWindow().setStatusBarColor(mo105493d());
            PutongAct.setLightStatusBar(this.f79561a.getWindow(), 16);
        }
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: b */
    public Drawable mo105492b() {
        return new ColorDrawable(this.f79561a.color(v0c0.f179109p));
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: c */
    public Drawable mo103044c() {
        return this.f79561a.drawable(w2c0.f184147L0);
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: d */
    public int mo105493d() {
        return this.f79561a.color(m105502r());
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: e */
    public int mo103045e() {
        return -14606047;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: f */
    public int mo103046f() {
        return -14606047;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: g */
    public Drawable mo105494g() {
        return this.f79561a.drawable(v0c0.f179108o);
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: h */
    public void mo105495h(i30 i30Var) {
        i30Var.mo134113C(mo103044c());
        i30Var.mo134134u(mo105492b());
        i30Var.mo134111A(0.0f);
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: i */
    public void mo103047i(Toolbar toolbar) {
        toolbar.setTitleTextColor(mo103046f());
        toolbar.setSubtitleTextColor(mo103045e());
        try {
            ImageButton imageButton = (ImageButton) Act.TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar);
            if (NullChecker.m81303a(imageButton)) {
                imageButton.setBackgroundResource(w2c0.f184145K0);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: j */
    public void mo103048j(TextView textView) {
        textView.setTextSize(16.0f);
        textView.setTextColor(App.f15369e.getResources().getColor(v0c0.f179101h));
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: k */
    public void mo105496k(Window window) {
        window.setNavigationBarColor(this.f79561a.color(v0c0.f179109p));
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: l */
    public void mo103049l(SearchView searchView) {
        try {
            ImageView imageView = (ImageView) searchView.findViewById(s5c0.f162498D);
            ImageView imageView2 = (ImageView) searchView.findViewById(s5c0.f162499E);
            EditText editText = (EditText) searchView.findViewById(s5c0.f162504J);
            imageView.setImageResource(w2c0.f184141I0);
            imageView2.setImageResource(w2c0.f184139H0);
            mep0.m154303e1(editText, w2c0.f184143J0);
            editText.setTextColor(-14606047);
            editText.setHintTextColor(1713447201);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("reset searchView theme error: " + e.getMessage()));
        }
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: m */
    public boolean mo105497m() {
        return true;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: n */
    public boolean mo105498n(boolean z) {
        return false;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: o */
    public boolean mo105499o() {
        return false;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: p */
    public boolean mo105500p() {
        return false;
    }

    @Override // p149l.nx0
    /* JADX INFO: renamed from: q */
    public boolean mo105501q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public int m105502r() {
        return v0c0.f179109p;
    }
}
