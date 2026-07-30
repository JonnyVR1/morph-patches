package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.p046p1.mobile.putong.live.livingroom.intl.template.IntlTemplateCdnException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class u8o {

    /* JADX INFO: renamed from: a */
    public static int f175147a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22306c m192207a(BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData, soj0 soj0Var) {
        fld0<bgv> fld0Var = fld0.f98151f;
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData2 = ((bgv) ypv.m215673l(fld0Var)).f75521u.get();
        if (bLiveIntlLiveTemplatesCdnData2 == null || !bLiveIntlLiveTemplatesCdnData2.version.equals(bLiveIntlLiveTemplatesCdnData.version)) {
            return m192214h(bLiveIntlLiveTemplatesCdnData);
        }
        BLiveIntlTemplateData bLiveIntlTemplateData = ((bgv) ypv.m215673l(fld0Var)).f75522v.get();
        return bLiveIntlTemplateData == null ? m192214h(bLiveIntlLiveTemplatesCdnData) : C22306c.just(new Pair(bLiveIntlTemplateData, bLiveIntlLiveTemplatesCdnData));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveIntlTemplateData m192208b(BLiveIntlTemplateData bLiveIntlTemplateData) {
        ((bgv) ypv.m215673l(fld0.f98151f)).f75522v.put(bLiveIntlTemplateData);
        return bLiveIntlTemplateData;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m192211e(Pair pair) {
        f175147a = 0;
        m192213g(pair);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m192212f(Throwable th) {
        int i = f175147a + 1;
        f175147a = i;
        if (i < 2) {
            ldp.m149464a().m149467d();
        } else {
            if (th == null || TextUtils.isEmpty(th.getMessage())) {
                return;
            }
            CrashHelper.m81298e(new IntlTemplateCdnException("Message template CDN download error", th), "国际化cdn消息模版", CrashHelper.ReportLevel.p9);
            h5j0.INSTANCE.m129403b("intl_template_cdn_error", "intl_template_cdn_error", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m192213g(Pair<BLiveIntlTemplateData, BLiveIntlLiveTemplatesCdnData> pair) {
        ldp.m149464a().m149466c(((BLiveIntlTemplateData) pair.first).templates);
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<Pair<BLiveIntlTemplateData, BLiveIntlLiveTemplatesCdnData>> m192214h(final BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData) {
        ((bgv) ypv.m215673l(fld0.f98151f)).f75521u.put(bLiveIntlLiveTemplatesCdnData);
        h5j0.INSTANCE.m129405d("intl_template_cdn_error");
        return ia20.m135119c(new v9j() { // from class: l.q8o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upv.f177677c.auth().m185898q(bLiveIntlLiveTemplatesCdnData.url).m185887f().m185883b();
            }
        }, BLiveIntlTemplateData.JSON_ADAPTER).filter(new w9j() { // from class: l.r8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveIntlTemplateData) obj));
            }
        }).map(new w9j() { // from class: l.s8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u8o.m192208b((BLiveIntlTemplateData) obj);
            }
        }).flatMap(new w9j() { // from class: l.t8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(new Pair((BLiveIntlTemplateData) obj, bLiveIntlLiveTemplatesCdnData));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m192215i(final BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData) {
        C22306c.just(soj0.f165695a).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.n8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u8o.m192207a(bLiveIntlLiveTemplatesCdnData, (soj0) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.o8o
            @Override // p149l.e30
            public final void call(Object obj) {
                u8o.m192211e((Pair) obj);
            }
        }, new e30() { // from class: l.p8o
            @Override // p149l.e30
            public final void call(Object obj) {
                u8o.m192212f((Throwable) obj);
            }
        }));
    }
}
