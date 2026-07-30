package p149l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pij {

    /* JADX INFO: renamed from: c */
    public static final Pattern f149572c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f149573a = -1;

    /* JADX INFO: renamed from: b */
    public int f149574b = -1;

    /* JADX INFO: renamed from: a */
    public boolean m169608a() {
        return (this.f149573a == -1 || this.f149574b == -1) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m169609b(String str) {
        Matcher matcher = f149572c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) vck0.m197866j(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) vck0.m197866j(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f149573a = i;
            this.f149574b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m169610c(Metadata metadata) {
        for (int i = 0; i < metadata.m10533e(); i++) {
            Metadata.Entry entryM10532d = metadata.m10532d(i);
            if (entryM10532d instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryM10532d;
                if ("iTunSMPB".equals(commentFrame.description) && m169609b(commentFrame.text)) {
                    return true;
                }
            } else if (entryM10532d instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryM10532d;
                if ("com.apple.iTunes".equals(internalFrame.domain) && "iTunSMPB".equals(internalFrame.description) && m169609b(internalFrame.text)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m169611d(int i) {
        int i2 = i >> 12;
        int i3 = i & UnixStat.PERM_MASK;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f149573a = i2;
        this.f149574b = i3;
        return true;
    }
}
