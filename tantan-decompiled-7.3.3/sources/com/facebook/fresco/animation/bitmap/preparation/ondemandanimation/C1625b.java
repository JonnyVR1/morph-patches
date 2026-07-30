package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1625b;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.p122io.CloseableKt;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p153l.b55;
import p153l.br0;
import p153l.f23;
import p153l.fb5;
import p153l.h4j;
import p153l.kr0;
import p153l.nr0;
import p153l.xc80;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 R2\u00020\u0001:\u00026/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\nH\u0003¢\u0006\u0004\b%\u0010&J5\u0010*\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b/\u00100J'\u00102\u001a\b\u0012\u0004\u0012\u00020(0'*\b\u0012\u0004\u0012\u00020(0'2\u0006\u00101\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u0014\u0010?\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010>R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0016\u0010E\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010G\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0016\u0010K\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010>R\"\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010MR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010P¨\u0006S"}, m88121d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "Ll/xc80;", "platformBitmapFactory", "Ll/f23;", "bitmapFrameRenderer", "Ll/h4j;", "fpsCompressor", "Ll/kr0;", "animationInformation", "", "bufferLengthMilliseconds", "<init>", "(Ll/xc80;Ll/f23;Ll/h4j;Ll/kr0;I)V", "frameNumber", "width", "height", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "g", "(III)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "Lkotlin/Function0;", "", "onAnimationLoaded", "e", "(IILkotlin/jvm/functions/Function0;)V", "fps", "f", "(I)V", BLiveResOperation.clear, "()V", "targetFrame", "j", "(I)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "m", "(II)V", "count", "", "c", "(IIII)Z", "Ll/fb5;", "Landroid/graphics/Bitmap;", "targetBitmap", "n", "(Ll/fb5;III)V", "Ll/br0;", RXScreenCaptureService.KEY_INDEX, "(I)Ll/br0;", "b", "(Ll/fb5;)V", "src", "o", "(Ll/fb5;Landroid/graphics/Bitmap;)Ll/fb5;", "k", "(Ll/kr0;)I", "a", "Ll/xc80;", "Ll/f23;", "Ll/h4j;", Constants.INAPP_DATA_TAG, "Ll/kr0;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/kr0;", "I", "bufferSize", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b$a;", "Ljava/util/concurrent/ConcurrentHashMap;", "bufferFramesHash", "h", "thresholdFrame", "Z", "isFetching", "Ll/b55;", "Ll/b55;", "frameSequence", "lastRenderedFrameNumber", "", "Ljava/util/Map;", "compressionFrameMap", "", "Ljava/util/Set;", "renderableFrameIndexes", "Companion", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1625b implements InterfaceC1626c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xc80 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f23 bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final h4j fpsCompressor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final kr0 animationInformation;

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
    public final b55 frameSequence;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int lastRenderedFrameNumber;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public Map<Integer, Integer> compressionFrameMap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Set<Integer> renderableFrameIndexes;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b$a;", "", "Ll/fb5;", "Landroid/graphics/Bitmap;", "bitmapRef", "<init>", "(Ll/fb5;)V", "", "c", "()V", "a", "Ll/fb5;", "()Ll/fb5;", "", "b", "Z", "isUpdatingFrame", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "isFrameAvailable", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final fb5<Bitmap> bitmapRef;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isUpdatingFrame;

        public a(@NotNull fb5<Bitmap> fb5Var) {
            fb5Var.getClass();
            this.bitmapRef = fb5Var;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final fb5<Bitmap> m8408a() {
            return this.bitmapRef;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m8409b() {
            return !this.isUpdatingFrame && this.bitmapRef.mo124877N();
        }

        /* JADX INFO: renamed from: c */
        public final void m8410c() {
            fb5.m124874v(this.bitmapRef);
        }

        /* JADX INFO: renamed from: d */
        public final void m8411d(boolean z) {
            this.isUpdatingFrame = z;
        }
    }

    public C1625b(@NotNull xc80 xc80Var, @NotNull f23 f23Var, @NotNull h4j h4jVar, @NotNull kr0 kr0Var, int i) {
        xc80Var.getClass();
        f23Var.getClass();
        h4jVar.getClass();
        kr0Var.getClass();
        this.platformBitmapFactory = xc80Var;
        this.bitmapFrameRenderer = f23Var;
        this.fpsCompressor = h4jVar;
        this.animationInformation = kr0Var;
        this.bufferLengthMilliseconds = i;
        int iM88486b = C15274a.m88486b((m8403k(getAnimationInformation()) * i) / 1000, 1);
        this.bufferSize = iM88486b;
        this.bufferFramesHash = new ConcurrentHashMap<>();
        this.frameSequence = new b55(getAnimationInformation().getFrameCount());
        this.lastRenderedFrameNumber = -1;
        this.compressionFrameMap = MapsKt.emptyMap();
        this.renderableFrameIndexes = SetsKt.emptySet();
        mo8399f(m8403k(getAnimationInformation()));
        this.thresholdFrame = (int) (iM88486b * 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static void m8393a(C1625b c1625b, int i, int i2) {
        c1625b.getClass();
        while (true) {
            C1625b c1625b2 = c1625b;
            int i3 = i;
            int i4 = i2;
            if (m8394h(c1625b2, C15274a.m88486b(c1625b.lastRenderedFrameNumber, 0), i3, i4, 0, 8, null)) {
                c1625b2.isFetching = false;
                return;
            } else {
                c1625b = c1625b2;
                i = i3;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m8394h(C1625b c1625b, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return c1625b.m8396c(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public final void m8395b(fb5<Bitmap> fb5Var) {
        if (fb5Var.mo124877N()) {
            new Canvas(fb5Var.m124875B()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final boolean m8396c(int targetFrame, int width, int height, int count) {
        int iIntValue;
        fb5<Bitmap> fb5VarM8408a;
        List<Integer> listM102556d = this.frameSequence.m102556d(targetFrame, this.bufferSize);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM102556d) {
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
                fb5<Bitmap> fb5VarMo124879q = (aVar == null || (fb5VarM8408a = aVar.m8408a()) == null) ? null : fb5VarM8408a.mo124879q();
                if (fb5VarMo124879q == null) {
                    fb5<Bitmap> fb5VarM210132a = this.platformBitmapFactory.m210132a(width, height);
                    fb5VarM210132a.getClass();
                    aVar = new a(fb5VarM210132a);
                    fb5VarMo124879q = aVar.m8408a().clone();
                }
                aVar.m8411d(true);
                try {
                    m8406n(fb5VarMo124879q, iIntValue2, width, height);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.m88293a(fb5VarMo124879q, null);
                    this.bufferFramesHash.remove(Integer.valueOf(iIntValue3));
                    aVar.m8411d(false);
                    this.bufferFramesHash.put(Integer.valueOf(iIntValue2), aVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m88293a(fb5VarMo124879q, th);
                        throw th2;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.bufferSize * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(C15274a.m88492h((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.thresholdFrame = iIntValue;
        return true;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c
    public void clear() {
        Collection<a> collectionValues = this.bufferFramesHash.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m8410c();
        }
        this.bufferFramesHash.clear();
        this.lastRenderedFrameNumber = -1;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c
    /* JADX INFO: renamed from: d */
    public void mo8397d() {
        InterfaceC1626c.a.m8412a(this);
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c
    @UiThread
    /* JADX INFO: renamed from: e */
    public void mo8398e(int width, int height, @NotNull Function0<Unit> onAnimationLoaded) {
        onAnimationLoaded.getClass();
        m8405m(width, height);
        onAnimationLoaded.invoke();
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c
    /* JADX INFO: renamed from: f */
    public void mo8399f(int fps) {
        Map<Integer, Integer> mapM133576a = this.fpsCompressor.m133576a(getAnimationInformation().mo143072f() * C15274a.m88486b(getAnimationInformation().getLoopCount(), 1), getAnimationInformation().getFrameCount(), C15274a.m88489e(fps, m8403k(getAnimationInformation())));
        this.compressionFrameMap = mapM133576a;
        this.renderableFrameIndexes = CollectionsKt.toSet(mapM133576a.values());
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c
    @UiThread
    @NotNull
    /* JADX INFO: renamed from: g */
    public FrameResult mo8400g(int frameNumber, int width, int height) {
        Integer num = this.compressionFrameMap.get(Integer.valueOf(frameNumber));
        if (num == null) {
            return m8402j(frameNumber);
        }
        int iIntValue = num.intValue();
        this.lastRenderedFrameNumber = iIntValue;
        a aVar = this.bufferFramesHash.get(num);
        if (aVar == null || !aVar.m8409b()) {
            aVar = null;
        }
        if (aVar == null) {
            m8405m(width, height);
            return m8402j(iIntValue);
        }
        if (this.frameSequence.m102555c(this.thresholdFrame, iIntValue, this.bufferSize)) {
            m8405m(width, height);
        }
        return new FrameResult(aVar.m8408a().clone(), FrameResult.FrameType.SUCCESS);
    }

    /* JADX INFO: renamed from: i */
    public final br0 m8401i(int targetFrame) {
        br0 br0Var;
        Iterator<Integer> it = new IntRange(0, this.frameSequence.getSize()).iterator();
        do {
            br0Var = null;
            if (!it.hasNext()) {
                break;
            }
            int iM102553a = this.frameSequence.m102553a(targetFrame - ((IntIterator) it).nextInt());
            a aVar = this.bufferFramesHash.get(Integer.valueOf(iM102553a));
            if (aVar != null) {
                if (!aVar.m8409b()) {
                    aVar = null;
                }
                if (aVar != null) {
                    br0Var = new br0(iM102553a, aVar.m8408a());
                }
            }
        } while (br0Var == null);
        return br0Var;
    }

    @UiThread
    /* JADX INFO: renamed from: j */
    public final FrameResult m8402j(int targetFrame) {
        br0 br0VarM8401i = m8401i(targetFrame);
        if (br0VarM8401i == null) {
            return new FrameResult(null, FrameResult.FrameType.MISSING);
        }
        fb5<Bitmap> fb5VarClone = br0VarM8401i.m106024k().clone();
        fb5VarClone.getClass();
        this.lastRenderedFrameNumber = br0VarM8401i.getFrameNumber();
        return new FrameResult(fb5VarClone, FrameResult.FrameType.NEAREST);
    }

    /* JADX INFO: renamed from: k */
    public final int m8403k(kr0 kr0Var) {
        return (int) C15274a.m88487c(1000 / ((long) (kr0Var.mo143072f() / kr0Var.getFrameCount())), 1L);
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public kr0 getAnimationInformation() {
        return this.animationInformation;
    }

    /* JADX INFO: renamed from: m */
    public final void m8405m(final int width, final int height) {
        if (this.isFetching) {
            return;
        }
        this.isFetching = true;
        nr0.INSTANCE.m164438b(new Runnable() { // from class: l.bh3
            @Override // java.lang.Runnable
            public final void run() {
                C1625b.m8393a(this.f76709a, width, height);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m8406n(fb5<Bitmap> targetBitmap, int targetFrame, int width, int height) {
        fb5<Bitmap> fb5VarM106024k;
        fb5<Bitmap> fb5VarMo124879q;
        br0 br0VarM8401i = m8401i(targetFrame);
        if (br0VarM8401i != null && (fb5VarM106024k = br0VarM8401i.m106024k()) != null && (fb5VarMo124879q = fb5VarM106024k.mo124879q()) != null) {
            try {
                int frameNumber = br0VarM8401i.getFrameNumber();
                if (frameNumber < targetFrame) {
                    Bitmap bitmapM124875B = fb5VarMo124879q.m124875B();
                    bitmapM124875B.getClass();
                    m8407o(targetBitmap, bitmapM124875B);
                    Iterator<Integer> it = new IntRange(frameNumber + 1, targetFrame).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((IntIterator) it).nextInt();
                        f23 f23Var = this.bitmapFrameRenderer;
                        Bitmap bitmapM124875B2 = targetBitmap.m124875B();
                        bitmapM124875B2.getClass();
                        f23Var.mo123596d(iNextInt, bitmapM124875B2);
                    }
                    CloseableKt.m88293a(fb5VarMo124879q, null);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(fb5VarMo124879q, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(fb5VarMo124879q, th);
                    throw th2;
                }
            }
        }
        m8395b(targetBitmap);
        Iterator<Integer> it2 = new IntRange(0, targetFrame).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((IntIterator) it2).nextInt();
            f23 f23Var2 = this.bitmapFrameRenderer;
            Bitmap bitmapM124875B3 = targetBitmap.m124875B();
            bitmapM124875B3.getClass();
            f23Var2.mo123596d(iNextInt2, bitmapM124875B3);
        }
    }

    /* JADX INFO: renamed from: o */
    public final fb5<Bitmap> m8407o(fb5<Bitmap> fb5Var, Bitmap bitmap) {
        if (fb5Var.mo124877N() && !Intrinsics.m88377d(fb5Var.m124875B(), bitmap)) {
            Canvas canvas = new Canvas(fb5Var.m124875B());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return fb5Var;
    }
}
