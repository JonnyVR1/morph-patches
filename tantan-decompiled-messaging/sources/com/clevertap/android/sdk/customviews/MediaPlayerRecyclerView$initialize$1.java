package com.clevertap.android.sdk.customviews;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public /* synthetic */ class MediaPlayerRecyclerView$initialize$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public MediaPlayerRecyclerView$initialize$1(Object obj) {
        super(0, obj, MediaPlayerRecyclerView.class, "bufferingStarted", "bufferingStarted()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MediaPlayerRecyclerView) this.receiver).m5989L();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
