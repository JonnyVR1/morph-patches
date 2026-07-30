package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class u7w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final u7w0 f175081a = new u7w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f175082b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f175082b = builder.withProperty(bcr0Var.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
