package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class cmv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final cmv0 f81615a = new cmv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f81616b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f81617c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f81618d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxLabels");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f81616b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("confidenceThreshold");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f81617c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("customLocalModelOptions");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f81618d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
