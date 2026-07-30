package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface hid<I, O, E extends DecoderException> {
    @Nullable
    /* JADX INFO: renamed from: a */
    I mo135120a() throws DecoderException;

    @Nullable
    /* JADX INFO: renamed from: c */
    O mo131056c() throws DecoderException;

    /* JADX INFO: renamed from: d */
    void mo135121d(I i) throws DecoderException;

    void flush();

    void release();
}
