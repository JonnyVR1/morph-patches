package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class vwu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final vwu0 f183375a = new vwu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f183376b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("api");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f183376b = builder.withProperty(bcr0Var.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
