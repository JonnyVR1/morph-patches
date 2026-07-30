package com.hellogroup.p036mk.core.log;

import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
final /* synthetic */ class MKCoreLogManager$getReporter$1 extends MutablePropertyReference0 {
    public MKCoreLogManager$getReporter$1(MKCoreLogManager mKCoreLogManager) {
        super(mKCoreLogManager);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    @Nullable
    public Object get() {
        return MKCoreLogManager.m18423a((MKCoreLogManager) this.receiver);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "logReporter";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.m88396b(MKCoreLogManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getLogReporter()Lcom/hellogroup/mk/core/log/core/MKLogReporter;";
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public void set(@Nullable Object obj) {
        MKCoreLogManager.logReporter = (MKLogReporter) obj;
    }
}
