package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class oou0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final oou0 f144917a = new oou0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f144918b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f144919c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f144920d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f144921e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f144922f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f144923g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f144924h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f144925i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f144926j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f144927k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f144918b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f144919c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f144920d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("autoManageModelOnBackground");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f144921e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("autoManageModelOnLowMemory");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f144922f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("isNnApiEnabled");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f144923g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("eventsCount");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f144924h = builder7.withProperty(bcr0Var7.m101121b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("otherErrors");
        bcr0 bcr0Var8 = new bcr0();
        bcr0Var8.m101120a(8);
        f144925i = builder8.withProperty(bcr0Var8.m101121b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("remoteConfigValueForAcceleration");
        bcr0 bcr0Var9 = new bcr0();
        bcr0Var9.m101120a(9);
        f144926j = builder9.withProperty(bcr0Var9.m101121b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isAccelerated");
        bcr0 bcr0Var10 = new bcr0();
        bcr0Var10.m101120a(10);
        f144927k = builder10.withProperty(bcr0Var10.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        hix0 hix0Var = (hix0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f144918b, hix0Var.m131313c());
        objectEncoderContext2.add(f144919c, hix0Var.m131311a());
        objectEncoderContext2.add(f144920d, hix0Var.m131312b());
        objectEncoderContext2.add(f144921e, (Object) null);
        objectEncoderContext2.add(f144922f, (Object) null);
        objectEncoderContext2.add(f144923g, (Object) null);
        objectEncoderContext2.add(f144924h, (Object) null);
        objectEncoderContext2.add(f144925i, (Object) null);
        objectEncoderContext2.add(f144926j, (Object) null);
        objectEncoderContext2.add(f144927k, (Object) null);
    }
}
