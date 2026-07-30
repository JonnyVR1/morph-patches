package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.putong.common.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l.a;
import l.e6c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fk60 extends a<String> {

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f13071c;

    /* JADX INFO: renamed from: d */
    public final List<String> f13072d;

    public fk60(Context context, Set<String> set) {
        this.f13071c = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        this.f13072d = arrayList;
        arrayList.add("");
        arrayList.addAll(set);
        arrayList.add("");
        arrayList.add(context.getString(R.string.g1));
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getItemViewType(int i) {
        if (i == this.f13072d.size() - 1) {
            return 1;
        }
        return "".equals(this.f13072d.get(i)) ? 2 : 0;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public View m14488m(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return i != 2 ? this.f13071c.inflate(e6c0.L, viewGroup, false) : m14491t();
        }
        return this.f13071c.inflate(e6c0.K, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<String> m14489p() {
        return this.f13072d;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m14487j(View view, String str, int i, int i2) {
        if (i == 0) {
            ((TextView) view).setText(PermissionHelper.m10209a(str));
        } else if (i == 1) {
            ((TextView) view).setText(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public final View m14491t() {
        View view = new View(this.f13071c.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d(16.0f)));
        view.setBackgroundColor(268435456);
        return view;
    }
}
