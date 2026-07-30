package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class miu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final miu0 f134037a = new miu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f134038b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f134039c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f134040d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f134041e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f134042f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f134043g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("landmarkMode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f134038b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationMode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f134039c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("performanceMode");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f134040d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("contourMode");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f134041e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isTrackingEnabled");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f134042f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f134043g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
