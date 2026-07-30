package p153l;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/eix;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "a", "(Landroidx/recyclerview/widget/RecyclerView;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class eix {

    @NotNull
    public static final eix INSTANCE = new eix();

    /* JADX INFO: renamed from: l.eix$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/eix$a", "Landroidx/recyclerview/widget/RecyclerView$y;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "c", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16782a extends RecyclerView.C0589y {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.FloatRef f94223a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.FloatRef f94224b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Ref.BooleanRef f94225c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Ref.BooleanRef f94226d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f94227e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f94228f;

        public C16782a(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, float f, int i) {
            this.f94223a = floatRef;
            this.f94224b = floatRef2;
            this.f94225c = booleanRef;
            this.f94226d = booleanRef2;
            this.f94227e = f;
            this.f94228f = i;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0075  */
        /* JADX WARN: Code duplicated, block: B:30:0x007b  */
        @Override // androidx.recyclerview.widget.RecyclerView.C0589y, androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: c */
        public boolean mo3426c(RecyclerView rv, MotionEvent e) {
            ViewParent parent;
            ViewParent parent2;
            rv.getClass();
            e.getClass();
            int actionMasked = e.getActionMasked();
            if (actionMasked == 0) {
                this.f94223a.element = e.getX();
                this.f94224b.element = e.getY();
                this.f94225c.element = false;
                this.f94226d.element = false;
                ViewParent parent3 = rv.getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
            } else if (actionMasked == 1) {
                parent = rv.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                this.f94225c.element = false;
                this.f94226d.element = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    parent = rv.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                    this.f94225c.element = false;
                    this.f94226d.element = false;
                }
            } else if (!this.f94225c.element) {
                float fAbs = Math.abs(e.getX() - this.f94223a.element);
                float fAbs2 = Math.abs(e.getY() - this.f94224b.element);
                if (fAbs > this.f94227e || fAbs2 > this.f94228f) {
                    this.f94225c.element = true;
                    this.f94226d.element = fAbs >= fAbs2 * 0.65f;
                    ViewParent parent4 = rv.getParent();
                    if (parent4 != null) {
                        parent4.requestDisallowInterceptTouchEvent(this.f94226d.element);
                    }
                }
            } else if (this.f94226d.element && (parent2 = rv.getParent()) != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m120948a(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        int scaledTouchSlop = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        recyclerView.addOnItemTouchListener(new C16782a(new Ref.FloatRef(), new Ref.FloatRef(), new Ref.BooleanRef(), new Ref.BooleanRef(), C15274a.m88485a(scaledTouchSlop * 0.5f, 4.0f), scaledTouchSlop));
    }
}
