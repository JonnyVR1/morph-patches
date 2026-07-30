package p006l;

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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMaskMenuView;
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
import v.VImage;
import v.VText;

/* JADX INFO: renamed from: l.qi */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1169qi extends w660 {

    /* JADX INFO: renamed from: a */
    public Act f19762a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f19763b;

    /* JADX INFO: renamed from: c */
    public Map<Integer, C1222ri> f19764c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<Integer, C0933ki> f19765d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<String, List<CameraSticker>> f19766e = new HashMap();

    public C1169qi(Act act, @Nullable List<CameraCategory> list) {
        this.f19762a = act;
        if (NullChecker.a(list)) {
            this.f19763b = list;
        } else {
            this.f19763b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m22094l(CameraSticker cameraSticker) {
        return cameraSticker.isBeautySticker() ? Boolean.valueOf(C0897jo.m17668b()) : Boolean.TRUE;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f19763b.size();
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM22101s = m22101s(i);
        viewGroup.addView(recyclerViewM22101s);
        return recyclerViewM22101s;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m22095m(int i) {
        for (Integer num : this.f19765d.keySet()) {
            if (NullChecker.b(num) && num.intValue() != i) {
                C0933ki c0933ki = this.f19765d.get(num);
                if (NullChecker.b(c0933ki)) {
                    c0933ki.m18136I();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m22096n(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.a(list) && NullChecker.a(cameraCategory)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.b(cameraSticker)) {
                    cameraSticker.cId = cameraCategory.f331id;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m22097o(@Nullable List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        C0933ki c0933ki = this.f19765d.get(Integer.valueOf(i));
        if (NullChecker.b(c0933ki)) {
            if (this.f19763b.size() > i) {
                CameraCategory cameraCategory = this.f19763b.get(i);
                m22096n(list, cameraCategory);
                m22098p(list, cameraCategory);
            }
            m22104v(list);
            c0933ki.m18145S(list);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m22098p(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.a(list) && NullChecker.a(cameraCategory)) {
            C1521zh c1521zhM28702d = C1521zh.m28702d();
            String str = cameraCategory.f331id;
            C1521zh.m28702d();
            if (c1521zhM28702d.m28704b(str, 0)) {
                C1521zh.m28702d().m28705c(cameraCategory.f331id);
                for (CameraSticker cameraSticker : list) {
                    if (NullChecker.b(cameraSticker)) {
                        C1347uj.m25232c().m25233a(cameraSticker);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m22099q(final String str, final int i) {
        this.f19762a.duringCreated(SignUpAiAct.f344c.m22078N(new w9j() { // from class: l.ni
            public final Object call(Object obj) {
                return C1169qi.m22094l((CameraSticker) obj);
            }
        }, str)).subscribe(mkd0.H(new e30() { // from class: l.oi
            public final void call(Object obj) {
                this.f18245a.m22102t(str, i, (List) obj);
            }
        }, new e30() { // from class: l.pi
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public View m22100r(int i) {
        C1222ri c1222ri = NullChecker.a(this.f19762a) ? new C1222ri(LayoutInflater.from(this.f19762a), null) : new C1222ri(LayoutInflater.from(AccountModule.f24a), null);
        VText vText = c1222ri.f20560b;
        VImage vImage = c1222ri.f20561c;
        this.f19764c.put(Integer.valueOf(i), c1222ri);
        if (this.f19763b.size() > i) {
            CameraCategory cameraCategory = this.f19763b.get(i);
            if (NullChecker.a(cameraCategory)) {
                m22108z(vImage, cameraCategory);
                vText.setText(cameraCategory.name);
                if (i == 0) {
                    vText.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    vText.setTextColor(Color.parseColor("#80ffffff"));
                }
            }
        }
        return c1222ri.f20562d;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    public final RecyclerView m22101s(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f19762a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19762a, 5);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        C0933ki c0933ki = new C0933ki(this.f19762a);
        c0933ki.f15837j = i;
        c0933ki.m18144R(null);
        recyclerView.setAdapter(c0933ki);
        this.f19765d.put(Integer.valueOf(i), c0933ki);
        if (this.f19763b.size() > i) {
            CameraCategory cameraCategory = this.f19763b.get(i);
            if (NullChecker.b(cameraCategory)) {
                List<CameraSticker> list = this.f19766e.get(cameraCategory.f331id);
                if (NullChecker.a(list)) {
                    m22097o(list, i);
                    return recyclerView;
                }
                if (NullChecker.b(cameraCategory.f331id)) {
                    m22099q(cameraCategory.f331id, i);
                }
            }
        }
        return recyclerView;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m22102t(String str, int i, List list) {
        this.f19766e.put(str, list);
        m22097o(list, i);
    }

    /* JADX INFO: renamed from: u */
    public void m22103u(int i) {
        C1222ri c1222ri = this.f19764c.get(Integer.valueOf(i));
        if (NullChecker.a(c1222ri) && NullChecker.b(c1222ri.f20561c)) {
            c1222ri.f20561c.m1018k();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m22104v(@NonNull List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.b(cameraSticker)) {
                CameraSticker cameraSticker2 = C1347uj.m25232c().m25235d().get(cameraSticker.f333id);
                if (NullChecker.a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m22105w(int i, boolean z) {
        C1222ri c1222ri = this.f19764c.get(Integer.valueOf(i));
        if (NullChecker.a(c1222ri) && NullChecker.b(c1222ri.f20561c)) {
            xdl0.M(c1222ri.f20561c, z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m22106x(int i, int i2) {
        C1222ri c1222ri = this.f19764c.get(Integer.valueOf(i));
        if (NullChecker.a(c1222ri) && NullChecker.b(c1222ri.f20560b)) {
            c1222ri.f20560b.setTextColor(i2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m22108z(@NonNull ImageView imageView, @NonNull CameraCategory cameraCategory) {
        xdl0.M(imageView, C1521zh.m28702d().m28703a(cameraCategory));
    }

    /* JADX INFO: renamed from: y */
    public void m22107y(@Nullable AccountMaskMenuView.InterfaceC0090a interfaceC0090a) {
    }
}
