package com.p046p1.mobile.putong.core.api;

import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4747m;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.IntlTribeBubble;
import com.p046p1.mobile.putong.core.data.TribeSubset;
import com.p046p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p046p1.mobile.putong.data.Envelope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.ia20;
import p149l.j6f;
import p149l.jo0;
import p149l.qib0;
import p149l.stc0;
import p149l.utc0;
import p149l.v9j;
import p149l.w9j;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t¢\u0006\u0004\b\u0010\u0010\fJ-\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RF\u0010*\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00060\u0006 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010)RF\u0010.\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010)R8\u00100\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00170\u0017 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&¨\u00063"}, m87232d2 = {"Lcom/p1/mobile/putong/core/api/m;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/core/data/VisitorDoorInfo;", "F3", "()Lcom/p1/mobile/putong/core/data/VisitorDoorInfo;", "Lrx/c;", "Lcom/p1/mobile/putong/data/Envelope;", "Y3", "()Lrx/c;", "S3", "", "Lcom/p1/mobile/putong/core/data/TribeSubset;", "L3", "", "stats", "groupCategory", "subType", "H3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlTribeBubble;", "A3", "Lrx/subjects/a;", "y3", "()Lrx/subjects/a;", "", "R", "Z", "E3", "()Z", "R3", "(Z)V", "showVisitorConversation", "kotlin.jvm.PlatformType", j6f.LATITUDE_SOUTH, "Lrx/subjects/a;", "G3", "setVisitorsDoorInfoBs", "(Lrx/subjects/a;)V", "visitorsDoorInfoBs", j6f.GPS_DIRECTION_TRUE, "z3", "setForceTribeTab", "forceTribeTab", "U", "intlTribeBubbleBs", "Companion", "a", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C4747m extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean showVisitorConversation;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public C22392a<VisitorDoorInfo> visitorsDoorInfoBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public C22392a<Boolean> forceTribeTab;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final C22392a<IntlTribeBubble> intlTribeBubbleBs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4747m(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.visitorsDoorInfoBs = C22392a.m221512b();
        this.forceTribeTab = C22392a.m221513c(Boolean.FALSE);
        this.intlTribeBubbleBs = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: B3 */
    public static final stc0 m34222B3(String str) {
        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: C3 */
    public static final IntlTribeBubble m34223C3(C4747m c4747m, Envelope envelope) {
        envelope.getClass();
        IntlTribeBubble intlTribeBubble = ((CoreData) envelope.getModuleData(CoreData.class)).intlBubble;
        c4747m.intlTribeBubbleBs.m132487l(intlTribeBubble);
        return intlTribeBubble;
    }

    /* JADX INFO: renamed from: D3 */
    public static final IntlTribeBubble m34224D3(Function1 function1, Object obj) {
        return (IntlTribeBubble) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I3 */
    public static final stc0 m34225I3(String str, JSONObject jSONObject) {
        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: J3 */
    public static final Envelope m34226J3(C4747m c4747m, Envelope envelope) {
        c4747m.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Envelope m34227K3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final stc0 m34228M3(String str) {
        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: N3 */
    public static final Envelope m34229N3(C4747m c4747m, Envelope envelope) {
        c4747m.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Envelope m34230O3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static final List m34231P3(Envelope envelope) {
        envelope.getClass();
        return ((CoreData) envelope.getModuleData(CoreData.class)).recommendList;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final List m34232Q3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static final stc0 m34233T3(Ref.ObjectRef objectRef) {
        return C4728a.f19494P.auth().m185898q((String) objectRef.element).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: U3 */
    public static final Envelope m34234U3(C4747m c4747m, Envelope envelope) {
        c4747m.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Envelope m34235V3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static final VisitorDoorInfo m34236W3(C4747m c4747m, Envelope envelope) {
        envelope.getClass();
        VisitorDoorInfo visitorDoorInfo = ((CoreData) envelope.getModuleData(CoreData.class)).visitorDoorInfo;
        c4747m.visitorsDoorInfoBs.m132487l(visitorDoorInfo);
        return visitorDoorInfo;
    }

    /* JADX INFO: renamed from: X3 */
    public static final VisitorDoorInfo m34237X3(Function1 function1, Object obj) {
        return (VisitorDoorInfo) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public static final stc0 m34238Z3(Ref.ObjectRef objectRef) {
        return C4728a.f19494P.auth().m185898q((String) objectRef.element).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: a3 */
    public static C22306c m34239a3(final String str, final C4747m c4747m) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135121e(new v9j() { // from class: l.b79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34222B3(str);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.c79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34223C3(this.f79600a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.d79
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34224D3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static final Envelope m34240a4(C4747m c4747m, Envelope envelope) {
        c4747m.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Envelope m34242b4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j3 */
    public static C22306c m34250j3(final String str, final C4747m c4747m) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.v69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34228M3(str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.w69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34229N3(this.f184817a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.x69
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34230O3(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.y69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34231P3((Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.z69
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34232Q3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static C22306c m34251k3(final String str, final JSONObject jSONObject, final C4747m c4747m) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.g79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34225I3(str, jSONObject);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.h79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34226J3(this.f106205a, (Envelope) obj);
            }
        };
        return c22306cM135121e.map(new w9j() { // from class: l.i79
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34227K3(function1, obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: u3 */
    public static C22306c m34261u3(final Ref.ObjectRef objectRef, final C4747m c4747m) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.k79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34233T3(objectRef);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.l79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34234U3(this.f126701a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.m79
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34235V3(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.n79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34236W3(this.f137490a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.o79
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34237X3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static C22306c m34264x3(final Ref.ObjectRef objectRef, final C4747m c4747m) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.p79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34238Z3(objectRef);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.q79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4747m.m34240a4(this.f153021a, (Envelope) obj);
            }
        };
        return c22306cM135121e.map(new w9j() { // from class: l.u69
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4747m.m34242b4(function1, obj);
            }
        }).observeOn(jo0.m142408a());
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public final C22306c<IntlTribeBubble> m34265A3() {
        final String strM31200G = C4728a.m31200G("/intl-recommend/tribe/bubble");
        C22306c<IntlTribeBubble> c22306cScheduled = scheduled(strM31200G, 0, new v9j() { // from class: l.a79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34239a3(strM31200G, this);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: E3, reason: from getter */
    public final boolean getShowVisitorConversation() {
        return this.showVisitorConversation;
    }

    @Nullable
    /* JADX INFO: renamed from: F3 */
    public final VisitorDoorInfo m34267F3() {
        if (this.visitorsDoorInfoBs.m221519i()) {
            return this.visitorsDoorInfoBs.m221515e();
        }
        return null;
    }

    /* JADX INFO: renamed from: G3 */
    public final C22392a<VisitorDoorInfo> m34268G3() {
        return this.visitorsDoorInfoBs;
    }

    @NotNull
    /* JADX INFO: renamed from: H3 */
    public final C22306c<Envelope> m34269H3(@NotNull String stats, @NotNull String groupCategory, @NotNull String subType) {
        stats.getClass();
        groupCategory.getClass();
        subType.getClass();
        final String strM31200G = C4728a.m31200G("/intl-recommend/tribe/circle");
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, stats);
            jSONObject.put("mcc", String.valueOf(qib0.f154717f0));
            jSONObject.put("groupCategory", groupCategory);
            jSONObject.put("subType", subType);
        } catch (Exception unused) {
        }
        C22306c<Envelope> c22306cScheduled = scheduled(strM31200G, -1, new v9j() { // from class: l.f79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34251k3(strM31200G, jSONObject, this);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: L3 */
    public final C22306c<List<TribeSubset>> m34270L3() {
        final String str = C4728a.m31200G("/intl-recommend/tribe/windows?mcc=") + qib0.f154717f0;
        C22306c<List<TribeSubset>> c22306cScheduled = scheduled(str, 0, new v9j() { // from class: l.j79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34250j3(str, this);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m34271R3(boolean z) {
        this.showVisitorConversation = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final C22306c<VisitorDoorInfo> m34272S3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = C4728a.m31200G("/visitor/door?premiumExist=") + xma.m210047L3() + "&mcc=" + qib0.f154717f0;
        objectRef.element = r1;
        C22306c<VisitorDoorInfo> c22306cScheduled = scheduled(r1, 0, new v9j() { // from class: l.t69
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34261u3(objectRef, this);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final C22306c<Envelope> m34273Y3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = C4728a.m31200G("/visitor/instant-match/show?premiumExist=") + xma.m210047L3() + "&mcc=" + qib0.f154717f0;
        objectRef.element = r1;
        C22306c<Envelope> c22306cScheduled = scheduled(r1, 0, new v9j() { // from class: l.e79
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4747m.m34264x3(objectRef, this);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final C22392a<IntlTribeBubble> m34274y3() {
        return this.intlTribeBubbleBs;
    }

    /* JADX INFO: renamed from: z3 */
    public final C22392a<Boolean> m34275z3() {
        return this.forceTribeTab;
    }
}
