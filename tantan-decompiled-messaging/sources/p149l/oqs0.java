package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class oqs0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final oqs0 f145187a = new oqs0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f145188b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f145189c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f145190d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f145191e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f145188b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f145189c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f145190d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f145191e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
