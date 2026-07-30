package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"", Constants.KEY_KEY, "", "a", "(Ljava/lang/String;)Ljava/lang/Void;", "savedstate_release"}, m88122k = 5, m88123mv = {2, 0, 0}, m88125xi = 48, m88126xs = "androidx/savedstate/SavedStateReaderKt")
public final /* synthetic */ class myd0 {
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Void m160790a(@NotNull String str) {
        str.getClass();
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
