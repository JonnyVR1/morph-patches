package p153l;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fwr0 implements EncoderConfig {

    /* JADX INFO: renamed from: d */
    public static final ObjectEncoder f101197d = new ObjectEncoder() { // from class: l.bvr0
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            ObjectEncoder objectEncoder = fwr0.f101197d;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: a */
    public final Map f101198a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f101199b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ObjectEncoder f101200c = f101197d;

    /* JADX INFO: renamed from: a */
    public final rxr0 m127843a() {
        return new rxr0(new HashMap(this.f101198a), new HashMap(this.f101199b), this.f101200c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f101198a.put(cls, objectEncoder);
        this.f101199b.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f101199b.put(cls, valueEncoder);
        this.f101198a.remove(cls);
        return this;
    }
}
