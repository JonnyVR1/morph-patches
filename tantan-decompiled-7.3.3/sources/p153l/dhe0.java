package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import p151v.VList;

/* JADX INFO: loaded from: classes4.dex */
public class dhe0 implements iam<ihe0> {

    /* JADX INFO: renamed from: a */
    public VList f88485a;

    /* JADX INFO: renamed from: b */
    public Act f88486b;

    /* JADX INFO: renamed from: c */
    public ihe0 f88487c;

    /* JADX INFO: renamed from: d */
    public C16534a f88488d;

    /* JADX INFO: renamed from: l.dhe0$a */
    public class C16534a extends dq1<Conversation> {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f88489c = Collections.EMPTY_LIST;

        public C16534a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f88489c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f88489c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return ue6.m195665a(dhe0.this.f88486b, viewGroup);
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, Conversation conversation, int i, int i2) {
            ((NewConversationItemView) view).m42787s4(conversation, this);
        }

        /* JADX INFO: renamed from: s */
        public void m115790s(List<Conversation> list) {
            this.f88489c = list;
            notifyDataSetChanged();
        }
    }

    public dhe0(Act act) {
        this.f88486b = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f88486b;
    }

    /* JADX INFO: renamed from: b */
    public View m115785b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ehe0.m120851b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ihe0 ihe0Var) {
        this.f88487c = ihe0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m115787d(List<Conversation> list) {
        this.f88488d.m115790s(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m115785b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m115788r() {
        if (NullChecker.m82486a(this.f88486b)) {
            this.f88486b.setTitle(R$string.f18757Pa);
        }
        this.f88488d = new C16534a();
        this.f88485a.setCrashLogFlag("GreetListActModel");
        this.f88485a.setAdapter((ListAdapter) this.f88488d);
        this.f88485a.setDividerHeight(qa00.m175859d(1.0f));
        this.f88485a.setDivider(act().getDrawable(dbc0.f87397ru));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
