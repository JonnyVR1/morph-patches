package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class o1v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final o1v0 f141479a = new o1v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f141480b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f141481c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f141482d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f141483e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f141480b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f141481c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f141482d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f141483e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
