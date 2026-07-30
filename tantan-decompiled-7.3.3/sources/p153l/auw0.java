package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class auw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final auw0 f73556a = new auw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f73557b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f73558c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f73559d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f73560e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f73561f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f73562g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f73563h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f73564i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f73565j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f73566k;

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f73567l;

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f73568m;

    /* JADX INFO: renamed from: n */
    public static final FieldDescriptor f73569n;

    /* JADX INFO: renamed from: o */
    public static final FieldDescriptor f73570o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f73557b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f73558c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f73559d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f73560e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f73561f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f73562g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f73563h = builder7.withProperty(hlr0Var7.m135771b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        hlr0 hlr0Var8 = new hlr0();
        hlr0Var8.m135770a(8);
        f73564i = builder8.withProperty(hlr0Var8.m135771b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        hlr0 hlr0Var9 = new hlr0();
        hlr0Var9.m135770a(9);
        f73565j = builder9.withProperty(hlr0Var9.m135771b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        hlr0 hlr0Var10 = new hlr0();
        hlr0Var10.m135770a(10);
        f73566k = builder10.withProperty(hlr0Var10.m135771b()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        hlr0 hlr0Var11 = new hlr0();
        hlr0Var11.m135770a(11);
        f73567l = builder11.withProperty(hlr0Var11.m135771b()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        hlr0 hlr0Var12 = new hlr0();
        hlr0Var12.m135770a(12);
        f73568m = builder12.withProperty(hlr0Var12.m135771b()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        hlr0 hlr0Var13 = new hlr0();
        hlr0Var13.m135770a(13);
        f73569n = builder13.withProperty(hlr0Var13.m135771b()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        hlr0 hlr0Var14 = new hlr0();
        hlr0Var14.m135770a(14);
        f73570o = builder14.withProperty(hlr0Var14.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        q4y0 q4y0Var = (q4y0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f73557b, q4y0Var.m175271g());
        objectEncoderContext2.add(f73558c, q4y0Var.m175272h());
        objectEncoderContext2.add(f73559d, (Object) null);
        objectEncoderContext2.add(f73560e, q4y0Var.m175274j());
        objectEncoderContext2.add(f73561f, q4y0Var.m175275k());
        objectEncoderContext2.add(f73562g, (Object) null);
        objectEncoderContext2.add(f73563h, (Object) null);
        objectEncoderContext2.add(f73564i, q4y0Var.m175265a());
        objectEncoderContext2.add(f73565j, q4y0Var.m175273i());
        objectEncoderContext2.add(f73566k, q4y0Var.m175266b());
        objectEncoderContext2.add(f73567l, q4y0Var.m175268d());
        objectEncoderContext2.add(f73568m, q4y0Var.m175267c());
        objectEncoderContext2.add(f73569n, q4y0Var.m175269e());
        objectEncoderContext2.add(f73570o, q4y0Var.m175270f());
    }
}
