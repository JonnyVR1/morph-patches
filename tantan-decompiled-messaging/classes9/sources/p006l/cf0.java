package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumPickerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AiAlbumCheckEnvelope;
import com.p1.mobile.putong.core.data.AiAlbumCheckingData;
import com.p1.mobile.putong.core.data.AiAlbumRenderEnvelope;
import com.p1.mobile.putong.core.data.AiAlbumStatusData;
import com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope;
import com.p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.aj2;
import l.c4g0;
import l.cwf0;
import l.e0e;
import l.e30;
import l.i0e;
import l.j760;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.szd;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cf0 extends aj2<df0> {

    /* JADX INFO: renamed from: c */
    public Act f9616c;

    /* JADX INFO: renamed from: d */
    public szd f9617d;

    /* JADX INFO: renamed from: e */
    public String f9618e;

    /* JADX INFO: renamed from: f */
    public String f9619f;

    /* JADX INFO: renamed from: g */
    public List<Media> f9620g;

    /* JADX INFO: renamed from: h */
    public List<jf0> f9621h;

    /* JADX INFO: renamed from: i */
    public List<jf0> f9622i;

    /* JADX INFO: renamed from: j */
    public c4g0 f9623j;

    /* JADX INFO: renamed from: k */
    public c4g0 f9624k;

    /* JADX INFO: renamed from: l */
    public c4g0 f9625l;

    /* JADX INFO: renamed from: m */
    public c4g0 f9626m;

    /* JADX INFO: renamed from: n */
    public c4g0 f9627n;

    /* JADX INFO: renamed from: o */
    public boolean f9628o;

    /* JADX INFO: renamed from: p */
    public cwf0 f9629p;

    /* JADX INFO: renamed from: q */
    public int f9630q;

    public cf0(Act act, e0e e0eVar) {
        super(e0eVar);
        this.f9620g = new ArrayList();
        this.f9621h = new ArrayList();
        this.f9622i = new ArrayList();
        this.f9616c = act;
        this.f9617d = (szd) e0eVar;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m13360A(AiAlbumCheckingData aiAlbumCheckingData, jf0 jf0Var) {
        if (aiAlbumCheckingData.good.contains(jf0Var.f15133c)) {
            jf0Var.f15131a = 1;
        }
        if (aiAlbumCheckingData.bad.contains(jf0Var.f15133c)) {
            jf0Var.f15131a = 2;
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Boolean m13362D(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m13366H(jf0 jf0Var, jf0 jf0Var2) {
        if (jf0Var == null || jf0Var2 == null) {
            return 0;
        }
        return jf0Var2.f15131a - jf0Var.f15131a;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m13367I(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13369d(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    private void m13373g0() {
        szd szdVar = this.f9617d;
        if (szdVar == null || szdVar.isShowing()) {
            return;
        }
        this.f9617d.show();
        m13414j0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13374h(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m13375k(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m13382t(AiAlbumCheckingData aiAlbumCheckingData, jf0 jf0Var) {
        if (aiAlbumCheckingData.good.contains(jf0Var.f15133c)) {
            jf0Var.f15131a = 1;
        } else {
            jf0Var.f15131a = 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m13384v(Throwable th) {
    }

    /* JADX INFO: renamed from: J */
    public void m13389J() {
        if (NullChecker.a(this.f9617d)) {
            this.f9617d.dismiss();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m13390K() {
        mkd0.z(this.f9624k);
        this.f9624k = duringCreated(CoreModule.f1534c.f3612Y1.m20241m3(qib0.f19808f0, CoreModule.f1534c.f3628e0.m21490p9().gender.toString())).subscribe(mkd0.H(new e30() { // from class: l.ze0
            public final void call(Object obj) {
                this.f28720a.m13392M((AiAlbumTemplatesEnvelope) obj);
            }
        }, new e30() { // from class: l.af0
            public final void call(Object obj) {
                cf0.m13369d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final List<jf0> m13391L(final AiAlbumCheckingData aiAlbumCheckingData) {
        this.f9621h.clear();
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                this.f9621h.addAll(vwb.Q(aiAlbumCheckingData.good, new w9j() { // from class: l.ge0
                    public final Object call(Object obj) {
                        return new jf0(1).m17437b((String) obj);
                    }
                }));
                break;
            case "add":
                this.f9621h.addAll(vwb.Q(aiAlbumCheckingData.good, new w9j() { // from class: l.he0
                    public final Object call(Object obj) {
                        return new jf0(1).m17437b((String) obj);
                    }
                }));
                this.f9621h.addAll(vwb.Q(aiAlbumCheckingData.bad, new w9j() { // from class: l.ie0
                    public final Object call(Object obj) {
                        return new jf0(2).m17437b((String) obj);
                    }
                }));
                break;
            case "wait":
                ArrayList arrayListQ = vwb.Q(aiAlbumCheckingData.origin, new w9j() { // from class: l.ee0
                    public final Object call(Object obj) {
                        String str2 = (String) obj;
                        return new jf0(aiAlbumCheckingData.good.contains(str2) ? 1 : 0).m17437b(str2);
                    }
                });
                Collections.sort(arrayListQ, new Comparator() { // from class: l.fe0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return cf0.m13366H((jf0) obj, (jf0) obj2);
                    }
                });
                this.f9621h.addAll(arrayListQ);
                break;
        }
        return this.f9621h;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m13392M(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
        m13373g0();
        ((df0) ((aj2) this).a).f10368f.m7263X(aiAlbumTemplatesEnvelope);
        m13415k0();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m13393N(AiAlbumCheckEnvelope aiAlbumCheckEnvelope) {
        m13418n0(aiAlbumCheckEnvelope.data);
        ((df0) ((aj2) this).a).f10369g.m7227S(aiAlbumCheckEnvelope.data, this.f9621h);
        if0.INSTANCE.m16651f().put(Boolean.TRUE);
        this.f9628o = false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m13394O(Throwable th) {
        this.f9628o = false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m13395P(AiAlbumStatusEnvelope aiAlbumStatusEnvelope) {
        AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
        this.f9619f = aiAlbumStatusData.albumId;
        if (!TextUtils.isEmpty(aiAlbumStatusData.templateId)) {
            this.f9618e = aiAlbumStatusEnvelope.data.templateId;
        }
        AiAlbumStatusData aiAlbumStatusData2 = aiAlbumStatusEnvelope.data;
        this.f9630q = aiAlbumStatusData2.availableTimes;
        String str = aiAlbumStatusData2.status;
        str.getClass();
        switch (str) {
            case "failed":
                this.f9628o = false;
                ((df0) ((aj2) this).a).m14011c("init");
                m13390K();
                break;
            case "finished":
                this.f9628o = false;
                ((df0) ((aj2) this).a).m14011c(aiAlbumStatusEnvelope.data.status);
                m13373g0();
                ((df0) ((aj2) this).a).f10371i.m7249b0(aiAlbumStatusEnvelope.data.finished);
                m13410e0();
                break;
            case "init":
                boolean z = this.f9628o;
                s7m s7mVar = ((aj2) this).a;
                if (!z) {
                    ((df0) s7mVar).m14011c(aiAlbumStatusEnvelope.data.status);
                    m13390K();
                    break;
                } else {
                    ((df0) s7mVar).m14011c("checking");
                    m13373g0();
                    m13403X(String.valueOf(aiAlbumStatusEnvelope.data.checking.good.size()));
                    break;
                }
                break;
            case "processing":
                this.f9628o = false;
                ((df0) ((aj2) this).a).m14011c(aiAlbumStatusEnvelope.data.status);
                m13373g0();
                ((df0) ((aj2) this).a).f10370h.m7233Q(aiAlbumStatusEnvelope.data.processing);
                break;
            case "checking":
                ((df0) ((aj2) this).a).m14011c(aiAlbumStatusEnvelope.data.status);
                m13373g0();
                if (!this.f9628o) {
                    AiAlbumPickerView aiAlbumPickerView = ((df0) ((aj2) this).a).f10369g;
                    AiAlbumCheckingData aiAlbumCheckingData = aiAlbumStatusEnvelope.data.checking;
                    aiAlbumPickerView.m7227S(aiAlbumCheckingData, m13391L(aiAlbumCheckingData));
                }
                m13403X(String.valueOf(aiAlbumStatusEnvelope.data.checking.good.size()));
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m13396Q(final AiAlbumCheckingData aiAlbumCheckingData, List list) {
        this.f9620g.clear();
        this.f9620g.addAll(list);
        ((df0) ((aj2) this).a).m14011c("checking");
        this.f9621h = vwb.n(this.f9621h, new w9j() { // from class: l.be0
            public final Object call(Object obj) {
                return Boolean.valueOf(aiAlbumCheckingData.good.contains(((jf0) obj).f15133c));
            }
        });
        ArrayList arrayListQ = vwb.Q(list, new w9j() { // from class: l.ce0
            public final Object call(Object obj) {
                return new jf0(0).m17436a(((Media) obj).url);
            }
        });
        this.f9622i = arrayListQ;
        this.f9621h.addAll(arrayListQ);
        ((df0) ((aj2) this).a).f10369g.m7228T(this.f9621h);
        m13419o0(this.f9619f);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m13397R(roj0 roj0Var) {
        this.f9619f = "";
        this.f9618e = "";
        this.f9628o = false;
        m13405Z();
        if0.INSTANCE.m16650e().put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13398S(List list) {
        this.f9620g.clear();
        this.f9620g.addAll(list);
        ((df0) ((aj2) this).a).m14011c("checking");
        this.f9621h.clear();
        ArrayList arrayListQ = vwb.Q(this.f9620g, new w9j() { // from class: l.de0
            public final Object call(Object obj) {
                return new jf0(0).m17436a(((Media) obj).url);
            }
        });
        this.f9622i = arrayListQ;
        this.f9621h.addAll(arrayListQ);
        ((df0) ((aj2) this).a).f10369g.m7228T(this.f9621h);
        m13419o0("");
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m13399T(AiAlbumRenderEnvelope aiAlbumRenderEnvelope) {
        ((df0) ((aj2) this).a).m14011c("processing");
        ((df0) ((aj2) this).a).f10370h.m7233Q(aiAlbumRenderEnvelope.data.processing);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m13400U(Boolean bool) {
        m13405Z();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m13401V(String str, List list) {
        if (list == null || list.size() <= 0) {
            this.f9628o = false;
        } else {
            m13404Y(str, this.f9618e, vwb.Q(list, new w9j() { // from class: l.oe0
                public final Object call(Object obj) {
                    return ((Media) obj).url;
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m13402W() {
        cwf0 cwf0Var = this.f9629p;
        if (cwf0Var != null) {
            i0e.e(cwf0Var);
            mkd0.z(this.f9627n);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m13403X(String str) {
        cwf0 cwf0VarC = i0e.c("p_intl_ai_photo_self_photo", "AiAlbumPickerDialog");
        this.f9629p = cwf0VarC;
        cwf0VarC.p(new j760[]{vwb.Y("intl_ai_photo_qualification_num", str)});
        i0e.f(this.f9629p);
    }

    /* JADX INFO: renamed from: Y */
    public final void m13404Y(String str, String str2, List<String> list) {
        if (this.f9622i.size() == list.size()) {
            for (int i = 0; i < this.f9622i.size(); i++) {
                this.f9622i.get(i).f15133c = list.get(i);
            }
        }
        mkd0.z(this.f9625l);
        this.f9625l = duringCreated(CoreModule.f1534c.f3612Y1.m20242n3(str, str2, list)).subscribe(mkd0.H(new e30() { // from class: l.pe0
            public final void call(Object obj) {
                this.f18695a.m13393N((AiAlbumCheckEnvelope) obj);
            }
        }, new e30() { // from class: l.qe0
            public final void call(Object obj) {
                this.f19723a.m13394O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m13405Z() {
        mkd0.z(this.f9623j);
        this.f9623j = duringCreated(CoreModule.f1534c.f3612Y1.m20245q3()).subscribe(mkd0.H(new e30() { // from class: l.ae0
            public final void call(Object obj) {
                this.f8228a.m13395P((AiAlbumStatusEnvelope) obj);
            }
        }, new e30() { // from class: l.le0
            public final void call(Object obj) {
                cf0.m13374h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m13406a0() {
        if (this.f9628o) {
            return;
        }
        m13390K();
    }

    /* JADX INFO: renamed from: b0 */
    public void m13407b0(final AiAlbumCheckingData aiAlbumCheckingData) {
        cg0.m13451w(this.f9616c, aiAlbumCheckingData.bad.size(), new e30() { // from class: l.ue0
            public final void call(Object obj) {
                this.f23500a.m13396Q(aiAlbumCheckingData, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m13408c0(String str, e30<Boolean> e30Var) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).name = String.valueOf(System.currentTimeMillis());
        ((Media) pictureNew_).url = str;
        ((Media) pictureNew_).mediaType = "image/*";
        cg0.m13453y(this.f9616c, pictureNew_, e30Var);
    }

    /* JADX INFO: renamed from: d0 */
    public void m13409d0() {
        duringCreated(CoreModule.f1534c.f3612Y1.m20244p3(this.f9619f)).subscribe(mkd0.H(new e30() { // from class: l.xe0
            public final void call(Object obj) {
                this.f27464a.m13397R((roj0) obj);
            }
        }, new e30() { // from class: l.ye0
            public final void call(Object obj) {
                cf0.m13375k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13410e0() {
        cwf0 cwf0VarC = i0e.c("p_intl_ai_photo_result", "AiAlbumResultDialog");
        this.f9629p = cwf0VarC;
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: f0 */
    public void m13411f0(String str) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).name = String.valueOf(System.currentTimeMillis());
        ((Media) pictureNew_).url = str;
        ((Media) pictureNew_).mediaType = "image/*";
        cg0.m13448t(this.f9616c, pictureNew_, null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m13412h0(AiAlbumTemplateData aiAlbumTemplateData) {
        this.f9618e = aiAlbumTemplateData.id;
        cg0.m13451w(this.f9616c, 10, new e30() { // from class: l.bf0
            public final void call(Object obj) {
                this.f8855a.m13398S((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m13413i0() {
        duringCreated(CoreModule.f1534c.f3612Y1.m20243o3(this.f9619f)).subscribe(mkd0.H(new e30() { // from class: l.ve0
            public final void call(Object obj) {
                this.f24284a.m13399T((AiAlbumRenderEnvelope) obj);
            }
        }, new e30() { // from class: l.we0
            public final void call(Object obj) {
                cf0.m13384v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m13414j0() {
        if (NullChecker.a(this.f9627n)) {
            mkd0.z(this.f9627n);
        }
        this.f9627n = duringCreated(if0.INSTANCE.m16648c()).filter(new w9j() { // from class: l.je0
            public final Object call(Object obj) {
                return cf0.m13362D((Boolean) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ke0
            public final void call(Object obj) {
                this.f15783a.m13400U((Boolean) obj);
            }
        }, new e30() { // from class: l.me0
            public final void call(Object obj) {
                cf0.m13367I((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m13415k0() {
        cwf0 cwf0VarC = i0e.c("p_intl_ai_photo_homepopup", "AiAlbumTemplatesDialog");
        this.f9629p = cwf0VarC;
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m13416l0() {
        return this.f9630q <= 0;
    }

    /* JADX INFO: renamed from: m0 */
    public void m13417m0() {
        mkd0.z(this.f9623j);
        mkd0.z(this.f9624k);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m13418n0(final AiAlbumCheckingData aiAlbumCheckingData) {
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                vwb.z(this.f9621h, new e30() { // from class: l.se0
                    public final void call(Object obj) {
                        ((jf0) obj).f15131a = 1;
                    }
                });
                break;
            case "add":
                vwb.z(this.f9621h, new e30() { // from class: l.te0
                    public final void call(Object obj) {
                        cf0.m13360A(aiAlbumCheckingData, (jf0) obj);
                    }
                });
                break;
            case "wait":
                vwb.z(this.f9621h, new e30() { // from class: l.re0
                    public final void call(Object obj) {
                        cf0.m13382t(aiAlbumCheckingData, (jf0) obj);
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m13419o0(final String str) {
        if (this.f9620g.size() == 0) {
            return;
        }
        this.f9628o = true;
        mkd0.z(this.f9626m);
        this.f9626m = cg0.m13452x(this.f9620g, new e30() { // from class: l.ne0
            public final void call(Object obj) {
                this.f17622a.m13401V(str, (List) obj);
            }
        });
    }
}
