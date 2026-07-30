package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class art0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final art0 f71344a = new art0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f71345b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f71346c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxResults");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f71345b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("modelType");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f71346c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
