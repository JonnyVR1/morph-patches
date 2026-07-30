package com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item;

import android.graphics.RectF;
import android.widget.ScrollView;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.y9l0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.a */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\nJ9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "", "", "maxLength", "currentLength", "width", "height", "Landroid/widget/ScrollView;", "bindView", "Landroid/graphics/RectF;", "a", "(IIIILandroid/widget/ScrollView;)Landroid/graphics/RectF;", "", "b", "(Landroid/widget/ScrollView;)Z", "Companion", "b_feed_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface InterfaceC11473a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f43079a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a$a;", "", "<init>", "()V", "", Constants.KEY_ORIENTATION, "Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "a", "(I)Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "b_feed_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f43079a = new Companion();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC11473a m66145a(int orientation) {
            return new y9l0();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    RectF mo66143a(int maxLength, int currentLength, int width, int height, @Nullable ScrollView bindView);

    /* JADX INFO: renamed from: b */
    boolean mo66144b(@Nullable ScrollView bindView);
}
