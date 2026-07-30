package com.clevertap.android.sdk;

import android.content.Context;
import android.location.Location;
import java.util.concurrent.Future;
import org.json.JSONObject;
import p149l.ak2;
import p149l.qs9;

/* JADX INFO: renamed from: com.clevertap.android.sdk.h */
/* JADX INFO: loaded from: classes.dex */
class C1197h extends AbstractC1184e {

    /* JADX INFO: renamed from: a */
    private int f4989a = 0;

    /* JADX INFO: renamed from: b */
    private int f4990b = 0;

    /* JADX INFO: renamed from: c */
    private final ak2 f4991c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f4992d;

    /* JADX INFO: renamed from: e */
    private final Context f4993e;

    /* JADX INFO: renamed from: f */
    private final qs9 f4994f;

    /* JADX INFO: renamed from: g */
    private final Logger f4995g;

    public C1197h(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, qs9 qs9Var, ak2 ak2Var) {
        this.f4993e = context;
        this.f4992d = cleverTapInstanceConfig;
        this.f4995g = cleverTapInstanceConfig.getLogger();
        this.f4994f = qs9Var;
        this.f4991c = ak2Var;
    }

    @Override // com.clevertap.android.sdk.AbstractC1184e
    /* JADX INFO: renamed from: a */
    public Future<?> mo6009a(Location location) {
        if (location == null) {
            return null;
        }
        this.f4994f.m176204e0(location);
        this.f4995g.verbose(this.f4992d.getAccountId(), "Location updated (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        if (!this.f4994f.m176179F() && !CleverTapAPI.m5762W()) {
            return null;
        }
        int iM6097b = m6097b();
        if (this.f4994f.m176179F() && iM6097b > this.f4990b + 10) {
            Future<?> futureMo97100g = this.f4991c.mo97100g(this.f4993e, new JSONObject(), 2);
            m6099d(iM6097b);
            this.f4995g.verbose(this.f4992d.getAccountId(), "Queuing location ping event for geofence location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
            return futureMo97100g;
        }
        if (this.f4994f.m176179F() || iM6097b <= this.f4989a + 10) {
            return null;
        }
        Future<?> futureMo97100g2 = this.f4991c.mo97100g(this.f4993e, new JSONObject(), 2);
        m6098c(iM6097b);
        this.f4995g.verbose(this.f4992d.getAccountId(), "Queuing location ping event for location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        return futureMo97100g2;
    }

    /* JADX INFO: renamed from: b */
    public int m6097b() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: c */
    public void m6098c(int i) {
        this.f4989a = i;
    }

    /* JADX INFO: renamed from: d */
    public void m6099d(int i) {
        this.f4990b = i;
    }
}
