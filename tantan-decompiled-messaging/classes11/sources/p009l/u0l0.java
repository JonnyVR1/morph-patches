package p009l;

import android.graphics.RectF;
import android.widget.ScrollView;
import com.p000p1.mobile.putong.core.newui.myinterestpeople.InterfaceC0354a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ll/u0l0;", "Lcom/p1/mobile/putong/core/newui/myinterestpeople/a;", "<init>", "()V", "", "maxLength", "currentLength", "width", "height", "Landroid/widget/ScrollView;", "bindView", "Landroid/graphics/RectF;", "a", "(IIIILandroid/widget/ScrollView;)Landroid/graphics/RectF;", "", "F", "size", "b", "I", "firstSize", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0l0 implements InterfaceC0354a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int firstSize;

    @Override // com.p000p1.mobile.putong.core.newui.myinterestpeople.InterfaceC0354a
    @NotNull
    /* JADX INFO: renamed from: a */
    public RectF mo6815a(int maxLength, int currentLength, int width, int height, @Nullable ScrollView bindView) {
        float f;
        float height2;
        if (this.firstSize == 0 && currentLength != 0) {
            this.firstSize = currentLength;
        }
        if (maxLength == 0) {
            f = 0.0f;
        } else {
            float f2 = height;
            int i = this.firstSize;
            f = ((currentLength - i) / (maxLength - i)) * f2 * ((f2 - this.size) / f2);
        }
        try {
            bindView.getClass();
            height2 = bindView.getHeight();
        } catch (Exception unused) {
            height2 = 0.0f;
        }
        float f3 = maxLength == 0 ? 1.0f : height2 / maxLength;
        float f4 = f3 < 1.0f ? f3 : 1.0f;
        if (this.size == 0.0f && maxLength != 0) {
            this.size = f4 * height;
            this.firstSize = currentLength;
        }
        float fMax = Math.max(f, 0.0f);
        return new RectF(0.0f, fMax, width, this.size + fMax);
    }
}
