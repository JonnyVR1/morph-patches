package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.camera.widget.C11350d;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VText;
import p153l.bnl0;
import p153l.cf60;
import p153l.ga4;
import p153l.l94;
import p153l.psd0;
import p153l.qcj;
import p153l.reh;
import p153l.xc4;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.d */
/* JADX INFO: loaded from: classes13.dex */
public class C11350d extends cf60 {

    /* JADX INFO: renamed from: a */
    public Act f40713a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f40714b;

    /* JADX INFO: renamed from: c */
    public MaskMenuView.InterfaceC11342a f40715c;

    /* JADX INFO: renamed from: d */
    public Map<Integer, ga4> f40716d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, C11349c> f40717e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, List<CameraSticker>> f40718f = new HashMap();

    public C11350d(Act act, @Nullable List<CameraCategory> list) {
        this.f40713a = act;
        if (NullChecker.m82486a(list)) {
            this.f40714b = list;
        } else {
            this.f40714b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Boolean m62966k(CameraSticker cameraSticker) {
        return cameraSticker.isBeautySticker() ? Boolean.valueOf(reh.m181029d()) : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    private void m62968o(@Nullable List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        C11349c c11349c = this.f40717e.get(Integer.valueOf(i));
        if (NullChecker.m82487b(c11349c)) {
            if (this.f40714b.size() > i) {
                CameraCategory cameraCategory = this.f40714b.get(i);
                m62974n(list, cameraCategory);
                m62975p(list, cameraCategory);
            }
            m62972v(list);
            c11349c.m62964S(list);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m62969q(final String str, final int i) {
        FeedModule.f39701b.m61693V2(new qcj() { // from class: l.da4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C11350d.m62966k((CameraSticker) obj);
            }
        }, str).subscribe(psd0.m173597H(new y20() { // from class: l.ea4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92738a.m62971t(str, i, (List) obj);
            }
        }, new y20() { // from class: l.fa4
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    private RecyclerView m62970s(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f40713a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f40713a, 5);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        C11349c c11349c = new C11349c(this.f40713a);
        c11349c.f40712k = i;
        c11349c.m62963R(this.f40715c);
        recyclerView.setAdapter(c11349c);
        this.f40717e.put(Integer.valueOf(i), c11349c);
        if (this.f40714b.size() > i) {
            CameraCategory cameraCategory = this.f40714b.get(i);
            if (NullChecker.m82487b(cameraCategory)) {
                List<CameraSticker> list = this.f40718f.get(cameraCategory.f40065id);
                if (NullChecker.m82486a(list)) {
                    m62968o(list, i);
                    return recyclerView;
                }
                if (NullChecker.m82487b(cameraCategory.f40065id)) {
                    m62969q(cameraCategory.f40065id, i);
                }
            }
        }
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m62971t(String str, int i, List list) {
        this.f40718f.put(str, list);
        m62968o(list, i);
    }

    /* JADX INFO: renamed from: v */
    private void m62972v(@NonNull List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.m82487b(cameraSticker)) {
                CameraSticker cameraSticker2 = xc4.m210114c().m210117d().get(cameraSticker.f40067id);
                if (NullChecker.m82486a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f40714b.size();
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM62970s = m62970s(i);
        viewGroup.addView(recyclerViewM62970s);
        return recyclerViewM62970s;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m62973m(int i) {
        for (Integer num : this.f40717e.keySet()) {
            if (NullChecker.m82487b(num) && num.intValue() != i) {
                C11349c c11349c = this.f40717e.get(num);
                if (NullChecker.m82487b(c11349c)) {
                    c11349c.m62955I();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m62974n(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m82486a(list) && NullChecker.m82486a(cameraCategory)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.m82487b(cameraSticker)) {
                    cameraSticker.cId = cameraCategory.f40065id;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m62975p(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m82486a(list) && NullChecker.m82486a(cameraCategory)) {
            l94 l94VarM153309e = l94.m153309e();
            String str = cameraCategory.f40065id;
            l94.m153309e();
            if (l94VarM153309e.m153311b(str, 0)) {
                l94.m153309e().m153312c(cameraCategory.f40065id);
                for (CameraSticker cameraSticker : list) {
                    if (NullChecker.m82487b(cameraSticker)) {
                        xc4.m210114c().m210115a(cameraSticker);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public View m62976r(int i) {
        ga4 ga4Var = NullChecker.m82486a(this.f40713a) ? new ga4(LayoutInflater.from(this.f40713a), null) : new ga4(LayoutInflater.from(FeedModule.f39700a), null);
        VText vText = ga4Var.f102955b;
        FeedRedDotView feedRedDotView = ga4Var.f102956c;
        this.f40716d.put(Integer.valueOf(i), ga4Var);
        if (this.f40714b.size() > i) {
            CameraCategory cameraCategory = this.f40714b.get(i);
            if (NullChecker.m82486a(cameraCategory)) {
                m62981z(feedRedDotView, cameraCategory);
                vText.setText(cameraCategory.name);
                if (i == 0) {
                    vText.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    vText.setTextColor(Color.parseColor("#80ffffff"));
                }
            }
        }
        return ga4Var.f102957d;
    }

    /* JADX INFO: renamed from: u */
    public void m62977u(int i) {
        ga4 ga4Var = this.f40716d.get(Integer.valueOf(i));
        if (NullChecker.m82486a(ga4Var) && NullChecker.m82487b(ga4Var.f102956c)) {
            ga4Var.f102956c.m66239k();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m62978w(int i, boolean z) {
        ga4 ga4Var = this.f40716d.get(Integer.valueOf(i));
        if (NullChecker.m82486a(ga4Var) && NullChecker.m82487b(ga4Var.f102956c)) {
            bnl0.m105524M(ga4Var.f102956c, z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m62979x(int i, int i2) {
        ga4 ga4Var = this.f40716d.get(Integer.valueOf(i));
        if (NullChecker.m82486a(ga4Var) && NullChecker.m82487b(ga4Var.f102955b)) {
            ga4Var.f102955b.setTextColor(i2);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m62980y(@Nullable MaskMenuView.InterfaceC11342a interfaceC11342a) {
        this.f40715c = interfaceC11342a;
    }

    /* JADX INFO: renamed from: z */
    public final void m62981z(@NonNull ImageView imageView, @NonNull CameraCategory cameraCategory) {
        bnl0.m105524M(imageView, l94.m153309e().m153310a(cameraCategory));
    }
}
