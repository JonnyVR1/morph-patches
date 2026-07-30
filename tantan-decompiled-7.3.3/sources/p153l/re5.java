package p153l;

import android.content.Context;
import android.location.Location;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.utils.sensors.MotionDetector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class re5 {

    /* JADX INFO: renamed from: f */
    private static final String f162390f = riw.m181611a(new byte[]{85, 30, 82, 82, 17, 18, 111, 3, 67, 69, 14, 20});

    /* JADX INFO: renamed from: g */
    private static final String f162391g = riw.m181611a(new byte[]{6, 80, 7, 1});

    /* JADX INFO: renamed from: a */
    vmw f162392a;

    /* JADX INFO: renamed from: b */
    Context f162393b;

    /* JADX INFO: renamed from: c */
    private final ag60 f162394c;

    /* JADX INFO: renamed from: d */
    private bqe0 f162395d;

    /* JADX INFO: renamed from: e */
    private MotionDetector f162396e;

    public re5(Context context, vmw vmwVar, ag60 ag60Var) {
        this.f162392a = vmwVar;
        this.f162393b = context;
        this.f162394c = ag60Var;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m180966d(String str) {
        return str.equalsIgnoreCase(riw.m181611a(new byte[]{92, 7, 68, 89, 2, 14}));
    }

    /* JADX INFO: renamed from: a */
    public void m180967a() {
        try {
            this.f162392a.m201824m(ul20.m196533g(this.f162393b, false));
        } catch (Exception unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x00d4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: b */
    public void m180968b(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.re5.m180968b(java.lang.String):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public void m180969c() {
        try {
            this.f162392a.m201814h(o0e.m165456i());
        } catch (Exception unused) {
            this.f162392a.m201814h(f162390f);
        }
        try {
            this.f162392a.m201830p(a2m.m95714a(this.f162393b));
        } catch (Exception unused2) {
            this.f162392a.m201830p(f162390f);
        }
        try {
            this.f162392a.m201788N(o0e.m165470w(this.f162393b));
        } catch (Exception unused3) {
            this.f162392a.m201788N(f162390f);
        }
        try {
            this.f162392a.m201839t0(ul20.m196533g(xiw.m211170a(), true));
        } catch (Exception unused4) {
        }
        try {
            this.f162392a.m201841u0(ul20.m196534h(xiw.m211170a()));
        } catch (Exception unused5) {
        }
        try {
            this.f162392a.m201822l(ul20.m196528b(xiw.m211170a()));
        } catch (Exception unused6) {
        }
        try {
            this.f162392a.m201782H(o0e.m165467t(xiw.m211170a()));
        } catch (Exception unused7) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Location locationM113250a = cyv.m113250a();
            if (locationM113250a == null) {
                jSONObject.put(riw.m181611a(new byte[]{92, 7, 69}), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObject.put(riw.m181611a(new byte[]{92, 9, 95}), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObject.put(riw.m181611a(new byte[]{93, 9, 82, 92, 45, 9, 83, 7, 69, 94, 14, 8}), 0);
            } else {
                jSONObject.put(riw.m181611a(new byte[]{92, 7, 69}), locationM113250a.getLatitude());
                jSONObject.put(riw.m181611a(new byte[]{92, 9, 95}), locationM113250a.getLongitude());
                jSONObject.put(riw.m181611a(new byte[]{93, 9, 82, 92, 45, 9, 83, 7, 69, 94, 14, 8}), locationM113250a.isFromMockProvider() ? 1 : 0);
            }
            this.f162392a.m201786L(jSONObject);
        } catch (Exception unused8) {
        }
        try {
            this.f162392a.m201800Z(tj70.m191409d(xiw.m211170a()));
        } catch (Exception unused9) {
        }
        try {
            this.f162392a.m201815h0(hnf0.m136092c(xiw.m211170a()));
        } catch (Exception unused10) {
        }
    }
}
