package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class o9v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final o9v0 f145636a = new o9v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f145637b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f145638c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f145639d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f145640e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f145641f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f145642g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f145643h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f145644i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f145645j;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f145637b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(WBConstants.AUTH_PARAMS_VERSION);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f145638c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f145639d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f145640e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f145641f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f145642g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f145643h = builder7.withProperty(hlr0Var7.m135771b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        hlr0 hlr0Var8 = new hlr0();
        hlr0Var8.m135770a(8);
        f145644i = builder8.withProperty(hlr0Var8.m135771b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        hlr0 hlr0Var9 = new hlr0();
        hlr0Var9.m135770a(9);
        f145645j = builder9.withProperty(hlr0Var9.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
