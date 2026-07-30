package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class upu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final upu0 f177672a = new upu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f177673b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f177674c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("source");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f177673b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f177674c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
