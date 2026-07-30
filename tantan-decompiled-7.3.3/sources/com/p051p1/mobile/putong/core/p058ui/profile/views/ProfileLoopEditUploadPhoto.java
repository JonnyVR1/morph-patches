package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.jyb;
import p153l.kpa0;
import p153l.l51;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.w20;
import p153l.xra;
import p153l.y20;
import p153l.yb5;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditUploadPhoto extends VLinear {

    /* JADX INFO: renamed from: c */
    public ProfileLoopEditUploadPhoto f35047c;

    /* JADX INFO: renamed from: d */
    public VLinear f35048d;

    /* JADX INFO: renamed from: e */
    public VFrame f35049e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f35050f;

    /* JADX INFO: renamed from: g */
    public VImage f35051g;

    /* JADX INFO: renamed from: h */
    public Act f35052h;

    /* JADX INFO: renamed from: i */
    public LoopInputType f35053i;

    /* JADX INFO: renamed from: j */
    public String f35054j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditUploadPhoto$a */
    public static /* synthetic */ class C8910a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35055a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f35055a = iArr;
            try {
                iArr[LoopInputType.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35055a[LoopInputType.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35055a[LoopInputType.HOUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35055a[LoopInputType.PET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ProfileLoopEditUploadPhoto(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ C22421c m54198T(List list) {
        return (jyb.m147479J(list) || !(list.get(0) instanceof Picture)) ? C22421c.create(new C22421c.a() { // from class: l.jpa0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gcg0) obj).onError(null);
            }
        }) : C22421c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX INFO: renamed from: b0 */
    private void m54199b0() {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.ipa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116265a.m54204Z();
            }
        }, 200L);
    }

    private String getEventId() {
        LoopInputType loopInputType = this.f35053i;
        if (loopInputType == null) {
            return "";
        }
        int i = C8910a.f35055a[loopInputType.ordinal()];
        if (i == 1) {
            return "e_edit_height_upload";
        }
        if (i == 2) {
            return "e_edit_car_upload";
        }
        if (i != 3) {
            return i != 4 ? "" : "e_edit_pet_upload";
        }
        return "e_edit_house_upload";
    }

    private String getImgUriByInputType() {
        if (getEditAct() != null && getEditAct().m52692b2() != null && getEditAct().m52692b2().m52742u0() != null && this.f35053i != null) {
            User userM52742u0 = getEditAct().m52692b2().m52742u0();
            int i = C8910a.f35055a[this.f35053i.ordinal()];
            if (i == 1) {
                List<String> list = userM52742u0.profile.extensions.physical.heightImg;
                if (!jyb.m147479J(list)) {
                    return list.get(0);
                }
            } else if (i == 2) {
                List<String> list2 = userM52742u0.profile.extensions.wealth.carImg;
                if (!jyb.m147479J(list2)) {
                    return list2.get(0);
                }
            } else if (i == 3) {
                List<String> list3 = userM52742u0.profile.extensions.wealth.houseImg;
                if (!jyb.m147479J(list3)) {
                    return list3.get(0);
                }
            } else {
                if (i != 4) {
                    return null;
                }
                List<String> list4 = userM52742u0.profile.extensions.wealth.petImg;
                if (!jyb.m147479J(list4)) {
                    return list4.get(0);
                }
            }
        }
        return null;
    }

    private String getPageId() {
        LoopInputType loopInputType = this.f35053i;
        if (loopInputType == null) {
            return "";
        }
        int i = C8910a.f35055a[loopInputType.ordinal()];
        if (i == 1) {
            return "p_edit_height";
        }
        if (i == 2) {
            return "p_edit_car";
        }
        if (i != 3) {
            return i != 4 ? "" : "p_edit_pet";
        }
        return "p_edit_house";
    }

    /* JADX INFO: renamed from: V */
    public final void m54200V(View view) {
        kpa0.m150698a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m54201W(User user) {
        if (xra.m212791j() && this.f35053i != null) {
            ArrayList arrayList = new ArrayList();
            if (bnl0.m105529O0(this)) {
                arrayList.add(this.f35054j);
            }
            int i = C8910a.f35055a[this.f35053i.ordinal()];
            if (i == 1) {
                user.profile.extensions.physical.heightImg = arrayList;
                return;
            }
            if (i == 2) {
                user.profile.extensions.wealth.carImg = arrayList;
            } else if (i == 3) {
                user.profile.extensions.wealth.houseImg = arrayList;
            } else {
                if (i != 4) {
                    return;
                }
                user.profile.extensions.wealth.petImg = arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m54202X(String str) {
        this.f35054j = str;
        m54206c0();
        m54199b0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m54203Y(Throwable th) {
        r1j0.m179420g("上传图片失败！");
        m54199b0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m54204Z() {
        if (w20.m204491f(this.f35052h)) {
            this.f35052h.progressDismiss();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m54205a0(List<Media> list) {
        if (NullChecker.m82486a(this.f35052h) && !jyb.m147479J(list) && (list.get(0) instanceof Picture)) {
            Picture picture = (Picture) list.get(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            this.f35052h.progress(R$string.f28619R0);
            this.f35052h.duringCreated((C22421c) yb5.m214983L(arrayList, "profile", "user-profile", null, UploadSource.get("profile")).flatMap(new qcj() { // from class: l.fpa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileLoopEditUploadPhoto.m54198T((List) obj);
                }
            })).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.gpa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f105449a.m54202X((String) obj);
                }
            }, new y20() { // from class: l.hpa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111013a.m54203Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m54206c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f35054j);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            uqb0.f180374G.m127115L0(this.f35050f, this.f35054j);
        }
        bnl0.m105524M(this.f35048d, zIsEmpty);
        bnl0.m105524M(this.f35049e, z);
    }

    public ProfileInfoLoopEditAct getEditAct() {
        return (ProfileInfoLoopEditAct) this.f35052h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54200V(this);
    }

    public void setVisible(boolean z) {
        bnl0.m105524M(this, false);
    }

    public ProfileLoopEditUploadPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditUploadPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
