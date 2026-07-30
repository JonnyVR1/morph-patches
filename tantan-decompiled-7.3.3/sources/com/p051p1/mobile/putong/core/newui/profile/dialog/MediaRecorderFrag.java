package com.p051p1.mobile.putong.core.newui.profile.dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p051p1.mobile.putong.core.p058ui.profile.EditProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.a30;
import p153l.adc0;
import p153l.agc0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.l4g0;
import p153l.psd0;
import p153l.qa00;
import p153l.tr90;
import p153l.uxj0;
import p153l.w1e;
import p153l.x7c0;
import p153l.xyl;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class MediaRecorderFrag extends DialogFragment implements xyl {

    /* JADX INFO: renamed from: A */
    public MediaReorderCards f27244A;

    /* JADX INFO: renamed from: B */
    public User f27245B;

    /* JADX INFO: renamed from: C */
    public View f27246C;

    /* JADX INFO: renamed from: E */
    public l4g0 f27248E;

    /* JADX INFO: renamed from: F */
    public InterfaceC8367a f27249F;

    /* JADX INFO: renamed from: z */
    public Pair<View, MediaReorderCards> f27253z;

    /* JADX INFO: renamed from: D */
    public int f27247D = -1;

    /* JADX INFO: renamed from: G */
    public boolean f27250G = false;

    /* JADX INFO: renamed from: H */
    public boolean f27251H = false;

    /* JADX INFO: renamed from: I */
    public int f27252I = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag$a */
    public interface InterfaceC8367a {
        /* JADX INFO: renamed from: a */
        void mo44259a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m44243g4(Media media, Boolean bool, Boolean bool2) {
        m44258n4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m44244k4(List<Media> list) {
        this.f27247D = list.size();
        int i = 0;
        while (i < 6) {
            this.f27244A.m51994h(i).m51823C1(i < list.size() ? list.get(i) : null);
            this.f27244A.m51994h(i).setMediaOperation(this);
            this.f27244A.m51994h(i).setChangeAction(new a30() { // from class: l.h3y
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f107710a.m44243g4((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f27244A.m51994h(i).m51827E1(i, "p_specialguest_photo_upload");
            if (i == list.size()) {
                this.f27244A.m51994h(i).m51849P1();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public Act m44245a4() {
        return (Act) getActivity();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m44246b4() {
        getDialog().requestWindowFeature(1);
        Window window = getDialog().getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        attributes.windowAnimations = agc0.f71123i;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m44247c4(View view) {
        i4g0.m138520r("e_specialguest_photo_close", "p_specialguest_photo_upload");
        if (NullChecker.m82486a(this.f27249F)) {
            this.f27249F.onCancel();
        }
        this.f27250G = true;
        dismiss();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m44248d4(View view) {
        m44255l4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m44249e4(uxj0 uxj0Var) {
        this.f27250G = true;
        if (NullChecker.m82486a(this.f27249F)) {
            this.f27249F.mo44259a();
        }
        CoreModule.f18264c.f20381e0.m116468H7();
        m44245a4().progressDismiss();
        dismiss();
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f27252I = i;
        startActivityForResult(NewCropperAct.m37196G1(m44245a4(), str, true), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m44251f4(Throwable th) {
        if (NullChecker.m82486a(m44245a4())) {
            m44245a4().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m44252h4(List<Media> list) {
        if (this.f27252I == -1 || !NullChecker.m82487b(this.f27244A) || list.size() <= 0) {
            return;
        }
        m44253i4(list, this.f27252I);
    }

    /* JADX INFO: renamed from: i4 */
    public void m44253i4(List<Media> list, int i) {
        Media media = list.get(0);
        if (media instanceof Video) {
            this.f27244A.m51994h(i).m51897z1((Video) media);
        } else if (media instanceof Picture) {
            this.f27244A.m51994h(i).m51891w1((Picture) media);
        }
        m44258n4();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f27244A.m51994h(i2).m51827E1(i2, "p_specialguest_photo_upload");
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m44254j4(User user, User user2) {
        User userSubtract = user.subtract(user2);
        if (NullChecker.m82486a(userSubtract)) {
            m44245a4().progress(R$string.f18632L5);
            m44245a4().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.f3y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97015a.m44249e4((uxj0) obj);
                }
            }, new y20() { // from class: l.g3y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102031a.m44251f4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m44255l4() {
        if (NullChecker.m82486a(this.f27244A)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6 && !this.f27244A.m51994h(i).m51977n(); i++) {
                arrayList.add(this.f27244A.m51994h(i).f33824N);
            }
            int size = arrayList.size();
            i4g0.m138523u("e_specialguest_photo_complete", "p_specialguest_photo_upload", jyb.m147494Y("specialguest_photo_upload_type", Integer.valueOf(size)));
            if (size > this.f27247D) {
                User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
                userMo225055clone.pictures = arrayList;
                m44254j4(userMo225055clone, CoreModule.f18264c.f20381e0.m116593na());
            }
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m44256m4(InterfaceC8367a interfaceC8367a) {
        this.f27249F = interfaceC8367a;
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        this.f27251H = z;
        this.f27252I = i;
        if (z2) {
            startActivityForResult(MediaPickerAct.m80102Y1(m44245a4(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            m44245a4().overridePendingTransition(x7c0.f192710y, 0);
        } else if (!z3) {
            startActivityForResult(com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct.m48970k2(m44245a4(), 1, false, true, true, null, com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender, "", true), PutongAct.REQUEST_CODE_PICKER);
        } else {
            startActivityForResult(MediaPickerAct.m80102Y1(m44245a4(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(m44245a4() instanceof EditProfileAct).build()), PutongAct.REQUEST_CODE_PICKER);
            m44245a4().overridePendingTransition(x7c0.f192710y, 0);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public void m44258n4() {
        if (NullChecker.m82486a(this.f27244A)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6 && !this.f27244A.m51994h(i).m51977n(); i++) {
                if (TEnum.equals(this.f27244A.m51994h(i).f33824N.status, "normal")) {
                    arrayList.add(this.f27244A.m51994h(i).f33824N);
                }
            }
            this.f27246C.setEnabled(arrayList.size() > this.f27247D);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable @org.jetbrains.annotations.Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 786 && i2 == -1) {
            m44252h4((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m44246b4();
        View viewInflate = layoutInflater.inflate(kec0.f125573Pc, (ViewGroup) null);
        ((VText) viewInflate.findViewById(adc0.f70596ue)).getPaint().setFakeBoldText(true);
        Pair<View, MediaReorderCards> pairM192438u = new tr90(m44245a4(), null).m192438u((FrameLayout) viewInflate.findViewById(adc0.f70112S1), true);
        this.f27253z = pairM192438u;
        ((View) pairM192438u.first).findViewById(adc0.f70381i2).setVisibility(8);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) this.f27253z.second;
        this.f27244A = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f27244A.setCurPageId("p_specialguest_photo_upload");
        this.f27246C = viewInflate.findViewById(adc0.f70331f3);
        bnl0.m105509E0(viewInflate.findViewById(adc0.f69874E1), new View.OnClickListener() { // from class: l.d3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84955a.m44247c4(view);
            }
        });
        bnl0.m105509E0(this.f27246C, new View.OnClickListener() { // from class: l.e3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92016a.m44248d4(view);
            }
        });
        this.f27246C.setEnabled(false);
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        User userMo225055clone = userM116593na.mo225055clone();
        this.f27245B = userMo225055clone;
        m44244k4(userMo225055clone.pictures);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_specialguest_photo_upload", Dialog.class.getName());
        this.f27248E = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("specialguest_photo_upload_type", Integer.valueOf(userM116593na.pictures.size())));
        w1e.m204402f(this.f27248E);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull @NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        w1e.m204401e(this.f27248E);
        if (!this.f27250G && NullChecker.m82486a(this.f27249F)) {
            this.f27249F.onCancel();
        }
        this.f27250G = true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NonNull @NotNull FragmentManager fragmentManager, @Nullable @org.jetbrains.annotations.Nullable String str) {
        AbstractC0428k abstractC0428kM2568m = fragmentManager.m2568m();
        abstractC0428kM2568m.m2807e(this, str);
        abstractC0428kM2568m.mo2709j();
    }
}
