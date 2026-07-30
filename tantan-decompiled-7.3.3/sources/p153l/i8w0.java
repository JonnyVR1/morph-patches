package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class i8w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final i8w0 f113374a = new i8w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f113375b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f113376c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f113377d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f113378e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f113379f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f113375b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("personDetectionMode");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f113376c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("landmarkDetectionMode");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f113377d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("preferredHardwareConfigs");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f113378e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("runConfig");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f113379f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
