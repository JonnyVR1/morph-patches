package p002l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import l.d3c0;
import l.dxc0;
import l.eqh0;
import l.ig3;
import l.m6c0;
import l.q7n;
import l.t100;
import l.xdl0;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p7n implements vol {

    /* JADX INFO: renamed from: a */
    public VText f17043a;

    /* JADX INFO: renamed from: b */
    public VText f17044b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f17045c;

    /* JADX INFO: renamed from: d */
    public VIcon f17046d;

    /* JADX INFO: renamed from: e */
    public VText f17047e;

    /* JADX INFO: renamed from: f */
    public final Act f17048f;

    /* JADX INFO: renamed from: g */
    public final int f17049g;

    public p7n(Act act, int i) {
        this.f17048f = act;
        this.f17049g = i;
    }

    /* JADX INFO: renamed from: f */
    private Drawable m20119f(@ColorInt int i) {
        int iD = t100.d(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iD);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: g */
    private void m20120g() {
        String string;
        int color;
        int color2;
        int i;
        int i2 = this.f17049g;
        if (i2 == 0 || i2 == 16 || i2 == 8 || i2 == 9 || i2 == 17 || i2 == 32) {
            xdl0.M(this.f17045c, false);
            return;
        }
        if (i2 == 1) {
            Act act = this.f17048f;
            string = i2 == 14 ? act.getString(R.string.O7, String.valueOf(CoreModule.c.I0.z3())) : act.getString(R.string.O7, String.valueOf(CoreModule.c.I0.s3()));
            color = Color.parseColor("#14ff4798");
            color2 = Color.parseColor("#ff6298");
            i = d3c0.X9;
        } else {
            if (i2 != 2) {
                dxc0.a("Unexpected value: ", this.f17049g);
                return;
            }
            string = this.f17048f.getString(R.string.R7, String.valueOf(CoreModule.c.I0.U3()));
            color = Color.parseColor("#142bccff");
            color2 = Color.parseColor("#2bccff");
            i = d3c0.ca;
        }
        if (TextUtils.isEmpty(string)) {
            ig3.a("You should define coin purchase dialog desc style.");
            return;
        }
        this.f17046d.setImageResource(i);
        this.f17047e.setTextColor(color2);
        this.f17047e.setText(string);
        this.f17045c.setBackground(m20119f(color));
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: a */
    public View mo13945a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.K, viewGroup, false);
        m20121e(viewInflate);
        this.f17043a.setTypeface(eqh0.c(3), 1);
        this.f17047e.setTypeface(eqh0.c(3), 1);
        return viewInflate;
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: c */
    public void mo13947c(Act act, User user, boolean z) {
        m20120g();
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: d */
    public void mo13948d(Act act, CharSequence charSequence) {
        this.f17044b.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public final void m20121e(View view) {
        q7n.a(this, view);
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: b */
    public void mo13946b(C0190d c0190d) {
    }
}
