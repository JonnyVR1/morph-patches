package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class tgv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final tgv0 f174161a = new tgv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f174162b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f174163c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfos");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f174162b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorInfo");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f174163c = builder2.withProperty(hlr0Var2.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
