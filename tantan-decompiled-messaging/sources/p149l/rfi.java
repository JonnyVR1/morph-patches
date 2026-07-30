package p149l;

import android.media.MediaExtractor;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Ll/rfi;", "Ll/irl;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Landroid/media/MediaExtractor;", "extractor", "", "c", "(Landroid/media/MediaExtractor;)V", "a", "()V", "", "b", "", BLiveOperationTitleShowType.off, "len", "read", "([BII)I", "", Constants.INAPP_POSITION, FreeSpaceBox.TYPE, "(J)V", "close", "Ljava/io/File;", "Ljava/io/RandomAccessFile;", "Ljava/io/RandomAccessFile;", "randomAccessFile", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class rfi implements irl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public RandomAccessFile randomAccessFile;

    public rfi(@NotNull File file) throws FileNotFoundException {
        file.getClass();
        this.file = file;
        C21588z0.INSTANCE.m216709d("AnimPlayer.FileContainer", "FileContainer init");
        if (file.exists() && file.isFile() && file.canRead()) {
            return;
        }
        csg0.m108511a("Unable to read ", file);
        throw null;
    }

    @Override // p149l.irl
    /* JADX INFO: renamed from: a */
    public void mo137902a() {
        this.randomAccessFile = new RandomAccessFile(this.file, "r");
    }

    @Override // p149l.irl
    /* JADX INFO: renamed from: b */
    public void mo137903b() throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // p149l.irl
    /* JADX INFO: renamed from: c */
    public void mo137904c(@NotNull MediaExtractor extractor) throws IOException {
        extractor.getClass();
        extractor.setDataSource(this.file.toString());
    }

    @Override // p149l.irl
    public int read(@NotNull byte[] b, int off, int len) {
        b.getClass();
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            return randomAccessFile.read(b, off, len);
        }
        return -1;
    }

    @Override // p149l.irl
    public void skip(long pos) throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.skipBytes((int) pos);
        }
    }

    @Override // p149l.irl
    public void close() {
    }
}
