package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class d6u0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final d6u0 f84666a = new d6u0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f84667b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f84668c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f84669d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f84670e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("supportedFormats");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f84667b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f84668c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f84669d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("allowManualInput");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f84670e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
