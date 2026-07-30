package p153l;

import com.immomo.mmdns.MDDNSEntrance;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/afi0;", "Ll/lxl;", "<init>", "()V", "", "host", "", "a", "(Ljava/lang/String;)Z", "domain", "findV6", "", "b", "(Ljava/lang/String;Z)[Ljava/lang/String;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class afi0 implements lxl {
    @Override // p153l.lxl
    /* JADX INFO: renamed from: a */
    public boolean mo97337a(@Nullable String host) {
        return MDDNSEntrance.getInstance().useDNS(host);
    }

    @Override // p153l.lxl
    @Nullable
    /* JADX INFO: renamed from: b */
    public String[] mo97338b(@Nullable String domain, boolean findV6) {
        return MDDNSEntrance.getInstance().getUsableHostList(domain, findV6);
    }

    @Override // p153l.lxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo97339c(@Nullable String domain) {
        return MDDNSEntrance.getInstance().getUsableHost(domain);
    }
}
