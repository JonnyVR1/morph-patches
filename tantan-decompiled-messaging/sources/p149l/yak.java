package p149l;

import androidx.annotation.NonNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class yak extends AbstractC17922k4 {

    /* JADX INFO: renamed from: k */
    private static final Pattern f197219k = Pattern.compile("(https?:\\/\\/[^\\/]+\\/fep\\/momo\\/[^\\/]+\\/[^\\/]+\\/)(\\S+)");

    /* JADX INFO: renamed from: l */
    private static final Pattern f197220l = Pattern.compile("(https?:\\/\\/[^\\/]+\\/fep\\/momo\\/[^\\/]+\\/[^\\/]+\\/[^\\/]+\\/[^\\/]+\\/)(\\S+)");

    public yak(@NonNull String str, long j) {
        super(str, j);
    }

    @Override // p149l.AbstractC17922k4
    /* JADX INFO: renamed from: g */
    public String mo97466g(@NonNull String str) {
        try {
            Matcher matcher = (AbstractC17922k4.m144448l(str) ? f197220l : f197219k).matcher(str);
            if (matcher.matches()) {
                return m144458j(matcher.group(1) + "grey/" + matcher.group(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.mo97466g(str);
    }
}
