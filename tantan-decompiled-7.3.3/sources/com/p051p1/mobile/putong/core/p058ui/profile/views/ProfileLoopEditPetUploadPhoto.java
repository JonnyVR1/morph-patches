package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.bkj0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.kbc0;
import p153l.koa0;
import p153l.l51;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w20;
import p153l.x20;
import p153l.xra;
import p153l.y20;
import p153l.yb5;
import p153l.z7c0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditPetUploadPhoto extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f35036c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f35037d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f35038e;

    /* JADX INFO: renamed from: f */
    public VImage f35039f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f35040g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f35041h;

    /* JADX INFO: renamed from: i */
    public VImage f35042i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f35043j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f35044k;

    /* JADX INFO: renamed from: l */
    public VImage f35045l;

    /* JADX INFO: renamed from: m */
    public User f35046m;

    public ProfileLoopEditPetUploadPhoto(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m54163Q(Act act) {
        if (w20.m204491f(act)) {
            act.progressDismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ C22421c m54164R(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m54166T(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m54167V(y20 y20Var, String str) {
        if (!NullChecker.m82486a(y20Var) || TextUtils.isEmpty(str)) {
            return;
        }
        y20Var.call(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ uxj0 m54168W(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ C22421c m54170Y(List list) {
        return (jyb.m147479J(list) || !(list.get(0) instanceof Picture)) ? C22421c.create(new C22421c.a() { // from class: l.aoa0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gcg0) obj).onError(null);
            }
        }) : C22421c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m54171Z(Act act, int i, String str, View view) {
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(3 - i).build()).withFromType(17).needAllSelectedMediaPreview().build()), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(z7c0.f203239h, 0);
        i4g0.m138523u("e_edit_pet_upload", str, jyb.m147494Y("asset_status", "1"));
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ C22421c m54172a0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Throwable th) {
        if (NullChecker.m82486a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            atomicInteger.getAndIncrement();
        } else {
            atomicInteger2.getAndIncrement();
        }
        return C22421c.empty();
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ C22421c m54173b0(Media media, uxj0 uxj0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(media);
        return yb5.m214983L(arrayList, "profile", "user-profile", null, UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m54174c0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m54177f0(View view) {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m54179h0(View view) {
        koa0.m150588a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m54180i0(String str, String str2) {
        Extensions extensions = this.f35046m.profile.extensions;
        if (extensions.wealth == null) {
            extensions.wealth = UserWealth.new_();
        }
        UserWealth userWealth = this.f35046m.profile.extensions.wealth;
        if (userWealth.petImg == null) {
            userWealth.petImg = new ArrayList();
        }
        this.f35046m.profile.extensions.wealth.petImg.add(str);
        m54192u0(str2);
    }

    /* JADX INFO: renamed from: j0 */
    public final C22421c<String> m54181j0(final Media media) {
        return m54182k0(media).flatMap(new qcj() { // from class: l.xna0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m54173b0(media, (uxj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.yna0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m54170Y((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final C22421c<uxj0> m54182k0(Media media) {
        return (uqb0.f180386R.m184740c() && (media instanceof Picture)) ? uqb0.f180386R.m184739b(Uri.parse(media.url).getPath()).map(new qcj() { // from class: l.zna0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m54168W((bkj0) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m54183l0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i) {
        if (atomicInteger2.get() != 0) {
            r1j0.m179420g("上传图片失败！");
        } else if (atomicInteger.get() == i) {
            r1j0.m179420g("检测到敏感信息，上传失败");
        } else if (atomicInteger.get() > 0) {
            r1j0.m179420g("检测到敏感信息，已自动移除");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m54184m0(User user, String str) {
        i4g0.m138520r("e_save_pet", str);
        UserWealth userWealth = this.f35046m.profile.extensions.wealth;
        if (userWealth == null) {
            user.profile.extensions.wealth = null;
            return;
        }
        UserWealth userWealth2 = user.profile.extensions.wealth;
        userWealth2.pet = userWealth.pet;
        userWealth2.petImg = userWealth.petImg;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m54185n0(Act act, Throwable th) {
        m54191t0(act);
        th.getMessage();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m54186o0(Act act, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List list) {
        m54191t0(act);
        m54183l0(atomicInteger, atomicInteger2, list.size());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54179h0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22421c m54187p0(Media media, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2) throws Exception {
        return m54181j0(media).onErrorResumeNext(new qcj() { // from class: l.wna0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m54172a0(atomicInteger, atomicInteger2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22421c m54188q0(final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final Media media) {
        return C22421c.fromCallable(new Callable() { // from class: l.joa0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f121981a.m54187p0(media, atomicInteger, atomicInteger2);
            }
        }).flatMap(new qcj() { // from class: l.una0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m54164R((C22421c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m54189r0(int i, String str, View view) {
        this.f35046m.profile.extensions.wealth.petImg.remove(i);
        m54192u0(str);
        i4g0.m138523u("e_edit_pet_upload", str, jyb.m147494Y("asset_status", "0"));
    }

    /* JADX INFO: renamed from: s0 */
    public void m54190s0(final Act act, final List<Media> list, final y20<String> y20Var) {
        if (!NullChecker.m82486a(act) || jyb.m147479J(list)) {
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicInteger atomicInteger2 = new AtomicInteger();
        act.progress(R$string.f28619R0);
        act.duringCreated(C22421c.from(list).concatMap(new qcj() { // from class: l.tna0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175236a.m54188q0(atomicInteger, atomicInteger2, (Media) obj);
            }
        })).compose(psd0.m173592C()).subscribe(psd0.m173598I(new y20() { // from class: l.boa0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileLoopEditPetUploadPhoto.m54167V(y20Var, (String) obj);
            }
        }, new y20() { // from class: l.coa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82837a.m54185n0(act, (Throwable) obj);
            }
        }, new x20() { // from class: l.doa0
            @Override // p153l.x20
            public final void call() {
                this.f89904a.m54186o0(act, atomicInteger, atomicInteger2, list);
            }
        }));
    }

    public void setUser(User user) {
        this.f35046m = user.mo225055clone();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m54191t0(final Act act) {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.vna0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileLoopEditPetUploadPhoto.m54163Q(act);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: u0 */
    public void m54192u0(final String str) {
        if (xra.m212804w()) {
            bnl0.m105524M(this, false);
        }
        final Act act = (Act) getContext();
        List arrayList = new ArrayList();
        if (!NullChecker.m82486a(this.f35046m) || !NullChecker.m82486a(this.f35046m.profile) || !NullChecker.m82486a(this.f35046m.profile.extensions) || !NullChecker.m82486a(this.f35046m.profile.extensions.wealth)) {
            bnl0.m105524M(this, false);
        } else if (jyb.m147479J(this.f35046m.profile.extensions.wealth.pet) || TextUtils.isEmpty(this.f35046m.profile.extensions.wealth.pet.get(0)) || !TextUtils.equals(this.f35046m.profile.extensions.wealth.pet.get(0), "已有宠物")) {
            bnl0.m105524M(this, false);
            return;
        } else {
            if (!jyb.m147479J(this.f35046m.profile.extensions.wealth.petImg)) {
                arrayList = this.f35046m.profile.extensions.wealth.petImg;
            }
            bnl0.m105524M(this, true);
        }
        View[] viewArr = {this.f35037d, this.f35040g, this.f35043j};
        VDraweeView[] vDraweeViewArr = {this.f35038e, this.f35041h, this.f35044k};
        View[] viewArr2 = {this.f35039f, this.f35042i, this.f35045l};
        int iM175859d = (qa00.m175858c().widthPixels - qa00.m175859d(96.0f)) / 3;
        for (int i = 0; i < 3; i++) {
            bnl0.m105505C0(viewArr[i], iM175859d);
            bnl0.m105507D0(iM175859d, viewArr[i]);
            bnl0.m105525M0(viewArr[i], false);
            bnl0.m105525M0(viewArr2[i], false);
            bnl0.m105525M0(vDraweeViewArr[i], false);
            bnl0.m105509E0(viewArr[i], new View.OnClickListener() { // from class: l.eoa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m54177f0(view);
                }
            });
            bnl0.m105509E0(vDraweeViewArr[i], new View.OnClickListener() { // from class: l.foa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m54166T(view);
                }
            });
            bnl0.m105509E0(viewArr2[i], new View.OnClickListener() { // from class: l.goa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m54174c0(view);
                }
            });
        }
        if (!jyb.m147479J(arrayList)) {
            for (final int i2 = 0; i2 < Math.min(arrayList.size(), 3); i2++) {
                bnl0.m105525M0(viewArr[i2], true);
                bnl0.m105525M0(viewArr2[i2], true);
                bnl0.m105525M0(vDraweeViewArr[i2], true);
                uqb0.f180374G.m127115L0(vDraweeViewArr[i2], (String) arrayList.get(i2));
                i4g0.m138492A("e_edit_pet_upload", str, jyb.m147494Y("asset_status", "0"));
                bnl0.m105509E0(viewArr2[i2], new View.OnClickListener() { // from class: l.hoa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f110879a.m54189r0(i2, str, view);
                    }
                });
            }
        }
        if (arrayList.size() < 3) {
            final int size = arrayList.size();
            bnl0.m105525M0(viewArr[size], true);
            bnl0.m105525M0(viewArr2[size], false);
            bnl0.m105525M0(vDraweeViewArr[size], false);
            viewArr[size].setBackgroundResource(kbc0.f124772B0);
            i4g0.m138492A("e_edit_pet_upload", str, jyb.m147494Y("asset_status", "1"));
            bnl0.m105509E0(viewArr[size], new View.OnClickListener() { // from class: l.ioa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m54171Z(act, size, str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m54193v0(String str, String str2) {
        Extensions extensions = this.f35046m.profile.extensions;
        if (extensions.wealth == null) {
            extensions.wealth = UserWealth.new_();
        }
        UserWealth userWealth = this.f35046m.profile.extensions.wealth;
        if (userWealth.pet == null) {
            userWealth.pet = new ArrayList();
        }
        this.f35046m.profile.extensions.wealth.pet.clear();
        this.f35046m.profile.extensions.wealth.pet.add(str);
        m54192u0(str2);
    }

    public ProfileLoopEditPetUploadPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditPetUploadPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
