package p153l;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/lr0;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "onAnimationStart", "(Landroid/graphics/drawable/Drawable;)V", "b", "onAnimationRepeat", "", "frameNumber", "a", "(Landroid/graphics/drawable/Drawable;I)V", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface lr0 {
    /* JADX INFO: renamed from: a */
    void mo77568a(@NotNull Drawable drawable, int frameNumber);

    /* JADX INFO: renamed from: b */
    void mo155514b(@NotNull Drawable drawable);

    void onAnimationRepeat(@NotNull Drawable drawable);

    void onAnimationStart(@NotNull Drawable drawable);
}
