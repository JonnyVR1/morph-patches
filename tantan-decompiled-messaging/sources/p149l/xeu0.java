package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.data.Device;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xeu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final xeu0 f192625a = new xeu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f192626b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f192627c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f192628d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f192629e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f192630f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f192631g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f192632h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f192633i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f192634j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f192635k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sdkVersion");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f192626b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f192627c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f192628d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder(Device.TYPE);
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f192629e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f192630f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f192631g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f192632h = builder7.withProperty(bcr0Var7.m101121b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        bcr0 bcr0Var8 = new bcr0();
        bcr0Var8.m101120a(8);
        f192633i = builder8.withProperty(bcr0Var8.m101121b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        bcr0 bcr0Var9 = new bcr0();
        bcr0Var9.m101120a(9);
        f192634j = builder9.withProperty(bcr0Var9.m101121b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        bcr0 bcr0Var10 = new bcr0();
        bcr0Var10.m101120a(10);
        f192635k = builder10.withProperty(bcr0Var10.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
