package p153l;

import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/ijw;", "", "Lorg/json/JSONObject;", SocialConstants.TYPE_REQUEST, "<init>", "(Lorg/json/JSONObject;)V", "a", "Lorg/json/JSONObject;", "getRequest", "()Lorg/json/JSONObject;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ijw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final JSONObject request;

    public /* synthetic */ ijw(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }

    public ijw(@Nullable JSONObject jSONObject) {
        this.request = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ijw() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
