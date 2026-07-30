package com.p051p1.mobile.putong.core.newui.myinterestpeople;

import android.graphics.RectF;
import android.widget.ScrollView;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.z9l0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\nJ9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/myinterestpeople/a;", "", "", "maxLength", "currentLength", "width", "height", "Landroid/widget/ScrollView;", "bindView", "Landroid/graphics/RectF;", "a", "(IIIILandroid/widget/ScrollView;)Landroid/graphics/RectF;", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface InterfaceC8341a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f26824a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/myinterestpeople/a$a;", "", "<init>", "()V", "", Constants.KEY_ORIENTATION, "Lcom/p1/mobile/putong/core/newui/myinterestpeople/a;", "a", "(I)Lcom/p1/mobile/putong/core/newui/myinterestpeople/a;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f26824a = new Companion();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC8341a m43664a(int orientation) {
            return new z9l0();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    RectF mo43663a(int maxLength, int currentLength, int width, int height, @Nullable ScrollView bindView);
}
