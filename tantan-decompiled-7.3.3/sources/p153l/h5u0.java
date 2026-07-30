package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class h5u0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final h5u0 f107975a = new h5u0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f107976b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f107977c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f107978d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f107976b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f107977c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f107978d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
