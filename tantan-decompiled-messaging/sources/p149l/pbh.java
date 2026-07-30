package p149l;

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
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class pbh extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public Context f148080a;

    /* JADX INFO: renamed from: c */
    public int f148082c;

    /* JADX INFO: renamed from: e */
    public View f148084e;

    /* JADX INFO: renamed from: b */
    public List<String> f148081b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<View> f148083d = new ArrayList();

    public pbh(Context context, int i) {
        this.f148080a = context;
        this.f148082c = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m168204a() {
        return this.f148081b.size() > 3;
    }

    /* JADX INFO: renamed from: b */
    public final View m168205b(String str) {
        VText vText = new VText(this.f148080a);
        vText.setTextColor(Color.parseColor("#ffffff"));
        vText.setTextSize(10.0f);
        vText.setGravity(16);
        vText.setPadding(t100.m186890d(8.0f), 0, t100.m186890d(8.0f), 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, t100.m186890d(19.0f));
        marginLayoutParams.bottomMargin = t100.m186890d(2.0f);
        vText.setLayoutParams(marginLayoutParams);
        vText.setBackgroundResource(f3c0.f94658x1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setText(str);
        return vText;
    }

    /* JADX INFO: renamed from: c */
    public final View m168206c(int i) {
        View view;
        m168210g();
        if (this.f148083d.size() > i) {
            View view2 = this.f148083d.get(i);
            this.f148084e = view2;
            view = view2;
        } else {
            LinearLayout linearLayout = new LinearLayout(this.f148080a);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(xdl0.m208412y0() - t100.m186890d(130.0f), -2));
            int size = this.f148081b.size() - 1;
            for (int i2 = 0; i2 < this.f148082c; i2++) {
                int iM168207d = m168207d(i, size, i2);
                if (size >= iM168207d && iM168207d >= 0) {
                    linearLayout.addView(m168205b(this.f148081b.get(iM168207d)));
                }
            }
            this.f148084e = linearLayout;
            this.f148083d.add(linearLayout);
            view = linearLayout;
        }
        m168209f(i, (ViewGroup) view);
        return view;
    }

    /* JADX INFO: renamed from: d */
    public final int m168207d(int i, int i2, int i3) {
        int i4 = i + i3;
        if (i4 > i2 && i2 != 0 && m168204a()) {
            i4 %= i2 + 1;
        }
        return Math.max(i4, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m168208e(List<String> list) {
        this.f148081b = list;
        this.f148083d.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m168209f(int i, ViewGroup viewGroup) {
        if (i == 0 && this.f148083d.size() == 1) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (i2 != viewGroup.getChildCount() - 1) {
                View childAt = viewGroup.getChildAt(i2);
                if (NullChecker.m81303a(childAt)) {
                    childAt.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m168210g() {
        if (NullChecker.m81303a(this.f148084e)) {
            ViewGroup viewGroup = (ViewGroup) this.f148084e;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (NullChecker.m81303a(childAt)) {
                    childAt.setVisibility(0);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f148081b.size();
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
        return m168206c(i);
    }
}
