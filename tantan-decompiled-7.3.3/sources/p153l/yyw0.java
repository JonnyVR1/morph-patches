package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yyw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final yyw0 f202156a = new yyw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f202157b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f202158c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("metric");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f202157b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(LovePlanetStage.result);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f202158c = builder2.withProperty(hlr0Var2.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
