package p149l;

import android.os.Trace;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/snd;", "Ll/o6j$c;", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)V", "b", "", "c", "()Z", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class snd implements o6j.InterfaceC18853c {
    @Override // p149l.o6j.InterfaceC18853c
    /* JADX INFO: renamed from: a */
    public void mo162854a(@NotNull String name) {
        name.getClass();
        if (mo162856c()) {
            Trace.beginSection(name);
        }
    }

    @Override // p149l.o6j.InterfaceC18853c
    /* JADX INFO: renamed from: b */
    public void mo162855b() {
        if (mo162856c()) {
            Trace.endSection();
        }
    }

    @Override // p149l.o6j.InterfaceC18853c
    /* JADX INFO: renamed from: c */
    public boolean mo162856c() {
        return false;
    }
}
