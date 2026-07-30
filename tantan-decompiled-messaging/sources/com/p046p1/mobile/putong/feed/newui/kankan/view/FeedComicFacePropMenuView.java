package com.p046p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AbstractC0617w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.kankan.view.properties.AnimLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.bvg;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.exq;
import p149l.f30;
import p149l.f3c0;
import p149l.g30;
import p149l.j760;
import p149l.jvg;
import p149l.lsi0;
import p149l.mkd0;
import p149l.oe3;
import p149l.qug;
import p149l.vwb;
import p149l.xaj0;
import p149l.xdl0;
import p149l.yb4;
import p149l.ze5;
import p149l.zh50;
import p149l.zvf0;
import p149l.zxb;

/* JADX INFO: loaded from: classes12.dex */
public class FeedComicFacePropMenuView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public c4g0 f40202A;

    /* JADX INFO: renamed from: B */
    public ViewPager2.AbstractC0740i f40203B;

    /* JADX INFO: renamed from: C */
    public int f40204C;

    /* JADX INFO: renamed from: a */
    public VText f40205a;

    /* JADX INFO: renamed from: b */
    public FeedCircleProgressBar f40206b;

    /* JADX INFO: renamed from: c */
    public FeedCircleProgressBar f40207c;

    /* JADX INFO: renamed from: d */
    public ImageView f40208d;

    /* JADX INFO: renamed from: e */
    public ImageView f40209e;

    /* JADX INFO: renamed from: f */
    public ViewPager2 f40210f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f40211g;

    /* JADX INFO: renamed from: h */
    public C11211a f40212h;

    /* JADX INFO: renamed from: i */
    public qug f40213i;

    /* JADX INFO: renamed from: j */
    public List<CameraCategory> f40214j;

    /* JADX INFO: renamed from: k */
    public Set<String> f40215k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f40216l;

    /* JADX INFO: renamed from: m */
    public AbstractC0617w f40217m;

    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC0576n f40218n;

    /* JADX INFO: renamed from: o */
    public int f40219o;

    /* JADX INFO: renamed from: p */
    public int f40220p;

    /* JADX INFO: renamed from: q */
    public g30<Integer, CameraSticker, Boolean> f40221q;

    /* JADX INFO: renamed from: r */
    public d30 f40222r;

    /* JADX INFO: renamed from: s */
    public d30 f40223s;

    /* JADX INFO: renamed from: t */
    public d30 f40224t;

    /* JADX INFO: renamed from: u */
    public d30 f40225u;

    /* JADX INFO: renamed from: v */
    public FeedCircleProgressBar.InterfaceC11204b f40226v;

    /* JADX INFO: renamed from: w */
    public boolean f40227w;

    /* JADX INFO: renamed from: x */
    public int f40228x;

    /* JADX INFO: renamed from: y */
    public boolean f40229y;

    /* JADX INFO: renamed from: z */
    public d30 f40230z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$a */
    public class C11205a implements d30 {
        public C11205a() {
        }

        @Override // p149l.d30
        public void call() {
            FeedComicFacePropMenuView.this.f40207c.m62102o();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$b */
    public class C11206b extends ViewPager2.AbstractC0740i {
        public C11206b() {
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m62158d(int i, j760 j760Var) {
            RecyclerView recyclerViewM62172I = FeedComicFacePropMenuView.this.f40212h.m62172I(i);
            if (recyclerViewM62172I != null) {
                int i2 = FeedComicFacePropMenuView.this.f40228x;
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                if (i2 == 0) {
                    xdl0.m208345M0(feedComicFacePropMenuView.f40206b, false);
                    xdl0.m208345M0(FeedComicFacePropMenuView.this.f40210f, false);
                    return;
                }
                xdl0.m208345M0(feedComicFacePropMenuView.f40206b, true);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40210f, true);
                jvg jvgVar = (jvg) recyclerViewM62172I.getAdapter();
                CameraSticker cameraSticker = (CameraSticker) ((List) j760Var.f116564a).get(1);
                int itemCount = jvgVar.getItemCount();
                if (cameraSticker == null || itemCount <= 1) {
                    return;
                }
                jvgVar.f119934f.call(new xaj0<>(cameraSticker, 1, Boolean.FALSE));
                exq.m118694c(recyclerViewM62172I, 1);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m62159e(RecyclerView recyclerView) {
            int i = FeedComicFacePropMenuView.this.f40228x;
            FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
            if (i == 0) {
                xdl0.m208345M0(feedComicFacePropMenuView.f40206b, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40210f, false);
                return;
            }
            xdl0.m208345M0(feedComicFacePropMenuView.f40206b, true);
            xdl0.m208345M0(FeedComicFacePropMenuView.this.f40210f, true);
            jvg jvgVar = (jvg) recyclerView.getAdapter();
            CameraSticker item = ((jvg) recyclerView.getAdapter()).getItem(1);
            int itemCount = jvgVar.getItemCount();
            if (item == null || itemCount <= 1) {
                return;
            }
            jvgVar.f119934f.call(new xaj0<>(item, 1, Boolean.FALSE));
            exq.m118694c(recyclerView, 1);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(final int i) {
            final RecyclerView recyclerViewM62172I = FeedComicFacePropMenuView.this.f40212h.m62172I(i);
            if (recyclerViewM62172I != null && recyclerViewM62172I.getAdapter().getItemCount() != 0) {
                zh50.m218766a(recyclerViewM62172I, new Runnable() { // from class: l.avg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f71933a.m62159e(recyclerViewM62172I);
                    }
                });
            } else {
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                feedComicFacePropMenuView.f40202A = feedComicFacePropMenuView.f40212h.f40245j.subscribe(mkd0.m154956H(new e30() { // from class: l.yug
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f200076a.m62158d(i, (j760) obj);
                    }
                }, new e30() { // from class: l.zug
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((Throwable) obj).getMessage();
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$c */
    public class C11207c implements FeedCircleProgressBar.InterfaceC11204b {
        public C11207c() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11204b
        /* JADX INFO: renamed from: a */
        public void mo62114a(int i) {
            FeedComicFacePropMenuView.this.f40220p = i;
            if (i == 100) {
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                xdl0.m208345M0(feedComicFacePropMenuView.f40206b, feedComicFacePropMenuView.f40228x != 0);
                FeedComicFacePropMenuView feedComicFacePropMenuView2 = FeedComicFacePropMenuView.this;
                xdl0.m208345M0(feedComicFacePropMenuView2.f40210f, feedComicFacePropMenuView2.f40228x != 0);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40211g, true);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40208d, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40209e, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40205a, false);
            } else if (i == 101) {
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40206b, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40210f, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40211g, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40208d, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40209e, false);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40205a, true);
            } else if (i == 102) {
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40208d, true);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40209e, true);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40205a, true);
                long jM62092N = FeedComicFacePropMenuView.this.f40207c.m62092N();
                FeedComicFacePropMenuView feedComicFacePropMenuView3 = FeedComicFacePropMenuView.this;
                if (jM62092N < 3000) {
                    feedComicFacePropMenuView3.f40209e.setImageResource(f3c0.f94548j3);
                } else {
                    feedComicFacePropMenuView3.f40209e.setImageResource(f3c0.f94540i3);
                }
                zvf0.m220368A("e_camera_video_next", "p_camera_video", new j760("event_type", "MV"));
            } else if (i == 103) {
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40208d, true);
                xdl0.m208345M0(FeedComicFacePropMenuView.this.f40209e, true);
            }
            if (FeedComicFacePropMenuView.this.f40226v != null) {
                FeedComicFacePropMenuView.this.f40226v.mo62114a(i);
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11204b
        public void onEvent(int i, int i2) {
            if (i == 104) {
                if (FeedComicFacePropMenuView.this.f40207c.getCount() == 0) {
                    FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                    xdl0.m208345M0(feedComicFacePropMenuView.f40206b, feedComicFacePropMenuView.f40228x != 0);
                    FeedComicFacePropMenuView feedComicFacePropMenuView2 = FeedComicFacePropMenuView.this;
                    xdl0.m208345M0(feedComicFacePropMenuView2.f40210f, feedComicFacePropMenuView2.f40228x != 0);
                    xdl0.m208345M0(FeedComicFacePropMenuView.this.f40205a, false);
                    xdl0.m208345M0(FeedComicFacePropMenuView.this.f40211g, true);
                    xdl0.m208345M0(FeedComicFacePropMenuView.this.f40208d, false);
                    xdl0.m208345M0(FeedComicFacePropMenuView.this.f40209e, false);
                }
                long jM62092N = FeedComicFacePropMenuView.this.f40207c.m62092N();
                FeedComicFacePropMenuView feedComicFacePropMenuView3 = FeedComicFacePropMenuView.this;
                if (jM62092N < 3000) {
                    feedComicFacePropMenuView3.f40209e.setImageResource(f3c0.f94548j3);
                } else {
                    feedComicFacePropMenuView3.f40209e.setImageResource(f3c0.f94540i3);
                }
            } else if (i == 105) {
                FeedComicFacePropMenuView.this.f40205a.setText(Html.fromHtml(String.format("<b><font size=\"5\">%d</font><font size=\"3\">s</font></b>", Integer.valueOf(FeedComicFacePropMenuView.this.m62148t(0, 15, i2)))));
            }
            if (FeedComicFacePropMenuView.this.f40226v != null) {
                FeedComicFacePropMenuView.this.f40226v.onEvent(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$d */
    public class C11208d implements InterfaceC11210f {
        public C11208d() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11210f
        /* JADX INFO: renamed from: a */
        public void mo62160a(boolean z, int i) {
            CameraCategory cameraCategory = (CameraCategory) FeedComicFacePropMenuView.this.f40214j.get(i);
            if (!z || FeedComicFacePropMenuView.this.f40215k.contains(cameraCategory.f39217id)) {
                return;
            }
            FeedComicFacePropMenuView.this.f40215k.add(cameraCategory.f39217id);
            zvf0.m220368A("e_camera_video_effect", "p_camera_video", vwb.m200311Y("special_effects_id", cameraCategory.f39217id));
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11210f
        /* JADX INFO: renamed from: b */
        public void mo62161b(List<Integer> list) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$e */
    public class C11209e extends RecyclerView.AbstractC0582t {
        public C11209e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            View viewMo3811h;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || (viewMo3811h = FeedComicFacePropMenuView.this.f40217m.mo3811h(FeedComicFacePropMenuView.this.f40216l)) == null) {
                return;
            }
            int iM3407a = ((RecyclerView.C0578p) viewMo3811h.getLayoutParams()).m3407a();
            FeedComicFacePropMenuView.this.m62150v((CameraCategory) FeedComicFacePropMenuView.this.f40214j.get(iM3407a), iM3407a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            FeedComicFacePropMenuView.this.f40204C += i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$f */
    public interface InterfaceC11210f {
        /* JADX INFO: renamed from: a */
        void mo62160a(boolean z, int i);

        /* JADX INFO: renamed from: b */
        void mo62161b(List<Integer> list);
    }

    public FeedComicFacePropMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40214j = new ArrayList();
        this.f40215k = new HashSet();
        this.f40219o = xdl0.m208407w(88.0f);
        this.f40220p = 2;
        this.f40227w = false;
        this.f40228x = 0;
        this.f40230z = new C11205a();
        this.f40203B = new C11206b();
        this.f40204C = 0;
        m62151w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m62139A(View view) {
        long jM62092N = this.f40207c.m62092N();
        if (jM62092N < 3000 && Math.abs(jM62092N - 3000) > 900) {
            lsi0.m151578h(R$string.f38868B0);
            return;
        }
        this.f40220p = 103;
        this.f40226v.mo62114a(103);
        zvf0.m220396r("e_camera_video_next", "p_camera_video");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m62140B() {
        if (this.f40213i.getItemCount() > 2) {
            exq.m118694c(this.f40211g, 2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final CameraCategory m62141C() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.f39217id = "0";
        return cameraCategory;
    }

    /* JADX INFO: renamed from: D */
    public void m62142D() {
        c4g0 c4g0Var = this.f40202A;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m62143E() {
        d30 d30Var = this.f40222r;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m62144F() {
        this.f40207c.m62090L();
        if (this.f40228x != 0) {
            xdl0.m208345M0(this.f40206b, true);
            xdl0.m208345M0(this.f40210f, true);
        }
        xdl0.m208345M0(this.f40211g, true);
        xdl0.m208345M0(this.f40208d, false);
        xdl0.m208345M0(this.f40209e, false);
        xdl0.m208345M0(this.f40205a, false);
    }

    /* JADX INFO: renamed from: G */
    public final void m62145G() {
        if (this.f40227w) {
            return;
        }
        this.f40227w = true;
        xdl0.m208345M0(this.f40210f, true);
        xdl0.m208345M0(this.f40206b, true);
        this.f40212h.m62179Q(this.f40214j);
        this.f40212h.m62181S(this.f40221q);
        this.f40212h.m62180R(this.f40222r);
        this.f40213i.m176603E(this.f40214j);
        this.f40211g.addOnScrollListener(new C11209e());
        this.f40210f.setOffscreenPageLimit(5);
        this.f40210f.m4247g(this.f40203B);
        zh50.m218766a(this.f40211g, new Runnable() { // from class: l.xug
            @Override // java.lang.Runnable
            public final void run() {
                this.f194496a.m62140B();
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public void m62146H(int i) {
        this.f40207c.m62103p(i);
    }

    public int getState() {
        return this.f40220p;
    }

    /* JADX INFO: renamed from: s */
    public View m62147s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bvg.m104033b(this, layoutInflater, viewGroup);
    }

    public void setCancel(d30 d30Var) {
        this.f40222r = d30Var;
    }

    public void setCategoryData(List<CameraCategory> list) {
        this.f40214j.clear();
        if (list == null) {
            this.f40214j = new ArrayList();
        } else {
            this.f40214j.addAll(list);
        }
        this.f40214j.add(0, m62141C());
        m62145G();
    }

    public void setDelete(d30 d30Var) {
        this.f40223s = d30Var;
    }

    public void setOnPause(d30 d30Var) {
        this.f40225u = d30Var;
    }

    public void setOnPropSelect(g30<Integer, CameraSticker, Boolean> g30Var) {
        this.f40221q = g30Var;
    }

    public void setOnRecord(d30 d30Var) {
        this.f40224t = d30Var;
    }

    public void setStateListener(FeedCircleProgressBar.InterfaceC11204b interfaceC11204b) {
        this.f40226v = interfaceC11204b;
    }

    /* JADX INFO: renamed from: t */
    public final int m62148t(int i, int i2, int i3) {
        if (i3 <= i) {
            return i;
        }
        return i3 >= i2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: u */
    public final void m62149u(CameraCategory cameraCategory, int i) {
        List<CameraCategory> list = this.f40214j;
        if (list == null || list.size() == 0) {
            lsi0.m151580j("资源加载中，请稍后再试");
            return;
        }
        if (i == this.f40228x) {
            CameraSticker cameraStickerM213938b = yb4.m213936c().m213938b();
            if (cameraStickerM213938b == null || !cameraStickerM213938b.hasModelFile) {
                return;
            }
            this.f40230z.call();
            return;
        }
        exq.m118694c(this.f40211g, i);
        this.f40210f.m4250j(i, false);
        boolean z = i != 0;
        this.f40228x = i;
        if (!z) {
            yb4.m213936c().m213947l(null);
            yb4.m213936c().m213948m(null);
            m62143E();
        }
        xdl0.m208345M0(this.f40206b, z);
        xdl0.m208345M0(this.f40210f, z);
        zvf0.m220399u("e_camera_video_effect", "p_camera_video", new j760("special_effects_id", cameraCategory.f39217id));
    }

    /* JADX INFO: renamed from: v */
    public final void m62150v(CameraCategory cameraCategory, int i) {
        if (i == this.f40228x) {
            return;
        }
        exq.m118694c(this.f40211g, i);
        this.f40210f.m4250j(i, false);
        boolean z = i != 0;
        this.f40228x = i;
        if (!z) {
            m62143E();
        }
        xdl0.m208345M0(this.f40206b, z);
        xdl0.m208345M0(this.f40210f, z);
        if (this.f40229y) {
            zvf0.m220399u("e_camera_video_effect", "p_camera_video", new j760("special_effects_id", cameraCategory.f39217id));
        }
        this.f40229y = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m62151w() {
        addView(m62147s(LayoutInflater.from(getContext()), this));
        this.f40210f.setUserInputEnabled(false);
        this.f40216l = new AnimLinearLayoutManager(getContext(), 0);
        qug qugVar = new qug(getContext());
        this.f40213i = qugVar;
        qugVar.m176604F(new f30() { // from class: l.tug
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f172169a.m62152x((CameraCategory) obj, (Integer) obj2);
            }
        });
        C11211a c11211a = new C11211a(getContext());
        this.f40212h = c11211a;
        this.f40210f.setAdapter(c11211a);
        this.f40217m = new zxb();
        this.f40218n = new oe3(2, this.f40219o, true);
        this.f40207c.setStateListener(new C11207c());
        this.f40207c.setOnClickListener(new View.OnClickListener() { // from class: l.uug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178379a.m62153y(view);
            }
        });
        this.f40208d.setOnClickListener(new View.OnClickListener() { // from class: l.vug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183061a.m62154z(view);
            }
        });
        this.f40209e.setOnClickListener(new View.OnClickListener() { // from class: l.wug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188113a.m62139A(view);
            }
        });
        this.f40211g.setItemViewCacheSize(5);
        this.f40211g.setLayoutManager(this.f40216l);
        this.f40211g.setAdapter(this.f40213i);
        this.f40211g.addItemDecoration(this.f40218n);
        this.f40217m.mo3857b(this.f40211g);
        ze5.m218277f(this.f40211g, new C11208d(), false);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m62152x(CameraCategory cameraCategory, Integer num) {
        m62149u(cameraCategory, num.intValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m62153y(View view) {
        List<CameraCategory> list = this.f40214j;
        if (list == null || list.size() == 0) {
            lsi0.m151580j("资源加载中，请稍后再试");
            return;
        }
        long jM62080B = this.f40207c.m62080B();
        int iM62091M = this.f40207c.m62091M();
        int count = this.f40207c.getCount();
        if (iM62091M == 101 && count == 0 && jM62080B < 1000) {
            lsi0.m151580j("拍摄时长过短");
        } else {
            this.f40207c.m62102o();
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m62154z(View view) {
        d30 d30Var = this.f40223s;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    public FeedComicFacePropMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedComicFacePropMenuView(@NonNull Context context) {
        this(context, null);
    }
}
