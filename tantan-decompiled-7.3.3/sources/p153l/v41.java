package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class v41 {

    /* JADX INFO: renamed from: a */
    public View f182324a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f182325b;

    /* JADX INFO: renamed from: c */
    public TextView f182326c;

    /* JADX INFO: renamed from: d */
    public final int f182327d = bnl0.m105592y0() / 4;

    public v41(Act act) {
        this.f182324a = m199661a(act);
    }

    /* JADX INFO: renamed from: a */
    public final View m199661a(Act act) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f182327d, -1));
        linearLayout.setGravity(17);
        VDraweeView vDraweeView = new VDraweeView(act);
        int i = qa00.f156330q;
        vDraweeView.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i));
        this.f182325b = vDraweeView;
        TextView textView = new TextView(act);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = qa00.f156318e;
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextSize(15.0f);
        this.f182326c = textView;
        linearLayout.addView(vDraweeView);
        linearLayout.addView(textView);
        return linearLayout;
    }
}
