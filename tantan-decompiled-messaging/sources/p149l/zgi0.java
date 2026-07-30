package p149l;

import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgumentType;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/zgi0;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "type", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;Ljava/lang/Object;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "c", "()Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class zgi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TemplateArgumentType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Object defaultValue;

    public zgi0(@NotNull String str, @NotNull TemplateArgumentType templateArgumentType, @Nullable Object obj) {
        str.getClass();
        templateArgumentType.getClass();
        this.name = str;
        this.type = templateArgumentType;
        this.defaultValue = obj;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TemplateArgumentType getType() {
        return this.type;
    }
}
