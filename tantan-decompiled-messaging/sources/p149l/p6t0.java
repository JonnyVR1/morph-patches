package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class p6t0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final p6t0 f147439a = new p6t0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f147440b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f147441c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f147442d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f147443e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f147444f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f147440b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f147441c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f147442d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f147443e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f147444f = builder5.withProperty(bcr0Var5.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
