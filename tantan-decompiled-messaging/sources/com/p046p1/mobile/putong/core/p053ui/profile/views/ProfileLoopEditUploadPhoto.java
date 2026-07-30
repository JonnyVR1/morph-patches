package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.c30;
import p149l.e30;
import p149l.e51;
import p149l.gha0;
import p149l.lqa;
import p149l.mkd0;
import p149l.osi0;
import p149l.qib0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.ya5;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditUploadPhoto extends VLinear {

    /* JADX INFO: renamed from: c */
    public ProfileLoopEditUploadPhoto f34199c;

    /* JADX INFO: renamed from: d */
    public VLinear f34200d;

    /* JADX INFO: renamed from: e */
    public VFrame f34201e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f34202f;

    /* JADX INFO: renamed from: g */
    public VImage f34203g;

    /* JADX INFO: renamed from: h */
    public Act f34204h;

    /* JADX INFO: renamed from: i */
    public LoopInputType f34205i;

    /* JADX INFO: renamed from: j */
    public String f34206j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditUploadPhoto$a */
    public static /* synthetic */ class C8747a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34207a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f34207a = iArr;
            try {
                iArr[LoopInputType.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34207a[LoopInputType.CAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34207a[LoopInputType.HOUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34207a[LoopInputType.PET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ProfileLoopEditUploadPhoto(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ C22306c m53015T(List list) {
        return (vwb.m200296J(list) || !(list.get(0) instanceof Picture)) ? C22306c.create(new C22306c.a() { // from class: l.fha0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z3g0) obj).onError(null);
            }
        }) : C22306c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX INFO: renamed from: b0 */
    private void m53016b0() {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.eha0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91315a.m53021Z();
            }
        }, 200L);
    }

    private String getEventId() {
        LoopInputType loopInputType = this.f34205i;
        if (loopInputType == null) {
            return "";
        }
        int i = C8747a.f34207a[loopInputType.ordinal()];
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
        if (getEditAct() != null && getEditAct().m51509a2() != null && getEditAct().m51509a2().m51559u0() != null && this.f34205i != null) {
            User userM51559u0 = getEditAct().m51509a2().m51559u0();
            int i = C8747a.f34207a[this.f34205i.ordinal()];
            if (i == 1) {
                List<String> list = userM51559u0.profile.extensions.physical.heightImg;
                if (!vwb.m200296J(list)) {
                    return list.get(0);
                }
            } else if (i == 2) {
                List<String> list2 = userM51559u0.profile.extensions.wealth.carImg;
                if (!vwb.m200296J(list2)) {
                    return list2.get(0);
                }
            } else if (i == 3) {
                List<String> list3 = userM51559u0.profile.extensions.wealth.houseImg;
                if (!vwb.m200296J(list3)) {
                    return list3.get(0);
                }
            } else {
                if (i != 4) {
                    return null;
                }
                List<String> list4 = userM51559u0.profile.extensions.wealth.petImg;
                if (!vwb.m200296J(list4)) {
                    return list4.get(0);
                }
            }
        }
        return null;
    }

    private String getPageId() {
        LoopInputType loopInputType = this.f34205i;
        if (loopInputType == null) {
            return "";
        }
        int i = C8747a.f34207a[loopInputType.ordinal()];
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
    public final void m53017V(View view) {
        gha0.m126162a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m53018W(User user) {
        if (lqa.m150972j() && this.f34205i != null) {
            ArrayList arrayList = new ArrayList();
            if (xdl0.m208349O0(this)) {
                arrayList.add(this.f34206j);
            }
            int i = C8747a.f34207a[this.f34205i.ordinal()];
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
    public final /* synthetic */ void m53019X(String str) {
        this.f34206j = str;
        m53023c0();
        m53016b0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m53020Y(Throwable th) {
        osi0.m165783g("上传图片失败！");
        m53016b0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m53021Z() {
        if (c30.m104964f(this.f34204h)) {
            this.f34204h.progressDismiss();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m53022a0(List<Media> list) {
        if (NullChecker.m81303a(this.f34204h) && !vwb.m200296J(list) && (list.get(0) instanceof Picture)) {
            Picture picture = (Picture) list.get(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            this.f34204h.progress(R$string.f27771R0);
            this.f34204h.duringCreated((C22306c) ya5.m213796L(arrayList, "profile", "user-profile", null, UploadSource.get("profile")).flatMap(new w9j() { // from class: l.bha0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileLoopEditUploadPhoto.m53015T((List) obj);
                }
            })).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.cha0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80841a.m53019X((String) obj);
                }
            }, new e30() { // from class: l.dha0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86248a.m53020Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m53023c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f34206j);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            qib0.f154691G.m102331L0(this.f34202f, this.f34206j);
        }
        xdl0.m208344M(this.f34200d, zIsEmpty);
        xdl0.m208344M(this.f34201e, z);
    }

    public ProfileInfoLoopEditAct getEditAct() {
        return (ProfileInfoLoopEditAct) this.f34204h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53017V(this);
    }

    public void setVisible(boolean z) {
        xdl0.m208344M(this, false);
    }

    public ProfileLoopEditUploadPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileLoopEditUploadPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
