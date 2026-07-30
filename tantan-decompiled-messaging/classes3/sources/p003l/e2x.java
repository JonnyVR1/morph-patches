package p003l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import l.f2x;
import l.f5m;
import l.s7m;
import l.t100;
import l.xdl0;
import p028v.VFrame;
import p028v.VFrame_Shadow;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class e2x implements s7m<c2x>, uvl {

    /* JADX INFO: renamed from: l */
    public static final int f3181l = t100.d(24.0f);

    /* JADX INFO: renamed from: a */
    public VFrame f3182a;

    /* JADX INFO: renamed from: b */
    public VFrame f3183b;

    /* JADX INFO: renamed from: c */
    public View f3184c;

    /* JADX INFO: renamed from: d */
    public VImage f3185d;

    /* JADX INFO: renamed from: e */
    public VFrame_Shadow f3186e;

    /* JADX INFO: renamed from: f */
    public VLinear f3187f;

    /* JADX INFO: renamed from: g */
    public VText f3188g;

    /* JADX INFO: renamed from: h */
    public Act f3189h;

    /* JADX INFO: renamed from: i */
    public c2x f3190i;

    /* JADX INFO: renamed from: j */
    public f5m f3191j;

    /* JADX INFO: renamed from: k */
    public int f3192k = 0;

    /* JADX INFO: renamed from: l.e2x$a */
    public class C0254a extends RecyclerView.t {
        public C0254a() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            e2x e2xVar = e2x.this;
            e2xVar.f3192k += i2;
            try {
                e2xVar.m3785f();
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    public e2x(Act act) {
        this.f3189h = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m3781i(View view) {
        this.f3190i.m3238s0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3782C0() {
        return this.f3189h;
    }

    /* JADX INFO: renamed from: c */
    public View m3783c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2x.b(this, layoutInflater, viewGroup);
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: d */
    public void mo494d(User user) {
        this.f3191j.a(user);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m3786i1(c2x c2xVar) {
        this.f3190i = c2xVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m3785f() {
        int i = this.f3192k;
        int i2 = f3181l;
        float f = i <= i2 ? i / i2 : 1.0f;
        this.f3184c.setAlpha(f);
        String strTn = CoreModule.P().a().tn();
        if (TextUtils.isEmpty(strTn)) {
            strTn = "#ECD3D3";
        }
        int color = Color.parseColor(strTn);
        this.f3189h.setStatusBarColor(Color.argb(255 - ((int) (f * 255.0f)), Color.red(color), Color.green(color), Color.blue(color)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM3783c = m3783c(layoutInflater, viewGroup);
        this.f3191j = CoreModule.P().a().Mj(this.f3182a, "profile", new C0254a());
        xdl0.E0(this.f3187f, new View.OnClickListener() { // from class: l.d2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2891a.m3781i(view);
            }
        });
        this.f3188g.setText(CoreModule.P().a().sl());
        return viewM3783c;
    }

    /* JADX INFO: renamed from: j */
    public void m3787j(boolean z) {
        xdl0.M(this.f3186e, z);
    }

    public void destroy() {
    }
}
