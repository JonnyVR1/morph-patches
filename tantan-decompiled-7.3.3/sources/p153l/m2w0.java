package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class m2w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final m2w0 f134624a = new m2w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f134625b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f134626c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f134625b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f134626c = builder2.withProperty(hlr0Var2.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
