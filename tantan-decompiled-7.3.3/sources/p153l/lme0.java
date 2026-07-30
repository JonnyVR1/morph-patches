package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.p058ui.intloperation.common.SelectorView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\bR>\u0010\u0019\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0015j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R>\u0010\u001b\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0015j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R>\u0010\u001e\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\u0015j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018Rs\u0010(\u001aS\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012;\u00129\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0015j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b`\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u00100\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040*\u0012\u0004\u0012\u00020\u0006\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R6\u00103\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0*\u0012\u0004\u0012\u00020\u0006\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R*\u00104\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0*\u0012\u0004\u0012\u00020\u0006\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u00066"}, m88121d2 = {"Ll/lme0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;", "selectorView", "", "g", "(Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;)V", "", "groupTag", "", "e", "(Ljava/lang/String;)Ljava/util/Set;", "f", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;", "", "select", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;Z)V", Constants.INAPP_DATA_TAG, "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "a", "Ljava/util/LinkedHashMap;", "selectorViewMap", "b", "selectTagMap", "Ljava/io/Closeable;", "c", "selectDataMap", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "map", "Lkotlin/jvm/functions/Function3;", "getChoiceMode", "()Lkotlin/jvm/functions/Function3;", "h", "(Lkotlin/jvm/functions/Function3;)V", "choiceMode", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "getSelectChangeListener", "()Lkotlin/jvm/functions/Function1;", "setSelectChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "selectChangeListener", "getSelectTagChangeListener", "setSelectTagChangeListener", "selectTagChangeListener", "selectDataChangeListener", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lme0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static Function3<? super lme0, ? super SelectorView, ? super LinkedHashMap<String, Set<SelectorView>>, Unit> f132676h = new Function3() { // from class: l.jme0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return lme0.m154853b((lme0) obj, (SelectorView) obj2, (LinkedHashMap) obj3);
        }
    };

    /* JADX INFO: renamed from: i */
    @NotNull
    public static Function3<? super lme0, ? super SelectorView, ? super LinkedHashMap<String, Set<SelectorView>>, Unit> f132677i = new Function3() { // from class: l.kme0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return lme0.m154852a((lme0) obj, (SelectorView) obj2, (LinkedHashMap) obj3);
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public LinkedHashMap<String, Set<SelectorView>> selectorViewMap = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public LinkedHashMap<String, Set<String>> selectTagMap = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public LinkedHashMap<String, Set<Closeable>> selectDataMap = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Function3<? super lme0, ? super SelectorView, ? super LinkedHashMap<String, Set<SelectorView>>, Unit> choiceMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Function1<? super List<? extends SelectorView>, Unit> selectChangeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function1<? super List<String>, Unit> selectTagChangeListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Function1<? super List<? extends Closeable>, Unit> selectDataChangeListener;

    /* JADX INFO: renamed from: a */
    public static Unit m154852a(lme0 lme0Var, SelectorView selectorView, LinkedHashMap linkedHashMap) {
        lme0Var.getClass();
        selectorView.getClass();
        linkedHashMap.getClass();
        lme0Var.m154860i(selectorView, !selectorView.getIsSelecting());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m154853b(lme0 lme0Var, SelectorView selectorView, LinkedHashMap linkedHashMap) {
        lme0Var.getClass();
        selectorView.getClass();
        linkedHashMap.getClass();
        SelectorView selectorViewM154857f = lme0Var.m154857f(selectorView.getGroupTag());
        if (selectorViewM154857f != null) {
            lme0Var.m154860i(selectorViewM154857f, false);
        }
        lme0Var.m154860i(selectorView, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m154855d(@NotNull SelectorView selectorView) {
        selectorView.getClass();
        Set<SelectorView> set = this.selectorViewMap.get(selectorView.getGroupTag());
        if (set != null) {
            set.remove(selectorView);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Set<SelectorView> m154856e(@NotNull String groupTag) {
        groupTag.getClass();
        return this.selectorViewMap.get(groupTag);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final SelectorView m154857f(@NotNull String groupTag) {
        groupTag.getClass();
        Set<SelectorView> setM154856e = m154856e(groupTag);
        if (setM154856e != null) {
            if (setM154856e.isEmpty()) {
                setM154856e = null;
            }
            if (setM154856e != null) {
                return (SelectorView) CollectionsKt.last(setM154856e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m154858g(@NotNull SelectorView selectorView) {
        selectorView.getClass();
        Function3<? super lme0, ? super SelectorView, ? super LinkedHashMap<String, Set<SelectorView>>, Unit> function3 = this.choiceMode;
        if (function3 != null) {
            function3.invoke(this, selectorView, this.selectorViewMap);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m154859h(@Nullable Function3<? super lme0, ? super SelectorView, ? super LinkedHashMap<String, Set<SelectorView>>, Unit> function3) {
        this.choiceMode = function3;
    }

    /* JADX INFO: renamed from: i */
    public final void m154860i(@NotNull SelectorView selectorView, boolean select) {
        selectorView.getClass();
        LinkedHashMap<String, Set<String>> linkedHashMap = this.selectTagMap;
        if (select) {
            Set<String> set = linkedHashMap.get(selectorView.getGroupTag());
            if (set != null) {
                set.add(selectorView.getTag());
            } else {
                this.selectTagMap.put(selectorView.getGroupTag(), SetsKt.mutableSetOf(selectorView.getTag()));
            }
            Set<SelectorView> set2 = this.selectorViewMap.get(selectorView.getGroupTag());
            if (set2 != null) {
                set2.add(selectorView);
            } else {
                this.selectorViewMap.put(selectorView.getGroupTag(), SetsKt.mutableSetOf(selectorView));
            }
            Set<Closeable> set3 = this.selectDataMap.get(selectorView.getGroupTag());
            if (set3 != null) {
                Closeable closeable = selectorView.getTags().get(null);
                if (closeable != null) {
                    set3.add(closeable);
                }
            } else {
                Closeable closeable2 = selectorView.getTags().get(null);
                if (closeable2 != null) {
                    this.selectDataMap.put(selectorView.getGroupTag(), SetsKt.mutableSetOf(closeable2));
                }
            }
        } else {
            Set<String> set4 = linkedHashMap.get(selectorView.getGroupTag());
            if (set4 != null) {
                set4.remove(selectorView.getTag());
            }
            Set<SelectorView> set5 = this.selectorViewMap.get(selectorView.getGroupTag());
            if (set5 != null) {
                set5.remove(selectorView);
            }
            Set<Closeable> set6 = this.selectDataMap.get(selectorView.getGroupTag());
            if (set6 != null) {
                TypeIntrinsics.m88423a(set6).remove(selectorView.getTags().get(null));
            }
        }
        selectorView.m47480h(select);
        Function1<? super List<? extends SelectorView>, Unit> function1 = this.selectChangeListener;
        if (function1 != null) {
            LinkedHashMap<String, Set<SelectorView>> linkedHashMap2 = this.selectorViewMap;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, Set<SelectorView>>> it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, it.next().getValue());
            }
            function1.invoke(arrayList);
        }
        Function1<? super List<String>, Unit> function2 = this.selectTagChangeListener;
        if (function2 != null) {
            LinkedHashMap<String, Set<String>> linkedHashMap3 = this.selectTagMap;
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, Set<String>>> it2 = linkedHashMap3.entrySet().iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, it2.next().getValue());
            }
            function2.invoke(arrayList2);
        }
        Function1<? super List<? extends Closeable>, Unit> function3 = this.selectDataChangeListener;
        if (function3 != null) {
            LinkedHashMap<String, Set<Closeable>> linkedHashMap4 = this.selectDataMap;
            ArrayList arrayList3 = new ArrayList();
            Iterator<Map.Entry<String, Set<Closeable>>> it3 = linkedHashMap4.entrySet().iterator();
            while (it3.hasNext()) {
                CollectionsKt.addAll(arrayList3, it3.next().getValue());
            }
            function3.invoke(arrayList3);
        }
    }

    /* JADX INFO: renamed from: l.lme0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rb\u0010\f\u001aB\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012,\u0012*\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u0007j\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t`\n\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/lme0$a;", "", "<init>", "()V", "Lkotlin/Function3;", "Ll/lme0;", "Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "", "MODE_SINGLE", "Lkotlin/jvm/functions/Function3;", "a", "()Lkotlin/jvm/functions/Function3;", "setMODE_SINGLE", "(Lkotlin/jvm/functions/Function3;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function3<lme0, SelectorView, LinkedHashMap<String, Set<SelectorView>>, Unit> m154861a() {
            return lme0.f132676h;
        }

        public Companion() {
        }
    }
}
