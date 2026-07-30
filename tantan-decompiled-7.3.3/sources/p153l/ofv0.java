package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ofv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ofv0 f147160a = new ofv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f147161b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f147162c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f147163d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f147164e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f147161b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("type");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f147162c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(WBConstants.AUTH_PARAMS_VERSION);
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f147163d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("featureLevel");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f147164e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
