package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ceu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ceu0 f81416a = new ceu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f81417b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f81418c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f81419d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f81420e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("callingSource");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f81417b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("supportedFormats");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f81418c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f81419d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f81420e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
