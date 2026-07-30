package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class czv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final czv0 f83115a = new czv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f83116b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f83117c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f83118d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f83119e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f83120f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f83116b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("personDetectionMode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f83117c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("landmarkDetectionMode");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f83118d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("preferredHardwareConfigs");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f83119e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("runConfig");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f83120f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
