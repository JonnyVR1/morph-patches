package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.d3c0;
import l.hmb;
import l.m6c0;
import l.t100;
import l.xdl0;
import l.z4c0;
import v.AutoVDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class abe0 {

    /* JADX INFO: renamed from: a */
    public VText f8194a;

    /* JADX INFO: renamed from: b */
    public Act f8195b;

    /* JADX INFO: renamed from: c */
    public wx80 f8196c;

    /* JADX INFO: renamed from: d */
    public String f8197d;

    /* JADX INFO: renamed from: e */
    public int f8198e = 16;

    /* JADX INFO: renamed from: f */
    public int f8199f = Color.parseColor("#4d4d4d");

    /* JADX INFO: renamed from: g */
    public FrameLayout f8200g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f8201h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f8202i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f8203j;

    public abe0(Act act, wx80 wx80Var, String str) {
        this.f8195b = act;
        this.f8196c = wx80Var;
        this.f8197d = str;
    }

    /* JADX INFO: renamed from: a */
    public View m11806a(ViewGroup viewGroup) {
        boolean zQ1 = hmb.q1();
        int iD = t100.d(8.0f);
        LinearLayout linearLayout = new LinearLayout(this.f8195b);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f8195b);
        textView.setText(this.f8195b.string(R.string.t7));
        textView.setTextColor(Color.parseColor("#f2c669"));
        xdl0.k(textView, CoreModule.f1533b.getDrawable(d3c0.h3));
        textView.setCompoundDrawablePadding(t100.d(10.0f));
        textView.setTextSize(18.0f);
        textView.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.addView(textView, layoutParams);
        int i = zQ1 ? iD * 16 : iD * 21;
        this.f8200g = (FrameLayout) this.f8195b.inflater().inflate(m6c0.M2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i);
        linearLayout.setTag(z4c0.J0, this.f8200g);
        linearLayout.addView(this.f8200g, layoutParams2);
        this.f8201h = (FrameLayout) this.f8200g.findViewById(z4c0.s);
        this.f8202i = this.f8200g.findViewById(z4c0.i);
        this.f8203j = this.f8200g.findViewById(z4c0.g);
        this.f8202i.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        VText vText = new VText(this.f8195b);
        this.f8194a = vText;
        vText.setId(z4c0.P0);
        this.f8194a.setTextSize(this.f8198e);
        this.f8194a.setTextColor(this.f8199f);
        this.f8194a.setGravity(17);
        this.f8194a.setMaxLines(4);
        VText vText2 = this.f8194a;
        int i2 = t100.j;
        vText2.setPadding(i2, 0, i2, 0);
        this.f8194a.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = t100.x;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i3);
        if (!zQ1) {
            iD = (int) (((double) iD) * 1.5d);
        }
        layoutParams3.bottomMargin = iD;
        layoutParams3.topMargin = 0;
        linearLayout.addView(this.f8194a, layoutParams3);
        int iD2 = t100.d(24.0f);
        xdl0.d0(this.f8194a, iD2);
        xdl0.e0(this.f8194a, iD2);
        if (((String) ura.m25555e().m25559d().m5596B8().get()).isEmpty()) {
            C0158c c0158c = CoreModule.f1534c;
            User userM21393Pa = c0158c.f3628e0.m21393Pa(((CoreSuggested.UserInfo) ((PartialListOpt) c0158c.f3652m0.f3383a0.e()).loaded.get(0)).f3461id);
            this.f8203j.setImageUrl(((Media) userM21393Pa.fp()).url);
            this.f8194a.setText(viewGroup.getContext().getResources().getString(R.string.j2, userM21393Pa.name));
        } else {
            User userM21393Pa2 = CoreModule.f1534c.f3628e0.m21393Pa((String) ura.m25555e().m25559d().m5596B8().get());
            qib0.f19782G.m12749O(this.f8203j, userM21393Pa2.fp().profileSmall().formatted(), 7, 20);
            boolean zIsFemale = userM21393Pa2.isFemale();
            VText vText3 = this.f8194a;
            if (zIsFemale) {
                vText3.setText(viewGroup.getContext().getResources().getString(R.string.s, m11807b(userM21393Pa2.name)));
            } else {
                vText3.setText(viewGroup.getContext().getResources().getString(R.string.t, m11807b(userM21393Pa2.name)));
            }
            textView.setText(this.f8195b.string(R.string.u7));
        }
        layoutParams3.bottomMargin = 0;
        layoutParams3.height = -2;
        this.f8194a.setMinHeight(i3);
        return linearLayout;
    }

    /* JADX INFO: renamed from: b */
    public final String m11807b(String str) {
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
