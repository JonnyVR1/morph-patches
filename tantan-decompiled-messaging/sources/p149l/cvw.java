package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.NewConversationItemView;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class cvw implements s7m<bvw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f82691a;

    /* JADX INFO: renamed from: b */
    public VList f82692b;

    /* JADX INFO: renamed from: c */
    public VLinear f82693c;

    /* JADX INFO: renamed from: d */
    public VImage f82694d;

    /* JADX INFO: renamed from: e */
    public VText f82695e;

    /* JADX INFO: renamed from: f */
    public final Act f82696f;

    /* JADX INFO: renamed from: g */
    public View f82697g;

    /* JADX INFO: renamed from: h */
    public C16256d f82698h;

    /* JADX INFO: renamed from: l.cvw$a */
    public class C16253a implements AdapterView.OnItemClickListener {
        public C16253a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                ((ConversationItemView) view).f24933t.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.cvw$b */
    public class C16254b implements AdapterView.OnItemLongClickListener {
        public C16254b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                return ((ConversationItemView) view).f24934u.call().booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.cvw$c */
    public class ViewOnClickListenerC16255c implements View.OnClickListener {
        public ViewOnClickListenerC16255c() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m108963a(View view) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new xh0.C21150a(cvw.this.act()).m208728g(false).m208731j("确定要全部已读消息吗？").m208739r("确定").m208736o(new View.OnClickListener() { // from class: l.dvw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CoreModule.f17545c.f19642f0.m33064oe();
                }
            }).m208727f("取消").m208724c(new View.OnClickListener() { // from class: l.evw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cvw.ViewOnClickListenerC16255c.m108963a(view2);
                }
            }).m208722a().m208721g();
        }
    }

    public cvw(Act act) {
        this.f82696f = act;
    }

    /* JADX INFO: renamed from: c */
    private void m108958c() {
        this.f82691a.setLeftIconAsBack(this.f82696f);
        if (upa.m194847z()) {
            this.f82691a.setLeftIconResource(x2c0.f190553se);
        }
        this.f82691a.setTitle("消息");
        this.f82691a.setRightIconViews(new View[0]);
        View viewInflate = this.f82696f.getLayoutInflater().inflate(f6c0.f95465M6, (ViewGroup) this.f82691a, false);
        this.f82697g = viewInflate;
        this.f82691a.setRightIconViews(viewInflate);
        xdl0.m208329E0(this.f82697g, new ViewOnClickListenerC16255c());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82696f;
    }

    /* JADX INFO: renamed from: a */
    public View m108959a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fvw.m123372b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f82696f;
    }

    /* JADX INFO: renamed from: d */
    public void m108961d(Bundle bundle) {
        m108958c();
        C16256d c16256d = new C16256d();
        this.f82698h = c16256d;
        this.f82692b.setAdapter((ListAdapter) c16256d);
        this.f82692b.setRecyclerListener(this.f82698h);
        this.f82692b.setNestedScrollingEnabled(true);
        this.f82692b.setOnItemClickListener(new C16253a());
        this.f82692b.setOnItemLongClickListener(new C16254b());
    }

    /* JADX INFO: renamed from: e */
    public void m108962e(List<Conversation> list) {
        boolean zM200296J = vwb.m200296J(list);
        VLinear vLinear = this.f82693c;
        if (zM200296J) {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f82692b, false);
            xdl0.m208344M(this.f82697g, false);
        } else {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f82692b, true);
            xdl0.m208344M(this.f82697g, true);
            this.f82698h.m108966s(list);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m108959a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l.cvw$d */
    public class C16256d extends wp1<Conversation> implements p36 {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f82702c = Collections.EMPTY_LIST;

        public C16256d() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f82702c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f82702c.size()) {
                return this.f82702c.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: h */
        public int mo41519h() {
            return this.f82702c.size();
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo41520k() {
            return this.f82702c;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return rd6.m178870Z(cvw.this.act(), viewGroup, false);
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: o */
        public int mo41522o() {
            return 0;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, Conversation conversation, int i, int i2) {
            ((NewConversationItemView) view).m41765h4(this, conversation, new a(), true, i2, null);
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: q */
        public void mo41523q() {
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: s */
        public void m108966s(List<Conversation> list) {
            this.f82702c = list;
            notifyDataSetChanged();
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: v */
        public C22306c<Boolean> mo41524v() {
            return C22306c.just(Boolean.TRUE);
        }

        /* JADX INFO: renamed from: l.cvw$d$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
            }
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bvw bvwVar) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
