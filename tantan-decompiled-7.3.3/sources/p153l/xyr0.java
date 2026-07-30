package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class xyr0 implements ValueEncoderContext {

    /* JADX INFO: renamed from: a */
    public boolean f196781a = false;

    /* JADX INFO: renamed from: b */
    public boolean f196782b = false;

    /* JADX INFO: renamed from: c */
    public FieldDescriptor f196783c;

    /* JADX INFO: renamed from: d */
    public final ttr0 f196784d;

    public xyr0(ttr0 ttr0Var) {
        this.f196784d = ttr0Var;
    }

    /* JADX INFO: renamed from: b */
    private final void m213636b() {
        if (this.f196781a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f196781a = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m213637a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f196781a = false;
        this.f196783c = fieldDescriptor;
        this.f196782b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(double d) throws IOException {
        m213636b();
        this.f196784d.m192684a(this.f196783c, d, this.f196782b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(float f) throws IOException {
        m213636b();
        this.f196784d.m192685b(this.f196783c, f, this.f196782b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(int i) throws IOException {
        m213636b();
        this.f196784d.m192687d(this.f196783c, i, this.f196782b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(long j) throws IOException {
        m213636b();
        this.f196784d.m192688e(this.f196783c, j, this.f196782b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        m213636b();
        this.f196784d.m192686c(this.f196783c, str, this.f196782b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(boolean z) throws IOException {
        m213636b();
        this.f196784d.m192687d(this.f196783c, z ? 1 : 0, this.f196782b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        m213636b();
        this.f196784d.m192686c(this.f196783c, bArr, this.f196782b);
        return this;
    }
}
