package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.UnstableApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.C1308d;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c5d0;
import p153l.gtm;
import p153l.p7f;
import p153l.qpx;
import p153l.wbc0;
import p153l.xel0;
import p153l.z9f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0011J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/clevertap/android/sdk/inbox/d;", "M", "()Lcom/clevertap/android/sdk/inbox/d;", "", "N", "()V", "L", "R", "Landroid/graphics/drawable/Drawable;", "K", "()Landroid/graphics/drawable/Drawable;", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, BloodType.f39576O, "P", "Q", "U", "Ll/gtm;", "a", "Ll/gtm;", "handle", "Landroid/graphics/Rect;", "b", "Landroid/graphics/Rect;", "rect", "Landroidx/recyclerview/widget/RecyclerView$t;", "c", "Landroidx/recyclerview/widget/RecyclerView$t;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$q;", Constants.INAPP_DATA_TAG, "Landroidx/recyclerview/widget/RecyclerView$q;", "onChildAttachStateChangeListener", "e", "Lcom/clevertap/android/sdk/inbox/d;", "playingHolder", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@UnstableApi
public final class MediaPlayerRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final gtm handle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Rect rect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView.AbstractC0584t onScrollListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView.InterfaceC0581q onChildAttachStateChangeListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private C1308d playingHolder;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1201a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4923a;

        static {
            int[] iArr = new int[VideoLibraryIntegrated.values().length];
            try {
                iArr[VideoLibraryIntegrated.MEDIA3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4923a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"com/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$b", "Landroidx/recyclerview/widget/RecyclerView$q;", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "b", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1202b implements RecyclerView.InterfaceC0581q {
        public C1202b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: b */
        public void mo3422b(View view) {
            view.getClass();
            C1308d c1308d = MediaPlayerRecyclerView.this.playingHolder;
            if (c1308d != null) {
                MediaPlayerRecyclerView mediaPlayerRecyclerView = MediaPlayerRecyclerView.this;
                if (Intrinsics.m88377d(c1308d.itemView, view)) {
                    mediaPlayerRecyclerView.m6052U();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581q
        /* JADX INFO: renamed from: d */
        public void mo3423d(View view) {
            view.getClass();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$c */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1203c extends RecyclerView.AbstractC0584t {
        public C1203c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                MediaPlayerRecyclerView.this.m6051Q();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.handle = C1201a.f4923a[xel0.mediaLibType.ordinal()] == 1 ? new qpx() : new z9f();
        this.rect = new Rect();
        this.onScrollListener = new C1203c();
        this.onChildAttachStateChangeListener = new C1202b();
        m6045N();
    }

    /* JADX INFO: renamed from: E */
    public static Float m6036E(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        mediaPlayerRecyclerView.getClass();
        mediaPlayerRecyclerView.handle.mo132247c();
        return Float.valueOf(mediaPlayerRecyclerView.handle.mo132246b());
    }

    /* JADX INFO: renamed from: F */
    public static Void m6037F(MediaPlayerRecyclerView mediaPlayerRecyclerView, String str, boolean z, boolean z2) {
        mediaPlayerRecyclerView.getClass();
        str.getClass();
        gtm gtmVar = mediaPlayerRecyclerView.handle;
        Context context = mediaPlayerRecyclerView.getContext();
        context.getClass();
        gtmVar.mo132250f(context, str, z, z2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final Drawable m6042K() {
        Drawable drawableM108035e = c5d0.m108035e(getResources(), wbc0.f188228a, null);
        drawableM108035e.getClass();
        return drawableM108035e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m6043L() {
        C1308d c1308d = this.playingHolder;
        if (c1308d != null) {
            c1308d.m6804n();
        }
    }

    /* JADX INFO: renamed from: M */
    private final C1308d m6044M() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) getLayoutManager();
        int iFindLastVisibleItemPosition = linearLayoutManager2 != null ? linearLayoutManager2.findLastVisibleItemPosition() : 0;
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return null;
        }
        int i = iFindFirstVisibleItemPosition;
        int i2 = 0;
        C1308d c1308d = null;
        while (true) {
            View childAt = getChildAt(i - iFindFirstVisibleItemPosition);
            if (childAt != null) {
                Object tag = childAt.getTag();
                C1308d c1308d2 = tag instanceof C1308d ? (C1308d) tag : null;
                if (c1308d2 != null && c1308d2.m6803m()) {
                    int iHeight = c1308d2.itemView.getGlobalVisibleRect(this.rect) ? this.rect.height() : 0;
                    if (iHeight > i2) {
                        c1308d = c1308d2;
                        i2 = iHeight;
                    }
                }
            }
            if (i == iFindLastVisibleItemPosition) {
                return c1308d;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m6045N() {
        gtm gtmVar = this.handle;
        Context context = getContext();
        context.getClass();
        gtmVar.mo132248d(context, new MediaPlayerRecyclerView$initialize$1(this), new MediaPlayerRecyclerView$initialize$2(this));
        gtm gtmVar2 = this.handle;
        Context context2 = getContext();
        context2.getClass();
        gtmVar2.mo132249e(context2, new MediaPlayerRecyclerView$initialize$3(this));
        m6047S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m6046R() {
        C1308d c1308d = this.playingHolder;
        if (c1308d != null) {
            c1308d.m6805o();
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m6047S() {
        removeOnScrollListener(this.onScrollListener);
        removeOnChildAttachStateChangeListener(this.onChildAttachStateChangeListener);
        addOnScrollListener(this.onScrollListener);
        addOnChildAttachStateChangeListener(this.onChildAttachStateChangeListener);
    }

    /* JADX INFO: renamed from: T */
    private final void m6048T() {
        this.handle.pause();
        C1308d c1308d = this.playingHolder;
        if (c1308d != null) {
            c1308d.m6806p();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m6049O() {
        this.handle.setPlayWhenReady(false);
    }

    /* JADX INFO: renamed from: P */
    public final void m6050P() {
        m6045N();
        m6051Q();
    }

    /* JADX INFO: renamed from: Q */
    public final void m6051Q() {
        C1308d c1308dM6044M = m6044M();
        if (c1308dM6044M == null) {
            m6048T();
            return;
        }
        C1308d c1308d = this.playingHolder;
        if (c1308d == null || !Intrinsics.m88377d(c1308d.itemView, c1308dM6044M.itemView)) {
            m6048T();
            m6045N();
            if (c1308dM6044M.m6796d(this.handle.mo132246b(), new Function0() { // from class: l.b1y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaPlayerRecyclerView.m6036E(this.f74405a);
                }
            }, new Function3() { // from class: l.c1y
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MediaPlayerRecyclerView.m6037F(this.f79443a, (String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
                }
            }, this.handle.mo132245a())) {
                this.playingHolder = c1308dM6044M;
                return;
            }
            return;
        }
        if (((c1308d.itemView.getGlobalVisibleRect(this.rect) ? this.rect.height() : 0) >= 400) && c1308d.m6808s()) {
            this.handle.setPlayWhenReady(true);
        } else {
            this.handle.setPlayWhenReady(false);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m6052U() {
        this.handle.pause();
        this.playingHolder = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context) {
        gtm z9fVar;
        super(context);
        context.getClass();
        if (C1201a.f4923a[xel0.mediaLibType.ordinal()] == 1) {
            z9fVar = new qpx();
        } else {
            z9fVar = new z9f();
        }
        this.handle = z9fVar;
        this.rect = new Rect();
        this.onScrollListener = new C1203c();
        this.onChildAttachStateChangeListener = new C1202b();
        m6045N();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        gtm z9fVar;
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        if (C1201a.f4923a[xel0.mediaLibType.ordinal()] == 1) {
            z9fVar = new qpx();
        } else {
            z9fVar = new z9f();
        }
        this.handle = z9fVar;
        this.rect = new Rect();
        this.onScrollListener = new C1203c();
        this.onChildAttachStateChangeListener = new C1202b();
        m6045N();
    }
}
