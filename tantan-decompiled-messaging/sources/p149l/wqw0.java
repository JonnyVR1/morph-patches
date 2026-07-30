package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wqw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final wqw0 f187738a = new wqw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f187739b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f187740c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(LovePlanetStage.result);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f187739b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f187740c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
