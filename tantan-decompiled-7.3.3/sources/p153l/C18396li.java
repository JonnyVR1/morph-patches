package p153l;

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
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMaskMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRedDotView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VText;

/* JADX INFO: renamed from: l.li */
/* JADX INFO: loaded from: classes9.dex */
public class C18396li extends cf60 {

    /* JADX INFO: renamed from: a */
    public Act f132163a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f132164b;

    /* JADX INFO: renamed from: c */
    public Map<Integer, C18618mi> f132165c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<Integer, C16977fi> f132166d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<String, List<CameraSticker>> f132167e = new HashMap();

    public C18396li(Act act, @Nullable List<CameraCategory> list) {
        this.f132163a = act;
        if (NullChecker.m82486a(list)) {
            this.f132164b = list;
        } else {
            this.f132164b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m154258l(CameraSticker cameraSticker) {
        return cameraSticker.isBeautySticker() ? Boolean.valueOf(C16800eo.m121690b()) : Boolean.TRUE;
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f132164b.size();
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM154265s = m154265s(i);
        viewGroup.addView(recyclerViewM154265s);
        return recyclerViewM154265s;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: m */
    public void m154259m(int i) {
        for (Integer num : this.f132166d.keySet()) {
            if (NullChecker.m82487b(num) && num.intValue() != i) {
                C16977fi c16977fi = this.f132166d.get(num);
                if (NullChecker.m82487b(c16977fi)) {
                    c16977fi.m125652I();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m154260n(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m82486a(list) && NullChecker.m82486a(cameraCategory)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.m82487b(cameraSticker)) {
                    cameraSticker.cId = cameraCategory.f17061id;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m154261o(@Nullable List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        C16977fi c16977fi = this.f132166d.get(Integer.valueOf(i));
        if (NullChecker.m82487b(c16977fi)) {
            if (this.f132164b.size() > i) {
                CameraCategory cameraCategory = this.f132164b.get(i);
                m154260n(list, cameraCategory);
                m154262p(list, cameraCategory);
            }
            m154268v(list);
            c16977fi.m125661S(list);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m154262p(@Nullable List<CameraSticker> list, @Nullable CameraCategory cameraCategory) {
        if (NullChecker.m82486a(list) && NullChecker.m82486a(cameraCategory)) {
            C20574uh c20574uhM196005d = C20574uh.m196005d();
            String str = cameraCategory.f17061id;
            C20574uh.m196005d();
            if (c20574uhM196005d.m196007b(str, 0)) {
                C20574uh.m196005d().m196008c(cameraCategory.f17061id);
                for (CameraSticker cameraSticker : list) {
                    if (NullChecker.m82487b(cameraSticker)) {
                        C19376pj.m172465c().m172466a(cameraSticker);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m154263q(final String str, final int i) {
        this.f132163a.duringCreated(SignUpAiAct.f17074c.m154187N(new qcj() { // from class: l.ii
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18396li.m154258l((CameraSticker) obj);
            }
        }, str)).subscribe(psd0.m173597H(new y20() { // from class: l.ji
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121026a.m154266t(str, i, (List) obj);
            }
        }, new y20() { // from class: l.ki
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public View m154264r(int i) {
        C18618mi c18618mi = NullChecker.m82486a(this.f132163a) ? new C18618mi(LayoutInflater.from(this.f132163a), null) : new C18618mi(LayoutInflater.from(AccountModule.f16754a), null);
        VText vText = c18618mi.f136907b;
        AccountRedDotView accountRedDotView = c18618mi.f136908c;
        this.f132165c.put(Integer.valueOf(i), c18618mi);
        if (this.f132164b.size() > i) {
            CameraCategory cameraCategory = this.f132164b.get(i);
            if (NullChecker.m82486a(cameraCategory)) {
                m154272z(accountRedDotView, cameraCategory);
                vText.setText(cameraCategory.name);
                if (i == 0) {
                    vText.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    vText.setTextColor(Color.parseColor("#80ffffff"));
                }
            }
        }
        return c18618mi.f136909d;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    public final RecyclerView m154265s(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f132163a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f132163a, 5);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        C16977fi c16977fi = new C16977fi(this.f132163a);
        c16977fi.f99141j = i;
        c16977fi.m125660R(null);
        recyclerView.setAdapter(c16977fi);
        this.f132166d.put(Integer.valueOf(i), c16977fi);
        if (this.f132164b.size() > i) {
            CameraCategory cameraCategory = this.f132164b.get(i);
            if (NullChecker.m82487b(cameraCategory)) {
                List<CameraSticker> list = this.f132167e.get(cameraCategory.f17061id);
                if (NullChecker.m82486a(list)) {
                    m154261o(list, i);
                    return recyclerView;
                }
                if (NullChecker.m82487b(cameraCategory.f17061id)) {
                    m154263q(cameraCategory.f17061id, i);
                }
            }
        }
        return recyclerView;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m154266t(String str, int i, List list) {
        this.f132167e.put(str, list);
        m154261o(list, i);
    }

    /* JADX INFO: renamed from: u */
    public void m154267u(int i) {
        C18618mi c18618mi = this.f132165c.get(Integer.valueOf(i));
        if (NullChecker.m82486a(c18618mi) && NullChecker.m82487b(c18618mi.f136908c)) {
            c18618mi.f136908c.m30111k();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m154268v(@NonNull List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.m82487b(cameraSticker)) {
                CameraSticker cameraSticker2 = C19376pj.m172465c().m172468d().get(cameraSticker.f17063id);
                if (NullChecker.m82486a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m154269w(int i, boolean z) {
        C18618mi c18618mi = this.f132165c.get(Integer.valueOf(i));
        if (NullChecker.m82486a(c18618mi) && NullChecker.m82487b(c18618mi.f136908c)) {
            bnl0.m105524M(c18618mi.f136908c, z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m154270x(int i, int i2) {
        C18618mi c18618mi = this.f132165c.get(Integer.valueOf(i));
        if (NullChecker.m82486a(c18618mi) && NullChecker.m82487b(c18618mi.f136907b)) {
            c18618mi.f136907b.setTextColor(i2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m154272z(@NonNull ImageView imageView, @NonNull CameraCategory cameraCategory) {
        bnl0.m105524M(imageView, C20574uh.m196005d().m196006a(cameraCategory));
    }

    /* JADX INFO: renamed from: y */
    public void m154271y(@Nullable AccountMaskMenuView.InterfaceC4815a interfaceC4815a) {
    }
}
