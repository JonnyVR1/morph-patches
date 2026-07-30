package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class gsw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final gsw0 f106332a = new gsw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f106333b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelLanguage");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f106333b = builder.withProperty(hlr0Var.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
