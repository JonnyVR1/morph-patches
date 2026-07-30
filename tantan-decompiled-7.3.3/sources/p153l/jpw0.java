package p153l;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class jpw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final jpw0 f122143a = new jpw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f122144b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f122145c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f122146d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f122147e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f122148f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f122149g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f122150h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f122151i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f122152j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f122153k;

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f122154l;

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f122155m;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfo");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f122144b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("nnapiInfo");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f122145c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("gpuInfo");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f122146d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("pipelineIdentifier");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f122147e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("acceptedConfigurations");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f122148f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("action");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f122149g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f122150h = builder7.withProperty(hlr0Var7.m135771b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customErrors");
        hlr0 hlr0Var8 = new hlr0();
        hlr0Var8.m135770a(8);
        f122151i = builder8.withProperty(hlr0Var8.m135771b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("benchmarkStatus");
        hlr0 hlr0Var9 = new hlr0();
        hlr0Var9.m135770a(9);
        f122152j = builder9.withProperty(hlr0Var9.m135771b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("validationTestResult");
        hlr0 hlr0Var10 = new hlr0();
        hlr0Var10.m135770a(10);
        f122153k = builder10.withProperty(hlr0Var10.m135771b()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("timestampUs");
        hlr0 hlr0Var11 = new hlr0();
        hlr0Var11.m135770a(11);
        f122154l = builder11.withProperty(hlr0Var11.m135771b()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("elapsedUs");
        hlr0 hlr0Var12 = new hlr0();
        hlr0Var12.m135770a(12);
        f122155m = builder12.withProperty(hlr0Var12.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
