package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1602b;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p149l.a45;
import p149l.fa5;
import p149l.gr0;
import p149l.jr0;
import p149l.m1j;
import p149l.q13;
import p149l.r480;
import p149l.xq0;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 R2\u00020\u0001:\u00026/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\nH\u0003¢\u0006\u0004\b%\u0010&J5\u0010*\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b/\u00100J'\u00102\u001a\b\u0012\u0004\u0012\u00020(0'*\b\u0012\u0004\u0012\u00020(0'2\u0006\u00101\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u0014\u0010?\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010>R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0016\u0010E\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010G\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0016\u0010K\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010>R\"\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010MR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010P¨\u0006S"}, m87232d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "Ll/r480;", "platformBitmapFactory", "Ll/q13;", "bitmapFrameRenderer", "Ll/m1j;", "fpsCompressor", "Ll/gr0;", "animationInformation", "", "bufferLengthMilliseconds", "<init>", "(Ll/r480;Ll/q13;Ll/m1j;Ll/gr0;I)V", "frameNumber", "width", "height", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "g", "(III)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "Lkotlin/Function0;", "", "onAnimationLoaded", "e", "(IILkotlin/jvm/functions/Function0;)V", "fps", "f", "(I)V", BLiveResOperation.clear, "()V", "targetFrame", "j", "(I)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "m", "(II)V", "count", "", "c", "(IIII)Z", "Ll/fa5;", "Landroid/graphics/Bitmap;", "targetBitmap", "n", "(Ll/fa5;III)V", "Ll/xq0;", RXScreenCaptureService.KEY_INDEX, "(I)Ll/xq0;", "b", "(Ll/fa5;)V", "src", "o", "(Ll/fa5;Landroid/graphics/Bitmap;)Ll/fa5;", "k", "(Ll/gr0;)I", "a", "Ll/r480;", "Ll/q13;", "Ll/m1j;", Constants.INAPP_DATA_TAG, "Ll/gr0;", BLiveStormDanmakuGiftResourceType.f44444l, "()Ll/gr0;", "I", "bufferSize", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b$a;", "Ljava/util/concurrent/ConcurrentHashMap;", "bufferFramesHash", "h", "thresholdFrame", "Z", "isFetching", "Ll/a45;", "Ll/a45;", "frameSequence", "lastRenderedFrameNumber", "", "Ljava/util/Map;", "compressionFrameMap", "", "Ljava/util/Set;", "renderableFrameIndexes", "Companion", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1602b implements InterfaceC1603c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final r480 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final q13 bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final m1j fpsCompressor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final gr0 animationInformation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int bufferLengthMilliseconds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int bufferSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Integer, a> bufferFramesHash;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile int thresholdFrame;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public volatile boolean isFetching;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final a45 frameSequence;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int lastRenderedFrameNumber;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public Map<Integer, Integer> compressionFrameMap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Set<Integer> renderableFrameIndexes;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, m87232d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b$a;", "", "Ll/fa5;", "Landroid/graphics/Bitmap;", "bitmapRef", "<init>", "(Ll/fa5;)V", "", "c", "()V", "a", "Ll/fa5;", "()Ll/fa5;", "", "b", "Z", "isUpdatingFrame", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "isFrameAvailable", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final fa5<Bitmap> bitmapRef;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isUpdatingFrame;

        public a(@NotNull fa5<Bitmap> fa5Var) {
            fa5Var.getClass();
            this.bitmapRef = fa5Var;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final fa5<Bitmap> m8354a() {
            return this.bitmapRef;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m8355b() {
            return !this.isUpdatingFrame && this.bitmapRef.mo120157N();
        }

        /* JADX INFO: renamed from: c */
        public final void m8356c() {
            fa5.m120154v(this.bitmapRef);
        }

        /* JADX INFO: renamed from: d */
        public final void m8357d(boolean z) {
            this.isUpdatingFrame = z;
        }
    }

    public C1602b(@NotNull r480 r480Var, @NotNull q13 q13Var, @NotNull m1j m1jVar, @NotNull gr0 gr0Var, int i) {
        r480Var.getClass();
        q13Var.getClass();
        m1jVar.getClass();
        gr0Var.getClass();
        this.platformBitmapFactory = r480Var;
        this.bitmapFrameRenderer = q13Var;
        this.fpsCompressor = m1jVar;
        this.animationInformation = gr0Var;
        this.bufferLengthMilliseconds = i;
        int iM87596b = C15167a.m87596b((m8349k(getAnimationInformation()) * i) / 1000, 1);
        this.bufferSize = iM87596b;
        this.bufferFramesHash = new ConcurrentHashMap<>();
        this.frameSequence = new a45(getAnimationInformation().getFrameCount());
        this.lastRenderedFrameNumber = -1;
        this.compressionFrameMap = MapsKt.emptyMap();
        this.renderableFrameIndexes = SetsKt.emptySet();
        mo8345f(m8349k(getAnimationInformation()));
        this.thresholdFrame = (int) (iM87596b * 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static void m8339a(C1602b c1602b, int i, int i2) {
        c1602b.getClass();
        while (true) {
            C1602b c1602b2 = c1602b;
            int i3 = i;
            int i4 = i2;
            if (m8340h(c1602b2, C15167a.m87596b(c1602b.lastRenderedFrameNumber, 0), i3, i4, 0, 8, null)) {
                c1602b2.isFetching = false;
                return;
            } else {
                c1602b = c1602b2;
                i = i3;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m8340h(C1602b c1602b, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return c1602b.m8342c(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public final void m8341b(fa5<Bitmap> fa5Var) {
        if (fa5Var.mo120157N()) {
            new Canvas(fa5Var.m120155B()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final boolean m8342c(int targetFrame, int width, int height, int count) {
        int iIntValue;
        fa5<Bitmap> fa5VarM8354a;
        List<Integer> listM94800d = this.frameSequence.m94800d(targetFrame, this.bufferSize);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM94800d) {
            if (this.renderableFrameIndexes.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        Set<Integer> setKeySet = this.bufferFramesHash.keySet();
        setKeySet.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(SetsKt.minus((Set) setKeySet, (Iterable) set));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.bufferFramesHash.get(Integer.valueOf(iIntValue2)) == null) {
                int i = this.lastRenderedFrameNumber;
                if (i != -1 && !set.contains(Integer.valueOf(i))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                a aVar = this.bufferFramesHash.get(Integer.valueOf(iIntValue3));
                fa5<Bitmap> fa5VarMo120158q = (aVar == null || (fa5VarM8354a = aVar.m8354a()) == null) ? null : fa5VarM8354a.mo120158q();
                if (fa5VarMo120158q == null) {
                    fa5<Bitmap> fa5VarM177780a = this.platformBitmapFactory.m177780a(width, height);
                    fa5VarM177780a.getClass();
                    aVar = new a(fa5VarM177780a);
                    fa5VarMo120158q = aVar.m8354a().clone();
                }
                aVar.m8357d(true);
                try {
                    m8352n(fa5VarMo120158q, iIntValue2, width, height);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.m87404a(fa5VarMo120158q, null);
                    this.bufferFramesHash.remove(Integer.valueOf(iIntValue3));
                    aVar.m8357d(false);
                    this.bufferFramesHash.put(Integer.valueOf(iIntValue2), aVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m87404a(fa5VarMo120158q, th);
                        throw th2;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.bufferSize * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(C15167a.m87601g((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.thresholdFrame = iIntValue;
        return true;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1603c
    public void clear() {
        Collection<a> collectionValues = this.bufferFramesHash.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m8356c();
        }
        this.bufferFramesHash.clear();
        this.lastRenderedFrameNumber = -1;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1603c
    /* JADX INFO: renamed from: d */
    public void mo8343d() {
        InterfaceC1603c.a.m8358a(this);
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1603c
    @UiThread
    /* JADX INFO: renamed from: e */
    public void mo8344e(int width, int height, @NotNull Function0<Unit> onAnimationLoaded) {
        onAnimationLoaded.getClass();
        m8351m(width, height);
        onAnimationLoaded.invoke();
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1603c
    /* JADX INFO: renamed from: f */
    public void mo8345f(int fps) {
        Map<Integer, Integer> mapM152593a = this.fpsCompressor.m152593a(getAnimationInformation().mo108210f() * C15167a.m87596b(getAnimationInformation().getLoopCount(), 1), getAnimationInformation().getFrameCount(), C15167a.m87599e(fps, m8349k(getAnimationInformation())));
        this.compressionFrameMap = mapM152593a;
        this.renderableFrameIndexes = CollectionsKt.toSet(mapM152593a.values());
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1603c
    @UiThread
    @NotNull
    /* JADX INFO: renamed from: g */
    public FrameResult mo8346g(int frameNumber, int width, int height) {
        Integer num = this.compressionFrameMap.get(Integer.valueOf(frameNumber));
        if (num == null) {
            return m8348j(frameNumber);
        }
        int iIntValue = num.intValue();
        this.lastRenderedFrameNumber = iIntValue;
        a aVar = this.bufferFramesHash.get(num);
        if (aVar == null || !aVar.m8355b()) {
            aVar = null;
        }
        if (aVar == null) {
            m8351m(width, height);
            return m8348j(iIntValue);
        }
        if (this.frameSequence.m94799c(this.thresholdFrame, iIntValue, this.bufferSize)) {
            m8351m(width, height);
        }
        return new FrameResult(aVar.m8354a().clone(), FrameResult.FrameType.SUCCESS);
    }

    /* JADX INFO: renamed from: i */
    public final xq0 m8347i(int targetFrame) {
        xq0 xq0Var;
        Iterator<Integer> it = new IntRange(0, this.frameSequence.getSize()).iterator();
        do {
            xq0Var = null;
            if (!it.hasNext()) {
                break;
            }
            int iM94797a = this.frameSequence.m94797a(targetFrame - ((IntIterator) it).nextInt());
            a aVar = this.bufferFramesHash.get(Integer.valueOf(iM94797a));
            if (aVar != null) {
                if (!aVar.m8355b()) {
                    aVar = null;
                }
                if (aVar != null) {
                    xq0Var = new xq0(iM94797a, aVar.m8354a());
                }
            }
        } while (xq0Var == null);
        return xq0Var;
    }

    @UiThread
    /* JADX INFO: renamed from: j */
    public final FrameResult m8348j(int targetFrame) {
        xq0 xq0VarM8347i = m8347i(targetFrame);
        if (xq0VarM8347i == null) {
            return new FrameResult(null, FrameResult.FrameType.MISSING);
        }
        fa5<Bitmap> fa5VarClone = xq0VarM8347i.m210539k().clone();
        fa5VarClone.getClass();
        this.lastRenderedFrameNumber = xq0VarM8347i.getFrameNumber();
        return new FrameResult(fa5VarClone, FrameResult.FrameType.NEAREST);
    }

    /* JADX INFO: renamed from: k */
    public final int m8349k(gr0 gr0Var) {
        return (int) C15167a.m87597c(1000 / ((long) (gr0Var.mo108210f() / gr0Var.getFrameCount())), 1L);
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public gr0 getAnimationInformation() {
        return this.animationInformation;
    }

    /* JADX INFO: renamed from: m */
    public final void m8351m(final int width, final int height) {
        if (this.isFetching) {
            return;
        }
        this.isFetching = true;
        jr0.INSTANCE.m142910b(new Runnable() { // from class: l.ng3
            @Override // java.lang.Runnable
            public final void run() {
                C1602b.m8339a(this.f138835a, width, height);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m8352n(fa5<Bitmap> targetBitmap, int targetFrame, int width, int height) {
        fa5<Bitmap> fa5VarM210539k;
        fa5<Bitmap> fa5VarMo120158q;
        xq0 xq0VarM8347i = m8347i(targetFrame);
        if (xq0VarM8347i != null && (fa5VarM210539k = xq0VarM8347i.m210539k()) != null && (fa5VarMo120158q = fa5VarM210539k.mo120158q()) != null) {
            try {
                int frameNumber = xq0VarM8347i.getFrameNumber();
                if (frameNumber < targetFrame) {
                    Bitmap bitmapM120155B = fa5VarMo120158q.m120155B();
                    bitmapM120155B.getClass();
                    m8353o(targetBitmap, bitmapM120155B);
                    Iterator<Integer> it = new IntRange(frameNumber + 1, targetFrame).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((IntIterator) it).nextInt();
                        q13 q13Var = this.bitmapFrameRenderer;
                        Bitmap bitmapM120155B2 = targetBitmap.m120155B();
                        bitmapM120155B2.getClass();
                        q13Var.mo112974d(iNextInt, bitmapM120155B2);
                    }
                    CloseableKt.m87404a(fa5VarMo120158q, null);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(fa5VarMo120158q, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(fa5VarMo120158q, th);
                    throw th2;
                }
            }
        }
        m8341b(targetBitmap);
        Iterator<Integer> it2 = new IntRange(0, targetFrame).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((IntIterator) it2).nextInt();
            q13 q13Var2 = this.bitmapFrameRenderer;
            Bitmap bitmapM120155B3 = targetBitmap.m120155B();
            bitmapM120155B3.getClass();
            q13Var2.mo112974d(iNextInt2, bitmapM120155B3);
        }
    }

    /* JADX INFO: renamed from: o */
    public final fa5<Bitmap> m8353o(fa5<Bitmap> fa5Var, Bitmap bitmap) {
        if (fa5Var.mo120157N() && !Intrinsics.m87488d(fa5Var.m120155B(), bitmap)) {
            Canvas canvas = new Canvas(fa5Var.m120155B());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return fa5Var;
    }
}
