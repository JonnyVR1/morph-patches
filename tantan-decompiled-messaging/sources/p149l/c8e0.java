package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c8e0 {

    /* JADX INFO: renamed from: a */
    public ExplodeLayout f79749a;

    /* JADX INFO: renamed from: b */
    public VText f79750b;

    /* JADX INFO: renamed from: c */
    public Act f79751c;

    /* JADX INFO: renamed from: d */
    public wx80 f79752d;

    /* JADX INFO: renamed from: e */
    public int f79753e = 14;

    /* JADX INFO: renamed from: f */
    public int f79754f = Color.parseColor("#757575");

    public c8e0(Act act, wx80 wx80Var) {
        this.f79751c = act;
        this.f79752d = wx80Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m105783d() {
        int i;
        int i2;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        if (c4719aM30471r5 != null) {
            i = c4719aM30471r5.f19270b;
            i2 = c4719aM30471r5.f19271c;
        } else {
            i = 0;
            i2 = 0;
        }
        String strM133840G = i0g0.m133840G(i);
        if (i == 0) {
            return CoreModule.f17544b.getString(R$string.f27391b2);
        }
        if (i2 <= 0) {
            if (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
                return CoreModule.f17544b.getString(R$string.f27427e2, strM133840G);
            }
            return (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "female")) ? CoreModule.f17544b.getString(R$string.f27415d2, strM133840G) : CoreModule.f17544b.getString(R$string.f27403c2, strM133840G);
        }
        if (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
            return CoreModule.f17544b.getString(R$string.f27379a2);
        }
        return (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "female")) ? CoreModule.f17544b.getString(R$string.f27367Z1) : CoreModule.f17544b.getString(R$string.f27356Y1);
    }

    /* JADX INFO: renamed from: e */
    public static String m105784e(int i) {
        String string;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (i == 0) {
            return CoreModule.f17544b.getResources().getString(R$string.f27109B7);
        }
        if (i == 1) {
            if (TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
                return CoreModule.f17544b.getResources().getString(R$string.f27653x7);
            }
            return TEnum.equals(userM169527p9.settings.getLookingFor(), "female") ? CoreModule.f17544b.getResources().getString(R$string.f27675z7) : CoreModule.f17544b.getResources().getString(R$string.f27120C7);
        }
        String strValueOf = i >= 99 ? "99+" : String.valueOf(i);
        if (TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
            string = CoreModule.f17544b.getResources().getString(R$string.f27642w7);
        } else {
            string = TEnum.equals(userM169527p9.settings.getLookingFor(), "female") ? CoreModule.f17544b.getResources().getString(R$string.f27664y7) : CoreModule.f17544b.getResources().getString(R$string.f27098A7);
        }
        return TextUtils.isEmpty(string) ? string : String.format(string, strValueOf);
    }

    /* JADX INFO: renamed from: f */
    public static String m105785f() {
        int iMax = Math.max(1, Math.round(CoreModule.f17545c.f19562E1.m187831F3().intValue() / 2.0f));
        return String.format(CoreModule.f17544b.getResources().getString(R$string.f27250O5), iMax >= 100 ? "99+" : String.valueOf(iMax));
    }

    /* JADX INFO: renamed from: h */
    public static void m105786h(View view) {
        VText vText = (VText) view.findViewById(z4c0.f201489P0);
        if (vText == null) {
            return;
        }
        if (CoreModule.f17545c.f19672p0.m173359g3() && CoreModule.f17545c.f19562E1.m187831F3().intValue() > 0) {
            vText.setText(m105785f());
            return;
        }
        List<User> listM30474s5 = CoreModule.f17545c.f19687u0.m30474s5();
        if (vwb.m200296J(listM30474s5)) {
            vText.setText(m105783d());
        } else {
            vText.setText(CoreModule.m29935P().m94651a().mo33496fb(listM30474s5.get(0)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m105787b(ViewGroup viewGroup, boolean z) {
        TextView textView = new TextView(this.f79751c);
        if (CoreModule.f17545c.f19672p0.m173359g3()) {
            textView.setText(this.f79751c.string(R$string.f27137E2));
        } else {
            wx80 wx80Var = this.f79752d;
            if (wx80Var != null) {
                textView.setText(wx80Var.m205968t());
            } else {
                textView.setText(this.f79751c.string(R$string.f27609t7));
            }
        }
        textView.setTextColor(Color.parseColor("#cc000000"));
        textView.setTypeface(eqh0.m117752c(3), 1);
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
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            layoutParams.topMargin = t100.m186890d(8.0f);
        }
        viewGroup.addView(textView, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public View m105788c(final ViewGroup viewGroup) {
        boolean zM131712q1 = hmb.m131712q1();
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        User userM30483v5 = CoreModule.f17545c.f19687u0.m30483v5();
        boolean zMo33608vb = CoreModule.m29935P().m94651a().mo33608vb(userM30483v5, c4719aM30471r5);
        int iM186890d = t100.m186890d(8.0f);
        LinearLayout linearLayout = new LinearLayout(this.f79751c);
        linearLayout.setOrientation(1);
        if (!ura.m195053e().m195057d().mo33659B8().get().isEmpty()) {
            this.f79753e = 16;
            this.f79754f = Color.parseColor("#4d4d4d");
        }
        if (!CoreModule.m29935P().m94651a().mo158204B()) {
            m105787b(linearLayout, false);
        }
        int iM186890d2 = zM131712q1 ? iM186890d * 16 : iM186890d * 21;
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            iM186890d2 = t100.m186890d(135.0f);
        }
        this.f79749a = (ExplodeLayout) this.f79751c.inflater().inflate(m6c0.f131504L2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iM186890d2);
        linearLayout.setTag(z4c0.f201477J0, this.f79749a);
        linearLayout.addView(this.f79749a, layoutParams);
        boolean zMo158204B = CoreModule.m29935P().m94651a().mo158204B();
        ExplodeLayout explodeLayout = this.f79749a;
        if (zMo158204B) {
            explodeLayout.setScale(0.8f);
        } else {
            explodeLayout.setScale(0.95f);
        }
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            m105787b(linearLayout, true);
        }
        VText vText = new VText(this.f79751c);
        this.f79750b = vText;
        vText.setId(z4c0.f201489P0);
        this.f79750b.setTextSize(this.f79753e);
        this.f79750b.setTextColor(this.f79754f);
        this.f79750b.setGravity(17);
        this.f79750b.setMaxLines(4);
        VText vText2 = this.f79750b;
        int i = t100.f167261j;
        vText2.setPadding(i, 0, i, 0);
        this.f79750b.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = t100.f167275x;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i2);
        if (!zM131712q1) {
            iM186890d = (int) (((double) iM186890d) * 1.5d);
        }
        layoutParams2.bottomMargin = iM186890d;
        layoutParams2.topMargin = 0;
        linearLayout.addView(this.f79750b, layoutParams2);
        if (zMo33608vb) {
            this.f79750b.post(new Runnable() { // from class: l.b8e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74106a.m105789g(viewGroup);
                }
            });
        }
        VText vText3 = this.f79750b;
        if (zMo33608vb) {
            vText3.setText(CoreModule.m29935P().m94651a().mo33358L9(userM30483v5, viewGroup, this.f79750b));
        } else {
            vText3.setText(m105784e(c4719aM30471r5 == null ? 0 : c4719aM30471r5.f19270b));
        }
        int iM186890d3 = t100.m186890d(24.0f);
        xdl0.m208370d0(this.f79750b, iM186890d3);
        xdl0.m208372e0(this.f79750b, iM186890d3);
        this.f79750b.setText(m105783d());
        layoutParams2.bottomMargin = 0;
        layoutParams2.height = -2;
        this.f79750b.setMinHeight(i2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m105789g(ViewGroup viewGroup) {
        if (this.f79750b.getLineCount() <= 2 || viewGroup.getLayoutParams().height < 0) {
            return;
        }
        viewGroup.getLayoutParams().height += t100.f167263l;
    }
}
