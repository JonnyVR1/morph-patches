package com.p051p1.mobile.putong.core.api;

import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4898m;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.IntlTribeBubble;
import com.p051p1.mobile.putong.core.data.TribeSubset;
import com.p051p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p051p1.mobile.putong.data.Envelope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dy6;
import p153l.fo0;
import p153l.joa;
import p153l.p7f;
import p153l.pcj;
import p153l.qcj;
import p153l.qi20;
import p153l.uqb0;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t¢\u0006\u0004\b\u0010\u0010\fJ-\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RF\u0010*\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00060\u0006 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010)RF\u0010.\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010)R8\u00100\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00170\u0017 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&¨\u00063"}, m88121d2 = {"Lcom/p1/mobile/putong/core/api/m;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/core/data/VisitorDoorInfo;", "F3", "()Lcom/p1/mobile/putong/core/data/VisitorDoorInfo;", "Lrx/c;", "Lcom/p1/mobile/putong/data/Envelope;", "Y3", "()Lrx/c;", "S3", "", "Lcom/p1/mobile/putong/core/data/TribeSubset;", "L3", "", "stats", "groupCategory", "subType", "H3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlTribeBubble;", "A3", "Lrx/subjects/a;", "y3", "()Lrx/subjects/a;", "", "R", "Z", "E3", "()Z", "R3", "(Z)V", "showVisitorConversation", "kotlin.jvm.PlatformType", p7f.LATITUDE_SOUTH, "Lrx/subjects/a;", "G3", "setVisitorsDoorInfoBs", "(Lrx/subjects/a;)V", "visitorsDoorInfoBs", p7f.GPS_DIRECTION_TRUE, "z3", "setForceTribeTab", "forceTribeTab", "U", "intlTribeBubbleBs", "Companion", "a", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C4898m extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean showVisitorConversation;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public C22507a<VisitorDoorInfo> visitorsDoorInfoBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public C22507a<Boolean> forceTribeTab;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final C22507a<IntlTribeBubble> intlTribeBubbleBs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4898m(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        this.visitorsDoorInfoBs = C22507a.m222758b();
        this.forceTribeTab = C22507a.m222759c(Boolean.FALSE);
        this.intlTribeBubbleBs = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: B3 */
    public static final x1d0 m35225B3(String str) {
        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: C3 */
    public static final IntlTribeBubble m35226C3(C4898m c4898m, Envelope envelope) {
        envelope.getClass();
        IntlTribeBubble intlTribeBubble = ((CoreData) envelope.getModuleData(CoreData.class)).intlBubble;
        c4898m.intlTribeBubbleBs.m137019l(intlTribeBubble);
        return intlTribeBubble;
    }

    /* JADX INFO: renamed from: D3 */
    public static final IntlTribeBubble m35227D3(Function1 function1, Object obj) {
        return (IntlTribeBubble) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I3 */
    public static final x1d0 m35228I3(String str, JSONObject jSONObject) {
        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: J3 */
    public static final Envelope m35229J3(C4898m c4898m, Envelope envelope) {
        c4898m.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Envelope m35230K3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final x1d0 m35231M3(String str) {
        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: N3 */
    public static final Envelope m35232N3(C4898m c4898m, Envelope envelope) {
        c4898m.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Envelope m35233O3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static final List m35234P3(Envelope envelope) {
        envelope.getClass();
        return ((CoreData) envelope.getModuleData(CoreData.class)).recommendList;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final List m35235Q3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static final x1d0 m35236T3(Ref.ObjectRef objectRef) {
        return C4879a.f20236P.auth().m209043q((String) objectRef.element).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: U3 */
    public static final Envelope m35237U3(C4898m c4898m, Envelope envelope) {
        c4898m.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Envelope m35238V3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static final VisitorDoorInfo m35239W3(C4898m c4898m, Envelope envelope) {
        envelope.getClass();
        VisitorDoorInfo visitorDoorInfo = ((CoreData) envelope.getModuleData(CoreData.class)).visitorDoorInfo;
        c4898m.visitorsDoorInfoBs.m137019l(visitorDoorInfo);
        return visitorDoorInfo;
    }

    /* JADX INFO: renamed from: X3 */
    public static final VisitorDoorInfo m35240X3(Function1 function1, Object obj) {
        return (VisitorDoorInfo) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public static final x1d0 m35241Z3(Ref.ObjectRef objectRef) {
        return C4879a.f20236P.auth().m209043q((String) objectRef.element).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: a3 */
    public static C22421c m35242a3(final String str, final C4898m c4898m) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176658e(new pcj() { // from class: l.k89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35225B3(str);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.l89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35226C3(this.f130427a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.m89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35227D3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static final Envelope m35243a4(C4898m c4898m, Envelope envelope) {
        c4898m.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Envelope m35245b4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j3 */
    public static C22421c m35253j3(final String str, final C4898m c4898m) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.e89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35231M3(str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.f89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35232N3(this.f97706a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.g89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35233O3(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.h89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35234P3((Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.i89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35235Q3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static C22421c m35254k3(final String str, final JSONObject jSONObject, final C4898m c4898m) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.p89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35228I3(str, jSONObject);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.q89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35229J3(this.f156085a, (Envelope) obj);
            }
        };
        return c22421cM176658e.map(new qcj() { // from class: l.r89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35230K3(function1, obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: u3 */
    public static C22421c m35264u3(final Ref.ObjectRef objectRef, final C4898m c4898m) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.t89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35236T3(objectRef);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.u89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35237U3(this.f177994a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.v89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35238V3(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.w89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35239W3(this.f187834a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.x89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35240X3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static C22421c m35267x3(final Ref.ObjectRef objectRef, final C4898m c4898m) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.y89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35241Z3(objectRef);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.z89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4898m.m35243a4(this.f203327a, (Envelope) obj);
            }
        };
        return c22421cM176658e.map(new qcj() { // from class: l.d89
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4898m.m35245b4(function1, obj);
            }
        }).observeOn(fo0.m126432a());
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public final C22421c<IntlTribeBubble> m35268A3() {
        final String strM32203G = C4879a.m32203G("/intl-recommend/tribe/bubble");
        C22421c<IntlTribeBubble> c22421cScheduled = scheduled(strM32203G, 0, new pcj() { // from class: l.j89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35242a3(strM32203G, this);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: E3, reason: from getter */
    public final boolean getShowVisitorConversation() {
        return this.showVisitorConversation;
    }

    @Nullable
    /* JADX INFO: renamed from: F3 */
    public final VisitorDoorInfo m35270F3() {
        if (this.visitorsDoorInfoBs.m222765i()) {
            return this.visitorsDoorInfoBs.m222761e();
        }
        return null;
    }

    /* JADX INFO: renamed from: G3 */
    public final C22507a<VisitorDoorInfo> m35271G3() {
        return this.visitorsDoorInfoBs;
    }

    @NotNull
    /* JADX INFO: renamed from: H3 */
    public final C22421c<Envelope> m35272H3(@NotNull String stats, @NotNull String groupCategory, @NotNull String subType) {
        stats.getClass();
        groupCategory.getClass();
        subType.getClass();
        final String strM32203G = C4879a.m32203G("/intl-recommend/tribe/circle");
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, stats);
            jSONObject.put("mcc", String.valueOf(uqb0.f180400f0));
            jSONObject.put("groupCategory", groupCategory);
            jSONObject.put("subType", subType);
        } catch (Exception unused) {
        }
        C22421c<Envelope> c22421cScheduled = scheduled(strM32203G, -1, new pcj() { // from class: l.o89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35254k3(strM32203G, jSONObject, this);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: L3 */
    public final C22421c<List<TribeSubset>> m35273L3() {
        final String str = C4879a.m32203G("/intl-recommend/tribe/windows?mcc=") + uqb0.f180400f0;
        C22421c<List<TribeSubset>> c22421cScheduled = scheduled(str, 0, new pcj() { // from class: l.s89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35253j3(str, this);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m35274R3(boolean z) {
        this.showVisitorConversation = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final C22421c<VisitorDoorInfo> m35275S3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = C4879a.m32203G("/visitor/door?premiumExist=") + joa.m146361M3() + "&mcc=" + uqb0.f180400f0;
        objectRef.element = r1;
        C22421c<VisitorDoorInfo> c22421cScheduled = scheduled(r1, 0, new pcj() { // from class: l.c89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35264u3(objectRef, this);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final C22421c<Envelope> m35276Y3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = C4879a.m32203G("/visitor/instant-match/show?premiumExist=") + joa.m146361M3() + "&mcc=" + uqb0.f180400f0;
        objectRef.element = r1;
        C22421c<Envelope> c22421cScheduled = scheduled(r1, 0, new pcj() { // from class: l.n89
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4898m.m35267x3(objectRef, this);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final C22507a<IntlTribeBubble> m35277y3() {
        return this.intlTribeBubbleBs;
    }

    /* JADX INFO: renamed from: z3 */
    public final C22507a<Boolean> m35278z3() {
        return this.forceTribeTab;
    }
}
