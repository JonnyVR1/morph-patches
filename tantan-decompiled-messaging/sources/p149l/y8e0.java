package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import p147v.VList;

/* JADX INFO: loaded from: classes3.dex */
public class y8e0 implements s7m<d9e0> {

    /* JADX INFO: renamed from: a */
    public VList f196815a;

    /* JADX INFO: renamed from: b */
    public Act f196816b;

    /* JADX INFO: renamed from: c */
    public d9e0 f196817c;

    /* JADX INFO: renamed from: d */
    public C21333a f196818d;

    /* JADX INFO: renamed from: l.y8e0$a */
    public class C21333a extends wp1<Conversation> {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f196819c = Collections.EMPTY_LIST;

        public C21333a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f196819c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f196819c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return rd6.m178871a(y8e0.this.f196816b, viewGroup);
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, Conversation conversation, int i, int i2) {
            ((NewConversationItemView) view).m41776s4(conversation, this);
        }

        /* JADX INFO: renamed from: s */
        public void m213370s(List<Conversation> list) {
            this.f196819c = list;
            notifyDataSetChanged();
        }
    }

    public y8e0(Act act) {
        this.f196816b = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f196816b;
    }

    /* JADX INFO: renamed from: b */
    public View m213365b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z8e0.m217595b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d9e0 d9e0Var) {
        this.f196817c = d9e0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m213367d(List<Conversation> list) {
        this.f196818d.m213370s(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m213365b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m213368r() {
        if (NullChecker.m81303a(this.f196816b)) {
            this.f196816b.setTitle(R$string.f17697Ea);
        }
        this.f196818d = new C21333a();
        this.f196815a.setCrashLogFlag("GreetListActModel");
        this.f196815a.setAdapter((ListAdapter) this.f196818d);
        this.f196815a.setDividerHeight(t100.m186890d(1.0f));
        this.f196815a.setDivider(act().getDrawable(x2c0.f189279Dt));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
