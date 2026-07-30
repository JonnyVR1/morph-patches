package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ldp {

    /* JADX INFO: renamed from: a */
    public List<BLiveTemplate> f127573a;

    /* JADX INFO: renamed from: l.ldp$a */
    public static class C18198a {

        /* JADX INFO: renamed from: a */
        public static ldp f127574a = new ldp();
    }

    /* JADX INFO: renamed from: a */
    public static ldp m149464a() {
        return C18198a.f127574a;
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveTemplate> m149465b() {
        BLiveIntlTemplateData bLiveIntlTemplateData;
        if (this.f127573a == null && (bLiveIntlTemplateData = ((bgv) ypv.m215673l(fld0.f98151f)).f75522v.get()) != null && !vwb.m200296J(bLiveIntlTemplateData.templates)) {
            this.f127573a = bLiveIntlTemplateData.templates;
        }
        return this.f127573a;
    }

    /* JADX INFO: renamed from: c */
    public void m149466c(List<BLiveTemplate> list) {
        this.f127573a = list;
    }

    /* JADX INFO: renamed from: d */
    public void m149467d() {
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnDataM195996z4 = ypv.m215672k().m195996z4();
        if (bLiveIntlLiveTemplatesCdnDataM195996z4 == null) {
            fld0<bgv> fld0Var = fld0.f98151f;
            ((bgv) ypv.m215673l(fld0Var)).f75521u.clear();
            ((bgv) ypv.m215673l(fld0Var)).f75522v.clear();
        } else {
            if (TextUtils.isEmpty(bLiveIntlLiveTemplatesCdnDataM195996z4.url)) {
                return;
            }
            u8o.m192215i(bLiveIntlLiveTemplatesCdnDataM195996z4);
        }
    }

    public ldp() {
    }
}
