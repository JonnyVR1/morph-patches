package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qgu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final qgu0 f157472a = new qgu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f157473b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f157474c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f157473b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f157474c = builder2.withProperty(hlr0Var2.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
