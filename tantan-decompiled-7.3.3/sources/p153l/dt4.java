package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.ValidationError;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/dt4;", "", "Ll/zs4;", "<init>", "()V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "Ll/j0l0;", "a", "(Ll/zs4;Ll/i0l0;)Ll/j0l0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class dt4 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public j0l0 m117798a(@NotNull zs4 input, @NotNull i0l0 config) {
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        Integer maxChargedEventItemsCount = config.getMaxChargedEventItemsCount();
        if (maxChargedEventItemsCount != null) {
            if (input.getItemsCount() > maxChargedEventItemsCount.intValue()) {
                arrayList.add(t0l0.m188803a(ValidationError.CHARGED_EVENT_TOO_MANY_ITEMS, new String[0]));
            }
        }
        return arrayList.isEmpty() ? new j0l0.C17840b(null, 1, null) : new j0l0.C17841c(arrayList);
    }
}
