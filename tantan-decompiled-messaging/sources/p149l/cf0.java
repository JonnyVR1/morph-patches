package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AiAlbumCheckEnvelope;
import com.p046p1.mobile.putong.core.data.AiAlbumCheckingData;
import com.p046p1.mobile.putong.core.data.AiAlbumRenderEnvelope;
import com.p046p1.mobile.putong.core.data.AiAlbumStatusData;
import com.p046p1.mobile.putong.core.data.AiAlbumStatusEnvelope;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import com.p046p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumPickerView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class cf0 extends aj2<df0> {

    /* JADX INFO: renamed from: c */
    public Act f80518c;

    /* JADX INFO: renamed from: d */
    public szd f80519d;

    /* JADX INFO: renamed from: e */
    public String f80520e;

    /* JADX INFO: renamed from: f */
    public String f80521f;

    /* JADX INFO: renamed from: g */
    public List<Media> f80522g;

    /* JADX INFO: renamed from: h */
    public List<jf0> f80523h;

    /* JADX INFO: renamed from: i */
    public List<jf0> f80524i;

    /* JADX INFO: renamed from: j */
    public c4g0 f80525j;

    /* JADX INFO: renamed from: k */
    public c4g0 f80526k;

    /* JADX INFO: renamed from: l */
    public c4g0 f80527l;

    /* JADX INFO: renamed from: m */
    public c4g0 f80528m;

    /* JADX INFO: renamed from: n */
    public c4g0 f80529n;

    /* JADX INFO: renamed from: o */
    public boolean f80530o;

    /* JADX INFO: renamed from: p */
    public cwf0 f80531p;

    /* JADX INFO: renamed from: q */
    public int f80532q;

    public cf0(Act act, e0e e0eVar) {
        super(e0eVar);
        this.f80522g = new ArrayList();
        this.f80523h = new ArrayList();
        this.f80524i = new ArrayList();
        this.f80518c = act;
        this.f80519d = (szd) e0eVar;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m106414A(AiAlbumCheckingData aiAlbumCheckingData, jf0 jf0Var) {
        if (aiAlbumCheckingData.good.contains(jf0Var.f117622c)) {
            jf0Var.f117620a = 1;
        }
        if (aiAlbumCheckingData.bad.contains(jf0Var.f117622c)) {
            jf0Var.f117620a = 2;
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Boolean m106416D(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m106420H(jf0 jf0Var, jf0 jf0Var2) {
        if (jf0Var == null || jf0Var2 == null) {
            return 0;
        }
        return jf0Var2.f117620a - jf0Var.f117620a;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m106421I(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m106423d(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    private void m106427g0() {
        szd szdVar = this.f80519d;
        if (szdVar == null || szdVar.isShowing()) {
            return;
        }
        this.f80519d.show();
        m106468j0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m106428h(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m106429k(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m106436t(AiAlbumCheckingData aiAlbumCheckingData, jf0 jf0Var) {
        if (aiAlbumCheckingData.good.contains(jf0Var.f117622c)) {
            jf0Var.f117620a = 1;
        } else {
            jf0Var.f117620a = 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m106438v(Throwable th) {
    }

    /* JADX INFO: renamed from: J */
    public void m106443J() {
        if (NullChecker.m81303a(this.f80519d)) {
            this.f80519d.dismiss();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m106444K() {
        mkd0.m154992z(this.f80526k);
        this.f80526k = duringCreated(CoreModule.f17545c.f19623Y1.m161802m3(qib0.f154717f0, CoreModule.f17545c.f19639e0.m169527p9().gender.toString())).subscribe(mkd0.m154956H(new e30() { // from class: l.ze0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202756a.m106446M((AiAlbumTemplatesEnvelope) obj);
            }
        }, new e30() { // from class: l.af0
            @Override // p149l.e30
            public final void call(Object obj) {
                cf0.m106423d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final List<jf0> m106445L(final AiAlbumCheckingData aiAlbumCheckingData) {
        this.f80523h.clear();
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                this.f80523h.addAll(vwb.m200303Q(aiAlbumCheckingData.good, new w9j() { // from class: l.ge0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return new jf0(1).m141170b((String) obj);
                    }
                }));
                break;
            case "add":
                this.f80523h.addAll(vwb.m200303Q(aiAlbumCheckingData.good, new w9j() { // from class: l.he0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return new jf0(1).m141170b((String) obj);
                    }
                }));
                this.f80523h.addAll(vwb.m200303Q(aiAlbumCheckingData.bad, new w9j() { // from class: l.ie0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return new jf0(2).m141170b((String) obj);
                    }
                }));
                break;
            case "wait":
                ArrayList arrayListM200303Q = vwb.m200303Q(aiAlbumCheckingData.origin, new w9j() { // from class: l.ee0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        String str2 = (String) obj;
                        return new jf0(aiAlbumCheckingData.good.contains(str2) ? 1 : 0).m141170b(str2);
                    }
                });
                Collections.sort(arrayListM200303Q, new Comparator() { // from class: l.fe0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return cf0.m106420H((jf0) obj, (jf0) obj2);
                    }
                });
                this.f80523h.addAll(arrayListM200303Q);
                break;
        }
        return this.f80523h;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m106446M(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
        m106427g0();
        ((df0) this.f70081a).f85877f.m44307X(aiAlbumTemplatesEnvelope);
        m106469k0();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m106447N(AiAlbumCheckEnvelope aiAlbumCheckEnvelope) {
        m106472n0(aiAlbumCheckEnvelope.data);
        ((df0) this.f70081a).f85878g.m44271S(aiAlbumCheckEnvelope.data, this.f80523h);
        if0.INSTANCE.m135841f().put(Boolean.TRUE);
        this.f80530o = false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m106448O(Throwable th) {
        this.f80530o = false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m106449P(AiAlbumStatusEnvelope aiAlbumStatusEnvelope) {
        AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
        this.f80521f = aiAlbumStatusData.albumId;
        if (!TextUtils.isEmpty(aiAlbumStatusData.templateId)) {
            this.f80520e = aiAlbumStatusEnvelope.data.templateId;
        }
        AiAlbumStatusData aiAlbumStatusData2 = aiAlbumStatusEnvelope.data;
        this.f80532q = aiAlbumStatusData2.availableTimes;
        String str = aiAlbumStatusData2.status;
        str.getClass();
        switch (str) {
            case "failed":
                this.f80530o = false;
                ((df0) this.f70081a).m111412c("init");
                m106444K();
                break;
            case "finished":
                this.f80530o = false;
                ((df0) this.f70081a).m111412c(aiAlbumStatusEnvelope.data.status);
                m106427g0();
                ((df0) this.f70081a).f85880i.m44293b0(aiAlbumStatusEnvelope.data.finished);
                m106464e0();
                break;
            case "init":
                boolean z = this.f80530o;
                V v2 = this.f70081a;
                if (!z) {
                    ((df0) v2).m111412c(aiAlbumStatusEnvelope.data.status);
                    m106444K();
                    break;
                } else {
                    ((df0) v2).m111412c("checking");
                    m106427g0();
                    m106457X(String.valueOf(aiAlbumStatusEnvelope.data.checking.good.size()));
                    break;
                }
                break;
            case "processing":
                this.f80530o = false;
                ((df0) this.f70081a).m111412c(aiAlbumStatusEnvelope.data.status);
                m106427g0();
                ((df0) this.f70081a).f85879h.m44277Q(aiAlbumStatusEnvelope.data.processing);
                break;
            case "checking":
                ((df0) this.f70081a).m111412c(aiAlbumStatusEnvelope.data.status);
                m106427g0();
                if (!this.f80530o) {
                    AiAlbumPickerView aiAlbumPickerView = ((df0) this.f70081a).f85878g;
                    AiAlbumCheckingData aiAlbumCheckingData = aiAlbumStatusEnvelope.data.checking;
                    aiAlbumPickerView.m44271S(aiAlbumCheckingData, m106445L(aiAlbumCheckingData));
                }
                m106457X(String.valueOf(aiAlbumStatusEnvelope.data.checking.good.size()));
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m106450Q(final AiAlbumCheckingData aiAlbumCheckingData, List list) {
        this.f80522g.clear();
        this.f80522g.addAll(list);
        ((df0) this.f70081a).m111412c("checking");
        this.f80523h = vwb.m200339n(this.f80523h, new w9j() { // from class: l.be0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(aiAlbumCheckingData.good.contains(((jf0) obj).f117622c));
            }
        });
        ArrayList arrayListM200303Q = vwb.m200303Q(list, new w9j() { // from class: l.ce0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new jf0(0).m141169a(((Media) obj).url);
            }
        });
        this.f80524i = arrayListM200303Q;
        this.f80523h.addAll(arrayListM200303Q);
        ((df0) this.f70081a).f85878g.m44272T(this.f80523h);
        m106473o0(this.f80521f);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m106451R(roj0 roj0Var) {
        this.f80521f = "";
        this.f80520e = "";
        this.f80530o = false;
        m106459Z();
        if0.INSTANCE.m135840e().put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m106452S(List list) {
        this.f80522g.clear();
        this.f80522g.addAll(list);
        ((df0) this.f70081a).m111412c("checking");
        this.f80523h.clear();
        ArrayList arrayListM200303Q = vwb.m200303Q(this.f80522g, new w9j() { // from class: l.de0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new jf0(0).m141169a(((Media) obj).url);
            }
        });
        this.f80524i = arrayListM200303Q;
        this.f80523h.addAll(arrayListM200303Q);
        ((df0) this.f70081a).f85878g.m44272T(this.f80523h);
        m106473o0("");
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m106453T(AiAlbumRenderEnvelope aiAlbumRenderEnvelope) {
        ((df0) this.f70081a).m111412c(PaymentOrderStatus.processing);
        ((df0) this.f70081a).f85879h.m44277Q(aiAlbumRenderEnvelope.data.processing);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m106454U(Boolean bool) {
        m106459Z();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m106455V(String str, List list) {
        if (list == null || list.size() <= 0) {
            this.f80530o = false;
        } else {
            m106458Y(str, this.f80520e, vwb.m200303Q(list, new w9j() { // from class: l.oe0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).url;
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m106456W() {
        cwf0 cwf0Var = this.f80531p;
        if (cwf0Var != null) {
            i0e.m133796e(cwf0Var);
            mkd0.m154992z(this.f80529n);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m106457X(String str) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_ai_photo_self_photo", "AiAlbumPickerDialog");
        this.f80531p = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("intl_ai_photo_qualification_num", str));
        i0e.m133797f(this.f80531p);
    }

    /* JADX INFO: renamed from: Y */
    public final void m106458Y(String str, String str2, List<String> list) {
        if (this.f80524i.size() == list.size()) {
            for (int i = 0; i < this.f80524i.size(); i++) {
                this.f80524i.get(i).f117622c = list.get(i);
            }
        }
        mkd0.m154992z(this.f80527l);
        this.f80527l = duringCreated(CoreModule.f17545c.f19623Y1.m161803n3(str, str2, list)).subscribe(mkd0.m154956H(new e30() { // from class: l.pe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148381a.m106447N((AiAlbumCheckEnvelope) obj);
            }
        }, new e30() { // from class: l.qe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153982a.m106448O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m106459Z() {
        mkd0.m154992z(this.f80525j);
        this.f80525j = duringCreated(CoreModule.f17545c.f19623Y1.m161806q3()).subscribe(mkd0.m154956H(new e30() { // from class: l.ae0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68979a.m106449P((AiAlbumStatusEnvelope) obj);
            }
        }, new e30() { // from class: l.le0
            @Override // p149l.e30
            public final void call(Object obj) {
                cf0.m106428h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m106460a0() {
        if (this.f80530o) {
            return;
        }
        m106444K();
    }

    /* JADX INFO: renamed from: b0 */
    public void m106461b0(final AiAlbumCheckingData aiAlbumCheckingData) {
        cg0.m106639w(this.f80518c, aiAlbumCheckingData.bad.size(), new e30() { // from class: l.ue0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175980a.m106450Q(aiAlbumCheckingData, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m106462c0(String str, e30<Boolean> e30Var) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.name = String.valueOf(System.currentTimeMillis());
        pictureNew_.url = str;
        pictureNew_.mediaType = "image/*";
        cg0.m106641y(this.f80518c, pictureNew_, e30Var);
    }

    /* JADX INFO: renamed from: d0 */
    public void m106463d0() {
        duringCreated(CoreModule.f17545c.f19623Y1.m161805p3(this.f80521f)).subscribe(mkd0.m154956H(new e30() { // from class: l.xe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192513a.m106451R((roj0) obj);
            }
        }, new e30() { // from class: l.ye0
            @Override // p149l.e30
            public final void call(Object obj) {
                cf0.m106429k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m106464e0() {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_ai_photo_result", "AiAlbumResultDialog");
        this.f80531p = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: f0 */
    public void m106465f0(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.name = String.valueOf(System.currentTimeMillis());
        pictureNew_.url = str;
        pictureNew_.mediaType = "image/*";
        cg0.m106636t(this.f80518c, pictureNew_, null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m106466h0(AiAlbumTemplateData aiAlbumTemplateData) {
        this.f80520e = aiAlbumTemplateData.f20343id;
        cg0.m106639w(this.f80518c, 10, new e30() { // from class: l.bf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75266a.m106452S((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m106467i0() {
        duringCreated(CoreModule.f17545c.f19623Y1.m161804o3(this.f80521f)).subscribe(mkd0.m154956H(new e30() { // from class: l.ve0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181142a.m106453T((AiAlbumRenderEnvelope) obj);
            }
        }, new e30() { // from class: l.we0
            @Override // p149l.e30
            public final void call(Object obj) {
                cf0.m106438v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m106468j0() {
        if (NullChecker.m81303a(this.f80529n)) {
            mkd0.m154992z(this.f80529n);
        }
        this.f80529n = duringCreated(if0.INSTANCE.m135838c()).filter(new w9j() { // from class: l.je0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cf0.m106416D((Boolean) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ke0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122648a.m106454U((Boolean) obj);
            }
        }, new e30() { // from class: l.me0
            @Override // p149l.e30
            public final void call(Object obj) {
                cf0.m106421I((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m106469k0() {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_ai_photo_homepopup", "AiAlbumTemplatesDialog");
        this.f80531p = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m106470l0() {
        return this.f80532q <= 0;
    }

    /* JADX INFO: renamed from: m0 */
    public void m106471m0() {
        mkd0.m154992z(this.f80525j);
        mkd0.m154992z(this.f80526k);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m106472n0(final AiAlbumCheckingData aiAlbumCheckingData) {
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                vwb.m200354z(this.f80523h, new e30() { // from class: l.se0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((jf0) obj).f117620a = 1;
                    }
                });
                break;
            case "add":
                vwb.m200354z(this.f80523h, new e30() { // from class: l.te0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        cf0.m106414A(aiAlbumCheckingData, (jf0) obj);
                    }
                });
                break;
            case "wait":
                vwb.m200354z(this.f80523h, new e30() { // from class: l.re0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        cf0.m106436t(aiAlbumCheckingData, (jf0) obj);
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m106473o0(final String str) {
        if (this.f80522g.size() == 0) {
            return;
        }
        this.f80530o = true;
        mkd0.m154992z(this.f80528m);
        this.f80528m = cg0.m106640x(this.f80522g, new e30() { // from class: l.ne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138569a.m106455V(str, (List) obj);
            }
        });
    }
}
