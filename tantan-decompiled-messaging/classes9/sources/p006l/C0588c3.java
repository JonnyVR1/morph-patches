package p006l;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import kotlin.Triple;
import l.d3;
import l.i0g0;
import l.juk;
import l.mqi0;
import l.s7m;
import l.xdl0;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.c3 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0588c3 implements s7m<C0494a3> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f9299a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f9300b;

    /* JADX INFO: renamed from: c */
    public VText f9301c;

    /* JADX INFO: renamed from: d */
    public VText f9302d;

    /* JADX INFO: renamed from: e */
    public VText f9303e;

    /* JADX INFO: renamed from: f */
    public VText f9304f;

    /* JADX INFO: renamed from: g */
    public VText f9305g;

    /* JADX INFO: renamed from: h */
    public VText f9306h;

    /* JADX INFO: renamed from: i */
    public VText f9307i;

    /* JADX INFO: renamed from: j */
    public VText f9308j;

    /* JADX INFO: renamed from: k */
    public ImageView f9309k;

    /* JADX INFO: renamed from: l */
    public VText f9310l;

    /* JADX INFO: renamed from: m */
    public VText f9311m;

    /* JADX INFO: renamed from: n */
    public VText f9312n;

    /* JADX INFO: renamed from: o */
    public VText f9313o;

    /* JADX INFO: renamed from: p */
    public VText f9314p;

    /* JADX INFO: renamed from: q */
    public C0494a3 f9315q;

    /* JADX INFO: renamed from: r */
    public Act f9316r;

    /* JADX INFO: renamed from: l.c3$a */
    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C0588c3.this.f9312n.setVisibility(0);
            return true;
        }
    }

    public C0588c3(Act act) {
        this.f9316r = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m13085d(View view) {
        act().onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13086C0() {
        return this.f9316r;
    }

    @Nullable
    public Act act() {
        return this.f9316r;
    }

    /* JADX INFO: renamed from: b */
    public View m13087b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d3.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m13090i1(C0494a3 c0494a3) {
        this.f9315q = c0494a3;
    }

    /* JADX INFO: renamed from: e */
    public void m13089e() {
        xdl0.M(this.f9313o, true);
        this.f9313o.setText(i0g0.C(act(), String.format("《%1$s & %2$s & %3$s & %4$s & %5$s & %6$s》", act().string(R$string.f3076y8), act().string(R$string.f2418ck), act().string(R$string.f2602ik), act().string(R$string.f1564A8), act().string(R$string.f2449dk), act().string(R$string.f3106z8)), new Triple[]{new Triple(act().string(R$string.f3076y8), juk.j(), 0), new Triple(act().string(R$string.f2418ck), juk.i(), 0), new Triple(act().string(R$string.f2602ik), juk.h(), -1), new Triple(act().string(R$string.f1564A8), juk.c(), 0), new Triple(act().string(R$string.f2449dk), "BusinessLicenseAct", 0), new Triple(act().string(R$string.f3106z8), juk.b(), 0)}));
        this.f9313o.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13087b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m13091r() {
        this.f9299a.setTitle(R$string.f2822po);
        this.f9299a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8694a.m13085d(view);
            }
        });
        this.f9311m.setText(act().getString(R$string.f2852qo, "7.2.7"));
        this.f9312n.setText(tre0.m24808a());
        this.f9311m.setOnLongClickListener(new a());
        this.f9315q.m11703g0();
        this.f9314p.setText(act().getString(R$string.f2791oo, mqi0.k.format(Long.valueOf(qib0.f19784H.guessedCurrentServerTime()))));
    }

    public void destroy() {
    }
}
