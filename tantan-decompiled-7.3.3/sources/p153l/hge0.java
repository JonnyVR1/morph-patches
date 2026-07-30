package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class hge0 {

    /* JADX INFO: renamed from: a */
    public ExplodeLayout f109397a;

    /* JADX INFO: renamed from: b */
    public VText f109398b;

    /* JADX INFO: renamed from: c */
    public Act f109399c;

    /* JADX INFO: renamed from: d */
    public a690 f109400d;

    /* JADX INFO: renamed from: e */
    public int f109401e = 14;

    /* JADX INFO: renamed from: f */
    public int f109402f = Color.parseColor("#757575");

    public hge0(Act act, a690 a690Var) {
        this.f109399c = act;
        this.f109400d = a690Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m134920d() {
        int i;
        int i2;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        if (c4870aM31479t5 != null) {
            i = c4870aM31479t5.f20012b;
            i2 = c4870aM31479t5.f20013c;
        } else {
            i = 0;
            i2 = 0;
        }
        String strM175775G = q8g0.m175775G(i);
        if (i == 0) {
            return CoreModule.f18263b.getString(R$string.f28239b2);
        }
        if (i2 <= 0) {
            if (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
                return CoreModule.f18263b.getString(R$string.f28275e2, strM175775G);
            }
            return (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "female")) ? CoreModule.f18263b.getString(R$string.f28263d2, strM175775G) : CoreModule.f18263b.getString(R$string.f28251c2, strM175775G);
        }
        if (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
            return CoreModule.f18263b.getString(R$string.f28227a2);
        }
        return (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "female")) ? CoreModule.f18263b.getString(R$string.f28215Z1) : CoreModule.f18263b.getString(R$string.f28204Y1);
    }

    /* JADX INFO: renamed from: e */
    public static String m134921e(int i) {
        String string;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (i == 0) {
            return CoreModule.f18263b.getResources().getString(R$string.f27957B7);
        }
        if (i == 1) {
            if (TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
                return CoreModule.f18263b.getResources().getString(R$string.f28501x7);
            }
            return TEnum.equals(userM116600p9.settings.getLookingFor(), "female") ? CoreModule.f18263b.getResources().getString(R$string.f28523z7) : CoreModule.f18263b.getResources().getString(R$string.f27968C7);
        }
        String strValueOf = i >= 99 ? "99+" : String.valueOf(i);
        if (TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
            string = CoreModule.f18263b.getResources().getString(R$string.f28490w7);
        } else {
            string = TEnum.equals(userM116600p9.settings.getLookingFor(), "female") ? CoreModule.f18263b.getResources().getString(R$string.f28512y7) : CoreModule.f18263b.getResources().getString(R$string.f27946A7);
        }
        return TextUtils.isEmpty(string) ? string : String.format(string, strValueOf);
    }

    /* JADX INFO: renamed from: f */
    public static String m134922f() {
        int iMax = Math.max(1, Math.round(CoreModule.f18264c.f20304E1.m109150F3().intValue() / 2.0f));
        return String.format(CoreModule.f18263b.getResources().getString(R$string.f28098O5), iMax >= 100 ? "99+" : String.valueOf(iMax));
    }

    /* JADX INFO: renamed from: h */
    public static void m134923h(View view) {
        VText vText = (VText) view.findViewById(fdc0.f98365P0);
        if (vText == null) {
            return;
        }
        if (CoreModule.f18264c.f20414p0.m219062g3() && CoreModule.f18264c.f20304E1.m109150F3().intValue() > 0) {
            vText.setText(m134922f());
            return;
        }
        List<User> listM31482u5 = CoreModule.f18264c.f20429u0.m31482u5();
        if (jyb.m147479J(listM31482u5)) {
            vText.setText(m134920d());
        } else {
            vText.setText(CoreModule.m30933P().m143405a().mo34499fb(listM31482u5.get(0)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m134924b(ViewGroup viewGroup, boolean z) {
        TextView textView = new TextView(this.f109399c);
        if (CoreModule.f18264c.f20414p0.m219062g3()) {
            textView.setText(this.f109399c.string(R$string.f27985E2));
        } else {
            a690 a690Var = this.f109400d;
            if (a690Var != null) {
                textView.setText(a690Var.m96314t());
            } else {
                textView.setText(this.f109399c.string(R$string.f28457t7));
            }
        }
        textView.setTextColor(Color.parseColor("#cc000000"));
        textView.setTypeface(lyh0.m156283c(3), 1);
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
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            layoutParams.topMargin = qa00.m175859d(8.0f);
        }
        viewGroup.addView(textView, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public View m134925c(final ViewGroup viewGroup) {
        boolean zM201957q1 = vnb.m201957q1();
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        User userM31491x5 = CoreModule.f18264c.f20429u0.m31491x5();
        boolean zMo34611vb = CoreModule.m30933P().m143405a().mo34611vb(userM31491x5, c4870aM31479t5);
        int iM175859d = qa00.m175859d(8.0f);
        LinearLayout linearLayout = new LinearLayout(this.f109399c);
        linearLayout.setOrientation(1);
        if (!gta.m132210e().m132214d().mo34662B8().get().isEmpty()) {
            this.f109401e = 16;
            this.f109402f = Color.parseColor("#4d4d4d");
        }
        if (!CoreModule.m30933P().m143405a().mo180296B()) {
            m134924b(linearLayout, false);
        }
        int iM175859d2 = zM201957q1 ? iM175859d * 16 : iM175859d * 21;
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            iM175859d2 = qa00.m175859d(135.0f);
        }
        this.f109397a = (ExplodeLayout) this.f109399c.inflater().inflate(rec0.f162464L2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iM175859d2);
        linearLayout.setTag(fdc0.f98353J0, this.f109397a);
        linearLayout.addView(this.f109397a, layoutParams);
        boolean zMo180296B = CoreModule.m30933P().m143405a().mo180296B();
        ExplodeLayout explodeLayout = this.f109397a;
        if (zMo180296B) {
            explodeLayout.setScale(0.8f);
        } else {
            explodeLayout.setScale(0.95f);
        }
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            m134924b(linearLayout, true);
        }
        VText vText = new VText(this.f109399c);
        this.f109398b = vText;
        vText.setId(fdc0.f98365P0);
        this.f109398b.setTextSize(this.f109401e);
        this.f109398b.setTextColor(this.f109402f);
        this.f109398b.setGravity(17);
        this.f109398b.setMaxLines(4);
        VText vText2 = this.f109398b;
        int i = qa00.f156323j;
        vText2.setPadding(i, 0, i, 0);
        this.f109398b.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = qa00.f156337x;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i2);
        if (!zM201957q1) {
            iM175859d = (int) (((double) iM175859d) * 1.5d);
        }
        layoutParams2.bottomMargin = iM175859d;
        layoutParams2.topMargin = 0;
        linearLayout.addView(this.f109398b, layoutParams2);
        if (zMo34611vb) {
            this.f109398b.post(new Runnable() { // from class: l.gge0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104015a.m134926g(viewGroup);
                }
            });
        }
        VText vText3 = this.f109398b;
        if (zMo34611vb) {
            vText3.setText(CoreModule.m30933P().m143405a().mo34361L9(userM31491x5, viewGroup, this.f109398b));
        } else {
            vText3.setText(m134921e(c4870aM31479t5 == null ? 0 : c4870aM31479t5.f20012b));
        }
        int iM175859d3 = qa00.m175859d(24.0f);
        bnl0.m105550d0(this.f109398b, iM175859d3);
        bnl0.m105552e0(this.f109398b, iM175859d3);
        this.f109398b.setText(m134920d());
        layoutParams2.bottomMargin = 0;
        layoutParams2.height = -2;
        this.f109398b.setMinHeight(i2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m134926g(ViewGroup viewGroup) {
        if (this.f109398b.getLineCount() <= 2 || viewGroup.getLayoutParams().height < 0) {
            return;
        }
        viewGroup.getLayoutParams().height += qa00.f156325l;
    }
}
