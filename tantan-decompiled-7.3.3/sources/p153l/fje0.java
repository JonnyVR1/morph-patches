package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class fje0 {

    /* JADX INFO: renamed from: a */
    public VText f99314a;

    /* JADX INFO: renamed from: b */
    public Act f99315b;

    /* JADX INFO: renamed from: c */
    public a690 f99316c;

    /* JADX INFO: renamed from: d */
    public String f99317d;

    /* JADX INFO: renamed from: e */
    public int f99318e = 16;

    /* JADX INFO: renamed from: f */
    public int f99319f = Color.parseColor("#4d4d4d");

    /* JADX INFO: renamed from: g */
    public FrameLayout f99320g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f99321h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f99322i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f99323j;

    public fje0(Act act, a690 a690Var, String str) {
        this.f99315b = act;
        this.f99316c = a690Var;
        this.f99317d = str;
    }

    /* JADX INFO: renamed from: a */
    public View m125794a(ViewGroup viewGroup) {
        boolean zM201957q1 = vnb.m201957q1();
        int iM175859d = qa00.m175859d(8.0f);
        LinearLayout linearLayout = new LinearLayout(this.f99315b);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f99315b);
        textView.setText(this.f99315b.string(R$string.f28457t7));
        textView.setTextColor(Color.parseColor("#f2c669"));
        bnl0.m105563k(textView, CoreModule.f18263b.getDrawable(jbc0.f119598h3));
        textView.setCompoundDrawablePadding(qa00.m175859d(10.0f));
        textView.setTextSize(18.0f);
        textView.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.addView(textView, layoutParams);
        int i = zM201957q1 ? iM175859d * 16 : iM175859d * 21;
        this.f99320g = (FrameLayout) this.f99315b.inflater().inflate(rec0.f162468M2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i);
        linearLayout.setTag(fdc0.f98353J0, this.f99320g);
        linearLayout.addView(this.f99320g, layoutParams2);
        this.f99321h = (FrameLayout) this.f99320g.findViewById(fdc0.f98438s);
        this.f99322i = (AutoVDraweeView) this.f99320g.findViewById(fdc0.f98410i);
        this.f99323j = (AutoVDraweeView) this.f99320g.findViewById(fdc0.f98404g);
        this.f99322i.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        VText vText = new VText(this.f99315b);
        this.f99314a = vText;
        vText.setId(fdc0.f98365P0);
        this.f99314a.setTextSize(this.f99318e);
        this.f99314a.setTextColor(this.f99319f);
        this.f99314a.setGravity(17);
        this.f99314a.setMaxLines(4);
        VText vText2 = this.f99314a;
        int i2 = qa00.f156323j;
        vText2.setPadding(i2, 0, i2, 0);
        this.f99314a.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = qa00.f156337x;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i3);
        if (!zM201957q1) {
            iM175859d = (int) (((double) iM175859d) * 1.5d);
        }
        layoutParams3.bottomMargin = iM175859d;
        layoutParams3.topMargin = 0;
        linearLayout.addView(this.f99314a, layoutParams3);
        int iM175859d2 = qa00.m175859d(24.0f);
        bnl0.m105550d0(this.f99314a, iM175859d2);
        bnl0.m105552e0(this.f99314a, iM175859d2);
        if (gta.m132210e().m132214d().mo34662B8().get().isEmpty()) {
            C4883c c4883c = CoreModule.f18264c;
            User userM116503Pa = c4883c.f20381e0.m116503Pa(c4883c.f20405m0.f20136a0.m222761e().loaded.get(0).f20214id);
            this.f99323j.setImageUrl(userM116503Pa.m61308fp().url);
            this.f99314a.setText(viewGroup.getContext().getResources().getString(R$string.f28335j2, userM116503Pa.name));
        } else {
            User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(gta.m132210e().m132214d().mo34662B8().get());
            uqb0.f180374G.m127120O(this.f99323j, userM116503Pa2.m61308fp().profileSmall().formatted(), 7, 20);
            boolean zIsFemale = userM116503Pa2.isFemale();
            VText vText3 = this.f99314a;
            if (zIsFemale) {
                vText3.setText(viewGroup.getContext().getResources().getString(R$string.f28438s, m125795b(userM116503Pa2.name)));
            } else {
                vText3.setText(viewGroup.getContext().getResources().getString(R$string.f28449t, m125795b(userM116503Pa2.name)));
            }
            textView.setText(this.f99315b.string(R$string.f28468u7));
        }
        layoutParams3.bottomMargin = 0;
        layoutParams3.height = -2;
        this.f99314a.setMinHeight(i3);
        return linearLayout;
    }

    /* JADX INFO: renamed from: b */
    public final String m125795b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c < 19968 || c > 40869) {
                i++;
            } else {
                if (i == 15) {
                    sb.append("...");
                    break;
                }
                i += 2;
            }
            sb.append(c);
            if (i >= 16) {
                sb.append("...");
                break;
            }
        }
        return sb.toString();
    }
}
