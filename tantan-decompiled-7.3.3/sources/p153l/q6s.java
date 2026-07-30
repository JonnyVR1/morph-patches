package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, m88121d2 = {"Ll/q6s;", "", "", "show", "", "iconUrl", "content", "circleIcon", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "a", "Z", Constants.INAPP_DATA_TAG, "()Z", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class q6s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean show;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String iconUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean circleIcon;

    public q6s(boolean z, @NotNull String str, @NotNull String str2, boolean z2) {
        str.getClass();
        str2.getClass();
        this.show = z;
        this.iconUrl = str;
        this.content = str2;
        this.circleIcon = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCircleIcon() {
        return this.circleIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    public /* synthetic */ q6s(boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, str, str2, (i & 8) != 0 ? false : z2);
    }
}
