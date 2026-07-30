package p149l;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import kotlin.Triple;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.c3 */
/* JADX INFO: loaded from: classes9.dex */
public class C16046c3 implements s7m<C15516a3> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f78407a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f78408b;

    /* JADX INFO: renamed from: c */
    public VText f78409c;

    /* JADX INFO: renamed from: d */
    public VText f78410d;

    /* JADX INFO: renamed from: e */
    public VText f78411e;

    /* JADX INFO: renamed from: f */
    public VText f78412f;

    /* JADX INFO: renamed from: g */
    public VText f78413g;

    /* JADX INFO: renamed from: h */
    public VText f78414h;

    /* JADX INFO: renamed from: i */
    public VText f78415i;

    /* JADX INFO: renamed from: j */
    public VText f78416j;

    /* JADX INFO: renamed from: k */
    public ImageView f78417k;

    /* JADX INFO: renamed from: l */
    public VText f78418l;

    /* JADX INFO: renamed from: m */
    public VText f78419m;

    /* JADX INFO: renamed from: n */
    public VText f78420n;

    /* JADX INFO: renamed from: o */
    public VText f78421o;

    /* JADX INFO: renamed from: p */
    public VText f78422p;

    /* JADX INFO: renamed from: q */
    public C15516a3 f78423q;

    /* JADX INFO: renamed from: r */
    public Act f78424r;

    /* JADX INFO: renamed from: l.c3$a */
    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C16046c3.this.f78420n.setVisibility(0);
            return true;
        }
    }

    public C16046c3(Act act) {
        this.f78424r = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m104954d(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78424r;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f78424r;
    }

    /* JADX INFO: renamed from: b */
    public View m104955b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16296d3.m109836b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C15516a3 c15516a3) {
        this.f78423q = c15516a3;
    }

    /* JADX INFO: renamed from: e */
    public void m104957e() {
        xdl0.m208344M(this.f78421o, true);
        this.f78421o.setText(i0g0.m133836C(act(), String.format("《%1$s & %2$s & %3$s & %4$s & %5$s & %6$s》", act().string(R$string.f19087y8), act().string(R$string.f18429ck), act().string(R$string.f18613ik), act().string(R$string.f17575A8), act().string(R$string.f18460dk), act().string(R$string.f19117z8)), new Triple(act().string(R$string.f19087y8), juk.m143328j(), 0), new Triple(act().string(R$string.f18429ck), juk.m143327i(), 0), new Triple(act().string(R$string.f18613ik), juk.m143326h(), -1), new Triple(act().string(R$string.f17575A8), juk.m143321c(), 0), new Triple(act().string(R$string.f18460dk), "BusinessLicenseAct", 0), new Triple(act().string(R$string.f19117z8), juk.m143320b(), 0)));
        this.f78421o.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104955b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m104958r() {
        this.f78407a.setTitle(R$string.f18833po);
        this.f78407a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72759a.m104954d(view);
            }
        });
        this.f78419m.setText(act().getString(R$string.f18863qo, "7.2.7"));
        this.f78420n.setText(tre0.m190411a());
        this.f78419m.setOnLongClickListener(new a());
        this.f78423q.m94636g0();
        this.f78422p.setText(act().getString(R$string.f18802oo, mqi0.f135259k.format(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()))));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
