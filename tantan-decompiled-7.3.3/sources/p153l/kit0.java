package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class kit0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final kit0 f127028a = new kit0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f127029b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f127030c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f127031d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f127032e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f127029b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f127030c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f127031d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f127032e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
