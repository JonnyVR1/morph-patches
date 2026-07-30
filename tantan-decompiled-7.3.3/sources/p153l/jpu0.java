package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class jpu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final jpu0 f122135a = new jpu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f122136b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f122137c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f122138d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f122139e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f122140f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f122141g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxMs");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f122136b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("minMs");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f122137c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("avgMs");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f122138d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("firstQuartileMs");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f122139e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("medianMs");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f122140f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("thirdQuartileMs");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f122141g = builder6.withProperty(hlr0Var6.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
