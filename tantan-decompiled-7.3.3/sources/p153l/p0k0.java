package p153l;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PhotoLowModelData;
import com.p051p1.mobile.putong.core.data.PictureServeCheckResult;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p051p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p051p1.mobile.putong.core.view.AvatarUpdateType;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class p0k0 {

    /* JADX INFO: renamed from: a */
    public kcg0 f150055a;

    /* JADX INFO: renamed from: b */
    public kcg0 f150056b;

    /* JADX INFO: renamed from: l.p0k0$a */
    public static class C19266a {

        /* JADX INFO: renamed from: a */
        public AvatarUpdateType f150057a = AvatarUpdateType.AVATAR;

        /* JADX INFO: renamed from: b */
        public final List<AvatarUpdateCheckType> f150058b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f150059c = false;

        /* JADX INFO: renamed from: d */
        public boolean f150060d = false;

        /* JADX INFO: renamed from: e */
        public boolean f150061e = false;

        /* JADX INFO: renamed from: f */
        public final List<String> f150062f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public String f150063g = "";

        /* JADX INFO: renamed from: h */
        public C19266a m170159h(AvatarUpdateCheckType avatarUpdateCheckType) {
            this.f150058b.add(avatarUpdateCheckType);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19266a m170160i(boolean z) {
            this.f150061e = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C19266a m170161j(List<String> list) {
            this.f150062f.clear();
            if (!jyb.m147479J(list)) {
                this.f150062f.addAll(new ArrayList(list));
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19266a m170162k(boolean z) {
            this.f150059c = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C19266a m170163l(boolean z) {
            this.f150060d = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C19266a m170164m(String str) {
            this.f150063g = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19266a m170165n(AvatarUpdateType avatarUpdateType) {
            this.f150057a = avatarUpdateType;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.p0k0$b */
    public static class C19267b {

        /* JADX INFO: renamed from: b */
        public Media f150065b;

        /* JADX INFO: renamed from: c */
        public String f150066c;

        /* JADX INFO: renamed from: g */
        public PictureServeCheckResult f150070g;

        /* JADX INFO: renamed from: h */
        public String f150071h;

        /* JADX INFO: renamed from: i */
        public boolean f150072i;

        /* JADX INFO: renamed from: a */
        public AvatarUpdateProgress f150064a = AvatarUpdateProgress.IDLE;

        /* JADX INFO: renamed from: d */
        public boolean f150067d = false;

        /* JADX INFO: renamed from: e */
        public boolean f150068e = false;

        /* JADX INFO: renamed from: f */
        public boolean f150069f = false;

        /* JADX INFO: renamed from: a */
        public C19267b m170166a() {
            C19267b c19267b = new C19267b();
            c19267b.f150067d = this.f150067d;
            c19267b.f150068e = this.f150068e;
            c19267b.f150069f = this.f150069f;
            c19267b.f150064a = this.f150064a;
            c19267b.f150072i = this.f150072i;
            Media media = this.f150065b;
            if (media != null) {
                c19267b.f150065b = media.mo225055clone();
            }
            c19267b.f150066c = this.f150066c;
            PictureServeCheckResult pictureServeCheckResult = this.f150070g;
            if (pictureServeCheckResult != null) {
                c19267b.f150070g = pictureServeCheckResult.mo225055clone();
            }
            c19267b.f150071h = this.f150071h;
            return c19267b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C19267b c19267b = (C19267b) obj;
                if (this.f150067d == c19267b.f150067d && this.f150068e == c19267b.f150068e && this.f150069f == c19267b.f150069f && this.f150064a == c19267b.f150064a && this.f150072i == c19267b.f150072i && Objects.equals(this.f150065b, c19267b.f150065b) && Objects.equals(this.f150066c, c19267b.f150066c) && Objects.equals(this.f150070g, c19267b.f150070g) && Objects.equals(this.f150071h, c19267b.f150071h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f150064a, this.f150065b, this.f150066c, Boolean.valueOf(this.f150067d), Boolean.valueOf(this.f150068e), Boolean.valueOf(this.f150069f), this.f150070g, this.f150071h, Boolean.valueOf(this.f150072i));
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m170063C(C19267b c19267b, List list) {
        c19267b.f150064a = AvatarUpdateProgress.UPLOAD_DONE;
        c19267b.f150071h = "上传图片-结束";
        c19267b.f150065b = (Media) list.get(0);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Boolean m170064D(C19267b c19267b) {
        AvatarUpdateProgress avatarUpdateProgress = c19267b.f150064a;
        return Boolean.valueOf(avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m170066F(C19267b c19267b, List list) {
        c19267b.f150064a = AvatarUpdateProgress.UPLOAD_DONE;
        c19267b.f150071h = "上传视频-结束";
        c19267b.f150065b = (Media) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C19267b m170070J(C19267b c19267b, bkj0 bkj0Var) {
        if (!((Boolean) bkj0Var.f77081a).booleanValue()) {
            return c19267b;
        }
        c19267b.f150066c = "上传失败";
        c19267b.f150064a = AvatarUpdateProgress.FAIL;
        c19267b.f150067d = true;
        throw new IllegalPictureException("检测到敏感信息，上传失败");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m170088e(C19267b c19267b) {
        AvatarUpdateProgress avatarUpdateProgress = c19267b.f150064a;
        return Boolean.valueOf(avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m170093j(Act act, DownloadTask downloadTask, Throwable th) {
        act.progressDismiss();
        o1j0.m165649w(R$string.f56624m);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ List m170100q(C19267b c19267b, Throwable th) {
        c19267b.f150066c = "上传失败";
        c19267b.f150064a = AvatarUpdateProgress.FAIL;
        c19267b.f150071h = "上传图片-失败";
        c19267b.f150067d = true;
        return jyb.m147482M(c19267b.f150065b);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C19267b m170102s(C19267b c19267b, Throwable th) {
        return c19267b;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m170108y(C19267b c19267b, Throwable th) {
        c19267b.f150066c = "上传失败";
        c19267b.f150064a = AvatarUpdateProgress.FAIL;
        c19267b.f150071h = "上传视频-失败";
        c19267b.f150067d = true;
        return jyb.m147482M(c19267b.f150065b);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m170110A0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.UPLOADING;
        c19267b.f150071h = "上传视频-开始";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ C19267b m170111B0(C22507a c22507a, C19267b c19267b, List list) {
        m170120K0(c22507a, c19267b);
        return c19267b;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ C22421c m170112C0(final C19267b c19267b, final C22507a c22507a, List list) {
        return (TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed) ? yb5.m214982K(jyb.m147507f0((Media) list.get(0)), "profile", "user-profile", UploadSource.get("profile")) : C22421c.just(list)).doOnNext(new y20() { // from class: l.g0k0
            @Override // p153l.y20
            public final void call(Object obj) {
                p0k0.m170066F(c19267b, (List) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.h0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p0k0.m170108y(c19267b, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.i0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112382a.m170111B0(c22507a, c19267b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C22421c m170113D0(C19267b c19267b, final C22507a c22507a, final C19267b c19267b2) {
        return new i1y(jyb.m147507f0(c19267b.f150065b), true).flatMap(new qcj() { // from class: l.pzj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154872a.m170112C0(c19267b2, c22507a, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m170114E0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.FINISH;
        c19267b.f150071h = "订阅结束-完成";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m170115F0(C19267b c19267b, C22507a c22507a, Throwable th) {
        c19267b.f150064a = AvatarUpdateProgress.FAIL;
        if (TextUtils.isEmpty(c19267b.f150066c)) {
            c19267b.f150066c = "上传失败";
        }
        c19267b.f150071h = "订阅结束-失败";
        m170120K0(c22507a, c19267b);
        m170117H0();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m170116G0(Act act, C19266a c19266a, C22507a<C19267b> c22507a, C19267b c19267b) {
        m170117H0();
        this.f150056b = c22507a.filter(new qcj() { // from class: l.zzj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p0k0.m170064D((p0k0.C19267b) obj);
            }
        }).filter(new qcj() { // from class: l.j0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                p0k0.C19267b c19267b2 = (p0k0.C19267b) obj;
                return Boolean.valueOf((c19267b2 == null || (media = c19267b2.f150065b) == null || TEnum.equals(c19267b2.status, "raw")) ? false : true);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.k0k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123404a.m170134i0((p0k0.C19267b) obj);
            }
        }));
        m170120K0(c22507a, c19267b);
        Media media = c19267b.f150065b;
        if (media instanceof Picture) {
            m170121L0(act, c19266a, c19267b, c22507a);
            return;
        }
        if (media instanceof Video) {
            long j = new vel0(oki.m168038z(media.url)).f183806b;
            if (j >= 16000) {
                o1j0.m165636j("你的视频长度太长了");
                c19267b.f150064a = AvatarUpdateProgress.CANCEL;
                c19267b.f150071h = "你的视频长度太长了";
                m170120K0(c22507a, c19267b);
                return;
            }
            if (j >= 3000) {
                m170122M0(c19267b, c22507a);
                return;
            }
            o1j0.m165636j("你的视频长度太短了");
            c19267b.f150064a = AvatarUpdateProgress.CANCEL;
            c19267b.f150071h = "你的视频长度太短了";
            m170120K0(c22507a, c19267b);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m170117H0() {
        psd0.m173633z(this.f150055a);
        this.f150055a = null;
        psd0.m173633z(this.f150056b);
        this.f150056b = null;
    }

    /* JADX INFO: renamed from: I0 */
    public void m170118I0(Act act, C19266a c19266a, C22507a<C19267b> c22507a) {
        C19267b c19267bM222761e = c22507a.m222761e();
        c19267bM222761e.f150064a = AvatarUpdateProgress.FINISH_PICK;
        c19267bM222761e.f150067d = false;
        c19267bM222761e.f150066c = "";
        c19267bM222761e.f150068e = true;
        c19267bM222761e.f150071h = "重试上传";
        m170116G0(act, c19266a, c22507a, c19267bM222761e);
    }

    /* JADX INFO: renamed from: J0 */
    public void m170119J0(final Act act, final C19266a c19266a, final C22507a<C19267b> c22507a) {
        MediaPickerParamsObject.MediaPickerParamsObjectBuilder croppingNewStyle;
        final C19267b c19267bM222761e = c22507a.m222761e();
        if (c19267bM222761e == null) {
            o1j0.m165636j("请使用正确的方式上传");
            return;
        }
        c19267bM222761e.f150064a = AvatarUpdateProgress.PICK;
        c19267bM222761e.f150067d = false;
        c19267bM222761e.f150071h = "拉起选择照片";
        m170120K0(c22507a, c19267bM222761e);
        if (c19266a.f150059c == c19266a.f150060d) {
            croppingNewStyle = MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1);
        } else {
            croppingNewStyle = c19266a.f150059c ? MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(gta.m132210e().m132214d().mo34724Mm(act)) : MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1);
        }
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, croppingNewStyle.build()), new C4468a.a() { // from class: l.ozj0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f149927a.m170135j0(c19267bM222761e, c22507a, act, c19266a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final synchronized void m170120K0(C22507a<C19267b> c22507a, C19267b c19267b) {
        try {
            AvatarUpdateProgress avatarUpdateProgress = c19267b.f150064a;
            if (avatarUpdateProgress == AvatarUpdateProgress.FINISH) {
                c19267b.f150069f = true;
            } else if (avatarUpdateProgress == AvatarUpdateProgress.FINISH_PICK || avatarUpdateProgress == AvatarUpdateProgress.FAIL) {
                c19267b.f150069f = false;
            }
            c22507a.m137019l(c19267b.m170166a());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m170121L0(final Act act, final C19266a c19266a, final C19267b c19267b, final C22507a<C19267b> c22507a) {
        List<AvatarUpdateCheckType> list = c19266a.f150058b;
        C22421c c22421cJust = C22421c.just(c19267b);
        if (!jyb.m147479J(list)) {
            for (final AvatarUpdateCheckType avatarUpdateCheckType : list) {
                if (avatarUpdateCheckType.isBeforeCheck()) {
                    c22421cJust = c22421cJust.filter(new qcj() { // from class: l.wyj0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
                        }
                    }).doOnNext(new y20() { // from class: l.ezj0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f96603a.m170136k0(c22507a, (p0k0.C19267b) obj);
                        }
                    }).switchMap(new qcj() { // from class: l.fzj0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f101485a.m170137l0(c19266a, avatarUpdateCheckType, (p0k0.C19267b) obj);
                        }
                    }).doOnNext(new y20() { // from class: l.gzj0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f107209a.m170138m0(c22507a, (p0k0.C19267b) obj);
                        }
                    }).onErrorReturn(new qcj() { // from class: l.hzj0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f112257a.m170139n0(c19267b, c22507a, (Throwable) obj);
                        }
                    });
                }
            }
        }
        C22421c c22421cSwitchMap = c22421cJust.filter(new qcj() { // from class: l.izj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
            }
        }).doOnNext(new y20() { // from class: l.jzj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123265a.m170140o0(c22507a, (p0k0.C19267b) obj);
            }
        }).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.kzj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129431a.m170142q0(c22507a, (p0k0.C19267b) obj);
            }
        });
        if (c19266a.f150061e) {
            c22421cSwitchMap = c22421cSwitchMap.flatMap(new qcj() { // from class: l.lzj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f134230a.m170146u0(c19266a, act, c22507a, (p0k0.C19267b) obj);
                }
            });
        }
        if (!jyb.m147479J(list)) {
            for (final AvatarUpdateCheckType avatarUpdateCheckType2 : list) {
                if (!avatarUpdateCheckType2.isBeforeCheck()) {
                    c22421cSwitchMap = c22421cSwitchMap.filter(new qcj() { // from class: l.mzj0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
                        }
                    }).doOnNext(new y20() { // from class: l.xyj0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f196754a.m170147v0(c22507a, (p0k0.C19267b) obj);
                        }
                    }).switchMap(new qcj() { // from class: l.yyj0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f202114a.m170148w0(c19266a, avatarUpdateCheckType2, (p0k0.C19267b) obj);
                        }
                    }).doOnNext(new y20() { // from class: l.zyj0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f206612a.m170149x0(c22507a, (p0k0.C19267b) obj);
                        }
                    });
                }
            }
        }
        this.f150055a = c22421cSwitchMap.filter(new qcj() { // from class: l.azj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.bzj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79138a.m170150y0(c22507a, (p0k0.C19267b) obj);
            }
        }, new y20() { // from class: l.czj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84479a.m170151z0(c19267b, c22507a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m170122M0(final C19267b c19267b, final C22507a<C19267b> c22507a) {
        this.f150055a = C22421c.just(c19267b).filter(new qcj() { // from class: l.l0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
            }
        }).doOnNext(new y20() { // from class: l.m0k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134319a.m170110A0(c22507a, (p0k0.C19267b) obj);
            }
        }).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.n0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139632a.m170113D0(c19267b, c22507a, (p0k0.C19267b) obj);
            }
        }).filter(new qcj() { // from class: l.o0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((p0k0.C19267b) obj).f150065b.status, "normal"));
            }
        }).filter(new qcj() { // from class: l.tyj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.uyj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181628a.m170114E0(c22507a, (p0k0.C19267b) obj);
            }
        }, new y20() { // from class: l.vyj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186382a.m170115F0(c19267b, c22507a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m170123X(Picture picture, boolean z, String str) {
        if (z) {
            picture.setLabel(MediaLabel.get(str));
        } else {
            picture.removeLabel(MediaLabel.get(str));
        }
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22421c<C19267b> m170148w0(final C19266a c19266a, AvatarUpdateCheckType avatarUpdateCheckType, final C19267b c19267b) {
        C22421c<C19267b> c22421cJust = C22421c.just(c19267b);
        if (avatarUpdateCheckType == AvatarUpdateCheckType.LOCAL_CHECK) {
            return c22421cJust.filter(new qcj() { // from class: l.wzj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
                }
            }).switchMap(new qcj() { // from class: l.xzj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    p0k0.C19267b c19267b2 = (p0k0.C19267b) obj;
                    return uqb0.f180386R.m184739b(Uri.parse(c19267b2.f150065b.url).getPath()).map(new qcj() { // from class: l.b0k0
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return p0k0.m170070J(c19267b2, (bkj0) obj2);
                        }
                    });
                }
            });
        }
        return avatarUpdateCheckType == AvatarUpdateCheckType.REMOTE_CHECK ? c22421cJust.filter(new qcj() { // from class: l.yzj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((p0k0.C19267b) obj).f150067d);
            }
        }).switchMap(new qcj() { // from class: l.a0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f67724a.m170130e0(c19266a, c19267b, (p0k0.C19267b) obj);
            }
        }) : c22421cJust;
    }

    /* JADX INFO: renamed from: Z */
    public final void m170125Z(final Act act, final C19266a c19266a, final C22507a<C19267b> c22507a, final C19267b c19267b, File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        act.startActivityForResult(NewAlbumCropperAct.m80086n2(act, file.getAbsolutePath(), 0.8f, bnl0.m105592y0() - qa00.m175859d(60.0f), c19266a.f150057a == AvatarUpdateType.AVATAR), new C4468a.a() { // from class: l.nzj0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f144444a.m170132g0(c22507a, c19267b, act, c19266a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m170126a0(final Act act, final C19266a c19266a, final C22507a<C19267b> c22507a) {
        final C19267b c19267bM222761e = c22507a.m222761e();
        c19267bM222761e.f150064a = AvatarUpdateProgress.CROP;
        c19267bM222761e.f150067d = false;
        c19267bM222761e.f150071h = "裁剪照片";
        m170120K0(c22507a, c19267bM222761e);
        String str = c19267bM222761e.f150065b.url;
        if (str.startsWith("file://")) {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path)) {
                File file = new File(path);
                if (file.exists()) {
                    m170125Z(act, c19266a, c22507a, c19267bM222761e, file);
                    return;
                }
            }
        }
        String str2 = niw.m163315e(str) + ".jpg";
        File fileM22053H1 = CropperAct.m22053H1(act);
        if (!fileM22053H1.exists()) {
            fileM22053H1.mkdir();
        }
        File file2 = new File(fileM22053H1, str2);
        if (file2.exists()) {
            m170125Z(act, c19266a, c22507a, c19267bM222761e, file2);
        } else {
            act.progress((String) null);
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(c19267bM222761e.f150065b.url).m80823o(file2.getAbsolutePath()).m80818j(new z20() { // from class: l.syj0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f171267a.m170133h0(act, c19266a, c22507a, c19267bM222761e, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.dzj0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    p0k0.m170093j(act, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80809a());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m170127b0(Picture picture, CoreData coreData, C19267b c19267b) {
        PictureServeCheckResult pictureServeCheckResult = new PictureServeCheckResult();
        c19267b.f150070g = pictureServeCheckResult;
        PhotoLowModelData photoLowModelData = coreData.repeatPictureResult;
        pictureServeCheckResult.repeatPictureResult = photoLowModelData;
        pictureServeCheckResult.netPictureResult = coreData.netPictureResult;
        pictureServeCheckResult.lowPhotoResult = coreData.lowPhotoResult;
        pictureServeCheckResult.notVerificationResultData = coreData.notVerificationResultData;
        m170123X(picture, TextUtils.equals(photoLowModelData.audit, "repeat"), MediaLabel.WITH_REPEAT_MAIN_PICTURE);
        m170123X(picture, TextUtils.equals(coreData.netPictureResult.audit, "net"), MediaLabel.WITH_NET_MAIN_PICTURE);
        m170123X(picture, TextUtils.equals(coreData.lowPhotoResult.audit, "low"), MediaLabel.WITH_LOW);
        m170123X(picture, TextUtils.equals(coreData.notVerificationResultData.audit, "low"), MediaLabel.NOT_VERIFICATION);
        if (jyb.m147479J(coreData.verificationLowLabels)) {
            return;
        }
        c19267b.f150066c = coreData.verificationLowLabels.get(0);
    }

    /* JADX INFO: renamed from: c0 */
    public C22507a<C19267b> m170128c0() {
        return C22507a.m222758b();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ C19267b m170129d0(C19267b c19267b, Envelope envelope) {
        if (envelope != null && envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            Picture picture = (Picture) c19267b.f150065b;
            if (NullChecker.m82486a(coreData)) {
                m170127b0(picture, coreData, c19267b);
            }
        }
        return c19267b;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ C22421c m170130e0(C19266a c19266a, final C19267b c19267b, C19267b c19267b2) {
        return CoreModule.f18264c.f20381e0.m116466G9(c19267b2.f150065b.url, 1, TextUtils.isEmpty(c19266a.f150063g) ? "editProfile" : c19266a.f150063g).timeout(5L, TimeUnit.SECONDS, C22421c.just(null)).map(new qcj() { // from class: l.c0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79278a.m170129d0(c19267b, (Envelope) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.d0k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p0k0.m170102s(c19267b, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m170131f0(C19267b c19267b) {
        psd0.m173633z(this.f150055a);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m170132g0(C22507a c22507a, C19267b c19267b, Act act, C19266a c19266a, int i, int i2, Intent intent) {
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("path");
            Picture pictureNew_ = Picture.new_();
            pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pictureNew_.url = oki.m168011B(stringExtra);
            pictureNew_.size = new Dimension(new sim(oki.m168038z(pictureNew_.url)).f168843d);
            pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            m170117H0();
            this.f150056b = c22507a.filter(new qcj() { // from class: l.qzj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return p0k0.m170088e((p0k0.C19267b) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.rzj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f165547a.m170131f0((p0k0.C19267b) obj);
                }
            }));
            c19267b.f150065b = pictureNew_;
            c19267b.f150064a = AvatarUpdateProgress.FINISH_CROP;
            c19267b.f150066c = "";
            c19267b.f150068e = true;
            c19267b.f150071h = "裁剪照片-成功";
            m170120K0(c22507a, c19267b);
            m170121L0(act, c19266a, c19267b, c22507a);
        } else {
            c19267b.f150064a = AvatarUpdateProgress.CANCEL;
            c19267b.f150071h = "裁剪照片-取消";
            m170120K0(c22507a, c19267b);
            m170117H0();
        }
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m170133h0(Act act, C19266a c19266a, C22507a c22507a, C19267b c19267b, DownloadTask downloadTask, File file) {
        act.progressDismiss();
        m170125Z(act, c19266a, c22507a, c19267b, file);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m170134i0(C19267b c19267b) {
        psd0.m173633z(this.f150055a);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m170135j0(C19267b c19267b, C22507a c22507a, Act act, C19266a c19266a, int i, int i2, Intent intent) {
        if (i2 == -1) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
            if (jyb.m147479J(arrayList)) {
                c19267b.f150064a = AvatarUpdateProgress.CANCEL;
                c19267b.f150071h = "选择照片-异常";
                m170120K0(c22507a, c19267b);
                return true;
            }
            c19267b.f150065b = (Media) arrayList.get(0);
            c19267b.f150064a = AvatarUpdateProgress.FINISH_PICK;
            c19267b.f150066c = "";
            c19267b.f150068e = true;
            c19267b.f150071h = "选择媒体-成功";
            m170116G0(act, c19266a, c22507a, c19267b);
        } else if (i2 == 4097) {
            r1j0.m179420g(App.f16088e.getString(R$string.f56606J));
            c19267b.f150064a = AvatarUpdateProgress.CANCEL;
            c19267b.f150071h = "你的视频长度太长了";
            m170120K0(c22507a, c19267b);
        } else if (i2 == 4098) {
            r1j0.m179420g(App.f16088e.getString(R$string.f56607K));
            c19267b.f150064a = AvatarUpdateProgress.CANCEL;
            c19267b.f150071h = "你的视频长度太短了";
            m170120K0(c22507a, c19267b);
        } else {
            c19267b.f150064a = AvatarUpdateProgress.CANCEL;
            c19267b.f150071h = "选择媒体-取消";
            m170120K0(c22507a, c19267b);
            m170117H0();
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m170136k0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.BEFORE_CHECKING;
        c19267b.f150071h = "先检测流程-启动";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m170138m0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.BEFORE_DONE;
        c19267b.f150071h = "先检测流程-结束";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ C19267b m170139n0(C19267b c19267b, C22507a c22507a, Throwable th) {
        if (th instanceof IllegalPictureException) {
            o1j0.m165651y(th.getMessage());
        }
        c19267b.f150064a = AvatarUpdateProgress.FAIL;
        c19267b.f150067d = true;
        if (TextUtils.isEmpty(c19267b.f150066c)) {
            c19267b.f150066c = "上传失败";
        }
        c19267b.f150071h = "先检测流程-失败";
        m170120K0(c22507a, c19267b);
        return c19267b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m170140o0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.UPLOADING;
        c19267b.f150071h = "上传图片-开始";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19267b m170141p0(C22507a c22507a, C19267b c19267b, List list) {
        m170120K0(c22507a, c19267b);
        return c19267b;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22421c m170142q0(final C22507a c22507a, final C19267b c19267b) {
        return yb5.m214982K(jyb.m147507f0(c19267b.f150065b), "profile", "user-profile", UploadSource.get("profile")).doOnNext(new y20() { // from class: l.tzj0
            @Override // p153l.y20
            public final void call(Object obj) {
                p0k0.m170063C(c19267b, (List) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.uzj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p0k0.m170100q(c19267b, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.vzj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186497a.m170141p0(c22507a, c19267b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m170143r0(C19267b c19267b, C22507a c22507a, gcg0 gcg0Var) {
        c19267b.f150064a = AvatarUpdateProgress.ADD_TAG_FINISH;
        c19267b.f150071h = "添加标签-完成";
        m170120K0(c22507a, c19267b);
        gcg0Var.m137019l(c19267b);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m170144s0(C19267b c19267b, C22507a c22507a, gcg0 gcg0Var) {
        c19267b.f150064a = AvatarUpdateProgress.FINISH;
        c19267b.f150065b = null;
        c19267b.f150067d = true;
        c19267b.f150071h = "添加标签-取消";
        m170120K0(c22507a, c19267b);
        gcg0Var.m137019l(c19267b);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m170145t0(Act act, final C19267b c19267b, final C22507a c22507a, final gcg0 gcg0Var) {
        TagChooseMkAct.m44233w2(act, jyb.m147482M(c19267b.f150065b), null, new Runnable() { // from class: l.e0k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91470a.m170143r0(c19267b, c22507a, gcg0Var);
            }
        }, new Runnable() { // from class: l.f0k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96689a.m170144s0(c19267b, c22507a, gcg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C22421c m170146u0(C19266a c19266a, final Act act, final C22507a c22507a, final C19267b c19267b) {
        if (jyb.m147479J(c19266a.f150062f)) {
            return C22421c.create(new C22421c.a() { // from class: l.szj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171399a.m170145t0(act, c19267b, c22507a, (gcg0) obj);
                }
            });
        }
        c19267b.f150064a = AvatarUpdateProgress.ADD_TAG_FINISH;
        c19267b.f150071h = "添加标签-完成";
        c19267b.f150065b.tags = new ArrayList(c19266a.f150062f);
        m170120K0(c22507a, c19267b);
        return C22421c.just(c19267b);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m170147v0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.AFTER_CHECKING;
        c19267b.f150071h = "后检测流程-启动";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m170149x0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.AFTER_DONE;
        c19267b.f150071h = "后检测流程-结束";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m170150y0(C22507a c22507a, C19267b c19267b) {
        c19267b.f150064a = AvatarUpdateProgress.FINISH;
        c19267b.f150071h = "订阅结束-完成";
        m170120K0(c22507a, c19267b);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m170151z0(C19267b c19267b, C22507a c22507a, Throwable th) {
        c19267b.f150064a = AvatarUpdateProgress.FAIL;
        if (TextUtils.isEmpty(c19267b.f150066c)) {
            c19267b.f150066c = "上传失败";
        }
        c19267b.f150071h = "订阅结束-失败";
        m170120K0(c22507a, c19267b);
        m170117H0();
    }
}
