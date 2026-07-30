package p003l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.messages.group.p002at.GroupAtItemViewContent;
import java.util.ArrayList;
import java.util.List;
import l.l6c0;
import l.o7r;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mbk extends dac0<nbk> {

    /* JADX INFO: renamed from: c */
    public ArrayList<nbk> f5572c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public Context f5573d;

    /* JADX INFO: renamed from: e */
    public gbk f5574e;

    public mbk(Context context, gbk gbkVar) {
        this.f5573d = context;
        this.f5574e = gbkVar;
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: C */
    public int mo203C() {
        return this.f5572c.size();
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: D */
    public View mo204D(ViewGroup viewGroup, int i) {
        return o7r.a(this.f5573d).inflate(l6c0.d0, viewGroup, false);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo202A(View view, nbk nbkVar, int i, int i2) {
        GroupAtItemViewContent groupAtItemViewContent = (GroupAtItemViewContent) view;
        groupAtItemViewContent.m2270d(nbkVar, i);
        groupAtItemViewContent.setItemClickListener(this.f5574e);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public nbk getItem(int i) {
        return this.f5572c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m6329G(List<nbk> list) {
        this.f5572c.clear();
        this.f5572c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // p003l.dac0
    public int getItemCount() {
        return this.f5572c.size();
    }

    public int getItemViewType(int i) {
        return this.f5572c.get(i).f5862e;
    }
}
