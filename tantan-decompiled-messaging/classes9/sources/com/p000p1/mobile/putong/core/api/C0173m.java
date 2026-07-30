package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0173m;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.IntlTribeBubble;
import com.p1.mobile.putong.core.data.TribeSubset;
import com.p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p1.mobile.putong.data.Envelope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import l.jo0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.qib0;
import p006l.xma;
import rx.c;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.m */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t¢\u0006\u0004\b\u0010\u0010\fJ-\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RF\u0010*\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00060\u0006 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010)RF\u0010.\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010)R8\u00100\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010\u00170\u0017 $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&¨\u00063"}, d2 = {"Lcom/p1/mobile/putong/core/api/m;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/core/data/VisitorDoorInfo;", "F3", "()Lcom/p1/mobile/putong/core/data/VisitorDoorInfo;", "Lrx/c;", "Lcom/p1/mobile/putong/data/Envelope;", "Y3", "()Lrx/c;", "S3", "", "Lcom/p1/mobile/putong/core/data/TribeSubset;", "L3", "", "stats", "groupCategory", "subType", "H3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/core/data/IntlTribeBubble;", "A3", "Lrx/subjects/a;", "y3", "()Lrx/subjects/a;", "", "R", "Z", "E3", "()Z", "R3", "(Z)V", "showVisitorConversation", "kotlin.jvm.PlatformType", "S", "Lrx/subjects/a;", "G3", "setVisitorsDoorInfoBs", "(Lrx/subjects/a;)V", "visitorsDoorInfoBs", "T", "z3", "setForceTribeTab", "forceTribeTab", "U", "intlTribeBubbleBs", "Companion", "a", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0173m extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean showVisitorConversation;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public a<VisitorDoorInfo> visitorsDoorInfoBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public a<Boolean> forceTribeTab;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final a<IntlTribeBubble> intlTribeBubbleBs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173m(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        this.visitorsDoorInfoBs = a.b();
        this.forceTribeTab = a.c(Boolean.FALSE);
        this.intlTribeBubbleBs = a.b();
    }

    /* JADX INFO: renamed from: B3 */
    public static final stc0 m6159B3(String str) {
        return C0154a.f3483P.auth().q(str).f().b();
    }

    /* JADX INFO: renamed from: C3 */
    public static final IntlTribeBubble m6160C3(C0173m c0173m, Envelope envelope) {
        envelope.getClass();
        IntlTribeBubble intlTribeBubble = envelope.getModuleData(CoreData.class).intlBubble;
        c0173m.intlTribeBubbleBs.onNext(intlTribeBubble);
        return intlTribeBubble;
    }

    /* JADX INFO: renamed from: D3 */
    public static final IntlTribeBubble m6161D3(Function1 function1, Object obj) {
        return (IntlTribeBubble) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I3 */
    public static final stc0 m6162I3(String str, JSONObject jSONObject) {
        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: J3 */
    public static final Envelope m6163J3(C0173m c0173m, Envelope envelope) {
        c0173m.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Envelope m6164K3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final stc0 m6165M3(String str) {
        return C0154a.f3483P.auth().q(str).f().b();
    }

    /* JADX INFO: renamed from: N3 */
    public static final Envelope m6166N3(C0173m c0173m, Envelope envelope) {
        c0173m.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Envelope m6167O3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static final List m6168P3(Envelope envelope) {
        envelope.getClass();
        return envelope.getModuleData(CoreData.class).recommendList;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final List m6169Q3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static final stc0 m6170T3(Ref.ObjectRef objectRef) {
        return C0154a.f3483P.auth().q((String) objectRef.element).f().b();
    }

    /* JADX INFO: renamed from: U3 */
    public static final Envelope m6171U3(C0173m c0173m, Envelope envelope) {
        c0173m.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Envelope m6172V3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static final VisitorDoorInfo m6173W3(C0173m c0173m, Envelope envelope) {
        envelope.getClass();
        VisitorDoorInfo visitorDoorInfo = envelope.getModuleData(CoreData.class).visitorDoorInfo;
        c0173m.visitorsDoorInfoBs.onNext(visitorDoorInfo);
        return visitorDoorInfo;
    }

    /* JADX INFO: renamed from: X3 */
    public static final VisitorDoorInfo m6174X3(Function1 function1, Object obj) {
        return (VisitorDoorInfo) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final stc0 m6175Z3(Ref.ObjectRef objectRef) {
        return C0154a.f3483P.auth().q((String) objectRef.element).f().b();
    }

    /* JADX INFO: renamed from: a3 */
    public static c m6176a3(final String str, final C0173m c0173m) {
        c cVarObserveOn = ia20.m16571e(new v9j() { // from class: l.b79
            public final Object call() {
                return C0173m.m6159B3(str);
            }
        }).observeOn(jo0.a());
        final Function1 function1 = new Function1() { // from class: l.c79
            public final Object invoke(Object obj) {
                return C0173m.m6160C3(this.f9472a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.d79
            public final Object call(Object obj) {
                return C0173m.m6161D3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static final Envelope m6177a4(C0173m c0173m, Envelope envelope) {
        c0173m.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Envelope m6179b4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j3 */
    public static c m6187j3(final String str, final C0173m c0173m) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.v69
            public final Object call() {
                return C0173m.m6165M3(str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.w69
            public final Object invoke(Object obj) {
                return C0173m.m6166N3(this.f25002a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.x69
            public final Object call(Object obj) {
                return C0173m.m6167O3(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.y69
            public final Object invoke(Object obj) {
                return C0173m.m6168P3((Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.z69
            public final Object call(Object obj) {
                return C0173m.m6169Q3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static c m6188k3(final String str, final JSONObject jSONObject, final C0173m c0173m) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.g79
            public final Object call() {
                return C0173m.m6162I3(str, jSONObject);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.h79
            public final Object invoke(Object obj) {
                return C0173m.m6163J3(this.f13729a, (Envelope) obj);
            }
        };
        return cVarM16571e.map(new w9j() { // from class: l.i79
            public final Object call(Object obj) {
                return C0173m.m6164K3(function1, obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: u3 */
    public static c m6198u3(final Ref.ObjectRef objectRef, final C0173m c0173m) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.k79
            public final Object call() {
                return C0173m.m6170T3(objectRef);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.l79
            public final Object invoke(Object obj) {
                return C0173m.m6171U3(this.f16252a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.m79
            public final Object call(Object obj) {
                return C0173m.m6172V3(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.n79
            public final Object invoke(Object obj) {
                return C0173m.m6173W3(this.f17522a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.o79
            public final Object call(Object obj) {
                return C0173m.m6174X3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static c m6201x3(final Ref.ObjectRef objectRef, final C0173m c0173m) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.p79
            public final Object call() {
                return C0173m.m6175Z3(objectRef);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.q79
            public final Object invoke(Object obj) {
                return C0173m.m6177a4(this.f19655a, (Envelope) obj);
            }
        };
        return cVarM16571e.map(new w9j() { // from class: l.u69
            public final Object call(Object obj) {
                return C0173m.m6179b4(function1, obj);
            }
        }).observeOn(jo0.a());
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public final c<IntlTribeBubble> m6202A3() {
        final String strM3130G = C0154a.m3130G("/intl-recommend/tribe/bubble");
        c<IntlTribeBubble> cVarScheduled = scheduled(strM3130G, 0, new v9j() { // from class: l.a79
            public final Object call() {
                return C0173m.m6176a3(strM3130G, this);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: E3, reason: from getter */
    public final boolean getShowVisitorConversation() {
        return this.showVisitorConversation;
    }

    @Nullable
    /* JADX INFO: renamed from: F3 */
    public final VisitorDoorInfo m6204F3() {
        if (this.visitorsDoorInfoBs.i()) {
            return (VisitorDoorInfo) this.visitorsDoorInfoBs.e();
        }
        return null;
    }

    /* JADX INFO: renamed from: G3 */
    public final a<VisitorDoorInfo> m6205G3() {
        return this.visitorsDoorInfoBs;
    }

    @NotNull
    /* JADX INFO: renamed from: H3 */
    public final c<Envelope> m6206H3(@NotNull String stats, @NotNull String groupCategory, @NotNull String subType) {
        stats.getClass();
        groupCategory.getClass();
        subType.getClass();
        final String strM3130G = C0154a.m3130G("/intl-recommend/tribe/circle");
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", stats);
            jSONObject.put("mcc", String.valueOf(qib0.f19808f0));
            jSONObject.put("groupCategory", groupCategory);
            jSONObject.put("subType", subType);
        } catch (Exception unused) {
        }
        c<Envelope> cVarScheduled = scheduled(strM3130G, -1, new v9j() { // from class: l.f79
            public final Object call() {
                return C0173m.m6188k3(strM3130G, jSONObject, this);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: L3 */
    public final c<List<TribeSubset>> m6207L3() {
        final String str = C0154a.m3130G("/intl-recommend/tribe/windows?mcc=") + qib0.f19808f0;
        c<List<TribeSubset>> cVarScheduled = scheduled(str, 0, new v9j() { // from class: l.j79
            public final Object call() {
                return C0173m.m6187j3(str, this);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m6208R3(boolean z) {
        this.showVisitorConversation = z;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final c<VisitorDoorInfo> m6209S3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String str = C0154a.m3130G("/visitor/door?premiumExist=") + xma.m27355L3() + "&mcc=" + qib0.f19808f0;
        objectRef.element = str;
        c<VisitorDoorInfo> cVarScheduled = scheduled(str, 0, new v9j() { // from class: l.t69
            public final Object call() {
                return C0173m.m6198u3(objectRef, this);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final c<Envelope> m6210Y3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String str = C0154a.m3130G("/visitor/instant-match/show?premiumExist=") + xma.m27355L3() + "&mcc=" + qib0.f19808f0;
        objectRef.element = str;
        c<Envelope> cVarScheduled = scheduled(str, 0, new v9j() { // from class: l.e79
            public final Object call() {
                return C0173m.m6201x3(objectRef, this);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: y3 */
    public final a<IntlTribeBubble> m6211y3() {
        return this.intlTribeBubbleBs;
    }

    /* JADX INFO: renamed from: z3 */
    public final a<Boolean> m6212z3() {
        return this.forceTribeTab;
    }
}
