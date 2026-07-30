package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.ValidationError;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/es4;", "", "Ll/as4;", "<init>", "()V", "input", "Ll/crk0;", Constants.KEY_CONFIG, "Ll/drk0;", "a", "(Ll/as4;Ll/crk0;)Ll/drk0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class es4 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public drk0 m117905a(@NotNull as4 input, @NotNull crk0 config) {
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        Integer maxChargedEventItemsCount = config.getMaxChargedEventItemsCount();
        if (maxChargedEventItemsCount != null) {
            if (input.getItemsCount() > maxChargedEventItemsCount.intValue()) {
                arrayList.add(nrk0.m160744a(ValidationError.CHARGED_EVENT_TOO_MANY_ITEMS, new String[0]));
            }
        }
        return arrayList.isEmpty() ? new drk0.C16457b(null, 1, null) : new drk0.C16458c(arrayList);
    }
}
