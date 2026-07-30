package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class fk60 extends AbstractC15503a<String> {

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f98040c;

    /* JADX INFO: renamed from: d */
    public final List<String> f98041d;

    public fk60(Context context, Set<String> set) {
        this.f98040c = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        this.f98041d = arrayList;
        arrayList.add("");
        arrayList.addAll(set);
        arrayList.add("");
        arrayList.add(context.getString(R$string.f17437g1));
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i == this.f98041d.size() - 1) {
            return 1;
        }
        return "".equals(this.f98041d.get(i)) ? 2 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return i != 2 ? this.f98040c.inflate(e6c0.f89530L, viewGroup, false) : m121844t();
        }
        return this.f98040c.inflate(e6c0.f89529K, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<String> mo20404p() {
        return this.f98041d;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, String str, int i, int i2) {
        if (i == 0) {
            ((TextView) view).setText(PermissionHelper.m79880a(str));
        } else if (i == 1) {
            ((TextView) view).setText(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public final View m121844t() {
        View view = new View(this.f98040c.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.m186890d(16.0f)));
        view.setBackgroundColor(268435456);
        return view;
    }
}
