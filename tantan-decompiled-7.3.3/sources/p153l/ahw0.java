package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ahw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ahw0 f71434a = new ahw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f71435b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f71435b = builder.withProperty(hlr0Var.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
