package com.clevertap.android.sdk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p149l.jc20;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public /* synthetic */ class CleverTapFactory$getCoreState$queueHeaderBuilder$2 extends FunctionReferenceImpl implements Function0<Integer> {
    public CleverTapFactory$getCoreState$queueHeaderBuilder$2(Object obj) {
        super(0, obj, jc20.class, "getLastRequestTs", "getLastRequestTs()I", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((jc20) this.receiver).m140855f());
    }
}
