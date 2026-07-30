package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AiAlbumCheckEnvelope;
import com.p051p1.mobile.putong.core.data.AiAlbumCheckingData;
import com.p051p1.mobile.putong.core.data.AiAlbumRenderEnvelope;
import com.p051p1.mobile.putong.core.data.AiAlbumStatusData;
import com.p051p1.mobile.putong.core.data.AiAlbumStatusEnvelope;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import com.p051p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumPickerView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ye0 extends ij2<ze0> {

    /* JADX INFO: renamed from: c */
    public Act f198640c;

    /* JADX INFO: renamed from: d */
    public g1e f198641d;

    /* JADX INFO: renamed from: e */
    public String f198642e;

    /* JADX INFO: renamed from: f */
    public String f198643f;

    /* JADX INFO: renamed from: g */
    public List<Media> f198644g;

    /* JADX INFO: renamed from: h */
    public List<ff0> f198645h;

    /* JADX INFO: renamed from: i */
    public List<ff0> f198646i;

    /* JADX INFO: renamed from: j */
    public kcg0 f198647j;

    /* JADX INFO: renamed from: k */
    public kcg0 f198648k;

    /* JADX INFO: renamed from: l */
    public kcg0 f198649l;

    /* JADX INFO: renamed from: m */
    public kcg0 f198650m;

    /* JADX INFO: renamed from: n */
    public kcg0 f198651n;

    /* JADX INFO: renamed from: o */
    public boolean f198652o;

    /* JADX INFO: renamed from: p */
    public l4g0 f198653p;

    /* JADX INFO: renamed from: q */
    public int f198654q;

    public ye0(Act act, s1e s1eVar) {
        super(s1eVar);
        this.f198644g = new ArrayList();
        this.f198645h = new ArrayList();
        this.f198646i = new ArrayList();
        this.f198640c = act;
        this.f198641d = (g1e) s1eVar;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m215333A(AiAlbumCheckingData aiAlbumCheckingData, ff0 ff0Var) {
        if (aiAlbumCheckingData.good.contains(ff0Var.f98730c)) {
            ff0Var.f98728a = 1;
        }
        if (aiAlbumCheckingData.bad.contains(ff0Var.f98730c)) {
            ff0Var.f98728a = 2;
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Boolean m215335D(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m215339H(ff0 ff0Var, ff0 ff0Var2) {
        if (ff0Var == null || ff0Var2 == null) {
            return 0;
        }
        return ff0Var2.f98728a - ff0Var.f98728a;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m215340I(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m215342d(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    private void m215346g0() {
        g1e g1eVar = this.f198641d;
        if (g1eVar == null || g1eVar.isShowing()) {
            return;
        }
        this.f198641d.show();
        m215387j0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m215347h(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m215348k(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m215355t(AiAlbumCheckingData aiAlbumCheckingData, ff0 ff0Var) {
        if (aiAlbumCheckingData.good.contains(ff0Var.f98730c)) {
            ff0Var.f98728a = 1;
        } else {
            ff0Var.f98728a = 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m215357v(Throwable th) {
    }

    /* JADX INFO: renamed from: J */
    public void m215362J() {
        if (NullChecker.m82486a(this.f198641d)) {
            this.f198641d.dismiss();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m215363K() {
        psd0.m173633z(this.f198648k);
        this.f198648k = duringCreated(CoreModule.f18264c.f20365Y1.m178592m3(uqb0.f180400f0, CoreModule.f18264c.f20381e0.m116600p9().gender.toString())).subscribe(psd0.m173597H(new y20() { // from class: l.ve0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183694a.m215365M((AiAlbumTemplatesEnvelope) obj);
            }
        }, new y20() { // from class: l.we0
            @Override // p153l.y20
            public final void call(Object obj) {
                ye0.m215342d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final List<ff0> m215364L(final AiAlbumCheckingData aiAlbumCheckingData) {
        this.f198645h.clear();
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                this.f198645h.addAll(jyb.m147486Q(aiAlbumCheckingData.good, new qcj() { // from class: l.ce0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return new ff0(1).m125339b((String) obj);
                    }
                }));
                break;
            case "add":
                this.f198645h.addAll(jyb.m147486Q(aiAlbumCheckingData.good, new qcj() { // from class: l.de0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return new ff0(1).m125339b((String) obj);
                    }
                }));
                this.f198645h.addAll(jyb.m147486Q(aiAlbumCheckingData.bad, new qcj() { // from class: l.ee0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return new ff0(2).m125339b((String) obj);
                    }
                }));
                break;
            case "wait":
                ArrayList arrayListM147486Q = jyb.m147486Q(aiAlbumCheckingData.origin, new qcj() { // from class: l.ae0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        String str2 = (String) obj;
                        return new ff0(aiAlbumCheckingData.good.contains(str2) ? 1 : 0).m125339b(str2);
                    }
                });
                Collections.sort(arrayListM147486Q, new Comparator() { // from class: l.be0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ye0.m215339H((ff0) obj, (ff0) obj2);
                    }
                });
                this.f198645h.addAll(arrayListM147486Q);
                break;
        }
        return this.f198645h;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m215365M(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
        m215346g0();
        ((ze0) this.f115168a).f203961f.m45490X(aiAlbumTemplatesEnvelope);
        m215388k0();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m215366N(AiAlbumCheckEnvelope aiAlbumCheckEnvelope) {
        m215391n0(aiAlbumCheckEnvelope.data);
        ((ze0) this.f115168a).f203962g.m45454S(aiAlbumCheckEnvelope.data, this.f198645h);
        ef0.INSTANCE.m120577f().put(Boolean.TRUE);
        this.f198652o = false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m215367O(Throwable th) {
        this.f198652o = false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m215368P(AiAlbumStatusEnvelope aiAlbumStatusEnvelope) {
        AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
        this.f198643f = aiAlbumStatusData.albumId;
        if (!TextUtils.isEmpty(aiAlbumStatusData.templateId)) {
            this.f198642e = aiAlbumStatusEnvelope.data.templateId;
        }
        AiAlbumStatusData aiAlbumStatusData2 = aiAlbumStatusEnvelope.data;
        this.f198654q = aiAlbumStatusData2.availableTimes;
        String str = aiAlbumStatusData2.status;
        str.getClass();
        switch (str) {
            case "failed":
                this.f198652o = false;
                ((ze0) this.f115168a).m219392c("init");
                m215363K();
                break;
            case "finished":
                this.f198652o = false;
                ((ze0) this.f115168a).m219392c(aiAlbumStatusEnvelope.data.status);
                m215346g0();
                ((ze0) this.f115168a).f203964i.m45476b0(aiAlbumStatusEnvelope.data.finished);
                m215383e0();
                break;
            case "init":
                boolean z = this.f198652o;
                V v2 = this.f115168a;
                if (!z) {
                    ((ze0) v2).m219392c(aiAlbumStatusEnvelope.data.status);
                    m215363K();
                    break;
                } else {
                    ((ze0) v2).m219392c("checking");
                    m215346g0();
                    m215376X(String.valueOf(aiAlbumStatusEnvelope.data.checking.good.size()));
                    break;
                }
                break;
            case "processing":
                this.f198652o = false;
                ((ze0) this.f115168a).m219392c(aiAlbumStatusEnvelope.data.status);
                m215346g0();
                ((ze0) this.f115168a).f203963h.m45460Q(aiAlbumStatusEnvelope.data.processing);
                break;
            case "checking":
                ((ze0) this.f115168a).m219392c(aiAlbumStatusEnvelope.data.status);
                m215346g0();
                if (!this.f198652o) {
                    AiAlbumPickerView aiAlbumPickerView = ((ze0) this.f115168a).f203962g;
                    AiAlbumCheckingData aiAlbumCheckingData = aiAlbumStatusEnvelope.data.checking;
                    aiAlbumPickerView.m45454S(aiAlbumCheckingData, m215364L(aiAlbumCheckingData));
                }
                m215376X(String.valueOf(aiAlbumStatusEnvelope.data.checking.good.size()));
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m215369Q(final AiAlbumCheckingData aiAlbumCheckingData, List list) {
        this.f198644g.clear();
        this.f198644g.addAll(list);
        ((ze0) this.f115168a).m219392c("checking");
        this.f198645h = jyb.m147522n(this.f198645h, new qcj() { // from class: l.xd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(aiAlbumCheckingData.good.contains(((ff0) obj).f98730c));
            }
        });
        ArrayList arrayListM147486Q = jyb.m147486Q(list, new qcj() { // from class: l.yd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new ff0(0).m125338a(((Media) obj).url);
            }
        });
        this.f198646i = arrayListM147486Q;
        this.f198645h.addAll(arrayListM147486Q);
        ((ze0) this.f115168a).f203962g.m45455T(this.f198645h);
        m215392o0(this.f198643f);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m215370R(uxj0 uxj0Var) {
        this.f198643f = "";
        this.f198642e = "";
        this.f198652o = false;
        m215378Z();
        ef0.INSTANCE.m120576e().put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m215371S(List list) {
        this.f198644g.clear();
        this.f198644g.addAll(list);
        ((ze0) this.f115168a).m219392c("checking");
        this.f198645h.clear();
        ArrayList arrayListM147486Q = jyb.m147486Q(this.f198644g, new qcj() { // from class: l.zd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new ff0(0).m125338a(((Media) obj).url);
            }
        });
        this.f198646i = arrayListM147486Q;
        this.f198645h.addAll(arrayListM147486Q);
        ((ze0) this.f115168a).f203962g.m45455T(this.f198645h);
        m215392o0("");
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m215372T(AiAlbumRenderEnvelope aiAlbumRenderEnvelope) {
        ((ze0) this.f115168a).m219392c(PaymentOrderStatus.processing);
        ((ze0) this.f115168a).f203963h.m45460Q(aiAlbumRenderEnvelope.data.processing);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m215373U(Boolean bool) {
        m215378Z();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m215374V(String str, List list) {
        if (list == null || list.size() <= 0) {
            this.f198652o = false;
        } else {
            m215377Y(str, this.f198642e, jyb.m147486Q(list, new qcj() { // from class: l.ke0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).url;
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m215375W() {
        l4g0 l4g0Var = this.f198653p;
        if (l4g0Var != null) {
            w1e.m204401e(l4g0Var);
            psd0.m173633z(this.f198651n);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m215376X(String str) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_ai_photo_self_photo", "AiAlbumPickerDialog");
        this.f198653p = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("intl_ai_photo_qualification_num", str));
        w1e.m204402f(this.f198653p);
    }

    /* JADX INFO: renamed from: Y */
    public final void m215377Y(String str, String str2, List<String> list) {
        if (this.f198646i.size() == list.size()) {
            for (int i = 0; i < this.f198646i.size(); i++) {
                this.f198646i.get(i).f98730c = list.get(i);
            }
        }
        psd0.m173633z(this.f198649l);
        this.f198649l = duringCreated(CoreModule.f18264c.f20365Y1.m178593n3(str, str2, list)).subscribe(psd0.m173597H(new y20() { // from class: l.le0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131687a.m215366N((AiAlbumCheckEnvelope) obj);
            }
        }, new y20() { // from class: l.me0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136423a.m215367O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m215378Z() {
        psd0.m173633z(this.f198647j);
        this.f198647j = duringCreated(CoreModule.f18264c.f20365Y1.m178596q3()).subscribe(psd0.m173597H(new y20() { // from class: l.wd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188521a.m215368P((AiAlbumStatusEnvelope) obj);
            }
        }, new y20() { // from class: l.he0
            @Override // p153l.y20
            public final void call(Object obj) {
                ye0.m215347h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m215379a0() {
        if (this.f198652o) {
            return;
        }
        m215363K();
    }

    /* JADX INFO: renamed from: b0 */
    public void m215380b0(final AiAlbumCheckingData aiAlbumCheckingData) {
        yf0.m215513w(this.f198640c, aiAlbumCheckingData.bad.size(), new y20() { // from class: l.qe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156779a.m215369Q(aiAlbumCheckingData, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m215381c0(String str, y20<Boolean> y20Var) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.name = String.valueOf(System.currentTimeMillis());
        pictureNew_.url = str;
        pictureNew_.mediaType = "image/*";
        yf0.m215515y(this.f198640c, pictureNew_, y20Var);
    }

    /* JADX INFO: renamed from: d0 */
    public void m215382d0() {
        duringCreated(CoreModule.f18264c.f20365Y1.m178595p3(this.f198643f)).subscribe(psd0.m173597H(new y20() { // from class: l.te0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173416a.m215370R((uxj0) obj);
            }
        }, new y20() { // from class: l.ue0
            @Override // p153l.y20
            public final void call(Object obj) {
                ye0.m215348k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m215383e0() {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_ai_photo_result", "AiAlbumResultDialog");
        this.f198653p = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: f0 */
    public void m215384f0(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.name = String.valueOf(System.currentTimeMillis());
        pictureNew_.url = str;
        pictureNew_.mediaType = "image/*";
        yf0.m215510t(this.f198640c, pictureNew_, null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m215385h0(AiAlbumTemplateData aiAlbumTemplateData) {
        this.f198642e = aiAlbumTemplateData.f21085id;
        yf0.m215513w(this.f198640c, 10, new y20() { // from class: l.xe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193656a.m215371S((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m215386i0() {
        duringCreated(CoreModule.f18264c.f20365Y1.m178594o3(this.f198643f)).subscribe(psd0.m173597H(new y20() { // from class: l.re0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162368a.m215372T((AiAlbumRenderEnvelope) obj);
            }
        }, new y20() { // from class: l.se0
            @Override // p153l.y20
            public final void call(Object obj) {
                ye0.m215357v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m215387j0() {
        if (NullChecker.m82486a(this.f198651n)) {
            psd0.m173633z(this.f198651n);
        }
        this.f198651n = duringCreated(ef0.INSTANCE.m120574c()).filter(new qcj() { // from class: l.fe0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ye0.m215335D((Boolean) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ge0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103758a.m215373U((Boolean) obj);
            }
        }, new y20() { // from class: l.ie0
            @Override // p153l.y20
            public final void call(Object obj) {
                ye0.m215340I((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m215388k0() {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_ai_photo_homepopup", "AiAlbumTemplatesDialog");
        this.f198653p = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m215389l0() {
        return this.f198654q <= 0;
    }

    /* JADX INFO: renamed from: m0 */
    public void m215390m0() {
        psd0.m173633z(this.f198647j);
        psd0.m173633z(this.f198648k);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m215391n0(final AiAlbumCheckingData aiAlbumCheckingData) {
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                jyb.m147537z(this.f198645h, new y20() { // from class: l.oe0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((ff0) obj).f98728a = 1;
                    }
                });
                break;
            case "add":
                jyb.m147537z(this.f198645h, new y20() { // from class: l.pe0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ye0.m215333A(aiAlbumCheckingData, (ff0) obj);
                    }
                });
                break;
            case "wait":
                jyb.m147537z(this.f198645h, new y20() { // from class: l.ne0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ye0.m215355t(aiAlbumCheckingData, (ff0) obj);
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m215392o0(final String str) {
        if (this.f198644g.size() == 0) {
            return;
        }
        this.f198652o = true;
        psd0.m173633z(this.f198650m);
        this.f198650m = yf0.m215514x(this.f198644g, new y20() { // from class: l.je0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120377a.m215374V(str, (List) obj);
            }
        });
    }
}
