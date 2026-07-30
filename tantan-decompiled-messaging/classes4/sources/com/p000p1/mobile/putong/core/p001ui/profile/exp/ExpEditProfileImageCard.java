package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCardScaleIndependentFrame;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileImageCard;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PhotoLowConfig;
import com.p1.mobile.putong.core.data.PhotoLowModelData;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.c40;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.f30;
import l.ffx;
import l.fwl;
import l.g30;
import l.j760;
import l.jo0;
import l.lqa;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.ogw;
import l.qib0;
import l.rhi;
import l.roj0;
import l.t100;
import l.u4c0;
import l.ura;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.wn90;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.ya5;
import l.yij0;
import l.zvf0;
import p002l.a2m;
import p002l.ijf;
import p002l.lew;
import rx.c;
import rx.schedulers.Schedulers;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VListCell;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpEditProfileImageCard extends VReorderCard {

    /* JADX INFO: renamed from: G0 */
    public static String f925G0 = "RepeatPicture";

    /* JADX INFO: renamed from: H0 */
    public static String f926H0 = "NetPicture";

    /* JADX INFO: renamed from: A */
    public VProgressBar f927A;

    /* JADX INFO: renamed from: B */
    public VProgressBar f928B;

    /* JADX INFO: renamed from: C */
    public ImageView f929C;

    /* JADX INFO: renamed from: D */
    public ijf f930D;

    /* JADX INFO: renamed from: E */
    public ImageView f931E;

    /* JADX INFO: renamed from: E0 */
    public int f932E0;

    /* JADX INFO: renamed from: F */
    public boolean f933F;

    /* JADX INFO: renamed from: F0 */
    public ObjectAnimator f934F0;

    /* JADX INFO: renamed from: G */
    public int f935G;

    /* JADX INFO: renamed from: H */
    public String f936H;

    /* JADX INFO: renamed from: I */
    public Media f937I;

    /* JADX INFO: renamed from: J */
    public c4g0 f938J;

    /* JADX INFO: renamed from: K */
    public g30<Media, Boolean, Boolean> f939K;

    /* JADX INFO: renamed from: L */
    public List<String> f940L;

    /* JADX INFO: renamed from: M */
    public List<Media> f941M;

    /* JADX INFO: renamed from: N */
    public boolean f942N;

    /* JADX INFO: renamed from: O */
    public PhotoLowModelData f943O;

    /* JADX INFO: renamed from: P */
    public PhotoLowModelData f944P;

    /* JADX INFO: renamed from: Q */
    public PhotoLowModelData f945Q;

    /* JADX INFO: renamed from: R */
    public PhotoLowModelData f946R;

    /* JADX INFO: renamed from: S */
    public cwf0 f947S;

    /* JADX INFO: renamed from: T */
    public cwf0 f948T;

    /* JADX INFO: renamed from: U */
    public boolean f949U;

    /* JADX INFO: renamed from: V */
    public long f950V;

    /* JADX INFO: renamed from: W */
    public Runnable f951W;

    /* JADX INFO: renamed from: k0 */
    public Media f952k0;

    /* JADX INFO: renamed from: p0 */
    public ExpFakeCardBgView f953p0;

    /* JADX INFO: renamed from: r */
    public MediaReorderCardScaleIndependentFrame f954r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f955s;

    /* JADX INFO: renamed from: t */
    public View f956t;

    /* JADX INFO: renamed from: u */
    public VText f957u;

    /* JADX INFO: renamed from: v */
    public TextView f958v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f959w;

    /* JADX INFO: renamed from: x */
    public TextView f960x;

    /* JADX INFO: renamed from: y */
    public VFrame_Anim f961y;

    /* JADX INFO: renamed from: z */
    public ImageView f962z;

    public ExpEditProfileImageCard(Context context) {
        super(context);
        this.f933F = false;
        this.f935G = 0;
        this.f940L = new ArrayList(1);
        this.f941M = new ArrayList();
        this.f932E0 = -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ roj0 m1287O(xaj0 xaj0Var) throws IllegalPictureException {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m1290R() {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ Picture m1292T(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m1298Y0() {
        PhotoLowConfig photoLowConfigD = lqa.d();
        if (!mqi0.D(((Long) CoreModule.c.e0.G4.get()).longValue())) {
            CoreModule.c.e0.G4.put(Long.valueOf(mqi0.o()));
            CoreModule.c.e0.H4.put(1);
            return true;
        }
        if (((Integer) CoreModule.c.e0.H4.get()).intValue() >= (photoLowConfigD == null ? 2 : photoLowConfigD.count)) {
            return false;
        }
        CoreModule.c.e0.G4.put(Long.valueOf(mqi0.o()));
        CoreModule.c.e0.H4.a(1);
        return true;
    }

    /* JADX INFO: renamed from: c1 */
    private void m1303c1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measureChildWithMargins(this.f957u, ffx.a(getWidth()), 0, ffx.a(getHeight()), 0);
        int height = getHeight() - ((FrameLayout.LayoutParams) this.f957u.getLayoutParams()).bottomMargin;
        int width = (getWidth() / 2) - (this.f957u.getMeasuredWidth() / 2);
        int measuredWidth = this.f957u.getMeasuredWidth() + width;
        this.f957u.layout(width, height - this.f957u.getMeasuredHeight(), measuredWidth, height);
    }

    /* JADX INFO: renamed from: g1 */
    private void m1308g1() {
        if (!NullChecker.a(this.f937I) || TextUtils.isEmpty(this.f937I.url) || this.f933F) {
            xdl0.M0(this.f960x, false);
        } else {
            xdl0.M0(this.f960x, true);
            int iM1246v = m1246v();
            TextView textView = this.f960x;
            if (iM1246v == 0) {
                textView.setBackgroundResource(x2c0.c1);
                this.f960x.setText("首图");
                this.f960x.setTextColor(Color.parseColor("#ffffff"));
            } else {
                textView.setBackgroundResource(x2c0.d1);
                xdl0.E0(this.f960x, new View.OnClickListener() { // from class: l.laf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f14746a.m1336L0(view);
                    }
                });
                NewTags newTagsGh = !vwb.J(this.f937I.tags) ? ura.e().d().Gh((String) this.f937I.tags.get(0)) : null;
                if (newTagsGh == null || TextUtils.isEmpty(newTagsGh.name)) {
                    this.f960x.setTextColor(getResources().getColor(w0c0.A));
                    this.f960x.setText("添加标签");
                } else {
                    this.f960x.setTextColor(Color.parseColor("#000000"));
                    this.f960x.setText(newTagsGh.name);
                }
            }
            this.f960x.getPaint().setFakeBoldText(true);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Picture m1309h0(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: i1 */
    private void m1311i1() {
        new lew(m1358n0(), new Runnable() { // from class: l.haf
            @Override // java.lang.Runnable
            public final void run() {
                ExpEditProfileImageCard.m1290R();
            }
        }, new Runnable() { // from class: l.iaf
            @Override // java.lang.Runnable
            public final void run() {
                this.f13124a.m1322s0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: j1 */
    private void m1313j1() {
        if (!NullChecker.a(this.f943O) || TextUtils.isEmpty(this.f943O.conclusion)) {
            return;
        }
        if (this.f947S == null) {
            this.f947S = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        new dd80.a(m1358n0()).y0("温馨提示").t0(this.f943O.conclusion).c0("更换照片", new Runnable() { // from class: l.vaf
            @Override // java.lang.Runnable
            public final void run() {
                this.f21051a.m1337M0();
            }
        }).X("稍后再说", new Runnable() { // from class: l.waf
            @Override // java.lang.Runnable
            public final void run() {
                this.f21590a.m1338N0();
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.xaf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f22200a.m1339O0(dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.yaf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f22777a.m1340P0(dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: k1 */
    private void m1315k1(String str) {
        String str2;
        final String str3;
        if (this.f948T == null) {
            this.f948T = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        if (TextUtils.equals(str, f925G0) && NullChecker.a(this.f944P)) {
            PhotoLowModelData photoLowModelData = this.f944P;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, f926H0) && NullChecker.a(this.f945Q)) {
            PhotoLowModelData photoLowModelData2 = this.f945Q;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        this.f948T.p(new j760[]{j760.a("lowquality_reason", str3)});
        new dd80.a(m1358n0()).y0("温馨提示").t0(str2).c0("更换照片", new Runnable() { // from class: l.bbf
            @Override // java.lang.Runnable
            public final void run() {
                this.f8060a.m1341Q0(str3);
            }
        }).X("稍后再说", new Runnable() { // from class: l.cbf
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.u("e_replace_photo_cancel", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", str3)});
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.dbf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f9156a.m1342R0(dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.ebf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9660a.m1343S0(dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: m1 */
    private void m1317m1(String str) {
        this.f940L.add(str);
    }

    /* JADX INFO: renamed from: o0 */
    private void m1318o0() {
        if (this.f880o && TEnum.equals(this.f937I.status, "normal")) {
            if (NullChecker.a(m1235h().f899j)) {
                m1235h().f899j.run();
            }
            TagChooseMkAct.v2(m1358n0(), vwb.M(this.f937I), (String) null, new Runnable() { // from class: l.zaf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23322a.m1367z0();
                }
            }, (Runnable) null);
        }
    }

    /* JADX INFO: renamed from: p1 */
    private void m1319p1() {
        if (NullChecker.a(this.f938J)) {
            m1356l1(null);
            yij0.U(this.f938J);
            this.f956t.setAlpha(0.0f);
            this.f938J = null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    private c<Picture> m1320q0(final Picture picture) {
        return c.just(picture).observeOn(jo0.a()).map(new w9j() { // from class: l.qaf
            public final Object call(Object obj) {
                return CoreModule.c.e0.ma();
            }
        }).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.raf
            public final Object call(Object obj) {
                return this.f18441a.m1327C0(picture, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    private c<roj0> m1321r0(Media media) {
        return (qib0.R.c() && (media instanceof Picture)) ? qib0.R.b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.oaf
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m1287O((xaj0) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m1322s0() {
        wn90.F().n0(getContext(), new f30() { // from class: l.saf
            public final void call(Object obj, Object obj2) {
                this.f18901a.m1328D0((String) obj, (Media) obj2);
            }
        }, m1246v() != 0);
    }

    /* JADX INFO: renamed from: v0 */
    private void m1323v0(final Media media) {
        if (m1358n0() == null || m1358n0().isFinishing() || m1358n0().isDestroyed()) {
            return;
        }
        if (lqa.i() && NullChecker.a(this.f937I) && (media instanceof Picture) && TEnum.equals(this.f937I.status, "preprocessed")) {
            Picture picture = (Picture) media;
            String strD = ogw.d(new File(rhi.z(this.f937I.url)));
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            o6j0.m("e_hyper_profile_pic_double_check", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("pic_trace_id", strD), o6j0.a.h("pic_trace_type", "trimmed"), o6j0.a.h("pic_trace_url", media.url), o6j0.a.h("pic_trace_resolution", picture.size.width + "x" + picture.size.height)});
            CoreModule.c.e0.H1.onNext(this.f937I.url);
        }
        if (NullChecker.a(this.f937I) && NullChecker.a(media)) {
            Media media2 = this.f937I;
            media2.status = media.status;
            media.tags = media2.tags;
        }
        boolean z = false;
        if (m1246v() == 0 && (media instanceof Picture)) {
            Picture picture2 = (Picture) media;
            boolean zIsLabelJudge = picture2.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
            boolean z2 = this.f942N && picture2.isLow();
            boolean zIsLabelJudge2 = picture2.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
            picture2.isLabelJudge(MediaLabel.get("NOT_VERIFICATION"));
            if (ura.e().d().ak()) {
                m1353e1(media, true, false);
                if (zIsLabelJudge) {
                    m1315k1(f925G0);
                } else if (z2) {
                    m1313j1();
                } else if (zIsLabelJudge2) {
                    m1315k1(f926H0);
                }
            } else if (ura.e().d().Fl()) {
                m1353e1(media, true, false);
                if (zIsLabelJudge) {
                    m1315k1(f925G0);
                } else if (z2) {
                    m1313j1();
                }
            } else if (lqa.w() && z2 && NullChecker.a(this.f952k0)) {
                m1356l1(null);
                m1353e1(this.f952k0, true, false);
                m1313j1();
            } else {
                m1353e1(media, true, false);
                if (z2) {
                    m1313j1();
                }
            }
            if (TEnum.equals(media.status, "normal") || !z) {
            }
            this.f941M.add(media);
            this.f938J = null;
            this.f929C.setImageResource(x2c0.b7);
            m1356l1(this.f929C);
            postDelayed(new Runnable() { // from class: l.taf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20150a.m1333I0(media);
                }
            }, 1000L);
            if (NullChecker.a(this.f868c.f9399f.f898i)) {
                this.f868c.f9399f.f898i.mo1267a(m1246v(), true);
            }
            CoreModule.c.e0.G1.onNext(roj0.a);
            return;
        }
        m1353e1(media, true, false);
        z = true;
        if (TEnum.equals(media.status, "normal")) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void m1348X0(Throwable th) {
        setVisibility(0);
        this.f938J = null;
        xdl0.M0(this.f962z, false);
        this.f929C.setImageResource(x2c0.a7);
        m1356l1(this.f929C);
        m1359n1(true);
        if (NullChecker.a(this.f868c.f9399f.f898i)) {
            this.f868c.f9399f.f898i.mo1267a(m1246v(), false);
        }
        if (m1246v() == 0 && (this.f937I instanceof Picture) && NullChecker.a(this.f952k0)) {
            m1356l1(null);
            m1353e1(this.f952k0, true, false);
        }
        if (th instanceof IllegalPictureException) {
            lsi0.y(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m1325A0(Drawable drawable, Drawable drawable2, ValueAnimator valueAnimator) {
        if (xdl0.O0(this.f953p0.f979c)) {
            this.f953p0.f979c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_ATOP);
        drawable.setColorFilter(porterDuffColorFilter);
        drawable2.setColorFilter(porterDuffColorFilter);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ Picture m1326B0(Picture picture, Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData moduleData = envelope.data.getModuleData(CoreData.class);
            if (NullChecker.a(moduleData)) {
                this.f943O = moduleData.lowPhotoResult;
                this.f944P = moduleData.repeatPictureResult;
                this.f945Q = moduleData.netPictureResult;
                this.f946R = moduleData.notVerificationResultData;
                if (ura.e().d().ak()) {
                    if (NullChecker.a(this.f944P) && TextUtils.equals(this.f944P.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    } else {
                        picture.removeLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    }
                    if (NullChecker.a(this.f945Q) && TextUtils.equals(this.f945Q.audit, "net")) {
                        picture.setLabel(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
                    } else {
                        picture.removeLabel(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
                    }
                }
                if (ura.e().d().Fl()) {
                    if (NullChecker.a(this.f944P) && TextUtils.equals(this.f944P.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    } else {
                        picture.removeLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    }
                }
                if (this.f942N && NullChecker.a(this.f943O) && TextUtils.equals(this.f943O.audit, "low")) {
                    picture.setLow();
                } else {
                    picture.removeLowLabel();
                }
                picture.removeLabel(MediaLabel.get("NOT_VERIFICATION"));
            }
        }
        return picture;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ c m1327C0(final Picture picture, User user) {
        return CoreModule.c.e0.G9(((Media) picture).url, this.f932E0 == 0 ? 1 : 2, (String) null).map(new w9j() { // from class: l.uaf
            public final Object call(Object obj) {
                return this.f20566a.m1326B0(picture, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m1328D0(String str, Media media) {
        ijf ijfVar = this.f930D;
        if (ijfVar != null) {
            ijfVar.mo15212a(m1246v(), str, media);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m1329E0(View view) {
        this.f869d.b();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m1330F0(VListCell vListCell, VListCell.a aVar, int i) {
        this.f869d.b();
        if (TextUtils.equals(aVar.a, "更换头像")) {
            m1322s0();
            return;
        }
        if (TextUtils.equals(aVar.a, m1358n0().string(R.string.wj)) || TextUtils.equals(aVar.a, "重新裁剪照片")) {
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.c("e_picture_re_edit_button", "p_edit_profile_view", new o6j0.a[0]);
            }
            if (NullChecker.a(this.f937I)) {
                this.f941M.remove(this.f937I);
                m1364u0(this.f937I.url);
                CoreModule.c.e0.G1.onNext(roj0.a);
                return;
            }
            StringBuilder sb = new StringBuilder("MediaReorderCard error: ");
            for (int i2 = 0; i2 < this.f940L.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f940L.get(i2));
            }
            CrashHelper.c(new NullPointerException(sb.toString()));
            return;
        }
        if (TextUtils.equals(aVar.a, m1358n0().string(R.string.t))) {
            m1362q1();
            return;
        }
        if (!TextUtils.equals(aVar.a, m1358n0().string(R.string.j)) && !TextUtils.equals(aVar.a, "删除该照片") && !TextUtils.equals(aVar.a, "删除该视频")) {
            if (TextUtils.equals(aVar.a, "编辑标签")) {
                m1318o0();
                return;
            }
            return;
        }
        if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
            o6j0.c("e_profile_add_delete_photos", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("add_delete_picture", "delete_picture"), o6j0.a.f("picture_number", m1246v() + 1)});
        }
        this.f941M.remove(this.f937I);
        this.f937I = null;
        m1317m1("delete");
        m1319p1();
        m1238l();
        setIllegalPicture(false);
        m1353e1(null, true, false);
        m1355h1();
        a2m a2mVar = this.f868c.f9399f.f897h;
        if (a2mVar != null) {
            a2mVar.mo1668b();
        }
        CoreModule.c.e0.G1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m1331G0(DownloadTask downloadTask, File file) {
        m1358n0().progressDismiss();
        getMediaOperation().f2(m1246v(), file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m1332H0(DownloadTask downloadTask, Throwable th) {
        m1358n0().progressDismiss();
        lsi0.w(R.string.s4);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m1333I0(Media media) {
        if (this.f937I == media) {
            m1356l1(null);
            this.f956t.animate().alpha(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m1334J0(Picture picture, int[] iArr) {
        m1351b1(picture);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m1335K0(int[] iArr) {
        if (NullChecker.a(this.f937I) && NullChecker.a(this.f937I.cover()) && NullChecker.a(((Media) this.f937I.cover()).url)) {
            qib0.G.J0(this.f955s, this.f937I.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m1336L0(View view) {
        m1318o0();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m1337M0() {
        m1322s0();
        zvf0.u("e_replace_photo", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", this.f943O.mapping)});
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m1338N0() {
        zvf0.u("e_replace_photo_cancel", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", this.f943O.mapping)});
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m1339O0(DialogInterface dialogInterface) {
        this.f947S.i();
        this.f947S.l();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m1340P0(DialogInterface dialogInterface) {
        this.f947S.k();
        this.f947S.j();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m1341Q0(String str) {
        m1322s0();
        zvf0.u("e_replace_photo", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", str)});
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m1342R0(DialogInterface dialogInterface) {
        this.f948T.i();
        this.f948T.l();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m1343S0(DialogInterface dialogInterface) {
        this.f948T.k();
        this.f948T.j();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ c m1344T0(roj0 roj0Var) {
        return ya5.K(vwb.f0(new Media[]{this.f937I}), "profile", "user-profile", UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ c m1345U0(Picture picture) {
        CoreProviderInterface coreProviderInterfaceD = ura.e().d();
        return ((coreProviderInterfaceD.ak() || coreProviderInterfaceD.Fl() || this.f942N) && NullChecker.a(picture) && TEnum.equals(((Media) picture).status, "normal")) ? m1320q0(picture) : c.just(picture);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ c m1346V0(Media media) {
        m1323v0(media);
        if (NullChecker.a(this.f951W)) {
            this.f951W.run();
        }
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m1347W0(roj0 roj0Var) {
        setVisibility(0);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX INFO: renamed from: Z0 */
    public void m1349Z0() {
        int size;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        if (NullChecker.a(this.f937I) && TEnum.equals(this.f937I.status, "normal") && this.f932E0 > 0) {
            arrayList.add("编辑标签");
        }
        if (NullChecker.a(this.f937I) && TEnum.equals(this.f937I.status, "normal")) {
            if (this.f937I instanceof Picture) {
                arrayList.add("重新裁剪照片");
            }
            if (this.f932E0 == 0) {
                arrayList.add("更换头像");
            }
            if (this.f937I instanceof Picture) {
                this.f940L.clear();
                this.f940L.add("show action dialog");
            }
        }
        if (NullChecker.a(this.f937I) && !TEnum.equals(this.f937I.status, "normal") && this.f938J == null) {
            arrayList.add(m1358n0().getString(R.string.t));
        }
        if (m1236i() <= 1 || !NullChecker.a(this.f937I) || this.f932E0 <= 0) {
            size = -1;
        } else {
            Media media = this.f937I;
            if (media instanceof Picture) {
                size = arrayList.size();
                arrayList.add("删除该照片");
            } else if (media instanceof Video) {
                size = arrayList.size();
                arrayList.add("删除该视频");
            } else {
                size = -1;
            }
        }
        if (this.f942N && NullChecker.a(this.f937I)) {
            Picture picture = this.f937I;
            if ((picture instanceof Picture) && picture.isLow() && m1246v() != 0) {
                arrayList.clear();
                arrayList.add(m1358n0().getString(R.string.t));
                size = arrayList.size();
                arrayList.add(m1358n0().getString(R.string.j));
            }
        }
        if (!this.f880o) {
            arrayList.clear();
            if (!TEnum.equals(this.f937I.status, "normal")) {
                arrayList.add(m1358n0().getString(R.string.t));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        m1363t0(arrayList, size);
    }

    /* JADX INFO: renamed from: a1 */
    public void m1350a1(final Picture picture) {
        xdl0.Q0(this, new e30() { // from class: l.abf
            public final void call(Object obj) {
                this.f7484a.m1334J0(picture, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m1351b1(Media media) {
        if (NullChecker.a(this.f937I)) {
            media.tags = this.f937I.tags;
        }
        if (NullChecker.a(this.f937I)) {
            this.f952k0 = this.f937I.clone();
        }
        this.f937I = media;
        m1317m1("onPickMedia");
        m1362q1();
        m1354f1();
        m1233f();
        m1355h1();
    }

    /* JADX INFO: renamed from: d1 */
    public void m1352d1(Media media) {
        m1353e1(media, false, true);
    }

    /* JADX INFO: renamed from: e1 */
    public void m1353e1(Media media, boolean z, boolean z2) {
        if (NullChecker.a(media) && NullChecker.a(this.f937I)) {
            media.tags = this.f937I.tags;
        }
        this.f937I = media;
        m1317m1("render");
        m1354f1();
        if (NullChecker.a(this.f939K)) {
            this.f939K.a(media, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX INFO: renamed from: f1 */
    public void m1354f1() {
        boolean z = false;
        boolean z2 = true;
        mo1128k(this.f937I == null);
        xdl0.M(this.f931E, this.f937I instanceof Video);
        if (NullChecker.a(this.f937I) && NullChecker.a(this.f937I.cover()) && NullChecker.a(((Media) this.f937I.cover()).url)) {
            xdl0.Q0(this.f955s, new e30() { // from class: l.eaf
                public final void call(Object obj) {
                    this.f9649a.m1335K0((int[]) obj);
                }
            });
        } else {
            Media media = this.f937I;
            if (media instanceof Video) {
                qib0.G.m0(this.f955s, media.url);
            } else {
                qib0.G.o(this.f955s);
            }
        }
        if (NullChecker.a(this.f937I) && this.f938J == null && !TEnum.equals(this.f937I.status, "normal")) {
            this.f929C.setImageResource(x2c0.a7);
            m1356l1(this.f929C);
            z = true;
        }
        if (this.f937I == null) {
            m1356l1(null);
            this.f956t.setAlpha(0.0f);
        }
        if ((ura.e().d().ak() || ura.e().d().Fl()) && NullChecker.a(this.f937I)) {
            Picture picture = this.f937I;
            if ((picture instanceof Picture) && (picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE")) || this.f937I.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE")))) {
                this.f929C.setImageResource(x2c0.a7);
                m1356l1(this.f929C);
                this.f956t.animate().alpha(1.0f).start();
            } else if (this.f942N || !NullChecker.a(this.f937I)) {
                this.f956t.animate().alpha(0.0f).start();
                z2 = z;
            } else {
                Picture picture2 = this.f937I;
                if ((picture2 instanceof Picture) && picture2.isLow()) {
                    this.f929C.setImageResource(x2c0.a7);
                    m1356l1(this.f929C);
                    this.f956t.animate().alpha(1.0f).start();
                } else {
                    this.f956t.animate().alpha(0.0f).start();
                    z2 = z;
                }
            }
        } else if (this.f942N) {
            this.f956t.animate().alpha(0.0f).start();
            z2 = z;
        } else {
            this.f956t.animate().alpha(0.0f).start();
            z2 = z;
        }
        m1359n1(z2);
        m1308g1();
    }

    public List<Media> getAddPhotos() {
        return this.f941M;
    }

    public fwl getMediaOperation() {
        if (NullChecker.a(this.f878m)) {
            return this.f878m;
        }
        return getContext() instanceof fwl ? getContext() : (ProfileMediaAct) getContext();
    }

    /* JADX INFO: renamed from: h1 */
    public void m1355h1() {
        ObjectAnimator objectAnimator;
        if (!ura.e().d().F7() || this.f932E0 == -1) {
            return;
        }
        this.f954r.setBackgroundResource(x2c0.T6);
        if (this.f953p0 == null) {
            ExpFakeCardBgView expFakeCardBgView = new ExpFakeCardBgView(getContext());
            this.f953p0 = expFakeCardBgView;
            MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f954r;
            int i = xdl0.e;
            mediaReorderCardScaleIndependentFrame.addView(expFakeCardBgView, i, i);
            this.f953p0.setGravity(17);
        }
        if (lqa.k()) {
            int i2 = this.f932E0;
            if (i2 <= 0 || i2 >= 3 || ((objectAnimator = this.f934F0) != null && objectAnimator.isRunning())) {
                int i3 = this.f932E0;
                if (i3 <= 0 || i3 >= 3) {
                    this.f953p0.f978b.setTextColor(Color.parseColor("#cccccc"));
                    this.f953p0.f979c.setTextColor(Color.parseColor("#cccccc"));
                    if (this.f953p0.f977a.getBackground() != null) {
                        this.f953p0.f977a.getBackground().clearColorFilter();
                    }
                    this.f954r.getBackground().clearColorFilter();
                }
            } else {
                this.f953p0.f978b.setTextColor(getResources().getColor(w0c0.A));
                this.f953p0.f979c.setTextColor(getResources().getColor(w0c0.A));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getResources().getColor(w0c0.A), PorterDuff.Mode.SRC_ATOP);
                this.f954r.getBackground().setColorFilter(porterDuffColorFilter);
                if (this.f953p0.f977a.getBackground() != null && !porterDuffColorFilter.equals(this.f953p0.f977a.getBackground().getColorFilter())) {
                    Drawable drawableMutate = this.f953p0.f977a.getBackground().mutate();
                    drawableMutate.setColorFilter(porterDuffColorFilter);
                    this.f953p0.f977a.setImageDrawable(drawableMutate);
                }
            }
        }
        int i4 = this.f935G;
        this.f953p0.m1399c(this.f932E0, (i4 == 2 || i4 == 3) ? false : true, i4 != 3 || this.f932E0 < 3);
        xdl0.M0(this.f953p0, this.f937I == null);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: k */
    public void mo1128k(boolean z) {
        super.mo1128k(z);
    }

    /* JADX INFO: renamed from: l1 */
    public void m1356l1(View view) {
        this.f961y.F(view, new w9j() { // from class: l.jaf
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(1.0f).setDuration(200L);
            }
        }, new w9j() { // from class: l.kaf
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(0.0f).setDuration(200L);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m1357m0(View view) {
        this.f954r = (MediaReorderCardScaleIndependentFrame) view.findViewById(u4c0.z4);
        this.f955s = view.findViewById(u4c0.L5);
        this.f956t = view.findViewById(u4c0.V7);
        this.f957u = view.findViewById(u4c0.Pe);
        this.f958v = (TextView) view.findViewById(u4c0.J5);
        this.f959w = (LinearLayout) view.findViewById(u4c0.Hd);
        this.f960x = (TextView) view.findViewById(u4c0.Fd);
        this.f962z = (ImageView) view.findViewById(u4c0.yc);
        this.f961y = view.findViewById(u4c0.zc);
        this.f927A = view.findViewById(u4c0.Qe);
        this.f928B = view.findViewById(u4c0.Re);
        this.f929C = (ImageView) view.findViewById(u4c0.dd);
        ImageView imageView = (ImageView) view.findViewById(u4c0.P8);
        this.f931E = imageView;
        imageView.setImageResource(x2c0.P6);
    }

    /* JADX INFO: renamed from: n0 */
    public Act m1358n0() {
        return getContext();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m1359n1(boolean z) {
        if (z || this.f935G == 0 || !NullChecker.a(this.f937I) || !TEnum.equals(this.f937I.status, "normal")) {
            xdl0.M0(this.f962z, false);
            return;
        }
        int iM1246v = m1246v();
        ImageView imageView = this.f962z;
        if (iM1246v == 0) {
            imageView.setImageResource(x2c0.Q6);
            xdl0.M0(this.f962z, true);
        } else {
            imageView.setImageResource(x2c0.N6);
            xdl0.M0(this.f962z, true);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m1360o1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f957u;
        if (zIsEmpty) {
            xdl0.M0(vText, false);
            return;
        }
        xdl0.M0(vText, true);
        this.f957u.setText(m1358n0().getString(R.string.Y3, str));
        m1303c1();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1357m0(this);
        this.f954r.setBackgroundResource(x2c0.Um);
        setClipToPadding(false);
        setClipChildren(false);
        MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f954r;
        int i = t100.h;
        xdl0.W(mediaReorderCardScaleIndependentFrame, i);
        xdl0.U(this.f954r, i);
        this.f955s.getHierarchy().H(RoundingParams.b(i, i, i, i));
        xdl0.p0(this.f927A);
        this.f927A = this.f928B;
        xdl0.M(findViewById(u4c0.Pb), false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public void m1361p0() {
        final Drawable background = this.f954r.getBackground();
        ExpFakeCardBgView expFakeCardBgView = this.f953p0;
        if (expFakeCardBgView == null || this.f937I != null) {
            this.f949U = true;
            return;
        }
        final Drawable drawableMutate = expFakeCardBgView.f977a.getBackground().mutate();
        this.f953p0.f977a.setBackground(drawableMutate);
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f953p0.f978b, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602"))).setDuration(800L);
        this.f934F0 = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hbf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11960a.m1325A0(background, drawableMutate, valueAnimator);
            }
        });
        this.f934F0.setRepeatMode(2);
        this.f934F0.setRepeatCount(4);
        this.f934F0.setInterpolator(null);
        bt0.f(this.f934F0, new Runnable() { // from class: l.ibf
            @Override // java.lang.Runnable
            public final void run() {
                this.f13130a.m1355h1();
            }
        });
        this.f934F0.start();
    }

    /* JADX INFO: renamed from: q1 */
    public void m1362q1() {
        TrackMediaUploadUtil.a0(this.f937I);
        boolean zStartsWith = this.f937I.url.startsWith("http");
        Media media = this.f937I;
        c cVarCompose = (zStartsWith ? c.just(media.clone()).map(new w9j() { // from class: l.jbf
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m1309h0((Media) obj);
            }
        }) : m1321r0(media).flatMap(new w9j() { // from class: l.kbf
            public final Object call(Object obj) {
                return this.f14270a.m1344T0((roj0) obj);
            }
        }).map(new w9j() { // from class: l.lbf
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m1292T((List) obj);
            }
        })).flatMap(new w9j() { // from class: l.mbf
            public final Object call(Object obj) {
                return this.f15321a.m1345U0((Picture) obj);
            }
        }).compose(TrackMediaUploadUtil.f0("profile", vwb.f0(new Media[]{this.f937I}), (w9j) null));
        m1356l1(this.f927A);
        setIllegalPicture(false);
        this.f956t.animate().alpha(1.0f).start();
        this.f938J = m1358n0().duringCreated(cVarCompose.compose(mkd0.C()).switchMap(new w9j() { // from class: l.nbf
            public final Object call(Object obj) {
                return this.f15910a.m1346V0((Media) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.faf
            public final void call(Object obj) {
                this.f10205a.m1347W0((roj0) obj);
            }
        }, new e30() { // from class: l.gaf
            public final void call(Object obj) {
                this.f11319a.m1348X0((Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: r */
    public void mo1136r(Media media, Runnable runnable) {
        this.f951W = runnable;
        m1351b1(media);
    }

    public void setChangeAction(g30<Media, Boolean, Boolean> g30Var) {
        this.f939K = g30Var;
    }

    public void setEnableLowPhoto(boolean z) {
        this.f942N = z;
    }

    public void setFrom(String str) {
        this.f936H = str;
    }

    public void setIllegalPicture(boolean z) {
        this.f933F = z;
        this.f958v.setVisibility(z ? 0 : 4);
    }

    public void setStyle(int i) {
        this.f935G = i;
    }

    public void setUploadDataCallback(ijf ijfVar) {
        this.f930D = ijfVar;
    }

    /* JADX INFO: renamed from: t0 */
    public void m1363t0(ArrayList<CharSequence> arrayList, int i) {
        c40.b bVar = new c40.b(getContext());
        bVar.I(m1358n0().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.maf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15298a.m1329E0(view);
            }
        }).Q(arrayList).R(new int[]{i}, new int[]{w0c0.L}).V(new c40.d() { // from class: l.naf
            /* JADX INFO: renamed from: a */
            public final void m18635a(VListCell vListCell, VListCell.a aVar, int i2) {
                this.f15903a.m1330F0(vListCell, aVar, i2);
            }
        });
        c40 c40VarF = bVar.F();
        this.f869d = c40VarF;
        c40VarF.f();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo1140u() {
        if (SystemClock.uptimeMillis() - this.f950V < 500) {
            return;
        }
        this.f950V = SystemClock.uptimeMillis();
        if (xdl0.O0(this)) {
            if (this.f937I != null || !lqa.w()) {
                m1349Z0();
                return;
            }
            if (lqa.k()) {
                CoreModule.P().a().Kc(m1358n0(), this.f932E0, new d30() { // from class: l.paf
                    public final void call() {
                        this.f17173a.m1322s0();
                    }
                });
                return;
            }
            if (!this.f942N) {
                m1322s0();
            } else if (m1298Y0()) {
                m1311i1();
            } else {
                m1322s0();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m1364u0(String str) {
        String str2 = ogw.e(str) + ".jpg";
        File fileG1 = CropperAct.G1(getContext());
        if (!fileG1.exists()) {
            fileG1.mkdir();
        }
        File file = new File(fileG1, str2);
        if (file.exists()) {
            getMediaOperation().f2(m1246v(), file.getAbsolutePath());
        } else {
            m1358n0().progress((String) null);
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(str).o(file.getAbsolutePath()).j(new f30() { // from class: l.fbf
                public final void call(Object obj, Object obj2) {
                    this.f10223a.m1331G0((DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.gbf
                public final void call(Object obj, Object obj2) {
                    this.f11346a.m1332H0((DownloadTask) obj, (Throwable) obj2);
                }
            }).a());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m1365x0(int i) {
        if (ura.e().d().F7()) {
            this.f932E0 = i;
            m1355h1();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m1366y0() {
        return this.f941M.size() > 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m1367z0() {
        m1352d1(this.f937I);
        if (NullChecker.a(this.f868c.f9399f.f897h)) {
            this.f868c.f9399f.f897h.mo1667a();
        }
    }

    public ExpEditProfileImageCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f933F = false;
        this.f935G = 0;
        this.f940L = new ArrayList(1);
        this.f941M = new ArrayList();
        this.f932E0 = -1;
    }

    public ExpEditProfileImageCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f933F = false;
        this.f935G = 0;
        this.f940L = new ArrayList(1);
        this.f941M = new ArrayList();
        this.f932E0 = -1;
    }
}
