package kotlinx.coroutines.debug.internal;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c1g0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J$\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082P¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0014\u0010)\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\bR(\u0010/\u001a\u0004\u0018\u00010\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "", "Ljava/lang/StackTraceElement;", "h", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", Frame.TYPE, "", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/ref/WeakReference;", "_context", "_state", "Ljava/lang/String;", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/Thread;", "_lastObservedFrame", "Ll/c1g0;", "creationStackBottom", "Ll/c1g0;", Constants.INAPP_DATA_TAG, "()Ll/c1g0;", "c", "()Lkotlin/coroutines/CoroutineContext;", "context", "e", "creationStackTrace", "g", "state", "value", "f", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedFrame", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
@SourceDebugExtension
public final class DebugCoroutineInfoImpl {

    @JvmField
    @Nullable
    public volatile WeakReference<CoroutineStackFrame> _lastObservedFrame;

    @JvmField
    @NotNull
    public volatile String _state;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final long sequenceNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<CoroutineContext> _context;

    @JvmField
    @Nullable
    public volatile Thread lastObservedThread;

    /* JADX INFO: renamed from: b */
    public final List<StackTraceElement> m94931b() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final CoroutineContext m94932c() {
        return this._context.get();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final c1g0 m94933d() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<StackTraceElement> m94934e() {
        return m94931b();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final CoroutineStackFrame m94935f() {
        WeakReference<CoroutineStackFrame> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String get_state() {
        return this._state;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<StackTraceElement> m94937h() {
        CoroutineStackFrame coroutineStackFrameM94935f = m94935f();
        if (coroutineStackFrameM94935f == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (coroutineStackFrameM94935f != null) {
            StackTraceElement stackTraceElement = coroutineStackFrameM94935f.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            coroutineStackFrameM94935f = coroutineStackFrameM94935f.getCallerFrame();
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0048 -> B:25:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:24:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x004a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m94938i(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p153l.uyp.m198688e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r5
            java.lang.Object r6 = r0.L$1
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r7 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r7
            kotlin.ResultKt.m88128b(r8)
            goto L5c
        L35:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r5)
            r5 = 0
            return r5
        L3c:
            kotlin.ResultKt.m88128b(r8)
        L3f:
            if (r7 != 0) goto L44
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L44:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L5f
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r6.mo94149c(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r4 = r7
            r7 = r5
            r5 = r4
        L5c:
            r4 = r7
            r7 = r5
            r5 = r4
        L5f:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r7.getCallerFrame()
            if (r7 == 0) goto L66
            goto L3f
        L66:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.m94938i(kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + get_state() + ",context=" + m94932c() + ')';
    }
}
