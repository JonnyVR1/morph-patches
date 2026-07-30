package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class e9t0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final e9t0 f90130a = new e9t0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f90131b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f90132c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f90133d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f90134e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f90131b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f90132c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f90133d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f90134e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
