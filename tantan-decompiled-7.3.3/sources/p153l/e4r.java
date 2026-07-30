package p153l;

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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, m88121d2 = {"Ll/e4r;", "Ll/y8s;", "Ll/rwn0;", "Ll/x5r;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "state", "", "b4", "(I)V", "R3", "()V", p7f.GPS_DIRECTION_TRUE, "menuType", "d4", "", "Ll/v3r;", "a4", "()Ljava/util/List;", "e4", "c4", "(Ljava/lang/Integer;)V", "j", "I", "getCurrentMenu$annotations", "currentMenu", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class e4r extends y8s<rwn0, x5r> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentMenu;

    public e4r(@Nullable dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        mo52715C(new x5r(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m119459S3(int i, uwl uwlVar) {
        if (uwlVar instanceof g3r) {
            g3r g3rVar = (g3r) uwlVar;
            if (g3rVar.mo123781T3() == i) {
                g3rVar.mo123782U3();
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m119460T3(ArrayList arrayList, uwl uwlVar) {
        if (uwlVar instanceof g3r) {
            arrayList.add(((g3r) uwlVar).mo123780S3());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static int m119461U3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: V3 */
    public static void m119462V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static int m119463W3(v3r v3rVar, v3r v3rVar2) {
        v3rVar.getClass();
        v3rVar2.getClass();
        return v3rVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - v3rVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
    }

    /* JADX INFO: renamed from: X3 */
    public static Unit m119464X3(e4r e4rVar, vxj0 vxj0Var) {
        ((x5r) e4rVar.viewModel).mo73021p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m119465Y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static Unit m119466Z3(e4r e4rVar, Integer num) {
        e4rVar.m119469c4(num);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    private final void m119467b4(final int state) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.a4r
            @Override // p153l.y20
            public final void call(Object obj) {
                e4r.m119459S3(state, (uwl) obj);
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        dum<? extends T> dumVar = this.f196918e;
        m153103z2(new t3r(dumVar, new i3r(dumVar.f90815a)));
        dum<? extends T> dumVar2 = this.f196918e;
        m153103z2(new f3r(dumVar2, new y2r(dumVar2.f90815a), this));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<T> c22421cDuringCreated = duringCreated(m213811F2().KtvDialogEvent.closeKtvDialog().m199270g());
        final Function1 function1 = new Function1() { // from class: l.w3r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e4r.m119464X3(this.f187164a, (vxj0) obj);
            }
        };
        c22421cDuringCreated.subscribe(new y20() { // from class: l.x3r
            @Override // p153l.y20
            public final void call(Object obj) {
                e4r.m119465Y3(function1, obj);
            }
        });
        C22421c<T> c22421cDuringCreated2 = duringCreated(m213811F2().KtvDialogEvent.showKtvDialog().m199270g());
        final Function1 function2 = new Function1() { // from class: l.y3r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e4r.m119466Z3(this.f197385a, (Integer) obj);
            }
        };
        c22421cDuringCreated2.subscribe(new y20() { // from class: l.z3r
            @Override // p153l.y20
            public final void call(Object obj) {
                e4r.m119462V3(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final List<v3r> m119468a4() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.b4r
            @Override // p153l.y20
            public final void call(Object obj) {
                e4r.m119460T3(arrayList, (uwl) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.c4r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(e4r.m119463W3((v3r) obj, (v3r) obj2));
            }
        };
        jyb.m147478I(arrayList, new Comparator() { // from class: l.d4r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e4r.m119461U3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m119469c4(Integer menuType) {
        ((x5r) this.viewModel).m209426P(menuType != null ? menuType.intValue() : 1);
        m119470d4(menuType != null ? menuType.intValue() : 1);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m119470d4(int menuType) {
        this.currentMenu = menuType;
        m119467b4(menuType);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m119471e4() {
        ((x5r) this.viewModel).m209427Q(m119468a4());
    }
}
