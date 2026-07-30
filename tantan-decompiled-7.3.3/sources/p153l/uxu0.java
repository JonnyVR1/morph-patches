package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class uxu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final uxu0 f181506a = new uxu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f181507b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f181508c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f181509d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f181510e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f181511f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f181512g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f181513h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f181514i;

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f181515j;

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f181516k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f181507b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f181508c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f181509d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("autoManageModelOnBackground");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f181510e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("autoManageModelOnLowMemory");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f181511f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("isNnApiEnabled");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f181512g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("eventsCount");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f181513h = builder7.withProperty(hlr0Var7.m135771b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("otherErrors");
        hlr0 hlr0Var8 = new hlr0();
        hlr0Var8.m135770a(8);
        f181514i = builder8.withProperty(hlr0Var8.m135771b()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("remoteConfigValueForAcceleration");
        hlr0 hlr0Var9 = new hlr0();
        hlr0Var9.m135770a(9);
        f181515j = builder9.withProperty(hlr0Var9.m135771b()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isAccelerated");
        hlr0 hlr0Var10 = new hlr0();
        hlr0Var10.m135770a(10);
        f181516k = builder10.withProperty(hlr0Var10.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        nrx0 nrx0Var = (nrx0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f181507b, nrx0Var.m164538c());
        objectEncoderContext2.add(f181508c, nrx0Var.m164536a());
        objectEncoderContext2.add(f181509d, nrx0Var.m164537b());
        objectEncoderContext2.add(f181510e, (Object) null);
        objectEncoderContext2.add(f181511f, (Object) null);
        objectEncoderContext2.add(f181512g, (Object) null);
        objectEncoderContext2.add(f181513h, (Object) null);
        objectEncoderContext2.add(f181514i, (Object) null);
        objectEncoderContext2.add(f181515j, (Object) null);
        objectEncoderContext2.add(f181516k, (Object) null);
    }
}
