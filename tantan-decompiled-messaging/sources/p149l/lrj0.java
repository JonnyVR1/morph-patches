package p149l;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PhotoLowModelData;
import com.p046p1.mobile.putong.core.data.PictureServeCheckResult;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p046p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p046p1.mobile.putong.core.view.AvatarUpdateType;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class lrj0 {

    /* JADX INFO: renamed from: a */
    public c4g0 f129715a;

    /* JADX INFO: renamed from: b */
    public c4g0 f129716b;

    /* JADX INFO: renamed from: l.lrj0$a */
    public static class C18308a {

        /* JADX INFO: renamed from: a */
        public AvatarUpdateType f129717a = AvatarUpdateType.AVATAR;

        /* JADX INFO: renamed from: b */
        public final List<AvatarUpdateCheckType> f129718b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f129719c = false;

        /* JADX INFO: renamed from: d */
        public boolean f129720d = false;

        /* JADX INFO: renamed from: e */
        public boolean f129721e = false;

        /* JADX INFO: renamed from: f */
        public final List<String> f129722f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public String f129723g = "";

        /* JADX INFO: renamed from: h */
        public C18308a m151486h(AvatarUpdateCheckType avatarUpdateCheckType) {
            this.f129718b.add(avatarUpdateCheckType);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C18308a m151487i(boolean z) {
            this.f129721e = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C18308a m151488j(List<String> list) {
            this.f129722f.clear();
            if (!vwb.m200296J(list)) {
                this.f129722f.addAll(new ArrayList(list));
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C18308a m151489k(boolean z) {
            this.f129719c = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C18308a m151490l(boolean z) {
            this.f129720d = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C18308a m151491m(String str) {
            this.f129723g = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18308a m151492n(AvatarUpdateType avatarUpdateType) {
            this.f129717a = avatarUpdateType;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.lrj0$b */
    public static class C18309b {

        /* JADX INFO: renamed from: b */
        public Media f129725b;

        /* JADX INFO: renamed from: c */
        public String f129726c;

        /* JADX INFO: renamed from: g */
        public PictureServeCheckResult f129730g;

        /* JADX INFO: renamed from: h */
        public String f129731h;

        /* JADX INFO: renamed from: i */
        public boolean f129732i;

        /* JADX INFO: renamed from: a */
        public AvatarUpdateProgress f129724a = AvatarUpdateProgress.IDLE;

        /* JADX INFO: renamed from: d */
        public boolean f129727d = false;

        /* JADX INFO: renamed from: e */
        public boolean f129728e = false;

        /* JADX INFO: renamed from: f */
        public boolean f129729f = false;

        /* JADX INFO: renamed from: a */
        public C18309b m151493a() {
            C18309b c18309b = new C18309b();
            c18309b.f129727d = this.f129727d;
            c18309b.f129728e = this.f129728e;
            c18309b.f129729f = this.f129729f;
            c18309b.f129724a = this.f129724a;
            c18309b.f129732i = this.f129732i;
            Media media = this.f129725b;
            if (media != null) {
                c18309b.f129725b = media.mo223809clone();
            }
            c18309b.f129726c = this.f129726c;
            PictureServeCheckResult pictureServeCheckResult = this.f129730g;
            if (pictureServeCheckResult != null) {
                c18309b.f129730g = pictureServeCheckResult.mo223809clone();
            }
            c18309b.f129731h = this.f129731h;
            return c18309b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C18309b c18309b = (C18309b) obj;
                if (this.f129727d == c18309b.f129727d && this.f129728e == c18309b.f129728e && this.f129729f == c18309b.f129729f && this.f129724a == c18309b.f129724a && this.f129732i == c18309b.f129732i && Objects.equals(this.f129725b, c18309b.f129725b) && Objects.equals(this.f129726c, c18309b.f129726c) && Objects.equals(this.f129730g, c18309b.f129730g) && Objects.equals(this.f129731h, c18309b.f129731h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f129724a, this.f129725b, this.f129726c, Boolean.valueOf(this.f129727d), Boolean.valueOf(this.f129728e), Boolean.valueOf(this.f129729f), this.f129730g, this.f129731h, Boolean.valueOf(this.f129732i));
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m151390C(C18309b c18309b, List list) {
        c18309b.f129724a = AvatarUpdateProgress.UPLOAD_DONE;
        c18309b.f129731h = "上传图片-结束";
        c18309b.f129725b = (Media) list.get(0);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Boolean m151391D(C18309b c18309b) {
        AvatarUpdateProgress avatarUpdateProgress = c18309b.f129724a;
        return Boolean.valueOf(avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m151393F(C18309b c18309b, List list) {
        c18309b.f129724a = AvatarUpdateProgress.UPLOAD_DONE;
        c18309b.f129731h = "上传视频-结束";
        c18309b.f129725b = (Media) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C18309b m151397J(C18309b c18309b, xaj0 xaj0Var) {
        if (!((Boolean) xaj0Var.f191751a).booleanValue()) {
            return c18309b;
        }
        c18309b.f129726c = "上传失败";
        c18309b.f129724a = AvatarUpdateProgress.FAIL;
        c18309b.f129727d = true;
        throw new IllegalPictureException("检测到敏感信息，上传失败");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m151415e(C18309b c18309b) {
        AvatarUpdateProgress avatarUpdateProgress = c18309b.f129724a;
        return Boolean.valueOf(avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m151420j(Act act, DownloadTask downloadTask, Throwable th) {
        act.progressDismiss();
        lsi0.m151593w(R$string.f55776m);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ List m151427q(C18309b c18309b, Throwable th) {
        c18309b.f129726c = "上传失败";
        c18309b.f129724a = AvatarUpdateProgress.FAIL;
        c18309b.f129731h = "上传图片-失败";
        c18309b.f129727d = true;
        return vwb.m200299M(c18309b.f129725b);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C18309b m151429s(C18309b c18309b, Throwable th) {
        return c18309b;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m151435y(C18309b c18309b, Throwable th) {
        c18309b.f129726c = "上传失败";
        c18309b.f129724a = AvatarUpdateProgress.FAIL;
        c18309b.f129731h = "上传视频-失败";
        c18309b.f129727d = true;
        return vwb.m200299M(c18309b.f129725b);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m151437A0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.UPLOADING;
        c18309b.f129731h = "上传视频-开始";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ C18309b m151438B0(C22392a c22392a, C18309b c18309b, List list) {
        m151447K0(c22392a, c18309b);
        return c18309b;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ C22306c m151439C0(final C18309b c18309b, final C22392a c22392a, List list) {
        return (TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed) ? ya5.m213795K(vwb.m200324f0((Media) list.get(0)), "profile", "user-profile", UploadSource.get("profile")) : C22306c.just(list)).doOnNext(new e30() { // from class: l.crj0
            @Override // p149l.e30
            public final void call(Object obj) {
                lrj0.m151393F(c18309b, (List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.drj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lrj0.m151435y(c18309b, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.erj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92936a.m151438B0(c22392a, c18309b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C22306c m151440D0(C18309b c18309b, final C22392a c22392a, final C18309b c18309b2) {
        return new lsx(vwb.m200324f0(c18309b.f129725b), true).flatMap(new w9j() { // from class: l.lqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f129354a.m151439C0(c18309b2, c22392a, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m151441E0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.FINISH;
        c18309b.f129731h = "订阅结束-完成";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m151442F0(C18309b c18309b, C22392a c22392a, Throwable th) {
        c18309b.f129724a = AvatarUpdateProgress.FAIL;
        if (TextUtils.isEmpty(c18309b.f129726c)) {
            c18309b.f129726c = "上传失败";
        }
        c18309b.f129731h = "订阅结束-失败";
        m151447K0(c22392a, c18309b);
        m151444H0();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m151443G0(Act act, C18308a c18308a, C22392a<C18309b> c22392a, C18309b c18309b) {
        m151444H0();
        this.f129716b = c22392a.filter(new w9j() { // from class: l.vqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lrj0.m151391D((lrj0.C18309b) obj);
            }
        }).filter(new w9j() { // from class: l.frj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                lrj0.C18309b c18309b2 = (lrj0.C18309b) obj;
                return Boolean.valueOf((c18309b2 == null || (media = c18309b2.f129725b) == null || TEnum.equals(c18309b2.status, "raw")) ? false : true);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.grj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104069a.m151461i0((lrj0.C18309b) obj);
            }
        }));
        m151447K0(c22392a, c18309b);
        Media media = c18309b.f129725b;
        if (media instanceof Picture) {
            m151448L0(act, c18308a, c18309b, c22392a);
            return;
        }
        if (media instanceof Video) {
            long j = new r5l0(rhi.m179382z(media.url)).f157831b;
            if (j >= 16000) {
                lsi0.m151580j("你的视频长度太长了");
                c18309b.f129724a = AvatarUpdateProgress.CANCEL;
                c18309b.f129731h = "你的视频长度太长了";
                m151447K0(c22392a, c18309b);
                return;
            }
            if (j >= 3000) {
                m151449M0(c18309b, c22392a);
                return;
            }
            lsi0.m151580j("你的视频长度太短了");
            c18309b.f129724a = AvatarUpdateProgress.CANCEL;
            c18309b.f129731h = "你的视频长度太短了";
            m151447K0(c22392a, c18309b);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m151444H0() {
        mkd0.m154992z(this.f129715a);
        this.f129715a = null;
        mkd0.m154992z(this.f129716b);
        this.f129716b = null;
    }

    /* JADX INFO: renamed from: I0 */
    public void m151445I0(Act act, C18308a c18308a, C22392a<C18309b> c22392a) {
        C18309b c18309bM221515e = c22392a.m221515e();
        c18309bM221515e.f129724a = AvatarUpdateProgress.FINISH_PICK;
        c18309bM221515e.f129727d = false;
        c18309bM221515e.f129726c = "";
        c18309bM221515e.f129728e = true;
        c18309bM221515e.f129731h = "重试上传";
        m151443G0(act, c18308a, c22392a, c18309bM221515e);
    }

    /* JADX INFO: renamed from: J0 */
    public void m151446J0(final Act act, final C18308a c18308a, final C22392a<C18309b> c22392a) {
        MediaPickerParamsObject.MediaPickerParamsObjectBuilder croppingNewStyle;
        final C18309b c18309bM221515e = c22392a.m221515e();
        if (c18309bM221515e == null) {
            lsi0.m151580j("请使用正确的方式上传");
            return;
        }
        c18309bM221515e.f129724a = AvatarUpdateProgress.PICK;
        c18309bM221515e.f129727d = false;
        c18309bM221515e.f129731h = "拉起选择照片";
        m151447K0(c22392a, c18309bM221515e);
        if (c18308a.f129719c == c18308a.f129720d) {
            croppingNewStyle = MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1);
        } else {
            croppingNewStyle = c18308a.f129719c ? MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(ura.m195053e().m195057d().mo33721Mm(act)) : MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1);
        }
        act.startActivityForResult(MediaPickerAct.m78919X1(act, croppingNewStyle.build()), new C4317a.a() { // from class: l.kqj0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f124273a.m151462j0(c18309bM221515e, c22392a, act, c18308a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final synchronized void m151447K0(C22392a<C18309b> c22392a, C18309b c18309b) {
        try {
            AvatarUpdateProgress avatarUpdateProgress = c18309b.f129724a;
            if (avatarUpdateProgress == AvatarUpdateProgress.FINISH) {
                c18309b.f129729f = true;
            } else if (avatarUpdateProgress == AvatarUpdateProgress.FINISH_PICK || avatarUpdateProgress == AvatarUpdateProgress.FAIL) {
                c18309b.f129729f = false;
            }
            c22392a.m132487l(c18309b.m151493a());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m151448L0(final Act act, final C18308a c18308a, final C18309b c18309b, final C22392a<C18309b> c22392a) {
        List<AvatarUpdateCheckType> list = c18308a.f129718b;
        C22306c c22306cJust = C22306c.just(c18309b);
        if (!vwb.m200296J(list)) {
            for (final AvatarUpdateCheckType avatarUpdateCheckType : list) {
                if (avatarUpdateCheckType.isBeforeCheck()) {
                    c22306cJust = c22306cJust.filter(new w9j() { // from class: l.spj0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
                        }
                    }).doOnNext(new e30() { // from class: l.aqj0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f71169a.m151463k0(c22392a, (lrj0.C18309b) obj);
                        }
                    }).switchMap(new w9j() { // from class: l.bqj0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f76786a.m151464l0(c18308a, avatarUpdateCheckType, (lrj0.C18309b) obj);
                        }
                    }).doOnNext(new e30() { // from class: l.cqj0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f82087a.m151465m0(c22392a, (lrj0.C18309b) obj);
                        }
                    }).onErrorReturn(new w9j() { // from class: l.dqj0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f87427a.m151466n0(c18309b, c22392a, (Throwable) obj);
                        }
                    });
                }
            }
        }
        C22306c c22306cSwitchMap = c22306cJust.filter(new w9j() { // from class: l.eqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
            }
        }).doOnNext(new e30() { // from class: l.fqj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98820a.m151467o0(c22392a, (lrj0.C18309b) obj);
            }
        }).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.gqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103956a.m151469q0(c22392a, (lrj0.C18309b) obj);
            }
        });
        if (c18308a.f129721e) {
            c22306cSwitchMap = c22306cSwitchMap.flatMap(new w9j() { // from class: l.hqj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f109062a.m151473u0(c18308a, act, c22392a, (lrj0.C18309b) obj);
                }
            });
        }
        if (!vwb.m200296J(list)) {
            for (final AvatarUpdateCheckType avatarUpdateCheckType2 : list) {
                if (!avatarUpdateCheckType2.isBeforeCheck()) {
                    c22306cSwitchMap = c22306cSwitchMap.filter(new w9j() { // from class: l.iqj0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
                        }
                    }).doOnNext(new e30() { // from class: l.tpj0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f171484a.m151474v0(c22392a, (lrj0.C18309b) obj);
                        }
                    }).switchMap(new w9j() { // from class: l.upj0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f177634a.m151475w0(c18308a, avatarUpdateCheckType2, (lrj0.C18309b) obj);
                        }
                    }).doOnNext(new e30() { // from class: l.vpj0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f182506a.m151476x0(c22392a, (lrj0.C18309b) obj);
                        }
                    });
                }
            }
        }
        this.f129715a = c22306cSwitchMap.filter(new w9j() { // from class: l.wpj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.xpj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193924a.m151477y0(c22392a, (lrj0.C18309b) obj);
            }
        }, new e30() { // from class: l.ypj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199458a.m151478z0(c18309b, c22392a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m151449M0(final C18309b c18309b, final C22392a<C18309b> c22392a) {
        this.f129715a = C22306c.just(c18309b).filter(new w9j() { // from class: l.hrj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
            }
        }).doOnNext(new e30() { // from class: l.irj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114653a.m151437A0(c22392a, (lrj0.C18309b) obj);
            }
        }).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.jrj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119419a.m151440D0(c18309b, c22392a, (lrj0.C18309b) obj);
            }
        }).filter(new w9j() { // from class: l.krj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((lrj0.C18309b) obj).f129725b.status, "normal"));
            }
        }).filter(new w9j() { // from class: l.ppj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.qpj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155770a.m151441E0(c22392a, (lrj0.C18309b) obj);
            }
        }, new e30() { // from class: l.rpj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160509a.m151442F0(c18309b, c22392a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m151450X(Picture picture, boolean z, String str) {
        if (z) {
            picture.setLabel(MediaLabel.get(str));
        } else {
            picture.removeLabel(MediaLabel.get(str));
        }
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C22306c<C18309b> m151475w0(final C18308a c18308a, AvatarUpdateCheckType avatarUpdateCheckType, final C18309b c18309b) {
        C22306c<C18309b> c22306cJust = C22306c.just(c18309b);
        if (avatarUpdateCheckType == AvatarUpdateCheckType.LOCAL_CHECK) {
            return c22306cJust.filter(new w9j() { // from class: l.sqj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
                }
            }).switchMap(new w9j() { // from class: l.tqj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    lrj0.C18309b c18309b2 = (lrj0.C18309b) obj;
                    return qib0.f154703R.m94726b(Uri.parse(c18309b2.f129725b.url).getPath()).map(new w9j() { // from class: l.xqj0
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return lrj0.m151397J(c18309b2, (xaj0) obj2);
                        }
                    });
                }
            });
        }
        return avatarUpdateCheckType == AvatarUpdateCheckType.REMOTE_CHECK ? c22306cJust.filter(new w9j() { // from class: l.uqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C18309b) obj).f129727d);
            }
        }).switchMap(new w9j() { // from class: l.wqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f187695a.m151457e0(c18308a, c18309b, (lrj0.C18309b) obj);
            }
        }) : c22306cJust;
    }

    /* JADX INFO: renamed from: Z */
    public final void m151452Z(final Act act, final C18308a c18308a, final C22392a<C18309b> c22392a, final C18309b c18309b, File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        act.startActivityForResult(NewAlbumCropperAct.m78903m2(act, file.getAbsolutePath(), 0.8f, xdl0.m208412y0() - t100.m186890d(60.0f), c18308a.f129717a == AvatarUpdateType.AVATAR), new C4317a.a() { // from class: l.jqj0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f119292a.m151459g0(c22392a, c18309b, act, c18308a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m151453a0(final Act act, final C18308a c18308a, final C22392a<C18309b> c22392a) {
        final C18309b c18309bM221515e = c22392a.m221515e();
        c18309bM221515e.f129724a = AvatarUpdateProgress.CROP;
        c18309bM221515e.f129727d = false;
        c18309bM221515e.f129731h = "裁剪照片";
        m151447K0(c22392a, c18309bM221515e);
        String str = c18309bM221515e.f129725b.url;
        if (str.startsWith("file://")) {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path)) {
                File file = new File(path);
                if (file.exists()) {
                    m151452Z(act, c18308a, c22392a, c18309bM221515e, file);
                    return;
                }
            }
        }
        String str2 = ogw.m164284e(str) + ".jpg";
        File fileM21054G1 = CropperAct.m21054G1(act);
        if (!fileM21054G1.exists()) {
            fileM21054G1.mkdir();
        }
        File file2 = new File(fileM21054G1, str2);
        if (file2.exists()) {
            m151452Z(act, c18308a, c22392a, c18309bM221515e, file2);
        } else {
            act.progress((String) null);
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(c18309bM221515e.f129725b.url).m79640o(file2.getAbsolutePath()).m79635j(new f30() { // from class: l.opj0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f145008a.m151460h0(act, c18308a, c22392a, c18309bM221515e, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.zpj0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    lrj0.m151420j(act, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79626a());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m151454b0(Picture picture, CoreData coreData, C18309b c18309b) {
        PictureServeCheckResult pictureServeCheckResult = new PictureServeCheckResult();
        c18309b.f129730g = pictureServeCheckResult;
        PhotoLowModelData photoLowModelData = coreData.repeatPictureResult;
        pictureServeCheckResult.repeatPictureResult = photoLowModelData;
        pictureServeCheckResult.netPictureResult = coreData.netPictureResult;
        pictureServeCheckResult.lowPhotoResult = coreData.lowPhotoResult;
        pictureServeCheckResult.notVerificationResultData = coreData.notVerificationResultData;
        m151450X(picture, TextUtils.equals(photoLowModelData.audit, "repeat"), MediaLabel.WITH_REPEAT_MAIN_PICTURE);
        m151450X(picture, TextUtils.equals(coreData.netPictureResult.audit, "net"), MediaLabel.WITH_NET_MAIN_PICTURE);
        m151450X(picture, TextUtils.equals(coreData.lowPhotoResult.audit, "low"), MediaLabel.WITH_LOW);
        m151450X(picture, TextUtils.equals(coreData.notVerificationResultData.audit, "low"), MediaLabel.NOT_VERIFICATION);
        if (vwb.m200296J(coreData.verificationLowLabels)) {
            return;
        }
        c18309b.f129726c = coreData.verificationLowLabels.get(0);
    }

    /* JADX INFO: renamed from: c0 */
    public C22392a<C18309b> m151455c0() {
        return C22392a.m221512b();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ C18309b m151456d0(C18309b c18309b, Envelope envelope) {
        if (envelope != null && envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            Picture picture = (Picture) c18309b.f129725b;
            if (NullChecker.m81303a(coreData)) {
                m151454b0(picture, coreData, c18309b);
            }
        }
        return c18309b;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ C22306c m151457e0(C18308a c18308a, final C18309b c18309b, C18309b c18309b2) {
        return CoreModule.f17545c.f19639e0.m169393G9(c18309b2.f129725b.url, 1, TextUtils.isEmpty(c18308a.f129723g) ? "editProfile" : c18308a.f129723g).timeout(5L, TimeUnit.SECONDS, C22306c.just(null)).map(new w9j() { // from class: l.yqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f199566a.m151456d0(c18309b, (Envelope) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.zqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lrj0.m151429s(c18309b, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m151458f0(C18309b c18309b) {
        mkd0.m154992z(this.f129715a);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m151459g0(C22392a c22392a, C18309b c18309b, Act act, C18308a c18308a, int i, int i2, Intent intent) {
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("path");
            Picture pictureNew_ = Picture.new_();
            pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pictureNew_.url = rhi.m179355B(stringExtra);
            pictureNew_.size = new Dimension(new pgm(rhi.m179382z(pictureNew_.url)).f148730d);
            pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            m151444H0();
            this.f129716b = c22392a.filter(new w9j() { // from class: l.mqj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return lrj0.m151415e((lrj0.C18309b) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.nqj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140075a.m151458f0((lrj0.C18309b) obj);
                }
            }));
            c18309b.f129725b = pictureNew_;
            c18309b.f129724a = AvatarUpdateProgress.FINISH_CROP;
            c18309b.f129726c = "";
            c18309b.f129728e = true;
            c18309b.f129731h = "裁剪照片-成功";
            m151447K0(c22392a, c18309b);
            m151448L0(act, c18308a, c18309b, c22392a);
        } else {
            c18309b.f129724a = AvatarUpdateProgress.CANCEL;
            c18309b.f129731h = "裁剪照片-取消";
            m151447K0(c22392a, c18309b);
            m151444H0();
        }
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m151460h0(Act act, C18308a c18308a, C22392a c22392a, C18309b c18309b, DownloadTask downloadTask, File file) {
        act.progressDismiss();
        m151452Z(act, c18308a, c22392a, c18309b, file);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m151461i0(C18309b c18309b) {
        mkd0.m154992z(this.f129715a);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m151462j0(C18309b c18309b, C22392a c22392a, Act act, C18308a c18308a, int i, int i2, Intent intent) {
        if (i2 == -1) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
            if (vwb.m200296J(arrayList)) {
                c18309b.f129724a = AvatarUpdateProgress.CANCEL;
                c18309b.f129731h = "选择照片-异常";
                m151447K0(c22392a, c18309b);
                return true;
            }
            c18309b.f129725b = (Media) arrayList.get(0);
            c18309b.f129724a = AvatarUpdateProgress.FINISH_PICK;
            c18309b.f129726c = "";
            c18309b.f129728e = true;
            c18309b.f129731h = "选择媒体-成功";
            m151443G0(act, c18308a, c22392a, c18309b);
        } else if (i2 == 4097) {
            osi0.m165783g(App.f15369e.getString(R$string.f55758J));
            c18309b.f129724a = AvatarUpdateProgress.CANCEL;
            c18309b.f129731h = "你的视频长度太长了";
            m151447K0(c22392a, c18309b);
        } else if (i2 == 4098) {
            osi0.m165783g(App.f15369e.getString(R$string.f55759K));
            c18309b.f129724a = AvatarUpdateProgress.CANCEL;
            c18309b.f129731h = "你的视频长度太短了";
            m151447K0(c22392a, c18309b);
        } else {
            c18309b.f129724a = AvatarUpdateProgress.CANCEL;
            c18309b.f129731h = "选择媒体-取消";
            m151447K0(c22392a, c18309b);
            m151444H0();
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m151463k0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.BEFORE_CHECKING;
        c18309b.f129731h = "先检测流程-启动";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m151465m0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.BEFORE_DONE;
        c18309b.f129731h = "先检测流程-结束";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ C18309b m151466n0(C18309b c18309b, C22392a c22392a, Throwable th) {
        if (th instanceof IllegalPictureException) {
            lsi0.m151595y(th.getMessage());
        }
        c18309b.f129724a = AvatarUpdateProgress.FAIL;
        c18309b.f129727d = true;
        if (TextUtils.isEmpty(c18309b.f129726c)) {
            c18309b.f129726c = "上传失败";
        }
        c18309b.f129731h = "先检测流程-失败";
        m151447K0(c22392a, c18309b);
        return c18309b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m151467o0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.UPLOADING;
        c18309b.f129731h = "上传图片-开始";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18309b m151468p0(C22392a c22392a, C18309b c18309b, List list) {
        m151447K0(c22392a, c18309b);
        return c18309b;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22306c m151469q0(final C22392a c22392a, final C18309b c18309b) {
        return ya5.m213795K(vwb.m200324f0(c18309b.f129725b), "profile", "user-profile", UploadSource.get("profile")).doOnNext(new e30() { // from class: l.pqj0
            @Override // p149l.e30
            public final void call(Object obj) {
                lrj0.m151390C(c18309b, (List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.qqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lrj0.m151427q(c18309b, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.rqj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160660a.m151468p0(c22392a, c18309b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m151470r0(C18309b c18309b, C22392a c22392a, z3g0 z3g0Var) {
        c18309b.f129724a = AvatarUpdateProgress.ADD_TAG_FINISH;
        c18309b.f129731h = "添加标签-完成";
        m151447K0(c22392a, c18309b);
        z3g0Var.m132487l(c18309b);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m151471s0(C18309b c18309b, C22392a c22392a, z3g0 z3g0Var) {
        c18309b.f129724a = AvatarUpdateProgress.FINISH;
        c18309b.f129725b = null;
        c18309b.f129727d = true;
        c18309b.f129731h = "添加标签-取消";
        m151447K0(c22392a, c18309b);
        z3g0Var.m132487l(c18309b);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m151472t0(Act act, final C18309b c18309b, final C22392a c22392a, final z3g0 z3g0Var) {
        TagChooseMkAct.m43222v2(act, vwb.m200299M(c18309b.f129725b), null, new Runnable() { // from class: l.arj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71280a.m151470r0(c18309b, c22392a, z3g0Var);
            }
        }, new Runnable() { // from class: l.brj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76907a.m151471s0(c18309b, c22392a, z3g0Var);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C22306c m151473u0(C18308a c18308a, final Act act, final C22392a c22392a, final C18309b c18309b) {
        if (vwb.m200296J(c18308a.f129722f)) {
            return C22306c.create(new C22306c.a() { // from class: l.oqj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145164a.m151472t0(act, c18309b, c22392a, (z3g0) obj);
                }
            });
        }
        c18309b.f129724a = AvatarUpdateProgress.ADD_TAG_FINISH;
        c18309b.f129731h = "添加标签-完成";
        c18309b.f129725b.tags = new ArrayList(c18308a.f129722f);
        m151447K0(c22392a, c18309b);
        return C22306c.just(c18309b);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m151474v0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.AFTER_CHECKING;
        c18309b.f129731h = "后检测流程-启动";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m151476x0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.AFTER_DONE;
        c18309b.f129731h = "后检测流程-结束";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m151477y0(C22392a c22392a, C18309b c18309b) {
        c18309b.f129724a = AvatarUpdateProgress.FINISH;
        c18309b.f129731h = "订阅结束-完成";
        m151447K0(c22392a, c18309b);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m151478z0(C18309b c18309b, C22392a c22392a, Throwable th) {
        c18309b.f129724a = AvatarUpdateProgress.FAIL;
        if (TextUtils.isEmpty(c18309b.f129726c)) {
            c18309b.f129726c = "上传失败";
        }
        c18309b.f129731h = "订阅结束-失败";
        m151447K0(c22392a, c18309b);
        m151444H0();
    }
}
