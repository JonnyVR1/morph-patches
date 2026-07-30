package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import l.t100;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o41 {

    /* JADX INFO: renamed from: a */
    public View f10996a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f10997b;

    /* JADX INFO: renamed from: c */
    public TextView f10998c;

    /* JADX INFO: renamed from: d */
    public final int f10999d = xdl0.y0() / 4;

    public o41(Act act) {
        this.f10996a = m12440a(act);
    }

    /* JADX INFO: renamed from: a */
    public final View m12440a(Act act) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f10999d, -1));
        linearLayout.setGravity(17);
        View vDraweeView = new VDraweeView(act);
        int i = t100.q;
        vDraweeView.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i));
        this.f10997b = vDraweeView;
        TextView textView = new TextView(act);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = t100.e;
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextSize(15.0f);
        this.f10998c = textView;
        linearLayout.addView(vDraweeView);
        linearLayout.addView(textView);
        return linearLayout;
    }
}
