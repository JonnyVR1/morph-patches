package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.MarryProfileAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class e2x implements s7m<c2x>, uvl {

    /* JADX INFO: renamed from: l */
    public static final int f88948l = t100.m186890d(24.0f);

    /* JADX INFO: renamed from: a */
    public VFrame f88949a;

    /* JADX INFO: renamed from: b */
    public VFrame f88950b;

    /* JADX INFO: renamed from: c */
    public View f88951c;

    /* JADX INFO: renamed from: d */
    public VImage f88952d;

    /* JADX INFO: renamed from: e */
    public VFrame_Shadow f88953e;

    /* JADX INFO: renamed from: f */
    public VLinear f88954f;

    /* JADX INFO: renamed from: g */
    public VText f88955g;

    /* JADX INFO: renamed from: h */
    public Act f88956h;

    /* JADX INFO: renamed from: i */
    public c2x f88957i;

    /* JADX INFO: renamed from: j */
    public f5m f88958j;

    /* JADX INFO: renamed from: k */
    public int f88959k = 0;

    /* JADX INFO: renamed from: l.e2x$a */
    public class C16527a extends RecyclerView.AbstractC0582t {
        public C16527a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            e2x e2xVar = e2x.this;
            e2xVar.f88959k += i2;
            try {
                e2xVar.m114534f();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    public e2x(Act act) {
        this.f88956h = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m114531i(View view) {
        this.f88957i.m104949s0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f88956h;
    }

    /* JADX INFO: renamed from: c */
    public View m114532c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2x.m119240b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: d */
    public void mo47449d(User user) {
        this.f88958j.mo38757a(user);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c2x c2xVar) {
        this.f88957i = c2xVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m114534f() {
        int i = this.f88959k;
        int i2 = f88948l;
        float f = i <= i2 ? i / i2 : 1.0f;
        this.f88951c.setAlpha(f);
        String strMo33597tn = CoreModule.m29935P().m94651a().mo33597tn();
        if (TextUtils.isEmpty(strMo33597tn)) {
            strMo33597tn = "#ECD3D3";
        }
        int color = Color.parseColor(strMo33597tn);
        ((MarryProfileAct) this.f88956h).setStatusBarColor(Color.argb(255 - ((int) (f * 255.0f)), Color.red(color), Color.green(color), Color.blue(color)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM114532c = m114532c(layoutInflater, viewGroup);
        this.f88958j = CoreModule.m29935P().m94651a().mo33370Mj(this.f88949a, "profile", new C16527a());
        xdl0.m208329E0(this.f88954f, new View.OnClickListener() { // from class: l.d2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83438a.m114531i(view);
            }
        });
        this.f88955g.setText(CoreModule.m29935P().m94651a().mo33590sl());
        return viewM114532c;
    }

    /* JADX INFO: renamed from: j */
    public void m114535j(boolean z) {
        xdl0.m208344M(this.f88953e, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
