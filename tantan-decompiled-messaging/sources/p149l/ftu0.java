package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ftu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ftu0 f99266a = new ftu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f99267b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f99268c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f99269d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f99267b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isDownloaded");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f99268c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f99269d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
