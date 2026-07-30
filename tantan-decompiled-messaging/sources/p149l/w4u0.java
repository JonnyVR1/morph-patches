package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class w4u0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final w4u0 f184605a = new w4u0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f184606b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f184607c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f184608d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f184609e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("callingSource");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f184606b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("supportedFormats");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f184607c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f184608d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f184609e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
