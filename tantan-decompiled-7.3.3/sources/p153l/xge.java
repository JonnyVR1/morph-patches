package p153l;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveTasks;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.DynamicBubbleEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0002\u0010\tJ\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$¨\u0006&"}, m88121d2 = {"Ll/xge;", "Ll/oo2;", p7f.GPS_DIRECTION_TRUE, "Ll/xj2;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "()V", "n", "", "type", "U3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "tasks", "c4", "(Lcom/p1/mobile/putong/live/base/data/BLiveTasks;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "T3", "()Landroid/view/ViewGroup;", "Landroid/widget/FrameLayout;", "j", "Lkotlin/Lazy;", "a4", "()Landroid/widget/FrameLayout;", "mainView", "Landroid/util/ArrayMap;", "k", "Z3", "()Landroid/util/ArrayMap;", "cacheMap", "Ll/uxd0;", BLiveStormDanmakuGiftResourceType.f45292l, "b4", "()Ll/uxd0;", "savedHelper", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xge<T extends oo2> extends xj2<T> {

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
    public xge(@NotNull dum<T> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.mainView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.tge
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xge.m210879V3(this.f174074a);
            }
        });
        this.cacheMap = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.uge
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xge.m210880W3();
            }
        });
        this.savedHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.vge
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xge.m210882Y3(this.f184021a);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public static FrameLayout m210879V3(xge xgeVar) {
        FrameLayout frameLayout = new FrameLayout(xgeVar.f196919f);
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.bottomMargin = qa00.m175859d(52.0f);
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    /* JADX INFO: renamed from: W3 */
    public static ArrayMap m210880W3() {
        return new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public static void m210881X3(xge xgeVar, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        f.getClass();
        BLiveTasks bLiveTasks = (BLiveTasks) f;
        if (xgeVar.m213810E2().mo118373p()) {
            String str = bLiveTasks.type;
            str.getClass();
            if (!o9t.m166809a(str)) {
                return;
            }
        }
        xgeVar.m110323L3(xgeVar.m210885a4());
        S s = pf60Var.f152157b;
        s.getClass();
        xgeVar.m210887c4(bLiveTasks, (String) s);
    }

    /* JADX INFO: renamed from: Y3 */
    public static uxd0 m210882Y3(xge xgeVar) {
        return new uxd0(xgeVar.m213815L2());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        duringCreated((C22421c<T>) liveEventBusM213811F2.new DynamicBubbleEvent().showBubbleByType().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wge
            @Override // p153l.y20
            public final void call(Object obj) {
                xge.m210881X3(this.f188968a, (pf60) obj);
            }
        }));
    }

    @Override // p153l.yj2
    @NotNull
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo130467T3() {
        return m210885a4();
    }

    @Override // p153l.yj2
    /* JADX INFO: renamed from: U3 */
    public void mo210883U3(@Nullable String type) {
        super.mo210883U3(type);
        if (m210884Z3().isEmpty()) {
            return;
        }
        Set<Map.Entry<String, BLiveTasks>> setEntrySet = m210884Z3().entrySet();
        setEntrySet.getClass();
        Object objFirst = CollectionsKt.first(setEntrySet);
        objFirst.getClass();
        Map.Entry entry = (Map.Entry) objFirst;
        Object value = entry.getValue();
        value.getClass();
        Object key = entry.getKey();
        key.getClass();
        m210887c4((BLiveTasks) value, (String) key);
    }

    @NotNull
    /* JADX INFO: renamed from: Z3 */
    public final ArrayMap<String, BLiveTasks> m210884Z3() {
        return (ArrayMap) this.cacheMap.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final FrameLayout m210885a4() {
        return (FrameLayout) this.mainView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final uxd0 m210886b4() {
        return (uxd0) this.savedHelper.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m88377d(((p153l.rge) r0).getItemType(), "reward") != false) goto L19;
     */
    /* JADX INFO: renamed from: c4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m210887c4(@NotNull BLiveTasks tasks, @NotNull String type) {
        tasks.getClass();
        type.getClass();
        if (m210886b4().m198420i(type)) {
            return;
        }
        HashMap<String, uwl> map = this.f130285b;
        if (map == null || map.isEmpty()) {
            dum<? extends T> dumVar = this.f196918e;
            dumVar.getClass();
            m153103z2(new rge(dumVar, tasks, type));
            return;
        }
        HashMap<String, uwl> map2 = this.f130285b;
        map2.getClass();
        Collection<uwl> collectionValues = map2.values();
        collectionValues.getClass();
        Object objFirst = CollectionsKt.first(collectionValues);
        objFirst.getClass();
        if (!TextUtils.equals(((rge) objFirst).getItemType(), type)) {
            if (Intrinsics.m88377d(type, "gift")) {
                HashMap<String, uwl> map3 = this.f130285b;
                map3.getClass();
                Collection<uwl> collectionValues2 = map3.values();
                collectionValues2.getClass();
                Object objFirst2 = CollectionsKt.first(collectionValues2);
                objFirst2.getClass();
            }
            m210884Z3().put(type, tasks);
            Unit unit = Unit.INSTANCE;
            return;
        }
        HashMap<String, uwl> map4 = this.f130285b;
        map4.getClass();
        Collection<uwl> collectionValues3 = map4.values();
        collectionValues3.getClass();
        Object objFirst3 = CollectionsKt.first(collectionValues3);
        objFirst3.getClass();
        m153097C2((rge) objFirst3);
        dum<? extends T> dumVar2 = this.f196918e;
        dumVar2.getClass();
        m153103z2(new rge(dumVar2, tasks, type));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m110328R3(m210885a4());
    }
}
