package p153l;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m88121d2 = {"Ll/mul;", "", "Landroid/view/View;", "dragView", "", "b", "(Landroid/view/View;)V", "c", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", BaseSei.f14624X, BaseSei.f14625Y, "a", "(Landroid/view/View;Landroid/view/MotionEvent;FF)V", Constants.INAPP_DATA_TAG, "(Landroid/view/MotionEvent;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface mul {
    /* JADX INFO: renamed from: a */
    void mo109369a(@Nullable View dragView, @NotNull MotionEvent event, float x, float y);

    /* JADX INFO: renamed from: b */
    void mo109370b(@Nullable View dragView);

    /* JADX INFO: renamed from: c */
    void mo109371c(@Nullable View dragView);

    /* JADX INFO: renamed from: d */
    void mo109372d(@NotNull MotionEvent event);
}
