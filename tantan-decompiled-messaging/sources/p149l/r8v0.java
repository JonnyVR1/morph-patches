package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class r8v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final r8v0 f158258a = new r8v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f158259b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f158260c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f158261d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f158262e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f158259b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f158260c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f158261d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f158262e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
