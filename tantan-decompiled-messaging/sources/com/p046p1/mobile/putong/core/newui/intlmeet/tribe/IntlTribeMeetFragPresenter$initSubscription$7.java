package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.data.DoublePair;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* synthetic */ class IntlTribeMeetFragPresenter$initSubscription$7 extends FunctionReferenceImpl implements Function3<DoublePair, RoamedLocationData, Object, Triple<? extends DoublePair, ? extends RoamedLocationData, ? extends Object>> {
    public static final IntlTribeMeetFragPresenter$initSubscription$7 INSTANCE = new IntlTribeMeetFragPresenter$initSubscription$7();

    public IntlTribeMeetFragPresenter$initSubscription$7() {
        super(3, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Triple<DoublePair, RoamedLocationData, Object> invoke(DoublePair doublePair, RoamedLocationData roamedLocationData, Object obj) {
        return new Triple<>(doublePair, roamedLocationData, obj);
    }
}
