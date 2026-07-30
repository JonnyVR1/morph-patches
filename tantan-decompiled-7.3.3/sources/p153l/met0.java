package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class met0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final met0 f136564a = new met0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f136565b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f136566c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f136567d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f136565b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f136566c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f136567d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
