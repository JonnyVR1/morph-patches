package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p153l.jum;
import p153l.qzv;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements jum<WorkManager> {

    /* JADX INFO: renamed from: a */
    public static final String f3408a = qzv.m178831i("WrkMgrInitializer");

    @Override // p153l.jum
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WorkManager mo2996a(@NonNull Context context) {
        qzv.m178829e().mo178832a(f3408a, "Initializing WorkManager with default configuration.");
        WorkManager.m4350i(context, new C0763a.a().m4393a());
        return WorkManager.m4349h(context);
    }

    @Override // p153l.jum
    @NonNull
    public List<Class<? extends jum<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
