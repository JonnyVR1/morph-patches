package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class i1w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final i1w0 f112559a = new i1w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f112560b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguages");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f112560b = builder.withProperty(hlr0Var.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f112560b, ((kzx0) obj).m152238a());
    }
}
