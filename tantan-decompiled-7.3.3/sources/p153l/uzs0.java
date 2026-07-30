package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class uzs0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final uzs0 f181806a = new uzs0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f181807b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f181808c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f181809d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f181810e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f181807b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f181808c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f181809d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder(Options.TYPE);
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f181810e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
