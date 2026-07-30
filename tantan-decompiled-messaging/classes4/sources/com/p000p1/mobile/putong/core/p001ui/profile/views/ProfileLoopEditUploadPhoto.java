package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.c30;
import l.e30;
import l.e51;
import l.gha0;
import l.lqa;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ya5;
import l.z3g0;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopEditUploadPhoto extends VLinear {

    /* JADX INFO: renamed from: c */
    public ProfileLoopEditUploadPhoto f2021c;

    /* JADX INFO: renamed from: d */
    public VLinear f2022d;

    /* JADX INFO: renamed from: e */
    public VFrame f2023e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2024f;

    /* JADX INFO: renamed from: g */
    public VImage f2025g;

    /* JADX INFO: renamed from: h */
    public Act f2026h;

    /* JADX INFO: renamed from: i */
    public LoopInputType f2027i;

    /* JADX INFO: renamed from: j */
    public String f2028j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditUploadPhoto$a */
    public static /* synthetic */ class C0172a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2029a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f2029a = iArr;
            try {
                iArr[LoopInputType.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2029a[LoopInputType.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2029a[LoopInputType.HOUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2029a[LoopInputType.PET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ProfileLoopEditUploadPhoto(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ c m3573T(List list) {
        return (vwb.J(list) || !(list.get(0) instanceof Picture)) ? c.create(new c.a() { // from class: l.fha0
            public final void call(Object obj) {
                ((z3g0) obj).onError((Throwable) null);
            }
        }) : c.just(((Media) ((Media) list.get(0)).cover()).url);
    }

    /* JADX INFO: renamed from: b0 */
    private void m3574b0() {
        e51.H(CoreModule.b, new Runnable() { // from class: l.eha0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9790a.m3579Z();
            }
        }, 200L);
    }

    private String getEventId() {
        LoopInputType loopInputType = this.f2027i;
        if (loopInputType == null) {
            return "";
        }
        int i = C0172a.f2029a[loopInputType.ordinal()];
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
        if (getEditAct() != null && getEditAct().m1991a2() != null && getEditAct().m1991a2().m2043u0() != null && this.f2027i != null) {
            User userM2043u0 = getEditAct().m1991a2().m2043u0();
            int i = C0172a.f2029a[this.f2027i.ordinal()];
            if (i == 1) {
                List list = userM2043u0.profile.extensions.physical.heightImg;
                if (!vwb.J(list)) {
                    return (String) list.get(0);
                }
            } else if (i == 2) {
                List list2 = userM2043u0.profile.extensions.wealth.carImg;
                if (!vwb.J(list2)) {
                    return (String) list2.get(0);
                }
            } else if (i == 3) {
                List list3 = userM2043u0.profile.extensions.wealth.houseImg;
                if (!vwb.J(list3)) {
                    return (String) list3.get(0);
                }
            } else {
                if (i != 4) {
                    return null;
                }
                List list4 = userM2043u0.profile.extensions.wealth.petImg;
                if (!vwb.J(list4)) {
                    return (String) list4.get(0);
                }
            }
        }
        return null;
    }

    private String getPageId() {
        LoopInputType loopInputType = this.f2027i;
        if (loopInputType == null) {
            return "";
        }
        int i = C0172a.f2029a[loopInputType.ordinal()];
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
    public final void m3575V(View view) {
        gha0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public void m3576W(User user) {
        if (lqa.j() && this.f2027i != null) {
            ArrayList arrayList = new ArrayList();
            if (xdl0.O0(this)) {
                arrayList.add(this.f2028j);
            }
            int i = C0172a.f2029a[this.f2027i.ordinal()];
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
    public final /* synthetic */ void m3577X(String str) {
        this.f2028j = str;
        m3581c0();
        m3574b0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m3578Y(Throwable th) {
        osi0.g("上传图片失败！");
        m3574b0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m3579Z() {
        if (c30.f(this.f2026h)) {
            this.f2026h.progressDismiss();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m3580a0(List<Media> list) {
        if (NullChecker.a(this.f2026h) && !vwb.J(list) && (list.get(0) instanceof Picture)) {
            Picture picture = list.get(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            this.f2026h.progress(R.string.R0);
            this.f2026h.duringCreated(ya5.L(arrayList, "profile", "user-profile", (Map) null, UploadSource.get("profile")).flatMap(new w9j() { // from class: l.bha0
                public final Object call(Object obj) {
                    return ProfileLoopEditUploadPhoto.m3573T((List) obj);
                }
            })).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.cha0
                public final void call(Object obj) {
                    this.f8669a.m3577X((String) obj);
                }
            }, new e30() { // from class: l.dha0
                public final void call(Object obj) {
                    this.f9261a.m3578Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3581c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f2028j);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            qib0.G.L0(this.f2024f, this.f2028j);
        }
        xdl0.M(this.f2022d, zIsEmpty);
        xdl0.M(this.f2023e, z);
    }

    public ProfileInfoLoopEditAct getEditAct() {
        return this.f2026h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3575V(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisible(boolean z) {
        xdl0.M(this, false);
    }

    public ProfileLoopEditUploadPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditUploadPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
