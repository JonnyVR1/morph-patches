package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface bhd<I, O, E extends DecoderException> {
    @Nullable
    /* JADX INFO: renamed from: a */
    I mo101811a() throws DecoderException;

    @Nullable
    /* JADX INFO: renamed from: c */
    O mo101812c() throws DecoderException;

    /* JADX INFO: renamed from: d */
    void mo101813d(I i) throws DecoderException;

    void flush();

    void release();
}
