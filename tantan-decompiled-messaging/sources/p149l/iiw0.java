package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class iiw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final iiw0 f113446a = new iiw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f113447b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f113448c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f113449d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f113450e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f113451f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f113447b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f113448c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f113449d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f113450e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f113451f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
