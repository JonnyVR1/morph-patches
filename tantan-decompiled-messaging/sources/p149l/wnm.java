package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/wnm;", "Ll/nom;", "Ll/xnm;", "<init>", "()V", "Lorg/json/JSONObject;", "inApp", "", "b", "(Lorg/json/JSONObject;)J", "", "id", "data", "g", "(Ljava/lang/String;Lorg/json/JSONObject;)Ll/xnm;", "message", "f", "(Ljava/lang/String;Ljava/lang/String;)Ll/xnm;", "e", "(Ljava/lang/String;)Ll/xnm;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class wnm implements nom<xnm> {
    @Override // p149l.nom
    /* JADX INFO: renamed from: b */
    public long mo6358b(@NotNull JSONObject inApp) {
        inApp.getClass();
        return pom.INSTANCE.m170611b(inApp);
    }

    @Override // p149l.nom
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xnm mo6359c(@NotNull String id) {
        id.getClass();
        return new xnm.C21184b(Long.parseLong(id), "Timer expired while app was backgrounded");
    }

    @Override // p149l.nom
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public xnm mo6360d(@NotNull String id, @NotNull String message) {
        id.getClass();
        message.getClass();
        return new xnm.C21185c(Long.parseLong(id), message);
    }

    @Override // p149l.nom
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public xnm mo6357a(@NotNull String id, @NotNull JSONObject data) {
        id.getClass();
        data.getClass();
        return new xnm.C21186d(Long.parseLong(id), data);
    }
}
