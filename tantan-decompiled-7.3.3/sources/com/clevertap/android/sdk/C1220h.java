package com.clevertap.android.sdk;

import android.content.Context;
import android.location.Location;
import java.util.concurrent.Future;
import org.json.JSONObject;
import p153l.bu9;
import p153l.ik2;

/* JADX INFO: renamed from: com.clevertap.android.sdk.h */
/* JADX INFO: loaded from: classes.dex */
class C1220h extends AbstractC1207e {

    /* JADX INFO: renamed from: a */
    private int f5026a = 0;

    /* JADX INFO: renamed from: b */
    private int f5027b = 0;

    /* JADX INFO: renamed from: c */
    private final ik2 f5028c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f5029d;

    /* JADX INFO: renamed from: e */
    private final Context f5030e;

    /* JADX INFO: renamed from: f */
    private final bu9 f5031f;

    /* JADX INFO: renamed from: g */
    private final Logger f5032g;

    public C1220h(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, bu9 bu9Var, ik2 ik2Var) {
        this.f5030e = context;
        this.f5029d = cleverTapInstanceConfig;
        this.f5032g = cleverTapInstanceConfig.getLogger();
        this.f5031f = bu9Var;
        this.f5028c = ik2Var;
    }

    @Override // com.clevertap.android.sdk.AbstractC1207e
    /* JADX INFO: renamed from: a */
    public Future<?> mo6063a(Location location) {
        if (location == null) {
            return null;
        }
        this.f5031f.m106471e0(location);
        this.f5032g.verbose(this.f5029d.getAccountId(), "Location updated (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        if (!this.f5031f.m106446F() && !CleverTapAPI.m5816W()) {
            return null;
        }
        int iM6151b = m6151b();
        if (this.f5031f.m106446F() && iM6151b > this.f5027b + 10) {
            Future<?> futureMo140249g = this.f5028c.mo140249g(this.f5030e, new JSONObject(), 2);
            m6153d(iM6151b);
            this.f5032g.verbose(this.f5029d.getAccountId(), "Queuing location ping event for geofence location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
            return futureMo140249g;
        }
        if (this.f5031f.m106446F() || iM6151b <= this.f5026a + 10) {
            return null;
        }
        Future<?> futureMo140249g2 = this.f5028c.mo140249g(this.f5030e, new JSONObject(), 2);
        m6152c(iM6151b);
        this.f5032g.verbose(this.f5029d.getAccountId(), "Queuing location ping event for location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        return futureMo140249g2;
    }

    /* JADX INFO: renamed from: b */
    public int m6151b() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: c */
    public void m6152c(int i) {
        this.f5026a = i;
    }

    /* JADX INFO: renamed from: d */
    public void m6153d(int i) {
        this.f5027b = i;
    }
}
