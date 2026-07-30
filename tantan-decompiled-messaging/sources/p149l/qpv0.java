package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qpv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final qpv0 f155832a = new qpv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f155833b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f155834c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f155833b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f155834c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        nox0 nox0Var = (nox0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f155833b, nox0Var.m160429a());
        objectEncoderContext2.add(f155834c, nox0Var.m160430b());
    }
}
