package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xhv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final xhv0 f194405a = new xhv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f194406b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f194407c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f194408d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f194409e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f194406b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f194407c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f194408d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f194409e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
