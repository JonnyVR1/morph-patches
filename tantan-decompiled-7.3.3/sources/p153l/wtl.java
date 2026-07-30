package p153l;

import android.media.MediaExtractor;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\b¨\u0006\u0015À\u0006\u0003"}, m88121d2 = {"Ll/wtl;", "", "Landroid/media/MediaExtractor;", "extractor", "", "c", "(Landroid/media/MediaExtractor;)V", "a", "()V", "", "b", "", BLiveOperationTitleShowType.off, "len", "read", "([BII)I", "", Constants.INAPP_POSITION, FreeSpaceBox.TYPE, "(J)V", "close", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface wtl {
    /* JADX INFO: renamed from: a */
    void mo167773a();

    /* JADX INFO: renamed from: b */
    void mo167774b();

    /* JADX INFO: renamed from: c */
    void mo167775c(@NotNull MediaExtractor extractor);

    void close();

    int read(@NotNull byte[] b, int off, int len);

    void skip(long pos);
}
