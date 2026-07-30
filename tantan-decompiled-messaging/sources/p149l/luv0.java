package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class luv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final luv0 f130094a = new luv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f130095b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f130096c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f130097d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f130098e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f130099f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f130100g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f130095b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("multipleObjectsEnabled");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f130096c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classificationEnabled");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f130097d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxPerObjectLabelCount");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f130098e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("classificationConfidenceThreshold");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f130099f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customLocalModelOptions");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f130100g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
