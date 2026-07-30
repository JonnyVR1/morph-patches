package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.RealPictureInfo;
import com.p051p1.mobile.putong.core.data.RealPicturesInfo;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskItemUploadProfileView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadGuideImageView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadImageReplaceAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.HashMap;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.b83;
import p153l.bnl0;
import p153l.ey0;
import p153l.g3k0;
import p153l.gj40;
import p153l.gra;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.mni0;
import p153l.p8b;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.tk5;
import p153l.x20;
import p153l.y20;
import p153l.y63;

/* JADX INFO: loaded from: classes11.dex */
public class CoreTaskItemUploadProfileView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f27461c;

    /* JADX INFO: renamed from: d */
    public UploadGuideImageView f27462d;

    /* JADX INFO: renamed from: e */
    public VText f27463e;

    /* JADX INFO: renamed from: f */
    public View f27464f;

    /* JADX INFO: renamed from: g */
    public UploadGuideImageView f27465g;

    /* JADX INFO: renamed from: h */
    public VText f27466h;

    /* JADX INFO: renamed from: i */
    public VText f27467i;

    /* JADX INFO: renamed from: j */
    public View f27468j;

    /* JADX INFO: renamed from: k */
    public RealPicturesInfo f27469k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f27470l;

    /* JADX INFO: renamed from: m */
    public kcg0 f27471m;

    public CoreTaskItemUploadProfileView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m44484P(View view) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m44486R(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m44489V(View view) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m44490W(Act act, View view) {
        tk5.C20336a c20336aM191527i = new tk5.C20336a(act).m191529k("上传后展示在你的资料页中").m191528j("展示更多照片，认识更多真实的人").m191526h("我知道了").m191527i(true);
        int i = qa00.f156310W;
        c20336aM191527i.m191525g(i, i).m191524f("https://auto.tancdn.com/v1/images/eyJpZCI6IkNRQTJBQ1NGVkZJVzdTRk1ENE0yMkVGTUIyRjJPRTE0IiwidyI6NTM0LCJoIjo1MzQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM4MzAyMzE3NDAyMDk4OTU3fQ.png").m191523e("").m191522d(jyb.m147494Y("", "")).m191520b(true).m191519a().show();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m44496c0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m44499f0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m44503j0(View view) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m44505l0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m44513A0(int i, Media media, NewTags newTags, p8b p8bVar) {
        if (i == 2) {
            bnl0.m105524M(this.f27465g, true);
            this.f27465g.m44698d(2, "审核中", media.url);
            this.f27465g.setRefusedClickCallback(new x20() { // from class: l.z8b
                @Override // p153l.x20
                public final void call() {
                    this.f203332a.m44541y0();
                }
            });
            this.f27465g.setOnClickListener(new View.OnClickListener() { // from class: l.a9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44496c0(view);
                }
            });
            if (newTags != null) {
                bnl0.m105524M(this.f27466h, true);
                this.f27466h.setText(newTags.name);
            }
            i4g0.m138495D("e_task_center_upload_photo_success", p8bVar.act().pageId(), jyb.m147494Y("task_center_photo_type", "full"), jyb.m147494Y("is_outdoor_full_uploaded", Boolean.valueOf(bnl0.m105529O0(this.f27462d))));
            return;
        }
        if (i == 1) {
            bnl0.m105524M(this.f27462d, true);
            this.f27462d.m44698d(2, "审核中", media.url);
            this.f27462d.setRefusedClickCallback(new x20() { // from class: l.b9b
                @Override // p153l.x20
                public final void call() {
                    this.f75530a.m44542z0();
                }
            });
            this.f27462d.setOnClickListener(new View.OnClickListener() { // from class: l.c9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44489V(view);
                }
            });
            if (newTags != null) {
                bnl0.m105524M(this.f27463e, true);
                this.f27463e.setText(newTags.name);
            }
            i4g0.m138495D("e_task_center_upload_photo_success", p8bVar.act().pageId(), jyb.m147494Y("task_center_photo_type", "outdoor"), jyb.m147494Y("is_outdoor_full_uploaded", Boolean.valueOf(bnl0.m105529O0(this.f27465g))));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m44514B0(final p8b p8bVar, final int i, int i2, final Media media) {
        final NewTags newTagsM130430O = !jyb.m147479J(media.tags) ? gj40.m130415o().m130430O(media.tags.get(0)) : null;
        m44531U0(p8bVar, i, i2, media, newTagsM130430O, new x20() { // from class: l.y8b
            @Override // p153l.x20
            public final void call() {
                this.f197961a.m44513A0(i, media, newTagsM130430O, p8bVar);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ boolean m44515D0(Act act, int i, p8b p8bVar, String str, int i2, int i3, Intent intent) {
        if (i3 != -1) {
            return false;
        }
        m44535Y0(act, i, p8bVar, intent.getIntExtra("EXTRA_REPLACE_INDEX", -1), str);
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m44516E0() {
        this.f27464f.callOnClick();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m44517G0() {
        this.f27461c.callOnClick();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m44518H0(int i, Media media) {
        if (i == 2) {
            bnl0.m105524M(this.f27465g, true);
            this.f27465g.m44698d(5, "上传失败", media.url);
            this.f27465g.setRefusedClickCallback(new x20() { // from class: l.j9b
                @Override // p153l.x20
                public final void call() {
                    this.f118863a.m44516E0();
                }
            });
            this.f27465g.setOnClickListener(new View.OnClickListener() { // from class: l.k9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44503j0(view);
                }
            });
            bnl0.m105524M(this.f27466h, false);
            return;
        }
        if (i == 1) {
            bnl0.m105524M(this.f27462d, true);
            this.f27462d.m44698d(5, "上传失败", media.url);
            this.f27462d.setRefusedClickCallback(new x20() { // from class: l.l9b
                @Override // p153l.x20
                public final void call() {
                    this.f130581a.m44517G0();
                }
            });
            this.f27462d.setOnClickListener(new View.OnClickListener() { // from class: l.m9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44505l0(view);
                }
            });
            bnl0.m105524M(this.f27463e, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m44519I0(Act act, p8b p8bVar, View view) {
        m44530T0(act, 1, p8bVar, null, -1);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m44520J0(Act act, p8b p8bVar, View view) {
        m44530T0(act, 2, p8bVar, null, -1);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m44521K0(Act act, p8b p8bVar) {
        m44533W0(act, p8bVar, "using");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m44522L0(String str, final p8b p8bVar, final Act act, View view) {
        if (TextUtils.equals(str, "satisfied")) {
            p8bVar.m171222s0(new x20() { // from class: l.t8b
                @Override // p153l.x20
                public final void call() {
                    this.f172515a.m44521K0(act, p8bVar);
                }
            });
            i4g0.m138523u("e_photo_award_boost", act.pageId(), jyb.m147494Y("photo_award_boost_status", "start_boost"));
        } else if (TextUtils.equals(str, "using")) {
            b83.m102910l(act, new x20() { // from class: l.u8b
                @Override // p153l.x20
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(xwa.m213311f(act2));
                }
            });
            i4g0.m138523u("e_photo_award_boost", act.pageId(), jyb.m147494Y("photo_award_boost_status", NavigationCardIntent.boosting));
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m44523M0(Act act, p8b p8bVar, Pair pair) {
        if (((Integer) pair.first).intValue() == 2) {
            m44533W0(act, p8bVar, "used");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m44524N0(Act act, int i, p8b p8bVar, final RealPictureInfo realPictureInfo) {
        m44530T0(act, i, p8bVar, realPictureInfo.reason, jyb.m147476G(CoreModule.f18264c.f20381e0.m116600p9().pictures, new qcj() { // from class: l.u9b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).url.equals(realPictureInfo.media.url));
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final String m44526P0(RealPictureInfo realPictureInfo, int i) {
        if (TextUtils.equals(realPictureInfo.status, "pending")) {
            return "审核中";
        }
        if (TextUtils.equals(realPictureInfo.status, "passed")) {
            return i == 1 ? "户外照通过" : "全身照通过";
        }
        return TextUtils.equals(realPictureInfo.status, "rejected") ? realPictureInfo.reason : "";
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m44527Q0(String str) {
        return (TextUtils.equals("landing_full_body", str) || TextUtils.equals("landing_outdoor", str)) ? "task_center" : "other";
    }

    /* JADX INFO: renamed from: R0 */
    public final int m44528R0(String str) {
        if (TextUtils.equals(str, "pending")) {
            return 2;
        }
        if (TextUtils.equals(str, "passed")) {
            return 1;
        }
        return TextUtils.equals(str, "rejected") ? 4 : 0;
    }

    /* JADX INFO: renamed from: S0 */
    public final String m44529S0(RealPictureInfo realPictureInfo) {
        if (realPictureInfo == null) {
            return "upload";
        }
        if (TextUtils.equals(realPictureInfo.status, "pending")) {
            return "review";
        }
        if (TextUtils.equals(realPictureInfo.status, "passed")) {
            return "success";
        }
        return TextUtils.equals(realPictureInfo.status, "rejected") ? "failed" : "upload";
    }

    /* JADX INFO: renamed from: T0 */
    public final void m44530T0(final Act act, final int i, final p8b p8bVar, final String str, int i2) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isProfileJailed()) {
            ey0.m123126h(act);
            return;
        }
        i4g0.m138523u("e_photo_award_photo", act.pageId(), jyb.m147494Y("task_center_photo_type", i == 1 ? "outdoor" : "full"), jyb.m147494Y("photo_award_photo_status", TextUtils.isEmpty(str) ? "upload" : "failed"), jyb.m147494Y("photo_award_failed_reason", str));
        if (i2 >= 0 || !(CoreModule.f18264c.f20381e0.m116600p9().pictures.size() == 9 || (gra.m131540A2() && CoreModule.f18264c.f20381e0.m116600p9().pictures.size() == 6))) {
            m44535Y0(act, i, p8bVar, i2, str);
        } else {
            act.startActivityForResult(i == 1 ? 16 : 17, UploadImageReplaceAct.m44702Z1(act), new C4468a.a() { // from class: l.s9b
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i3, int i4, Intent intent) {
                    return this.f166918a.m44515D0(act, i, p8bVar, str, i3, i4, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m44531U0(p8b p8bVar, final int i, int i2, final Media media, NewTags newTags, x20 x20Var) {
        p8bVar.m171220D0(media, i, i2, x20Var, new x20() { // from class: l.i9b
            @Override // p153l.x20
            public final void call() {
                this.f113457a.m44518H0(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m44532V0(final Act act, final p8b p8bVar, mni0 mni0Var) {
        Object obj = mni0Var.f137704b;
        if (obj instanceof RealPicturesInfo) {
            this.f27469k = (RealPicturesInfo) obj;
        }
        RealPicturesInfo realPicturesInfo = this.f27469k;
        if (realPicturesInfo != null) {
            m44534X0(act, this.f27462d, this.f27463e, realPicturesInfo.outdoor, 1, p8bVar);
            m44534X0(act, this.f27465g, this.f27466h, this.f27469k.fullBody, 2, p8bVar);
            m44533W0(act, p8bVar, this.f27469k.privilegeStatus);
            bnl0.m105509E0(this.f27461c, new View.OnClickListener() { // from class: l.s8b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166760a.m44519I0(act, p8bVar, view);
                }
            });
            bnl0.m105509E0(this.f27464f, new View.OnClickListener() { // from class: l.d9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85726a.m44520J0(act, p8bVar, view);
                }
            });
        }
        bnl0.m105509E0(this.f27468j, new View.OnClickListener() { // from class: l.n9b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreTaskItemUploadProfileView.m44490W(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final void m44533W0(final Act act, final p8b p8bVar, final String str) {
        String str2;
        this.f27467i.setEnabled("satisfied".equals(str) || "using".equals(str));
        if ("unsatisfied".equals(str)) {
            this.f27467i.setText("待获得优先推荐");
            str2 = "not_get_boost";
        } else if ("satisfied".equals(str)) {
            this.f27467i.setText("已获得优先推荐，去体验");
            str2 = "start_boost";
        } else if ("using".equals(str)) {
            this.f27467i.setText("优先推荐中");
            str2 = NavigationCardIntent.boosting;
        } else if ("used".equals(str)) {
            this.f27467i.setText("已使用");
            str2 = "boost_used";
        } else {
            str2 = "";
        }
        i4g0.m138492A("e_photo_award_boost", act.pageId(), jyb.m147494Y("photo_award_boost_status", str2));
        bnl0.m105509E0(this.f27467i, new View.OnClickListener() { // from class: l.o9b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145516a.m44522L0(str, p8bVar, act, view);
            }
        });
        psd0.m173633z(this.f27471m);
        if (TextUtils.equals("using", str)) {
            this.f27471m = y63.m214366j().m214372p(psd0.m173596G(new y20() { // from class: l.p9b
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151126a.m44523M0(act, p8bVar, (Pair) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m44534X0(final Act act, UploadGuideImageView uploadGuideImageView, VText vText, final RealPictureInfo realPictureInfo, final int i, final p8b p8bVar) {
        NewTags newTagsM130430O;
        HashMap map = new HashMap();
        if (realPictureInfo != null) {
            bnl0.m105524M(uploadGuideImageView, true);
            uploadGuideImageView.m44698d(m44528R0(realPictureInfo.status), m44526P0(realPictureInfo, i), realPictureInfo.media.url);
            if (!jyb.m147479J(realPictureInfo.media.tags) && !TextUtils.equals(realPictureInfo.status, "rejected") && (newTagsM130430O = gj40.m130415o().m130430O(realPictureInfo.media.tags.get(0))) != null) {
                bnl0.m105524M(vText, true);
                vText.setText(newTagsM130430O.name);
            }
            uploadGuideImageView.setRefusedClickCallback(new x20() { // from class: l.q9b
                @Override // p153l.x20
                public final void call() {
                    this.f156210a.m44524N0(act, i, p8bVar, realPictureInfo);
                }
            });
            uploadGuideImageView.setOnClickListener(new View.OnClickListener() { // from class: l.r9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44499f0(view);
                }
            });
            if (TextUtils.equals(realPictureInfo.status, "rejected")) {
                map.put("photo_award_failed_reason", realPictureInfo.reason);
            }
            map.put("photo_uploaded_source", m44527Q0(realPictureInfo.source));
        }
        map.put("photo_award_photo_status", m44529S0(realPictureInfo));
        map.put("task_center_photo_type", i == 1 ? "outdoor" : "full");
        i4g0.m138527y("e_photo_award_photo", act.pageId(), map);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m44535Y0(Act act, final int i, final p8b p8bVar, final int i2, String str) {
        g3k0 g3k0Var = new g3k0(act, i);
        g3k0Var.m128750F(new x20() { // from class: l.t9b
            @Override // p153l.x20
            public final void call() {
                this.f172620a.m44525O0(p8bVar, i, i2);
            }
        });
        g3k0Var.show();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f27461c = findViewById(adc0.f70438l9);
        this.f27462d = (UploadGuideImageView) findViewById(adc0.f70455m9);
        this.f27463e = (VText) findViewById(adc0.f70472n9);
        this.f27464f = findViewById(adc0.f69911G4);
        this.f27465g = (UploadGuideImageView) findViewById(adc0.f69928H4);
        this.f27466h = (VText) findViewById(adc0.f69945I4);
        this.f27467i = (VText) findViewById(adc0.f69992L0);
        this.f27468j = findViewById(adc0.f70383i4);
        this.f27470l = (SVGAnimationView) findViewById(adc0.f70629wd);
        this.f27462d.setSizeType(2);
        this.f27465g.setSizeType(2);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a65e326a-3d46-492c-9e18-73d717d82d8f14.svga").repeatCount(1).into(this.f27470l);
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final void m44525O0(final p8b p8bVar, final int i, final int i2) {
        if (gra.m131540A2()) {
            gta.m132210e().m132214d().mo34892np((Act) getContext(), new y20() { // from class: l.v8b
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182866a.m44540x0(p8bVar, i, i2, (Media) obj);
                }
            });
        } else {
            gta.m132210e().m132214d().mo34762Uj((Act) getContext(), new y20() { // from class: l.w8b
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187841a.m44514B0(p8bVar, i, i2, (Media) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m44537u0() {
        this.f27464f.callOnClick();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m44538v0() {
        this.f27461c.callOnClick();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m44539w0(int i, Media media, p8b p8bVar) {
        if (i == 2) {
            bnl0.m105524M(this.f27465g, true);
            this.f27465g.m44698d(2, "审核中", media.url);
            this.f27465g.setRefusedClickCallback(new x20() { // from class: l.e9b
                @Override // p153l.x20
                public final void call() {
                    this.f92612a.m44537u0();
                }
            });
            this.f27465g.setOnClickListener(new View.OnClickListener() { // from class: l.f9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44484P(view);
                }
            });
            i4g0.m138495D("e_task_center_upload_photo_success", p8bVar.act().pageId(), jyb.m147494Y("task_center_photo_type", "full"), jyb.m147494Y("is_outdoor_full_uploaded", Boolean.valueOf(bnl0.m105529O0(this.f27462d))));
            return;
        }
        if (i == 1) {
            bnl0.m105524M(this.f27462d, true);
            this.f27462d.m44698d(2, "审核中", media.url);
            this.f27462d.setRefusedClickCallback(new x20() { // from class: l.g9b
                @Override // p153l.x20
                public final void call() {
                    this.f102779a.m44538v0();
                }
            });
            this.f27462d.setOnClickListener(new View.OnClickListener() { // from class: l.h9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m44486R(view);
                }
            });
            i4g0.m138495D("e_task_center_upload_photo_success", p8bVar.act().pageId(), jyb.m147494Y("task_center_photo_type", "outdoor"), jyb.m147494Y("is_outdoor_full_uploaded", Boolean.valueOf(bnl0.m105529O0(this.f27465g))));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m44540x0(final p8b p8bVar, final int i, int i2, final Media media) {
        m44531U0(p8bVar, i, i2, media, null, new x20() { // from class: l.x8b
            @Override // p153l.x20
            public final void call() {
                this.f192805a.m44539w0(i, media, p8bVar);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m44541y0() {
        this.f27464f.callOnClick();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m44542z0() {
        this.f27461c.callOnClick();
    }

    public CoreTaskItemUploadProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreTaskItemUploadProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
