package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.c30;
import p149l.d30;
import p149l.e30;
import p149l.e3c0;
import p149l.e51;
import p149l.gga0;
import p149l.lqa;
import p149l.mkd0;
import p149l.osi0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.tzb0;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ya5;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditPetUploadPhoto extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f34188c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f34189d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f34190e;

    /* JADX INFO: renamed from: f */
    public VImage f34191f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f34192g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f34193h;

    /* JADX INFO: renamed from: i */
    public VImage f34194i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f34195j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f34196k;

    /* JADX INFO: renamed from: l */
    public VImage f34197l;

    /* JADX INFO: renamed from: m */
    public User f34198m;

    public ProfileLoopEditPetUploadPhoto(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m52980Q(Act act) {
        if (c30.m104964f(act)) {
            act.progressDismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ C22306c m52981R(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m52983T(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m52984V(e30 e30Var, String str) {
        if (!NullChecker.m81303a(e30Var) || TextUtils.isEmpty(str)) {
            return;
        }
        e30Var.call(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ roj0 m52985W(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ C22306c m52987Y(List list) {
        return (vwb.m200296J(list) || !(list.get(0) instanceof Picture)) ? C22306c.create(new C22306c.a() { // from class: l.wfa0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z3g0) obj).onError(null);
            }
        }) : C22306c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m52988Z(Act act, int i, String str, View view) {
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(3 - i).build()).withFromType(17).needAllSelectedMediaPreview().build()), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(tzb0.f172721h, 0);
        zvf0.m220399u("e_edit_pet_upload", str, vwb.m200311Y("asset_status", "1"));
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ C22306c m52989a0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Throwable th) {
        if (NullChecker.m81303a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            atomicInteger.getAndIncrement();
        } else {
            atomicInteger2.getAndIncrement();
        }
        return C22306c.empty();
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ C22306c m52990b0(Media media, roj0 roj0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(media);
        return ya5.m213796L(arrayList, "profile", "user-profile", null, UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m52991c0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m52994f0(View view) {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m52996h0(View view) {
        gga0.m125954a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m52997i0(String str, String str2) {
        Extensions extensions = this.f34198m.profile.extensions;
        if (extensions.wealth == null) {
            extensions.wealth = UserWealth.new_();
        }
        UserWealth userWealth = this.f34198m.profile.extensions.wealth;
        if (userWealth.petImg == null) {
            userWealth.petImg = new ArrayList();
        }
        this.f34198m.profile.extensions.wealth.petImg.add(str);
        m53009u0(str2);
    }

    /* JADX INFO: renamed from: j0 */
    public final C22306c<String> m52998j0(final Media media) {
        return m52999k0(media).flatMap(new w9j() { // from class: l.tfa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m52990b0(media, (roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.ufa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m52987Y((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final C22306c<roj0> m52999k0(Media media) {
        return (qib0.f154703R.m94727c() && (media instanceof Picture)) ? qib0.f154703R.m94726b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.vfa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m52985W((xaj0) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m53000l0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i) {
        if (atomicInteger2.get() != 0) {
            osi0.m165783g("上传图片失败！");
        } else if (atomicInteger.get() == i) {
            osi0.m165783g("检测到敏感信息，上传失败");
        } else if (atomicInteger.get() > 0) {
            osi0.m165783g("检测到敏感信息，已自动移除");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m53001m0(User user, String str) {
        zvf0.m220396r("e_save_pet", str);
        UserWealth userWealth = this.f34198m.profile.extensions.wealth;
        if (userWealth == null) {
            user.profile.extensions.wealth = null;
            return;
        }
        UserWealth userWealth2 = user.profile.extensions.wealth;
        userWealth2.pet = userWealth.pet;
        userWealth2.petImg = userWealth.petImg;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m53002n0(Act act, Throwable th) {
        m53008t0(act);
        th.getMessage();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m53003o0(Act act, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List list) {
        m53008t0(act);
        m53000l0(atomicInteger, atomicInteger2, list.size());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m52996h0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22306c m53004p0(Media media, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2) throws Exception {
        return m52998j0(media).onErrorResumeNext(new w9j() { // from class: l.sfa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m52989a0(atomicInteger, atomicInteger2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22306c m53005q0(final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final Media media) {
        return C22306c.fromCallable(new Callable() { // from class: l.fga0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f97348a.m53004p0(media, atomicInteger, atomicInteger2);
            }
        }).flatMap(new w9j() { // from class: l.qfa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileLoopEditPetUploadPhoto.m52981R((C22306c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m53006r0(int i, String str, View view) {
        this.f34198m.profile.extensions.wealth.petImg.remove(i);
        m53009u0(str);
        zvf0.m220399u("e_edit_pet_upload", str, vwb.m200311Y("asset_status", "0"));
    }

    /* JADX INFO: renamed from: s0 */
    public void m53007s0(final Act act, final List<Media> list, final e30<String> e30Var) {
        if (!NullChecker.m81303a(act) || vwb.m200296J(list)) {
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicInteger atomicInteger2 = new AtomicInteger();
        act.progress(R$string.f27771R0);
        act.duringCreated(C22306c.from(list).concatMap(new w9j() { // from class: l.pfa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148539a.m53005q0(atomicInteger, atomicInteger2, (Media) obj);
            }
        })).compose(mkd0.m154951C()).subscribe(mkd0.m154957I(new e30() { // from class: l.xfa0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileLoopEditPetUploadPhoto.m52984V(e30Var, (String) obj);
            }
        }, new e30() { // from class: l.yfa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198024a.m53002n0(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.zfa0
            @Override // p149l.d30
            public final void call() {
                this.f202926a.m53003o0(act, atomicInteger, atomicInteger2, list);
            }
        }));
    }

    public void setUser(User user) {
        this.f34198m = user.mo223809clone();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m53008t0(final Act act) {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.rfa0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileLoopEditPetUploadPhoto.m52980Q(act);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: u0 */
    public void m53009u0(final String str) {
        if (lqa.m150985w()) {
            xdl0.m208344M(this, false);
        }
        final Act act = (Act) getContext();
        List arrayList = new ArrayList();
        if (!NullChecker.m81303a(this.f34198m) || !NullChecker.m81303a(this.f34198m.profile) || !NullChecker.m81303a(this.f34198m.profile.extensions) || !NullChecker.m81303a(this.f34198m.profile.extensions.wealth)) {
            xdl0.m208344M(this, false);
        } else if (vwb.m200296J(this.f34198m.profile.extensions.wealth.pet) || TextUtils.isEmpty(this.f34198m.profile.extensions.wealth.pet.get(0)) || !TextUtils.equals(this.f34198m.profile.extensions.wealth.pet.get(0), "已有宠物")) {
            xdl0.m208344M(this, false);
            return;
        } else {
            if (!vwb.m200296J(this.f34198m.profile.extensions.wealth.petImg)) {
                arrayList = this.f34198m.profile.extensions.wealth.petImg;
            }
            xdl0.m208344M(this, true);
        }
        View[] viewArr = {this.f34189d, this.f34192g, this.f34195j};
        VDraweeView[] vDraweeViewArr = {this.f34190e, this.f34193h, this.f34196k};
        View[] viewArr2 = {this.f34191f, this.f34194i, this.f34197l};
        int iM186890d = (t100.m186889c().widthPixels - t100.m186890d(96.0f)) / 3;
        for (int i = 0; i < 3; i++) {
            xdl0.m208325C0(viewArr[i], iM186890d);
            xdl0.m208327D0(iM186890d, viewArr[i]);
            xdl0.m208345M0(viewArr[i], false);
            xdl0.m208345M0(viewArr2[i], false);
            xdl0.m208345M0(vDraweeViewArr[i], false);
            xdl0.m208329E0(viewArr[i], new View.OnClickListener() { // from class: l.aga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m52994f0(view);
                }
            });
            xdl0.m208329E0(vDraweeViewArr[i], new View.OnClickListener() { // from class: l.bga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m52983T(view);
                }
            });
            xdl0.m208329E0(viewArr2[i], new View.OnClickListener() { // from class: l.cga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m52991c0(view);
                }
            });
        }
        if (!vwb.m200296J(arrayList)) {
            for (final int i2 = 0; i2 < Math.min(arrayList.size(), 3); i2++) {
                xdl0.m208345M0(viewArr[i2], true);
                xdl0.m208345M0(viewArr2[i2], true);
                xdl0.m208345M0(vDraweeViewArr[i2], true);
                qib0.f154691G.m102331L0(vDraweeViewArr[i2], (String) arrayList.get(i2));
                zvf0.m220368A("e_edit_pet_upload", str, vwb.m200311Y("asset_status", "0"));
                xdl0.m208329E0(viewArr2[i2], new View.OnClickListener() { // from class: l.dga0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f86065a.m53006r0(i2, str, view);
                    }
                });
            }
        }
        if (arrayList.size() < 3) {
            final int size = arrayList.size();
            xdl0.m208345M0(viewArr[size], true);
            xdl0.m208345M0(viewArr2[size], false);
            xdl0.m208345M0(vDraweeViewArr[size], false);
            viewArr[size].setBackgroundResource(e3c0.f89009B0);
            zvf0.m220368A("e_edit_pet_upload", str, vwb.m200311Y("asset_status", "1"));
            xdl0.m208329E0(viewArr[size], new View.OnClickListener() { // from class: l.ega0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileLoopEditPetUploadPhoto.m52988Z(act, size, str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m53010v0(String str, String str2) {
        Extensions extensions = this.f34198m.profile.extensions;
        if (extensions.wealth == null) {
            extensions.wealth = UserWealth.new_();
        }
        UserWealth userWealth = this.f34198m.profile.extensions.wealth;
        if (userWealth.pet == null) {
            userWealth.pet = new ArrayList();
        }
        this.f34198m.profile.extensions.wealth.pet.clear();
        this.f34198m.profile.extensions.wealth.pet.add(str);
        m53009u0(str2);
    }

    public ProfileLoopEditPetUploadPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditPetUploadPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
