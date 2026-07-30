package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class x9v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final x9v0 f191657a = new x9v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f191658b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f191659c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f191660d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f191661e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f191662f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f191658b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f191659c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectedBarcodeFormats");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f191660d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f191661e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f191662f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
