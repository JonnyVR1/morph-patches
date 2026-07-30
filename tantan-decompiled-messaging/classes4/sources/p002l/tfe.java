package p002l;

import android.util.ArrayMap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.data.BLiveTasks;
import com.tantan.live.eventbus.LiveEventBus;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.ffw;
import l.j760;
import l.n7t;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0002\u0010\tJ\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ll/tfe;", "Ll/ho2;", "T", "Ll/pj2;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "()V", "n", "", "type", "U3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "tasks", "c4", "(Lcom/p1/mobile/putong/live/base/data/BLiveTasks;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "T3", "()Landroid/view/ViewGroup;", "Landroid/widget/FrameLayout;", "j", "Lkotlin/Lazy;", "a4", "()Landroid/widget/FrameLayout;", "mainView", "Landroid/util/ArrayMap;", "k", "Z3", "()Landroid/util/ArrayMap;", "cacheMap", "Ll/spd0;", "l", "b4", "()Ll/spd0;", "savedHelper", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class tfe<T extends ho2> extends pj2<T> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy cacheMap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy savedHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(@NotNull bsm<T> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.mainView = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.pfe
            public final Object invoke() {
                return tfe.m22916V3(this.f17237a);
            }
        });
        this.cacheMap = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.qfe
            public final Object invoke() {
                return tfe.m22917W3();
            }
        });
        this.savedHelper = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.rfe
            public final Object invoke() {
                return tfe.m22919Y3(this.f18491a);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public static FrameLayout m22916V3(tfe tfeVar) {
        FrameLayout frameLayout = new FrameLayout(tfeVar.f22037f);
        int i = xdl0.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.bottomMargin = t100.d(52.0f);
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    /* JADX INFO: renamed from: W3 */
    public static ArrayMap m22917W3() {
        return new ArrayMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public static void m22918X3(tfe tfeVar, j760 j760Var) {
        Object obj = j760Var.a;
        obj.getClass();
        BLiveTasks bLiveTasks = (BLiveTasks) obj;
        if (tfeVar.m25547E2().mo9893p()) {
            String str = bLiveTasks.type;
            str.getClass();
            if (!n7t.a(str)) {
                return;
            }
        }
        tfeVar.m23501L3(tfeVar.m22922a4());
        Object obj2 = j760Var.b;
        obj2.getClass();
        tfeVar.m22924c4(bLiveTasks, (String) obj2);
    }

    /* JADX INFO: renamed from: Y3 */
    public static spd0 m22919Y3(tfe tfeVar) {
        return new spd0(tfeVar.m25552L2());
    }

    /* JADX INFO: renamed from: T */
    public void m22920T() {
        super.T();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        duringCreated((c) new LiveEventBus.DynamicBubbleEvent(liveEventBusM25548F2).showBubbleByType().g()).subscribe(ffw.d(new e30() { // from class: l.sfe
            public final void call(Object obj) {
                tfe.m22918X3(this.f18987a, (j760) obj);
            }
        }));
    }

    @Override // p002l.qj2
    @NotNull
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return m22922a4();
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: U3 */
    public void mo21291U3(@Nullable String type) {
        super.mo21291U3(type);
        if (m22921Z3().isEmpty()) {
            return;
        }
        Set<Map.Entry<String, BLiveTasks>> setEntrySet = m22921Z3().entrySet();
        setEntrySet.getClass();
        Object objFirst = CollectionsKt.first(setEntrySet);
        objFirst.getClass();
        Map.Entry entry = (Map.Entry) objFirst;
        Object value = entry.getValue();
        value.getClass();
        Object key = entry.getKey();
        key.getClass();
        m22924c4((BLiveTasks) value, (String) key);
    }

    @NotNull
    /* JADX INFO: renamed from: Z3 */
    public final ArrayMap<String, BLiveTasks> m22921Z3() {
        return (ArrayMap) this.cacheMap.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final FrameLayout m22922a4() {
        return (FrameLayout) this.mainView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final spd0 m22923b4() {
        return (spd0) this.savedHelper.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((p002l.nfe) r0).getItemType(), "reward") != false) goto L19;
     */
    /* JADX INFO: renamed from: c4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22924c4(@org.jetbrains.annotations.NotNull com.p1.mobile.putong.live.base.data.BLiveTasks r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            l.spd0 r0 = r2.m22923b4()
            boolean r0 = r0.m22598i(r4)
            if (r0 == 0) goto L11
            return
        L11:
            java.util.HashMap r0 = r2.b
            if (r0 == 0) goto L9c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            goto L9c
        L1d:
            java.util.HashMap r0 = r2.b
            r0.getClass()
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            r0.getClass()
            l.nfe r0 = (p002l.nfe) r0
            java.lang.String r0 = r0.getItemType()
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L74
            java.lang.String r0 = "gift"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r4, r0)
            if (r0 == 0) goto L6a
            java.util.HashMap r0 = r2.b
            r0.getClass()
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            r0.getClass()
            l.nfe r0 = (p002l.nfe) r0
            java.lang.String r0 = r0.getItemType()
            java.lang.String r1 = "reward"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L6a
            goto L74
        L6a:
            android.util.ArrayMap r2 = r2.m22921Z3()
            r2.put(r4, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return
        L74:
            java.util.HashMap r0 = r2.b
            r0.getClass()
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            r0.getClass()
            l.nfe r0 = (p002l.nfe) r0
            r2.C2(r0)
            l.nfe r0 = new l.nfe
            l.bsm<? extends T extends l.ho2> r1 = r2.f22036e
            r1.getClass()
            r0.<init>(r1, r3, r4)
            r2.z2(r0)
            return
        L9c:
            l.nfe r0 = new l.nfe
            l.bsm<? extends T extends l.ho2> r1 = r2.f22036e
            r1.getClass()
            r0.<init>(r1, r3, r4)
            r2.z2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002l.tfe.m22924c4(com.p1.mobile.putong.live.base.data.BLiveTasks, java.lang.String):void");
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m23505R3(m22922a4());
    }
}
