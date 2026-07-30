package p153l;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class enu0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final qru0 f94829a;

    /* JADX INFO: renamed from: b */
    public final Clock f94830b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public kns0 f94831c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public bqs0 f94832d;

    /* JADX INFO: renamed from: e */
    @Nullable
    @VisibleForTesting
    public String f94833e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @VisibleForTesting
    public Long f94834f;

    /* JADX INFO: renamed from: g */
    @Nullable
    @VisibleForTesting
    public WeakReference f94835g;

    public enu0(qru0 qru0Var, Clock clock) {
        this.f94829a = qru0Var;
        this.f94830b = clock;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final kns0 m121561a() {
        return this.f94831c;
    }

    /* JADX INFO: renamed from: b */
    public final void m121562b() {
        if (this.f94831c == null || this.f94834f == null) {
            return;
        }
        m121564d();
        try {
            this.f94831c.zze();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m121563c(final kns0 kns0Var) {
        this.f94831c = kns0Var;
        bqs0 bqs0Var = this.f94832d;
        if (bqs0Var != null) {
            this.f94829a.m177709k("/unconfirmedClick", bqs0Var);
        }
        bqs0 bqs0Var2 = new bqs0() { // from class: l.dnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                enu0 enu0Var = this.f89845a;
                try {
                    enu0Var.f94834f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    dct0.m115295d("Failed to call parse unconfirmedClickTimestamp.");
                }
                kns0 kns0Var2 = kns0Var;
                enu0Var.f94833e = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (kns0Var2 == null) {
                    dct0.m115293b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    kns0Var2.mo146286i(str);
                } catch (RemoteException e) {
                    dct0.m115300i("#007 Could not call remote method.", e);
                }
            }
        };
        this.f94832d = bqs0Var2;
        this.f94829a.m177707i("/unconfirmedClick", bqs0Var2);
    }

    /* JADX INFO: renamed from: d */
    public final void m121564d() {
        View view;
        this.f94833e = null;
        this.f94834f = null;
        WeakReference weakReference = this.f94835g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f94835g = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f94835g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f94833e != null && this.f94834f != null) {
            HashMap map = new HashMap();
            map.put("id", this.f94833e);
            map.put("time_interval", String.valueOf(this.f94830b.currentTimeMillis() - this.f94834f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f94829a.m177705g("sendMessageToNativeJs", map);
        }
        m121564d();
    }
}
