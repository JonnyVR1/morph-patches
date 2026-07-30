package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import p153l.l01;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
public final class zal {
    private int zad;
    private final l01 zab = new l01();
    private final sni0 zac = new sni0();
    private boolean zae = false;
    private final l01 zaa = new l01();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final Task zaa() {
        return this.zac.m186939a();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.m186941c(this.zab);
            } else {
                this.zac.m186940b(new AvailabilityException(this.zaa));
            }
        }
    }
}
