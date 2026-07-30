package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskItemUploadProfileView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadGuideImageView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadImageReplaceAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.RealPictureInfo;
import com.p1.mobile.putong.core.data.RealPicturesInfo;
import com.p1.mobile.putong.data.Media;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.HashMap;
import l.c4g0;
import l.d30;
import l.e30;
import l.j63;
import l.j760;
import l.lva;
import l.m73;
import l.mkd0;
import l.sa40;
import l.t100;
import l.u4c0;
import l.upa;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xx0;
import l.zvf0;
import p009l.c7b;
import p009l.duj0;
import p009l.mei0;
import p009l.sj5;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreTaskItemUploadProfileView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f5391c;

    /* JADX INFO: renamed from: d */
    public UploadGuideImageView f5392d;

    /* JADX INFO: renamed from: e */
    public VText f5393e;

    /* JADX INFO: renamed from: f */
    public View f5394f;

    /* JADX INFO: renamed from: g */
    public UploadGuideImageView f5395g;

    /* JADX INFO: renamed from: h */
    public VText f5396h;

    /* JADX INFO: renamed from: i */
    public VText f5397i;

    /* JADX INFO: renamed from: j */
    public View f5398j;

    /* JADX INFO: renamed from: k */
    public RealPicturesInfo f5399k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f5400l;

    /* JADX INFO: renamed from: m */
    public c4g0 f5401m;

    public CoreTaskItemUploadProfileView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m7523P(View view) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m7525R(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m7528V(View view) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m7529W(Act act, View view) {
        sj5.C1191a c1191aM22225i = new sj5.C1191a(act).m22227k("上传后展示在你的资料页中").m22226j("展示更多照片，认识更多真实的人").m22224h("我知道了").m22225i(true);
        int i = t100.W;
        c1191aM22225i.m22223g(i, i).m22222f("https://auto.tancdn.com/v1/images/eyJpZCI6IkNRQTJBQ1NGVkZJVzdTRk1ENE0yMkVGTUIyRjJPRTE0IiwidyI6NTM0LCJoIjo1MzQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM4MzAyMzE3NDAyMDk4OTU3fQ.png").m22221e("").m22220d(vwb.Y("", "")).m22218b(true).m22217a().show();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m7535c0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m7538f0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m7542j0(View view) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m7544l0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m7552A0(int i, Media media, NewTags newTags, c7b c7bVar) {
        if (i == 2) {
            xdl0.M(this.f5395g, true);
            this.f5395g.m7758d(2, "审核中", media.url);
            this.f5395g.setRefusedClickCallback(new d30() { // from class: l.m7b
                public final void call() {
                    this.f16745a.m7580y0();
                }
            });
            this.f5395g.setOnClickListener(new View.OnClickListener() { // from class: l.n7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7535c0(view);
                }
            });
            if (newTags != null) {
                xdl0.M(this.f5396h, true);
                this.f5396h.setText(newTags.name);
            }
            zvf0.D("e_task_center_upload_photo_success", c7bVar.act().pageId(), new j760[]{vwb.Y("task_center_photo_type", "full"), vwb.Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.O0(this.f5392d)))});
            return;
        }
        if (i == 1) {
            xdl0.M(this.f5392d, true);
            this.f5392d.m7758d(2, "审核中", media.url);
            this.f5392d.setRefusedClickCallback(new d30() { // from class: l.o7b
                public final void call() {
                    this.f17859a.m7581z0();
                }
            });
            this.f5392d.setOnClickListener(new View.OnClickListener() { // from class: l.p7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7528V(view);
                }
            });
            if (newTags != null) {
                xdl0.M(this.f5393e, true);
                this.f5393e.setText(newTags.name);
            }
            zvf0.D("e_task_center_upload_photo_success", c7bVar.act().pageId(), new j760[]{vwb.Y("task_center_photo_type", "outdoor"), vwb.Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.O0(this.f5395g)))});
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m7553B0(final c7b c7bVar, final int i, int i2, final Media media) {
        final NewTags newTagsO = !vwb.J(media.tags) ? sa40.o().O((String) media.tags.get(0)) : null;
        m7570U0(c7bVar, i, i2, media, newTagsO, new d30() { // from class: l.l7b
            public final void call() {
                this.f15975a.m7552A0(i, media, newTagsO, c7bVar);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ boolean m7554D0(Act act, int i, c7b c7bVar, String str, int i2, int i3, Intent intent) {
        if (i3 != -1) {
            return false;
        }
        m7574Y0(act, i, c7bVar, intent.getIntExtra("EXTRA_REPLACE_INDEX", -1), str);
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m7555E0() {
        this.f5394f.callOnClick();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m7556G0() {
        this.f5391c.callOnClick();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m7557H0(int i, Media media) {
        if (i == 2) {
            xdl0.M(this.f5395g, true);
            this.f5395g.m7758d(5, "上传失败", media.url);
            this.f5395g.setRefusedClickCallback(new d30() { // from class: l.w7b
                public final void call() {
                    this.f21933a.m7555E0();
                }
            });
            this.f5395g.setOnClickListener(new View.OnClickListener() { // from class: l.x7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7542j0(view);
                }
            });
            xdl0.M(this.f5396h, false);
            return;
        }
        if (i == 1) {
            xdl0.M(this.f5392d, true);
            this.f5392d.m7758d(5, "上传失败", media.url);
            this.f5392d.setRefusedClickCallback(new d30() { // from class: l.y7b
                public final void call() {
                    this.f22915a.m7556G0();
                }
            });
            this.f5392d.setOnClickListener(new View.OnClickListener() { // from class: l.z7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7544l0(view);
                }
            });
            xdl0.M(this.f5393e, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m7558I0(Act act, c7b c7bVar, View view) {
        m7569T0(act, 1, c7bVar, null, -1);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m7559J0(Act act, c7b c7bVar, View view) {
        m7569T0(act, 2, c7bVar, null, -1);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m7560K0(Act act, c7b c7bVar) {
        m7572W0(act, c7bVar, "using");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m7561L0(String str, final c7b c7bVar, final Act act, View view) {
        if (TextUtils.equals(str, "satisfied")) {
            c7bVar.m12382s0(new d30() { // from class: l.g7b
                public final void call() {
                    this.f13334a.m7560K0(act, c7bVar);
                }
            });
            zvf0.u("e_photo_award_boost", act.pageId(), new j760[]{vwb.Y("photo_award_boost_status", "start_boost")});
        } else if (TextUtils.equals(str, "using")) {
            m73.l(act, new d30() { // from class: l.h7b
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(lva.f(act2));
                }
            });
            zvf0.u("e_photo_award_boost", act.pageId(), new j760[]{vwb.Y("photo_award_boost_status", "boosting")});
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m7562M0(Act act, c7b c7bVar, Pair pair) {
        if (((Integer) pair.first).intValue() == 2) {
            m7572W0(act, c7bVar, "used");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m7563N0(Act act, int i, c7b c7bVar, final RealPictureInfo realPictureInfo) {
        m7569T0(act, i, c7bVar, realPictureInfo.reason, vwb.G(CoreModule.c.e0.p9().pictures, new w9j() { // from class: l.h8b
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).url.equals(((Media) realPictureInfo.media).url));
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final String m7565P0(RealPictureInfo realPictureInfo, int i) {
        if (TextUtils.equals(realPictureInfo.status, "pending")) {
            return "审核中";
        }
        if (TextUtils.equals(realPictureInfo.status, "passed")) {
            return i == 1 ? "户外照通过" : "全身照通过";
        }
        return TextUtils.equals(realPictureInfo.status, "rejected") ? realPictureInfo.reason : "";
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m7566Q0(String str) {
        return (TextUtils.equals("landing_full_body", str) || TextUtils.equals("landing_outdoor", str)) ? "task_center" : "other";
    }

    /* JADX INFO: renamed from: R0 */
    public final int m7567R0(String str) {
        if (TextUtils.equals(str, "pending")) {
            return 2;
        }
        if (TextUtils.equals(str, "passed")) {
            return 1;
        }
        return TextUtils.equals(str, "rejected") ? 4 : 0;
    }

    /* JADX INFO: renamed from: S0 */
    public final String m7568S0(RealPictureInfo realPictureInfo) {
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
    public final void m7569T0(final Act act, final int i, final c7b c7bVar, final String str, int i2) {
        if (CoreModule.c.e0.p9().isProfileJailed()) {
            xx0.h(act);
            return;
        }
        zvf0.u("e_photo_award_photo", act.pageId(), new j760[]{vwb.Y("task_center_photo_type", i == 1 ? "outdoor" : "full"), vwb.Y("photo_award_photo_status", TextUtils.isEmpty(str) ? "upload" : "failed"), vwb.Y("photo_award_failed_reason", str)});
        if (i2 >= 0 || !(CoreModule.c.e0.p9().pictures.size() == 9 || (upa.A2() && CoreModule.c.e0.p9().pictures.size() == 6))) {
            m7574Y0(act, i, c7bVar, i2, str);
        } else {
            act.startActivityForResult(i == 1 ? 16 : 17, UploadImageReplaceAct.m7762Y1(act), new a.a() { // from class: l.f8b
                /* JADX INFO: renamed from: a */
                public final boolean m14314a(int i3, int i4, Intent intent) {
                    return this.f12861a.m7554D0(act, i, c7bVar, str, i3, i4, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m7570U0(c7b c7bVar, final int i, int i2, final Media media, NewTags newTags, d30 d30Var) {
        c7bVar.m12379D0(media, i, i2, d30Var, new d30() { // from class: l.v7b
            public final void call() {
                this.f21471a.m7557H0(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m7571V0(final Act act, final c7b c7bVar, mei0 mei0Var) {
        Object obj = mei0Var.f16854b;
        if (obj instanceof RealPicturesInfo) {
            this.f5399k = (RealPicturesInfo) obj;
        }
        RealPicturesInfo realPicturesInfo = this.f5399k;
        if (realPicturesInfo != null) {
            m7573X0(act, this.f5392d, this.f5393e, realPicturesInfo.outdoor, 1, c7bVar);
            m7573X0(act, this.f5395g, this.f5396h, this.f5399k.fullBody, 2, c7bVar);
            m7572W0(act, c7bVar, this.f5399k.privilegeStatus);
            xdl0.E0(this.f5391c, new View.OnClickListener() { // from class: l.f7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12843a.m7558I0(act, c7bVar, view);
                }
            });
            xdl0.E0(this.f5394f, new View.OnClickListener() { // from class: l.q7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19055a.m7559J0(act, c7bVar, view);
                }
            });
        }
        xdl0.E0(this.f5398j, new View.OnClickListener() { // from class: l.a8b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreTaskItemUploadProfileView.m7529W(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final void m7572W0(final Act act, final c7b c7bVar, final String str) {
        String str2;
        this.f5397i.setEnabled("satisfied".equals(str) || "using".equals(str));
        if ("unsatisfied".equals(str)) {
            this.f5397i.setText("待获得优先推荐");
            str2 = "not_get_boost";
        } else if ("satisfied".equals(str)) {
            this.f5397i.setText("已获得优先推荐，去体验");
            str2 = "start_boost";
        } else if ("using".equals(str)) {
            this.f5397i.setText("优先推荐中");
            str2 = "boosting";
        } else if ("used".equals(str)) {
            this.f5397i.setText("已使用");
            str2 = "boost_used";
        } else {
            str2 = "";
        }
        zvf0.A("e_photo_award_boost", act.pageId(), new j760[]{vwb.Y("photo_award_boost_status", str2)});
        xdl0.E0(this.f5397i, new View.OnClickListener() { // from class: l.b8b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9958a.m7561L0(str, c7bVar, act, view);
            }
        });
        mkd0.z(this.f5401m);
        if (TextUtils.equals("using", str)) {
            this.f5401m = j63.j().o(mkd0.G(new e30() { // from class: l.c8b
                public final void call(Object obj) {
                    this.f10463a.m7562M0(act, c7bVar, (Pair) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m7573X0(final Act act, UploadGuideImageView uploadGuideImageView, VText vText, final RealPictureInfo realPictureInfo, final int i, final c7b c7bVar) {
        NewTags newTagsO;
        HashMap map = new HashMap();
        if (realPictureInfo != null) {
            xdl0.M(uploadGuideImageView, true);
            uploadGuideImageView.m7758d(m7567R0(realPictureInfo.status), m7565P0(realPictureInfo, i), ((Media) realPictureInfo.media).url);
            if (!vwb.J(((Media) realPictureInfo.media).tags) && !TextUtils.equals(realPictureInfo.status, "rejected") && (newTagsO = sa40.o().O((String) ((Media) realPictureInfo.media).tags.get(0))) != null) {
                xdl0.M(vText, true);
                vText.setText(newTagsO.name);
            }
            uploadGuideImageView.setRefusedClickCallback(new d30() { // from class: l.d8b
                public final void call() {
                    this.f11664a.m7563N0(act, i, c7bVar, realPictureInfo);
                }
            });
            uploadGuideImageView.setOnClickListener(new View.OnClickListener() { // from class: l.e8b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7538f0(view);
                }
            });
            if (TextUtils.equals(realPictureInfo.status, "rejected")) {
                map.put("photo_award_failed_reason", realPictureInfo.reason);
            }
            map.put("photo_uploaded_source", m7566Q0(realPictureInfo.source));
        }
        map.put("photo_award_photo_status", m7568S0(realPictureInfo));
        map.put("task_center_photo_type", i == 1 ? "outdoor" : "full");
        zvf0.y("e_photo_award_photo", act.pageId(), map);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m7574Y0(Act act, final int i, final c7b c7bVar, final int i2, String str) {
        duj0 duj0Var = new duj0(act, i);
        duj0Var.m13489F(new d30() { // from class: l.g8b
            public final void call() {
                this.f13369a.m7564O0(c7bVar, i, i2);
            }
        });
        duj0Var.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f5391c = findViewById(u4c0.j9);
        this.f5392d = (UploadGuideImageView) findViewById(u4c0.k9);
        this.f5393e = findViewById(u4c0.l9);
        this.f5394f = findViewById(u4c0.E4);
        this.f5395g = (UploadGuideImageView) findViewById(u4c0.F4);
        this.f5396h = findViewById(u4c0.G4);
        this.f5397i = findViewById(u4c0.L0);
        this.f5398j = findViewById(u4c0.g4);
        this.f5400l = findViewById(u4c0.ud);
        this.f5392d.setSizeType(2);
        this.f5395g.setSizeType(2);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a65e326a-3d46-492c-9e18-73d717d82d8f14.svga").repeatCount(1).into(this.f5400l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final void m7564O0(final c7b c7bVar, final int i, final int i2) {
        if (upa.A2()) {
            ura.e().d().np(getContext(), new e30() { // from class: l.i7b
                public final void call(Object obj) {
                    this.f14417a.m7579x0(c7bVar, i, i2, (Media) obj);
                }
            });
        } else {
            ura.e().d().Uj(getContext(), new e30() { // from class: l.j7b
                public final void call(Object obj) {
                    this.f14962a.m7553B0(c7bVar, i, i2, (Media) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m7576u0() {
        this.f5394f.callOnClick();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m7577v0() {
        this.f5391c.callOnClick();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m7578w0(int i, Media media, c7b c7bVar) {
        if (i == 2) {
            xdl0.M(this.f5395g, true);
            this.f5395g.m7758d(2, "审核中", media.url);
            this.f5395g.setRefusedClickCallback(new d30() { // from class: l.r7b
                public final void call() {
                    this.f19670a.m7576u0();
                }
            });
            this.f5395g.setOnClickListener(new View.OnClickListener() { // from class: l.s7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7523P(view);
                }
            });
            zvf0.D("e_task_center_upload_photo_success", c7bVar.act().pageId(), new j760[]{vwb.Y("task_center_photo_type", "full"), vwb.Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.O0(this.f5392d)))});
            return;
        }
        if (i == 1) {
            xdl0.M(this.f5392d, true);
            this.f5392d.m7758d(2, "审核中", media.url);
            this.f5392d.setRefusedClickCallback(new d30() { // from class: l.t7b
                public final void call() {
                    this.f20575a.m7577v0();
                }
            });
            this.f5392d.setOnClickListener(new View.OnClickListener() { // from class: l.u7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m7525R(view);
                }
            });
            zvf0.D("e_task_center_upload_photo_success", c7bVar.act().pageId(), new j760[]{vwb.Y("task_center_photo_type", "outdoor"), vwb.Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.O0(this.f5395g)))});
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m7579x0(final c7b c7bVar, final int i, int i2, final Media media) {
        m7570U0(c7bVar, i, i2, media, null, new d30() { // from class: l.k7b
            public final void call() {
                this.f15434a.m7578w0(i, media, c7bVar);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m7580y0() {
        this.f5394f.callOnClick();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m7581z0() {
        this.f5391c.callOnClick();
    }

    public CoreTaskItemUploadProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreTaskItemUploadProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
