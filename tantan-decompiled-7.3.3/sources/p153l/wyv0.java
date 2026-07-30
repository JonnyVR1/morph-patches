package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wyv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final wyv0 f191710a = new wyv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f191711b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f191712c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f191711b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f191712c = builder2.withProperty(hlr0Var2.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        txx0 txx0Var = (txx0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f191711b, txx0Var.m193541a());
        objectEncoderContext2.add(f191712c, txx0Var.m193542b());
    }
}
