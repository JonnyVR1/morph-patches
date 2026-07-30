package com.p046p1.mobile.putong.core.newui.profile.dialog;

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
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p046p1.mobile.putong.core.p053ui.profile.EditProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cwf0;
import p149l.e30;
import p149l.f6c0;
import p149l.fwl;
import p149l.g30;
import p149l.i0e;
import p149l.mkd0;
import p149l.pj90;
import p149l.roj0;
import p149l.rzb0;
import p149l.t100;
import p149l.u4c0;
import p149l.v7c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MediaRecorderFrag extends DialogFragment implements fwl {

    /* JADX INFO: renamed from: A */
    public MediaReorderCards f26502A;

    /* JADX INFO: renamed from: B */
    public User f26503B;

    /* JADX INFO: renamed from: C */
    public View f26504C;

    /* JADX INFO: renamed from: E */
    public cwf0 f26506E;

    /* JADX INFO: renamed from: F */
    public InterfaceC8216a f26507F;

    /* JADX INFO: renamed from: z */
    public Pair<View, MediaReorderCards> f26511z;

    /* JADX INFO: renamed from: D */
    public int f26505D = -1;

    /* JADX INFO: renamed from: G */
    public boolean f26508G = false;

    /* JADX INFO: renamed from: H */
    public boolean f26509H = false;

    /* JADX INFO: renamed from: I */
    public int f26510I = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag$a */
    public interface InterfaceC8216a {
        /* JADX INFO: renamed from: a */
        void mo43248a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m43232g4(Media media, Boolean bool, Boolean bool2) {
        m43247n4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m43233k4(List<Media> list) {
        this.f26505D = list.size();
        int i = 0;
        while (i < 6) {
            this.f26502A.m50811h(i).m50640C1(i < list.size() ? list.get(i) : null);
            this.f26502A.m50811h(i).setMediaOperation(this);
            this.f26502A.m50811h(i).setChangeAction(new g30() { // from class: l.kux
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f124730a.m43232g4((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f26502A.m50811h(i).m50644E1(i, "p_specialguest_photo_upload");
            if (i == list.size()) {
                this.f26502A.m50811h(i).m50666P1();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public Act m43234a4() {
        return (Act) getActivity();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m43235b4() {
        getDialog().requestWindowFeature(1);
        Window window = getDialog().getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        attributes.windowAnimations = v7c0.f180362i;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m43236c4(View view) {
        zvf0.m220396r("e_specialguest_photo_close", "p_specialguest_photo_upload");
        if (NullChecker.m81303a(this.f26507F)) {
            this.f26507F.onCancel();
        }
        this.f26508G = true;
        dismiss();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m43237d4(View view) {
        m43244l4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m43238e4(roj0 roj0Var) {
        this.f26508G = true;
        if (NullChecker.m81303a(this.f26507F)) {
            this.f26507F.mo43248a();
        }
        CoreModule.f17545c.f19639e0.m169395H7();
        m43234a4().progressDismiss();
        dismiss();
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f26510I = i;
        startActivityForResult(NewCropperAct.m36193F1(m43234a4(), str, true), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m43240f4(Throwable th) {
        if (NullChecker.m81303a(m43234a4())) {
            m43234a4().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m43241h4(List<Media> list) {
        if (this.f26510I == -1 || !NullChecker.m81304b(this.f26502A) || list.size() <= 0) {
            return;
        }
        m43242i4(list, this.f26510I);
    }

    /* JADX INFO: renamed from: i4 */
    public void m43242i4(List<Media> list, int i) {
        Media media = list.get(0);
        if (media instanceof Video) {
            this.f26502A.m50811h(i).m50714z1((Video) media);
        } else if (media instanceof Picture) {
            this.f26502A.m50811h(i).m50708w1((Picture) media);
        }
        m43247n4();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f26502A.m50811h(i2).m50644E1(i2, "p_specialguest_photo_upload");
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m43243j4(User user, User user2) {
        User userSubtract = user.subtract(user2);
        if (NullChecker.m81303a(userSubtract)) {
            m43234a4().progress(R$string.f17842J5);
            m43234a4().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.iux
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115061a.m43238e4((roj0) obj);
                }
            }, new e30() { // from class: l.jux
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119822a.m43240f4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m43244l4() {
        if (NullChecker.m81303a(this.f26502A)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6 && !this.f26502A.m50811h(i).m50794n(); i++) {
                arrayList.add(this.f26502A.m50811h(i).f32976N);
            }
            int size = arrayList.size();
            zvf0.m220399u("e_specialguest_photo_complete", "p_specialguest_photo_upload", vwb.m200311Y("specialguest_photo_upload_type", Integer.valueOf(size)));
            if (size > this.f26505D) {
                User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
                userMo223809clone.pictures = arrayList;
                m43243j4(userMo223809clone, CoreModule.f17545c.f19639e0.m169520na());
            }
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m43245m4(InterfaceC8216a interfaceC8216a) {
        this.f26507F = interfaceC8216a;
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        this.f26509H = z;
        this.f26510I = i;
        if (z2) {
            startActivityForResult(MediaPickerAct.m78919X1(m43234a4(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            m43234a4().overridePendingTransition(rzb0.f161653y, 0);
        } else if (!z3) {
            startActivityForResult(com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct.m47787i2(m43234a4(), 1, false, true, true, null, com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender, "", true), PutongAct.REQUEST_CODE_PICKER);
        } else {
            startActivityForResult(MediaPickerAct.m78919X1(m43234a4(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(m43234a4() instanceof EditProfileAct).build()), PutongAct.REQUEST_CODE_PICKER);
            m43234a4().overridePendingTransition(rzb0.f161653y, 0);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public void m43247n4() {
        if (NullChecker.m81303a(this.f26502A)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6 && !this.f26502A.m50811h(i).m50794n(); i++) {
                if (TEnum.equals(this.f26502A.m50811h(i).f32976N.status, "normal")) {
                    arrayList.add(this.f26502A.m50811h(i).f32976N);
                }
            }
            this.f26504C.setEnabled(arrayList.size() > this.f26505D);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable @org.jetbrains.annotations.Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 786 && i2 == -1) {
            m43241h4((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m43235b4();
        View viewInflate = layoutInflater.inflate(f6c0.f95407Ic, (ViewGroup) null);
        ((VText) viewInflate.findViewById(u4c0.f174454re)).getPaint().setFakeBoldText(true);
        Pair<View, MediaReorderCards> pairM169813u = new pj90(m43234a4(), null).m169813u((FrameLayout) viewInflate.findViewById(u4c0.f174024S1), true);
        this.f26511z = pairM169813u;
        ((View) pairM169813u.first).findViewById(u4c0.f174256g2).setVisibility(8);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) this.f26511z.second;
        this.f26502A = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f26502A.setCurPageId("p_specialguest_photo_upload");
        this.f26504C = viewInflate.findViewById(u4c0.f174206d3);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f173786E1), new View.OnClickListener() { // from class: l.gux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104480a.m43236c4(view);
            }
        });
        xdl0.m208329E0(this.f26504C, new View.OnClickListener() { // from class: l.hux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109597a.m43237d4(view);
            }
        });
        this.f26504C.setEnabled(false);
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        User userMo223809clone = userM169520na.mo223809clone();
        this.f26503B = userMo223809clone;
        m43233k4(userMo223809clone.pictures);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_specialguest_photo_upload", Dialog.class.getName());
        this.f26506E = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("specialguest_photo_upload_type", Integer.valueOf(userM169520na.pictures.size())));
        i0e.m133797f(this.f26506E);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull @NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        i0e.m133796e(this.f26506E);
        if (!this.f26508G && NullChecker.m81303a(this.f26507F)) {
            this.f26507F.onCancel();
        }
        this.f26508G = true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NonNull @NotNull FragmentManager fragmentManager, @Nullable @org.jetbrains.annotations.Nullable String str) {
        AbstractC0427k abstractC0427kM2567m = fragmentManager.m2567m();
        abstractC0427kM2567m.m2806e(this, str);
        abstractC0427kM2567m.mo2708j();
    }
}
