package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class acp {

    /* JADX INFO: renamed from: a */
    public ExplodeLayout f69737a;

    /* JADX INFO: renamed from: b */
    public VText f69738b;

    /* JADX INFO: renamed from: c */
    public Act f69739c;

    /* JADX INFO: renamed from: d */
    public String f69740d;

    /* JADX INFO: renamed from: e */
    public int f69741e = 18;

    /* JADX INFO: renamed from: f */
    public int f69742f = Color.parseColor("#cc000000");

    public acp(Act act, String str) {
        this.f69739c = act;
        this.f69740d = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m96873b() {
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

    /* JADX INFO: renamed from: c */
    public static void m96874c(View view) {
        VText vText = (VText) view.findViewById(fdc0.f98365P0);
        if (vText == null) {
            return;
        }
        List<User> listM31482u5 = CoreModule.f18264c.f20429u0.m31482u5();
        if (jyb.m147479J(listM31482u5)) {
            vText.setText(m96873b());
        } else {
            vText.setText(CoreModule.m30933P().m143405a().mo34499fb(listM31482u5.get(0)));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m96875a(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(this.f69739c);
        linearLayout.setOrientation(1);
        int iM175859d = qa00.m175859d(180.0f);
        this.f69737a = (ExplodeLayout) this.f69739c.inflater().inflate(rec0.f162464L2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iM175859d);
        linearLayout.setTag(fdc0.f98353J0, this.f69737a);
        linearLayout.addView(this.f69737a, layoutParams);
        VText vText = new VText(this.f69739c);
        this.f69738b = vText;
        vText.setId(fdc0.f98365P0);
        this.f69738b.setTextSize(this.f69741e);
        this.f69738b.setTextColor(this.f69742f);
        this.f69738b.setGravity(17);
        this.f69738b.setMaxLines(4);
        VText vText2 = this.f69738b;
        int i = qa00.f156323j;
        vText2.setPadding(i, 0, i, 0);
        this.f69738b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = qa00.m175859d(12.0f);
        linearLayout.addView(this.f69738b, layoutParams2);
        this.f69738b.setText(m96873b());
        return linearLayout;
    }
}
