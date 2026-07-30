package p149l;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ydu0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final kiu0 f197640a;

    /* JADX INFO: renamed from: b */
    public final Clock f197641b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ees0 f197642c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public vgs0 f197643d;

    /* JADX INFO: renamed from: e */
    @Nullable
    @VisibleForTesting
    public String f197644e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @VisibleForTesting
    public Long f197645f;

    /* JADX INFO: renamed from: g */
    @Nullable
    @VisibleForTesting
    public WeakReference f197646g;

    public ydu0(kiu0 kiu0Var, Clock clock) {
        this.f197640a = kiu0Var;
        this.f197641b = clock;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ees0 m214327a() {
        return this.f197642c;
    }

    /* JADX INFO: renamed from: b */
    public final void m214328b() {
        if (this.f197642c == null || this.f197645f == null) {
            return;
        }
        m214330d();
        try {
            this.f197642c.zze();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m214329c(final ees0 ees0Var) {
        this.f197642c = ees0Var;
        vgs0 vgs0Var = this.f197643d;
        if (vgs0Var != null) {
            this.f197640a.m146146k("/unconfirmedClick", vgs0Var);
        }
        vgs0 vgs0Var2 = new vgs0() { // from class: l.xdu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                ydu0 ydu0Var = this.f192466a;
                try {
                    ydu0Var.f197645f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    x2t0.m206866d("Failed to call parse unconfirmedClickTimestamp.");
                }
                ees0 ees0Var2 = ees0Var;
                ydu0Var.f197644e = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (ees0Var2 == null) {
                    x2t0.m206864b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    ees0Var2.mo111392i(str);
                } catch (RemoteException e) {
                    x2t0.m206871i("#007 Could not call remote method.", e);
                }
            }
        };
        this.f197643d = vgs0Var2;
        this.f197640a.m146144i("/unconfirmedClick", vgs0Var2);
    }

    /* JADX INFO: renamed from: d */
    public final void m214330d() {
        View view;
        this.f197644e = null;
        this.f197645f = null;
        WeakReference weakReference = this.f197646g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f197646g = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f197646g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f197644e != null && this.f197645f != null) {
            HashMap map = new HashMap();
            map.put("id", this.f197644e);
            map.put("time_interval", String.valueOf(this.f197641b.currentTimeMillis() - this.f197645f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f197640a.m146142g("sendMessageToNativeJs", map);
        }
        m214330d();
    }
}
