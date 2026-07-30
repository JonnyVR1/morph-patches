package p153l;

import androidx.annotation.RestrictTo;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m88121d2 = {"Ll/tej0;", "", "", "isEnabled", "()Z", "", Constants.ScionAnalytics.PARAM_LABEL, "", "a", "(Ljava/lang/String;)V", "b", "()V", "methodName", "", "cookie", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "(Ljava/lang/String;I)V", "c", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface tej0 {
    /* JADX INFO: renamed from: a */
    void mo190709a(@NotNull String label);

    /* JADX INFO: renamed from: b */
    void mo190710b();

    /* JADX INFO: renamed from: c */
    void mo190711c(@NotNull String methodName, int cookie);

    /* JADX INFO: renamed from: d */
    void mo190712d(@NotNull String methodName, int cookie);

    boolean isEnabled();
}
