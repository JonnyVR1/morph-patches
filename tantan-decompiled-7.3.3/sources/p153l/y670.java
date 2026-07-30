package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p153l.v670;

/* JADX INFO: loaded from: classes13.dex */
public class y670<P extends v670> implements iam<P> {

    /* JADX INFO: renamed from: a */
    public VFrame f197637a;

    /* JADX INFO: renamed from: b */
    public FeedMaxHeightRecyclerView f197638b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f197639c;

    /* JADX INFO: renamed from: d */
    public v670 f197640d;

    /* JADX INFO: renamed from: e */
    public C11443a f197641e;

    /* JADX INFO: renamed from: g */
    public boolean f197643g;

    /* JADX INFO: renamed from: h */
    public ie80 f197644h;

    /* JADX INFO: renamed from: i */
    public boolean f197645i;

    /* JADX INFO: renamed from: k */
    public ViewTreeObserver.OnGlobalLayoutListener f197647k;

    /* JADX INFO: renamed from: f */
    public boolean f197642f = false;

    /* JADX INFO: renamed from: j */
    public boolean f197646j = false;

    /* JADX INFO: renamed from: l */
    public RecyclerView.InterfaceC0581q f197648l = new C21526a();

    /* JADX INFO: renamed from: m */
    public RecyclerView.AbstractC0584t f197649m = new C21527b();

