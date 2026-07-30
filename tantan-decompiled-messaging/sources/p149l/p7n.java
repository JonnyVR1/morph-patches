package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p7n implements vol {

    /* JADX INFO: renamed from: a */
    public VText f147523a;

    /* JADX INFO: renamed from: b */
    public VText f147524b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f147525c;

    /* JADX INFO: renamed from: d */
    public VIcon f147526d;

    /* JADX INFO: renamed from: e */
    public VText f147527e;

    /* JADX INFO: renamed from: f */
    public final Act f147528f;

    /* JADX INFO: renamed from: g */
    public final int f147529g;

    public p7n(Act act, int i) {
        this.f147528f = act;
        this.f147529g = i;
    }

    /* JADX INFO: renamed from: f */
    private Drawable m167763f(@ColorInt int i) {
        int iM186890d = t100.m186890d(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iM186890d);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: g */
    private void m167764g() {
        String string;
        int color;
        int color2;
        int i;
        int i2 = this.f147529g;
        if (i2 == 0 || i2 == 16 || i2 == 8 || i2 == 9 || i2 == 17 || i2 == 32) {
            xdl0.m208344M(this.f147525c, false);
            return;
        }
        if (i2 == 1) {
            Act act = this.f147528f;
            string = i2 == 14 ? act.getString(R$string.f27252O7, String.valueOf(CoreModule.f17545c.f19573I0.m140275z3())) : act.getString(R$string.f27252O7, String.valueOf(CoreModule.f17545c.f19573I0.m140268s3()));
            color = Color.parseColor("#14ff4798");
            color2 = Color.parseColor("#ff6298");
            i = d3c0.f83812X9;
        } else {
            if (i2 != 2) {
                dxc0.m114002a("Unexpected value: ", this.f147529g);
                return;
            }
            string = this.f147528f.getString(R$string.f27285R7, String.valueOf(CoreModule.f17545c.f19573I0.m140267U3()));
            color = Color.parseColor("#142bccff");
            color2 = Color.parseColor("#2bccff");
            i = d3c0.f83880ca;
        }
        if (TextUtils.isEmpty(string)) {
            ig3.m135964a("You should define coin purchase dialog desc style.");
            return;
        }
        this.f147526d.setImageResource(i);
        this.f147527e.setTextColor(color2);
        this.f147527e.setText(string);
        this.f147525c.setBackground(m167763f(color));
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: a */
    public View mo127037a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.f131497K, viewGroup, false);
        m167765e(viewInflate);
        this.f147523a.setTypeface(eqh0.m117752c(3), 1);
        this.f147527e.setTypeface(eqh0.m117752c(3), 1);
        return viewInflate;
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: c */
    public void mo127039c(Act act, User user, boolean z) {
        m167764g();
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: d */
    public void mo127040d(Act act, CharSequence charSequence) {
        this.f147524b.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public final void m167765e(View view) {
        q7n.m173290a(this, view);
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: b */
    public void mo127038b(C8765d c8765d) {
    }
}
