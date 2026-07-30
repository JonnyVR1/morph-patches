package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dgu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final dgu0 f86166a = new dgu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f86167b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f86168c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f86169d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f86170e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f86171f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f86172g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxMs");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f86167b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("minMs");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f86168c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("avgMs");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f86169d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("firstQuartileMs");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f86170e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("medianMs");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f86171f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("thirdQuartileMs");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f86172g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
