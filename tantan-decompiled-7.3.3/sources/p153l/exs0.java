package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class exs0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final exs0 f96333a = new exs0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f96334b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f96335c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f96336d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f96337e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f96338f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f96339g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f96340h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f96334b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f96335c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f96336d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f96337e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f96338f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f96339g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f96340h = builder7.withProperty(hlr0Var7.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
