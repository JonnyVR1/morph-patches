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
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/cd0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "b", "()V", "Ll/bd0;", SocialConstants.TYPE_REQUEST, "", "a", "(Ll/bd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "", "Ll/tol;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "strategies", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cd0 {

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
    public final List<tol> strategies;

    public cd0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        ArrayList arrayList = new ArrayList();
        this.strategies = arrayList;
        arrayList.add(new fd0(act, purchaseType, str));
        arrayList.add(new jd0(act, purchaseType, str));
        arrayList.add(new id0(act, purchaseType, str));
        arrayList.add(new ld0(act, purchaseType, str));
        arrayList.add(new md0(act, purchaseType, str));
        arrayList.add(new kd0(act, purchaseType, str));
        arrayList.add(new ed0(act, purchaseType, str));
        arrayList.add(new nd0(act, purchaseType, str));
        arrayList.add(new dd0(act, purchaseType, str));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CharSequence m109081a(@NotNull bd0 request) {
        request.getClass();
        for (tol tolVar : this.strategies) {
            if (tolVar.mo115314b(request)) {
                return tolVar.mo115313a(request);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public final void m109082b() {
        this.strategies.clear();
        this.strategies.add(new hd0(this.act, this.purchaseType, this.from));
        this.strategies.add(new gd0(this.act, this.purchaseType, this.from));
    }
}
