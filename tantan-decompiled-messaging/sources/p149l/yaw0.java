package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yaw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final yaw0 f197261a = new yaw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f197262b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f197263c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f197264d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(3);
        f197262b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(4);
        f197263c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("sdkVersion");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(5);
        f197264d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
