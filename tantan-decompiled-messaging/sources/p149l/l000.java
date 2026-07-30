package p149l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.wrap.MessageRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l000 extends p000 implements w1m {

    /* JADX INFO: renamed from: k */
    public o000 f125437k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f125438l;

    /* JADX INFO: renamed from: m */
    public List<C18122b> f125439m;

    /* JADX INFO: renamed from: n */
    public List<C18122b> f125440n;

    /* JADX INFO: renamed from: o */
    public SparseArray<C18122b> f125441o;

    /* JADX INFO: renamed from: p */
    public int f125442p;

    /* JADX INFO: renamed from: q */
    public boolean f125443q;

    /* JADX INFO: renamed from: r */
    public int f125444r;

    /* JADX INFO: renamed from: s */
    public C18121a f125445s;

    /* JADX INFO: renamed from: l.l000$a */
    public class C18121a {

        /* JADX INFO: renamed from: a */
        public long f125446a;

        /* JADX INFO: renamed from: b */
        public int f125447b;

        /* JADX INFO: renamed from: c */
        public int f125448c;

        /* JADX INFO: renamed from: d */
        public boolean f125449d;

        public C18121a() {
            this.f125446a = -1L;
            this.f125447b = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m147990a() {
            this.f125446a = -1L;
            this.f125447b = -1;
            this.f125448c = 0;
            this.f125449d = false;
        }
    }

    /* JADX INFO: renamed from: l.l000$b */
    public class C18122b {

        /* JADX INFO: renamed from: a */
        public int f125451a;

        /* JADX INFO: renamed from: b */
        public View f125452b;

        /* JADX INFO: renamed from: c */
        public Message f125453c;

        public C18122b(int i, View view) {
            this.f125451a = i;
            this.f125452b = view;
            Message messageNew_ = Message.new_();
            this.f125453c = messageNew_;
            messageNew_._id = i > 0 ? -i : i;
            messageNew_.createdTime = -1.0d;
        }
    }

    public l000(MessageRecyclerView messageRecyclerView, o000 o000Var) {
        super(messageRecyclerView);
        this.f125439m = new ArrayList();
        this.f125440n = new ArrayList();
        this.f125441o = new SparseArray<>();
        this.f125442p = 0;
        this.f125443q = false;
        this.f125444r = 0;
        this.f125437k = o000Var;
        this.f125438l = (LinearLayoutManager) messageRecyclerView.getLayoutManager();
    }

    /* JADX INFO: renamed from: h0 */
    private boolean m147965h0() {
        if (NullChecker.m81303a(this.f125437k)) {
            return this.f125437k.m190861f();
        }
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    private void m147966i0(View view, List<C18122b> list) {
        if (view == null) {
            return;
        }
        if (!vwb.m200296J(list)) {
            Iterator<C18122b> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f125452b == view) {
                    it.remove();
                    break;
                }
            }
        }
        int size = this.f125441o.size();
        for (int i = 0; i < size; i++) {
            C18122b c18122bValueAt = this.f125441o.valueAt(i);
            if (c18122bValueAt != null && c18122bValueAt.f125452b == view) {
                this.f125441o.removeAt(i);
                return;
            }
        }
    }

    @Override // p149l.luy
    /* JADX INFO: renamed from: C */
    public int mo147968C() {
        return m147977c0() + m147978d0() + m147980f0();
    }

    @Override // p149l.luy
    /* JADX INFO: renamed from: E */
    public final View mo147970E(ViewGroup viewGroup, int i) {
        return i >= 50000 ? this.f125441o.get(i).f125452b : this.f125437k.mo139122w(viewGroup, i);
    }

    @Override // p149l.luy
    /* JADX INFO: renamed from: F */
    public void mo147971F(int i) {
        if (i < m147978d0() || i >= m147978d0() + m147980f0()) {
            return;
        }
        this.f125437k.mo139114e(i - m147978d0());
    }

    @Override // p149l.p000
    /* JADX INFO: renamed from: V */
    public final Message mo147972V(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        if (i < m147978d0()) {
            return this.f125439m.get(i).f125453c;
        }
        return i >= m147978d0() + m147980f0() ? this.f125440n.get((i - m147978d0()) - m147980f0()).f125453c : mo147969D(i);
    }

    @Override // p149l.luy
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void mo147967A(View view, Message message, int i, int i2) {
        if (i >= 51000 || i >= 50000) {
            return;
        }
        this.f125437k.mo139108a(view, message, i, i2 - m147978d0());
    }

    /* JADX INFO: renamed from: Z */
    public final C18121a m147974Z() {
        C18121a c18121a = this.f125445s;
        if (c18121a == null) {
            this.f125445s = new C18121a();
        } else {
            c18121a.m147990a();
        }
        int childCount = this.f146524c.getChildCount();
        if (childCount == 0 || childCount == m147978d0()) {
            C18121a c18121a2 = this.f125445s;
            c18121a2.f125449d = true;
            return c18121a2;
        }
        int lastVisiblePosition = this.f146524c.getLastVisiblePosition();
        int firstVisiblePosition = this.f146524c.getFirstVisiblePosition();
        this.f125445s.f125449d = false;
        if (firstVisiblePosition == 0 && lastVisiblePosition > 0 && lastVisiblePosition == this.f125444r - 1) {
            View childAt = this.f146524c.getChildAt(childCount - 1);
            if (childAt != null && childAt.getBottom() == this.f146524c.getHeight() - this.f146524c.getPaddingBottom()) {
                this.f125445s.f125449d = true;
            }
        } else if (lastVisiblePosition <= 0 || lastVisiblePosition != this.f125444r - 1) {
            m147976b0(childCount, firstVisiblePosition, lastVisiblePosition);
        } else {
            if (this.f146524c.getHeight() - m147981g0() == this.f146524c.getChildAt(childCount - 1).getBottom() - this.f146524c.getPaddingTop()) {
                this.f125445s.f125449d = true;
            } else {
                m147976b0(childCount, firstVisiblePosition, lastVisiblePosition);
            }
        }
        return this.f125445s;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m147975a0(int i, int i2, C18121a c18121a) {
        if (i == 0 && c18121a.f125448c == 0 && i2 == m147978d0()) {
            c18121a.m147990a();
            c18121a.f125449d = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b0 */
    public final void m147976b0(int i, int i2, int i3) {
        for (int i4 = i - 1; i4 >= 0; i4--) {
            View childAt = this.f146524c.getChildAt(i4);
            int childAdapterPosition = this.f146524c.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= i2 && childAdapterPosition <= i3 && (childAt instanceof x4q)) {
                Message message = ((x4q) childAt).message();
                if (NullChecker.m81303a(message)) {
                    C18121a c18121a = this.f125445s;
                    c18121a.f125446a = message._id;
                    c18121a.f125448c = childAt.getTop() - this.f146524c.getPaddingTop();
                    m147975a0(i4, this.f125444r, this.f125445s);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m147977c0() {
        if (m147965h0() || this.f125443q) {
            return this.f125440n.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m147978d0() {
        if (m147965h0() || this.f125443q) {
            return this.f125439m.size();
        }
        return 0;
    }

    @Override // p149l.luy
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final Message mo147969D(int i) {
        if (i < m147978d0() || i >= m147978d0() + m147980f0()) {
            return null;
        }
        return this.f125437k.mo139119m(i - m147978d0());
    }

    /* JADX INFO: renamed from: f0 */
    public int m147980f0() {
        return this.f125437k.mo139112d();
    }

    /* JADX INFO: renamed from: g0 */
    public int m147981g0() {
        return this.f146524c.getPaddingBottom() + this.f146524c.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!NullChecker.m81303a(this.f125437k)) {
            return super.getItemId(i);
        }
        if (i < m147978d0()) {
            return this.f125439m.get(i).f125453c._id;
        }
        return i >= m147978d0() + m147980f0() ? this.f125440n.get((i - m147978d0()) - m147980f0()).f125453c._id : mo147969D(i)._id;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i < m147978d0()) {
            return this.f125439m.get(i).f125451a;
        }
        return i >= m147978d0() + m147980f0() ? this.f125440n.get((i - m147978d0()) - m147980f0()).f125451a : this.f125437k.mo139120p(i - m147978d0());
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: i */
    public void mo147982i(List<View> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C18122b c18122b = new C18122b(this.f125442p + 51000, it.next());
            this.f125440n.add(c18122b);
            this.f125441o.put(c18122b.f125451a, c18122b);
            this.f125442p++;
        }
        notifyDataSetChanged();
    }

    @Override // p149l.w1m
    /* JADX INFO: renamed from: j */
    public void mo147983j(View view) {
        m147966i0(view, this.f125439m);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m147984j0(C18121a c18121a) {
        if (c18121a.f125449d) {
            this.f125438l.scrollToPositionWithOffset(getItemCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
            return;
        }
        int iM147978d0 = -1;
        if (c18121a.f125446a > 0) {
            for (int iM147980f0 = m147980f0() - 1; iM147980f0 >= 0; iM147980f0--) {
                Message messageMo147969D = mo147969D(iM147980f0);
                if (NullChecker.m81303a(messageMo147969D) && messageMo147969D._id == c18121a.f125446a) {
                    iM147978d0 = iM147980f0;
                    break;
                }
            }
        } else {
            int i = c18121a.f125447b;
            if (i > 0) {
                int i2 = 0;
                if (i > 51000) {
                    while (i2 < m147977c0()) {
                        if (this.f125440n.get(i2).f125451a == c18121a.f125447b) {
                            iM147978d0 = i2 + m147978d0() + m147980f0();
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (i2 < m147978d0()) {
                        if (this.f125439m.get(i2).f125451a == c18121a.f125447b) {
                            iM147978d0 = i2;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (iM147978d0 >= 0) {
            this.f125438l.scrollToPositionWithOffset(iM147978d0, c18121a.f125448c);
        }
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: n */
    public void mo147985n() {
        C18121a c18121aM147974Z = m147974Z();
        notifyDataSetChanged();
        m147984j0(c18121aM147974Z);
        this.f125444r = getItemCount();
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: r */
    public void mo147986r() {
        this.f125443q = true;
    }

    @Override // p149l.w1m
    /* JADX INFO: renamed from: t */
    public final void mo147987t(View view) {
        C18122b c18122b = new C18122b(this.f125442p + 50000, view);
        this.f125439m.add(c18122b);
        this.f125441o.put(c18122b.f125451a, c18122b);
        this.f125442p++;
        notifyDataSetChanged();
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: u */
    public void mo147988u() {
        this.f146524c.setSelection(getItemCount() - 1);
        mo147985n();
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: x */
    public void mo147989x(List<View> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C18122b c18122b = new C18122b(this.f125442p + 50000, it.next());
            this.f125439m.add(c18122b);
            this.f125441o.put(c18122b.f125451a, c18122b);
            this.f125442p++;
        }
        notifyDataSetChanged();
    }
}
