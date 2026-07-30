package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wqv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final wqv0 f187734a = new wqv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f187735b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguage");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f187735b = builder.withProperty(bcr0Var.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f187735b, ((qpx0) obj).m175867a());
    }
}
