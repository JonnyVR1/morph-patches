package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import java.util.List;
import l.bgv;
import l.fld0;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ldp {

    /* JADX INFO: renamed from: a */
    public List<BLiveTemplate> f14785a;

    /* JADX INFO: renamed from: l.ldp$a */
    public static class C0657a {

        /* JADX INFO: renamed from: a */
        public static ldp f14786a = new ldp();
    }

    /* JADX INFO: renamed from: a */
    public static ldp m17141a() {
        return C0657a.f14786a;
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveTemplate> m17142b() {
        BLiveIntlTemplateData bLiveIntlTemplateData;
        if (this.f14785a == null && (bLiveIntlTemplateData = (BLiveIntlTemplateData) ((bgv) ypv.l(fld0.f)).v.get()) != null && !vwb.J(bLiveIntlTemplateData.templates)) {
            this.f14785a = bLiveIntlTemplateData.templates;
        }
        return this.f14785a;
    }

    /* JADX INFO: renamed from: c */
    public void m17143c(List<BLiveTemplate> list) {
        this.f14785a = list;
    }

    /* JADX INFO: renamed from: d */
    public void m17144d() {
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnDataZ4 = ypv.k().z4();
        if (bLiveIntlLiveTemplatesCdnDataZ4 == null) {
            fld0 fld0Var = fld0.f;
            ((bgv) ypv.l(fld0Var)).u.clear();
            ((bgv) ypv.l(fld0Var)).v.clear();
        } else {
            if (TextUtils.isEmpty(bLiveIntlLiveTemplatesCdnDataZ4.url)) {
                return;
            }
            u8o.m23339i(bLiveIntlLiveTemplatesCdnDataZ4);
        }
    }

    public ldp() {
    }
}
