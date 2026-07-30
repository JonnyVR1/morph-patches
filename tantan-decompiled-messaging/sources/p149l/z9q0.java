package p149l;

import androidx.annotation.RestrictTo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m87232d2 = {"Ll/z9q0;", "", "Ll/y9q0;", "progress", "", "a", "(Ll/y9q0;)V", "", "workSpecId", RequestParameters.SUBRESOURCE_DELETE, "(Ljava/lang/String;)V", "b", "()V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface z9q0 {
    /* JADX INFO: renamed from: a */
    void mo95567a(@NotNull y9q0 progress);

    /* JADX INFO: renamed from: b */
    void mo95568b();

    void delete(@NotNull String workSpecId);
}
