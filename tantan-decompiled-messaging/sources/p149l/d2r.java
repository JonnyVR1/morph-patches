package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, m87232d2 = {"Ll/d2r;", "Ll/x6s;", "Ll/nnn0;", "Ll/w3r;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "state", "", "b4", "(I)V", "R3", "()V", j6f.GPS_DIRECTION_TRUE, "menuType", "d4", "", "Ll/u1r;", "a4", "()Ljava/util/List;", "e4", "c4", "(Ljava/lang/Integer;)V", "j", "I", "getCurrentMenu$annotations", "currentMenu", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class d2r extends x6s<nnn0, w3r> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentMenu;

    public d2r(@Nullable bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        mo51532C(new w3r(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m109815S3(int i, gul gulVar) {
        if (gulVar instanceof f1r) {
            f1r f1rVar = (f1r) gulVar;
            if (f1rVar.mo114426T3() == i) {
                f1rVar.mo114427U3();
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m109816T3(ArrayList arrayList, gul gulVar) {
        if (gulVar instanceof f1r) {
            arrayList.add(((f1r) gulVar).mo114425S3());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static int m109817U3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: V3 */
    public static void m109818V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static int m109819W3(u1r u1rVar, u1r u1rVar2) {
        u1rVar.getClass();
        u1rVar2.getClass();
        return u1rVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - u1rVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
    }

    /* JADX INFO: renamed from: X3 */
    public static Unit m109820X3(d2r d2rVar, soj0 soj0Var) {
        ((w3r) d2rVar.viewModel).mo71838p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m109821Y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static Unit m109822Z3(d2r d2rVar, Integer num) {
        d2rVar.m109825c4(num);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    private final void m109823b4(final int state) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.z1r
            @Override // p149l.e30
            public final void call(Object obj) {
                d2r.m109815S3(state, (gul) obj);
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        bsm<? extends T> bsmVar = this.f188512e;
        m144512z2(new s1r(bsmVar, new h1r(bsmVar.f77095a)));
        bsm<? extends T> bsmVar2 = this.f188512e;
        m144512z2(new e1r(bsmVar2, new x0r(bsmVar2.f77095a), this));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<T> c22306cDuringCreated = duringCreated(m206028F2().KtvDialogEvent.closeKtvDialog().m172460g());
        final Function1 function1 = new Function1() { // from class: l.v1r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2r.m109820X3(this.f179270a, (soj0) obj);
            }
        };
        c22306cDuringCreated.subscribe(new e30() { // from class: l.w1r
            @Override // p149l.e30
            public final void call(Object obj) {
                d2r.m109821Y3(function1, obj);
            }
        });
        C22306c<T> c22306cDuringCreated2 = duringCreated(m206028F2().KtvDialogEvent.showKtvDialog().m172460g());
        final Function1 function2 = new Function1() { // from class: l.x1r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d2r.m109822Z3(this.f189090a, (Integer) obj);
            }
        };
        c22306cDuringCreated2.subscribe(new e30() { // from class: l.y1r
            @Override // p149l.e30
            public final void call(Object obj) {
                d2r.m109818V3(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final List<u1r> m109824a4() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.a2r
            @Override // p149l.e30
            public final void call(Object obj) {
                d2r.m109816T3(arrayList, (gul) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.b2r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(d2r.m109819W3((u1r) obj, (u1r) obj2));
            }
        };
        vwb.m200295I(arrayList, new Comparator() { // from class: l.c2r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d2r.m109817U3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m109825c4(Integer menuType) {
        ((w3r) this.viewModel).m201386P(menuType != null ? menuType.intValue() : 1);
        m109826d4(menuType != null ? menuType.intValue() : 1);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m109826d4(int menuType) {
        this.currentMenu = menuType;
        m109823b4(menuType);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m109827e4() {
        ((w3r) this.viewModel).m201387Q(m109824a4());
    }
}
