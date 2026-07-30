package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/kzc0;", "", "Ll/fc60;", "wrapper", "", "a", "(Ll/fc60;)V", Constants.INAPP_DATA_TAG, "()V", "", "isPlaying", "isMuted", "", "positionMs", "e", "(ZZJ)V", "c", "(Z)V", "b", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface kzc0 {
    /* JADX INFO: renamed from: a */
    void mo6673a(@NotNull fc60 wrapper);

    /* JADX INFO: renamed from: b */
    void mo6674b(boolean isMuted);

    /* JADX INFO: renamed from: c */
    void mo6675c(boolean isPlaying);

    /* JADX INFO: renamed from: d */
    void mo6676d();

    /* JADX INFO: renamed from: e */
    void mo6677e(boolean isPlaying, boolean isMuted, long positionMs);
}
