package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class o41 {

    /* JADX INFO: renamed from: a */
    public View f141728a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f141729b;

    /* JADX INFO: renamed from: c */
    public TextView f141730c;

    /* JADX INFO: renamed from: d */
    public final int f141731d = xdl0.m208412y0() / 4;

    public o41(Act act) {
        this.f141728a = m162514a(act);
    }

    /* JADX INFO: renamed from: a */
    public final View m162514a(Act act) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f141731d, -1));
        linearLayout.setGravity(17);
        VDraweeView vDraweeView = new VDraweeView(act);
        int i = t100.f167268q;
        vDraweeView.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i));
        this.f141729b = vDraweeView;
        TextView textView = new TextView(act);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = t100.f167256e;
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextSize(15.0f);
        this.f141730c = textView;
        linearLayout.addView(vDraweeView);
        linearLayout.addView(textView);
        return linearLayout;
    }
}
