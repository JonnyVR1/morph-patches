package p002l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.intl.template.IntlTemplateCdnException;
import com.p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bgv;
import l.e30;
import l.ffw;
import l.fld0;
import l.h5j0;
import l.ia20;
import l.soj0;
import l.upv;
import l.v9j;
import l.w9j;
import l.ypv;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u8o {

    /* JADX INFO: renamed from: a */
    public static int f20538a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ c m23331a(BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData, soj0 soj0Var) {
        fld0 fld0Var = fld0.f;
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData2 = (BLiveIntlLiveTemplatesCdnData) ((bgv) ypv.l(fld0Var)).u.get();
        if (bLiveIntlLiveTemplatesCdnData2 == null || !bLiveIntlLiveTemplatesCdnData2.version.equals(bLiveIntlLiveTemplatesCdnData.version)) {
            return m23338h(bLiveIntlLiveTemplatesCdnData);
        }
        BLiveIntlTemplateData bLiveIntlTemplateData = (BLiveIntlTemplateData) ((bgv) ypv.l(fld0Var)).v.get();
        return bLiveIntlTemplateData == null ? m23338h(bLiveIntlLiveTemplatesCdnData) : c.just(new Pair(bLiveIntlTemplateData, bLiveIntlLiveTemplatesCdnData));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveIntlTemplateData m23332b(BLiveIntlTemplateData bLiveIntlTemplateData) {
        ((bgv) ypv.l(fld0.f)).v.put(bLiveIntlTemplateData);
        return bLiveIntlTemplateData;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23335e(Pair pair) {
        f20538a = 0;
        m23337g(pair);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m23336f(Throwable th) {
        int i = f20538a + 1;
        f20538a = i;
        if (i < 2) {
            ldp.m17141a().m17144d();
        } else {
            if (th == null || TextUtils.isEmpty(th.getMessage())) {
                return;
            }
            CrashHelper.e(new IntlTemplateCdnException("Message template CDN download error", th), "国际化cdn消息模版", CrashHelper.ReportLevel.p9);
            h5j0.INSTANCE.b("intl_template_cdn_error", "intl_template_cdn_error", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m23337g(Pair<BLiveIntlTemplateData, BLiveIntlLiveTemplatesCdnData> pair) {
        ldp.m17141a().m17143c(((BLiveIntlTemplateData) pair.first).templates);
    }

    /* JADX INFO: renamed from: h */
    public static c<Pair<BLiveIntlTemplateData, BLiveIntlLiveTemplatesCdnData>> m23338h(final BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData) {
        ((bgv) ypv.l(fld0.f)).u.put(bLiveIntlLiveTemplatesCdnData);
        h5j0.INSTANCE.d("intl_template_cdn_error");
        return ia20.c(new v9j() { // from class: l.q8o
            public final Object call() {
                return upv.c.auth().q(bLiveIntlLiveTemplatesCdnData.url).f().b();
            }
        }, BLiveIntlTemplateData.JSON_ADAPTER).filter(new w9j() { // from class: l.r8o
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveIntlTemplateData) obj));
            }
        }).map(new w9j() { // from class: l.s8o
            public final Object call(Object obj) {
                return u8o.m23332b((BLiveIntlTemplateData) obj);
            }
        }).flatMap(new w9j() { // from class: l.t8o
            public final Object call(Object obj) {
                return c.just(new Pair((BLiveIntlTemplateData) obj, bLiveIntlLiveTemplatesCdnData));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m23339i(final BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData) {
        c.just(soj0.a).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.n8o
            public final Object call(Object obj) {
                return u8o.m23331a(bLiveIntlLiveTemplatesCdnData, (soj0) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.o8o
            public final void call(Object obj) {
                u8o.m23335e((Pair) obj);
            }
        }, new e30() { // from class: l.p8o
            public final void call(Object obj) {
                u8o.m23336f((Throwable) obj);
            }
        }));
    }
}
