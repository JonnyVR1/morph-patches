package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class i0v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final i0v0 f110385a = new i0v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f110386b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f110387c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f110388d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f110389e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f110390f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f110391g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f110392h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f110393i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f110394j;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f110386b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(WBConstants.AUTH_PARAMS_VERSION);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f110387c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f110388d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f110389e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f110390f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f110391g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f110392h = builder7.withProperty(bcr0Var7.m101121b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        bcr0 bcr0Var8 = new bcr0();
        bcr0Var8.m101120a(8);
        f110393i = builder8.withProperty(bcr0Var8.m101121b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        bcr0 bcr0Var9 = new bcr0();
        bcr0Var9.m101120a(9);
        f110394j = builder9.withProperty(bcr0Var9.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
