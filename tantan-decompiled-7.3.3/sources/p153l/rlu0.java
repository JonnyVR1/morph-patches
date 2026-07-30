package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class rlu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final rlu0 f163804a = new rlu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f163805b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f163806c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f163807d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f163808e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f163809f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f163805b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f163806c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f163807d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f163808e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isNnApiEnabled");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f163809f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
