package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b\u001a\u0010\u0012J/\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/gtm;", "", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "buffering", "playerReady", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "a", "()Landroid/view/View;", "", "play", "setPlayWhenReady", "(Z)V", "pause", "()V", "Landroid/graphics/drawable/Drawable;", "artworkAsset", "e", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "", "b", "()F", "c", "ctx", "", "uriString", "isMediaAudio", "isMediaVideo", "f", "(Landroid/content/Context;Ljava/lang/String;ZZ)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface gtm {
    @NotNull
    /* JADX INFO: renamed from: a */
    View mo132245a();

    /* JADX INFO: renamed from: b */
    float mo132246b();

    /* JADX INFO: renamed from: c */
    void mo132247c();

    /* JADX INFO: renamed from: d */
    void mo132248d(@NotNull Context context, @NotNull Function0<Unit> buffering, @NotNull Function0<Unit> playerReady);

    /* JADX INFO: renamed from: e */
    void mo132249e(@NotNull Context context, @NotNull Function0<? extends Drawable> artworkAsset);

    /* JADX INFO: renamed from: f */
    void mo132250f(@NotNull Context ctx, @NotNull String uriString, boolean isMediaAudio, boolean isMediaVideo);

    void pause();

    void setPlayWhenReady(boolean play);
}
