package p149l;

import androidx.sqlite.p008db.framework.FrameworkSQLiteOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/r5j;", "Ll/gzg0$c;", "<init>", "()V", "Ll/gzg0$b;", "configuration", "Ll/gzg0;", "a", "(Ll/gzg0$b;)Ll/gzg0;", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class r5j implements gzg0.InterfaceC17210c {
    @Override // p149l.gzg0.InterfaceC17210c
    @NotNull
    /* JADX INFO: renamed from: a */
    public gzg0 mo112331a(@NotNull gzg0.C17209b configuration) {
        configuration.getClass();
        return new FrameworkSQLiteOpenHelper(configuration.context, configuration.com.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
