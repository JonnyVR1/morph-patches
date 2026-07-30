package com.clevertap.android.sdk;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p149l.jc20;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public /* synthetic */ class CleverTapFactory$getCoreState$databaseManager$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public CleverTapFactory$getCoreState$databaseManager$1(Object obj) {
        super(0, obj, jc20.class, "clearFirstRequestTs", "clearFirstRequestTs()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((jc20) this.receiver).m140851b();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
