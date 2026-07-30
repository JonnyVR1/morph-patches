package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class cuv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final cuv0 f83910a = new cuv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f83911b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f83912c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f83913d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f83914e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f83915f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f83911b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCodes");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f83912c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f83913d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f83914e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f83915f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
