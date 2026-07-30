package com.p000p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.kankan.view.properties.AnimLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.c4g0;
import l.d30;
import l.e30;
import l.f30;
import l.g30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.zh50;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.bvg;
import p007l.exq;
import p007l.f3c0;
import p007l.jvg;
import p007l.oe3;
import p007l.qug;
import p007l.yb4;
import p007l.ze5;
import p007l.zxb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedComicFacePropMenuView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public c4g0 f1663A;

    /* JADX INFO: renamed from: B */
    public ViewPager2.i f1664B;

    /* JADX INFO: renamed from: C */
    public int f1665C;

    /* JADX INFO: renamed from: a */
    public VText f1666a;

    /* JADX INFO: renamed from: b */
    public FeedCircleProgressBar f1667b;

    /* JADX INFO: renamed from: c */
    public FeedCircleProgressBar f1668c;

    /* JADX INFO: renamed from: d */
    public ImageView f1669d;

    /* JADX INFO: renamed from: e */
    public ImageView f1670e;

    /* JADX INFO: renamed from: f */
    public ViewPager2 f1671f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f1672g;

    /* JADX INFO: renamed from: h */
    public C2055a f1673h;

    /* JADX INFO: renamed from: i */
    public qug f1674i;

    /* JADX INFO: renamed from: j */
    public List<CameraCategory> f1675j;

    /* JADX INFO: renamed from: k */
    public Set<String> f1676k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f1677l;

    /* JADX INFO: renamed from: m */
    public w f1678m;

    /* JADX INFO: renamed from: n */
    public RecyclerView.n f1679n;

    /* JADX INFO: renamed from: o */
    public int f1680o;

    /* JADX INFO: renamed from: p */
    public int f1681p;

    /* JADX INFO: renamed from: q */
    public g30<Integer, CameraSticker, Boolean> f1682q;

    /* JADX INFO: renamed from: r */
    public d30 f1683r;

    /* JADX INFO: renamed from: s */
    public d30 f1684s;

    /* JADX INFO: renamed from: t */
    public d30 f1685t;

    /* JADX INFO: renamed from: u */
    public d30 f1686u;

    /* JADX INFO: renamed from: v */
    public FeedCircleProgressBar.InterfaceC2048b f1687v;

    /* JADX INFO: renamed from: w */
    public boolean f1688w;

    /* JADX INFO: renamed from: x */
    public int f1689x;

    /* JADX INFO: renamed from: y */
    public boolean f1690y;

    /* JADX INFO: renamed from: z */
    public d30 f1691z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$a */
    public class C2049a implements d30 {
        public C2049a() {
        }

        public void call() {
            FeedComicFacePropMenuView.this.f1668c.m3084o();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$b */
    public class C2050b extends ViewPager2.i {
        public C2050b() {
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m3140d(int i, j760 j760Var) {
            RecyclerView recyclerViewM3154I = FeedComicFacePropMenuView.this.f1673h.m3154I(i);
            if (recyclerViewM3154I != null) {
                int i2 = FeedComicFacePropMenuView.this.f1689x;
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                if (i2 == 0) {
                    xdl0.M0(feedComicFacePropMenuView.f1667b, false);
                    xdl0.M0(FeedComicFacePropMenuView.this.f1671f, false);
                    return;
                }
                xdl0.M0(feedComicFacePropMenuView.f1667b, true);
                xdl0.M0(FeedComicFacePropMenuView.this.f1671f, true);
                jvg adapter = recyclerViewM3154I.getAdapter();
                CameraSticker cameraSticker = (CameraSticker) ((List) j760Var.a).get(1);
                int itemCount = adapter.getItemCount();
                if (cameraSticker == null || itemCount <= 1) {
                    return;
                }
                adapter.f9534f.call(new xaj0(cameraSticker, 1, Boolean.FALSE));
                exq.m9963c(recyclerViewM3154I, 1);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m3141e(RecyclerView recyclerView) {
            int i = FeedComicFacePropMenuView.this.f1689x;
            FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
            if (i == 0) {
                xdl0.M0(feedComicFacePropMenuView.f1667b, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1671f, false);
                return;
            }
            xdl0.M0(feedComicFacePropMenuView.f1667b, true);
            xdl0.M0(FeedComicFacePropMenuView.this.f1671f, true);
            jvg adapter = recyclerView.getAdapter();
            CameraSticker item = recyclerView.getAdapter().getItem(1);
            int itemCount = adapter.getItemCount();
            if (item == null || itemCount <= 1) {
                return;
            }
            adapter.f9534f.call(new xaj0(item, 1, Boolean.FALSE));
            exq.m9963c(recyclerView, 1);
        }

        public void onPageSelected(final int i) {
            final RecyclerView recyclerViewM3154I = FeedComicFacePropMenuView.this.f1673h.m3154I(i);
            if (recyclerViewM3154I != null && recyclerViewM3154I.getAdapter().getItemCount() != 0) {
                zh50.a(recyclerViewM3154I, new Runnable() { // from class: l.avg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5862a.m3141e(recyclerViewM3154I);
                    }
                });
            } else {
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                feedComicFacePropMenuView.f1663A = feedComicFacePropMenuView.f1673h.f1706j.subscribe(mkd0.H(new e30() { // from class: l.yug
                    public final void call(Object obj) {
                        this.f15503a.m3140d(i, (j760) obj);
                    }
                }, new e30() { // from class: l.zug
                    public final void call(Object obj) {
                        ((Throwable) obj).getMessage();
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$c */
    public class C2051c implements FeedCircleProgressBar.InterfaceC2048b {
        public C2051c() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC2048b
        /* JADX INFO: renamed from: a */
        public void mo3096a(int i) {
            FeedComicFacePropMenuView.this.f1681p = i;
            if (i == 100) {
                FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                xdl0.M0(feedComicFacePropMenuView.f1667b, feedComicFacePropMenuView.f1689x != 0);
                FeedComicFacePropMenuView feedComicFacePropMenuView2 = FeedComicFacePropMenuView.this;
                xdl0.M0(feedComicFacePropMenuView2.f1671f, feedComicFacePropMenuView2.f1689x != 0);
                xdl0.M0(FeedComicFacePropMenuView.this.f1672g, true);
                xdl0.M0(FeedComicFacePropMenuView.this.f1669d, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1670e, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1666a, false);
            } else if (i == 101) {
                xdl0.M0(FeedComicFacePropMenuView.this.f1667b, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1671f, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1672g, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1669d, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1670e, false);
                xdl0.M0(FeedComicFacePropMenuView.this.f1666a, true);
            } else if (i == 102) {
                xdl0.M0(FeedComicFacePropMenuView.this.f1669d, true);
                xdl0.M0(FeedComicFacePropMenuView.this.f1670e, true);
                xdl0.M0(FeedComicFacePropMenuView.this.f1666a, true);
                long jM3074N = FeedComicFacePropMenuView.this.f1668c.m3074N();
                FeedComicFacePropMenuView feedComicFacePropMenuView3 = FeedComicFacePropMenuView.this;
                if (jM3074N < 3000) {
                    feedComicFacePropMenuView3.f1670e.setImageResource(f3c0.f7831j3);
                } else {
                    feedComicFacePropMenuView3.f1670e.setImageResource(f3c0.f7823i3);
                }
                zvf0.A("e_camera_video_next", "p_camera_video", new j760[]{new j760("event_type", "MV")});
            } else if (i == 103) {
                xdl0.M0(FeedComicFacePropMenuView.this.f1669d, true);
                xdl0.M0(FeedComicFacePropMenuView.this.f1670e, true);
            }
            if (FeedComicFacePropMenuView.this.f1687v != null) {
                FeedComicFacePropMenuView.this.f1687v.mo3096a(i);
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC2048b
        public void onEvent(int i, int i2) {
            if (i == 104) {
                if (FeedComicFacePropMenuView.this.f1668c.getCount() == 0) {
                    FeedComicFacePropMenuView feedComicFacePropMenuView = FeedComicFacePropMenuView.this;
                    xdl0.M0(feedComicFacePropMenuView.f1667b, feedComicFacePropMenuView.f1689x != 0);
                    FeedComicFacePropMenuView feedComicFacePropMenuView2 = FeedComicFacePropMenuView.this;
                    xdl0.M0(feedComicFacePropMenuView2.f1671f, feedComicFacePropMenuView2.f1689x != 0);
                    xdl0.M0(FeedComicFacePropMenuView.this.f1666a, false);
                    xdl0.M0(FeedComicFacePropMenuView.this.f1672g, true);
                    xdl0.M0(FeedComicFacePropMenuView.this.f1669d, false);
                    xdl0.M0(FeedComicFacePropMenuView.this.f1670e, false);
                }
                long jM3074N = FeedComicFacePropMenuView.this.f1668c.m3074N();
                FeedComicFacePropMenuView feedComicFacePropMenuView3 = FeedComicFacePropMenuView.this;
                if (jM3074N < 3000) {
                    feedComicFacePropMenuView3.f1670e.setImageResource(f3c0.f7831j3);
                } else {
                    feedComicFacePropMenuView3.f1670e.setImageResource(f3c0.f7823i3);
                }
            } else if (i == 105) {
                FeedComicFacePropMenuView.this.f1666a.setText(Html.fromHtml(String.format("<b><font size=\"5\">%d</font><font size=\"3\">s</font></b>", Integer.valueOf(FeedComicFacePropMenuView.this.m3130t(0, 15, i2)))));
            }
            if (FeedComicFacePropMenuView.this.f1687v != null) {
                FeedComicFacePropMenuView.this.f1687v.onEvent(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$d */
    public class C2052d implements InterfaceC2054f {
        public C2052d() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC2054f
        /* JADX INFO: renamed from: a */
        public void mo3142a(boolean z, int i) {
            CameraCategory cameraCategory = (CameraCategory) FeedComicFacePropMenuView.this.f1675j.get(i);
            if (!z || FeedComicFacePropMenuView.this.f1676k.contains(cameraCategory.f678id)) {
                return;
            }
            FeedComicFacePropMenuView.this.f1676k.add(cameraCategory.f678id);
            zvf0.A("e_camera_video_effect", "p_camera_video", new j760[]{vwb.Y("special_effects_id", cameraCategory.f678id)});
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC2054f
        /* JADX INFO: renamed from: b */
        public void mo3143b(List<Integer> list) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$e */
    public class C2053e extends RecyclerView.t {
        public C2053e() {
        }

        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            View viewH;
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 || (viewH = FeedComicFacePropMenuView.this.f1678m.h(FeedComicFacePropMenuView.this.f1677l)) == null) {
                return;
            }
            int iA = viewH.getLayoutParams().a();
            FeedComicFacePropMenuView.this.m3132v((CameraCategory) FeedComicFacePropMenuView.this.f1675j.get(iA), iA);
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            FeedComicFacePropMenuView.this.f1665C += i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView$f */
    public interface InterfaceC2054f {
        /* JADX INFO: renamed from: a */
        void mo3142a(boolean z, int i);

        /* JADX INFO: renamed from: b */
        void mo3143b(List<Integer> list);
    }

    public FeedComicFacePropMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1675j = new ArrayList();
        this.f1676k = new HashSet();
        this.f1680o = xdl0.w(88.0f);
        this.f1681p = 2;
        this.f1688w = false;
        this.f1689x = 0;
        this.f1691z = new C2049a();
        this.f1664B = new C2050b();
        this.f1665C = 0;
        m3133w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m3121A(View view) {
        long jM3074N = this.f1668c.m3074N();
        if (jM3074N < 3000 && Math.abs(jM3074N - 3000) > 900) {
            lsi0.h(R$string.f329B0);
            return;
        }
        this.f1681p = 103;
        this.f1687v.mo3096a(103);
        zvf0.r("e_camera_video_next", "p_camera_video");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m3122B() {
        if (this.f1674i.getItemCount() > 2) {
            exq.m9963c(this.f1672g, 2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final CameraCategory m3123C() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.f678id = "0";
        return cameraCategory;
    }

    /* JADX INFO: renamed from: D */
    public void m3124D() {
        c4g0 c4g0Var = this.f1663A;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3125E() {
        d30 d30Var = this.f1683r;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m3126F() {
        this.f1668c.m3072L();
        if (this.f1689x != 0) {
            xdl0.M0(this.f1667b, true);
            xdl0.M0(this.f1671f, true);
        }
        xdl0.M0(this.f1672g, true);
        xdl0.M0(this.f1669d, false);
        xdl0.M0(this.f1670e, false);
        xdl0.M0(this.f1666a, false);
    }

    /* JADX INFO: renamed from: G */
    public final void m3127G() {
        if (this.f1688w) {
            return;
        }
        this.f1688w = true;
        xdl0.M0(this.f1671f, true);
        xdl0.M0(this.f1667b, true);
        this.f1673h.m3161Q(this.f1675j);
        this.f1673h.m3163S(this.f1682q);
        this.f1673h.m3162R(this.f1683r);
        this.f1674i.m13734E(this.f1675j);
        this.f1672g.addOnScrollListener(new C2053e());
        this.f1671f.setOffscreenPageLimit(5);
        this.f1671f.g(this.f1664B);
        zh50.a(this.f1672g, new Runnable() { // from class: l.xug
            @Override // java.lang.Runnable
            public final void run() {
                this.f15155a.m3122B();
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public void m3128H(int i) {
        this.f1668c.m3085p(i);
    }

    public int getState() {
        return this.f1681p;
    }

    /* JADX INFO: renamed from: s */
    public View m3129s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bvg.m9036b(this, layoutInflater, viewGroup);
    }

    public void setCancel(d30 d30Var) {
        this.f1683r = d30Var;
    }

    public void setCategoryData(List<CameraCategory> list) {
        this.f1675j.clear();
        if (list == null) {
            this.f1675j = new ArrayList();
        } else {
            this.f1675j.addAll(list);
        }
        this.f1675j.add(0, m3123C());
        m3127G();
    }

    public void setDelete(d30 d30Var) {
        this.f1684s = d30Var;
    }

    public void setOnPause(d30 d30Var) {
        this.f1686u = d30Var;
    }

    public void setOnPropSelect(g30<Integer, CameraSticker, Boolean> g30Var) {
        this.f1682q = g30Var;
    }

    public void setOnRecord(d30 d30Var) {
        this.f1685t = d30Var;
    }

    public void setStateListener(FeedCircleProgressBar.InterfaceC2048b interfaceC2048b) {
        this.f1687v = interfaceC2048b;
    }

    /* JADX INFO: renamed from: t */
    public final int m3130t(int i, int i2, int i3) {
        if (i3 <= i) {
            return i;
        }
        return i3 >= i2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: u */
    public final void m3131u(CameraCategory cameraCategory, int i) {
        List<CameraCategory> list = this.f1675j;
        if (list == null || list.size() == 0) {
            lsi0.j("资源加载中，请稍后再试");
            return;
        }
        if (i == this.f1689x) {
            CameraSticker cameraStickerM17104b = yb4.m17102c().m17104b();
            if (cameraStickerM17104b == null || !cameraStickerM17104b.hasModelFile) {
                return;
            }
            this.f1691z.call();
            return;
        }
        exq.m9963c(this.f1672g, i);
        this.f1671f.j(i, false);
        boolean z = i != 0;
        this.f1689x = i;
        if (!z) {
            yb4.m17102c().m17113l(null);
            yb4.m17102c().m17114m(null);
            m3125E();
        }
        xdl0.M0(this.f1667b, z);
        xdl0.M0(this.f1671f, z);
        zvf0.u("e_camera_video_effect", "p_camera_video", new j760[]{new j760("special_effects_id", cameraCategory.f678id)});
    }

    /* JADX INFO: renamed from: v */
    public final void m3132v(CameraCategory cameraCategory, int i) {
        if (i == this.f1689x) {
            return;
        }
        exq.m9963c(this.f1672g, i);
        this.f1671f.j(i, false);
        boolean z = i != 0;
        this.f1689x = i;
        if (!z) {
            m3125E();
        }
        xdl0.M0(this.f1667b, z);
        xdl0.M0(this.f1671f, z);
        if (this.f1690y) {
            zvf0.u("e_camera_video_effect", "p_camera_video", new j760[]{new j760("special_effects_id", cameraCategory.f678id)});
        }
        this.f1690y = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m3133w() {
        addView(m3129s(LayoutInflater.from(getContext()), this));
        this.f1671f.setUserInputEnabled(false);
        this.f1677l = new AnimLinearLayoutManager(getContext(), 0);
        qug qugVar = new qug(getContext());
        this.f1674i = qugVar;
        qugVar.m13735F(new f30() { // from class: l.tug
            public final void call(Object obj, Object obj2) {
                this.f13422a.m3134x((CameraCategory) obj, (Integer) obj2);
            }
        });
        C2055a c2055a = new C2055a(getContext());
        this.f1673h = c2055a;
        this.f1671f.setAdapter(c2055a);
        this.f1678m = new zxb();
        this.f1679n = new oe3(2, this.f1680o, true);
        this.f1668c.setStateListener(new C2051c());
        this.f1668c.setOnClickListener(new View.OnClickListener() { // from class: l.uug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13930a.m3135y(view);
            }
        });
        this.f1669d.setOnClickListener(new View.OnClickListener() { // from class: l.vug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14305a.m3136z(view);
            }
        });
        this.f1670e.setOnClickListener(new View.OnClickListener() { // from class: l.wug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14684a.m3121A(view);
            }
        });
        this.f1672g.setItemViewCacheSize(5);
        this.f1672g.setLayoutManager(this.f1677l);
        this.f1672g.setAdapter(this.f1674i);
        this.f1672g.addItemDecoration(this.f1679n);
        this.f1678m.b(this.f1672g);
        ze5.m17319f(this.f1672g, new C2052d(), false);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m3134x(CameraCategory cameraCategory, Integer num) {
        m3131u(cameraCategory, num.intValue());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m3135y(View view) {
        List<CameraCategory> list = this.f1675j;
        if (list == null || list.size() == 0) {
            lsi0.j("资源加载中，请稍后再试");
            return;
        }
        long jM3062B = this.f1668c.m3062B();
        int iM3073M = this.f1668c.m3073M();
        int count = this.f1668c.getCount();
        if (iM3073M == 101 && count == 0 && jM3062B < 1000) {
            lsi0.j("拍摄时长过短");
        } else {
            this.f1668c.m3084o();
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m3136z(View view) {
        d30 d30Var = this.f1684s;
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
