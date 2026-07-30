package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class inu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final inu0 f114049a = new inu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f114050b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f114051c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f114052d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f114050b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f114051c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f114052d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
