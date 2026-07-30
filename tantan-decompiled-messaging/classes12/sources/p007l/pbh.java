package p007l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pbh extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public Context f11781a;

    /* JADX INFO: renamed from: c */
    public int f11783c;

    /* JADX INFO: renamed from: e */
    public View f11785e;

    /* JADX INFO: renamed from: b */
    public List<String> f11782b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<View> f11784d = new ArrayList();

    public pbh(Context context, int i) {
        this.f11781a = context;
        this.f11783c = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13019a() {
        return this.f11782b.size() > 3;
    }

    /* JADX INFO: renamed from: b */
    public final View m13020b(String str) {
        VText vText = new VText(this.f11781a);
        vText.setTextColor(Color.parseColor("#ffffff"));
        vText.setTextSize(10.0f);
        vText.setGravity(16);
        vText.setPadding(t100.d(8.0f), 0, t100.d(8.0f), 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, t100.d(19.0f));
        marginLayoutParams.bottomMargin = t100.d(2.0f);
        vText.setLayoutParams(marginLayoutParams);
        vText.setBackgroundResource(f3c0.f7941x1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setText(str);
        return vText;
    }

    /* JADX INFO: renamed from: c */
    public final View m13021c(int i) {
        View view;
        m13025g();
        if (this.f11784d.size() > i) {
            View view2 = this.f11784d.get(i);
            this.f11785e = view2;
            view = view2;
        } else {
            LinearLayout linearLayout = new LinearLayout(this.f11781a);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(xdl0.y0() - t100.d(130.0f), -2));
            int size = this.f11782b.size() - 1;
            for (int i2 = 0; i2 < this.f11783c; i2++) {
                int iM13022d = m13022d(i, size, i2);
                if (size >= iM13022d && iM13022d >= 0) {
                    linearLayout.addView(m13020b(this.f11782b.get(iM13022d)));
                }
            }
            this.f11785e = linearLayout;
            this.f11784d.add(linearLayout);
            view = linearLayout;
        }
        m13024f(i, (ViewGroup) view);
        return view;
    }

    /* JADX INFO: renamed from: d */
    public final int m13022d(int i, int i2, int i3) {
        int i4 = i + i3;
        if (i4 > i2 && i2 != 0 && m13019a()) {
            i4 %= i2 + 1;
        }
        return Math.max(i4, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m13023e(List<String> list) {
        this.f11782b = list;
        this.f11784d.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m13024f(int i, ViewGroup viewGroup) {
        if (i == 0 && this.f11784d.size() == 1) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (i2 != viewGroup.getChildCount() - 1) {
                View childAt = viewGroup.getChildAt(i2);
                if (NullChecker.a(childAt)) {
                    childAt.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m13025g() {
        if (NullChecker.a(this.f11785e)) {
            ViewGroup viewGroup = (ViewGroup) this.f11785e;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (NullChecker.a(childAt)) {
                    childAt.setVisibility(0);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11782b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m13021c(i);
    }
}
