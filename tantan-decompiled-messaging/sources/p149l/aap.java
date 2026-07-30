package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aap {

    /* JADX INFO: renamed from: a */
    public ExplodeLayout f68586a;

    /* JADX INFO: renamed from: b */
    public VText f68587b;

    /* JADX INFO: renamed from: c */
    public Act f68588c;

    /* JADX INFO: renamed from: d */
    public String f68589d;

    /* JADX INFO: renamed from: e */
    public int f68590e = 18;

    /* JADX INFO: renamed from: f */
    public int f68591f = Color.parseColor("#cc000000");

    public aap(Act act, String str) {
        this.f68588c = act;
        this.f68589d = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m95563b() {
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

    /* JADX INFO: renamed from: c */
    public static void m95564c(View view) {
        VText vText = (VText) view.findViewById(z4c0.f201489P0);
        if (vText == null) {
            return;
        }
        List<User> listM30474s5 = CoreModule.f17545c.f19687u0.m30474s5();
        if (vwb.m200296J(listM30474s5)) {
            vText.setText(m95563b());
        } else {
            vText.setText(CoreModule.m29935P().m94651a().mo33496fb(listM30474s5.get(0)));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m95565a(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(this.f68588c);
        linearLayout.setOrientation(1);
        int iM186890d = t100.m186890d(180.0f);
        this.f68586a = (ExplodeLayout) this.f68588c.inflater().inflate(m6c0.f131504L2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iM186890d);
        linearLayout.setTag(z4c0.f201477J0, this.f68586a);
        linearLayout.addView(this.f68586a, layoutParams);
        VText vText = new VText(this.f68588c);
        this.f68587b = vText;
        vText.setId(z4c0.f201489P0);
        this.f68587b.setTextSize(this.f68590e);
        this.f68587b.setTextColor(this.f68591f);
        this.f68587b.setGravity(17);
        this.f68587b.setMaxLines(4);
        VText vText2 = this.f68587b;
        int i = t100.f167261j;
        vText2.setPadding(i, 0, i, 0);
        this.f68587b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = t100.m186890d(12.0f);
        linearLayout.addView(this.f68587b, layoutParams2);
        this.f68587b.setText(m95563b());
        return linearLayout;
    }
}
