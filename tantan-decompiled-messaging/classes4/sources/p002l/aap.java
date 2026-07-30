package p002l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.i0g0;
import l.m6c0;
import l.t100;
import l.vwb;
import l.z4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aap {

    /* JADX INFO: renamed from: a */
    public ExplodeLayout f7475a;

    /* JADX INFO: renamed from: b */
    public VText f7476b;

    /* JADX INFO: renamed from: c */
    public Act f7477c;

    /* JADX INFO: renamed from: d */
    public String f7478d;

    /* JADX INFO: renamed from: e */
    public int f7479e = 18;

    /* JADX INFO: renamed from: f */
    public int f7480f = Color.parseColor("#cc000000");

    public aap(Act act, String str) {
        this.f7477c = act;
        this.f7478d = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m9464b() {
        int i;
        int i2;
        User userP9 = CoreModule.c.e0.p9();
        CoreLikers.a aVarR5 = CoreModule.c.u0.r5();
        if (aVarR5 != null) {
            i = aVarR5.b;
            i2 = aVarR5.c;
        } else {
            i = 0;
            i2 = 0;
        }
        String strG = i0g0.G(i);
        if (i == 0) {
            return CoreModule.b.getString(R.string.b2);
        }
        if (i2 <= 0) {
            if (NullChecker.a(userP9.settings) && TEnum.equals(userP9.settings.getLookingFor(), "male")) {
                return CoreModule.b.getString(R.string.e2, strG);
            }
            return (NullChecker.a(userP9.settings) && TEnum.equals(userP9.settings.getLookingFor(), "female")) ? CoreModule.b.getString(R.string.d2, strG) : CoreModule.b.getString(R.string.c2, strG);
        }
        if (NullChecker.a(userP9.settings) && TEnum.equals(userP9.settings.getLookingFor(), "male")) {
            return CoreModule.b.getString(R.string.a2);
        }
        return (NullChecker.a(userP9.settings) && TEnum.equals(userP9.settings.getLookingFor(), "female")) ? CoreModule.b.getString(R.string.Z1) : CoreModule.b.getString(R.string.Y1);
    }

    /* JADX INFO: renamed from: c */
    public static void m9465c(View view) {
        VText vTextFindViewById = view.findViewById(z4c0.P0);
        if (vTextFindViewById == null) {
            return;
        }
        List listS5 = CoreModule.c.u0.s5();
        if (vwb.J(listS5)) {
            vTextFindViewById.setText(m9464b());
        } else {
            vTextFindViewById.setText(CoreModule.P().a().fb((User) listS5.get(0)));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m9466a(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(this.f7477c);
        linearLayout.setOrientation(1);
        int iD = t100.d(180.0f);
        this.f7475a = this.f7477c.inflater().inflate(m6c0.L2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iD);
        linearLayout.setTag(z4c0.J0, this.f7475a);
        linearLayout.addView(this.f7475a, layoutParams);
        VText vText = new VText(this.f7477c);
        this.f7476b = vText;
        vText.setId(z4c0.P0);
        this.f7476b.setTextSize(this.f7479e);
        this.f7476b.setTextColor(this.f7480f);
        this.f7476b.setGravity(17);
        this.f7476b.setMaxLines(4);
        VText vText2 = this.f7476b;
        int i = t100.j;
        vText2.setPadding(i, 0, i, 0);
        this.f7476b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = t100.d(12.0f);
        linearLayout.addView(this.f7476b, layoutParams2);
        this.f7476b.setText(m9464b());
        return linearLayout;
    }
}
