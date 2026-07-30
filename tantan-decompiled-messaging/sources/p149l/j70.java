package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjb;

/* JADX INFO: loaded from: classes6.dex */
public class j70 {

    /* JADX INFO: renamed from: a */
    public final cfy0 f116552a;

    /* JADX INFO: renamed from: b */
    public final Context f116553b;

    /* JADX INFO: renamed from: c */
    public final fgs0 f116554c;

    /* JADX INFO: renamed from: l.j70$a */
    public static class C17709a {

        /* JADX INFO: renamed from: a */
        public final Context f116555a;

        /* JADX INFO: renamed from: b */
        public final ujs0 f116556b;

        public C17709a(@NonNull Context context, @NonNull String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            ujs0 ujs0VarM156441c = exr0.m118702a().m156441c(context, str, new kns0());
            this.f116555a = context2;
            this.f116556b = ujs0VarM156441c;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public j70 m140067a() {
            try {
                return new j70(this.f116555a, this.f116556b.zze(), cfy0.f80684a);
            } catch (RemoteException e) {
                x2t0.m206867e("Failed to build AdLoader.", e);
                return new j70(this.f116555a, new hhv0().m131161p8(), cfy0.f80684a);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C17709a m140068b(@NonNull e520.InterfaceC16544c interfaceC16544c) {
            try {
                this.f116556b.mo131157h4(new bss0(interfaceC16544c));
                return this;
            } catch (RemoteException e) {
                x2t0.m206870h("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C17709a m140069c(@NonNull h70 h70Var) {
            try {
                this.f116556b.mo131152T3(new zhw0(h70Var));
                return this;
            } catch (RemoteException e) {
                x2t0.m206870h("Failed to set AdListener.", e);
                return this;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C17709a m140070d(@NonNull i520 i520Var) {
            try {
                this.f116556b.mo131154X0(new zzbjb(4, i520Var.m134445e(), -1, i520Var.m134444d(), i520Var.m134441a(), i520Var.m134443c() != null ? new zzfk(i520Var.m134443c()) : null, i520Var.m134448h(), i520Var.m134442b(), i520Var.m134446f(), i520Var.m134447g(), i520Var.m134449i() - 1));
                return this;
            } catch (RemoteException e) {
                x2t0.m206870h("Failed to specify native ad options", e);
                return this;
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public final C17709a m140071e(String str, shw0 shw0Var, @Nullable vov0 vov0Var) {
            pes0 pes0Var = new pes0(shw0Var, vov0Var);
            try {
                this.f116556b.mo131151B2(str, pes0Var.m168547d(), pes0Var.m168546c());
                return this;
            } catch (RemoteException e) {
                x2t0.m206870h("Failed to add custom template ad listener", e);
                return this;
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: f */
        public final C17709a m140072f(hkx0 hkx0Var) {
            try {
                this.f116556b.mo131157h4(new qes0(hkx0Var));
                return this;
            } catch (RemoteException e) {
                x2t0.m206870h("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: g */
        public final C17709a m140073g(@NonNull h520 h520Var) {
            try {
                this.f116556b.mo131154X0(new zzbjb(h520Var));
                return this;
            } catch (RemoteException e) {
                x2t0.m206870h("Failed to specify native ad options", e);
                return this;
            }
        }
    }

    public j70(Context context, fgs0 fgs0Var, cfy0 cfy0Var) {
        this.f116553b = context;
        this.f116554c = fgs0Var;
        this.f116552a = cfy0Var;
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: a */
    public void m140064a(@NonNull w70 w70Var) {
        m140066c(w70Var.f185014a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m140065b(rou0 rou0Var) {
        try {
            this.f116554c.mo101747l3(this.f116552a.m106615a(this.f116553b, rou0Var));
        } catch (RemoteException e) {
            x2t0.m206867e("Failed to load ad.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m140066c(final rou0 rou0Var) {
        m7s0.m153417a(this.f116553b);
        if (((Boolean) q9s0.f153472c.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.o0r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f141362a.m140065b(rou0Var);
                    }
                });
                return;
            }
        }
        try {
            this.f116554c.mo101747l3(this.f116552a.m106615a(this.f116553b, rou0Var));
        } catch (RemoteException e) {
            x2t0.m206867e("Failed to load ad.", e);
        }
    }
}
