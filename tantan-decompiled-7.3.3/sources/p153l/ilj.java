package p153l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ilj {

    /* JADX INFO: renamed from: c */
    public static final Pattern f115579c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f115580a = -1;

    /* JADX INFO: renamed from: b */
    public int f115581b = -1;

    /* JADX INFO: renamed from: a */
    public boolean m140628a() {
        return (this.f115580a == -1 || this.f115581b == -1) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m140629b(String str) {
        Matcher matcher = f115579c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) bmk0.m105144j(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) bmk0.m105144j(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f115580a = i;
            this.f115581b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m140630c(Metadata metadata) {
        for (int i = 0; i < metadata.m10587e(); i++) {
            Metadata.Entry entryM10586d = metadata.m10586d(i);
            if (entryM10586d instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryM10586d;
                if ("iTunSMPB".equals(commentFrame.description) && m140629b(commentFrame.text)) {
                    return true;
                }
            } else if (entryM10586d instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryM10586d;
                if ("com.apple.iTunes".equals(internalFrame.domain) && "iTunSMPB".equals(internalFrame.description) && m140629b(internalFrame.text)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m140631d(int i) {
        int i2 = i >> 12;
        int i3 = i & UnixStat.PERM_MASK;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f115580a = i2;
        this.f115581b = i3;
        return true;
    }
}