    /* JADX INFO: renamed from: l.y670$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC21529d implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC21529d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            y670 y670Var = y670.this;
            if (y670Var.f197638b == null) {
                return;
            }
            pf60<Integer, Integer> pf60VarM200030b1 = y670Var.f197640d.m200030b1();
            if (!y670.this.f197643g || y670.this.f197638b.getMeasuredHeight() <= 0 || !NullChecker.m82486a(pf60VarM200030b1) || pf60VarM200030b1.f152157b.intValue() <= 0) {
                return;
            }
            y670.this.f197640d.m200009I1(pf60VarM200030b1.f152156a.intValue(), pf60VarM200030b1.f152157b.intValue());
            y670.this.f197638b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public y670(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f197639c = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: A */
    public void m214382A() {
        if (NullChecker.m82486a(this.f197644h)) {
            this.f197644h.pause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public boolean m214383B() {
        if (this.f197640d.m200037k1() || !reh.m181027b()) {
            return true;
        }
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f197638b;
        if (feedMaxHeightRecyclerView != null && this.f197641e != null && this.f197644h != null) {
            int height = feedMaxHeightRecyclerView.getHeight() / 2;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f197638b.getLayoutManager();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            float f = -1.0f;
            int i = -1;
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition instanceof stl) {
                    stl stlVar = (stl) viewFindViewByPosition;
                    if (bnl0.m105529O0(stlVar.getPlayerView()) && stlVar.getPlayerView().getHeight() != 0) {
                        int iAbs = Math.abs(Math.abs((viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) / 2) - height);
                        if (f == -1.0f || iAbs < f) {
                            f = iAbs;
                            i = iFindFirstVisibleItemPosition;
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.f197638b.getChildCount(); i2++) {
                KeyEvent.Callback childAt = this.f197638b.getChildAt(i2);
                if (childAt instanceof stl) {
                    stl stlVar2 = (stl) childAt;
                    if (bnl0.m105529O0(stlVar2.getPlayerView()) && stlVar2.getPlayerView().getHeight() != 0 && i2 != i) {
                        stlVar2.getPlayerView().setPlayer(null);
                    }
                }
            }
            if (i != -1) {
                KeyEvent.Callback callbackFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                if (callbackFindViewByPosition instanceof stl) {
                    stl stlVar3 = (stl) callbackFindViewByPosition;
                    if (bnl0.m105529O0(stlVar3.getPlayerView())) {
                        PlayerView playerView = stlVar3.getPlayerView();
                        playerView.setPlayer(this.f197644h);
                        playerView.m67756N();
                        this.f197644h.mo139592b();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public void m214384C() {
        if (j4h.m143421e() && this.f197638b != null && this.f197647k == null) {
            this.f197647k = new ViewTreeObserverOnGlobalLayoutListenerC21529d();
            this.f197638b.getViewTreeObserver().addOnGlobalLayoutListener(this.f197647k);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m214385E(List<MomentItem> list, boolean z, User user, int i) {
        this.f197641e.m65108n0(new vg60<>(list, null), z, this.f197640d.f182610g, user);
        if (this.f197641e.f42236m.f184001a.size() == 0 && list.size() != 0) {
            this.f197638b.scrollToPosition(0);
        } else if (this.f197646j) {
            this.f197638b.scrollToPosition(0);
            this.f197646j = false;
        } else if (this.f197640d.f182609f != -1) {
            this.f197638b.scrollToPosition(i);
            this.f197640d.f182609f = -1;
        } else if (t8c.m189652e().f172520a && t8c.m189652e().f172522c > 0) {
            this.f197638b.scrollToPosition(t8c.m189652e().f172522c);
            t8c.m189652e().f172520a = false;
            t8c.m189652e().f172522c = -1;
            t8c.m189652e().f172521b = null;
        }
        this.f197645i = true;
    }

    /* JADX INFO: renamed from: F */
    public void m214386F() {
        if (NullChecker.m82487b(this.f197638b)) {
            this.f197638b.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m214387G(boolean z) {
        this.f197641e.m65112r0(z);
    }

    /* JADX INFO: renamed from: H */
    public void m214388H() {
        this.f197638b.setOnScrollListener(new C21528c());
    }

    /* JADX INFO: renamed from: J */
    public void m214389J(boolean z) {
        this.f197643g = z;
    }

    /* JADX INFO: renamed from: K */
    public void m214390K(boolean z) {
        this.f197642f = z;
        if (z) {
            m214383B();
        } else if (NullChecker.m82486a(this.f197644h)) {
            this.f197644h.stop();
        }
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f197639c.act();
    }

    /* JADX INFO: renamed from: c */
    public View m214391c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z670.m218773b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m214392d() {
        z670.m218774c(this);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v670 v670Var) {
        this.f197640d = v670Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m214394f() {
        return this.f197638b == null || this.f197641e == null || !reh.m181027b();
    }

    /* JADX INFO: renamed from: i */
    public void m214395i() {
        this.f197638b.setItemAnimator(null);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo153734n = mo153734n(layoutInflater, viewGroup);
        mo153727I();
        m214395i();
        return viewMo153734n;
    }

    /* JADX INFO: renamed from: l */
    public void m214396l() {
        if (NullChecker.m82486a(this.f197639c.f42301C)) {
            this.f197641e = this.f197639c.f42301C.mo63219s0();
            s8h s8hVarMo63215X0 = this.f197639c.f42301C.mo63215X0();
            boolean zM82486a = NullChecker.m82486a(s8hVarMo63215X0);
            FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f197638b;
            if (zM82486a) {
                feedMaxHeightRecyclerView.setAdapter(s8hVarMo63215X0);
            } else {
                feedMaxHeightRecyclerView.setAdapter(this.f197641e);
            }
        } else {
            m214400s();
            this.f197638b.setAdapter(this.f197641e);
        }
        this.f197640d.mo149178e1();
        this.f197641e.m65111q0(this.f197640d.f182605b);
    }

    /* JADX INFO: renamed from: m */
    public void m214397m() {
        if (NullChecker.m82486a(this.f197647k)) {
            this.f197638b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f197647k);
        }
        this.f197638b.removeOnChildAttachStateChangeListener(this.f197648l);
        this.f197638b.removeOnScrollListener(this.f197649m);
    }

    /* JADX INFO: renamed from: n */
    public View mo153734n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM214391c = m214391c(layoutInflater, viewGroup);
        viewM214391c.setBackgroundColor(this.f197639c.getResources().getColor(k9c0.f124526p0));
        if (FeedModule.m61406H().mo31695I4() && TextUtils.equals(this.f197640d.f182607d, "from_live_square_tab")) {
            this.f197638b.setBackgroundColor(0);
            this.f197637a.setBackgroundColor(0);
        }
        return viewM214391c;
    }

    /* JADX INFO: renamed from: p */
    public RecyclerView.AbstractC0579o m214398p() {
        return this.f197638b.getLayoutManager();
    }

    /* JADX INFO: renamed from: q */
    public String m214399q(int i) {
        return this.f197641e.m65093V(i);
    }

    /* JADX INFO: renamed from: s */
    public C11443a m214400s() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f197639c;
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f197638b;
        v670 v670Var = this.f197640d;
        C11443a c11443a = new C11443a(photoAlbumBaseFrag, feedMaxHeightRecyclerView, v670Var.f182606c, v670Var.f182607d, v670Var.f182611h, v670Var.f182608e);
        this.f197641e = c11443a;
        return c11443a;
    }

    /* JADX INFO: renamed from: u */
    public void m214401u() {
        if (this.f197640d.m200037k1()) {
            return;
        }
        if (this.f197644h == null) {
            this.f197644h = new ye80();
        }
        this.f197644h.mo139591a(this.f197640d.f182607d);
        this.f197638b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.w670
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f187597a.m214402x(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void mo153735v(Bundle bundle) {
        this.f197638b.addOnChildAttachStateChangeListener(this.f197648l);
        this.f197638b.addOnScrollListener(this.f197649m);
        m214401u();
        if (j4h.m143420d() && (this.f197640d.f182605b instanceof bg20)) {
            this.f197638b.setDescendantFocusability(393216);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean mo153736w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m214402x(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f197645i) {
            this.f197645i = false;
            if (this.f197642f) {
                m214383B();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m214403y() {
        if (NullChecker.m82486a(this.f197639c.f42301C)) {
            this.f197639c.f42301C.mo63218p();
        }
        this.f197640d.m200007F1();
    }

    /* JADX INFO: renamed from: z */
    public void mo153737z() {
        l51.m152887G(new Runnable() { // from class: l.x670
            @Override // java.lang.Runnable
            public final void run() {
                this.f192561a.m214386F();
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void mo153727I() {
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.y670$a */
    public class C21526a implements RecyclerView.InterfaceC0581q {
        public C21526a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: b */
        public void mo3422b(View view) {
            PhotoAlbumPictureView.m65042u(view, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: d */
        public void mo3423d(View view) {
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo153728L(boolean z) {
    }

    /* JADX INFO: renamed from: l.y670$b */
    public class C21527b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public int f197651a = 0;

        public C21527b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            y670.this.f197640d.m200008H1(i, this.f197651a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.y670$c */
    public class C21528c extends RecyclerView.AbstractC0584t {
        public C21528c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            pf60<Integer, Integer> pf60VarM200030b1 = y670.this.f197640d.m200030b1();
            if (i == 0 && NullChecker.m82486a(pf60VarM200030b1)) {
                y670.this.f197640d.m200009I1(pf60VarM200030b1.f152156a.intValue(), pf60VarM200030b1.f152157b.intValue());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }
}
