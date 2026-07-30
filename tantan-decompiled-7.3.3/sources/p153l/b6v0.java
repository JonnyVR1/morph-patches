package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class b6v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final b6v0 f75217a = new b6v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f75218b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("api");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f75218b = builder.withProperty(hlr0Var.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
