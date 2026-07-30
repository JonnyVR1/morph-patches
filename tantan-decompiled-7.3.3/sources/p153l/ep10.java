package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/ep10;", "", "", "role", "orderId", "seiLayout", "", "tabType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", Constants.INAPP_DATA_TAG, "I", "()I", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class ep10 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String role;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String seiLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int tabType;

    public ep10(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.role = str;
        this.orderId = str2;
        this.seiLayout = str3;
        this.tabType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSeiLayout() {
        return this.seiLayout;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTabType() {
        return this.tabType;
    }
}
