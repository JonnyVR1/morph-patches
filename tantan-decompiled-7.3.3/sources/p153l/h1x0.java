package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class h1x0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final h1x0 f107494a = new h1x0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f107495b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f107496c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f107497d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("numSamples");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f107495b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f107496c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("metricResults");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f107497d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
