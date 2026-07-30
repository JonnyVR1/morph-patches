package p153l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m88121d2 = {"Ll/f23;", "", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", "", Constants.INAPP_DATA_TAG, "(ILandroid/graphics/Bitmap;)Z", "Landroid/graphics/Rect;", "bounds", "", "c", "(Landroid/graphics/Rect;)V", "a", "()I", "intrinsicWidth", "b", "intrinsicHeight", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface f23 {
    /* JADX INFO: renamed from: a */
    int mo123593a();

    /* JADX INFO: renamed from: b */
    int mo123594b();

    /* JADX INFO: renamed from: c */
    void mo123595c(@Nullable Rect bounds);

    /* JADX INFO: renamed from: d */
    boolean mo123596d(int frameNumber, @NotNull Bitmap targetBitmap);
}
