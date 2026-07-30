package p153l;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.events.EventGroup;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H&¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H&¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/bj2;", "", "Landroid/content/Context;", "context", "Ll/h1c;", "c", "(Landroid/content/Context;)Ll/h1c;", "", "b", "(Landroid/content/Context;)V", "", "batchSize", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "Ll/gxb0;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;ILcom/clevertap/android/sdk/events/EventGroup;)Ll/gxb0;", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "type", "a", "(Landroid/content/Context;Lorg/json/JSONObject;I)V", "f", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "", "", "eventIds", "profileEventIds", "", "e", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Z", "ids", "g", "(Landroid/content/Context;Ljava/util/List;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface bj2 {
    /* JADX INFO: renamed from: a */
    void mo104581a(@NotNull Context context, @NotNull JSONObject event, int type);

    /* JADX INFO: renamed from: b */
    void mo104582b(@NotNull Context context);

    @NotNull
    /* JADX INFO: renamed from: c */
    h1c mo104583c(@NotNull Context context);

    @NotNull
    /* JADX INFO: renamed from: d */
    gxb0 mo104584d(@NotNull Context context, int batchSize, @NotNull EventGroup eventGroup);

    /* JADX INFO: renamed from: e */
    boolean mo104585e(@NotNull Context context, @NotNull List<String> eventIds, @NotNull List<String> profileEventIds);

    /* JADX INFO: renamed from: f */
    void mo104586f(@NotNull Context context, @NotNull JSONObject event);

    /* JADX INFO: renamed from: g */
    boolean mo104587g(@NotNull Context context, @NotNull List<String> ids);
}
