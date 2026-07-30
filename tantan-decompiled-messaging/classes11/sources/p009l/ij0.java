package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ij0 extends dac0<Conversation> {

    /* JADX INFO: renamed from: c */
    public List<Conversation> f14656c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f14657d = 0;

    /* JADX INFO: renamed from: e */
    public Act f14658e;

    public ij0(Act act) {
        this.f14658e = act;
    }

    /* JADX INFO: renamed from: C */
    public int m16578C() {
        return this.f14656c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16579D(ViewGroup viewGroup, int i) {
        return this.f14658e.inflater().inflate(f6c0.F, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m16577A(View view, Conversation conversation, int i, int i2) {
        if (view instanceof gj0) {
            ((gj0) view).mo4632a(this, conversation, i2, false);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return this.f14656c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m16582G(List<Conversation> list) {
        this.f14656c = list;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return this.f14657d;
    }
}
