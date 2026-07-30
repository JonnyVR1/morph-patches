package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wsv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final wsv0 f190696a = new wsv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f190697b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f190698c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f190699d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f190700e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f190701f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f190697b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f190698c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f190699d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f190700e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("highestConfidence");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f190701f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
