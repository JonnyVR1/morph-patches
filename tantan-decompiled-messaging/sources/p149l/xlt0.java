package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xlt0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final xlt0 f193497a = new xlt0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f193498b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f193499c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f193500d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f193501e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f193498b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f193499c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("eventType");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f193500d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f193501e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
