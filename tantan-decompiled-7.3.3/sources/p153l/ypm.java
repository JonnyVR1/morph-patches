package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/ypm;", "Ll/pqm;", "Ll/zpm;", "<init>", "()V", "Lorg/json/JSONObject;", "inApp", "", "b", "(Lorg/json/JSONObject;)J", "", "id", "data", "g", "(Ljava/lang/String;Lorg/json/JSONObject;)Ll/zpm;", "message", "f", "(Ljava/lang/String;Ljava/lang/String;)Ll/zpm;", "e", "(Ljava/lang/String;)Ll/zpm;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ypm implements pqm<zpm> {
    @Override // p153l.pqm
    /* JADX INFO: renamed from: b */
    public long mo6412b(@NotNull JSONObject inApp) {
        inApp.getClass();
        return rqm.INSTANCE.m182651b(inApp);
    }

    @Override // p153l.pqm
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zpm mo6413c(@NotNull String id) {
        id.getClass();
        return new zpm.C21856b(Long.parseLong(id), "Timer expired while app was backgrounded");
    }

    @Override // p153l.pqm
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zpm mo6414d(@NotNull String id, @NotNull String message) {
        id.getClass();
        message.getClass();
        return new zpm.C21857c(Long.parseLong(id), message);
    }

    @Override // p153l.pqm
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public zpm mo6411a(@NotNull String id, @NotNull JSONObject data) {
        id.getClass();
        data.getClass();
        return new zpm.C21858d(Long.parseLong(id), data);
    }
}
