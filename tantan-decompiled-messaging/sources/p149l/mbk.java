package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.group.p056at.GroupAtItemViewContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mbk extends dac0<nbk> {

    /* JADX INFO: renamed from: c */
    public ArrayList<nbk> f133027c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public Context f133028d;

    /* JADX INFO: renamed from: e */
    public gbk f133029e;

    public mbk(Context context, gbk gbkVar) {
        this.f133028d = context;
        this.f133029e = gbkVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f133027c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f133028d).inflate(l6c0.f126453d0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, nbk nbkVar, int i, int i2) {
        GroupAtItemViewContent groupAtItemViewContent = (GroupAtItemViewContent) view;
        groupAtItemViewContent.m49153d(nbkVar, i);
        groupAtItemViewContent.setItemClickListener(this.f133029e);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public nbk getItem(int i) {
        return this.f133027c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m153894G(List<nbk> list) {
        this.f133027c.clear();
        this.f133027c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f133027c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f133027c.get(i).f138042e;
    }
}
