package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xqu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final xqu0 f194048a = new xqu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f194049b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f194050c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f194051d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f194052e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f194053f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f194054g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f194055h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f194049b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageSource");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f194050c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageFormat");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f194051d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageByteSize");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f194052e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageWidth");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f194053f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("imageHeight");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f194054g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("rotationDegrees");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f194055h = builder7.withProperty(bcr0Var7.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
