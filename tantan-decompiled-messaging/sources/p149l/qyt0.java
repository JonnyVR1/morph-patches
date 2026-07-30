package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qyt0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final qyt0 f156962a = new qyt0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f156963b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f156964c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f156965d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f156963b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f156964c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f156965d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
