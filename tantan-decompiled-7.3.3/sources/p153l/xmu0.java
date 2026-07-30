package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xmu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final xmu0 f195330a = new xmu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f195331b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f195332c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f195333d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f195331b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isSuccessful");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f195332c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f195333d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
