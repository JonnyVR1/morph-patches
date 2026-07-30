package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class r3w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final r3w0 f161118a = new r3w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f161119b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f161120c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f161121d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f161122e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f161123f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f161124g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f161119b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("multipleObjectsEnabled");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f161120c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classificationEnabled");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f161121d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxPerObjectLabelCount");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f161122e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("classificationConfidenceThreshold");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f161123f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customLocalModelOptions");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f161124g = builder6.withProperty(hlr0Var6.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
