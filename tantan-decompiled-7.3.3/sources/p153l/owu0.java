package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class owu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final owu0 f149572a = new owu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f149573b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f149574c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f149575d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f149573b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f149574c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f149575d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
