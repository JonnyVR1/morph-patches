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
import com.clevertap.android.sdk.inbox.C1285d;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.erm;
import p149l.j6f;
import p149l.q3c0;
import p149l.sgx;
import p149l.t5l0;
import p149l.t8f;
import p149l.ywc0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0011J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/clevertap/android/sdk/inbox/d;", "M", "()Lcom/clevertap/android/sdk/inbox/d;", "", "N", "()V", "L", "R", "Landroid/graphics/drawable/Drawable;", "K", "()Landroid/graphics/drawable/Drawable;", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, BloodType.f38728O, "P", "Q", "U", "Ll/erm;", "a", "Ll/erm;", "handle", "Landroid/graphics/Rect;", "b", "Landroid/graphics/Rect;", "rect", "Landroidx/recyclerview/widget/RecyclerView$t;", "c", "Landroidx/recyclerview/widget/RecyclerView$t;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$q;", Constants.INAPP_DATA_TAG, "Landroidx/recyclerview/widget/RecyclerView$q;", "onChildAttachStateChangeListener", "e", "Lcom/clevertap/android/sdk/inbox/d;", "playingHolder", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@UnstableApi
public final class MediaPlayerRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final erm handle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Rect rect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView.AbstractC0582t onScrollListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView.InterfaceC0579q onChildAttachStateChangeListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private C1285d playingHolder;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1178a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4886a;

        static {
            int[] iArr = new int[VideoLibraryIntegrated.values().length];
            try {
                iArr[VideoLibraryIntegrated.MEDIA3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4886a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$b", "Landroidx/recyclerview/widget/RecyclerView$q;", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1179b implements RecyclerView.InterfaceC0579q {
        public C1179b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: b */
        public void mo3413b(View view) {
            view.getClass();
            C1285d c1285d = MediaPlayerRecyclerView.this.playingHolder;
            if (c1285d != null) {
                MediaPlayerRecyclerView mediaPlayerRecyclerView = MediaPlayerRecyclerView.this;
                if (Intrinsics.m87488d(c1285d.itemView, view)) {
                    mediaPlayerRecyclerView.m5998U();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
        /* JADX INFO: renamed from: d */
        public void mo3414d(View view) {
            view.getClass();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$c */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1180c extends RecyclerView.AbstractC0582t {
        public C1180c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                MediaPlayerRecyclerView.this.m5997Q();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.handle = C1178a.f4886a[t5l0.mediaLibType.ordinal()] == 1 ? new sgx() : new t8f();
        this.rect = new Rect();
        this.onScrollListener = new C1180c();
        this.onChildAttachStateChangeListener = new C1179b();
        m5991N();
    }

    /* JADX INFO: renamed from: E */
    public static Float m5982E(MediaPlayerRecyclerView mediaPlayerRecyclerView) {
        mediaPlayerRecyclerView.getClass();
        mediaPlayerRecyclerView.handle.mo117850c();
        return Float.valueOf(mediaPlayerRecyclerView.handle.mo117849b());
    }

    /* JADX INFO: renamed from: F */
    public static Void m5983F(MediaPlayerRecyclerView mediaPlayerRecyclerView, String str, boolean z, boolean z2) {
        mediaPlayerRecyclerView.getClass();
        str.getClass();
        erm ermVar = mediaPlayerRecyclerView.handle;
        Context context = mediaPlayerRecyclerView.getContext();
        context.getClass();
        ermVar.mo117853f(context, str, z, z2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final Drawable m5988K() {
        Drawable drawableM216334e = ywc0.m216334e(getResources(), q3c0.f152400a, null);
        drawableM216334e.getClass();
        return drawableM216334e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m5989L() {
        C1285d c1285d = this.playingHolder;
        if (c1285d != null) {
            c1285d.m6750n();
        }
    }

    /* JADX INFO: renamed from: M */
    private final C1285d m5990M() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) getLayoutManager();
        int iFindLastVisibleItemPosition = linearLayoutManager2 != null ? linearLayoutManager2.findLastVisibleItemPosition() : 0;
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return null;
        }
        int i = iFindFirstVisibleItemPosition;
        int i2 = 0;
        C1285d c1285d = null;
        while (true) {
            View childAt = getChildAt(i - iFindFirstVisibleItemPosition);
            if (childAt != null) {
                Object tag = childAt.getTag();
                C1285d c1285d2 = tag instanceof C1285d ? (C1285d) tag : null;
                if (c1285d2 != null && c1285d2.m6749m()) {
                    int iHeight = c1285d2.itemView.getGlobalVisibleRect(this.rect) ? this.rect.height() : 0;
                    if (iHeight > i2) {
                        c1285d = c1285d2;
                        i2 = iHeight;
                    }
                }
            }
            if (i == iFindLastVisibleItemPosition) {
                return c1285d;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m5991N() {
        erm ermVar = this.handle;
        Context context = getContext();
        context.getClass();
        ermVar.mo117851d(context, new MediaPlayerRecyclerView$initialize$1(this), new MediaPlayerRecyclerView$initialize$2(this));
        erm ermVar2 = this.handle;
        Context context2 = getContext();
        context2.getClass();
        ermVar2.mo117852e(context2, new MediaPlayerRecyclerView$initialize$3(this));
        m5993S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m5992R() {
        C1285d c1285d = this.playingHolder;
        if (c1285d != null) {
            c1285d.m6751o();
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m5993S() {
        removeOnScrollListener(this.onScrollListener);
        removeOnChildAttachStateChangeListener(this.onChildAttachStateChangeListener);
        addOnScrollListener(this.onScrollListener);
        addOnChildAttachStateChangeListener(this.onChildAttachStateChangeListener);
    }

    /* JADX INFO: renamed from: T */
    private final void m5994T() {
        this.handle.pause();
        C1285d c1285d = this.playingHolder;
        if (c1285d != null) {
            c1285d.m6752p();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m5995O() {
        this.handle.setPlayWhenReady(false);
    }

    /* JADX INFO: renamed from: P */
    public final void m5996P() {
        m5991N();
        m5997Q();
    }

    /* JADX INFO: renamed from: Q */
    public final void m5997Q() {
        C1285d c1285dM5990M = m5990M();
        if (c1285dM5990M == null) {
            m5994T();
            return;
        }
        C1285d c1285d = this.playingHolder;
        if (c1285d == null || !Intrinsics.m87488d(c1285d.itemView, c1285dM5990M.itemView)) {
            m5994T();
            m5991N();
            if (c1285dM5990M.m6742d(this.handle.mo117849b(), new Function0() { // from class: l.esx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaPlayerRecyclerView.m5982E(this.f93063a);
                }
            }, new Function3() { // from class: l.fsx
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MediaPlayerRecyclerView.m5983F(this.f99120a, (String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
                }
            }, this.handle.mo117848a())) {
                this.playingHolder = c1285dM5990M;
                return;
            }
            return;
        }
        if (((c1285d.itemView.getGlobalVisibleRect(this.rect) ? this.rect.height() : 0) >= 400) && c1285d.m6754s()) {
            this.handle.setPlayWhenReady(true);
        } else {
            this.handle.setPlayWhenReady(false);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m5998U() {
        this.handle.pause();
        this.playingHolder = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context) {
        erm t8fVar;
        super(context);
        context.getClass();
        if (C1178a.f4886a[t5l0.mediaLibType.ordinal()] == 1) {
            t8fVar = new sgx();
        } else {
            t8fVar = new t8f();
        }
        this.handle = t8fVar;
        this.rect = new Rect();
        this.onScrollListener = new C1180c();
        this.onChildAttachStateChangeListener = new C1179b();
        m5991N();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        erm t8fVar;
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        if (C1178a.f4886a[t5l0.mediaLibType.ordinal()] == 1) {
            t8fVar = new sgx();
        } else {
            t8fVar = new t8f();
        }
        this.handle = t8fVar;
        this.rect = new Rect();
        this.onScrollListener = new C1180c();
        this.onChildAttachStateChangeListener = new C1179b();
        m5991N();
    }
}
