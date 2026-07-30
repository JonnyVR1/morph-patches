package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ij0 extends dac0<Conversation> {

    /* JADX INFO: renamed from: c */
    public List<Conversation> f113480c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f113481d = 0;

    /* JADX INFO: renamed from: e */
    public Act f113482e;

    public ij0(Act act) {
        this.f113482e = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f113480c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f113482e.inflater().inflate(f6c0.f95346F, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Conversation conversation, int i, int i2) {
        if (view instanceof gj0) {
            ((gj0) view).mo40539a(this, conversation, i2, false);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return this.f113480c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m136502G(List<Conversation> list) {
        this.f113480c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f113481d;
    }
}
