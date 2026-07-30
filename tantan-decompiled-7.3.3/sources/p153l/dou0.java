package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.data.Device;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dou0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final dou0 f90003a = new dou0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f90004b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f90005c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f90006d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f90007e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f90008f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f90009g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f90010h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f90011i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f90012j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f90013k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sdkVersion");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f90004b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f90005c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f90006d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder(Device.TYPE);
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f90007e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f90008f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f90009g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f90010h = builder7.withProperty(hlr0Var7.m135771b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        hlr0 hlr0Var8 = new hlr0();
        hlr0Var8.m135770a(8);
        f90011i = builder8.withProperty(hlr0Var8.m135771b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        hlr0 hlr0Var9 = new hlr0();
        hlr0Var9.m135770a(9);
        f90012j = builder9.withProperty(hlr0Var9.m135771b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        hlr0 hlr0Var10 = new hlr0();
        hlr0Var10.m135770a(10);
        f90013k = builder10.withProperty(hlr0Var10.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
