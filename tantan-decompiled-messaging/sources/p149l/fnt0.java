package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class fnt0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final fnt0 f98473a = new fnt0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f98474b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("format");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f98474b = builder.withProperty(bcr0Var.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
