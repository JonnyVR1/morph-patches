package p149l;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zmr0 implements EncoderConfig {

    /* JADX INFO: renamed from: d */
    public static final ObjectEncoder f203759d = new ObjectEncoder() { // from class: l.vlr0
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            ObjectEncoder objectEncoder = zmr0.f203759d;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: a */
    public final Map f203760a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f203761b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ObjectEncoder f203762c = f203759d;

    /* JADX INFO: renamed from: a */
    public final lor0 m219368a() {
        return new lor0(new HashMap(this.f203760a), new HashMap(this.f203761b), this.f203762c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f203760a.put(cls, objectEncoder);
        this.f203761b.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f203761b.put(cls, valueEncoder);
        this.f203760a.remove(cls);
        return this;
    }
}
