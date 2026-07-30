package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class d0v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final d0v0 f84617a = new d0v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f84618b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f84619c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f84620d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f84621e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f84622f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f84623g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f84624h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f84618b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageSource");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f84619c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageFormat");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f84620d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageByteSize");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f84621e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageWidth");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f84622f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("imageHeight");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f84623g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("rotationDegrees");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f84624h = builder7.withProperty(hlr0Var7.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
