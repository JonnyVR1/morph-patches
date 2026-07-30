package p007l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c680;
import l.e51;
import l.j760;
import l.q860;
import l.s680;
import l.s7m;
import l.xdl0;
import p007l.py60;
import v.VFrame;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sy60<P extends py60> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public VFrame f13113a;

    /* JADX INFO: renamed from: b */
    public FeedMaxHeightRecyclerView f13114b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f13115c;

    /* JADX INFO: renamed from: d */
    public py60 f13116d;

    /* JADX INFO: renamed from: e */
    public C2124a f13117e;

    /* JADX INFO: renamed from: g */
    public boolean f13119g;

    /* JADX INFO: renamed from: h */
    public c680 f13120h;

    /* JADX INFO: renamed from: i */
    public boolean f13121i;

    /* JADX INFO: renamed from: k */
    public ViewTreeObserver.OnGlobalLayoutListener f13123k;

    /* JADX INFO: renamed from: f */
    public boolean f13118f = false;

    /* JADX INFO: renamed from: j */
    public boolean f13122j = false;

    /* JADX INFO: renamed from: l */
    public RecyclerView.q f13124l = new C2493a();

    /* JADX INFO: renamed from: m */
    public RecyclerView.t f13125m = new C2494b();

    /* JADX INFO: renamed from: l.sy60$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC2496d implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC2496d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            sy60 sy60Var = sy60.this;
            if (sy60Var.f13114b == null) {
                return;
            }
            j760<Integer, Integer> j760VarM13335b1 = sy60Var.f13116d.m13335b1();
            if (!sy60.this.f13119g || sy60.this.f13114b.getMeasuredHeight() <= 0 || !NullChecker.a(j760VarM13335b1) || ((Integer) j760VarM13335b1.b).intValue() <= 0) {
                return;
            }
            sy60.this.f13116d.m13313I1(((Integer) j760VarM13335b1.a).intValue(), ((Integer) j760VarM13335b1.b).intValue());
            sy60.this.f13114b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public sy60(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f13115c = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: A */
    public void m14383A() {
        if (NullChecker.a(this.f13120h)) {
            this.f13120h.pause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: B */
    public boolean m14384B() {
        if (this.f13116d.m13342k1() || !cdh.m9123b()) {
            return true;
        }
        VRecyclerView vRecyclerView = this.f13114b;
        if (vRecyclerView != null && this.f13117e != null && this.f13120h != null) {
            int height = vRecyclerView.getHeight() / 2;
            LinearLayoutManager layoutManager = this.f13114b.getLayoutManager();
            int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
            float f = -1.0f;
            int i = -1;
            for (int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition instanceof erl) {
                    erl erlVar = (erl) viewFindViewByPosition;
                    if (xdl0.O0(erlVar.getPlayerView()) && erlVar.getPlayerView().getHeight() != 0) {
                        int iAbs = Math.abs(Math.abs((viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) / 2) - height);
                        if (f == -1.0f || iAbs < f) {
                            f = iAbs;
                            i = iFindFirstVisibleItemPosition;
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.f13114b.getChildCount(); i2++) {
                KeyEvent.Callback childAt = this.f13114b.getChildAt(i2);
                if (childAt instanceof erl) {
                    erl erlVar2 = (erl) childAt;
                    if (xdl0.O0(erlVar2.getPlayerView()) && erlVar2.getPlayerView().getHeight() != 0 && i2 != i) {
                        erlVar2.getPlayerView().setPlayer(null);
                    }
                }
            }
            if (i != -1) {
                KeyEvent.Callback callbackFindViewByPosition = layoutManager.findViewByPosition(i);
                if (callbackFindViewByPosition instanceof erl) {
                    erl erlVar3 = (erl) callbackFindViewByPosition;
                    if (xdl0.O0(erlVar3.getPlayerView())) {
                        PlayerView playerView = erlVar3.getPlayerView();
                        playerView.setPlayer(this.f13120h);
                        playerView.m7757N();
                        this.f13120h.b();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public void m14385C() {
        if (u2h.m14720e() && this.f13114b != null && this.f13123k == null) {
            this.f13123k = new ViewTreeObserverOnGlobalLayoutListenerC2496d();
            this.f13114b.getViewTreeObserver().addOnGlobalLayoutListener(this.f13123k);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14386C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m14387E(List<MomentItem> list, boolean z, User user, int i) {
        this.f13117e.m4963n0(new q860<>(list, (DbLinks) null), z, this.f13116d.f12016g, user);
        if (this.f13117e.f2849m.a.size() == 0 && list.size() != 0) {
            this.f13114b.scrollToPosition(0);
        } else if (this.f13122j) {
            this.f13114b.scrollToPosition(0);
            this.f13122j = false;
        } else if (this.f13116d.f12015f != -1) {
            this.f13114b.scrollToPosition(i);
            this.f13116d.f12015f = -1;
        } else if (n7c.m12098e().f10689a && n7c.m12098e().f10691c > 0) {
            this.f13114b.scrollToPosition(n7c.m12098e().f10691c);
            n7c.m12098e().f10689a = false;
            n7c.m12098e().f10691c = -1;
            n7c.m12098e().f10690b = null;
        }
        this.f13121i = true;
    }

    /* JADX INFO: renamed from: F */
    public void m14388F() {
        if (NullChecker.b(this.f13114b)) {
            this.f13114b.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m14389G(boolean z) {
        this.f13117e.m4967r0(z);
    }

    /* JADX INFO: renamed from: H */
    public void m14390H() {
        this.f13114b.setOnScrollListener(new C2495c());
    }

    /* JADX INFO: renamed from: J */
    public void m14391J(boolean z) {
        this.f13119g = z;
    }

    /* JADX INFO: renamed from: K */
    public void m14392K(boolean z) {
        this.f13118f = z;
        if (z) {
            m14384B();
        } else if (NullChecker.a(this.f13120h)) {
            this.f13120h.stop();
        }
    }

    @Nullable
    public Act act() {
        return this.f13115c.act();
    }

    /* JADX INFO: renamed from: c */
    public View m14393c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ty60.m14685b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m14394d() {
        ty60.m14686c(this);
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo10057i1(py60 py60Var) {
        this.f13116d = py60Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14396f() {
        return this.f13114b == null || this.f13117e == null || !cdh.m9123b();
    }

    /* JADX INFO: renamed from: i */
    public void m14397i() {
        this.f13114b.setItemAnimator((RecyclerView.l) null);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo10058n = mo10058n(layoutInflater, viewGroup);
        mo10050I();
        m14397i();
        return viewMo10058n;
    }

    /* JADX INFO: renamed from: l */
    public void m14398l() {
        if (NullChecker.a(this.f13115c.f2914C)) {
            this.f13117e = this.f13115c.f2914C.mo3014s0();
            d7h d7hVarMo3008X0 = this.f13115c.f2914C.mo3008X0();
            boolean zA = NullChecker.a(d7hVarMo3008X0);
            FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f13114b;
            if (zA) {
                feedMaxHeightRecyclerView.setAdapter(d7hVarMo3008X0);
            } else {
                feedMaxHeightRecyclerView.setAdapter(this.f13117e);
            }
        } else {
            m14402s();
            this.f13114b.setAdapter(this.f13117e);
        }
        this.f13116d.mo9614e1();
        this.f13117e.m4966q0(this.f13116d.f12011b);
    }

    /* JADX INFO: renamed from: m */
    public void m14399m() {
        if (NullChecker.a(this.f13123k)) {
            this.f13114b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f13123k);
        }
        this.f13114b.removeOnChildAttachStateChangeListener(this.f13124l);
        this.f13114b.removeOnScrollListener(this.f13125m);
    }

    /* JADX INFO: renamed from: n */
    public View mo10058n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM14393c = m14393c(layoutInflater, viewGroup);
        viewM14393c.setBackgroundColor(this.f13115c.getResources().getColor(e1c0.f7159p0));
        if (FeedModule.m1140H().I4() && TextUtils.equals(this.f13116d.f12013d, "from_live_square_tab")) {
            this.f13114b.setBackgroundColor(0);
            this.f13113a.setBackgroundColor(0);
        }
        return viewM14393c;
    }

    /* JADX INFO: renamed from: p */
    public RecyclerView.o m14400p() {
        return this.f13114b.getLayoutManager();
    }

    /* JADX INFO: renamed from: q */
    public String m14401q(int i) {
        return this.f13117e.m4947V(i);
    }

    /* JADX INFO: renamed from: s */
    public C2124a m14402s() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f13115c;
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f13114b;
        py60 py60Var = this.f13116d;
        C2124a c2124a = new C2124a(photoAlbumBaseFrag, feedMaxHeightRecyclerView, py60Var.f12012c, py60Var.f12013d, py60Var.f12017h, py60Var.f12014e);
        this.f13117e = c2124a;
        return c2124a;
    }

    /* JADX INFO: renamed from: u */
    public void m14403u() {
        if (this.f13116d.m13342k1()) {
            return;
        }
        if (this.f13120h == null) {
            this.f13120h = new s680();
        }
        this.f13120h.a(this.f13116d.f12013d);
        this.f13114b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.qy60
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f12416a.m14404x(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void mo10059v(Bundle bundle) {
        this.f13114b.addOnChildAttachStateChangeListener(this.f13124l);
        this.f13114b.addOnScrollListener(this.f13125m);
        m14403u();
        if (u2h.m14719d() && (this.f13116d.f12011b instanceof t720)) {
            this.f13114b.setDescendantFocusability(393216);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean mo10060w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m14404x(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f13121i) {
            this.f13121i = false;
            if (this.f13118f) {
                m14384B();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m14405y() {
        if (NullChecker.a(this.f13115c.f2914C)) {
            this.f13115c.f2914C.mo3013q();
        }
        this.f13116d.m13311F1();
    }

    /* JADX INFO: renamed from: z */
    public void mo10062z() {
        e51.G(new Runnable() { // from class: l.ry60
            @Override // java.lang.Runnable
            public final void run() {
                this.f12758a.m14388F();
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void mo10050I() {
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.sy60$a */
    public class C2493a implements RecyclerView.q {
        public C2493a() {
        }

        /* JADX INFO: renamed from: b */
        public void m14406b(View view) {
            PhotoAlbumPictureView.m4886u(view, false);
        }

        /* JADX INFO: renamed from: d */
        public void m14407d(View view) {
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo10051L(boolean z) {
    }

    /* JADX INFO: renamed from: l.sy60$b */
    public class C2494b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public int f13127a = 0;

        public C2494b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            sy60.this.f13116d.m13312H1(i, this.f13127a);
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.sy60$c */
    public class C2495c extends RecyclerView.t {
        public C2495c() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            j760<Integer, Integer> j760VarM13335b1 = sy60.this.f13116d.m13335b1();
            if (i == 0 && NullChecker.a(j760VarM13335b1)) {
                sy60.this.f13116d.m13313I1(((Integer) j760VarM13335b1.a).intValue(), ((Integer) j760VarM13335b1.b).intValue());
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }
}
