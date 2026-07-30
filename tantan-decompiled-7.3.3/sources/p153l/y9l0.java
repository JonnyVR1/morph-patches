package p153l;

import android.graphics.RectF;
import android.widget.ScrollView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.InterfaceC11473a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/y9l0;", "Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "<init>", "()V", "", "maxLength", "currentLength", "width", "height", "Landroid/widget/ScrollView;", "bindView", "Landroid/graphics/RectF;", "a", "(IIIILandroid/widget/ScrollView;)Landroid/graphics/RectF;", "", "b", "(Landroid/widget/ScrollView;)Z", "", "F", "size", "I", "firstSize", "b_feed_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class y9l0 implements InterfaceC11473a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int firstSize;

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.InterfaceC11473a
    @NotNull
    /* JADX INFO: renamed from: a */
    public RectF mo66143a(int maxLength, int currentLength, int width, int height, @Nullable ScrollView bindView) {
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

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.InterfaceC11473a
    /* JADX INFO: renamed from: b */
    public boolean mo66144b(@Nullable ScrollView bindView) {
        boolean z = false;
        boolean z2 = bindView != null && bindView.canScrollVertically(1);
        if (bindView != null && bindView.canScrollVertically(-1)) {
            z = true;
        }
        return z | z2;
    }
}
