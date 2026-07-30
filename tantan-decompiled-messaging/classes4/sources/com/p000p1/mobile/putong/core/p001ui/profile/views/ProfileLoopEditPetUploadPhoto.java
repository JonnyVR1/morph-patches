package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import l.c30;
import l.d30;
import l.e30;
import l.e3c0;
import l.e51;
import l.gga0;
import l.j760;
import l.lqa;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.tzb0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.ya5;
import l.z3g0;
import l.zvf0;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopEditPetUploadPhoto extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f2010c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f2011d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f2012e;

    /* JADX INFO: renamed from: f */
    public VImage f2013f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f2014g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f2015h;

    /* JADX INFO: renamed from: i */
    public VImage f2016i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f2017j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f2018k;

    /* JADX INFO: renamed from: l */
    public VImage f2019l;

    /* JADX INFO: renamed from: m */
    public User f2020m;

    public ProfileLoopEditPetUploadPhoto(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m3538Q(Act act) {
        if (c30.f(act)) {
            act.progressDismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ c m3539R(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m3541T(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m3542V(e30 e30Var, String str) {
        if (!NullChecker.a(e30Var) || TextUtils.isEmpty(str)) {
            return;
        }
        e30Var.call(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ roj0 m3543W(xaj0 xaj0Var) throws IllegalPictureException {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ c m3545Y(List list) {
        return (vwb.J(list) || !(list.get(0) instanceof Picture)) ? c.create(new c.a() { // from class: l.wfa0
            public final void call(Object obj) {
                ((z3g0) obj).onError((Throwable) null);
            }
        }) : c.just(((Media) ((Media) list.get(0)).cover()).url);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m3546Z(Act act, int i, String str, View view) {
        act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(3 - i).build()).withFromType(17).needAllSelectedMediaPreview().build()), 786);
        act.overridePendingTransition(tzb0.h, 0);
        zvf0.u("e_edit_pet_upload", str, new j760[]{vwb.Y("asset_status", "1")});
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ c m3547a0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Throwable th) {
        if (NullChecker.a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            atomicInteger.getAndIncrement();
        } else {
            atomicInteger2.getAndIncrement();
        }
        return c.empty();
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ c m3548b0(Media media, roj0 roj0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(media);
        return ya5.L(arrayList, "profile", "user-profile", (Map) null, UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m3549c0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m3552f0(View view) {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3554h0(View view) {
        gga0.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m3555i0(String str, String str2) {
        Extensions extensions = this.f2020m.profile.extensions;
        if (extensions.wealth == null) {
            extensions.wealth = UserWealth.new_();
        }
        UserWealth userWealth = this.f2020m.profile.extensions.wealth;
        if (userWealth.petImg == null) {
            userWealth.petImg = new ArrayList();
        }
        this.f2020m.profile.extensions.wealth.petImg.add(str);
        m3567u0(str2);
    }

    /* JADX INFO: renamed from: j0 */
    public final c<String> m3556j0(final Media media) {
        return m3557k0(media).flatMap(new w9j() { // from class: l.tfa0
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m3548b0(media, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.ufa0
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m3545Y((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final c<roj0> m3557k0(Media media) {
        return (qib0.R.c() && (media instanceof Picture)) ? qib0.R.b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.vfa0
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m3543W((xaj0) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3558l0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i) {
        if (atomicInteger2.get() != 0) {
            osi0.g("上传图片失败！");
        } else if (atomicInteger.get() == i) {
            osi0.g("检测到敏感信息，上传失败");
        } else if (atomicInteger.get() > 0) {
            osi0.g("检测到敏感信息，已自动移除");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m3559m0(User user, String str) {
        zvf0.r("e_save_pet", str);
        UserWealth userWealth = this.f2020m.profile.extensions.wealth;
        if (userWealth == null) {
            user.profile.extensions.wealth = null;
            return;
        }
        UserWealth userWealth2 = user.profile.extensions.wealth;
        userWealth2.pet = userWealth.pet;
        userWealth2.petImg = userWealth.petImg;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m3560n0(Act act, Throwable th) {
        m3566t0(act);
        th.getMessage();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m3561o0(Act act, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List list) {
        m3566t0(act);
        m3558l0(atomicInteger, atomicInteger2, list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3554h0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ c m3562p0(Media media, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2) throws Exception {
        return m3556j0(media).onErrorResumeNext(new w9j() { // from class: l.sfa0
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m3547a0(atomicInteger, atomicInteger2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ c m3563q0(final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final Media media) {
        return c.fromCallable(new Callable() { // from class: l.fga0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10327a.m3562p0(media, atomicInteger, atomicInteger2);
            }
        }).flatMap(new w9j() { // from class: l.qfa0
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m3539R((c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m3564r0(int i, String str, View view) {
        this.f2020m.profile.extensions.wealth.petImg.remove(i);
        m3567u0(str);
        zvf0.u("e_edit_pet_upload", str, new j760[]{vwb.Y("asset_status", "0")});
    }

    /* JADX INFO: renamed from: s0 */
    public void m3565s0(final Act act, final List<Media> list, final e30<String> e30Var) {
        if (!NullChecker.a(act) || vwb.J(list)) {
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicInteger atomicInteger2 = new AtomicInteger();
        act.progress(R.string.R0);
        act.duringCreated(c.from(list).concatMap(new w9j() { // from class: l.pfa0
            public final Object call(Object obj) {
                return this.f17234a.m3563q0(atomicInteger, atomicInteger2, (Media) obj);
            }
        })).compose(mkd0.C()).subscribe(mkd0.I(new e30() { // from class: l.xfa0
            public final void call(Object obj) {
                ProfileLoopEditPetUploadPhoto.m3542V(e30Var, (String) obj);
            }
        }, new e30() { // from class: l.yfa0
            public final void call(Object obj) {
                this.f22842a.m3560n0(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.zfa0
            public final void call() {
                this.f23367a.m3561o0(act, atomicInteger, atomicInteger2, list);
            }
        }));
    }

    public void setUser(User user) {
        this.f2020m = user.clone();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m3566t0(final Act act) {
        e51.H(CoreModule.b, new Runnable() { // from class: l.rfa0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileLoopEditPetUploadPhoto.m3538Q(act);
            }
        }, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public void m3567u0(final String str) {
        if (lqa.w()) {
            xdl0.M(this, false);
        }
        final Act context = getContext();
        List arrayList = new ArrayList();
        if (!NullChecker.a(this.f2020m) || !NullChecker.a(this.f2020m.profile) || !NullChecker.a(this.f2020m.profile.extensions) || !NullChecker.a(this.f2020m.profile.extensions.wealth)) {
            xdl0.M(this, false);
        } else if (vwb.J(this.f2020m.profile.extensions.wealth.pet) || TextUtils.isEmpty((CharSequence) this.f2020m.profile.extensions.wealth.pet.get(0)) || !TextUtils.equals((CharSequence) this.f2020m.profile.extensions.wealth.pet.get(0), "已有宠物")) {
            xdl0.M(this, false);
            return;
        } else {
            if (!vwb.J(this.f2020m.profile.extensions.wealth.petImg)) {
                arrayList = this.f2020m.profile.extensions.wealth.petImg;
            }
            xdl0.M(this, true);
        }
        View[] viewArr = {this.f2011d, this.f2014g, this.f2017j};
        View[] viewArr2 = {this.f2012e, this.f2015h, this.f2018k};
        View[] viewArr3 = {this.f2013f, this.f2016i, this.f2019l};
        int iD = (t100.c().widthPixels - t100.d(96.0f)) / 3;
        for (int i = 0; i < 3; i++) {
            xdl0.C0(viewArr[i], iD);
            xdl0.D0(iD, new View[]{viewArr[i]});
            xdl0.M0(viewArr[i], false);
            xdl0.M0(viewArr3[i], false);
            xdl0.M0(viewArr2[i], false);
            xdl0.E0(viewArr[i], new View.OnClickListener() { // from class: l.aga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m3552f0(view);
                }
            });
            xdl0.E0(viewArr2[i], new View.OnClickListener() { // from class: l.bga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m3541T(view);
                }
            });
            xdl0.E0(viewArr3[i], new View.OnClickListener() { // from class: l.cga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m3549c0(view);
                }
            });
        }
        if (!vwb.J(arrayList)) {
            for (final int i2 = 0; i2 < Math.min(arrayList.size(), 3); i2++) {
                xdl0.M0(viewArr[i2], true);
                xdl0.M0(viewArr3[i2], true);
                xdl0.M0(viewArr2[i2], true);
                qib0.G.L0(viewArr2[i2], (String) arrayList.get(i2));
                zvf0.A("e_edit_pet_upload", str, new j760[]{vwb.Y("asset_status", "0")});
                xdl0.E0(viewArr3[i2], new View.OnClickListener() { // from class: l.dga0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9209a.m3564r0(i2, str, view);
                    }
                });
            }
        }
        if (arrayList.size() < 3) {
            final int size = arrayList.size();
            xdl0.M0(viewArr[size], true);
            xdl0.M0(viewArr3[size], false);
            xdl0.M0(viewArr2[size], false);
            viewArr[size].setBackgroundResource(e3c0.B0);
            zvf0.A("e_edit_pet_upload", str, new j760[]{vwb.Y("asset_status", "1")});
            xdl0.E0(viewArr[size], new View.OnClickListener() { // from class: l.ega0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m3546Z(context, size, str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m3568v0(String str, String str2) {
        Extensions extensions = this.f2020m.profile.extensions;
        if (extensions.wealth == null) {
            extensions.wealth = UserWealth.new_();
        }
        UserWealth userWealth = this.f2020m.profile.extensions.wealth;
        if (userWealth.pet == null) {
            userWealth.pet = new ArrayList();
        }
        this.f2020m.profile.extensions.wealth.pet.clear();
        this.f2020m.profile.extensions.wealth.pet.add(str);
        m3567u0(str2);
    }

    public ProfileLoopEditPetUploadPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditPetUploadPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
