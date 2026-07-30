package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/eq60;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", Constants.INAPP_DATA_TAG, "()V", "b", "c", "Ll/fq60;", SocialConstants.TYPE_REQUEST, "Ll/gq60;", "a", "(Ll/fq60;)Ll/gq60;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "", "Ll/r4;", "Ljava/util/List;", "processors", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class eq60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC19757r4> processors;

    public eq60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        ArrayList arrayList = new ArrayList();
        this.processors = arrayList;
        arrayList.add(new sp60(act, purchaseType, str));
        arrayList.add(new rp60(act, purchaseType, str));
        arrayList.add(new pp60(act, purchaseType, str));
        arrayList.add(new op60(act, purchaseType, str));
        arrayList.add(new cq60(act, purchaseType, str));
        arrayList.add(new xp60(act, purchaseType, str));
        arrayList.add(new wp60(act, purchaseType, str));
        arrayList.add(new tp60(act, purchaseType, str));
        arrayList.add(new vp60(act, purchaseType, str));
        arrayList.add(new aq60(act, purchaseType, str));
        arrayList.add(new dq60(act, purchaseType, str));
        arrayList.add(new np60(act, purchaseType, str));
        arrayList.add(new up60(act, purchaseType, str));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final gq60 m121894a(@NotNull fq60 request) {
        request.getClass();
        gq60 gq60Var = new gq60(null, null, null, null, null, false, false, false, 255, null);
        for (AbstractC19757r4 abstractC19757r4 : this.processors) {
            if (abstractC19757r4.mo99415e(request)) {
                abstractC19757r4.mo99414b(request, gq60Var);
            }
        }
        return gq60Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m121895b() {
        this.processors.clear();
        this.processors.add(new bq60(this.act, this.purchaseType, this.from));
        this.processors.add(new rp60(this.act, this.purchaseType, this.from));
        this.processors.add(new op60(this.act, this.purchaseType, this.from));
        this.processors.add(new cq60(this.act, this.purchaseType, this.from));
        this.processors.add(new xp60(this.act, this.purchaseType, this.from));
        this.processors.add(new wp60(this.act, this.purchaseType, this.from));
        this.processors.add(new vp60(this.act, this.purchaseType, this.from));
        this.processors.add(new dq60(this.act, this.purchaseType, this.from));
        this.processors.add(new np60(this.act, this.purchaseType, this.from));
        this.processors.add(new up60(this.act, this.purchaseType, this.from));
    }

    /* JADX INFO: renamed from: c */
    public final void m121896c() {
        this.processors.clear();
        this.processors.add(new zp60(this.act, this.purchaseType, this.from));
        this.processors.add(new yp60(this.act, this.purchaseType, this.from));
    }

    /* JADX INFO: renamed from: d */
    public final void m121897d() {
        this.processors.clear();
        this.processors.add(new bq60(this.act, this.purchaseType, this.from));
        this.processors.add(new rp60(this.act, this.purchaseType, this.from));
        this.processors.add(new op60(this.act, this.purchaseType, this.from));
        this.processors.add(new cq60(this.act, this.purchaseType, this.from));
        this.processors.add(new xp60(this.act, this.purchaseType, this.from));
        this.processors.add(new wp60(this.act, this.purchaseType, this.from));
        this.processors.add(new vp60(this.act, this.purchaseType, this.from));
        this.processors.add(new qp60(this.act, this.purchaseType, this.from));
        this.processors.add(new dq60(this.act, this.purchaseType, this.from));
        this.processors.add(new up60(this.act, this.purchaseType, this.from));
    }
}
