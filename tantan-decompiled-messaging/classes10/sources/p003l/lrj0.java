package p003l;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.PhotoLowModelData;
import com.p000p1.mobile.putong.core.data.PictureServeCheckResult;
import com.p000p1.mobile.putong.core.data.QuestionCategory;
import com.p000p1.mobile.putong.core.data.StickStatus;
import com.p000p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p000p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p000p1.mobile.putong.core.view.AvatarUpdateType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantan.core.base.R;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.f30;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.ogw;
import l.osi0;
import l.pgm;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.ya5;
import l.z3g0;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lrj0 {

    /* JADX INFO: renamed from: a */
    public c4g0 f6193a;

    /* JADX INFO: renamed from: b */
    public c4g0 f6194b;

    /* JADX INFO: renamed from: l.lrj0$a */
    public static class C3364a {

        /* JADX INFO: renamed from: a */
        public AvatarUpdateType f6195a = AvatarUpdateType.AVATAR;

        /* JADX INFO: renamed from: b */
        public final List<AvatarUpdateCheckType> f6196b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f6197c = false;

        /* JADX INFO: renamed from: d */
        public boolean f6198d = false;

        /* JADX INFO: renamed from: e */
        public boolean f6199e = false;

        /* JADX INFO: renamed from: f */
        public final List<String> f6200f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public String f6201g = "";

        /* JADX INFO: renamed from: h */
        public C3364a m7892h(AvatarUpdateCheckType avatarUpdateCheckType) {
            this.f6196b.add(avatarUpdateCheckType);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C3364a m7893i(boolean z) {
            this.f6199e = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C3364a m7894j(List<String> list) {
            this.f6200f.clear();
            if (!vwb.J(list)) {
                this.f6200f.addAll(new ArrayList(list));
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C3364a m7895k(boolean z) {
            this.f6197c = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C3364a m7896l(boolean z) {
            this.f6198d = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C3364a m7897m(String str) {
            this.f6201g = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C3364a m7898n(AvatarUpdateType avatarUpdateType) {
            this.f6195a = avatarUpdateType;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.lrj0$b */
    public static class C3365b {

        /* JADX INFO: renamed from: b */
        public Media f6203b;

        /* JADX INFO: renamed from: c */
        public String f6204c;

        /* JADX INFO: renamed from: g */
        public PictureServeCheckResult f6208g;

        /* JADX INFO: renamed from: h */
        public String f6209h;

        /* JADX INFO: renamed from: i */
        public boolean f6210i;

        /* JADX INFO: renamed from: a */
        public AvatarUpdateProgress f6202a = AvatarUpdateProgress.IDLE;

        /* JADX INFO: renamed from: d */
        public boolean f6205d = false;

        /* JADX INFO: renamed from: e */
        public boolean f6206e = false;

        /* JADX INFO: renamed from: f */
        public boolean f6207f = false;

        /* JADX INFO: renamed from: a */
        public C3365b m7899a() {
            C3365b c3365b = new C3365b();
            c3365b.f6205d = this.f6205d;
            c3365b.f6206e = this.f6206e;
            c3365b.f6207f = this.f6207f;
            c3365b.f6202a = this.f6202a;
            c3365b.f6210i = this.f6210i;
            Media media = this.f6203b;
            if (media != null) {
                c3365b.f6203b = media.clone();
            }
            c3365b.f6204c = this.f6204c;
            PictureServeCheckResult pictureServeCheckResult = this.f6208g;
            if (pictureServeCheckResult != null) {
                c3365b.f6208g = pictureServeCheckResult.m14788clone();
            }
            c3365b.f6209h = this.f6209h;
            return c3365b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C3365b c3365b = (C3365b) obj;
                if (this.f6205d == c3365b.f6205d && this.f6206e == c3365b.f6206e && this.f6207f == c3365b.f6207f && this.f6202a == c3365b.f6202a && this.f6210i == c3365b.f6210i && Objects.equals(this.f6203b, c3365b.f6203b) && Objects.equals(this.f6204c, c3365b.f6204c) && Objects.equals(this.f6208g, c3365b.f6208g) && Objects.equals(this.f6209h, c3365b.f6209h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f6202a, this.f6203b, this.f6204c, Boolean.valueOf(this.f6205d), Boolean.valueOf(this.f6206e), Boolean.valueOf(this.f6207f), this.f6208g, this.f6209h, Boolean.valueOf(this.f6210i));
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m7796C(C3365b c3365b, List list) {
        c3365b.f6202a = AvatarUpdateProgress.UPLOAD_DONE;
        c3365b.f6209h = "上传图片-结束";
        c3365b.f6203b = (Media) list.get(0);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Boolean m7797D(C3365b c3365b) {
        AvatarUpdateProgress avatarUpdateProgress = c3365b.f6202a;
        return Boolean.valueOf(avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7799F(C3365b c3365b, List list) {
        c3365b.f6202a = AvatarUpdateProgress.UPLOAD_DONE;
        c3365b.f6209h = "上传视频-结束";
        c3365b.f6203b = (Media) list.get(0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C3365b m7803J(C3365b c3365b, xaj0 xaj0Var) throws IllegalPictureException {
        if (!((Boolean) xaj0Var.a).booleanValue()) {
            return c3365b;
        }
        c3365b.f6204c = "上传失败";
        c3365b.f6202a = AvatarUpdateProgress.FAIL;
        c3365b.f6205d = true;
        throw new IllegalPictureException("检测到敏感信息，上传失败");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m7821e(C3365b c3365b) {
        AvatarUpdateProgress avatarUpdateProgress = c3365b.f6202a;
        return Boolean.valueOf(avatarUpdateProgress == AvatarUpdateProgress.FINISH || avatarUpdateProgress == AvatarUpdateProgress.FAIL);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m7826j(Act act, DownloadTask downloadTask, Throwable th) {
        act.progressDismiss();
        lsi0.w(R.string.m);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ List m7833q(C3365b c3365b, Throwable th) {
        c3365b.f6204c = "上传失败";
        c3365b.f6202a = AvatarUpdateProgress.FAIL;
        c3365b.f6209h = "上传图片-失败";
        c3365b.f6205d = true;
        return vwb.M(c3365b.f6203b);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C3365b m7835s(C3365b c3365b, Throwable th) {
        return c3365b;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m7841y(C3365b c3365b, Throwable th) {
        c3365b.f6204c = "上传失败";
        c3365b.f6202a = AvatarUpdateProgress.FAIL;
        c3365b.f6209h = "上传视频-失败";
        c3365b.f6205d = true;
        return vwb.M(c3365b.f6203b);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m7843A0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.UPLOADING;
        c3365b.f6209h = "上传视频-开始";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ C3365b m7844B0(a aVar, C3365b c3365b, List list) {
        m7853K0(aVar, c3365b);
        return c3365b;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ c m7845C0(final C3365b c3365b, final a aVar, List list) {
        return (TEnum.equals(((Media) list.get(0)).status, "preprocessed") ? ya5.K(vwb.f0(new Media[]{(Media) list.get(0)}), QuestionCategory.profile, "user-profile", UploadSource.get(QuestionCategory.profile)) : c.just(list)).doOnNext(new e30() { // from class: l.crj0
            public final void call(Object obj) {
                lrj0.m7799F(c3365b, (List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.drj0
            public final Object call(Object obj) {
                return lrj0.m7841y(c3365b, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.erj0
            public final Object call(Object obj) {
                return this.f4331a.m7844B0(aVar, c3365b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ c m7846D0(C3365b c3365b, final a aVar, final C3365b c3365b2) {
        return new lsx(vwb.f0(new Media[]{c3365b.f6203b}), true).flatMap(new w9j() { // from class: l.lqj0
            public final Object call(Object obj) {
                return this.f6183a.m7845C0(c3365b2, aVar, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m7847E0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.FINISH;
        c3365b.f6209h = "订阅结束-完成";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m7848F0(C3365b c3365b, a aVar, Throwable th) {
        c3365b.f6202a = AvatarUpdateProgress.FAIL;
        if (TextUtils.isEmpty(c3365b.f6204c)) {
            c3365b.f6204c = "上传失败";
        }
        c3365b.f6209h = "订阅结束-失败";
        m7853K0(aVar, c3365b);
        m7850H0();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m7849G0(Act act, C3364a c3364a, a<C3365b> aVar, C3365b c3365b) {
        m7850H0();
        this.f6194b = aVar.filter(new w9j() { // from class: l.vqj0
            public final Object call(Object obj) {
                return lrj0.m7797D((lrj0.C3365b) obj);
            }
        }).filter(new w9j() { // from class: l.frj0
            public final Object call(Object obj) {
                lrj0.C3365b c3365b2 = (lrj0.C3365b) obj;
                return Boolean.valueOf((c3365b2 == null || (media = c3365b2.f6203b) == null || TEnum.equals(c3365b2.status, "raw")) ? false : true);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.grj0
            public final void call(Object obj) {
                this.f4717a.m7867i0((lrj0.C3365b) obj);
            }
        }));
        m7853K0(aVar, c3365b);
        Media media = c3365b.f6203b;
        if (media instanceof Picture) {
            m7854L0(act, c3364a, c3365b, aVar);
            return;
        }
        if (media instanceof Video) {
            long j = new r5l0(rhi.z(media.url)).b;
            if (j >= 16000) {
                lsi0.j("你的视频长度太长了");
                c3365b.f6202a = AvatarUpdateProgress.CANCEL;
                c3365b.f6209h = "你的视频长度太长了";
                m7853K0(aVar, c3365b);
                return;
            }
            if (j >= 3000) {
                m7855M0(c3365b, aVar);
                return;
            }
            lsi0.j("你的视频长度太短了");
            c3365b.f6202a = AvatarUpdateProgress.CANCEL;
            c3365b.f6209h = "你的视频长度太短了";
            m7853K0(aVar, c3365b);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m7850H0() {
        mkd0.z(this.f6193a);
        this.f6193a = null;
        mkd0.z(this.f6194b);
        this.f6194b = null;
    }

    /* JADX INFO: renamed from: I0 */
    public void m7851I0(Act act, C3364a c3364a, a<C3365b> aVar) {
        C3365b c3365b = (C3365b) aVar.e();
        c3365b.f6202a = AvatarUpdateProgress.FINISH_PICK;
        c3365b.f6205d = false;
        c3365b.f6204c = "";
        c3365b.f6206e = true;
        c3365b.f6209h = "重试上传";
        m7849G0(act, c3364a, aVar, c3365b);
    }

    /* JADX INFO: renamed from: J0 */
    public void m7852J0(final Act act, final C3364a c3364a, final a<C3365b> aVar) {
        MediaPickerParamsObject.MediaPickerParamsObjectBuilder croppingNewStyle;
        final C3365b c3365b = (C3365b) aVar.e();
        if (c3365b == null) {
            lsi0.j("请使用正确的方式上传");
            return;
        }
        c3365b.f6202a = AvatarUpdateProgress.PICK;
        c3365b.f6205d = false;
        c3365b.f6209h = "拉起选择照片";
        m7853K0(aVar, c3365b);
        if (c3364a.f6197c == c3364a.f6198d) {
            croppingNewStyle = MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1);
        } else {
            croppingNewStyle = c3364a.f6197c ? MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(ura.e().d().Mm(act)) : MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1);
        }
        act.startActivityForResult(MediaPickerAct.X1(act, croppingNewStyle.build()), new com.p1.mobile.android.app.a.a() { // from class: l.kqj0
            /* JADX INFO: renamed from: a */
            public final boolean m7633a(int i, int i2, Intent intent) {
                return this.f5692a.m7868j0(c3365b, aVar, act, c3364a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final synchronized void m7853K0(a<C3365b> aVar, C3365b c3365b) {
        try {
            AvatarUpdateProgress avatarUpdateProgress = c3365b.f6202a;
            if (avatarUpdateProgress == AvatarUpdateProgress.FINISH) {
                c3365b.f6207f = true;
            } else if (avatarUpdateProgress == AvatarUpdateProgress.FINISH_PICK || avatarUpdateProgress == AvatarUpdateProgress.FAIL) {
                c3365b.f6207f = false;
            }
            aVar.onNext(c3365b.m7899a());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m7854L0(final Act act, final C3364a c3364a, final C3365b c3365b, final a<C3365b> aVar) {
        List<AvatarUpdateCheckType> list = c3364a.f6196b;
        c cVarJust = c.just(c3365b);
        if (!vwb.J(list)) {
            for (final AvatarUpdateCheckType avatarUpdateCheckType : list) {
                if (avatarUpdateCheckType.isBeforeCheck()) {
                    cVarJust = cVarJust.filter(new w9j() { // from class: l.spj0
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
                        }
                    }).doOnNext(new e30() { // from class: l.aqj0
                        public final void call(Object obj) {
                            this.f2841a.m7869k0(aVar, (lrj0.C3365b) obj);
                        }
                    }).switchMap(new w9j() { // from class: l.bqj0
                        public final Object call(Object obj) {
                            return this.f3424a.m7870l0(c3364a, avatarUpdateCheckType, (lrj0.C3365b) obj);
                        }
                    }).doOnNext(new e30() { // from class: l.cqj0
                        public final void call(Object obj) {
                            this.f4067a.m7871m0(aVar, (lrj0.C3365b) obj);
                        }
                    }).onErrorReturn(new w9j() { // from class: l.dqj0
                        public final Object call(Object obj) {
                            return this.f4213a.m7872n0(c3365b, aVar, (Throwable) obj);
                        }
                    });
                }
            }
        }
        c cVarSwitchMap = cVarJust.filter(new w9j() { // from class: l.eqj0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
            }
        }).doOnNext(new e30() { // from class: l.fqj0
            public final void call(Object obj) {
                this.f4486a.m7873o0(aVar, (lrj0.C3365b) obj);
            }
        }).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.gqj0
            public final Object call(Object obj) {
                return this.f4710a.m7875q0(aVar, (lrj0.C3365b) obj);
            }
        });
        if (c3364a.f6199e) {
            cVarSwitchMap = cVarSwitchMap.flatMap(new w9j() { // from class: l.hqj0
                public final Object call(Object obj) {
                    return this.f4948a.m7879u0(c3364a, act, aVar, (lrj0.C3365b) obj);
                }
            });
        }
        if (!vwb.J(list)) {
            for (final AvatarUpdateCheckType avatarUpdateCheckType2 : list) {
                if (!avatarUpdateCheckType2.isBeforeCheck()) {
                    cVarSwitchMap = cVarSwitchMap.filter(new w9j() { // from class: l.iqj0
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
                        }
                    }).doOnNext(new e30() { // from class: l.tpj0
                        public final void call(Object obj) {
                            this.f7600a.m7880v0(aVar, (lrj0.C3365b) obj);
                        }
                    }).switchMap(new w9j() { // from class: l.upj0
                        public final Object call(Object obj) {
                            return this.f7785a.m7881w0(c3364a, avatarUpdateCheckType2, (lrj0.C3365b) obj);
                        }
                    }).doOnNext(new e30() { // from class: l.vpj0
                        public final void call(Object obj) {
                            this.f8020a.m7882x0(aVar, (lrj0.C3365b) obj);
                        }
                    });
                }
            }
        }
        this.f6193a = cVarSwitchMap.filter(new w9j() { // from class: l.wpj0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.xpj0
            public final void call(Object obj) {
                this.f8557a.m7883y0(aVar, (lrj0.C3365b) obj);
            }
        }, new e30() { // from class: l.ypj0
            public final void call(Object obj) {
                this.f9095a.m7884z0(c3365b, aVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m7855M0(final C3365b c3365b, final a<C3365b> aVar) {
        this.f6193a = c.just(c3365b).filter(new w9j() { // from class: l.hrj0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
            }
        }).doOnNext(new e30() { // from class: l.irj0
            public final void call(Object obj) {
                this.f5205a.m7843A0(aVar, (lrj0.C3365b) obj);
            }
        }).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.jrj0
            public final Object call(Object obj) {
                return this.f5373a.m7846D0(c3365b, aVar, (lrj0.C3365b) obj);
            }
        }).filter(new w9j() { // from class: l.krj0
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((lrj0.C3365b) obj).f6203b.status, StickStatus.normal));
            }
        }).filter(new w9j() { // from class: l.ppj0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.qpj0
            public final void call(Object obj) {
                this.f7076a.m7847E0(aVar, (lrj0.C3365b) obj);
            }
        }, new e30() { // from class: l.rpj0
            public final void call(Object obj) {
                this.f7205a.m7848F0(c3365b, aVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m7856X(Picture picture, boolean z, String str) {
        if (z) {
            picture.setLabel(MediaLabel.get(str));
        } else {
            picture.removeLabel(MediaLabel.get(str));
        }
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final c<C3365b> m7881w0(final C3364a c3364a, AvatarUpdateCheckType avatarUpdateCheckType, final C3365b c3365b) {
        c<C3365b> cVarJust = c.just(c3365b);
        if (avatarUpdateCheckType == AvatarUpdateCheckType.LOCAL_CHECK) {
            return cVarJust.filter(new w9j() { // from class: l.sqj0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
                }
            }).switchMap(new w9j() { // from class: l.tqj0
                public final Object call(Object obj) {
                    lrj0.C3365b c3365b2 = (lrj0.C3365b) obj;
                    return qib0.R.b(Uri.parse(c3365b2.f6203b.url).getPath()).map(new w9j() { // from class: l.xqj0
                        public final Object call(Object obj2) {
                            return lrj0.m7803J(c3365b2, (xaj0) obj2);
                        }
                    });
                }
            });
        }
        return avatarUpdateCheckType == AvatarUpdateCheckType.REMOTE_CHECK ? cVarJust.filter(new w9j() { // from class: l.uqj0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((lrj0.C3365b) obj).f6205d);
            }
        }).switchMap(new w9j() { // from class: l.wqj0
            public final Object call(Object obj) {
                return this.f8224a.m7863e0(c3364a, c3365b, (lrj0.C3365b) obj);
            }
        }) : cVarJust;
    }

    /* JADX INFO: renamed from: Z */
    public final void m7858Z(final Act act, final C3364a c3364a, final a<C3365b> aVar, final C3365b c3365b, File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        act.startActivityForResult(NewAlbumCropperAct.m2(act, file.getAbsolutePath(), 0.8f, xdl0.y0() - t100.d(60.0f), c3364a.f6195a == AvatarUpdateType.AVATAR), new com.p1.mobile.android.app.a.a() { // from class: l.jqj0
            /* JADX INFO: renamed from: a */
            public final boolean m7453a(int i, int i2, Intent intent) {
                return this.f5366a.m7865g0(aVar, c3365b, act, c3364a, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m7859a0(final Act act, final C3364a c3364a, final a<C3365b> aVar) {
        final C3365b c3365b = (C3365b) aVar.e();
        c3365b.f6202a = AvatarUpdateProgress.CROP;
        c3365b.f6205d = false;
        c3365b.f6209h = "裁剪照片";
        m7853K0(aVar, c3365b);
        String str = c3365b.f6203b.url;
        if (str.startsWith("file://")) {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path)) {
                File file = new File(path);
                if (file.exists()) {
                    m7858Z(act, c3364a, aVar, c3365b, file);
                    return;
                }
            }
        }
        String str2 = ogw.e(str) + ".jpg";
        File fileG1 = CropperAct.G1(act);
        if (!fileG1.exists()) {
            fileG1.mkdir();
        }
        File file2 = new File(fileG1, str2);
        if (file2.exists()) {
            m7858Z(act, c3364a, aVar, c3365b, file2);
        } else {
            act.progress((String) null);
            com.p1.mobile.putong.ui.download.a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(c3365b.f6203b.url).o(file2.getAbsolutePath()).j(new f30() { // from class: l.opj0
                public final void call(Object obj, Object obj2) {
                    this.f6728a.m7866h0(act, c3364a, aVar, c3365b, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.zpj0
                public final void call(Object obj, Object obj2) {
                    lrj0.m7826j(act, (DownloadTask) obj, (Throwable) obj2);
                }
            }).a());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m7860b0(Picture picture, CoreData coreData, C3365b c3365b) {
        PictureServeCheckResult pictureServeCheckResult = new PictureServeCheckResult();
        c3365b.f6208g = pictureServeCheckResult;
        PhotoLowModelData photoLowModelData = coreData.repeatPictureResult;
        pictureServeCheckResult.repeatPictureResult = photoLowModelData;
        pictureServeCheckResult.netPictureResult = coreData.netPictureResult;
        pictureServeCheckResult.lowPhotoResult = coreData.lowPhotoResult;
        pictureServeCheckResult.notVerificationResultData = coreData.notVerificationResultData;
        m7856X(picture, TextUtils.equals(photoLowModelData.audit, "repeat"), "WITH_REPEAT_MAIN_PICTURE");
        m7856X(picture, TextUtils.equals(coreData.netPictureResult.audit, "net"), "WITH_NET_MAIN_PICTURE");
        m7856X(picture, TextUtils.equals(coreData.lowPhotoResult.audit, "low"), "WITH_LOW");
        m7856X(picture, TextUtils.equals(coreData.notVerificationResultData.audit, "low"), "NOT_VERIFICATION");
        if (vwb.J(coreData.verificationLowLabels)) {
            return;
        }
        c3365b.f6204c = coreData.verificationLowLabels.get(0);
    }

    /* JADX INFO: renamed from: c0 */
    public a<C3365b> m7861c0() {
        return a.b();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ C3365b m7862d0(C3365b c3365b, Envelope envelope) {
        if (envelope != null && envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            Picture picture = (Picture) c3365b.f6203b;
            if (NullChecker.a(coreData)) {
                m7860b0(picture, coreData, c3365b);
            }
        }
        return c3365b;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ c m7863e0(C3364a c3364a, final C3365b c3365b, C3365b c3365b2) {
        return CoreModule.c.e0.G9(c3365b2.f6203b.url, 1, TextUtils.isEmpty(c3364a.f6201g) ? "editProfile" : c3364a.f6201g).timeout(5L, TimeUnit.SECONDS, c.just((Object) null)).map(new w9j() { // from class: l.yqj0
            public final Object call(Object obj) {
                return this.f9107a.m7862d0(c3365b, (Envelope) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.zqj0
            public final Object call(Object obj) {
                return lrj0.m7835s(c3365b, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m7864f0(C3365b c3365b) {
        mkd0.z(this.f6193a);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m7865g0(a aVar, C3365b c3365b, Act act, C3364a c3364a, int i, int i2, Intent intent) {
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("path");
            Picture pictureNew_ = Picture.new_();
            ((Media) pictureNew_).status = MediaLocalStatus.get("preprocessed");
            ((Media) pictureNew_).url = rhi.B(stringExtra);
            pictureNew_.size = new Dimension(new pgm(rhi.z(((Media) pictureNew_).url)).d);
            ((Media) pictureNew_).mediaType = "image/jpeg";
            m7850H0();
            this.f6194b = aVar.filter(new w9j() { // from class: l.mqj0
                public final Object call(Object obj) {
                    return lrj0.m7821e((lrj0.C3365b) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.nqj0
                public final void call(Object obj) {
                    this.f6551a.m7864f0((lrj0.C3365b) obj);
                }
            }));
            c3365b.f6203b = pictureNew_;
            c3365b.f6202a = AvatarUpdateProgress.FINISH_CROP;
            c3365b.f6204c = "";
            c3365b.f6206e = true;
            c3365b.f6209h = "裁剪照片-成功";
            m7853K0(aVar, c3365b);
            m7854L0(act, c3364a, c3365b, aVar);
        } else {
            c3365b.f6202a = AvatarUpdateProgress.CANCEL;
            c3365b.f6209h = "裁剪照片-取消";
            m7853K0(aVar, c3365b);
            m7850H0();
        }
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m7866h0(Act act, C3364a c3364a, a aVar, C3365b c3365b, DownloadTask downloadTask, File file) {
        act.progressDismiss();
        m7858Z(act, c3364a, aVar, c3365b, file);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m7867i0(C3365b c3365b) {
        mkd0.z(this.f6193a);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m7868j0(C3365b c3365b, a aVar, Act act, C3364a c3364a, int i, int i2, Intent intent) {
        if (i2 == -1) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
            if (vwb.J(arrayList)) {
                c3365b.f6202a = AvatarUpdateProgress.CANCEL;
                c3365b.f6209h = "选择照片-异常";
                m7853K0(aVar, c3365b);
                return true;
            }
            c3365b.f6203b = (Media) arrayList.get(0);
            c3365b.f6202a = AvatarUpdateProgress.FINISH_PICK;
            c3365b.f6204c = "";
            c3365b.f6206e = true;
            c3365b.f6209h = "选择媒体-成功";
            m7849G0(act, c3364a, aVar, c3365b);
        } else if (i2 == 4097) {
            osi0.g(App.e.getString(R.string.J));
            c3365b.f6202a = AvatarUpdateProgress.CANCEL;
            c3365b.f6209h = "你的视频长度太长了";
            m7853K0(aVar, c3365b);
        } else if (i2 == 4098) {
            osi0.g(App.e.getString(R.string.K));
            c3365b.f6202a = AvatarUpdateProgress.CANCEL;
            c3365b.f6209h = "你的视频长度太短了";
            m7853K0(aVar, c3365b);
        } else {
            c3365b.f6202a = AvatarUpdateProgress.CANCEL;
            c3365b.f6209h = "选择媒体-取消";
            m7853K0(aVar, c3365b);
            m7850H0();
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m7869k0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.BEFORE_CHECKING;
        c3365b.f6209h = "先检测流程-启动";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m7871m0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.BEFORE_DONE;
        c3365b.f6209h = "先检测流程-结束";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ C3365b m7872n0(C3365b c3365b, a aVar, Throwable th) {
        if (th instanceof IllegalPictureException) {
            lsi0.y(th.getMessage());
        }
        c3365b.f6202a = AvatarUpdateProgress.FAIL;
        c3365b.f6205d = true;
        if (TextUtils.isEmpty(c3365b.f6204c)) {
            c3365b.f6204c = "上传失败";
        }
        c3365b.f6209h = "先检测流程-失败";
        m7853K0(aVar, c3365b);
        return c3365b;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m7873o0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.UPLOADING;
        c3365b.f6209h = "上传图片-开始";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3365b m7874p0(a aVar, C3365b c3365b, List list) {
        m7853K0(aVar, c3365b);
        return c3365b;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ c m7875q0(final a aVar, final C3365b c3365b) {
        return ya5.K(vwb.f0(new Media[]{c3365b.f6203b}), QuestionCategory.profile, "user-profile", UploadSource.get(QuestionCategory.profile)).doOnNext(new e30() { // from class: l.pqj0
            public final void call(Object obj) {
                lrj0.m7796C(c3365b, (List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.qqj0
            public final Object call(Object obj) {
                return lrj0.m7833q(c3365b, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.rqj0
            public final Object call(Object obj) {
                return this.f7222a.m7874p0(aVar, c3365b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m7876r0(C3365b c3365b, a aVar, z3g0 z3g0Var) {
        c3365b.f6202a = AvatarUpdateProgress.ADD_TAG_FINISH;
        c3365b.f6209h = "添加标签-完成";
        m7853K0(aVar, c3365b);
        z3g0Var.onNext(c3365b);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m7877s0(C3365b c3365b, a aVar, z3g0 z3g0Var) {
        c3365b.f6202a = AvatarUpdateProgress.FINISH;
        c3365b.f6203b = null;
        c3365b.f6205d = true;
        c3365b.f6209h = "添加标签-取消";
        m7853K0(aVar, c3365b);
        z3g0Var.onNext(c3365b);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m7878t0(Act act, final C3365b c3365b, final a aVar, final z3g0 z3g0Var) {
        TagChooseMkAct.v2(act, vwb.M(c3365b.f6203b), (String) null, new Runnable() { // from class: l.arj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2859a.m7876r0(c3365b, aVar, z3g0Var);
            }
        }, new Runnable() { // from class: l.brj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3436a.m7877s0(c3365b, aVar, z3g0Var);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ c m7879u0(C3364a c3364a, final Act act, final a aVar, final C3365b c3365b) {
        if (vwb.J(c3364a.f6200f)) {
            return c.create(new c.a() { // from class: l.oqj0
                public final void call(Object obj) {
                    this.f6737a.m7878t0(act, c3365b, aVar, (z3g0) obj);
                }
            });
        }
        c3365b.f6202a = AvatarUpdateProgress.ADD_TAG_FINISH;
        c3365b.f6209h = "添加标签-完成";
        c3365b.f6203b.tags = new ArrayList(c3364a.f6200f);
        m7853K0(aVar, c3365b);
        return c.just(c3365b);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m7880v0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.AFTER_CHECKING;
        c3365b.f6209h = "后检测流程-启动";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m7882x0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.AFTER_DONE;
        c3365b.f6209h = "后检测流程-结束";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m7883y0(a aVar, C3365b c3365b) {
        c3365b.f6202a = AvatarUpdateProgress.FINISH;
        c3365b.f6209h = "订阅结束-完成";
        m7853K0(aVar, c3365b);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m7884z0(C3365b c3365b, a aVar, Throwable th) {
        c3365b.f6202a = AvatarUpdateProgress.FAIL;
        if (TextUtils.isEmpty(c3365b.f6204c)) {
            c3365b.f6204c = "上传失败";
        }
        c3365b.f6209h = "订阅结束-失败";
        m7853K0(aVar, c3365b);
        m7850H0();
    }
}
