package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ukw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ukw0 f176983a = new ukw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f176984b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f176985c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f176986d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f176987e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f176988f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f176989g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f176990h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f176991i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f176992j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f176993k;

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f176994l;

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f176995m;

    /* JADX INFO: renamed from: n */
    public static final FieldDescriptor f176996n;

    /* JADX INFO: renamed from: o */
    public static final FieldDescriptor f176997o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f176984b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f176985c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f176986d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f176987e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f176988f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f176989g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f176990h = builder7.withProperty(bcr0Var7.m101121b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        bcr0 bcr0Var8 = new bcr0();
        bcr0Var8.m101120a(8);
        f176991i = builder8.withProperty(bcr0Var8.m101121b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        bcr0 bcr0Var9 = new bcr0();
        bcr0Var9.m101120a(9);
        f176992j = builder9.withProperty(bcr0Var9.m101121b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        bcr0 bcr0Var10 = new bcr0();
        bcr0Var10.m101120a(10);
        f176993k = builder10.withProperty(bcr0Var10.m101121b()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        bcr0 bcr0Var11 = new bcr0();
        bcr0Var11.m101120a(11);
        f176994l = builder11.withProperty(bcr0Var11.m101121b()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        bcr0 bcr0Var12 = new bcr0();
        bcr0Var12.m101120a(12);
        f176995m = builder12.withProperty(bcr0Var12.m101121b()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        bcr0 bcr0Var13 = new bcr0();
        bcr0Var13.m101120a(13);
        f176996n = builder13.withProperty(bcr0Var13.m101121b()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        bcr0 bcr0Var14 = new bcr0();
        bcr0Var14.m101120a(14);
        f176997o = builder14.withProperty(bcr0Var14.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        kvx0 kvx0Var = (kvx0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f176984b, kvx0Var.m147402g());
        objectEncoderContext2.add(f176985c, kvx0Var.m147403h());
        objectEncoderContext2.add(f176986d, (Object) null);
        objectEncoderContext2.add(f176987e, kvx0Var.m147405j());
        objectEncoderContext2.add(f176988f, kvx0Var.m147406k());
        objectEncoderContext2.add(f176989g, (Object) null);
        objectEncoderContext2.add(f176990h, (Object) null);
        objectEncoderContext2.add(f176991i, kvx0Var.m147396a());
        objectEncoderContext2.add(f176992j, kvx0Var.m147404i());
        objectEncoderContext2.add(f176993k, kvx0Var.m147397b());
        objectEncoderContext2.add(f176994l, kvx0Var.m147399d());
        objectEncoderContext2.add(f176995m, kvx0Var.m147398c());
        objectEncoderContext2.add(f176996n, kvx0Var.m147400e());
        objectEncoderContext2.add(f176997o, kvx0Var.m147401f());
    }
}
