package p153l;

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
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class edh extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public Context f93513a;

    /* JADX INFO: renamed from: c */
    public int f93515c;

    /* JADX INFO: renamed from: e */
    public View f93517e;

    /* JADX INFO: renamed from: b */
    public List<String> f93514b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<View> f93516d = new ArrayList();

    public edh(Context context, int i) {
        this.f93513a = context;
        this.f93515c = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m120452a() {
        return this.f93514b.size() > 3;
    }

    /* JADX INFO: renamed from: b */
    public final View m120453b(String str) {
        VText vText = new VText(this.f93513a);
        vText.setTextColor(Color.parseColor("#ffffff"));
        vText.setTextSize(10.0f);
        vText.setGravity(16);
        vText.setPadding(qa00.m175859d(8.0f), 0, qa00.m175859d(8.0f), 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, qa00.m175859d(19.0f));
        marginLayoutParams.bottomMargin = qa00.m175859d(2.0f);
        vText.setLayoutParams(marginLayoutParams);
        vText.setBackgroundResource(lbc0.f131176x1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setText(str);
        return vText;
    }

    /* JADX INFO: renamed from: c */
    public final View m120454c(int i) {
        View view;
        m120458g();
        if (this.f93516d.size() > i) {
            View view2 = this.f93516d.get(i);
            this.f93517e = view2;
            view = view2;
        } else {
            LinearLayout linearLayout = new LinearLayout(this.f93513a);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(bnl0.m105592y0() - qa00.m175859d(130.0f), -2));
            int size = this.f93514b.size() - 1;
            for (int i2 = 0; i2 < this.f93515c; i2++) {
                int iM120455d = m120455d(i, size, i2);
                if (size >= iM120455d && iM120455d >= 0) {
                    linearLayout.addView(m120453b(this.f93514b.get(iM120455d)));
                }
            }
            this.f93517e = linearLayout;
            this.f93516d.add(linearLayout);
            view = linearLayout;
        }
        m120457f(i, (ViewGroup) view);
        return view;
    }

    /* JADX INFO: renamed from: d */
    public final int m120455d(int i, int i2, int i3) {
        int i4 = i + i3;
        if (i4 > i2 && i2 != 0 && m120452a()) {
            i4 %= i2 + 1;
        }
        return Math.max(i4, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m120456e(List<String> list) {
        this.f93514b = list;
        this.f93516d.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m120457f(int i, ViewGroup viewGroup) {
        if (i == 0 && this.f93516d.size() == 1) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (i2 != viewGroup.getChildCount() - 1) {
                View childAt = viewGroup.getChildAt(i2);
                if (NullChecker.m82486a(childAt)) {
                    childAt.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m120458g() {
        if (NullChecker.m82486a(this.f93517e)) {
            ViewGroup viewGroup = (ViewGroup) this.f93517e;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (NullChecker.m82486a(childAt)) {
                    childAt.setVisibility(0);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f93514b.size();
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
        return m120454c(i);
    }
}
