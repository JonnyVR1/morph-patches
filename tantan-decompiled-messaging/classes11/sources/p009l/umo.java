package p009l;

import com.p1.mobile.putong.data.DbLinks;
import java.util.List;
import l.ano;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final /* synthetic */ class umo implements w9j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ano f21253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DbLinks f21254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f21255c;

    public /* synthetic */ umo(ano anoVar, DbLinks dbLinks, int i) {
        this.f21253a = anoVar;
        this.f21254b = dbLinks;
        this.f21255c = i;
    }

    public final Object call(Object obj) {
        return ano.F0(this.f21253a, this.f21254b, this.f21255c, (List) obj);
    }
}
