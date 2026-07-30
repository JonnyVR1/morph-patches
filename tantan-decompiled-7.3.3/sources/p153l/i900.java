package p153l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.wrap.MessageRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class i900 extends m900 implements p4m {

    /* JADX INFO: renamed from: k */
    public l900 f113388k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f113389l;

    /* JADX INFO: renamed from: m */
    public List<C17669b> f113390m;

    /* JADX INFO: renamed from: n */
    public List<C17669b> f113391n;

    /* JADX INFO: renamed from: o */
    public SparseArray<C17669b> f113392o;

    /* JADX INFO: renamed from: p */
    public int f113393p;

    /* JADX INFO: renamed from: q */
    public boolean f113394q;

    /* JADX INFO: renamed from: r */
    public int f113395r;

    /* JADX INFO: renamed from: s */
    public C17668a f113396s;

    /* JADX INFO: renamed from: l.i900$a */
    public class C17668a {

        /* JADX INFO: renamed from: a */
        public long f113397a;

        /* JADX INFO: renamed from: b */
        public int f113398b;

        /* JADX INFO: renamed from: c */
        public int f113399c;

        /* JADX INFO: renamed from: d */
        public boolean f113400d;

        public C17668a() {
            this.f113397a = -1L;
            this.f113398b = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m139063a() {
            this.f113397a = -1L;
            this.f113398b = -1;
            this.f113399c = 0;
            this.f113400d = false;
        }
    }

    /* JADX INFO: renamed from: l.i900$b */
    public class C17669b {

        /* JADX INFO: renamed from: a */
        public int f113402a;

        /* JADX INFO: renamed from: b */
        public View f113403b;

        /* JADX INFO: renamed from: c */
        public Message f113404c;

        public C17669b(int i, View view) {
            this.f113402a = i;
            this.f113403b = view;
            Message messageNew_ = Message.new_();
            this.f113404c = messageNew_;
            messageNew_._id = i > 0 ? -i : i;
            messageNew_.createdTime = -1.0d;
        }
    }

    public i900(MessageRecyclerView messageRecyclerView, l900 l900Var) {
        super(messageRecyclerView);
        this.f113390m = new ArrayList();
        this.f113391n = new ArrayList();
        this.f113392o = new SparseArray<>();
        this.f113393p = 0;
        this.f113394q = false;
        this.f113395r = 0;
        this.f113388k = l900Var;
        this.f113389l = (LinearLayoutManager) messageRecyclerView.getLayoutManager();
    }

    /* JADX INFO: renamed from: h0 */
    private boolean m139043h0() {
        if (NullChecker.m82486a(this.f113388k)) {
            return this.f113388k.m156442f();
        }
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    private void m139044i0(View view, List<C17669b> list) {
        if (view == null) {
            return;
        }
        if (!jyb.m147479J(list)) {
            Iterator<C17669b> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f113403b == view) {
                    it.remove();
                    break;
                }
            }
        }
        int size = this.f113392o.size();
        for (int i = 0; i < size; i++) {
            C17669b c17669bValueAt = this.f113392o.valueAt(i);
            if (c17669bValueAt != null && c17669bValueAt.f113403b == view) {
                this.f113392o.removeAt(i);
                return;
            }
        }
    }

    @Override // p153l.i3z
    /* JADX INFO: renamed from: C */
    public int mo138364C() {
        return m139050c0() + m139051d0() + m139053f0();
    }

    @Override // p153l.i3z
    /* JADX INFO: renamed from: E */
    public final View mo138366E(ViewGroup viewGroup, int i) {
        return i >= 50000 ? this.f113392o.get(i).f113403b : this.f113388k.mo129509w(viewGroup, i);
    }

    @Override // p153l.i3z
    /* JADX INFO: renamed from: F */
    public void mo138367F(int i) {
        if (i < m139051d0() || i >= m139051d0() + m139053f0()) {
            return;
        }
        this.f113388k.mo129501e(i - m139051d0());
    }

    @Override // p153l.m900
    /* JADX INFO: renamed from: V */
    public final Message mo139045V(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        if (i < m139051d0()) {
            return this.f113390m.get(i).f113404c;
        }
        return i >= m139051d0() + m139053f0() ? this.f113391n.get((i - m139051d0()) - m139053f0()).f113404c : mo138365D(i);
    }

    @Override // p153l.i3z
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void mo138363A(View view, Message message, int i, int i2) {
        if (i >= 51000 || i >= 50000) {
            return;
        }
        this.f113388k.mo129495a(view, message, i, i2 - m139051d0());
    }

    /* JADX INFO: renamed from: Z */
    public final C17668a m139047Z() {
        C17668a c17668a = this.f113396s;
        if (c17668a == null) {
            this.f113396s = new C17668a();
        } else {
            c17668a.m139063a();
        }
        int childCount = this.f135315c.getChildCount();
        if (childCount == 0 || childCount == m139051d0()) {
            C17668a c17668a2 = this.f113396s;
            c17668a2.f113400d = true;
            return c17668a2;
        }
        int lastVisiblePosition = this.f135315c.getLastVisiblePosition();
        int firstVisiblePosition = this.f135315c.getFirstVisiblePosition();
        this.f113396s.f113400d = false;
        if (firstVisiblePosition == 0 && lastVisiblePosition > 0 && lastVisiblePosition == this.f113395r - 1) {
            View childAt = this.f135315c.getChildAt(childCount - 1);
            if (childAt != null && childAt.getBottom() == this.f135315c.getHeight() - this.f135315c.getPaddingBottom()) {
                this.f113396s.f113400d = true;
            }
        } else if (lastVisiblePosition <= 0 || lastVisiblePosition != this.f113395r - 1) {
            m139049b0(childCount, firstVisiblePosition, lastVisiblePosition);
        } else {
            if (this.f135315c.getHeight() - m139054g0() == this.f135315c.getChildAt(childCount - 1).getBottom() - this.f135315c.getPaddingTop()) {
                this.f113396s.f113400d = true;
            } else {
                m139049b0(childCount, firstVisiblePosition, lastVisiblePosition);
            }
        }
        return this.f113396s;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m139048a0(int i, int i2, C17668a c17668a) {
        if (i == 0 && c17668a.f113399c == 0 && i2 == m139051d0()) {
            c17668a.m139063a();
            c17668a.f113400d = true;
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
    public final void m139049b0(int i, int i2, int i3) {
        for (int i4 = i - 1; i4 >= 0; i4--) {
            View childAt = this.f135315c.getChildAt(i4);
            int childAdapterPosition = this.f135315c.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= i2 && childAdapterPosition <= i3 && (childAt instanceof x6q)) {
                Message message = ((x6q) childAt).message();
                if (NullChecker.m82486a(message)) {
                    C17668a c17668a = this.f113396s;
                    c17668a.f113397a = message._id;
                    c17668a.f113399c = childAt.getTop() - this.f135315c.getPaddingTop();
                    m139048a0(i4, this.f113395r, this.f113396s);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m139050c0() {
        if (m139043h0() || this.f113394q) {
            return this.f113391n.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m139051d0() {
        if (m139043h0() || this.f113394q) {
            return this.f113390m.size();
        }
        return 0;
    }

    @Override // p153l.i3z
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final Message mo138365D(int i) {
        if (i < m139051d0() || i >= m139051d0() + m139053f0()) {
            return null;
        }
        return this.f113388k.mo129506m(i - m139051d0());
    }

    /* JADX INFO: renamed from: f0 */
    public int m139053f0() {
        return this.f113388k.mo129499d();
    }

    /* JADX INFO: renamed from: g0 */
    public int m139054g0() {
        return this.f135315c.getPaddingBottom() + this.f135315c.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!NullChecker.m82486a(this.f113388k)) {
            return super.getItemId(i);
        }
        if (i < m139051d0()) {
            return this.f113390m.get(i).f113404c._id;
        }
        return i >= m139051d0() + m139053f0() ? this.f113391n.get((i - m139051d0()) - m139053f0()).f113404c._id : mo138365D(i)._id;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i < m139051d0()) {
            return this.f113390m.get(i).f113402a;
        }
        return i >= m139051d0() + m139053f0() ? this.f113391n.get((i - m139051d0()) - m139053f0()).f113402a : this.f113388k.mo129507p(i - m139051d0());
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: i */
    public void mo139055i(List<View> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C17669b c17669b = new C17669b(this.f113393p + 51000, it.next());
            this.f113391n.add(c17669b);
            this.f113392o.put(c17669b.f113402a, c17669b);
            this.f113393p++;
        }
        notifyDataSetChanged();
    }

    @Override // p153l.p4m
    /* JADX INFO: renamed from: j */
    public void mo139056j(View view) {
        m139044i0(view, this.f113390m);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m139057j0(C17668a c17668a) {
        if (c17668a.f113400d) {
            this.f113389l.scrollToPositionWithOffset(getItemCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
            return;
        }
        int iM139051d0 = -1;
        if (c17668a.f113397a > 0) {
            for (int iM139053f0 = m139053f0() - 1; iM139053f0 >= 0; iM139053f0--) {
                Message messageMo138365D = mo138365D(iM139053f0);
                if (NullChecker.m82486a(messageMo138365D) && messageMo138365D._id == c17668a.f113397a) {
                    iM139051d0 = iM139053f0;
                    break;
                }
            }
        } else {
            int i = c17668a.f113398b;
            if (i > 0) {
                int i2 = 0;
                if (i > 51000) {
                    while (i2 < m139050c0()) {
                        if (this.f113391n.get(i2).f113402a == c17668a.f113398b) {
                            iM139051d0 = i2 + m139051d0() + m139053f0();
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (i2 < m139051d0()) {
                        if (this.f113390m.get(i2).f113402a == c17668a.f113398b) {
                            iM139051d0 = i2;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (iM139051d0 >= 0) {
            this.f113389l.scrollToPositionWithOffset(iM139051d0, c17668a.f113399c);
        }
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: n */
    public void mo139058n() {
        C17668a c17668aM139047Z = m139047Z();
        notifyDataSetChanged();
        m139057j0(c17668aM139047Z);
        this.f113395r = getItemCount();
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: r */
    public void mo139059r() {
        this.f113394q = true;
    }

    @Override // p153l.p4m
    /* JADX INFO: renamed from: t */
    public final void mo139060t(View view) {
        C17669b c17669b = new C17669b(this.f113393p + SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, view);
        this.f113390m.add(c17669b);
        this.f113392o.put(c17669b.f113402a, c17669b);
        this.f113393p++;
        notifyDataSetChanged();
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: u */
    public void mo139061u() {
        this.f135315c.setSelection(getItemCount() - 1);
        mo139058n();
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: x */
    public void mo139062x(List<View> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C17669b c17669b = new C17669b(this.f113393p + SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, it.next());
            this.f113390m.add(c17669b);
            this.f113392o.put(c17669b.f113402a, c17669b);
            this.f113393p++;
        }
        notifyDataSetChanged();
    }
}
