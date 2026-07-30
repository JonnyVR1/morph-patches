package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.MarryProfileAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class d5x implements iam<b5x>, myl {

    /* JADX INFO: renamed from: l */
    public static final int f85206l = qa00.m175859d(24.0f);

    /* JADX INFO: renamed from: a */
    public VFrame f85207a;

    /* JADX INFO: renamed from: b */
    public VFrame f85208b;

    /* JADX INFO: renamed from: c */
    public View f85209c;

    /* JADX INFO: renamed from: d */
    public VImage f85210d;

    /* JADX INFO: renamed from: e */
    public VFrame_Shadow f85211e;

    /* JADX INFO: renamed from: f */
    public VLinear f85212f;

    /* JADX INFO: renamed from: g */
    public VText f85213g;

    /* JADX INFO: renamed from: h */
    public Act f85214h;

    /* JADX INFO: renamed from: i */
    public b5x f85215i;

    /* JADX INFO: renamed from: j */
    public v7m f85216j;

    /* JADX INFO: renamed from: k */
    public int f85217k = 0;

    /* JADX INFO: renamed from: l.d5x$a */
    public class C16458a extends RecyclerView.AbstractC0584t {
        public C16458a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            d5x d5xVar = d5x.this;
            d5xVar.f85217k += i2;
            try {
                d5xVar.m114339f();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    public d5x(Act act) {
        this.f85214h = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m114336i(View view) {
        this.f85215i.m102663s0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f85214h;
    }

    /* JADX INFO: renamed from: c */
    public View m114337c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e5x.m119558b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: d */
    public void mo48632d(User user) {
        this.f85216j.mo39760a(user);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b5x b5xVar) {
        this.f85215i = b5xVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m114339f() {
        int i = this.f85217k;
        int i2 = f85206l;
        float f = i <= i2 ? i / i2 : 1.0f;
        this.f85209c.setAlpha(f);
        String strMo34600tn = CoreModule.m30933P().m143405a().mo34600tn();
        if (TextUtils.isEmpty(strMo34600tn)) {
            strMo34600tn = "#ECD3D3";
        }
        int color = Color.parseColor(strMo34600tn);
        ((MarryProfileAct) this.f85214h).setStatusBarColor(Color.argb(255 - ((int) (f * 255.0f)), Color.red(color), Color.green(color), Color.blue(color)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM114337c = m114337c(layoutInflater, viewGroup);
        this.f85216j = CoreModule.m30933P().m143405a().mo34373Mj(this.f85207a, "profile", new C16458a());
        bnl0.m105509E0(this.f85212f, new View.OnClickListener() { // from class: l.c5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79906a.m114336i(view);
            }
        });
        this.f85213g.setText(CoreModule.m30933P().m143405a().mo34593sl());
        return viewM114337c;
    }

    /* JADX INFO: renamed from: j */
    public void m114340j(boolean z) {
        bnl0.m105524M(this.f85211e, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
