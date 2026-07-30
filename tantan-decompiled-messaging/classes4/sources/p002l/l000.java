package p002l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.messages.recycler.wrap.MessageRecyclerView;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.vwb;
import l.x4q;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l000 extends p000 implements w1m {

    /* JADX INFO: renamed from: k */
    public o000 f14616k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f14617l;

    /* JADX INFO: renamed from: m */
    public List<C0654b> f14618m;

    /* JADX INFO: renamed from: n */
    public List<C0654b> f14619n;

    /* JADX INFO: renamed from: o */
    public SparseArray<C0654b> f14620o;

    /* JADX INFO: renamed from: p */
    public int f14621p;

    /* JADX INFO: renamed from: q */
    public boolean f14622q;

    /* JADX INFO: renamed from: r */
    public int f14623r;

    /* JADX INFO: renamed from: s */
    public C0653a f14624s;

    /* JADX INFO: renamed from: l.l000$a */
    public class C0653a {

        /* JADX INFO: renamed from: a */
        public long f14625a;

        /* JADX INFO: renamed from: b */
        public int f14626b;

        /* JADX INFO: renamed from: c */
        public int f14627c;

        /* JADX INFO: renamed from: d */
        public boolean f14628d;

        public C0653a() {
            this.f14625a = -1L;
            this.f14626b = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m16924a() {
            this.f14625a = -1L;
            this.f14626b = -1;
            this.f14627c = 0;
            this.f14628d = false;
        }
    }

    /* JADX INFO: renamed from: l.l000$b */
    public class C0654b {

        /* JADX INFO: renamed from: a */
        public int f14630a;

        /* JADX INFO: renamed from: b */
        public View f14631b;

        /* JADX INFO: renamed from: c */
        public Message f14632c;

        public C0654b(int i, View view) {
            this.f14630a = i;
            this.f14631b = view;
            Message messageNew_ = Message.new_();
            this.f14632c = messageNew_;
            ((DbObject) messageNew_)._id = i > 0 ? -i : i;
            messageNew_.createdTime = -1.0d;
        }
    }

    public l000(MessageRecyclerView messageRecyclerView, o000 o000Var) {
        super(messageRecyclerView);
        this.f14618m = new ArrayList();
        this.f14619n = new ArrayList();
        this.f14620o = new SparseArray<>();
        this.f14621p = 0;
        this.f14622q = false;
        this.f14623r = 0;
        this.f14616k = o000Var;
        this.f14617l = messageRecyclerView.getLayoutManager();
    }

    /* JADX INFO: renamed from: h0 */
    private boolean m16899h0() {
        if (NullChecker.a(this.f14616k)) {
            return this.f14616k.m23229f();
        }
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    private void m16900i0(View view, List<C0654b> list) {
        if (view == null) {
            return;
        }
        if (!vwb.J(list)) {
            Iterator<C0654b> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f14631b == view) {
                    it.remove();
                    break;
                }
            }
        }
        int size = this.f14620o.size();
        for (int i = 0; i < size; i++) {
            C0654b c0654bValueAt = this.f14620o.valueAt(i);
            if (c0654bValueAt != null && c0654bValueAt.f14631b == view) {
                this.f14620o.removeAt(i);
                return;
            }
        }
    }

    @Override // p002l.luy
    /* JADX INFO: renamed from: C */
    public int mo16902C() {
        return m16911c0() + m16912d0() + m16914f0();
    }

    @Override // p002l.luy
    /* JADX INFO: renamed from: E */
    public final View mo16904E(ViewGroup viewGroup, int i) {
        return i >= 50000 ? this.f14620o.get(i).f14631b : this.f14616k.m19180w(viewGroup, i);
    }

    @Override // p002l.luy
    /* JADX INFO: renamed from: F */
    public void mo16905F(int i) {
        if (i < m16912d0() || i >= m16912d0() + m16914f0()) {
            return;
        }
        this.f14616k.m23228e(i - m16912d0());
    }

    @Override // p002l.p000
    /* JADX INFO: renamed from: V */
    public final Message mo16906V(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        if (i < m16912d0()) {
            return this.f14618m.get(i).f14632c;
        }
        return i >= m16912d0() + m16914f0() ? this.f14619n.get((i - m16912d0()) - m16914f0()).f14632c : mo16903D(i);
    }

    @Override // p002l.luy
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void mo16901A(View view, Message message, int i, int i2) {
        if (i >= 51000 || i >= 50000) {
            return;
        }
        this.f14616k.m19171a(view, message, i, i2 - m16912d0());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Z */
    public final C0653a m16908Z() {
        C0653a c0653a = this.f14624s;
        if (c0653a == null) {
            this.f14624s = new C0653a();
        } else {
            c0653a.m16924a();
        }
        int childCount = this.f16933c.getChildCount();
        if (childCount == 0 || childCount == m16912d0()) {
            C0653a c0653a2 = this.f14624s;
            c0653a2.f14628d = true;
            return c0653a2;
        }
        int lastVisiblePosition = this.f16933c.getLastVisiblePosition();
        int firstVisiblePosition = this.f16933c.getFirstVisiblePosition();
        this.f14624s.f14628d = false;
        if (firstVisiblePosition == 0 && lastVisiblePosition > 0 && lastVisiblePosition == this.f14623r - 1) {
            View childAt = this.f16933c.getChildAt(childCount - 1);
            if (childAt != null && childAt.getBottom() == this.f16933c.getHeight() - this.f16933c.getPaddingBottom()) {
                this.f14624s.f14628d = true;
            }
        } else if (lastVisiblePosition <= 0 || lastVisiblePosition != this.f14623r - 1) {
            m16910b0(childCount, firstVisiblePosition, lastVisiblePosition);
        } else {
            if (this.f16933c.getHeight() - m16915g0() == this.f16933c.getChildAt(childCount - 1).getBottom() - this.f16933c.getPaddingTop()) {
                this.f14624s.f14628d = true;
            } else {
                m16910b0(childCount, firstVisiblePosition, lastVisiblePosition);
            }
        }
        return this.f14624s;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m16909a0(int i, int i2, C0653a c0653a) {
        if (i == 0 && c0653a.f14627c == 0 && i2 == m16912d0()) {
            c0653a.m16924a();
            c0653a.f14628d = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b0 */
    public final void m16910b0(int i, int i2, int i3) {
        for (int i4 = i - 1; i4 >= 0; i4--) {
            View childAt = this.f16933c.getChildAt(i4);
            int childAdapterPosition = this.f16933c.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= i2 && childAdapterPosition <= i3 && (childAt instanceof x4q)) {
                Message message = ((x4q) childAt).message();
                if (NullChecker.a(message)) {
                    C0653a c0653a = this.f14624s;
                    c0653a.f14625a = ((DbObject) message)._id;
                    c0653a.f14627c = childAt.getTop() - this.f16933c.getPaddingTop();
                    m16909a0(i4, this.f14623r, this.f14624s);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m16911c0() {
        if (m16899h0() || this.f14622q) {
            return this.f14619n.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m16912d0() {
        if (m16899h0() || this.f14622q) {
            return this.f14618m.size();
        }
        return 0;
    }

    @Override // p002l.luy
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final Message mo16903D(int i) {
        if (i < m16912d0() || i >= m16912d0() + m16914f0()) {
            return null;
        }
        return this.f14616k.m19176m(i - m16912d0());
    }

    /* JADX INFO: renamed from: f0 */
    public int m16914f0() {
        return this.f14616k.m19174d();
    }

    /* JADX INFO: renamed from: g0 */
    public int m16915g0() {
        return this.f16933c.getPaddingBottom() + this.f16933c.getPaddingTop();
    }

    public long getItemId(int i) {
        if (!NullChecker.a(this.f14616k)) {
            return super.getItemId(i);
        }
        if (i < m16912d0()) {
            return ((DbObject) this.f14618m.get(i).f14632c)._id;
        }
        return i >= m16912d0() + m16914f0() ? ((DbObject) this.f14619n.get((i - m16912d0()) - m16914f0()).f14632c)._id : ((DbObject) mo16903D(i))._id;
    }

    public final int getItemViewType(int i) {
        if (i < m16912d0()) {
            return this.f14618m.get(i).f14630a;
        }
        return i >= m16912d0() + m16914f0() ? this.f14619n.get((i - m16912d0()) - m16914f0()).f14630a : this.f14616k.m19177p(i - m16912d0());
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: i */
    public void mo16916i(List<View> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C0654b c0654b = new C0654b(this.f14621p + 51000, it.next());
            this.f14619n.add(c0654b);
            this.f14620o.put(c0654b.f14630a, c0654b);
            this.f14621p++;
        }
        notifyDataSetChanged();
    }

    @Override // p002l.w1m
    /* JADX INFO: renamed from: j */
    public void mo16917j(View view) {
        m16900i0(view, this.f14618m);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m16918j0(C0653a c0653a) {
        if (c0653a.f14628d) {
            this.f14617l.scrollToPositionWithOffset(getItemCount() - 1, -10000);
            return;
        }
        int iM16912d0 = -1;
        if (c0653a.f14625a > 0) {
            for (int iM16914f0 = m16914f0() - 1; iM16914f0 >= 0; iM16914f0--) {
                Message messageMo16903D = mo16903D(iM16914f0);
                if (NullChecker.a(messageMo16903D) && ((DbObject) messageMo16903D)._id == c0653a.f14625a) {
                    iM16912d0 = iM16914f0;
                    break;
                }
            }
        } else {
            int i = c0653a.f14626b;
            if (i > 0) {
                int i2 = 0;
                if (i > 51000) {
                    while (i2 < m16911c0()) {
                        if (this.f14619n.get(i2).f14630a == c0653a.f14626b) {
                            iM16912d0 = i2 + m16912d0() + m16914f0();
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (i2 < m16912d0()) {
                        if (this.f14618m.get(i2).f14630a == c0653a.f14626b) {
                            iM16912d0 = i2;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (iM16912d0 >= 0) {
            this.f14617l.scrollToPositionWithOffset(iM16912d0, c0653a.f14627c);
        }
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: n */
    public void mo16919n() {
        C0653a c0653aM16908Z = m16908Z();
        notifyDataSetChanged();
        m16918j0(c0653aM16908Z);
        this.f14623r = getItemCount();
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: r */
    public void mo16920r() {
        this.f14622q = true;
    }

    @Override // p002l.w1m
    /* JADX INFO: renamed from: t */
    public final void mo16921t(View view) {
        C0654b c0654b = new C0654b(this.f14621p + 50000, view);
        this.f14618m.add(c0654b);
        this.f14620o.put(c0654b.f14630a, c0654b);
        this.f14621p++;
        notifyDataSetChanged();
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: u */
    public void mo16922u() {
        this.f16933c.setSelection(getItemCount() - 1);
        mo16919n();
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: x */
    public void mo16923x(List<View> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C0654b c0654b = new C0654b(this.f14621p + 50000, it.next());
            this.f14618m.add(c0654b);
            this.f14620o.put(c0654b.f14630a, c0654b);
            this.f14621p++;
        }
        notifyDataSetChanged();
    }
}
