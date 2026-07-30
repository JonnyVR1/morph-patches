package p149l;

import android.view.View;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Landroid/view/View;", "", "contentDescription", "", "a", "(Landroid/view/View;Ljava/lang/String;)V", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class apm {
    /* JADX INFO: renamed from: a */
    public static final void m98143a(@NotNull View view, @NotNull String str) {
        view.getClass();
        str.getClass();
        if (StringsKt.m93438e0(str)) {
            return;
        }
        view.setContentDescription(str);
    }
}
