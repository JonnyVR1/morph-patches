package p153l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ysu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ysu0 f201462a = new ysu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f201463b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f201464c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f201465d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f201466e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f201467f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f201468g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("mode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f201463b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(PlaceTypes.LANDMARK);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f201464c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classification");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f201465d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("prominentFaceOnly");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f201466e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tracking");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f201467f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f201468g = builder6.withProperty(hlr0Var6.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
