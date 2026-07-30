package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.p051p1.mobile.putong.live.livingroom.intl.template.IntlTemplateCdnException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public class uao {

    /* JADX INFO: renamed from: a */
    public static int f178219a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22421c m195179a(BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData, vxj0 vxj0Var) {
        htd0<civ> htd0Var = htd0.f111524f;
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData2 = ((civ) zrv.m221194l(htd0Var)).f82014u.get();
        if (bLiveIntlLiveTemplatesCdnData2 == null || !bLiveIntlLiveTemplatesCdnData2.version.equals(bLiveIntlLiveTemplatesCdnData.version)) {
            return m195186h(bLiveIntlLiveTemplatesCdnData);
        }
        BLiveIntlTemplateData bLiveIntlTemplateData = ((civ) zrv.m221194l(htd0Var)).f82015v.get();
        return bLiveIntlTemplateData == null ? m195186h(bLiveIntlLiveTemplatesCdnData) : C22421c.just(new Pair(bLiveIntlTemplateData, bLiveIntlLiveTemplatesCdnData));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveIntlTemplateData m195180b(BLiveIntlTemplateData bLiveIntlTemplateData) {
        ((civ) zrv.m221194l(htd0.f111524f)).f82015v.put(bLiveIntlTemplateData);
        return bLiveIntlTemplateData;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m195183e(Pair pair) {
        f178219a = 0;
        m195185g(pair);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m195184f(Throwable th) {
        int i = f178219a + 1;
        f178219a = i;
        if (i < 2) {
            lfp.m154031a().m154034d();
        } else {
            if (th == null || TextUtils.isEmpty(th.getMessage())) {
                return;
            }
            CrashHelper.m82481e(new IntlTemplateCdnException("Message template CDN download error", th), "国际化cdn消息模版", CrashHelper.ReportLevel.p9);
            lej0.INSTANCE.m153908b("intl_template_cdn_error", "intl_template_cdn_error", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m195185g(Pair<BLiveIntlTemplateData, BLiveIntlLiveTemplatesCdnData> pair) {
        lfp.m154031a().m154033c(((BLiveIntlTemplateData) pair.first).templates);
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<Pair<BLiveIntlTemplateData, BLiveIntlLiveTemplatesCdnData>> m195186h(final BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData) {
        ((civ) zrv.m221194l(htd0.f111524f)).f82014u.put(bLiveIntlLiveTemplatesCdnData);
        lej0.INSTANCE.m153910d("intl_template_cdn_error");
        return qi20.m176656c(new pcj() { // from class: l.qao
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vrv.f185526c.auth().m209043q(bLiveIntlLiveTemplatesCdnData.url).m209032f().m209028b();
            }
        }, BLiveIntlTemplateData.JSON_ADAPTER).filter(new qcj() { // from class: l.rao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveIntlTemplateData) obj));
            }
        }).map(new qcj() { // from class: l.sao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uao.m195180b((BLiveIntlTemplateData) obj);
            }
        }).flatMap(new qcj() { // from class: l.tao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(new Pair((BLiveIntlTemplateData) obj, bLiveIntlLiveTemplatesCdnData));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m195187i(final BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData) {
        C22421c.just(vxj0.f186265a).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.nao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uao.m195179a(bLiveIntlLiveTemplatesCdnData, (vxj0) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.oao
            @Override // p153l.y20
            public final void call(Object obj) {
                uao.m195183e((Pair) obj);
            }
        }, new y20() { // from class: l.pao
            @Override // p153l.y20
            public final void call(Object obj) {
                uao.m195184f((Throwable) obj);
            }
        }));
    }
}
