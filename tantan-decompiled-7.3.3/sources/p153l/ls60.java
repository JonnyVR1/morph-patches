package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ls60 extends AbstractC15610a<String> {

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f133405c;

    /* JADX INFO: renamed from: d */
    public final List<String> f133406d;

    public ls60(Context context, Set<String> set) {
        this.f133405c = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        this.f133406d = arrayList;
        arrayList.add("");
        arrayList.addAll(set);
        arrayList.add("");
        arrayList.add(context.getString(R$string.f18156g1));
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i == this.f133406d.size() - 1) {
            return 1;
        }
        return "".equals(this.f133406d.get(i)) ? 2 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return i != 2 ? this.f133405c.inflate(jec0.f120443L, viewGroup, false) : m155683t();
        }
        return this.f133405c.inflate(jec0.f120442K, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<String> mo21403p() {
        return this.f133406d;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, String str, int i, int i2) {
        if (i == 0) {
            ((TextView) view).setText(PermissionHelper.m81063a(str));
        } else if (i == 1) {
            ((TextView) view).setText(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public final View m155683t() {
        View view = new View(this.f133405c.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, qa00.m175859d(16.0f)));
        view.setBackgroundColor(SQLiteDatabase.CREATE_IF_NECESSARY);
        return view;
    }
}
