package com.hellogroup.common.p035ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.LruCache;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.lv0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR'\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Lcom/hellogroup/common/ui/ResCache;", "", "<init>", "()V", "Landroid/util/DisplayMetrics;", "a", "Landroid/util/DisplayMetrics;", "_displayMetrics$annotations", "_displayMetrics", "Landroid/util/LruCache;", "", "b", "Lkotlin/Lazy;", "getColorRes$HelloFoundation_release", "()Landroid/util/LruCache;", "colorRes$annotations", "colorRes", "c", "getDimenRes$HelloFoundation_release", "dimenRes", "()Landroid/util/DisplayMetrics;", "displayMetrics", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ResCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static volatile DisplayMetrics _displayMetrics;
    public static final ResCache INSTANCE = new ResCache();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy colorRes = LazyKt__LazyJVMKt.m88118b(new Function0<LruCache<Integer, Integer>>() { // from class: com.hellogroup.common.ui.ResCache$colorRes$2

        /* JADX INFO: renamed from: com.hellogroup.common.ui.ResCache$colorRes$2$a */
        @Metadata(m88120d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/hellogroup/common/ui/ResCache$colorRes$2$a", "Landroid/util/LruCache;", Constants.KEY_KEY, PushService.COMMAND_CREATE, "(Ljava/lang/Object;)Ljava/lang/Object;", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
        public static final class C3487a extends LruCache<Integer, Integer> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f11899a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3487a(int i, int i2) {
                super(i2);
                this.f11899a = i;
            }

            @Override // android.util.LruCache
            @Nullable
            public Integer create(@Nullable Integer key) {
                if (key == null) {
                    return null;
                }
                int iIntValue = key.intValue();
                Context contextM155971a = lv0.m155971a();
                contextM155971a.getClass();
                return Integer.valueOf(contextM155971a.getResources().getColor(iIntValue));
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LruCache<Integer, Integer> invoke() {
            ResCache resCache = ResCache.INSTANCE;
            return new C3487a(100, 100);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dimenRes = LazyKt__LazyJVMKt.m88118b(new Function0<LruCache<Integer, Integer>>() { // from class: com.hellogroup.common.ui.ResCache$dimenRes$2

        /* JADX INFO: renamed from: com.hellogroup.common.ui.ResCache$dimenRes$2$a */
        @Metadata(m88120d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/hellogroup/common/ui/ResCache$dimenRes$2$a", "Landroid/util/LruCache;", Constants.KEY_KEY, PushService.COMMAND_CREATE, "(Ljava/lang/Object;)Ljava/lang/Object;", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
        public static final class C3488a extends LruCache<Integer, Integer> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f11900a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3488a(int i, int i2) {
                super(i2);
                this.f11900a = i;
            }

            @Override // android.util.LruCache
            @Nullable
            public Integer create(@Nullable Integer key) {
                if (key == null) {
                    return null;
                }
                int iIntValue = key.intValue();
                Context contextM155971a = lv0.m155971a();
                contextM155971a.getClass();
                return Integer.valueOf(contextM155971a.getResources().getDimensionPixelSize(iIntValue));
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LruCache<Integer, Integer> invoke() {
            ResCache resCache = ResCache.INSTANCE;
            return new C3488a(100, 100);
        }
    });

    private ResCache() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DisplayMetrics m17572a() {
        DisplayMetrics displayMetrics = _displayMetrics;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        synchronized (this) {
            DisplayMetrics displayMetrics2 = _displayMetrics;
            if (displayMetrics2 != null) {
                return displayMetrics2;
            }
            Context contextM155971a = lv0.m155971a();
            contextM155971a.getClass();
            Resources resources = contextM155971a.getResources();
            resources.getClass();
            DisplayMetrics displayMetrics3 = resources.getDisplayMetrics();
            _displayMetrics = displayMetrics3;
            displayMetrics3.getClass();
            return displayMetrics3;
        }
    }
}
