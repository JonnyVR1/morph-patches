package p149l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class sju0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final sju0 f164914a = new sju0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f164915b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f164916c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f164917d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f164918e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f164919f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f164920g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("mode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f164915b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(PlaceTypes.LANDMARK);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f164916c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classification");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f164917d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("prominentFaceOnly");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f164918e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tracking");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f164919f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f164920g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
