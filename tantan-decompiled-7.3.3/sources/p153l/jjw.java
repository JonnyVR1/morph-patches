package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/jjw;", "", "Ll/ijw;", SocialConstants.TYPE_REQUEST, "<init>", "(Ll/ijw;)V", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "setResponse", "(Lorg/json/JSONObject;)V", "response", "", "b", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", NotificationCompat.CATEGORY_STATUS, "", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "message", Constants.INAPP_DATA_TAG, "Ll/ijw;", "getRequest", "()Ll/ijw;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class jjw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private JSONObject response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Integer status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final ijw request;

    public jjw(@Nullable ijw ijwVar) {
        this.request = ijwVar;
        this.response = new JSONObject();
        this.status = 0;
        this.message = "";
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getResponse() {
        return this.response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jjw() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ jjw(ijw ijwVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ijwVar);
    }
}
