package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
public /* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public CrashlyticsWorkers$Companion$checkBlockingThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(((CrashlyticsWorkers.Companion) this.receiver).isBlockingThread());
    }
}
