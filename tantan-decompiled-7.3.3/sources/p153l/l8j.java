package p153l;

import androidx.sqlite.p009db.framework.FrameworkSQLiteOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/l8j;", "Ll/o7h0$c;", "<init>", "()V", "Ll/o7h0$b;", "configuration", "Ll/o7h0;", "a", "(Ll/o7h0$b;)Ll/o7h0;", "sqlite-framework_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class l8j implements o7h0.InterfaceC19045c {
    @Override // p153l.o7h0.InterfaceC19045c
    @NotNull
    /* JADX INFO: renamed from: a */
    public o7h0 mo104496a(@NotNull o7h0.C19044b configuration) {
        configuration.getClass();
        return new FrameworkSQLiteOpenHelper(configuration.context, configuration.com.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
