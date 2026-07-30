package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class csv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final csv0 f82404a = new csv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f82405b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguages");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f82405b = builder.withProperty(bcr0Var.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f82405b, ((eqx0) obj).m117805a());
    }
}
