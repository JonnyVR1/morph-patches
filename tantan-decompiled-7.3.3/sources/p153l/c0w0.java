package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class c0w0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final c0w0 f79305a = new c0w0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f79306b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguage");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f79306b = builder.withProperty(hlr0Var.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f79306b, ((wyx0) obj).m208630a());
    }
}
