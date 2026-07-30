package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes6.dex */
public final class f8w0 {

    /* JADX INFO: renamed from: a */
    public final Pattern f97781a;

    @VisibleForTesting
    public f8w0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) jas0.m144075c().m176505a(sgs0.f168150T6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f97781a = patternCompile;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m124572a(@Nullable String str) {
        Pattern pattern = this.f97781a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
