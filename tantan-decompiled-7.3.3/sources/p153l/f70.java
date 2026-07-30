package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjb;

/* JADX INFO: loaded from: classes6.dex */
public class f70 {

    /* JADX INFO: renamed from: a */
    public final ioy0 f97466a;

    /* JADX INFO: renamed from: b */
    public final Context f97467b;

    /* JADX INFO: renamed from: c */
    public final lps0 f97468c;

    /* JADX INFO: renamed from: l.f70$a */
    public static class C16918a {

        /* JADX INFO: renamed from: a */
        public final Context f97469a;

        /* JADX INFO: renamed from: b */
        public final ats0 f97470b;

        public C16918a(@NonNull Context context, @NonNull String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            ats0 ats0VarM184297c = k6s0.m148568a().m184297c(context, str, new qws0());
            this.f97469a = context2;
            this.f97470b = ats0VarM184297c;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public f70 m124341a() {
            try {
                return new f70(this.f97469a, this.f97470b.zze(), ioy0.f116230a);
            } catch (RemoteException e) {
                dct0.m115296e("Failed to build AdLoader.", e);
                return new f70(this.f97469a, new nqv0().m164354p8(), ioy0.f116230a);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C16918a m124342b(@NonNull md20.InterfaceC18591c interfaceC18591c) {
            try {
                this.f97470b.mo100267h4(new h1t0(interfaceC18591c));
                return this;
            } catch (RemoteException e) {
                dct0.m115299h("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C16918a m124343c(@NonNull d70 d70Var) {
            try {
                this.f97470b.mo100262T3(new frw0(d70Var));
                return this;
            } catch (RemoteException e) {
                dct0.m115299h("Failed to set AdListener.", e);
                return this;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C16918a m124344d(@NonNull qd20 qd20Var) {
            try {
                this.f97470b.mo100264X0(new zzbjb(4, qd20Var.m176131e(), -1, qd20Var.m176130d(), qd20Var.m176127a(), qd20Var.m176129c() != null ? new zzfk(qd20Var.m176129c()) : null, qd20Var.m176134h(), qd20Var.m176128b(), qd20Var.m176132f(), qd20Var.m176133g(), qd20Var.m176135i() - 1));
                return this;
            } catch (RemoteException e) {
                dct0.m115299h("Failed to specify native ad options", e);
                return this;
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public final C16918a m124345e(String str, yqw0 yqw0Var, @Nullable byv0 byv0Var) {
            vns0 vns0Var = new vns0(yqw0Var, byv0Var);
            try {
                this.f97470b.mo100261B2(str, vns0Var.m202009d(), vns0Var.m202008c());
                return this;
            } catch (RemoteException e) {
                dct0.m115299h("Failed to add custom template ad listener", e);
                return this;
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: f */
        public final C16918a m124346f(ntx0 ntx0Var) {
            try {
                this.f97470b.mo100267h4(new wns0(ntx0Var));
                return this;
            } catch (RemoteException e) {
                dct0.m115299h("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: g */
        public final C16918a m124347g(@NonNull pd20 pd20Var) {
            try {
                this.f97470b.mo100264X0(new zzbjb(pd20Var));
                return this;
            } catch (RemoteException e) {
                dct0.m115299h("Failed to specify native ad options", e);
                return this;
            }
        }
    }

    public f70(Context context, lps0 lps0Var, ioy0 ioy0Var) {
        this.f97467b = context;
        this.f97468c = lps0Var;
        this.f97466a = ioy0Var;
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: a */
    public void m124338a(@NonNull s70 s70Var) {
        m124340c(s70Var.f166632a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m124339b(xxu0 xxu0Var) {
        try {
            this.f97468c.mo136584l3(this.f97466a.m141359a(this.f97467b, xxu0Var));
        } catch (RemoteException e) {
            dct0.m115296e("Failed to load ad.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m124340c(final xxu0 xxu0Var) {
        sgs0.m185829a(this.f97467b);
        if (((Boolean) wis0.f189386c.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.u9r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f178130a.m124339b(xxu0Var);
                    }
                });
                return;
            }
        }
        try {
            this.f97468c.mo136584l3(this.f97466a.m141359a(this.f97467b, xxu0Var));
        } catch (RemoteException e) {
            dct0.m115296e("Failed to load ad.", e);
        }
    }
}
