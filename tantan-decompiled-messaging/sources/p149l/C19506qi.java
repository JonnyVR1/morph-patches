package p149l;

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
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMaskMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRedDotView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VText;

/* JADX INFO: renamed from: l.qi */
/* JADX INFO: loaded from: classes9.dex */
public class C19506qi extends w660 {

    /* JADX INFO: renamed from: a */
    public Act f154629a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f154630b;

    /* JADX INFO: renamed from: c */
    public Map<Integer, C19707ri> f154631c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<Integer, C18021ki> f154632d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<String, List<CameraSticker>> f154633e = new HashMap();

    public C19506qi(Act act, @Nullable List<CameraCategory> list) {
        this.f154629a = act;
        if (NullChecker.m81303a(list)) {
            this.f154630b = list;
        } else {
            this.f154630b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m174685l(CameraSticker cameraSticker) {
        return cameraSticker.isBeautySticker() ? Boolean.valueOf(C17827jo.m142407b()) : Boolean.TRUE;
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f154630b.size();
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM174692s = m174692s(i);
        viewGroup.addView(recyclerViewM174692s);
        return recyclerViewM174692s;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m174686m(int i) {
        for (Integer num : this.f154632d.keySet()) {
            if (NullChecker.m81304b(num) && num.intValue() != i) {
                C18021ki c18021ki = this.f154632d.get(num);
                if (NullChecker.m81304b(c18021ki)) {
                    c18021ki.m146030I();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m174687n(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m81303a(list) && NullChecker.m81303a(cameraCategory)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.m81304b(cameraSticker)) {
                    cameraSticker.cId = cameraCategory.f16342id;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m174688o(@Nullable List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        C18021ki c18021ki = this.f154632d.get(Integer.valueOf(i));
        if (NullChecker.m81304b(c18021ki)) {
            if (this.f154630b.size() > i) {
                CameraCategory cameraCategory = this.f154630b.get(i);
                m174687n(list, cameraCategory);
                m174689p(list, cameraCategory);
            }
            m174695v(list);
            c18021ki.m146039S(list);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m174689p(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m81303a(list) && NullChecker.m81303a(cameraCategory)) {
            C21696zh c21696zhM218749d = C21696zh.m218749d();
            String str = cameraCategory.f16342id;
            C21696zh.m218749d();
            if (c21696zhM218749d.m218751b(str, 0)) {
                C21696zh.m218749d().m218752c(cameraCategory.f16342id);
                for (CameraSticker cameraSticker : list) {
                    if (NullChecker.m81304b(cameraSticker)) {
                        C20443uj.m193970c().m193971a(cameraSticker);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m174690q(final String str, final int i) {
        this.f154629a.duringCreated(SignUpAiAct.f16355c.m174494N(new w9j() { // from class: l.ni
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C19506qi.m174685l((CameraSticker) obj);
            }
        }, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.oi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144078a.m174693t(str, i, (List) obj);
            }
        }, new e30() { // from class: l.pi
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public View m174691r(int i) {
        C19707ri c19707ri = NullChecker.m81303a(this.f154629a) ? new C19707ri(LayoutInflater.from(this.f154629a), null) : new C19707ri(LayoutInflater.from(AccountModule.f16035a), null);
        VText vText = c19707ri.f159504b;
        AccountRedDotView accountRedDotView = c19707ri.f159505c;
        this.f154631c.put(Integer.valueOf(i), c19707ri);
        if (this.f154630b.size() > i) {
            CameraCategory cameraCategory = this.f154630b.get(i);
            if (NullChecker.m81303a(cameraCategory)) {
                m174699z(accountRedDotView, cameraCategory);
                vText.setText(cameraCategory.name);
                if (i == 0) {
                    vText.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    vText.setTextColor(Color.parseColor("#80ffffff"));
                }
            }
        }
        return c19707ri.f159506d;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    public final RecyclerView m174692s(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f154629a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f154629a, 5);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        C18021ki c18021ki = new C18021ki(this.f154629a);
        c18021ki.f123251j = i;
        c18021ki.m146038R(null);
        recyclerView.setAdapter(c18021ki);
        this.f154632d.put(Integer.valueOf(i), c18021ki);
        if (this.f154630b.size() > i) {
            CameraCategory cameraCategory = this.f154630b.get(i);
            if (NullChecker.m81304b(cameraCategory)) {
                List<CameraSticker> list = this.f154633e.get(cameraCategory.f16342id);
                if (NullChecker.m81303a(list)) {
                    m174688o(list, i);
                    return recyclerView;
                }
                if (NullChecker.m81304b(cameraCategory.f16342id)) {
                    m174690q(cameraCategory.f16342id, i);
                }
            }
        }
        return recyclerView;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m174693t(String str, int i, List list) {
        this.f154633e.put(str, list);
        m174688o(list, i);
    }

    /* JADX INFO: renamed from: u */
    public void m174694u(int i) {
        C19707ri c19707ri = this.f154631c.get(Integer.valueOf(i));
        if (NullChecker.m81303a(c19707ri) && NullChecker.m81304b(c19707ri.f159505c)) {
            c19707ri.f159505c.m29112k();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m174695v(@NonNull List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.m81304b(cameraSticker)) {
                CameraSticker cameraSticker2 = C20443uj.m193970c().m193973d().get(cameraSticker.f16344id);
                if (NullChecker.m81303a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m174696w(int i, boolean z) {
        C19707ri c19707ri = this.f154631c.get(Integer.valueOf(i));
        if (NullChecker.m81303a(c19707ri) && NullChecker.m81304b(c19707ri.f159505c)) {
            xdl0.m208344M(c19707ri.f159505c, z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m174697x(int i, int i2) {
        C19707ri c19707ri = this.f154631c.get(Integer.valueOf(i));
        if (NullChecker.m81303a(c19707ri) && NullChecker.m81304b(c19707ri.f159504b)) {
            c19707ri.f159504b.setTextColor(i2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m174699z(@NonNull ImageView imageView, @NonNull CameraCategory cameraCategory) {
        xdl0.m208344M(imageView, C21696zh.m218749d().m218750a(cameraCategory));
    }

    /* JADX INFO: renamed from: y */
    public void m174698y(@Nullable AccountMaskMenuView.InterfaceC4664a interfaceC4664a) {
    }
}
