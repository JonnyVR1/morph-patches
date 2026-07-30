package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class lfp {

    /* JADX INFO: renamed from: a */
    public List<BLiveTemplate> f131891a;

    /* JADX INFO: renamed from: l.lfp$a */
    public static class C18387a {

        /* JADX INFO: renamed from: a */
        public static lfp f131892a = new lfp();
    }

    /* JADX INFO: renamed from: a */
    public static lfp m154031a() {
        return C18387a.f131892a;
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveTemplate> m154032b() {
        BLiveIntlTemplateData bLiveIntlTemplateData;
        if (this.f131891a == null && (bLiveIntlTemplateData = ((civ) zrv.m221194l(htd0.f111524f)).f82015v.get()) != null && !jyb.m147479J(bLiveIntlTemplateData.templates)) {
            this.f131891a = bLiveIntlTemplateData.templates;
        }
        return this.f131891a;
    }

    /* JADX INFO: renamed from: c */
    public void m154033c(List<BLiveTemplate> list) {
        this.f131891a = list;
    }

    /* JADX INFO: renamed from: d */
    public void m154034d() {
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnDataM203783z4 = zrv.m221193k().m203783z4();
        if (bLiveIntlLiveTemplatesCdnDataM203783z4 == null) {
            htd0<civ> htd0Var = htd0.f111524f;
            ((civ) zrv.m221194l(htd0Var)).f82014u.clear();
            ((civ) zrv.m221194l(htd0Var)).f82015v.clear();
        } else {
            if (TextUtils.isEmpty(bLiveIntlLiveTemplatesCdnDataM203783z4.url)) {
                return;
            }
            uao.m195187i(bLiveIntlLiveTemplatesCdnDataM203783z4);
        }
    }

    public lfp() {
    }
}
