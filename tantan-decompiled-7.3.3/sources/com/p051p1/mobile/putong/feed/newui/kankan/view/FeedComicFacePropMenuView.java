package com.p051p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AbstractC0619w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.kankan.view.properties.AnimLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.a30;
import p153l.bkj0;
import p153l.bnl0;
import p153l.df3;
import p153l.ezq;
import p153l.fq50;
import p153l.fwg;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.lbc0;
import p153l.nzb;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.qwg;
import p153l.x20;
import p153l.xc4;
import p153l.y20;
import p153l.ywg;
import p153l.z20;
import p153l.zf5;

/* JADX INFO: loaded from: classes13.dex */
public class FeedComicFacePropMenuView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public kcg0 f41050A;

    /* JADX INFO: renamed from: B */
    public ViewPager2.AbstractC0742i f41051B;

    /* JADX INFO: renamed from: C */
    public int f41052C;

    /* JADX INFO: renamed from: a */
    public VText f41053a;

    /* JADX INFO: renamed from: b */
    public FeedCircleProgressBar f41054b;

    /* JADX INFO: renamed from: c */
    public FeedCircleProgressBar f41055c;

    /* JADX INFO: renamed from: d */
    public ImageView f41056d;

    /* JADX INFO: renamed from: e */
    public ImageView f41057e;

    /* JADX INFO: renamed from: f */
    public ViewPager2 f41058f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f41059g;

    /* JADX INFO: renamed from: h */
    public C11374a f41060h;

    /* JADX INFO: renamed from: i */
    public fwg f41061i;

    /* JADX INFO: renamed from: j */
    public List<CameraCategory> f41062j;

    /* JADX INFO: renamed from: k */
    public Set<String> f41063k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f41064l;

    /* JADX INFO: renamed from: m */
    public AbstractC0619w f41065m;

    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC0578n f41066n;

    /* JADX INFO: renamed from: o */
    public int f41067o;

    /* JADX INFO: renamed from: p */
    public int f41068p;

    /* JADX INFO: renamed from: q */
    public a30<Integer, CameraSticker, Boolean> f41069q;

    /* JADX INFO: renamed from: r */
    public x20 f41070r;

    /* JADX INFO: renamed from: s */
    public x20 f41071s;

    /* JADX INFO: renamed from: t */
    public x20 f41072t;

    /* JADX INFO: renamed from: u */
    public x20 f41073u;

    /* JADX INFO: renamed from: v */
    public FeedCircleProgressBar.InterfaceC11367b f41074v;

    /* JADX INFO: renamed from: w */
    public boolean f41075w;

    /* JADX INFO: renamed from: x */
    public int f41076x;

    /* JADX INFO: renamed from: y */
    public boolean f41077y;

    /* JADX INFO: renamed from: z */
    public x20 f41078z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$a */
    public class C11368a implements x20 {
        public C11368a() {
        }

        @Override // p153l.x20
        public void call() {
            FeedComicFacePropMenuView.this.f41055c.m63285o();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$b */
    public class C11369b extends ViewPager2.AbstractC0742i {
        public C11369b() {
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m63341d(int i, pf60 pf60Var) {
            RecyclerView recyclerViewM63355I = FeedComicFacePropMenuView.this.f41060h.m63355I(i);
            if (recyclerViewM63355I != null) {
                int i2 = FeedComicFacePropMenuView.this.f41076x;
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                if (i2 == 0) {
                    bnl0.m105525M0(feedComicFacePropMenuView.f41054b, false);
                    bnl0.m105525M0(FeedComicFacePropMenuView.this.f41058f, false);
                    return;
                }
                bnl0.m105525M0(feedComicFacePropMenuView.f41054b, true);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41058f, true);
                ywg ywgVar = (ywg) recyclerViewM63355I.getAdapter();
                CameraSticker cameraSticker = (CameraSticker) ((List) pf60Var.f152156a).get(1);
                int itemCount = ywgVar.getItemCount();
                if (cameraSticker == null || itemCount <= 1) {
                    return;
                }
                ywgVar.f201831f.call(new bkj0<>(cameraSticker, 1, Boolean.FALSE));
                ezq.m123398c(recyclerViewM63355I, 1);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m63342e(RecyclerView recyclerView) {
            int i = FeedComicFacePropMenuView.this.f41076x;
            FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
            if (i == 0) {
                bnl0.m105525M0(feedComicFacePropMenuView.f41054b, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41058f, false);
                return;
            }
            bnl0.m105525M0(feedComicFacePropMenuView.f41054b, true);
            bnl0.m105525M0(FeedComicFacePropMenuView.this.f41058f, true);
            ywg ywgVar = (ywg) recyclerView.getAdapter();
            CameraSticker item = ((ywg) recyclerView.getAdapter()).getItem(1);
            int itemCount = ywgVar.getItemCount();
            if (item == null || itemCount <= 1) {
                return;
            }
            ywgVar.f201831f.call(new bkj0<>(item, 1, Boolean.FALSE));
            ezq.m123398c(recyclerView, 1);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(final int i) {
            final RecyclerView recyclerViewM63355I = FeedComicFacePropMenuView.this.f41060h.m63355I(i);
            if (recyclerViewM63355I != null && recyclerViewM63355I.getAdapter().getItemCount() != 0) {
                fq50.m126731a(recyclerViewM63355I, new Runnable() { // from class: l.pwg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f154401a.m63342e(recyclerViewM63355I);
                    }
                });
            } else {
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                feedComicFacePropMenuView.f41050A = feedComicFacePropMenuView.f41060h.f41093j.subscribe(psd0.m173597H(new y20() { // from class: l.nwg
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f143956a.m63341d(i, (pf60) obj);
                    }
                }, new y20() { // from class: l.owg
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((Throwable) obj).getMessage();
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$c */
    public class C11370c implements FeedCircleProgressBar.InterfaceC11367b {
        public C11370c() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11367b
        /* JADX INFO: renamed from: a */
        public void mo63297a(int i) {
            FeedComicFacePropMenuView.this.f41068p = i;
            if (i == 100) {
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                bnl0.m105525M0(feedComicFacePropMenuView.f41054b, feedComicFacePropMenuView.f41076x != 0);
                FeedComicFacePropMenuView feedComicFacePropMenuView2 = FeedComicFacePropMenuView.this;
                bnl0.m105525M0(feedComicFacePropMenuView2.f41058f, feedComicFacePropMenuView2.f41076x != 0);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41059g, true);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41056d, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41057e, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41053a, false);
            } else if (i == 101) {
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41054b, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41058f, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41059g, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41056d, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41057e, false);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41053a, true);
            } else if (i == 102) {
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41056d, true);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41057e, true);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41053a, true);
                long jM63275N = FeedComicFacePropMenuView.this.f41055c.m63275N();
                FeedComicFacePropMenuView feedComicFacePropMenuView3 = FeedComicFacePropMenuView.this;
                if (jM63275N < 3000) {
                    feedComicFacePropMenuView3.f41057e.setImageResource(lbc0.f131066j3);
                } else {
                    feedComicFacePropMenuView3.f41057e.setImageResource(lbc0.f131058i3);
                }
                i4g0.m138492A("e_camera_video_next", "p_camera_video", new pf60("event_type", "MV"));
            } else if (i == 103) {
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41056d, true);
                bnl0.m105525M0(FeedComicFacePropMenuView.this.f41057e, true);
            }
            if (FeedComicFacePropMenuView.this.f41074v != null) {
                FeedComicFacePropMenuView.this.f41074v.mo63297a(i);
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11367b
        public void onEvent(int i, int i2) {
            if (i == 104) {
                if (FeedComicFacePropMenuView.this.f41055c.getCount() == 0) {
                    FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                    bnl0.m105525M0(feedComicFacePropMenuView.f41054b, feedComicFacePropMenuView.f41076x != 0);
                    FeedComicFacePropMenuView feedComicFacePropMenuView2 = FeedComicFacePropMenuView.this;
                    bnl0.m105525M0(feedComicFacePropMenuView2.f41058f, feedComicFacePropMenuView2.f41076x != 0);
                    bnl0.m105525M0(FeedComicFacePropMenuView.this.f41053a, false);
                    bnl0.m105525M0(FeedComicFacePropMenuView.this.f41059g, true);
                    bnl0.m105525M0(FeedComicFacePropMenuView.this.f41056d, false);
                    bnl0.m105525M0(FeedComicFacePropMenuView.this.f41057e, false);
                }
                long jM63275N = FeedComicFacePropMenuView.this.f41055c.m63275N();
                FeedComicFacePropMenuView feedComicFacePropMenuView3 = FeedComicFacePropMenuView.this;
                if (jM63275N < 3000) {
                    feedComicFacePropMenuView3.f41057e.setImageResource(lbc0.f131066j3);
                } else {
                    feedComicFacePropMenuView3.f41057e.setImageResource(lbc0.f131058i3);
                }
            } else if (i == 105) {
                FeedComicFacePropMenuView.this.f41053a.setText(Html.fromHtml(String.format("<b><font size=\"5\">%d</font><font size=\"3\">s</font></b>", Integer.valueOf(FeedComicFacePropMenuView.this.m63331t(0, 15, i2)))));
            }
            if (FeedComicFacePropMenuView.this.f41074v != null) {
                FeedComicFacePropMenuView.this.f41074v.onEvent(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$d */
    public class C11371d implements InterfaceC11373f {
        public C11371d() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11373f
        /* JADX INFO: renamed from: a */
        public void mo63343a(boolean z, int i) {
            CameraCategory cameraCategory = (CameraCategory) FeedComicFacePropMenuView.this.f41062j.get(i);
            if (!z || FeedComicFacePropMenuView.this.f41063k.contains(cameraCategory.f40065id)) {
                return;
            }
            FeedComicFacePropMenuView.this.f41063k.add(cameraCategory.f40065id);
            i4g0.m138492A("e_camera_video_effect", "p_camera_video", jyb.m147494Y("special_effects_id", cameraCategory.f40065id));
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11373f
        /* JADX INFO: renamed from: b */
        public void mo63344b(List<Integer> list) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$e */
    public class C11372e extends RecyclerView.AbstractC0584t {
        public C11372e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            View viewMo3812h;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || (viewMo3812h = FeedComicFacePropMenuView.this.f41065m.mo3812h(FeedComicFacePropMenuView.this.f41064l)) == null) {
                return;
            }
            int iM3416a = ((RecyclerView.C0580p) viewMo3812h.getLayoutParams()).m3416a();
            FeedComicFacePropMenuView.this.m63333v((CameraCategory) FeedComicFacePropMenuView.this.f41062j.get(iM3416a), iM3416a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            FeedComicFacePropMenuView.this.f41052C += i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$f */
    public interface InterfaceC11373f {
        /* JADX INFO: renamed from: a */
        void mo63343a(boolean z, int i);

        /* JADX INFO: renamed from: b */
        void mo63344b(List<Integer> list);
    }

    public FeedComicFacePropMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41062j = new ArrayList();
        this.f41063k = new HashSet();
        this.f41067o = bnl0.m105587w(88.0f);
        this.f41068p = 2;
        this.f41075w = false;
        this.f41076x = 0;
        this.f41078z = new C11368a();
        this.f41051B = new C11369b();
        this.f41052C = 0;
        m63334w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m63322A(View view) {
        long jM63275N = this.f41055c.m63275N();
        if (jM63275N < 3000 && Math.abs(jM63275N - 3000) > 900) {
            o1j0.m165634h(R$string.f39716B0);
            return;
        }
        this.f41068p = 103;
        this.f41074v.mo63297a(103);
        i4g0.m138520r("e_camera_video_next", "p_camera_video");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m63323B() {
        if (this.f41061i.getItemCount() > 2) {
            ezq.m123398c(this.f41059g, 2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final CameraCategory m63324C() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.f40065id = "0";
        return cameraCategory;
    }

    /* JADX INFO: renamed from: D */
    public void m63325D() {
        kcg0 kcg0Var = this.f41050A;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m63326E() {
        x20 x20Var = this.f41070r;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m63327F() {
        this.f41055c.m63273L();
        if (this.f41076x != 0) {
            bnl0.m105525M0(this.f41054b, true);
            bnl0.m105525M0(this.f41058f, true);
        }
        bnl0.m105525M0(this.f41059g, true);
        bnl0.m105525M0(this.f41056d, false);
        bnl0.m105525M0(this.f41057e, false);
        bnl0.m105525M0(this.f41053a, false);
    }

    /* JADX INFO: renamed from: G */
    public final void m63328G() {
        if (this.f41075w) {
            return;
        }
        this.f41075w = true;
        bnl0.m105525M0(this.f41058f, true);
        bnl0.m105525M0(this.f41054b, true);
        this.f41060h.m63362Q(this.f41062j);
        this.f41060h.m63364S(this.f41069q);
        this.f41060h.m63363R(this.f41070r);
        this.f41061i.m127765E(this.f41062j);
        this.f41059g.addOnScrollListener(new C11372e());
        this.f41058f.setOffscreenPageLimit(5);
        this.f41058f.m4249g(this.f41051B);
        fq50.m126731a(this.f41059g, new Runnable() { // from class: l.mwg
            @Override // java.lang.Runnable
            public final void run() {
                this.f139093a.m63323B();
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public void m63329H(int i) {
        this.f41055c.m63286p(i);
    }

    public int getState() {
        return this.f41068p;
    }

    /* JADX INFO: renamed from: s */
    public View m63330s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qwg.m178477b(this, layoutInflater, viewGroup);
    }

    public void setCancel(x20 x20Var) {
        this.f41070r = x20Var;
    }

    public void setCategoryData(List<CameraCategory> list) {
        this.f41062j.clear();
        if (list == null) {
            this.f41062j = new ArrayList();
        } else {
            this.f41062j.addAll(list);
        }
        this.f41062j.add(0, m63324C());
        m63328G();
    }

    public void setDelete(x20 x20Var) {
        this.f41071s = x20Var;
    }

    public void setOnPause(x20 x20Var) {
        this.f41073u = x20Var;
    }

    public void setOnPropSelect(a30<Integer, CameraSticker, Boolean> a30Var) {
        this.f41069q = a30Var;
    }

    public void setOnRecord(x20 x20Var) {
        this.f41072t = x20Var;
    }

    public void setStateListener(FeedCircleProgressBar.InterfaceC11367b interfaceC11367b) {
        this.f41074v = interfaceC11367b;
    }

    /* JADX INFO: renamed from: t */
    public final int m63331t(int i, int i2, int i3) {
        if (i3 <= i) {
            return i;
        }
        return i3 >= i2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: u */
    public final void m63332u(CameraCategory cameraCategory, int i) {
        List<CameraCategory> list = this.f41062j;
        if (list == null || list.size() == 0) {
            o1j0.m165636j("资源加载中，请稍后再试");
            return;
        }
        if (i == this.f41076x) {
            CameraSticker cameraStickerM210116b = xc4.m210114c().m210116b();
            if (cameraStickerM210116b == null || !cameraStickerM210116b.hasModelFile) {
                return;
            }
            this.f41078z.call();
            return;
        }
        ezq.m123398c(this.f41059g, i);
        this.f41058f.m4252j(i, false);
        boolean z = i != 0;
        this.f41076x = i;
        if (!z) {
            xc4.m210114c().m210125l(null);
            xc4.m210114c().m210126m(null);
            m63326E();
        }
        bnl0.m105525M0(this.f41054b, z);
        bnl0.m105525M0(this.f41058f, z);
        i4g0.m138523u("e_camera_video_effect", "p_camera_video", new pf60("special_effects_id", cameraCategory.f40065id));
    }

    /* JADX INFO: renamed from: v */
    public final void m63333v(CameraCategory cameraCategory, int i) {
        if (i == this.f41076x) {
            return;
        }
        ezq.m123398c(this.f41059g, i);
        this.f41058f.m4252j(i, false);
        boolean z = i != 0;
        this.f41076x = i;
        if (!z) {
            m63326E();
        }
        bnl0.m105525M0(this.f41054b, z);
        bnl0.m105525M0(this.f41058f, z);
        if (this.f41077y) {
            i4g0.m138523u("e_camera_video_effect", "p_camera_video", new pf60("special_effects_id", cameraCategory.f40065id));
        }
        this.f41077y = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m63334w() {
        addView(m63330s(LayoutInflater.from(getContext()), this));
        this.f41058f.setUserInputEnabled(false);
        this.f41064l = new AnimLinearLayoutManager(getContext(), 0);
        fwg fwgVar = new fwg(getContext());
        this.f41061i = fwgVar;
        fwgVar.m127766F(new z20() { // from class: l.iwg
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f117268a.m63335x((CameraCategory) obj, (Integer) obj2);
            }
        });
        C11374a c11374a = new C11374a(getContext());
        this.f41060h = c11374a;
        this.f41058f.setAdapter(c11374a);
        this.f41065m = new nzb();
        this.f41066n = new df3(2, this.f41067o, true);
        this.f41055c.setStateListener(new C11370c());
        this.f41055c.setOnClickListener(new View.OnClickListener() { // from class: l.jwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122917a.m63336y(view);
            }
        });
        this.f41056d.setOnClickListener(new View.OnClickListener() { // from class: l.kwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129065a.m63337z(view);
            }
        });
        this.f41057e.setOnClickListener(new View.OnClickListener() { // from class: l.lwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133811a.m63322A(view);
            }
        });
        this.f41059g.setItemViewCacheSize(5);
        this.f41059g.setLayoutManager(this.f41064l);
        this.f41059g.setAdapter(this.f41061i);
        this.f41059g.addItemDecoration(this.f41066n);
        this.f41065m.mo3858b(this.f41059g);
        zf5.m219527f(this.f41059g, new C11371d(), false);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m63335x(CameraCategory cameraCategory, Integer num) {
        m63332u(cameraCategory, num.intValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m63336y(View view) {
        List<CameraCategory> list = this.f41062j;
        if (list == null || list.size() == 0) {
            o1j0.m165636j("资源加载中，请稍后再试");
            return;
        }
        long jM63263B = this.f41055c.m63263B();
        int iM63274M = this.f41055c.m63274M();
        int count = this.f41055c.getCount();
        if (iM63274M == 101 && count == 0 && jM63263B < 1000) {
            o1j0.m165636j("拍摄时长过短");
        } else {
            this.f41055c.m63285o();
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m63337z(View view) {
        x20 x20Var = this.f41071s;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    public FeedComicFacePropMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedComicFacePropMenuView(@NonNull Context context) {
        this(context, null);
    }
}
