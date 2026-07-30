package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yfv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final yfv0 f198095a = new yfv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f198096b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f198097c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f198098d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f198099e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f198100f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f198101g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f198096b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f198097c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f198098d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f198099e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f198100f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f198101g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
