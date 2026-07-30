package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class sru0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final sru0 f170372a = new sru0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f170373b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f170374c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f170375d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f170376e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f170377f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f170378g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("landmarkMode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f170373b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationMode");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f170374c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("performanceMode");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f170375d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("contourMode");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f170376e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isTrackingEnabled");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f170377f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f170378g = builder6.withProperty(hlr0Var6.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
