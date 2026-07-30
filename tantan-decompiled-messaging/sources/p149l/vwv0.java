package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class vwv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final vwv0 f183389a = new vwv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f183390b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f183391c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f183392d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f183393e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f183394f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f183390b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f183391c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f183392d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f183393e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f183394f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
