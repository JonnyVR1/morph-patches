package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class emu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final emu0 f92251a = new emu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f92252b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f92253c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f92254d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f92255e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f92252b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f92253c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f92254d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f92255e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
