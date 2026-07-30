package com.clevertap.android.sdk;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p153l.tk20;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
public /* synthetic */ class CleverTapFactory$getCoreState$databaseManager$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public CleverTapFactory$getCoreState$databaseManager$1(Object obj) {
        super(0, obj, tk20.class, "clearFirstRequestTs", "clearFirstRequestTs()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((tk20) this.receiver).m191487b();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
