package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qat0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final qat0 f156418a = new qat0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f156419b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f156420c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f156421d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f156422e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f156423f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f156424g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f156419b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f156420c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f156421d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f156422e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f156423f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f156424g = builder6.withProperty(hlr0Var6.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
