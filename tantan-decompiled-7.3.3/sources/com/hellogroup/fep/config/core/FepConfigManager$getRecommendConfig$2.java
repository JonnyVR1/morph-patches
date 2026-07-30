package com.hellogroup.fep.config.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153l.bgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/bgi;", "observer", "", "invoke", "(Ll/bgi;)V", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
final class FepConfigManager$getRecommendConfig$2 extends Lambda implements Function1<bgi, Unit> {
    final /* synthetic */ String $key;
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigManager$getRecommendConfig$2(String str, Object obj) {
        super(1);
        this.$key = str;
        this.$value = obj;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull bgi bgiVar) {
        bgiVar.getClass();
        bgiVar.mo17603a("recommendConfig", this.$key, this.$value);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(bgi bgiVar) {
        invoke2(bgiVar);
        return Unit.INSTANCE;
    }
}
