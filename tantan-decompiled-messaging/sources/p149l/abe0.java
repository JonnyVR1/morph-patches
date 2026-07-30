package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class abe0 {

    /* JADX INFO: renamed from: a */
    public VText f68645a;

    /* JADX INFO: renamed from: b */
    public Act f68646b;

    /* JADX INFO: renamed from: c */
    public wx80 f68647c;

    /* JADX INFO: renamed from: d */
    public String f68648d;

    /* JADX INFO: renamed from: e */
    public int f68649e = 16;

    /* JADX INFO: renamed from: f */
    public int f68650f = Color.parseColor("#4d4d4d");

    /* JADX INFO: renamed from: g */
    public FrameLayout f68651g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f68652h;

    /* JADX INFO: renamed from: i */
    public AutoVDraweeView f68653i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f68654j;

    public abe0(Act act, wx80 wx80Var, String str) {
        this.f68646b = act;
        this.f68647c = wx80Var;
        this.f68648d = str;
    }

    /* JADX INFO: renamed from: a */
    public View m95589a(ViewGroup viewGroup) {
        boolean zM131712q1 = hmb.m131712q1();
        int iM186890d = t100.m186890d(8.0f);
        LinearLayout linearLayout = new LinearLayout(this.f68646b);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f68646b);
        textView.setText(this.f68646b.string(R$string.f27609t7));
        textView.setTextColor(Color.parseColor("#f2c669"));
        xdl0.m208383k(textView, CoreModule.f17544b.getDrawable(d3c0.f83943h3));
        textView.setCompoundDrawablePadding(t100.m186890d(10.0f));
        textView.setTextSize(18.0f);
        textView.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.addView(textView, layoutParams);
        int i = zM131712q1 ? iM186890d * 16 : iM186890d * 21;
        this.f68651g = (FrameLayout) this.f68646b.inflater().inflate(m6c0.f131508M2, viewGroup, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i);
        linearLayout.setTag(z4c0.f201477J0, this.f68651g);
        linearLayout.addView(this.f68651g, layoutParams2);
        this.f68652h = (FrameLayout) this.f68651g.findViewById(z4c0.f201562s);
        this.f68653i = (AutoVDraweeView) this.f68651g.findViewById(z4c0.f201534i);
        this.f68654j = (AutoVDraweeView) this.f68651g.findViewById(z4c0.f201528g);
        this.f68653i.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        VText vText = new VText(this.f68646b);
        this.f68645a = vText;
        vText.setId(z4c0.f201489P0);
        this.f68645a.setTextSize(this.f68649e);
        this.f68645a.setTextColor(this.f68650f);
        this.f68645a.setGravity(17);
        this.f68645a.setMaxLines(4);
        VText vText2 = this.f68645a;
        int i2 = t100.f167261j;
        vText2.setPadding(i2, 0, i2, 0);
        this.f68645a.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = t100.f167275x;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i3);
        if (!zM131712q1) {
            iM186890d = (int) (((double) iM186890d) * 1.5d);
        }
        layoutParams3.bottomMargin = iM186890d;
        layoutParams3.topMargin = 0;
        linearLayout.addView(this.f68645a, layoutParams3);
        int iM186890d2 = t100.m186890d(24.0f);
        xdl0.m208370d0(this.f68645a, iM186890d2);
        xdl0.m208372e0(this.f68645a, iM186890d2);
        if (ura.m195053e().m195057d().mo33659B8().get().isEmpty()) {
            C4732c c4732c = CoreModule.f17545c;
            User userM169430Pa = c4732c.f19639e0.m169430Pa(c4732c.f19663m0.f19394a0.m221515e().loaded.get(0).f19472id);
            this.f68654j.setImageUrl(userM169430Pa.m60124fp().url);
            this.f68645a.setText(viewGroup.getContext().getResources().getString(R$string.f27487j2, userM169430Pa.name));
        } else {
            User userM169430Pa2 = CoreModule.f17545c.f19639e0.m169430Pa(ura.m195053e().m195057d().mo33659B8().get());
            qib0.f154691G.m102336O(this.f68654j, userM169430Pa2.m60124fp().profileSmall().formatted(), 7, 20);
            boolean zIsFemale = userM169430Pa2.isFemale();
            VText vText3 = this.f68645a;
            if (zIsFemale) {
                vText3.setText(viewGroup.getContext().getResources().getString(R$string.f27590s, m95590b(userM169430Pa2.name)));
            } else {
                vText3.setText(viewGroup.getContext().getResources().getString(R$string.f27601t, m95590b(userM169430Pa2.name)));
            }
            textView.setText(this.f68646b.string(R$string.f27620u7));
        }
        layoutParams3.bottomMargin = 0;
        layoutParams3.height = -2;
        this.f68645a.setMinHeight(i3);
        return linearLayout;
    }

    /* JADX INFO: renamed from: b */
    public final String m95590b(String str) {
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
