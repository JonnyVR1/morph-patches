package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.camera.widget.C2031d;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.mkd0;
import l.w660;
import l.w9j;
import l.xdl0;
import p007l.cdh;
import p007l.h94;
import p007l.m84;
import p007l.yb4;
import v.VImage;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2031d extends w660 {

    /* JADX INFO: renamed from: a */
    public Act f1326a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f1327b;

    /* JADX INFO: renamed from: c */
    public MaskMenuView.InterfaceC2023a f1328c;

    /* JADX INFO: renamed from: d */
    public Map<Integer, h94> f1329d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, C2030c> f1330e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, List<CameraSticker>> f1331f = new HashMap();

    public C2031d(Act act, @Nullable List<CameraCategory> list) {
        this.f1326a = act;
        if (NullChecker.a(list)) {
            this.f1327b = list;
        } else {
            this.f1327b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Boolean m2744k(CameraSticker cameraSticker) {
        return cameraSticker.isBeautySticker() ? Boolean.valueOf(cdh.m9125d()) : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    private void m2746o(@Nullable List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        C2030c c2030c = this.f1330e.get(Integer.valueOf(i));
        if (NullChecker.b(c2030c)) {
            if (this.f1327b.size() > i) {
                CameraCategory cameraCategory = this.f1327b.get(i);
                m2752n(list, cameraCategory);
                m2753p(list, cameraCategory);
            }
            m2750v(list);
            c2030c.m2742S(list);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m2747q(final String str, final int i) {
        FeedModule.f314b.m1435V2(new w9j() { // from class: l.e94
            public final Object call(Object obj) {
                return C2031d.m2744k((CameraSticker) obj);
            }
        }, str).subscribe(mkd0.H(new e30() { // from class: l.f94
            public final void call(Object obj) {
                this.f8033a.m2749t(str, i, (List) obj);
            }
        }, new e30() { // from class: l.g94
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    private RecyclerView m2748s(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f1326a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f1326a, 5);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        C2030c c2030c = new C2030c(this.f1326a);
        c2030c.f1325k = i;
        c2030c.m2741R(this.f1328c);
        recyclerView.setAdapter(c2030c);
        this.f1330e.put(Integer.valueOf(i), c2030c);
        if (this.f1327b.size() > i) {
            CameraCategory cameraCategory = this.f1327b.get(i);
            if (NullChecker.b(cameraCategory)) {
                List<CameraSticker> list = this.f1331f.get(cameraCategory.f678id);
                if (NullChecker.a(list)) {
                    m2746o(list, i);
                    return recyclerView;
                }
                if (NullChecker.b(cameraCategory.f678id)) {
                    m2747q(cameraCategory.f678id, i);
                }
            }
        }
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m2749t(String str, int i, List list) {
        this.f1331f.put(str, list);
        m2746o(list, i);
    }

    /* JADX INFO: renamed from: v */
    private void m2750v(@NonNull List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.b(cameraSticker)) {
                CameraSticker cameraSticker2 = yb4.m17102c().m17105d().get(cameraSticker.f680id);
                if (NullChecker.a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f1327b.size();
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM2748s = m2748s(i);
        viewGroup.addView(recyclerViewM2748s);
        return recyclerViewM2748s;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m2751m(int i) {
        for (Integer num : this.f1330e.keySet()) {
            if (NullChecker.b(num) && num.intValue() != i) {
                C2030c c2030c = this.f1330e.get(num);
                if (NullChecker.b(c2030c)) {
                    c2030c.m2733I();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2752n(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.a(list) && NullChecker.a(cameraCategory)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.b(cameraSticker)) {
                    cameraSticker.cId = cameraCategory.f678id;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2753p(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.a(list) && NullChecker.a(cameraCategory)) {
            m84 m84VarM11844e = m84.m11844e();
            String str = cameraCategory.f678id;
            m84.m11844e();
            if (m84VarM11844e.m11846b(str, 0)) {
                m84.m11844e().m11847c(cameraCategory.f678id);
                for (CameraSticker cameraSticker : list) {
                    if (NullChecker.b(cameraSticker)) {
                        yb4.m17102c().m17103a(cameraSticker);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public View m2754r(int i) {
        h94 h94Var = NullChecker.a(this.f1326a) ? new h94(LayoutInflater.from(this.f1326a), null) : new h94(LayoutInflater.from(FeedModule.f313a), null);
        VText vText = h94Var.f8634b;
        VImage vImage = h94Var.f8635c;
        this.f1329d.put(Integer.valueOf(i), h94Var);
        if (this.f1327b.size() > i) {
            CameraCategory cameraCategory = this.f1327b.get(i);
            if (NullChecker.a(cameraCategory)) {
                m2759z(vImage, cameraCategory);
                vText.setText(cameraCategory.name);
                if (i == 0) {
                    vText.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    vText.setTextColor(Color.parseColor("#80ffffff"));
                }
            }
        }
        return h94Var.f8636d;
    }

    /* JADX INFO: renamed from: u */
    public void m2755u(int i) {
        h94 h94Var = this.f1329d.get(Integer.valueOf(i));
        if (NullChecker.a(h94Var) && NullChecker.b(h94Var.f8635c)) {
            h94Var.f8635c.m6157k();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m2756w(int i, boolean z) {
        h94 h94Var = this.f1329d.get(Integer.valueOf(i));
        if (NullChecker.a(h94Var) && NullChecker.b(h94Var.f8635c)) {
            xdl0.M(h94Var.f8635c, z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2757x(int i, int i2) {
        h94 h94Var = this.f1329d.get(Integer.valueOf(i));
        if (NullChecker.a(h94Var) && NullChecker.b(h94Var.f8634b)) {
            h94Var.f8634b.setTextColor(i2);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m2758y(@Nullable MaskMenuView.InterfaceC2023a interfaceC2023a) {
        this.f1328c = interfaceC2023a;
    }

    /* JADX INFO: renamed from: z */
    public final void m2759z(@NonNull ImageView imageView, @NonNull CameraCategory cameraCategory) {
        xdl0.M(imageView, m84.m11844e().m11845a(cameraCategory));
    }
}
