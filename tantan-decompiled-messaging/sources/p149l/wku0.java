package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wku0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final wku0 f186830a = new wku0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f186831b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f186832c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f186833d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f186834e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f186835f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f186836g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f186837h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("renderer");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f186831b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("vendor");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f186832c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(WBConstants.AUTH_PARAMS_VERSION);
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f186833d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxImages");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f186834e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("maxSsbo");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f186835f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("workGroupSizes");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f186836g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f186837h = builder7.withProperty(bcr0Var7.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
