package p149l;

import android.content.Context;
import android.location.Location;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.utils.sensors.MotionDetector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class rd5 {

    /* JADX INFO: renamed from: f */
    private static final String f158863f = sgw.m184137a(new byte[]{85, 30, 82, 82, 17, 18, 111, 3, 67, 69, 14, 20});

    /* JADX INFO: renamed from: g */
    private static final String f158864g = sgw.m184137a(new byte[]{6, 80, 7, 1});

    /* JADX INFO: renamed from: a */
    wjw f158865a;

    /* JADX INFO: renamed from: b */
    Context f158866b;

    /* JADX INFO: renamed from: c */
    private final u760 f158867c;

    /* JADX INFO: renamed from: d */
    private whe0 f158868d;

    /* JADX INFO: renamed from: e */
    private MotionDetector f158869e;

    public rd5(Context context, wjw wjwVar, u760 u760Var) {
        this.f158865a = wjwVar;
        this.f158866b = context;
        this.f158867c = u760Var;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m178859d(String str) {
        return str.equalsIgnoreCase(sgw.m184137a(new byte[]{92, 7, 68, 89, 2, 14}));
    }

    /* JADX INFO: renamed from: a */
    public void m178860a() {
        try {
            this.f158865a.m203549m(kd20.m145620g(this.f158866b, false));
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
    public void m178861b(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.rd5.m178861b(java.lang.String):void");
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
    public void m178862c() {
        try {
            this.f158865a.m203539h(bzd.m104593i());
        } catch (Exception unused) {
            this.f158865a.m203539h(f158863f);
        }
        try {
            this.f158865a.m203555p(fzl.m123867a(this.f158866b));
        } catch (Exception unused2) {
            this.f158865a.m203555p(f158863f);
        }
        try {
            this.f158865a.m203513N(bzd.m104607w(this.f158866b));
        } catch (Exception unused3) {
            this.f158865a.m203513N(f158863f);
        }
        try {
            this.f158865a.m203564t0(kd20.m145620g(ygw.m214775a(), true));
        } catch (Exception unused4) {
        }
        try {
            this.f158865a.m203566u0(kd20.m145621h(ygw.m214775a()));
        } catch (Exception unused5) {
        }
        try {
            this.f158865a.m203547l(kd20.m145615b(ygw.m214775a()));
        } catch (Exception unused6) {
        }
        try {
            this.f158865a.m203507H(bzd.m104604t(ygw.m214775a()));
        } catch (Exception unused7) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Location locationM104253a = bwv.m104253a();
            if (locationM104253a == null) {
                jSONObject.put(sgw.m184137a(new byte[]{92, 7, 69}), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObject.put(sgw.m184137a(new byte[]{92, 9, 95}), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObject.put(sgw.m184137a(new byte[]{93, 9, 82, 92, 45, 9, 83, 7, 69, 94, 14, 8}), 0);
            } else {
                jSONObject.put(sgw.m184137a(new byte[]{92, 7, 69}), locationM104253a.getLatitude());
                jSONObject.put(sgw.m184137a(new byte[]{92, 9, 95}), locationM104253a.getLongitude());
                jSONObject.put(sgw.m184137a(new byte[]{93, 9, 82, 92, 45, 9, 83, 7, 69, 94, 14, 8}), locationM104253a.isFromMockProvider() ? 1 : 0);
            }
            this.f158865a.m203511L(jSONObject);
        } catch (Exception unused8) {
        }
        try {
            this.f158865a.m203525Z(nb70.m158762d(ygw.m214775a()));
        } catch (Exception unused9) {
        }
        try {
            this.f158865a.m203540h0(aff0.m96216c(ygw.m214775a()));
        } catch (Exception unused10) {
        }
    }
}
