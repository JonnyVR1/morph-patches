package p009l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import java.util.Collections;
import java.util.List;
import l.d30;
import l.f6c0;
import l.fvw;
import l.s7m;
import l.upa;
import l.vwb;
import l.wp1;
import l.x2c0;
import l.xdl0;
import l.xh0;
import rx.c;
import v.VImage;
import v.VLinear;
import v.VList;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cvw implements s7m<bvw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f10787a;

    /* JADX INFO: renamed from: b */
    public VList f10788b;

    /* JADX INFO: renamed from: c */
    public VLinear f10789c;

    /* JADX INFO: renamed from: d */
    public VImage f10790d;

    /* JADX INFO: renamed from: e */
    public VText f10791e;

    /* JADX INFO: renamed from: f */
    public final Act f10792f;

    /* JADX INFO: renamed from: g */
    public View f10793g;

    /* JADX INFO: renamed from: h */
    public C0833d f10794h;

    /* JADX INFO: renamed from: l.cvw$a */
    public class C0830a implements AdapterView.OnItemClickListener {
        public C0830a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                ((ConversationItemView) view).f3711t.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.cvw$b */
    public class C0831b implements AdapterView.OnItemLongClickListener {
        public C0831b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                return ((Boolean) ((ConversationItemView) view).f3712u.call()).booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.cvw$c */
    public class ViewOnClickListenerC0832c implements View.OnClickListener {
        public ViewOnClickListenerC0832c() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m12862a(View view) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new xh0.a(cvw.this.act()).g(false).j("确定要全部已读消息吗？").r("确定").o(new View.OnClickListener() { // from class: l.dvw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CoreModule.c.f0.oe();
                }
            }).f("取消").c(new View.OnClickListener() { // from class: l.evw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cvw.ViewOnClickListenerC0832c.m12862a(view2);
                }
            }).a().g();
        }
    }

    public cvw(Act act) {
        this.f10792f = act;
    }

    /* JADX INFO: renamed from: c */
    private void m12855c() {
        this.f10787a.setLeftIconAsBack(this.f10792f);
        if (upa.z()) {
            this.f10787a.setLeftIconResource(x2c0.se);
        }
        this.f10787a.setTitle("消息");
        this.f10787a.setRightIconViews(new View[0]);
        View viewInflate = this.f10792f.getLayoutInflater().inflate(f6c0.M6, (ViewGroup) this.f10787a, false);
        this.f10793g = viewInflate;
        this.f10787a.setRightIconViews(new View[]{viewInflate});
        xdl0.E0(this.f10793g, new ViewOnClickListenerC0832c());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12856C0() {
        return this.f10792f;
    }

    /* JADX INFO: renamed from: a */
    public View m12857a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fvw.b(this, layoutInflater, viewGroup);
    }

    public Act act() {
        return this.f10792f;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.ListAdapter, l.cvw$d] */
    /* JADX INFO: renamed from: d */
    public void m12859d(Bundle bundle) {
        m12855c();
        ?? c0833d = new C0833d();
        this.f10794h = c0833d;
        this.f10788b.setAdapter((ListAdapter) c0833d);
        this.f10788b.setRecyclerListener(this.f10794h);
        this.f10788b.setNestedScrollingEnabled(true);
        this.f10788b.setOnItemClickListener(new C0830a());
        this.f10788b.setOnItemLongClickListener(new C0831b());
    }

    /* JADX INFO: renamed from: e */
    public void m12860e(List<Conversation> list) {
        boolean zJ = vwb.J(list);
        VLinear vLinear = this.f10789c;
        if (zJ) {
            xdl0.M(vLinear, true);
            xdl0.M(this.f10788b, false);
            xdl0.M(this.f10793g, false);
        } else {
            xdl0.M(vLinear, false);
            xdl0.M(this.f10788b, true);
            xdl0.M(this.f10793g, true);
            this.f10794h.m12867s(list);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12857a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l.cvw$d */
    public class C0833d extends wp1<Conversation> implements p36 {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f10798c = Collections.EMPTY_LIST;

        public C0833d() {
        }

        public int getCount() {
            return this.f10798c.size();
        }

        public Object getItem(int i) {
            if (i < this.f10798c.size()) {
                return this.f10798c.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return i;
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: h */
        public int mo5626h() {
            return this.f10798c.size();
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo5628k() {
            return this.f10798c;
        }

        /* JADX INFO: renamed from: m */
        public View m12865m(ViewGroup viewGroup, int i) {
            return rd6.m21511Z(cvw.this.act(), viewGroup, false);
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: o */
        public int mo5631o() {
            return 0;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void m12864j(View view, Conversation conversation, int i, int i2) {
            ((NewConversationItemView) view).m5889h4(this, conversation, new a(), true, i2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p009l.p36
        /* JADX INFO: renamed from: q */
        public void mo5632q() {
            notifyDataSetChanged();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: s */
        public void m12867s(List<Conversation> list) {
            this.f10798c = list;
            notifyDataSetChanged();
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: v */
        public c<Boolean> mo5633v() {
            return c.just(Boolean.TRUE);
        }

        /* JADX INFO: renamed from: l.cvw$d$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m12861i1(bvw bvwVar) {
    }

    public void destroy() {
    }
}
