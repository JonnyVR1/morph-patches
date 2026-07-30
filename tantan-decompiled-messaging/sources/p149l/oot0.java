package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class oot0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final oot0 f144910a = new oot0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f144911b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f144912c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f144913d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f144914e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f144915f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f144916g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("cameraSource");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f144911b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f144912c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("requestedPreviewHeight");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f144913d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("requestedPreviewWidth");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f144914e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("actualPreviewHeight");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f144915f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("actualPreviewWidth");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f144916g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
