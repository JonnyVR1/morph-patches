package com.p046p1.mobile.putong.core.p053ui.purchase.mediator;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j5b0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#¨\u0006%"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "b", "()V", Constants.INAPP_DATA_TAG, "purchaseType", "Ll/j5b0;", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ll/j5b0;", "mediator", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "e", "(Ll/j5b0;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "", "Ljava/util/Map;", "mediatorsMap", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C8777b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<PurchaseType, j5b0> mediatorsMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.b$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/b$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class a implements AbstractC8776a.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ j5b0 f34823b;

        public a(j5b0 j5b0Var) {
            this.f34823b = j5b0Var;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.c
        /* JADX INFO: renamed from: a */
        public void mo54045a(PurchaseAgreementState agreementState) throws Exception {
            agreementState.getClass();
            C8777b.this.m54050e(this.f34823b, agreementState);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8777b(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable String str) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.from = str;
        this.mediatorsMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: b */
    public final void m54047b() {
        for (PurchaseType purchaseType : this.purchaseTypes) {
            this.mediatorsMap.put(purchaseType, new j5b0(this.act, purchaseType, this.from));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final j5b0 m54048c(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        if (this.mediatorsMap.containsKey(purchaseType)) {
            return this.mediatorsMap.get(purchaseType);
        }
        j5b0 j5b0Var = new j5b0(this.act, purchaseType, this.from);
        this.mediatorsMap.put(purchaseType, j5b0Var);
        return j5b0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m54049d() {
        Iterator<Map.Entry<PurchaseType, j5b0>> it = this.mediatorsMap.entrySet().iterator();
        while (it.hasNext()) {
            j5b0 value = it.next().getValue();
            value.m54010H(new a(value));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m54050e(j5b0 mediator, PurchaseAgreementState agreementState) throws Exception {
        C8765d currentPurchaseSection;
        Iterator<Map.Entry<PurchaseType, j5b0>> it = this.mediatorsMap.entrySet().iterator();
        while (it.hasNext()) {
            j5b0 value = it.next().getValue();
            if (!Intrinsics.m87488d(mediator, value) && (currentPurchaseSection = value.getCurrentPurchaseSection()) != null) {
                value.m139826V(currentPurchaseSection, agreementState);
            }
        }
    }
}
