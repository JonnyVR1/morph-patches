package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class lcu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final lcu0 f127470a = new lcu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f127471b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f127472c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f127473d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f127474e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f127475f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f127471b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f127472c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f127473d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f127474e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isNnApiEnabled");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f127475f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
