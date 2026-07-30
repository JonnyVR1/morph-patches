package p003l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.p001ui.citytop.C3074a;
import com.p000p1.mobile.putong.core.p001ui.citytop.CityTopLikersAct;
import l.q860;
import l.s7m;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VProgressBar;
import v.VPullUpRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d75 implements s7m<C3074a> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f4117a;

    /* JADX INFO: renamed from: b */
    public VFrame f4118b;

    /* JADX INFO: renamed from: c */
    public VFrame f4119c;

    /* JADX INFO: renamed from: d */
    public VLinear f4120d;

    /* JADX INFO: renamed from: e */
    public VImage f4121e;

    /* JADX INFO: renamed from: f */
    public VText f4122f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f4123g;

    /* JADX INFO: renamed from: h */
    public VPullUpRecyclerView f4124h;

    /* JADX INFO: renamed from: i */
    public C3074a f4125i;

    /* JADX INFO: renamed from: j */
    public GridLayoutManager f4126j;

    /* JADX INFO: renamed from: k */
    public CityTopLikersAct f4127k;

    /* JADX INFO: renamed from: l.d75$a */
    public class C3321a extends GridLayoutManager.c {
        public C3321a() {
        }

        /* JADX INFO: renamed from: f */
        public int m6088f(int i) {
            return 1;
        }
    }

    public d75(CityTopLikersAct cityTopLikersAct) {
        this.f4127k = cityTopLikersAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6080C0() {
        return this.f4127k;
    }

    /* JADX INFO: renamed from: a */
    public View m6081a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e75.m6249b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m6087i1(C3074a c3074a) {
        this.f4125i = c3074a;
    }

    /* JADX INFO: renamed from: c */
    public void m6083c(boolean z, boolean z2) {
        if (z) {
            this.f4119c.setVisibility(0);
            this.f4120d.setVisibility(4);
            this.f4123g.setVisibility(0);
            this.f4124h.setVisibility(4);
            return;
        }
        VFrame vFrame = this.f4119c;
        if (!z2) {
            vFrame.setVisibility(4);
            this.f4120d.setVisibility(4);
            this.f4123g.setVisibility(4);
            this.f4124h.setVisibility(0);
            return;
        }
        vFrame.setVisibility(0);
        this.f4120d.setVisibility(0);
        this.f4123g.setVisibility(4);
        this.f4124h.setVisibility(4);
        this.f4122f.setText("暂无新请求");
    }

    /* JADX INFO: renamed from: d */
    public void m6084d() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        this.f4126j = gridLayoutManager;
        gridLayoutManager.v(new C3321a());
        this.f4124h.setLayoutManager(this.f4126j);
        this.f4124h.setAdapter(this.f4127k.m1889Z1());
        new k(this.f4125i.m1906m0()).g(this.f4124h);
        this.f4117a.setLeftIconAsBack(act());
        this.f4117a.setLeftIconResource(b3c0.f3113b);
    }

    /* JADX INFO: renamed from: e */
    public void m6085e(q860<Greeting> q860Var) {
        int iD = q860Var == null ? 0 : q860Var.d();
        if (iD > 0) {
            m6086f(String.format("城市封面好友申请（%s）", iD > 99 ? "99+" : String.valueOf(iD)));
        } else {
            m6086f("城市封面好友申请");
        }
        if (q860Var == null) {
            m6083c(true, false);
        } else {
            this.f4127k.m1889Z1().m7696V(q860Var.a, q860Var.b.links);
            m6083c(false, iD == 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6086f(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) "  ");
        this.f4117a.setTitle(spannableStringBuilder);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6081a(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
