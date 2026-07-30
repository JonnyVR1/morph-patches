package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class pow0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final pow0 f150564a = new pow0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f150565b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f150566c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sourceLanguage");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f150565b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("targetLanguage");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f150566c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
