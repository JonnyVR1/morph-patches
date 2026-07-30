package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class cuu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final cuu0 f83901a = new cuu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f83902b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f83903c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f83904d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f83905e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f83906f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f83907g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f83908h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("renderer");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f83902b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("vendor");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f83903c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(WBConstants.AUTH_PARAMS_VERSION);
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f83904d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxImages");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f83905e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("maxSsbo");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f83906f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("workGroupSizes");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f83907g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f83908h = builder7.withProperty(hlr0Var7.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
