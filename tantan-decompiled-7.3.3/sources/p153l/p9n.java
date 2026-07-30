package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p9n implements grl {

    /* JADX INFO: renamed from: a */
    public VText f151166a;

    /* JADX INFO: renamed from: b */
    public VText f151167b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f151168c;

    /* JADX INFO: renamed from: d */
    public VIcon f151169d;

    /* JADX INFO: renamed from: e */
    public VText f151170e;

    /* JADX INFO: renamed from: f */
    public final Act f151171f;

    /* JADX INFO: renamed from: g */
    public final int f151172g;

    public p9n(Act act, int i) {
        this.f151171f = act;
        this.f151172g = i;
    }

    /* JADX INFO: renamed from: f */
    private Drawable m171365f(@ColorInt int i) {
        int iM175859d = qa00.m175859d(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iM175859d);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: g */
    private void m171366g() {
        String string;
        int color;
        int color2;
        int i;
        int i2 = this.f151172g;
        if (i2 == 0 || i2 == 16 || i2 == 8 || i2 == 9 || i2 == 17 || i2 == 32) {
            bnl0.m105524M(this.f151168c, false);
            return;
        }
        if (i2 == 1) {
            Act act = this.f151171f;
            string = i2 == 14 ? act.getString(R$string.f28100O7, String.valueOf(CoreModule.f18264c.f20315I0.m144072z3())) : act.getString(R$string.f28100O7, String.valueOf(CoreModule.f18264c.f20315I0.m144065s3()));
            color = Color.parseColor("#14ff4798");
            color2 = Color.parseColor("#ff6298");
            i = jbc0.f119467X9;
        } else {
            if (i2 != 2) {
                h5d0.m133654a("Unexpected value: ", this.f151172g);
                return;
            }
            string = this.f151171f.getString(R$string.f28133R7, String.valueOf(CoreModule.f18264c.f20315I0.m144064U3()));
            color = Color.parseColor("#142bccff");
            color2 = Color.parseColor("#2bccff");
            i = jbc0.f119535ca;
        }
        if (TextUtils.isEmpty(string)) {
            wg3.m206174a("You should define coin purchase dialog desc style.");
            return;
        }
        this.f151169d.setImageResource(i);
        this.f151170e.setTextColor(color2);
        this.f151170e.setText(string);
        this.f151168c.setBackground(m171365f(color));
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: a */
    public View mo131121a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(rec0.f162457K, viewGroup, false);
        m171367e(viewInflate);
        this.f151166a.setTypeface(lyh0.m156283c(3), 1);
        this.f151170e.setTypeface(lyh0.m156283c(3), 1);
        return viewInflate;
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: c */
    public void mo131123c(Act act, User user, boolean z) {
        m171366g();
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: d */
    public void mo131124d(Act act, CharSequence charSequence) {
        this.f151167b.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public final void m171367e(View view) {
        q9n.m175843a(this, view);
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: b */
    public void mo131122b(C8928d c8928d) {
    }
}
