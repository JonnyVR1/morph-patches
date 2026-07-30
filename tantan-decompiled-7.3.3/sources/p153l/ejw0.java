package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ejw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ejw0 f94324a = new ejw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f94325b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f94326c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f94327d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f94325b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f94326c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("recognizerOptions");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f94327d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
