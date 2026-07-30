package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class spw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final spw0 f165888a = new spw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f165889b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f165890c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("metric");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f165889b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(LovePlanetStage.result);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f165890c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
