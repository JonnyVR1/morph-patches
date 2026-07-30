package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ypt0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ypt0 f201098a = new ypt0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f201099b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f201100c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f201101d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f201102e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f201103f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f201099b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f201100c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f201101d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f201102e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("recognizerOptions");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f201103f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
