package com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item;

import android.graphics.RectF;
import android.widget.ScrollView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p007l.t0l0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\nJ9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "", "", "maxLength", "currentLength", "width", "height", "Landroid/widget/ScrollView;", "bindView", "Landroid/graphics/RectF;", "a", "(IIIILandroid/widget/ScrollView;)Landroid/graphics/RectF;", "", "b", "(Landroid/widget/ScrollView;)Z", "Companion", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InterfaceC2154a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f3692a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.a$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a$a;", "", "<init>", "()V", "", "orientation", "Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "a", "(I)Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f3692a = new Companion();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC2154a m6062a(int orientation) {
            return new t0l0();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    RectF mo6060a(int maxLength, int currentLength, int width, int height, @Nullable ScrollView bindView);

    /* JADX INFO: renamed from: b */
    boolean mo6061b(@Nullable ScrollView bindView);
}
