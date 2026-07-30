package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.NewConversationItemView;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class byw implements iam<ayw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f79065a;

    /* JADX INFO: renamed from: b */
    public VList f79066b;

    /* JADX INFO: renamed from: c */
    public VLinear f79067c;

    /* JADX INFO: renamed from: d */
    public VImage f79068d;

    /* JADX INFO: renamed from: e */
    public VText f79069e;

    /* JADX INFO: renamed from: f */
    public final Act f79070f;

    /* JADX INFO: renamed from: g */
    public View f79071g;

    /* JADX INFO: renamed from: h */
    public C16139d f79072h;

    /* JADX INFO: renamed from: l.byw$a */
    public class C16136a implements AdapterView.OnItemClickListener {
        public C16136a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                ((ConversationItemView) view).f25675t.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.byw$b */
    public class C16137b implements AdapterView.OnItemLongClickListener {
        public C16137b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                return ((ConversationItemView) view).f25676u.call().booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.byw$c */
    public class ViewOnClickListenerC16138c implements View.OnClickListener {
        public ViewOnClickListenerC16138c() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m107096a(View view) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new th0.C20312a(byw.this.act()).m191148g(false).m191151j("确定要全部已读消息吗？").m191159r("确定").m191156o(new View.OnClickListener() { // from class: l.cyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CoreModule.f18264c.f20384f0.m34067oe();
                }
            }).m191147f("取消").m191144c(new View.OnClickListener() { // from class: l.dyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byw.ViewOnClickListenerC16138c.m107096a(view2);
                }
            }).m191142a().m191141g();
        }
    }

    public byw(Act act) {
        this.f79070f = act;
    }

    /* JADX INFO: renamed from: c */
    private void m107091c() {
        this.f79065a.setLeftIconAsBack(this.f79070f);
        if (gra.m131778z()) {
            this.f79065a.setLeftIconResource(dbc0.f87021gf);
        }
        this.f79065a.setTitle("消息");
        this.f79065a.setRightIconViews(new View[0]);
        View viewInflate = this.f79070f.getLayoutInflater().inflate(kec0.f125535N6, (ViewGroup) this.f79065a, false);
        this.f79071g = viewInflate;
        this.f79065a.setRightIconViews(viewInflate);
        bnl0.m105509E0(this.f79071g, new ViewOnClickListenerC16138c());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f79070f;
    }

    /* JADX INFO: renamed from: a */
    public View m107092a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eyw.m123271b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public Act act() {
        return this.f79070f;
    }

    /* JADX INFO: renamed from: d */
    public void m107094d(Bundle bundle) {
        m107091c();
        C16139d c16139d = new C16139d();
        this.f79072h = c16139d;
        this.f79066b.setAdapter((ListAdapter) c16139d);
        this.f79066b.setRecyclerListener(this.f79072h);
        this.f79066b.setNestedScrollingEnabled(true);
        this.f79066b.setOnItemClickListener(new C16136a());
        this.f79066b.setOnItemLongClickListener(new C16137b());
    }

    /* JADX INFO: renamed from: e */
    public void m107095e(List<Conversation> list) {
        boolean zM147479J = jyb.m147479J(list);
        VLinear vLinear = this.f79067c;
        if (zM147479J) {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f79066b, false);
            bnl0.m105524M(this.f79071g, false);
        } else {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f79066b, true);
            bnl0.m105524M(this.f79071g, true);
            this.f79072h.m107099s(list);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m107092a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l.byw$d */
    public class C16139d extends dq1<Conversation> implements u46 {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f79076c = Collections.EMPTY_LIST;

        public C16139d() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f79076c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f79076c.size()) {
                return this.f79076c.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: h */
        public int mo42530h() {
            return this.f79076c.size();
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo42531k() {
            return this.f79076c;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return ue6.m195664Z(byw.this.act(), viewGroup, false);
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: o */
        public int mo42533o() {
            return 0;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, Conversation conversation, int i, int i2) {
            ((NewConversationItemView) view).m42776h4(this, conversation, new a(), true, i2, null);
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: q */
        public void mo42534q() {
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: s */
        public void m107099s(List<Conversation> list) {
            this.f79076c = list;
            notifyDataSetChanged();
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: v */
        public C22421c<Boolean> mo42535v() {
            return C22421c.just(Boolean.TRUE);
        }

        /* JADX INFO: renamed from: l.byw$d$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ayw aywVar) {
    }
}
