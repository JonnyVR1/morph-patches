package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class udu0 {

    /* JADX INFO: renamed from: k */
    public static final ImageView.ScaleType f175961k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a */
    public final aiw0 f175962a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f175963b;

    /* JADX INFO: renamed from: c */
    public final tcu0 f175964c;

    /* JADX INFO: renamed from: d */
    public final ocu0 f175965d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final geu0 f175966e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final oeu0 f175967f;

    /* JADX INFO: renamed from: g */
    public final Executor f175968g;

    /* JADX INFO: renamed from: h */
    public final Executor f175969h;

    /* JADX INFO: renamed from: i */
    public final zzbjb f175970i;

    /* JADX INFO: renamed from: j */
    public final ecu0 f175971j;

    public udu0(aiw0 aiw0Var, iyv0 iyv0Var, tcu0 tcu0Var, ocu0 ocu0Var, @Nullable geu0 geu0Var, @Nullable oeu0 oeu0Var, Executor executor, Executor executor2, ecu0 ecu0Var) {
        this.f175962a = aiw0Var;
        this.f175963b = iyv0Var;
        this.f175970i = iyv0Var.f115499i;
        this.f175964c = tcu0Var;
        this.f175965d = ocu0Var;
        this.f175966e = geu0Var;
        this.f175967f = oeu0Var;
        this.f175968g = executor;
        this.f175969h = executor2;
        this.f175971j = ecu0Var;
    }

    /* JADX INFO: renamed from: h */
    public static void m193156h(RelativeLayout.LayoutParams layoutParams, int i) {
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
    public final /* synthetic */ void m193157a(ViewGroup viewGroup) {
        ocu0 ocu0Var = this.f175965d;
        if (ocu0Var.m163576S() != null) {
            boolean z = viewGroup != null;
            if (ocu0Var.m163573P() == 2 || ocu0Var.m163573P() == 1) {
                this.f175962a.mo96956o(this.f175963b.f115496f, String.valueOf(ocu0Var.m163573P()), z);
            } else if (ocu0Var.m163573P() == 6) {
                this.f175962a.mo96956o(this.f175963b.f115496f, "2", z);
                this.f175962a.mo96956o(this.f175963b.f115496f, "1", z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m193158b(qeu0 qeu0Var) {
        ViewGroup viewGroup;
        View viewM163575R;
        final ViewGroup viewGroup2;
        rbs0 rbs0VarM115753a;
        Drawable drawable;
        if (!this.f175964c.mo183428f() && !this.f175964c.mo183427e()) {
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
            View viewMo135627B = qeu0Var.mo135627B(strArr[i]);
            if (viewMo135627B != null && (viewMo135627B instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewMo135627B;
                break;
            }
            i++;
        }
        Context context = qeu0Var.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ocu0 ocu0Var = this.f175965d;
        if (ocu0Var.m163575R() != null) {
            zzbjb zzbjbVar = this.f175970i;
            viewM163575R = ocu0Var.m163575R();
            if (zzbjbVar != null && viewGroup == null) {
                m193156h(layoutParams, zzbjbVar.zze);
                viewM163575R.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (ocu0Var.m163582Y() instanceof xas0) {
            xas0 xas0Var = (xas0) ocu0Var.m163582Y();
            if (viewGroup == null) {
                m193156h(layoutParams, xas0Var.zzc());
                viewGroup = null;
            }
            View zzbixVar = new zzbix(context, xas0Var, layoutParams);
            zzbixVar.setContentDescription((CharSequence) d1s0.m109677c().m144697a(m7s0.f131932H3));
            viewM163575R = zzbixVar;
        } else {
            viewM163575R = null;
        }
        if (viewM163575R != null) {
            if (viewM163575R.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewM163575R.getParent()).removeView(viewM163575R);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewM163575R);
            } else {
                zza zzaVar = new zza(qeu0Var.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewM163575R);
                FrameLayout frameLayoutZzh = qeu0Var.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            qeu0Var.mo135628Y2(qeu0Var.zzk(), viewM163575R, true);
        }
        zzgaa zzgaaVar = kdu0.f122622o;
        int size = zzgaaVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewMo135627B2 = qeu0Var.mo135627B((String) zzgaaVar.get(i2));
            i2++;
            if (viewMo135627B2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewMo135627B2;
                break;
            }
        }
        this.f175969h.execute(new Runnable() { // from class: l.ldu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127611a.m193157a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (m193164i(viewGroup2, true)) {
            ocu0 ocu0Var2 = this.f175965d;
            if (ocu0Var2.m163595f0() != null) {
                ocu0Var2.m163595f0().mo13655F(new ndu0(qeu0Var, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131974K9)).booleanValue() && m193164i(viewGroup2, false)) {
            ocu0 ocu0Var3 = this.f175965d;
            if (ocu0Var3.m163591d0() != null) {
                ocu0Var3.m163591d0().mo13655F(new ndu0(qeu0Var, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = qeu0Var.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (rbs0VarM115753a = this.f175971j.m115753a()) == null) {
            return;
        }
        try {
            uyl uylVarZzi = rbs0VarM115753a.zzi();
            if (uylVarZzi == null || (drawable = (Drawable) s050.m181847P2(uylVarZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            uyl uylVarZzj = qeu0Var.zzj();
            if (uylVarZzj == null) {
                imageView.setScaleType(f175961k);
            } else if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132267i6)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) s050.m181847P2(uylVarZzj));
            } else {
                imageView.setScaleType(f175961k);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            x2t0.m206869g("Could not get main image drawable");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m193159c(@Nullable qeu0 qeu0Var) {
        if (qeu0Var == null || this.f175966e == null || qeu0Var.zzh() == null || !this.f175964c.mo183429g()) {
            return;
        }
        try {
            qeu0Var.zzh().addView(this.f175966e.m125851a());
        } catch (zzcjw e) {
            xsu0.m210835l("web view can not be obtained", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m193160d(@Nullable qeu0 qeu0Var) {
        if (qeu0Var == null) {
            return;
        }
        Context context = qeu0Var.zzf().getContext();
        if (xus0.m211191h(context, this.f175964c.f169477a)) {
            if (!(context instanceof Activity)) {
                x2t0.m206864b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f175967f == null || qeu0Var.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
                windowManager.addView(this.f175967f.m164023a(qeu0Var.zzh(), windowManager), xus0.m211185b());
            } catch (zzcjw e) {
                xsu0.m210835l("web view can not be obtained", e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m193161e(final qeu0 qeu0Var) {
        this.f175968g.execute(new Runnable() { // from class: l.mdu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133311a.m193158b(qeu0Var);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final boolean m193162f(@NonNull ViewGroup viewGroup) {
        return m193164i(viewGroup, false);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m193163g(@NonNull ViewGroup viewGroup) {
        return m193164i(viewGroup, true);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m193164i(@NonNull ViewGroup viewGroup, boolean z) {
        ocu0 ocu0Var = this.f175965d;
        View viewM163576S = z ? ocu0Var.m163576S() : ocu0Var.m163577T();
        if (viewM163576S == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewM163576S.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewM163576S.getParent()).removeView(viewM163576S);
        }
        viewGroup.addView(viewM163576S, ((Boolean) d1s0.m109677c().m144697a(m7s0.f131956J3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
