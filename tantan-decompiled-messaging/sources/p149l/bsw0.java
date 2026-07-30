package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class bsw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final bsw0 f77129a = new bsw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f77130b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f77131c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f77132d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("numSamples");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f77130b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f77131c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("metricResults");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f77132d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
