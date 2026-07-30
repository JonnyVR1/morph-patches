package p149l;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/fuf0;", "", "Landroid/content/Intent;", "intent", "", "requestCode", "", "startActivityForResult", "(Landroid/content/Intent;I)V", "Landroid/app/Activity;", "a", "()Landroid/app/Activity;", "activityContext", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public interface fuf0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    Activity mo104686a();

    void startActivityForResult(@NotNull Intent intent, int requestCode);
}
