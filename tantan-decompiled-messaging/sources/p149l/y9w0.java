package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class y9w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final y9w0 f196997a = new y9w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f196998b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f196999c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f197000d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f196998b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f196999c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("recognizerOptions");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f197000d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
