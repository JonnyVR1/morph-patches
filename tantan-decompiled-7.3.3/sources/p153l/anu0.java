package p153l;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzgaa;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class anu0 {

    /* JADX INFO: renamed from: k */
    public static final ImageView.ScaleType f72384k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a */
    public final grw0 f72385a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f72386b;

    /* JADX INFO: renamed from: c */
    public final zlu0 f72387c;

    /* JADX INFO: renamed from: d */
    public final ulu0 f72388d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final mnu0 f72389e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final unu0 f72390f;

    /* JADX INFO: renamed from: g */
    public final Executor f72391g;

    /* JADX INFO: renamed from: h */
    public final Executor f72392h;

    /* JADX INFO: renamed from: i */
    public final zzbjb f72393i;

    /* JADX INFO: renamed from: j */
    public final klu0 f72394j;

    public anu0(grw0 grw0Var, o7w0 o7w0Var, zlu0 zlu0Var, ulu0 ulu0Var, @Nullable mnu0 mnu0Var, @Nullable unu0 unu0Var, Executor executor, Executor executor2, klu0 klu0Var) {
        this.f72385a = grw0Var;
        this.f72386b = o7w0Var;
        this.f72393i = o7w0Var.f145323i;
        this.f72387c = zlu0Var;
        this.f72388d = ulu0Var;
        this.f72389e = mnu0Var;
        this.f72390f = unu0Var;
        this.f72391g = executor;
        this.f72392h = executor2;
        this.f72394j = klu0Var;
    }

    /* JADX INFO: renamed from: h */
    public static void m99029h(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m99030a(ViewGroup viewGroup) {
        ulu0 ulu0Var = this.f72388d;
        if (ulu0Var.m196583S() != null) {
            boolean z = viewGroup != null;
            if (ulu0Var.m196580P() == 2 || ulu0Var.m196580P() == 1) {
                this.f72385a.mo131905o(this.f72386b.f145320f, String.valueOf(ulu0Var.m196580P()), z);
            } else if (ulu0Var.m196580P() == 6) {
                this.f72385a.mo131905o(this.f72386b.f145320f, "2", z);
                this.f72385a.mo131905o(this.f72386b.f145320f, "1", z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m99031b(wnu0 wnu0Var) {
        ViewGroup viewGroup;
        View viewM196582R;
        final ViewGroup viewGroup2;
        xks0 xks0VarM150397a;
        Drawable drawable;
        if (!this.f72387c.mo216638f() && !this.f72387c.mo216637e()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {"1098", "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            View viewMo168282B = wnu0Var.mo168282B(strArr[i]);
            if (viewMo168282B != null && (viewMo168282B instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewMo168282B;
                break;
            }
            i++;
        }
        Context context = wnu0Var.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ulu0 ulu0Var = this.f72388d;
        if (ulu0Var.m196582R() != null) {
            zzbjb zzbjbVar = this.f72393i;
            viewM196582R = ulu0Var.m196582R();
            if (zzbjbVar != null && viewGroup == null) {
                m99029h(layoutParams, zzbjbVar.zze);
                viewM196582R.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (ulu0Var.m196589Y() instanceof dks0) {
            dks0 dks0Var = (dks0) ulu0Var.m196589Y();
            if (viewGroup == null) {
                m99029h(layoutParams, dks0Var.zzc());
                viewGroup = null;
            }
            View zzbixVar = new zzbix(context, dks0Var, layoutParams);
            zzbixVar.setContentDescription((CharSequence) jas0.m144075c().m176505a(sgs0.f168003H3));
            viewM196582R = zzbixVar;
        } else {
            viewM196582R = null;
        }
        if (viewM196582R != null) {
            if (viewM196582R.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewM196582R.getParent()).removeView(viewM196582R);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewM196582R);
            } else {
                zza zzaVar = new zza(wnu0Var.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewM196582R);
                FrameLayout frameLayoutZzh = wnu0Var.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            wnu0Var.mo168283Y2(wnu0Var.zzk(), viewM196582R, true);
        }
        zzgaa zzgaaVar = qmu0.f158420o;
        int size = zzgaaVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewMo168282B2 = wnu0Var.mo168282B((String) zzgaaVar.get(i2));
            i2++;
            if (viewMo168282B2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewMo168282B2;
                break;
            }
        }
        this.f72392h.execute(new Runnable() { // from class: l.rmu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163935a.m99030a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (m99037i(viewGroup2, true)) {
            ulu0 ulu0Var2 = this.f72388d;
            if (ulu0Var2.m196602f0() != null) {
                ulu0Var2.m196602f0().mo13709F(new tmu0(wnu0Var, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168045K9)).booleanValue() && m99037i(viewGroup2, false)) {
            ulu0 ulu0Var3 = this.f72388d;
            if (ulu0Var3.m196598d0() != null) {
                ulu0Var3.m196598d0().mo13709F(new tmu0(wnu0Var, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = wnu0Var.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (xks0VarM150397a = this.f72394j.m150397a()) == null) {
            return;
        }
        try {
            p1m p1mVarZzi = xks0VarM150397a.zzi();
            if (p1mVarZzi == null || (drawable = (Drawable) h950.m134037P2(p1mVarZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            p1m p1mVarZzj = wnu0Var.zzj();
            if (p1mVarZzj == null) {
                imageView.setScaleType(f72384k);
            } else if (((Boolean) jas0.m144075c().m176505a(sgs0.f168338i6)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) h950.m134037P2(p1mVarZzj));
            } else {
                imageView.setScaleType(f72384k);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            dct0.m115298g("Could not get main image drawable");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m99032c(@Nullable wnu0 wnu0Var) {
        if (wnu0Var == null || this.f72389e == null || wnu0Var.zzh() == null || !this.f72387c.mo216639g()) {
            return;
        }
        try {
            wnu0Var.zzh().addView(this.f72389e.m159199a());
        } catch (zzcjw e) {
            d2v0.m113738l("web view can not be obtained", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m99033d(@Nullable wnu0 wnu0Var) {
        if (wnu0Var == null) {
            return;
        }
        Context context = wnu0Var.zzf().getContext();
        if (d4t0.m114242h(context, this.f72387c.f205009a)) {
            if (!(context instanceof Activity)) {
                dct0.m115293b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f72390f == null || wnu0Var.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
                windowManager.addView(this.f72390f.m196951a(wnu0Var.zzh(), windowManager), d4t0.m114236b());
            } catch (zzcjw e) {
                d2v0.m113738l("web view can not be obtained", e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m99034e(final wnu0 wnu0Var) {
        this.f72391g.execute(new Runnable() { // from class: l.smu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f169615a.m99031b(wnu0Var);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final boolean m99035f(@NonNull ViewGroup viewGroup) {
        return m99037i(viewGroup, false);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m99036g(@NonNull ViewGroup viewGroup) {
        return m99037i(viewGroup, true);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m99037i(@NonNull ViewGroup viewGroup, boolean z) {
        ulu0 ulu0Var = this.f72388d;
        View viewM196583S = z ? ulu0Var.m196583S() : ulu0Var.m196584T();
        if (viewM196583S == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewM196583S.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewM196583S.getParent()).removeView(viewM196583S);
        }
        viewGroup.addView(viewM196583S, ((Boolean) jas0.m144075c().m176505a(sgs0.f168027J3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
