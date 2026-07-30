package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.camera.widget.C11187d;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VText;
import p149l.cdh;
import p149l.e30;
import p149l.h94;
import p149l.m84;
import p149l.mkd0;
import p149l.w660;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb4;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.d */
/* JADX INFO: loaded from: classes12.dex */
public class C11187d extends w660 {

    /* JADX INFO: renamed from: a */
    public Act f39865a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f39866b;

    /* JADX INFO: renamed from: c */
    public MaskMenuView.InterfaceC11179a f39867c;

    /* JADX INFO: renamed from: d */
    public Map<Integer, h94> f39868d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, C11186c> f39869e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, List<CameraSticker>> f39870f = new HashMap();

    public C11187d(Act act, @Nullable List<CameraCategory> list) {
        this.f39865a = act;
        if (NullChecker.m81303a(list)) {
            this.f39866b = list;
        } else {
            this.f39866b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Boolean m61783k(CameraSticker cameraSticker) {
        return cameraSticker.isBeautySticker() ? Boolean.valueOf(cdh.m106231d()) : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    private void m61785o(@Nullable List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        C11186c c11186c = this.f39869e.get(Integer.valueOf(i));
        if (NullChecker.m81304b(c11186c)) {
            if (this.f39866b.size() > i) {
                CameraCategory cameraCategory = this.f39866b.get(i);
                m61791n(list, cameraCategory);
                m61792p(list, cameraCategory);
            }
            m61789v(list);
            c11186c.m61781S(list);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m61786q(final String str, final int i) {
        FeedModule.f38853b.m60509V2(new w9j() { // from class: l.e94
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C11187d.m61783k((CameraSticker) obj);
            }
        }, str).subscribe(mkd0.m154956H(new e30() { // from class: l.f94
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96450a.m61788t(str, i, (List) obj);
            }
        }, new e30() { // from class: l.g94
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    private RecyclerView m61787s(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f39865a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f39865a, 5);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        C11186c c11186c = new C11186c(this.f39865a);
        c11186c.f39864k = i;
        c11186c.m61780R(this.f39867c);
        recyclerView.setAdapter(c11186c);
        this.f39869e.put(Integer.valueOf(i), c11186c);
        if (this.f39866b.size() > i) {
            CameraCategory cameraCategory = this.f39866b.get(i);
            if (NullChecker.m81304b(cameraCategory)) {
                List<CameraSticker> list = this.f39870f.get(cameraCategory.f39217id);
                if (NullChecker.m81303a(list)) {
                    m61785o(list, i);
                    return recyclerView;
                }
                if (NullChecker.m81304b(cameraCategory.f39217id)) {
                    m61786q(cameraCategory.f39217id, i);
                }
            }
        }
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m61788t(String str, int i, List list) {
        this.f39870f.put(str, list);
        m61785o(list, i);
    }

    /* JADX INFO: renamed from: v */
    private void m61789v(@NonNull List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.m81304b(cameraSticker)) {
                CameraSticker cameraSticker2 = yb4.m213936c().m213939d().get(cameraSticker.f39219id);
                if (NullChecker.m81303a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f39866b.size();
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM61787s = m61787s(i);
        viewGroup.addView(recyclerViewM61787s);
        return recyclerViewM61787s;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m61790m(int i) {
        for (Integer num : this.f39869e.keySet()) {
            if (NullChecker.m81304b(num) && num.intValue() != i) {
                C11186c c11186c = this.f39869e.get(num);
                if (NullChecker.m81304b(c11186c)) {
                    c11186c.m61772I();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m61791n(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m81303a(list) && NullChecker.m81303a(cameraCategory)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.m81304b(cameraSticker)) {
                    cameraSticker.cId = cameraCategory.f39217id;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m61792p(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m81303a(list) && NullChecker.m81303a(cameraCategory)) {
            m84 m84VarM153429e = m84.m153429e();
            String str = cameraCategory.f39217id;
            m84.m153429e();
            if (m84VarM153429e.m153431b(str, 0)) {
                m84.m153429e().m153432c(cameraCategory.f39217id);
                for (CameraSticker cameraSticker : list) {
                    if (NullChecker.m81304b(cameraSticker)) {
                        yb4.m213936c().m213937a(cameraSticker);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public View m61793r(int i) {
        h94 h94Var = NullChecker.m81303a(this.f39865a) ? new h94(LayoutInflater.from(this.f39865a), null) : new h94(LayoutInflater.from(FeedModule.f38852a), null);
        VText vText = h94Var.f106512b;
        FeedRedDotView feedRedDotView = h94Var.f106513c;
        this.f39868d.put(Integer.valueOf(i), h94Var);
        if (this.f39866b.size() > i) {
            CameraCategory cameraCategory = this.f39866b.get(i);
            if (NullChecker.m81303a(cameraCategory)) {
                m61798z(feedRedDotView, cameraCategory);
                vText.setText(cameraCategory.name);
                if (i == 0) {
                    vText.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    vText.setTextColor(Color.parseColor("#80ffffff"));
                }
            }
        }
        return h94Var.f106514d;
    }

    /* JADX INFO: renamed from: u */
    public void m61794u(int i) {
        h94 h94Var = this.f39868d.get(Integer.valueOf(i));
        if (NullChecker.m81303a(h94Var) && NullChecker.m81304b(h94Var.f106513c)) {
            h94Var.f106513c.m65056k();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m61795w(int i, boolean z) {
        h94 h94Var = this.f39868d.get(Integer.valueOf(i));
        if (NullChecker.m81303a(h94Var) && NullChecker.m81304b(h94Var.f106513c)) {
            xdl0.m208344M(h94Var.f106513c, z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m61796x(int i, int i2) {
        h94 h94Var = this.f39868d.get(Integer.valueOf(i));
        if (NullChecker.m81303a(h94Var) && NullChecker.m81304b(h94Var.f106512b)) {
            h94Var.f106512b.setTextColor(i2);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m61797y(@Nullable MaskMenuView.InterfaceC11179a interfaceC11179a) {
        this.f39867c = interfaceC11179a;
    }

    /* JADX INFO: renamed from: z */
    public final void m61798z(@NonNull ImageView imageView, @NonNull CameraCategory cameraCategory) {
        xdl0.m208344M(imageView, m84.m153429e().m153430a(cameraCategory));
    }
}
