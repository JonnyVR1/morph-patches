package p006l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.ExplodeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import l.eqh0;
import l.hmb;
import l.i0g0;
import l.m6c0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c8e0 {

    /* JADX INFO: renamed from: a */
    public ExplodeLayout f9488a;

    /* JADX INFO: renamed from: b */
    public VText f9489b;

    /* JADX INFO: renamed from: c */
    public Act f9490c;

    /* JADX INFO: renamed from: d */
    public wx80 f9491d;

    /* JADX INFO: renamed from: e */
    public int f9492e = 14;

    /* JADX INFO: renamed from: f */
    public int f9493f = Color.parseColor("#757575");

    public c8e0(Act act, wx80 wx80Var) {
        this.f9490c = act;
        this.f9491d = wx80Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m13311d() {
        int i;
        int i2;
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
        if (c0145aM2399r5 != null) {
            i = c0145aM2399r5.f3259b;
            i2 = c0145aM2399r5.f3260c;
        } else {
            i = 0;
            i2 = 0;
        }
        String strG = i0g0.G(i);
        if (i == 0) {
            return CoreModule.f1533b.getString(R.string.b2);
        }
        if (i2 <= 0) {
            if (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "male")) {
                return CoreModule.f1533b.getString(R.string.e2, strG);
            }
            return (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "female")) ? CoreModule.f1533b.getString(R.string.d2, strG) : CoreModule.f1533b.getString(R.string.c2, strG);
        }
        if (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "male")) {
            return CoreModule.f1533b.getString(R.string.a2);
        }
        return (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "female")) ? CoreModule.f1533b.getString(R.string.Z1) : CoreModule.f1533b.getString(R.string.Y1);
    }

    /* JADX INFO: renamed from: e */
    public static String m13312e(int i) {
        String string;
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (i == 0) {
            return CoreModule.f1533b.getResources().getString(R.string.B7);
        }
        if (i == 1) {
            if (TEnum.equals(userM21490p9.settings.getLookingFor(), "male")) {
                return CoreModule.f1533b.getResources().getString(R.string.x7);
            }
            return TEnum.equals(userM21490p9.settings.getLookingFor(), "female") ? CoreModule.f1533b.getResources().getString(R.string.z7) : CoreModule.f1533b.getResources().getString(R.string.C7);
        }
        String strValueOf = i >= 99 ? "99+" : String.valueOf(i);
        if (TEnum.equals(userM21490p9.settings.getLookingFor(), "male")) {
            string = CoreModule.f1533b.getResources().getString(R.string.w7);
        } else {
            string = TEnum.equals(userM21490p9.settings.getLookingFor(), "female") ? CoreModule.f1533b.getResources().getString(R.string.y7) : CoreModule.f1533b.getResources().getString(R.string.A7);
        }
        return TextUtils.isEmpty(string) ? string : String.format(string, strValueOf);
    }

    /* JADX INFO: renamed from: f */
    public static String m13313f() {
        int iMax = Math.max(1, Math.round(CoreModule.f1534c.f3551E1.m24585F3().intValue() / 2.0f));
        return String.format(CoreModule.f1533b.getResources().getString(R.string.O5), iMax >= 100 ? "99+" : String.valueOf(iMax));
    }

    /* JADX INFO: renamed from: h */
    public static void m13314h(View view) {
        VText vTextFindViewById = view.findViewById(z4c0.P0);
        if (vTextFindViewById == null) {
            return;
        }
        if (CoreModule.f1534c.f3661p0.m21963g3() && CoreModule.f1534c.f3551E1.m24585F3().intValue() > 0) {
            vTextFindViewById.setText(m13313f());
            return;
        }
        List<User> listM2402s5 = CoreModule.f1534c.f3676u0.m2402s5();
        if (vwb.J(listM2402s5)) {
            vTextFindViewById.setText(m13311d());
        } else {
            vTextFindViewById.setText(CoreModule.m1854P().m11706a().m5433fb(listM2402s5.get(0)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13315b(ViewGroup viewGroup, boolean z) {
        TextView textView = new TextView(this.f9490c);
        if (CoreModule.f1534c.f3661p0.m21963g3()) {
            textView.setText(this.f9490c.string(R.string.E2));
        } else {
            wx80 wx80Var = this.f9491d;
            if (wx80Var != null) {
                textView.setText(wx80Var.m26849t());
            } else {
                textView.setText(this.f9490c.string(R.string.t7));
            }
        }
        textView.setTextColor(Color.parseColor("#cc000000"));
        textView.setTypeface(eqh0.c(3), 1);
        if ("ko".equals(Locale.getDefault().getLanguage())) {
            textView.setTextSize(17.0f);
        } else {
            textView.setTextSize(18.0f);
        }
        if (z) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (CoreModule.m1854P().m11706a().m19710B()) {
            layoutParams.topMargin = t100.d(8.0f);
        }
        viewGroup.addView(textView, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public View m13316c(final ViewGroup viewGroup) {
        boolean zQ1 = hmb.q1();
        CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
        User userM2411v5 = CoreModule.f1534c.f3676u0.m2411v5();
        boolean zM5545vb = CoreModule.m1854P().m11706a().m5545vb(userM2411v5, c0145aM2399r5);
        int iD = t100.d(8.0f);
        LinearLayout linearLayout = new LinearLayout(this.f9490c);
        linearLayout.setOrientation(1);
        if (!((String) ura.m25555e().m25559d().m5596B8().get()).isEmpty()) {
            this.f9492e = 16;
            this.f9493f = Color.parseColor("#4d4d4d");
        }
        if (!CoreModule.m1854P().m11706a().m19710B()) {
            m13315b(linearLayout, false);
        }
        int iD2 = zQ1 ? iD * 16 : iD * 21;
        if (CoreModule.m1854P().m11706a().m19710B()) {
            iD2 = t100.d(135.0f);
        }
        this.f9488a = (ExplodeLayout) this.f9490c.inflater().inflate(m6c0.L2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iD2);
        linearLayout.setTag(z4c0.J0, this.f9488a);
        linearLayout.addView(this.f9488a, layoutParams);
        boolean zM19710B = CoreModule.m1854P().m11706a().m19710B();
        ExplodeLayout explodeLayout = this.f9488a;
        if (zM19710B) {
            explodeLayout.setScale(0.8f);
        } else {
            explodeLayout.setScale(0.95f);
        }
        if (CoreModule.m1854P().m11706a().m19710B()) {
            m13315b(linearLayout, true);
        }
        VText vText = new VText(this.f9490c);
        this.f9489b = vText;
        vText.setId(z4c0.P0);
        this.f9489b.setTextSize(this.f9492e);
        this.f9489b.setTextColor(this.f9493f);
        this.f9489b.setGravity(17);
        this.f9489b.setMaxLines(4);
        VText vText2 = this.f9489b;
        int i = t100.j;
        vText2.setPadding(i, 0, i, 0);
        this.f9489b.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = t100.x;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i2);
        if (!zQ1) {
            iD = (int) (((double) iD) * 1.5d);
        }
        layoutParams2.bottomMargin = iD;
        layoutParams2.topMargin = 0;
        linearLayout.addView(this.f9489b, layoutParams2);
        if (zM5545vb) {
            this.f9489b.post(new Runnable() { // from class: l.b8e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8774a.m13317g(viewGroup);
                }
            });
        }
        VText vText3 = this.f9489b;
        if (zM5545vb) {
            vText3.setText(CoreModule.m1854P().m11706a().m5295L9(userM2411v5, viewGroup, this.f9489b));
        } else {
            vText3.setText(m13312e(c0145aM2399r5 == null ? 0 : c0145aM2399r5.f3259b));
        }
        int iD3 = t100.d(24.0f);
        xdl0.d0(this.f9489b, iD3);
        xdl0.e0(this.f9489b, iD3);
        this.f9489b.setText(m13311d());
        layoutParams2.bottomMargin = 0;
        layoutParams2.height = -2;
        this.f9489b.setMinHeight(i2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m13317g(ViewGroup viewGroup) {
        if (this.f9489b.getLineCount() <= 2 || viewGroup.getLayoutParams().height < 0) {
            return;
        }
        viewGroup.getLayoutParams().height += t100.l;
    }
}
