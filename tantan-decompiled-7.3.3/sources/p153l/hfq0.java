package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class hfq0 extends ux0 {

    /* JADX INFO: renamed from: a */
    public final Act f109340a;

    public hfq0(@NonNull Act act) {
        this.f109340a = act;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: a */
    public void mo134821a() {
        boolean zM82486a = NullChecker.m82486a(this.f109340a.toolbar());
        Act act = this.f109340a;
        if (zM82486a) {
            act.toolbar().setBackground(mo134822b());
        } else if (NullChecker.m82486a(act.getSupportActionBar())) {
            this.f109340a.getSupportActionBar().mo102194u(mo134822b());
        }
        Act act2 = this.f109340a;
        if (act2 instanceof PutongAct) {
            ((PutongAct) act2).setStatusBarColorResId(m134838r());
        } else {
            act2.getWindow().setStatusBarColor(mo134824d());
            PutongAct.setLightStatusBar(this.f109340a.getWindow(), 16);
        }
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: b */
    public Drawable mo134822b() {
        return new ColorDrawable(this.f109340a.color(b9c0.f75570p));
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: c */
    public Drawable mo134823c() {
        return this.f109340a.drawable(cbc0.f80743L0);
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: d */
    public int mo134824d() {
        return this.f109340a.color(m134838r());
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: e */
    public int mo134825e() {
        return -14606047;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: f */
    public int mo134826f() {
        return -14606047;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: g */
    public Drawable mo134827g() {
        return this.f109340a.drawable(b9c0.f75569o);
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: h */
    public void mo134828h(c30 c30Var) {
        c30Var.mo102170C(mo134823c());
        c30Var.mo102194u(mo134822b());
        c30Var.mo102168A(0.0f);
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: i */
    public void mo134829i(Toolbar toolbar) {
        toolbar.setTitleTextColor(mo134826f());
        toolbar.setSubtitleTextColor(mo134825e());
        try {
            ImageButton imageButton = (ImageButton) Act.TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar);
            if (NullChecker.m82486a(imageButton)) {
                imageButton.setBackgroundResource(cbc0.f80741K0);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: j */
    public void mo134830j(TextView textView) {
        textView.setTextSize(16.0f);
        textView.setTextColor(App.f16088e.getResources().getColor(b9c0.f75562h));
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: k */
    public void mo134831k(Window window) {
        window.setNavigationBarColor(this.f109340a.color(b9c0.f75570p));
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: l */
    public void mo134832l(SearchView searchView) {
        try {
            ImageView imageView = (ImageView) searchView.findViewById(xdc0.f193537D);
            ImageView imageView2 = (ImageView) searchView.findViewById(xdc0.f193538E);
            EditText editText = (EditText) searchView.findViewById(xdc0.f193543J);
            imageView.setImageResource(cbc0.f80737I0);
            imageView2.setImageResource(cbc0.f80735H0);
            qnp0.m177262e1(editText, cbc0.f80739J0);
            editText.setTextColor(-14606047);
            editText.setHintTextColor(1713447201);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("reset searchView theme error: " + e.getMessage()));
        }
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: m */
    public boolean mo134833m() {
        return true;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: n */
    public boolean mo134834n(boolean z) {
        return false;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: o */
    public boolean mo134835o() {
        return false;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: p */
    public boolean mo134836p() {
        return false;
    }

    @Override // p153l.ux0
    /* JADX INFO: renamed from: q */
    public boolean mo134837q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public int m134838r() {
        return b9c0.f75570p;
    }
}
