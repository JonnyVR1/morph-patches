package p149l;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dgw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final dgw0 f86195a = new dgw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f86196b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f86197c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f86198d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f86199e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f86200f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f86201g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f86202h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f86203i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f86204j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f86205k;

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f86206l;

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f86207m;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfo");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f86196b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("nnapiInfo");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f86197c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("gpuInfo");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f86198d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("pipelineIdentifier");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f86199e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("acceptedConfigurations");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f86200f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("action");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f86201g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f86202h = builder7.withProperty(bcr0Var7.m101121b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customErrors");
        bcr0 bcr0Var8 = new bcr0();
        bcr0Var8.m101120a(8);
        f86203i = builder8.withProperty(bcr0Var8.m101121b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("benchmarkStatus");
        bcr0 bcr0Var9 = new bcr0();
        bcr0Var9.m101120a(9);
        f86204j = builder9.withProperty(bcr0Var9.m101121b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("validationTestResult");
        bcr0 bcr0Var10 = new bcr0();
        bcr0Var10.m101120a(10);
        f86205k = builder10.withProperty(bcr0Var10.m101121b()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("timestampUs");
        bcr0 bcr0Var11 = new bcr0();
        bcr0Var11.m101120a(11);
        f86206l = builder11.withProperty(bcr0Var11.m101121b()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("elapsedUs");
        bcr0 bcr0Var12 = new bcr0();
        bcr0Var12.m101120a(12);
        f86207m = builder12.withProperty(bcr0Var12.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
