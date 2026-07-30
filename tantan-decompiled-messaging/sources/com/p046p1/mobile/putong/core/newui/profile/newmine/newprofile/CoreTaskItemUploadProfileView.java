package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.RealPictureInfo;
import com.p046p1.mobile.putong.core.data.RealPicturesInfo;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.CoreTaskItemUploadProfileView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadGuideImageView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UploadImageReplaceAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.HashMap;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.c7b;
import p149l.d30;
import p149l.duj0;
import p149l.e30;
import p149l.j63;
import p149l.m73;
import p149l.mei0;
import p149l.mkd0;
import p149l.sa40;
import p149l.sj5;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xx0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreTaskItemUploadProfileView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f26613c;

    /* JADX INFO: renamed from: d */
    public UploadGuideImageView f26614d;

    /* JADX INFO: renamed from: e */
    public VText f26615e;

    /* JADX INFO: renamed from: f */
    public View f26616f;

    /* JADX INFO: renamed from: g */
    public UploadGuideImageView f26617g;

    /* JADX INFO: renamed from: h */
    public VText f26618h;

    /* JADX INFO: renamed from: i */
    public VText f26619i;

    /* JADX INFO: renamed from: j */
    public View f26620j;

    /* JADX INFO: renamed from: k */
    public RealPicturesInfo f26621k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f26622l;

    /* JADX INFO: renamed from: m */
    public c4g0 f26623m;

    public CoreTaskItemUploadProfileView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m43298P(View view) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m43300R(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m43303V(View view) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m43304W(Act act, View view) {
        sj5.C19956a c19956aM184442i = new sj5.C19956a(act).m184444k("上传后展示在你的资料页中").m184443j("展示更多照片，认识更多真实的人").m184441h("我知道了").m184442i(true);
        int i = t100.f167248W;
        c19956aM184442i.m184440g(i, i).m184439f("https://auto.tancdn.com/v1/images/eyJpZCI6IkNRQTJBQ1NGVkZJVzdTRk1ENE0yMkVGTUIyRjJPRTE0IiwidyI6NTM0LCJoIjo1MzQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM4MzAyMzE3NDAyMDk4OTU3fQ.png").m184438e("").m184437d(vwb.m200311Y("", "")).m184435b(true).m184434a().show();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m43310c0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m43313f0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m43317j0(View view) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m43319l0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m43327A0(int i, Media media, NewTags newTags, c7b c7bVar) {
        if (i == 2) {
            xdl0.m208344M(this.f26617g, true);
            this.f26617g.m43512d(2, "审核中", media.url);
            this.f26617g.setRefusedClickCallback(new d30() { // from class: l.m7b
                @Override // p149l.d30
                public final void call() {
                    this.f131803a.m43355y0();
                }
            });
            this.f26617g.setOnClickListener(new View.OnClickListener() { // from class: l.n7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43310c0(view);
                }
            });
            if (newTags != null) {
                xdl0.m208344M(this.f26618h, true);
                this.f26618h.setText(newTags.name);
            }
            zvf0.m220371D("e_task_center_upload_photo_success", c7bVar.act().pageId(), vwb.m200311Y("task_center_photo_type", "full"), vwb.m200311Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.m208349O0(this.f26614d))));
            return;
        }
        if (i == 1) {
            xdl0.m208344M(this.f26614d, true);
            this.f26614d.m43512d(2, "审核中", media.url);
            this.f26614d.setRefusedClickCallback(new d30() { // from class: l.o7b
                @Override // p149l.d30
                public final void call() {
                    this.f142477a.m43356z0();
                }
            });
            this.f26614d.setOnClickListener(new View.OnClickListener() { // from class: l.p7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43303V(view);
                }
            });
            if (newTags != null) {
                xdl0.m208344M(this.f26615e, true);
                this.f26615e.setText(newTags.name);
            }
            zvf0.m220371D("e_task_center_upload_photo_success", c7bVar.act().pageId(), vwb.m200311Y("task_center_photo_type", "outdoor"), vwb.m200311Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.m208349O0(this.f26617g))));
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m43328B0(final c7b c7bVar, final int i, int i2, final Media media) {
        final NewTags newTagsM182817O = !vwb.m200296J(media.tags) ? sa40.m182802o().m182817O(media.tags.get(0)) : null;
        m43345U0(c7bVar, i, i2, media, newTagsM182817O, new d30() { // from class: l.l7b
            @Override // p149l.d30
            public final void call() {
                this.f126705a.m43327A0(i, media, newTagsM182817O, c7bVar);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ boolean m43329D0(Act act, int i, c7b c7bVar, String str, int i2, int i3, Intent intent) {
        if (i3 != -1) {
            return false;
        }
        m43349Y0(act, i, c7bVar, intent.getIntExtra("EXTRA_REPLACE_INDEX", -1), str);
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m43330E0() {
        this.f26616f.callOnClick();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m43331G0() {
        this.f26613c.callOnClick();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m43332H0(int i, Media media) {
        if (i == 2) {
            xdl0.m208344M(this.f26617g, true);
            this.f26617g.m43512d(5, "上传失败", media.url);
            this.f26617g.setRefusedClickCallback(new d30() { // from class: l.w7b
                @Override // p149l.d30
                public final void call() {
                    this.f185037a.m43330E0();
                }
            });
            this.f26617g.setOnClickListener(new View.OnClickListener() { // from class: l.x7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43317j0(view);
                }
            });
            xdl0.m208344M(this.f26618h, false);
            return;
        }
        if (i == 1) {
            xdl0.m208344M(this.f26614d, true);
            this.f26614d.m43512d(5, "上传失败", media.url);
            this.f26614d.setRefusedClickCallback(new d30() { // from class: l.y7b
                @Override // p149l.d30
                public final void call() {
                    this.f196690a.m43331G0();
                }
            });
            this.f26614d.setOnClickListener(new View.OnClickListener() { // from class: l.z7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43319l0(view);
                }
            });
            xdl0.m208344M(this.f26615e, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m43333I0(Act act, c7b c7bVar, View view) {
        m43344T0(act, 1, c7bVar, null, -1);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m43334J0(Act act, c7b c7bVar, View view) {
        m43344T0(act, 2, c7bVar, null, -1);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m43335K0(Act act, c7b c7bVar) {
        m43347W0(act, c7bVar, "using");
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m43336L0(String str, final c7b c7bVar, final Act act, View view) {
        if (TextUtils.equals(str, "satisfied")) {
            c7bVar.m105547s0(new d30() { // from class: l.g7b
                @Override // p149l.d30
                public final void call() {
                    this.f101345a.m43335K0(act, c7bVar);
                }
            });
            zvf0.m220399u("e_photo_award_boost", act.pageId(), vwb.m200311Y("photo_award_boost_status", "start_boost"));
        } else if (TextUtils.equals(str, "using")) {
            m73.m153332l(act, new d30() { // from class: l.h7b
                @Override // p149l.d30
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(lva.m151850f(act2));
                }
            });
            zvf0.m220399u("e_photo_award_boost", act.pageId(), vwb.m200311Y("photo_award_boost_status", NavigationCardIntent.boosting));
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m43337M0(Act act, c7b c7bVar, Pair pair) {
        if (((Integer) pair.first).intValue() == 2) {
            m43347W0(act, c7bVar, "used");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m43338N0(Act act, int i, c7b c7bVar, final RealPictureInfo realPictureInfo) {
        m43344T0(act, i, c7bVar, realPictureInfo.reason, vwb.m200293G(CoreModule.f17545c.f19639e0.m169527p9().pictures, new w9j() { // from class: l.h8b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).url.equals(realPictureInfo.media.url));
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final String m43340P0(RealPictureInfo realPictureInfo, int i) {
        if (TextUtils.equals(realPictureInfo.status, "pending")) {
            return "审核中";
        }
        if (TextUtils.equals(realPictureInfo.status, "passed")) {
            return i == 1 ? "户外照通过" : "全身照通过";
        }
        return TextUtils.equals(realPictureInfo.status, "rejected") ? realPictureInfo.reason : "";
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m43341Q0(String str) {
        return (TextUtils.equals("landing_full_body", str) || TextUtils.equals("landing_outdoor", str)) ? "task_center" : "other";
    }

    /* JADX INFO: renamed from: R0 */
    public final int m43342R0(String str) {
        if (TextUtils.equals(str, "pending")) {
            return 2;
        }
        if (TextUtils.equals(str, "passed")) {
            return 1;
        }
        return TextUtils.equals(str, "rejected") ? 4 : 0;
    }

    /* JADX INFO: renamed from: S0 */
    public final String m43343S0(RealPictureInfo realPictureInfo) {
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
    public final void m43344T0(final Act act, final int i, final c7b c7bVar, final String str, int i2) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isProfileJailed()) {
            xx0.m211439h(act);
            return;
        }
        zvf0.m220399u("e_photo_award_photo", act.pageId(), vwb.m200311Y("task_center_photo_type", i == 1 ? "outdoor" : "full"), vwb.m200311Y("photo_award_photo_status", TextUtils.isEmpty(str) ? "upload" : "failed"), vwb.m200311Y("photo_award_failed_reason", str));
        if (i2 >= 0 || !(CoreModule.f17545c.f19639e0.m169527p9().pictures.size() == 9 || (upa.m194609A2() && CoreModule.f17545c.f19639e0.m169527p9().pictures.size() == 6))) {
            m43349Y0(act, i, c7bVar, i2, str);
        } else {
            act.startActivityForResult(i == 1 ? 16 : 17, UploadImageReplaceAct.m43516Y1(act), new C4317a.a() { // from class: l.f8b
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i3, int i4, Intent intent) {
                    return this.f96330a.m43329D0(act, i, c7bVar, str, i3, i4, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m43345U0(c7b c7bVar, final int i, int i2, final Media media, NewTags newTags, d30 d30Var) {
        c7bVar.m105545D0(media, i, i2, d30Var, new d30() { // from class: l.v7b
            @Override // p149l.d30
            public final void call() {
                this.f180319a.m43332H0(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m43346V0(final Act act, final c7b c7bVar, mei0 mei0Var) {
        Object obj = mei0Var.f133428b;
        if (obj instanceof RealPicturesInfo) {
            this.f26621k = (RealPicturesInfo) obj;
        }
        RealPicturesInfo realPicturesInfo = this.f26621k;
        if (realPicturesInfo != null) {
            m43348X0(act, this.f26614d, this.f26615e, realPicturesInfo.outdoor, 1, c7bVar);
            m43348X0(act, this.f26617g, this.f26618h, this.f26621k.fullBody, 2, c7bVar);
            m43347W0(act, c7bVar, this.f26621k.privilegeStatus);
            xdl0.m208329E0(this.f26613c, new View.OnClickListener() { // from class: l.f7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96233a.m43333I0(act, c7bVar, view);
                }
            });
            xdl0.m208329E0(this.f26616f, new View.OnClickListener() { // from class: l.q7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153025a.m43334J0(act, c7bVar, view);
                }
            });
        }
        xdl0.m208329E0(this.f26620j, new View.OnClickListener() { // from class: l.a8b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreTaskItemUploadProfileView.m43304W(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final void m43347W0(final Act act, final c7b c7bVar, final String str) {
        String str2;
        this.f26619i.setEnabled("satisfied".equals(str) || "using".equals(str));
        if ("unsatisfied".equals(str)) {
            this.f26619i.setText("待获得优先推荐");
            str2 = "not_get_boost";
        } else if ("satisfied".equals(str)) {
            this.f26619i.setText("已获得优先推荐，去体验");
            str2 = "start_boost";
        } else if ("using".equals(str)) {
            this.f26619i.setText("优先推荐中");
            str2 = NavigationCardIntent.boosting;
        } else if ("used".equals(str)) {
            this.f26619i.setText("已使用");
            str2 = "boost_used";
        } else {
            str2 = "";
        }
        zvf0.m220368A("e_photo_award_boost", act.pageId(), vwb.m200311Y("photo_award_boost_status", str2));
        xdl0.m208329E0(this.f26619i, new View.OnClickListener() { // from class: l.b8b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74078a.m43336L0(str, c7bVar, act, view);
            }
        });
        mkd0.m154992z(this.f26623m);
        if (TextUtils.equals("using", str)) {
            this.f26623m = j63.m139890j().m139895o(mkd0.m154955G(new e30() { // from class: l.c8b
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79728a.m43337M0(act, c7bVar, (Pair) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m43348X0(final Act act, UploadGuideImageView uploadGuideImageView, VText vText, final RealPictureInfo realPictureInfo, final int i, final c7b c7bVar) {
        NewTags newTagsM182817O;
        HashMap map = new HashMap();
        if (realPictureInfo != null) {
            xdl0.m208344M(uploadGuideImageView, true);
            uploadGuideImageView.m43512d(m43342R0(realPictureInfo.status), m43340P0(realPictureInfo, i), realPictureInfo.media.url);
            if (!vwb.m200296J(realPictureInfo.media.tags) && !TextUtils.equals(realPictureInfo.status, "rejected") && (newTagsM182817O = sa40.m182802o().m182817O(realPictureInfo.media.tags.get(0))) != null) {
                xdl0.m208344M(vText, true);
                vText.setText(newTagsM182817O.name);
            }
            uploadGuideImageView.setRefusedClickCallback(new d30() { // from class: l.d8b
                @Override // p149l.d30
                public final void call() {
                    this.f84841a.m43338N0(act, i, c7bVar, realPictureInfo);
                }
            });
            uploadGuideImageView.setOnClickListener(new View.OnClickListener() { // from class: l.e8b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43313f0(view);
                }
            });
            if (TextUtils.equals(realPictureInfo.status, "rejected")) {
                map.put("photo_award_failed_reason", realPictureInfo.reason);
            }
            map.put("photo_uploaded_source", m43341Q0(realPictureInfo.source));
        }
        map.put("photo_award_photo_status", m43343S0(realPictureInfo));
        map.put("task_center_photo_type", i == 1 ? "outdoor" : "full");
        zvf0.m220403y("e_photo_award_photo", act.pageId(), map);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m43349Y0(Act act, final int i, final c7b c7bVar, final int i2, String str) {
        duj0 duj0Var = new duj0(act, i);
        duj0Var.m113722F(new d30() { // from class: l.g8b
            @Override // p149l.d30
            public final void call() {
                this.f101486a.m43339O0(c7bVar, i, i2);
            }
        });
        duj0Var.show();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26613c = findViewById(u4c0.f174313j9);
        this.f26614d = (UploadGuideImageView) findViewById(u4c0.f174330k9);
        this.f26615e = (VText) findViewById(u4c0.f174347l9);
        this.f26616f = findViewById(u4c0.f173789E4);
        this.f26617g = (UploadGuideImageView) findViewById(u4c0.f173806F4);
        this.f26618h = (VText) findViewById(u4c0.f173823G4);
        this.f26619i = (VText) findViewById(u4c0.f173904L0);
        this.f26620j = findViewById(u4c0.f174258g4);
        this.f26622l = (SVGAnimationView) findViewById(u4c0.f174504ud);
        this.f26614d.setSizeType(2);
        this.f26617g.setSizeType(2);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a65e326a-3d46-492c-9e18-73d717d82d8f14.svga").repeatCount(1).into(this.f26622l);
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final void m43339O0(final c7b c7bVar, final int i, final int i2) {
        if (upa.m194609A2()) {
            ura.m195053e().m195057d().mo33889np((Act) getContext(), new e30() { // from class: l.i7b
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111844a.m43354x0(c7bVar, i, i2, (Media) obj);
                }
            });
        } else {
            ura.m195053e().m195057d().mo33759Uj((Act) getContext(), new e30() { // from class: l.j7b
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f116578a.m43328B0(c7bVar, i, i2, (Media) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m43351u0() {
        this.f26616f.callOnClick();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m43352v0() {
        this.f26613c.callOnClick();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m43353w0(int i, Media media, c7b c7bVar) {
        if (i == 2) {
            xdl0.m208344M(this.f26617g, true);
            this.f26617g.m43512d(2, "审核中", media.url);
            this.f26617g.setRefusedClickCallback(new d30() { // from class: l.r7b
                @Override // p149l.d30
                public final void call() {
                    this.f158018a.m43351u0();
                }
            });
            this.f26617g.setOnClickListener(new View.OnClickListener() { // from class: l.s7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43298P(view);
                }
            });
            zvf0.m220371D("e_task_center_upload_photo_success", c7bVar.act().pageId(), vwb.m200311Y("task_center_photo_type", "full"), vwb.m200311Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.m208349O0(this.f26614d))));
            return;
        }
        if (i == 1) {
            xdl0.m208344M(this.f26614d, true);
            this.f26614d.m43512d(2, "审核中", media.url);
            this.f26614d.setRefusedClickCallback(new d30() { // from class: l.t7b
                @Override // p149l.d30
                public final void call() {
                    this.f168684a.m43352v0();
                }
            });
            this.f26614d.setOnClickListener(new View.OnClickListener() { // from class: l.u7b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreTaskItemUploadProfileView.m43300R(view);
                }
            });
            zvf0.m220371D("e_task_center_upload_photo_success", c7bVar.act().pageId(), vwb.m200311Y("task_center_photo_type", "outdoor"), vwb.m200311Y("is_outdoor_full_uploaded", Boolean.valueOf(xdl0.m208349O0(this.f26617g))));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m43354x0(final c7b c7bVar, final int i, int i2, final Media media) {
        m43345U0(c7bVar, i, i2, media, null, new d30() { // from class: l.k7b
            @Override // p149l.d30
            public final void call() {
                this.f121562a.m43353w0(i, media, c7bVar);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m43355y0() {
        this.f26616f.callOnClick();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m43356z0() {
        this.f26613c.callOnClick();
    }

    public CoreTaskItemUploadProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreTaskItemUploadProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
