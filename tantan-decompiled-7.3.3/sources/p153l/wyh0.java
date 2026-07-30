package p153l;

import android.graphics.Canvas;
import com.hellogroup.p036mk.business.widget.MKTabLayout;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Ll/wyh0;", "", "<init>", "()V", "Lcom/hellogroup/mk/business/widget/MKTabLayout;", "layout", "", "a", "(Lcom/hellogroup/mk/business/widget/MKTabLayout;)V", "Lcom/hellogroup/mk/business/widget/MKTabLayout$b;", "Lcom/hellogroup/mk/business/widget/MKTabLayout$b;", "getSNoIndicator", "()Lcom/hellogroup/mk/business/widget/MKTabLayout$b;", "setSNoIndicator", "(Lcom/hellogroup/mk/business/widget/MKTabLayout$b;)V", "sNoIndicator", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class wyh0 {
    public static final wyh0 INSTANCE = new wyh0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static MKTabLayout.InterfaceC3588b sNoIndicator = C21211a.INSTANCE;

    private wyh0() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m208618a(@NotNull MKTabLayout layout) {
        layout.getClass();
        layout.setSelectedTabSlidingIndicator(sNoIndicator);
    }

    /* JADX INFO: renamed from: l.wyh0$a */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, m88121d2 = {"Landroid/graphics/Canvas;", "canvas", "", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "right", "bottom", "", "percent", "", "a", "(Landroid/graphics/Canvas;IIIIF)V"}, m88122k = 3, m88123mv = {1, 4, 0})
    public static final class C21211a implements MKTabLayout.InterfaceC3588b {
        public static final C21211a INSTANCE = new C21211a();

        @Override // com.hellogroup.p036mk.business.widget.MKTabLayout.InterfaceC3588b
        /* JADX INFO: renamed from: a */
        public final void mo18343a(@Nullable Canvas canvas, int i, int i2, int i3, int i4, float f) {
        }
    }
}
