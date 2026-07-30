package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class s6w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final s6w0 f162857a = new s6w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f162858b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f162859c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f162860d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f162861e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f162862f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f162858b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("smartReplies");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f162859c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("resultStatus");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f162860d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("suggestionsCount");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f162861e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("blacklistErrorCode");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f162862f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
