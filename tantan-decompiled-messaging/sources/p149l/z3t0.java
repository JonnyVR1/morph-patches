package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class z3t0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final z3t0 f201406a = new z3t0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f201407b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f201408c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f201409d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f201410e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f201407b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f201408c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f201409d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f201410e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
