package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/pqm;", p7f.GPS_DIRECTION_TRUE, "", "Lorg/json/JSONObject;", "inApp", "", "b", "(Lorg/json/JSONObject;)J", "", "id", "data", "a", "(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;", "message", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface pqm<T> {
    /* JADX INFO: renamed from: a */
    T mo6411a(@NotNull String id, @NotNull JSONObject data);

    /* JADX INFO: renamed from: b */
    long mo6412b(@NotNull JSONObject inApp);

    /* JADX INFO: renamed from: c */
    T mo6413c(@NotNull String id);

    /* JADX INFO: renamed from: d */
    T mo6414d(@NotNull String id, @NotNull String message);
}
