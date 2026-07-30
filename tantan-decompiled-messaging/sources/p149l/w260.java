package p149l;

import android.R;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m87232d2 = {"Landroid/app/Activity;", "Landroid/widget/FrameLayout;", "b", "(Landroid/app/Activity;)Landroid/widget/FrameLayout;", "contentView", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class w260 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final FrameLayout m201020b(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        viewFindViewById.getClass();
        return (FrameLayout) viewFindViewById;
    }
}
