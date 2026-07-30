package p153l;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import kotlin.Triple;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.c3 */
/* JADX INFO: loaded from: classes12.dex */
public class C16168c3 implements iam<C15627a3> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f79536a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f79537b;

    /* JADX INFO: renamed from: c */
    public VText f79538c;

    /* JADX INFO: renamed from: d */
    public VText f79539d;

    /* JADX INFO: renamed from: e */
    public VText f79540e;

    /* JADX INFO: renamed from: f */
    public VText f79541f;

    /* JADX INFO: renamed from: g */
    public VText f79542g;

    /* JADX INFO: renamed from: h */
    public VText f79543h;

    /* JADX INFO: renamed from: i */
    public VText f79544i;

    /* JADX INFO: renamed from: j */
    public VText f79545j;

    /* JADX INFO: renamed from: k */
    public ImageView f79546k;

    /* JADX INFO: renamed from: l */
    public VText f79547l;

    /* JADX INFO: renamed from: m */
    public VText f79548m;

    /* JADX INFO: renamed from: n */
    public VText f79549n;

    /* JADX INFO: renamed from: o */
    public VText f79550o;

    /* JADX INFO: renamed from: p */
    public VText f79551p;

    /* JADX INFO: renamed from: q */
    public C15627a3 f79552q;

    /* JADX INFO: renamed from: r */
    public Act f79553r;

    /* JADX INFO: renamed from: l.c3$a */
    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C16168c3.this.f79549n.setVisibility(0);
            return true;
        }
    }

    public C16168c3(Act act) {
        this.f79553r = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m107728d(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f79553r;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f79553r;
    }

    /* JADX INFO: renamed from: b */
    public View m107729b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16427d3.m113781b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C15627a3 c15627a3) {
        this.f79552q = c15627a3;
    }

    /* JADX INFO: renamed from: e */
    public void m107731e() {
        bnl0.m105524M(this.f79550o, true);
        this.f79550o.setText(q8g0.m175771C(act(), String.format("《%1$s & %2$s & %3$s & %4$s & %5$s & %6$s》", act().string(R$string.f18294A8), act().string(R$string.f19838yk), act().string(R$string.f18430Ek), act().string(R$string.f18356C8), act().string(R$string.f19869zk), act().string(R$string.f18325B8)), new Triple(act().string(R$string.f18294A8), zwk.m221910j(), 0), new Triple(act().string(R$string.f19838yk), zwk.m221909i(), 0), new Triple(act().string(R$string.f18430Ek), zwk.m221908h(), -1), new Triple(act().string(R$string.f18356C8), zwk.m221903c(), 0), new Triple(act().string(R$string.f19869zk), "BusinessLicenseAct", 0), new Triple(act().string(R$string.f18325B8), zwk.m221902b(), 0)));
        this.f79550o.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m107729b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m107732r() {
        this.f79536a.setTitle(R$string.f18651Lo);
        this.f79536a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74691a.m107728d(view);
            }
        });
        this.f79548m.setText(act().getString(R$string.f18681Mo, "7.3.3"));
        this.f79549n.setText(a0f0.m95344a());
        this.f79548m.setOnLongClickListener(new a());
        this.f79552q.m95735g0();
        this.f79551p.setText(act().getString(R$string.f18620Ko, pzi0.f154864k.format(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()))));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
