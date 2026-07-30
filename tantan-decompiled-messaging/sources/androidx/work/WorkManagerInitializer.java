package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p149l.hsm;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements hsm<WorkManager> {

    /* JADX INFO: renamed from: a */
    public static final String f3408a = txv.m190978i("WrkMgrInitializer");

    @Override // p149l.hsm
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WorkManager mo2995a(@NonNull Context context) {
        txv.m190976e().mo190979a(f3408a, "Initializing WorkManager with default configuration.");
        WorkManager.m4348i(context, new C0761a.a().m4391a());
        return WorkManager.m4347h(context);
    }

    @Override // p149l.hsm
    @NonNull
    public List<Class<? extends hsm<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
