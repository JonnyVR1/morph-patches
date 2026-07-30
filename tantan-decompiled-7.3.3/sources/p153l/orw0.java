package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class orw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final orw0 f148763a = new orw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f148764b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f148765c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f148766d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f148767e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f148768f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f148764b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f148765c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f148766d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f148767e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f148768f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
