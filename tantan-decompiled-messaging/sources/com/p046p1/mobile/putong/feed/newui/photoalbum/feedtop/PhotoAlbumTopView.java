package com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VText;
import p149l.e1c0;
import p149l.e30;
import p149l.e6i;
import p149l.g6i;
import p149l.l6i;
import p149l.mkd0;
import p149l.nkg;
import p149l.q6i;
import p149l.roj0;
import p149l.t100;
import p149l.wc80;
import p149l.wlh;
import p149l.xa70;
import p149l.xdl0;
import p149l.z5i;
import p149l.zll;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumTopView extends VFrame {

    /* JADX INFO: renamed from: k */
    public static final int f41945k = R$string.f38966R2;

    /* JADX INFO: renamed from: a */
    public zll<PhotoAlbumTopView> f41946a;

    /* JADX INFO: renamed from: b */
    public C11301a f41947b;

    /* JADX INFO: renamed from: c */
    public xa70 f41948c;

    /* JADX INFO: renamed from: d */
    public View f41949d;

    /* JADX INFO: renamed from: e */
    public View f41950e;

    /* JADX INFO: renamed from: f */
    public TextView f41951f;

    /* JADX INFO: renamed from: g */
    public VText f41952g;

    /* JADX INFO: renamed from: h */
    public VText f41953h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f41954i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f41955j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView$a */
    public class C11301a {

        /* JADX INFO: renamed from: a */
        public z5i f41956a;

        /* JADX INFO: renamed from: b */
        public q6i f41957b;

        /* JADX INFO: renamed from: c */
        public l6i f41958c;

        /* JADX INFO: renamed from: d */
        public e6i f41959d;

        public C11301a() {
        }

        /* JADX INFO: renamed from: a */
        public g6i m64713a() {
            if (this.f41959d == null) {
                this.f41959d = new e6i((wlh) PhotoAlbumTopView.this.f41946a, PhotoAlbumTopView.this.f41948c);
            }
            return this.f41959d;
        }

        /* JADX INFO: renamed from: b */
        public z5i m64714b() {
            if (this.f41956a == null) {
                this.f41956a = new z5i(PhotoAlbumTopView.this.f41946a, PhotoAlbumTopView.this.f41948c);
            }
            return this.f41956a;
        }

        /* JADX INFO: renamed from: c */
        public l6i m64715c() {
            if (this.f41958c == null) {
                this.f41958c = new l6i(PhotoAlbumTopView.this.f41946a, PhotoAlbumTopView.this.f41948c);
            }
            return this.f41958c;
        }

        /* JADX INFO: renamed from: d */
        public q6i m64716d() {
            if (this.f41957b == null) {
                this.f41957b = new q6i(PhotoAlbumTopView.this.f41946a, PhotoAlbumTopView.this.f41948c);
            }
            return this.f41957b;
        }
    }

    public PhotoAlbumTopView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    private C11301a getRenderFactory() {
        if (this.f41947b == null) {
            this.f41947b = new C11301a();
        }
        return this.f41947b;
    }

    /* JADX INFO: renamed from: B */
    public final void m64703B() {
        wlh wlhVar = new wlh();
        wlhVar.m203812e(this);
        this.f41946a = wlhVar;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m64704C(roj0 roj0Var) {
        if (NullChecker.m81303a(this.f41948c.f191689a) && TextUtils.equals(this.f41948c.f191689a.owner, FeedModule.m60221F().userId())) {
            xa70 xa70Var = this.f41948c;
            xa70Var.f191694f = FeedModule.f38855d.m209447e8(xa70Var.f191689a.owner);
            getRenderFactory().m64713a().m124594i(this.f41948c);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m64705E(xa70 xa70Var) {
        this.f41948c = xa70Var;
        m64706F();
        m64707G();
    }

    /* JADX INFO: renamed from: F */
    public void m64706F() {
        if (nkg.m159891l0()) {
            act().duringCreated(FeedModule.f38855d.f192980C1).subscribe(mkd0.m154955G(new e30() { // from class: l.va70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180713a.m64704C((roj0) obj);
                }
            }));
        }
        getRenderFactory().m64713a().m124594i(this.f41948c);
    }

    /* JADX INFO: renamed from: G */
    public final void m64707G() {
        getRenderFactory().m64714b().m124594i(this.f41948c);
        getRenderFactory().m64716d().m124594i(this.f41948c);
        getRenderFactory().m64715c().m124594i(this.f41948c);
    }

    /* JADX INFO: renamed from: K */
    public String m64708K() {
        if (FeedModule.f38855d.f193039e0.get().booleanValue() || !NullChecker.m81303a(this.f41948c.f191694f) || !NullChecker.m81303a(this.f41948c.f191694f.specialEffect) || wc80.m202636e().m202643k() || TextUtils.equals(this.f41948c.f191689a.owner, FeedModule.m60221F().userId()) || !xdl0.m208349O0(this.f41950e)) {
            return null;
        }
        FeedModule.f38855d.f193039e0.put(Boolean.TRUE);
        return C4348d.m20896l().m20908t(new C4345a(act()).m20849D("初来乍到，请多关照").m20870k(act().getResources().getColor(e1c0.f88798n)).m20853H(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)).m20855J(13.0f).m20884z(t100.m186890d(10.0f)).m20850E(true).m20861b(3000L).m20875q(C4345a.f15683Q | C4345a.f15681O).m20873o(C4345a.f15682P, t100.m186890d(5.0f)).m20882x(-t100.m186890d(2.0f)).m20881w(-t100.m186890d(1.0f)), this.f41950e);
    }

    public LinearLayout getAttention() {
        return this.f41954i;
    }

    public VText getDistance() {
        return this.f41953h;
    }

    public TextView getName() {
        return this.f41951f;
    }

    public View getProfile_pic() {
        return this.f41949d;
    }

    public VText getTime() {
        return this.f41952g;
    }

    public View get_pic_container_labels_fl() {
        return this.f41955j;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64703B();
        m64712z();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iM64710v = m64710v(this.f41949d);
        int iM64711w = m64711w(this.f41949d);
        int iM64710v2 = m64710v(this.f41955j);
        int iM64711w2 = m64711w(this.f41955j);
        if (iM64710v2 >= iM64710v) {
            return;
        }
        xdl0.m208360X(this.f41955j, ((iM64711w + this.f41949d.getHeight()) - (iM64711w2 + (this.f41955j.getHeight() / 2))) - t100.m186890d(2.0f));
        xdl0.m208358V(this.f41955j, iM64710v);
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public void m64709u() {
        getRenderFactory().m64713a().mo115045a();
    }

    /* JADX INFO: renamed from: v */
    public final int m64710v(View view) {
        int left = view.getLeft();
        ViewParent parent = view.getParent();
        while (true) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup instanceof PhotoAlbumTopView) {
                return left;
            }
            left += viewGroup.getLeft();
            parent = viewGroup.getParent();
        }
    }

    /* JADX INFO: renamed from: w */
    public final int m64711w(View view) {
        int top = view.getTop();
        ViewParent parent = view.getParent();
        while (true) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup instanceof PhotoAlbumTopView) {
                return top;
            }
            top += viewGroup.getTop();
            parent = viewGroup.getParent();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m64712z() {
        zll<PhotoAlbumTopView> zllVar = this.f41946a;
        if (zllVar instanceof wlh) {
            wlh wlhVar = (wlh) zllVar;
            this.f41949d = wlhVar.f186940o;
            this.f41951f = wlhVar.f186946u;
            this.f41952g = wlhVar.f186917O;
            this.f41953h = wlhVar.f186919Q;
            this.f41950e = wlhVar.f186943r;
            this.f41954i = wlhVar.f186935j;
            this.f41955j = wlhVar.f186921S;
        }
    }

    public PhotoAlbumTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
