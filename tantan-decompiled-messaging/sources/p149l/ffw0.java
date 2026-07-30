package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ffw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ffw0 f97312a = new ffw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f97313b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f97314c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f97315d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f97316e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f97317f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f97318g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("pipelineNamespace");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f97313b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f97314c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("clientLibraryName");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f97315d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientLibraryVersion");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f97316e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("minClientLibraryVersion");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f97317f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("maxClientLibraryVersion");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f97318g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
