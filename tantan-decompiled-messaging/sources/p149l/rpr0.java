package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class rpr0 implements ValueEncoderContext {

    /* JADX INFO: renamed from: a */
    public boolean f160556a = false;

    /* JADX INFO: renamed from: b */
    public boolean f160557b = false;

    /* JADX INFO: renamed from: c */
    public FieldDescriptor f160558c;

    /* JADX INFO: renamed from: d */
    public final nkr0 f160559d;

    public rpr0(nkr0 nkr0Var) {
        this.f160559d = nkr0Var;
    }

    /* JADX INFO: renamed from: b */
    private final void m180397b() {
        if (this.f160556a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f160556a = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m180398a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f160556a = false;
        this.f160558c = fieldDescriptor;
        this.f160557b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(double d) throws IOException {
        m180397b();
        this.f160559d.m159996a(this.f160558c, d, this.f160557b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(float f) throws IOException {
        m180397b();
        this.f160559d.m159997b(this.f160558c, f, this.f160557b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(int i) throws IOException {
        m180397b();
        this.f160559d.m159999d(this.f160558c, i, this.f160557b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(long j) throws IOException {
        m180397b();
        this.f160559d.m160000e(this.f160558c, j, this.f160557b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        m180397b();
        this.f160559d.m159998c(this.f160558c, str, this.f160557b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(boolean z) throws IOException {
        m180397b();
        this.f160559d.m159999d(this.f160558c, z ? 1 : 0, this.f160557b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        m180397b();
        this.f160559d.m159998c(this.f160558c, bArr, this.f160557b);
        return this;
    }
}
