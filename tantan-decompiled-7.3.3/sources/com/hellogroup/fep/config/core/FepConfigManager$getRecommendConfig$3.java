package com.hellogroup.fep.config.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m88122k = 3, m88123mv = {1, 1, 16})
final class FepConfigManager$getRecommendConfig$3 extends Lambda implements Function1<Exception, Unit> {
    public static final FepConfigManager$getRecommendConfig$3 INSTANCE = new FepConfigManager$getRecommendConfig$3();

    public FepConfigManager$getRecommendConfig$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Exception exc) {
        exc.getClass();
    }
}
