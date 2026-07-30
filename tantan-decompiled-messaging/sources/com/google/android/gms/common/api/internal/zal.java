package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import p149l.e01;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
public final class zal {
    private int zad;
    private final e01 zab = new e01();
    private final sei0 zac = new sei0();
    private boolean zae = false;
    private final e01 zaa = new e01();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final Task zaa() {
        return this.zac.m183657a();
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
                this.zac.m183659c(this.zab);
            } else {
                this.zac.m183658b(new AvailabilityException(this.zaa));
            }
        }
    }
}
