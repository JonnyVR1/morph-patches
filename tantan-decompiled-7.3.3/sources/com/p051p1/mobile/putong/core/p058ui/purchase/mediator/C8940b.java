package com.p051p1.mobile.putong.core.p058ui.purchase.mediator;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
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
import p153l.ndb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.b */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#¨\u0006%"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/b;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "b", "()V", Constants.INAPP_DATA_TAG, "purchaseType", "Ll/ndb0;", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ll/ndb0;", "mediator", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "e", "(Ll/ndb0;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "", "Ljava/util/Map;", "mediatorsMap", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C8940b {

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
    public final Map<PurchaseType, ndb0> mediatorsMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.b$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/b$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class a implements AbstractC8939a.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ndb0 f35671b;

        public a(ndb0 ndb0Var) {
            this.f35671b = ndb0Var;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.c
        /* JADX INFO: renamed from: a */
        public void mo55228a(PurchaseAgreementState agreementState) throws Exception {
            agreementState.getClass();
            C8940b.this.m55233e(this.f35671b, agreementState);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8940b(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable String str) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.from = str;
        this.mediatorsMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: b */
    public final void m55230b() {
        for (PurchaseType purchaseType : this.purchaseTypes) {
            this.mediatorsMap.put(purchaseType, new ndb0(this.act, purchaseType, this.from));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final ndb0 m55231c(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        if (this.mediatorsMap.containsKey(purchaseType)) {
            return this.mediatorsMap.get(purchaseType);
        }
        ndb0 ndb0Var = new ndb0(this.act, purchaseType, this.from);
        this.mediatorsMap.put(purchaseType, ndb0Var);
        return ndb0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m55232d() {
        Iterator<Map.Entry<PurchaseType, ndb0>> it = this.mediatorsMap.entrySet().iterator();
        while (it.hasNext()) {
            ndb0 value = it.next().getValue();
            value.m55193H(new a(value));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m55233e(ndb0 mediator, PurchaseAgreementState agreementState) throws Exception {
        C8928d currentPurchaseSection;
        Iterator<Map.Entry<PurchaseType, ndb0>> it = this.mediatorsMap.entrySet().iterator();
        while (it.hasNext()) {
            ndb0 value = it.next().getValue();
            if (!Intrinsics.m88377d(mediator, value) && (currentPurchaseSection = value.getCurrentPurchaseSection()) != null) {
                value.m162670V(currentPurchaseSection, agreementState);
            }
        }
    }
}
