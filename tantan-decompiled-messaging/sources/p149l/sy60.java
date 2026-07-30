package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p149l.py60;

/* JADX INFO: loaded from: classes12.dex */
public class sy60<P extends py60> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public VFrame f166898a;

    /* JADX INFO: renamed from: b */
    public FeedMaxHeightRecyclerView f166899b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f166900c;

    /* JADX INFO: renamed from: d */
    public py60 f166901d;

    /* JADX INFO: renamed from: e */
    public C11280a f166902e;

    /* JADX INFO: renamed from: g */
    public boolean f166904g;

    /* JADX INFO: renamed from: h */
    public c680 f166905h;

    /* JADX INFO: renamed from: i */
    public boolean f166906i;

    /* JADX INFO: renamed from: k */
    public ViewTreeObserver.OnGlobalLayoutListener f166908k;

    /* JADX INFO: renamed from: f */
    public boolean f166903f = false;

    /* JADX INFO: renamed from: j */
    public boolean f166907j = false;

    /* JADX INFO: renamed from: l */
    public RecyclerView.InterfaceC0579q f166909l = new C20072a();

    /* JADX INFO: renamed from: m */
    public RecyclerView.AbstractC0582t f166910m = new C20073b();

    /* JADX INFO: renamed from: l.sy60$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC20075d implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC20075d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            sy60 sy60Var = sy60.this;
            if (sy60Var.f166899b == null) {
                return;
            }
            j760<Integer, Integer> j760VarM172076b1 = sy60Var.f166901d.m172076b1();
            if (!sy60.this.f166904g || sy60.this.f166899b.getMeasuredHeight() <= 0 || !NullChecker.m81303a(j760VarM172076b1) || j760VarM172076b1.f116565b.intValue() <= 0) {
                return;
            }
            sy60.this.f166901d.m172055I1(j760VarM172076b1.f116564a.intValue(), j760VarM172076b1.f116565b.intValue());
            sy60.this.f166899b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public sy60(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f166900c = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: A */
    public void m186612A() {
        if (NullChecker.m81303a(this.f166905h)) {
            this.f166905h.pause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public boolean m186613B() {
        if (this.f166901d.m172083k1() || !cdh.m106229b()) {
            return true;
        }
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f166899b;
        if (feedMaxHeightRecyclerView != null && this.f166902e != null && this.f166905h != null) {
            int height = feedMaxHeightRecyclerView.getHeight() / 2;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f166899b.getLayoutManager();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            float f = -1.0f;
            int i = -1;
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition instanceof erl) {
                    erl erlVar = (erl) viewFindViewByPosition;
                    if (xdl0.m208349O0(erlVar.getPlayerView()) && erlVar.getPlayerView().getHeight() != 0) {
                        int iAbs = Math.abs(Math.abs((viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) / 2) - height);
                        if (f == -1.0f || iAbs < f) {
                            f = iAbs;
                            i = iFindFirstVisibleItemPosition;
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.f166899b.getChildCount(); i2++) {
                KeyEvent.Callback childAt = this.f166899b.getChildAt(i2);
                if (childAt instanceof erl) {
                    erl erlVar2 = (erl) childAt;
                    if (xdl0.m208349O0(erlVar2.getPlayerView()) && erlVar2.getPlayerView().getHeight() != 0 && i2 != i) {
                        erlVar2.getPlayerView().setPlayer(null);
                    }
                }
            }
            if (i != -1) {
                KeyEvent.Callback callbackFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                if (callbackFindViewByPosition instanceof erl) {
                    erl erlVar3 = (erl) callbackFindViewByPosition;
                    if (xdl0.m208349O0(erlVar3.getPlayerView())) {
                        PlayerView playerView = erlVar3.getPlayerView();
                        playerView.setPlayer(this.f166905h);
                        playerView.m66573N();
                        this.f166905h.mo105367b();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public void m186614C() {
        if (u2h.m191496e() && this.f166899b != null && this.f166908k == null) {
            this.f166908k = new ViewTreeObserverOnGlobalLayoutListenerC20075d();
            this.f166899b.getViewTreeObserver().addOnGlobalLayoutListener(this.f166908k);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m186615E(List<MomentItem> list, boolean z, User user, int i) {
        this.f166902e.m63925n0(new q860<>(list, null), z, this.f166901d.f151808g, user);
        if (this.f166902e.f41388m.f153135a.size() == 0 && list.size() != 0) {
            this.f166899b.scrollToPosition(0);
        } else if (this.f166907j) {
            this.f166899b.scrollToPosition(0);
            this.f166907j = false;
        } else if (this.f166901d.f151807f != -1) {
            this.f166899b.scrollToPosition(i);
            this.f166901d.f151807f = -1;
        } else if (n7c.m158118e().f137494a && n7c.m158118e().f137496c > 0) {
            this.f166899b.scrollToPosition(n7c.m158118e().f137496c);
            n7c.m158118e().f137494a = false;
            n7c.m158118e().f137496c = -1;
            n7c.m158118e().f137495b = null;
        }
        this.f166906i = true;
    }

    /* JADX INFO: renamed from: F */
    public void m186616F() {
        if (NullChecker.m81304b(this.f166899b)) {
            this.f166899b.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m186617G(boolean z) {
        this.f166902e.m63929r0(z);
    }

    /* JADX INFO: renamed from: H */
    public void m186618H() {
        this.f166899b.setOnScrollListener(new C20074c());
    }

    /* JADX INFO: renamed from: J */
    public void m186619J(boolean z) {
        this.f166904g = z;
    }

    /* JADX INFO: renamed from: K */
    public void m186620K(boolean z) {
        this.f166903f = z;
        if (z) {
            m186613B();
        } else if (NullChecker.m81303a(this.f166905h)) {
            this.f166905h.stop();
        }
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f166900c.act();
    }

    /* JADX INFO: renamed from: c */
    public View m186621c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ty60.m191004b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m186622d() {
        ty60.m191005c(this);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(py60 py60Var) {
        this.f166901d = py60Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m186624f() {
        return this.f166899b == null || this.f166902e == null || !cdh.m106229b();
    }

    /* JADX INFO: renamed from: i */
    public void m186625i() {
        this.f166899b.setItemAnimator(null);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo119482n = mo119482n(layoutInflater, viewGroup);
        mo119475I();
        m186625i();
        return viewMo119482n;
    }

    /* JADX INFO: renamed from: l */
    public void m186626l() {
        if (NullChecker.m81303a(this.f166900c.f41453C)) {
            this.f166902e = this.f166900c.f41453C.mo62036s0();
            d7h d7hVarMo62032X0 = this.f166900c.f41453C.mo62032X0();
            boolean zM81303a = NullChecker.m81303a(d7hVarMo62032X0);
            FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f166899b;
            if (zM81303a) {
                feedMaxHeightRecyclerView.setAdapter(d7hVarMo62032X0);
            } else {
                feedMaxHeightRecyclerView.setAdapter(this.f166902e);
            }
        } else {
            m186630s();
            this.f166899b.setAdapter(this.f166902e);
        }
        this.f166901d.mo114783e1();
        this.f166902e.m63928q0(this.f166901d.f151803b);
    }

    /* JADX INFO: renamed from: m */
    public void m186627m() {
        if (NullChecker.m81303a(this.f166908k)) {
            this.f166899b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f166908k);
        }
        this.f166899b.removeOnChildAttachStateChangeListener(this.f166909l);
        this.f166899b.removeOnScrollListener(this.f166910m);
    }

    /* JADX INFO: renamed from: n */
    public View mo119482n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM186621c = m186621c(layoutInflater, viewGroup);
        viewM186621c.setBackgroundColor(this.f166900c.getResources().getColor(e1c0.f88803p0));
        if (FeedModule.m60222H().mo30692I4() && TextUtils.equals(this.f166901d.f151805d, "from_live_square_tab")) {
            this.f166899b.setBackgroundColor(0);
            this.f166898a.setBackgroundColor(0);
        }
        return viewM186621c;
    }

    /* JADX INFO: renamed from: p */
    public RecyclerView.AbstractC0577o m186628p() {
        return this.f166899b.getLayoutManager();
    }

    /* JADX INFO: renamed from: q */
    public String m186629q(int i) {
        return this.f166902e.m63910V(i);
    }

    /* JADX INFO: renamed from: s */
    public C11280a m186630s() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f166900c;
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f166899b;
        py60 py60Var = this.f166901d;
        C11280a c11280a = new C11280a(photoAlbumBaseFrag, feedMaxHeightRecyclerView, py60Var.f151804c, py60Var.f151805d, py60Var.f151809h, py60Var.f151806e);
        this.f166902e = c11280a;
        return c11280a;
    }

    /* JADX INFO: renamed from: u */
    public void m186631u() {
        if (this.f166901d.m172083k1()) {
            return;
        }
        if (this.f166905h == null) {
            this.f166905h = new s680();
        }
        this.f166905h.mo105366a(this.f166901d.f151805d);
        this.f166899b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.qy60
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f156903a.m186632x(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void mo119483v(Bundle bundle) {
        this.f166899b.addOnChildAttachStateChangeListener(this.f166909l);
        this.f166899b.addOnScrollListener(this.f166910m);
        m186631u();
        if (u2h.m191495d() && (this.f166901d.f151803b instanceof t720)) {
            this.f166899b.setDescendantFocusability(393216);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean mo119484w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m186632x(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f166906i) {
            this.f166906i = false;
            if (this.f166903f) {
                m186613B();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m186633y() {
        if (NullChecker.m81303a(this.f166900c.f41453C)) {
            this.f166900c.f41453C.mo62035q();
        }
        this.f166901d.m172053F1();
    }

    /* JADX INFO: renamed from: z */
    public void mo119485z() {
        e51.m114742G(new Runnable() { // from class: l.ry60
            @Override // java.lang.Runnable
            public final void run() {
                this.f161538a.m186616F();
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void mo119475I() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.sy60$a */
    public class C20072a implements RecyclerView.InterfaceC0579q {
        public C20072a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: b */
        public void mo3413b(View view) {
            PhotoAlbumPictureView.m63859u(view, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: d */
        public void mo3414d(View view) {
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo119476L(boolean z) {
    }

    /* JADX INFO: renamed from: l.sy60$b */
    public class C20073b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public int f166912a = 0;

        public C20073b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            sy60.this.f166901d.m172054H1(i, this.f166912a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.sy60$c */
    public class C20074c extends RecyclerView.AbstractC0582t {
        public C20074c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            j760<Integer, Integer> j760VarM172076b1 = sy60.this.f166901d.m172076b1();
            if (i == 0 && NullChecker.m81303a(j760VarM172076b1)) {
                sy60.this.f166901d.m172055I1(j760VarM172076b1.f116564a.intValue(), j760VarM172076b1.f116565b.intValue());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }
}
