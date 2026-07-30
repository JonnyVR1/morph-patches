package p153l;

import android.os.Trace;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/xod;", "Ll/i9j$c;", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "a", "(Ljava/lang/String;)V", "b", "", "c", "()Z", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class xod implements i9j.InterfaceC17673c {
    @Override // p153l.i9j.InterfaceC17673c
    /* JADX INFO: renamed from: a */
    public void mo139101a(@NotNull String name) {
        name.getClass();
        if (mo139103c()) {
            Trace.beginSection(name);
        }
    }

    @Override // p153l.i9j.InterfaceC17673c
    /* JADX INFO: renamed from: b */
    public void mo139102b() {
        if (mo139103c()) {
            Trace.endSection();
        }
    }

    @Override // p153l.i9j.InterfaceC17673c
    /* JADX INFO: renamed from: c */
    public boolean mo139103c() {
        return false;
    }
}
