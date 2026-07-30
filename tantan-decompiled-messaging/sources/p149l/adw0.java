package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class adw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final adw0 f68971a = new adw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f68972b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f68973c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorSpace");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f68972b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f68973c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
