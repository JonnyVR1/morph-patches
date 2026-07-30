package p149l;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/ssg0;", "", "<init>", "()V", "", "tag", "", "a", "(Ljava/lang/String;)Z", "Ll/uqd0;", "Ll/uqd0;", "getTodayShowOnceSaved", "()Ll/uqd0;", "todayShowOnceSaved", "", "b", "I", "()I", "c", "(I)V", "role", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ssg0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final uqd0 todayShowOnceSaved = new uqd0("SuggestEntryUtil_card_and_follow_show_time_" + l9s.m149093o0(), "");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int role = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m185745a(@NotNull String tag) {
        tag.getClass();
        String str = this.todayShowOnceSaved.get();
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            if (StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).size() == 2 && !Intrinsics.m87488d(StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).get(0), tag) && Intrinsics.m87488d(StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).get(1), String.valueOf(mqi0.m155943n()))) {
                return false;
            }
        }
        this.todayShowOnceSaved.put(tag + "_" + mqi0.m155943n());
        return true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: c */
    public final void m185747c(int i) {
        this.role = i;
    }
}
