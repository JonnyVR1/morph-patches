package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ#\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/gtl;", "", "", "id", Constants.KEY_KEY, "", "value", "", "g", "(Ljava/lang/String;Ljava/lang/String;F)V", "updateMakeupStyleValue", "makeupKey", "filterKey", "removeMakeupStyle", "(Ljava/lang/String;Ljava/lang/String;)V", "path", "k", "(Ljava/lang/String;)V", "intensity", "h", "(F)V", "", "type", "r", "(I)V", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface gtl {
    /* JADX INFO: renamed from: g */
    void mo132241g(@Nullable String id, @Nullable String key, float value);

    /* JADX INFO: renamed from: h */
    void mo132242h(float intensity);

    /* JADX INFO: renamed from: k */
    void mo132243k(@Nullable String path);

    /* JADX INFO: renamed from: r */
    void mo132244r(int type);

    void removeMakeupStyle(@Nullable String makeupKey, @Nullable String filterKey);

    void updateMakeupStyleValue(@Nullable String id, @Nullable String key, float value);
}
