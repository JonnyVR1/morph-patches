package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import l.d9e0;
import l.rd6;
import l.s7m;
import l.t100;
import l.x2c0;
import l.z8e0;
import p028v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class y8e0 implements s7m<d9e0> {

    /* JADX INFO: renamed from: a */
    public VList f8931a;

    /* JADX INFO: renamed from: b */
    public Act f8932b;

    /* JADX INFO: renamed from: c */
    public d9e0 f8933c;

    /* JADX INFO: renamed from: d */
    public C0654a f8934d;

    /* JADX INFO: renamed from: l.y8e0$a */
    public class C0654a extends wp1<Conversation> {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f8935c = Collections.EMPTY_LIST;

        public C0654a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f8935c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f8935c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            return rd6.a(y8e0.this.f8932b, viewGroup);
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo1005j(View view, Conversation conversation, int i, int i2) {
            ((NewConversationItemView) view).s4(conversation, this);
        }

        /* JADX INFO: renamed from: s */
        public void m8932s(List<Conversation> list) {
            this.f8935c = list;
            notifyDataSetChanged();
        }
    }

    public y8e0(Act act) {
        this.f8932b = act;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8925C0() {
        return this.f8932b;
    }

    /* JADX INFO: renamed from: b */
    public View m8926b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z8e0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m8929i1(d9e0 d9e0Var) {
        this.f8933c = d9e0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m8928d(List<Conversation> list) {
        this.f8934d.m8932s(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8926b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m8930r() {
        if (NullChecker.a(this.f8932b)) {
            this.f8932b.setTitle(R.string.Ea);
        }
        this.f8934d = new C0654a();
        this.f8931a.setCrashLogFlag("GreetListActModel");
        this.f8931a.setAdapter((ListAdapter) this.f8934d);
        this.f8931a.setDividerHeight(t100.d(1.0f));
        this.f8931a.setDivider(act().getDrawable(x2c0.Dt));
    }

    public void destroy() {
    }
}
