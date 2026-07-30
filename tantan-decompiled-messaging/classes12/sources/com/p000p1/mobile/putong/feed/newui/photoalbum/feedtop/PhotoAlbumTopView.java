package com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;
import l.roj0;
import l.t100;
import l.wc80;
import l.xdl0;
import p007l.e1c0;
import p007l.e6i;
import p007l.g6i;
import p007l.l6i;
import p007l.nkg;
import p007l.q6i;
import p007l.wlh;
import p007l.xa70;
import p007l.z5i;
import p007l.zll;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumTopView extends VFrame {

    /* JADX INFO: renamed from: k */
    public static final int f3406k = R$string.f427R2;

    /* JADX INFO: renamed from: a */
    public zll<PhotoAlbumTopView> f3407a;

    /* JADX INFO: renamed from: b */
    public C2145a f3408b;

    /* JADX INFO: renamed from: c */
    public xa70 f3409c;

    /* JADX INFO: renamed from: d */
    public View f3410d;

    /* JADX INFO: renamed from: e */
    public View f3411e;

    /* JADX INFO: renamed from: f */
    public TextView f3412f;

    /* JADX INFO: renamed from: g */
    public VText f3413g;

    /* JADX INFO: renamed from: h */
    public VText f3414h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f3415i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f3416j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView$a */
    public class C2145a {

        /* JADX INFO: renamed from: a */
        public z5i f3417a;

        /* JADX INFO: renamed from: b */
        public q6i f3418b;

        /* JADX INFO: renamed from: c */
        public l6i f3419c;

        /* JADX INFO: renamed from: d */
        public e6i f3420d;

        public C2145a() {
        }

        /* JADX INFO: renamed from: a */
        public g6i m5807a() {
            if (this.f3420d == null) {
                this.f3420d = new e6i((wlh) PhotoAlbumTopView.this.f3407a, PhotoAlbumTopView.this.f3409c);
            }
            return this.f3420d;
        }

        /* JADX INFO: renamed from: b */
        public z5i m5808b() {
            if (this.f3417a == null) {
                this.f3417a = new z5i(PhotoAlbumTopView.this.f3407a, PhotoAlbumTopView.this.f3409c);
            }
            return this.f3417a;
        }

        /* JADX INFO: renamed from: c */
        public l6i m5809c() {
            if (this.f3419c == null) {
                this.f3419c = new l6i(PhotoAlbumTopView.this.f3407a, PhotoAlbumTopView.this.f3409c);
            }
            return this.f3419c;
        }

        /* JADX INFO: renamed from: d */
        public q6i m5810d() {
            if (this.f3418b == null) {
                this.f3418b = new q6i(PhotoAlbumTopView.this.f3407a, PhotoAlbumTopView.this.f3409c);
            }
            return this.f3418b;
        }
    }

    public PhotoAlbumTopView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    private C2145a getRenderFactory() {
        if (this.f3408b == null) {
            this.f3408b = new C2145a();
        }
        return this.f3408b;
    }

    /* JADX INFO: renamed from: B */
    public final void m5797B() {
        wlh wlhVar = new wlh();
        wlhVar.m15833e(this);
        this.f3407a = wlhVar;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5798C(roj0 roj0Var) {
        if (NullChecker.a(this.f3409c.f14820a) && TextUtils.equals(this.f3409c.f14820a.owner, FeedModule.m1139F().userId())) {
            xa70 xa70Var = this.f3409c;
            xa70Var.f14825f = FeedModule.f316d.m16628e8(xa70Var.f14820a.owner);
            getRenderFactory().m5807a().m10422i(this.f3409c);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m5799E(xa70 xa70Var) {
        this.f3409c = xa70Var;
        m5800F();
        m5801G();
    }

    /* JADX INFO: renamed from: F */
    public void m5800F() {
        if (nkg.m12250l0()) {
            act().duringCreated(FeedModule.f316d.f14915C1).subscribe(mkd0.G(new e30() { // from class: l.va70
                public final void call(Object obj) {
                    this.f14125a.m5798C((roj0) obj);
                }
            }));
        }
        getRenderFactory().m5807a().m10422i(this.f3409c);
    }

    /* JADX INFO: renamed from: G */
    public final void m5801G() {
        getRenderFactory().m5808b().m10422i(this.f3409c);
        getRenderFactory().m5810d().m10422i(this.f3409c);
        getRenderFactory().m5809c().m10422i(this.f3409c);
    }

    /* JADX INFO: renamed from: K */
    public String m5802K() {
        if (((Boolean) FeedModule.f316d.f14974e0.get()).booleanValue() || !NullChecker.a(this.f3409c.f14825f) || !NullChecker.a(this.f3409c.f14825f.specialEffect) || wc80.e().k() || TextUtils.equals(this.f3409c.f14820a.owner, FeedModule.m1139F().userId()) || !xdl0.O0(this.f3411e)) {
            return null;
        }
        FeedModule.f316d.f14974e0.put(Boolean.TRUE);
        return d.l().t(new a(act()).D("初来乍到，请多关照").k(new int[]{act().getResources().getColor(e1c0.f7154n)}).H(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)).J(13.0f).z(t100.d(10.0f)).E(true).b(3000L).q(a.Q | a.O).o(a.P, t100.d(5.0f)).x(-t100.d(2.0f)).w(-t100.d(1.0f)), this.f3411e);
    }

    public LinearLayout getAttention() {
        return this.f3415i;
    }

    public VText getDistance() {
        return this.f3414h;
    }

    public TextView getName() {
        return this.f3412f;
    }

    public View getProfile_pic() {
        return this.f3410d;
    }

    public VText getTime() {
        return this.f3413g;
    }

    public View get_pic_container_labels_fl() {
        return this.f3416j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5797B();
        m5806z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        int iM5804v = m5804v(this.f3410d);
        int iM5805w = m5805w(this.f3410d);
        int iM5804v2 = m5804v(this.f3416j);
        int iM5805w2 = m5805w(this.f3416j);
        if (iM5804v2 >= iM5804v) {
            return;
        }
        xdl0.X(this.f3416j, ((iM5805w + this.f3410d.getHeight()) - (iM5805w2 + (this.f3416j.getHeight() / 2))) - t100.d(2.0f));
        xdl0.V(this.f3416j, iM5804v);
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public void m5803u() {
        getRenderFactory().m5807a().mo9662a();
    }

    /* JADX INFO: renamed from: v */
    public final int m5804v(View view) {
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
    public final int m5805w(View view) {
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
    public final void m5806z() {
        zll<PhotoAlbumTopView> zllVar = this.f3407a;
        if (zllVar instanceof wlh) {
            wlh wlhVar = (wlh) zllVar;
            this.f3410d = wlhVar.f14606o;
            this.f3412f = wlhVar.f14612u;
            this.f3413g = wlhVar.f14583O;
            this.f3414h = wlhVar.f14585Q;
            this.f3411e = wlhVar.f14609r;
            this.f3415i = wlhVar.f14601j;
            this.f3416j = wlhVar.f14587S;
        }
    }

    public PhotoAlbumTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
