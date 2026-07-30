package com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VText;
import p153l.a8i;
import p153l.bnl0;
import p153l.cl80;
import p153l.cmg;
import p153l.dj70;
import p153l.f8i;
import p153l.k9c0;
import p153l.lnh;
import p153l.lol;
import p153l.o7i;
import p153l.psd0;
import p153l.qa00;
import p153l.t7i;
import p153l.uxj0;
import p153l.v7i;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumTopView extends VFrame {

    /* JADX INFO: renamed from: k */
    public static final int f42793k = R$string.f39814R2;

    /* JADX INFO: renamed from: a */
    public lol<PhotoAlbumTopView> f42794a;

    /* JADX INFO: renamed from: b */
    public C11464a f42795b;

    /* JADX INFO: renamed from: c */
    public dj70 f42796c;

    /* JADX INFO: renamed from: d */
    public View f42797d;

    /* JADX INFO: renamed from: e */
    public View f42798e;

    /* JADX INFO: renamed from: f */
    public TextView f42799f;

    /* JADX INFO: renamed from: g */
    public VText f42800g;

    /* JADX INFO: renamed from: h */
    public VText f42801h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f42802i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f42803j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView$a */
    public class C11464a {

        /* JADX INFO: renamed from: a */
        public o7i f42804a;

        /* JADX INFO: renamed from: b */
        public f8i f42805b;

        /* JADX INFO: renamed from: c */
        public a8i f42806c;

        /* JADX INFO: renamed from: d */
        public t7i f42807d;

        public C11464a() {
        }

        /* JADX INFO: renamed from: a */
        public v7i m65896a() {
            if (this.f42807d == null) {
                this.f42807d = new t7i((lnh) PhotoAlbumTopView.this.f42794a, PhotoAlbumTopView.this.f42796c);
            }
            return this.f42807d;
        }

        /* JADX INFO: renamed from: b */
        public o7i m65897b() {
            if (this.f42804a == null) {
                this.f42804a = new o7i(PhotoAlbumTopView.this.f42794a, PhotoAlbumTopView.this.f42796c);
            }
            return this.f42804a;
        }

        /* JADX INFO: renamed from: c */
        public a8i m65898c() {
            if (this.f42806c == null) {
                this.f42806c = new a8i(PhotoAlbumTopView.this.f42794a, PhotoAlbumTopView.this.f42796c);
            }
            return this.f42806c;
        }

        /* JADX INFO: renamed from: d */
        public f8i m65899d() {
            if (this.f42805b == null) {
                this.f42805b = new f8i(PhotoAlbumTopView.this.f42794a, PhotoAlbumTopView.this.f42796c);
            }
            return this.f42805b;
        }
    }

    public PhotoAlbumTopView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    private C11464a getRenderFactory() {
        if (this.f42795b == null) {
            this.f42795b = new C11464a();
        }
        return this.f42795b;
    }

    /* JADX INFO: renamed from: B */
    public final void m65886B() {
        lnh lnhVar = new lnh();
        lnhVar.m154982e(this);
        this.f42794a = lnhVar;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m65887C(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.f42796c.f88791a) && TextUtils.equals(this.f42796c.f88791a.owner, FeedModule.m61405F().userId())) {
            dj70 dj70Var = this.f42796c;
            dj70Var.f88796f = FeedModule.f39703d.m145688e8(dj70Var.f88791a.owner);
            getRenderFactory().m65896a().m200211i(this.f42796c);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m65888E(dj70 dj70Var) {
        this.f42796c = dj70Var;
        m65889F();
        m65890G();
    }

    /* JADX INFO: renamed from: F */
    public void m65889F() {
        if (cmg.m111220l0()) {
            act().duringCreated(FeedModule.f39703d.f121290C1).subscribe(psd0.m173596G(new y20() { // from class: l.bj70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76963a.m65887C((uxj0) obj);
                }
            }));
        }
        getRenderFactory().m65896a().m200211i(this.f42796c);
    }

    /* JADX INFO: renamed from: G */
    public final void m65890G() {
        getRenderFactory().m65897b().m200211i(this.f42796c);
        getRenderFactory().m65899d().m200211i(this.f42796c);
        getRenderFactory().m65898c().m200211i(this.f42796c);
    }

    /* JADX INFO: renamed from: K */
    public String m65891K() {
        if (FeedModule.f39703d.f121349e0.get().booleanValue() || !NullChecker.m82486a(this.f42796c.f88796f) || !NullChecker.m82486a(this.f42796c.f88796f.specialEffect) || cl80.m110426e().m110433k() || TextUtils.equals(this.f42796c.f88791a.owner, FeedModule.m61405F().userId()) || !bnl0.m105529O0(this.f42798e)) {
            return null;
        }
        FeedModule.f39703d.f121349e0.put(Boolean.TRUE);
        return C4499d.m21895l().m21907t(new C4496a(act()).m21848D("初来乍到，请多关照").m21869k(act().getResources().getColor(k9c0.f124521n)).m21852H(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)).m21854J(13.0f).m21883z(qa00.m175859d(10.0f)).m21849E(true).m21860b(3000L).m21874q(C4496a.f16402Q | C4496a.f16400O).m21872o(C4496a.f16401P, qa00.m175859d(5.0f)).m21881x(-qa00.m175859d(2.0f)).m21880w(-qa00.m175859d(1.0f)), this.f42798e);
    }

    public LinearLayout getAttention() {
        return this.f42802i;
    }

    public VText getDistance() {
        return this.f42801h;
    }

    public TextView getName() {
        return this.f42799f;
    }

    public View getProfile_pic() {
        return this.f42797d;
    }

    public VText getTime() {
        return this.f42800g;
    }

    public View get_pic_container_labels_fl() {
        return this.f42803j;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65886B();
        m65895z();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iM65893v = m65893v(this.f42797d);
        int iM65894w = m65894w(this.f42797d);
        int iM65893v2 = m65893v(this.f42803j);
        int iM65894w2 = m65894w(this.f42803j);
        if (iM65893v2 >= iM65893v) {
            return;
        }
        bnl0.m105540X(this.f42803j, ((iM65894w + this.f42797d.getHeight()) - (iM65894w2 + (this.f42803j.getHeight() / 2))) - qa00.m175859d(2.0f));
        bnl0.m105538V(this.f42803j, iM65893v);
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public void m65892u() {
        getRenderFactory().m65896a().mo189599a();
    }

    /* JADX INFO: renamed from: v */
    public final int m65893v(View view) {
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
    public final int m65894w(View view) {
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
    public final void m65895z() {
        lol<PhotoAlbumTopView> lolVar = this.f42794a;
        if (lolVar instanceof lnh) {
            lnh lnhVar = (lnh) lolVar;
            this.f42797d = lnhVar.f132812o;
            this.f42799f = lnhVar.f132818u;
            this.f42800g = lnhVar.f132789O;
            this.f42801h = lnhVar.f132791Q;
            this.f42798e = lnhVar.f132815r;
            this.f42802i = lnhVar.f132807j;
            this.f42803j = lnhVar.f132793S;
        }
    }

    public PhotoAlbumTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
