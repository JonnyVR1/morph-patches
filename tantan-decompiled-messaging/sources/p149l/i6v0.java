package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class i6v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final i6v0 f111783a = new i6v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f111784b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f111785c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f111786d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f111787e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f111784b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("type");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f111785c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(WBConstants.AUTH_PARAMS_VERSION);
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f111786d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("featureLevel");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f111787e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
