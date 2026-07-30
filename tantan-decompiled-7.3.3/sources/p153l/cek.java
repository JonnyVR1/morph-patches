package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.group.p061at.GroupAtItemViewContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class cek extends jic0<dek> {

    /* JADX INFO: renamed from: c */
    public ArrayList<dek> f81365c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public Context f81366d;

    /* JADX INFO: renamed from: e */
    public wdk f81367e;

    public cek(Context context, wdk wdkVar) {
        this.f81366d = context;
        this.f81367e = wdkVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f81365c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f81366d).inflate(qec0.f157009d0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, dek dekVar, int i, int i2) {
        GroupAtItemViewContent groupAtItemViewContent = (GroupAtItemViewContent) view;
        groupAtItemViewContent.m50336d(dekVar, i);
        groupAtItemViewContent.setItemClickListener(this.f81367e);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public dek getItem(int i) {
        return this.f81365c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m109377G(List<dek> list) {
        this.f81365c.clear();
        this.f81365c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81365c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f81365c.get(i).f88040e;
    }
}
