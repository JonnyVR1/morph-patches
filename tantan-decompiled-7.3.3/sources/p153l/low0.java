package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class low0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final low0 f132954a = new low0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f132955b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f132956c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f132957d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f132958e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f132959f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f132960g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("pipelineNamespace");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f132955b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f132956c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("clientLibraryName");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f132957d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientLibraryVersion");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f132958e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("minClientLibraryVersion");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f132959f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("maxClientLibraryVersion");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f132960g = builder6.withProperty(hlr0Var6.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
