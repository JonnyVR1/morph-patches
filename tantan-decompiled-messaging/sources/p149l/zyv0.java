package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes6.dex */
public final class zyv0 {

    /* JADX INFO: renamed from: a */
    public final Pattern f205744a;

    @VisibleForTesting
    public zyv0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) d1s0.m109677c().m144697a(m7s0.f132079T6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f205744a = patternCompile;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m220950a(@Nullable String str) {
        Pattern pattern = this.f205744a;
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
