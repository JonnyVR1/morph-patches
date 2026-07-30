package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class cvs0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final cvs0 f82678a = new cvs0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f82679b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f82680c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f82681d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f82682e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f82683f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f82684g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f82685h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f82679b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f82680c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f82681d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f82682e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f82683f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("detectedBarcodeFormats");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f82684g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f82685h = builder7.withProperty(bcr0Var7.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
