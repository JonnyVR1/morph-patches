package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/zh60;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", Constants.INAPP_DATA_TAG, "()V", "b", "c", "Ll/ai60;", SocialConstants.TYPE_REQUEST, "Ll/bi60;", "a", "(Ll/ai60;)Ll/bi60;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "", "Ll/t4;", "Ljava/util/List;", "processors", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zh60 {

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
    public final List<AbstractC20103t4> processors;

    public zh60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        ArrayList arrayList = new ArrayList();
        this.processors = arrayList;
        arrayList.add(new nh60(act, purchaseType, str));
        arrayList.add(new mh60(act, purchaseType, str));
        arrayList.add(new kh60(act, purchaseType, str));
        arrayList.add(new jh60(act, purchaseType, str));
        arrayList.add(new xh60(act, purchaseType, str));
        arrayList.add(new sh60(act, purchaseType, str));
        arrayList.add(new rh60(act, purchaseType, str));
        arrayList.add(new oh60(act, purchaseType, str));
        arrayList.add(new qh60(act, purchaseType, str));
        arrayList.add(new vh60(act, purchaseType, str));
        arrayList.add(new yh60(act, purchaseType, str));
        arrayList.add(new ih60(act, purchaseType, str));
        arrayList.add(new ph60(act, purchaseType, str));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final bi60 m218769a(@NotNull ai60 request) {
        request.getClass();
        bi60 bi60Var = new bi60(null, null, null, null, null, false, false, false, 255, null);
        for (AbstractC20103t4 abstractC20103t4 : this.processors) {
            if (abstractC20103t4.mo136187e(request)) {
                abstractC20103t4.mo136186b(request, bi60Var);
            }
        }
        return bi60Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m218770b() {
        this.processors.clear();
        this.processors.add(new wh60(this.act, this.purchaseType, this.from));
        this.processors.add(new mh60(this.act, this.purchaseType, this.from));
        this.processors.add(new jh60(this.act, this.purchaseType, this.from));
        this.processors.add(new xh60(this.act, this.purchaseType, this.from));
        this.processors.add(new sh60(this.act, this.purchaseType, this.from));
        this.processors.add(new rh60(this.act, this.purchaseType, this.from));
        this.processors.add(new qh60(this.act, this.purchaseType, this.from));
        this.processors.add(new yh60(this.act, this.purchaseType, this.from));
        this.processors.add(new ih60(this.act, this.purchaseType, this.from));
        this.processors.add(new ph60(this.act, this.purchaseType, this.from));
    }

    /* JADX INFO: renamed from: c */
    public final void m218771c() {
        this.processors.clear();
        this.processors.add(new uh60(this.act, this.purchaseType, this.from));
        this.processors.add(new th60(this.act, this.purchaseType, this.from));
    }

    /* JADX INFO: renamed from: d */
    public final void m218772d() {
        this.processors.clear();
        this.processors.add(new wh60(this.act, this.purchaseType, this.from));
        this.processors.add(new mh60(this.act, this.purchaseType, this.from));
        this.processors.add(new jh60(this.act, this.purchaseType, this.from));
        this.processors.add(new xh60(this.act, this.purchaseType, this.from));
        this.processors.add(new sh60(this.act, this.purchaseType, this.from));
        this.processors.add(new rh60(this.act, this.purchaseType, this.from));
        this.processors.add(new qh60(this.act, this.purchaseType, this.from));
        this.processors.add(new lh60(this.act, this.purchaseType, this.from));
        this.processors.add(new yh60(this.act, this.purchaseType, this.from));
        this.processors.add(new ph60(this.act, this.purchaseType, this.from));
    }
}
