package com.p000p1.mobile.putong.core.newui.profile.dialog;

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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.profile.EditProfileAct;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCards;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.e30;
import l.f6c0;
import l.fwl;
import l.g30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.rzb0;
import l.t100;
import l.u4c0;
import l.v7c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p009l.i0e;
import p009l.pj90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MediaRecorderFrag extends DialogFragment implements fwl {

    /* JADX INFO: renamed from: A */
    public MediaReorderCards f5280A;

    /* JADX INFO: renamed from: B */
    public User f5281B;

    /* JADX INFO: renamed from: C */
    public View f5282C;

    /* JADX INFO: renamed from: E */
    public cwf0 f5284E;

    /* JADX INFO: renamed from: F */
    public InterfaceC0380a f5285F;

    /* JADX INFO: renamed from: z */
    public Pair<View, MediaReorderCards> f5289z;

    /* JADX INFO: renamed from: D */
    public int f5283D = -1;

    /* JADX INFO: renamed from: G */
    public boolean f5286G = false;

    /* JADX INFO: renamed from: H */
    public boolean f5287H = false;

    /* JADX INFO: renamed from: I */
    public int f5288I = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag$a */
    public interface InterfaceC0380a {
        /* JADX INFO: renamed from: a */
        void m7469a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m7453g4(Media media, Boolean bool, Boolean bool2) {
        m7468n4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m7454k4(List<Media> list) {
        this.f5283D = list.size();
        int i = 0;
        while (i < 6) {
            this.f5280A.h(i).C1(i < list.size() ? list.get(i) : null);
            this.f5280A.h(i).setMediaOperation(this);
            this.f5280A.h(i).setChangeAction(new g30() { // from class: l.kux
                /* JADX INFO: renamed from: a */
                public final void m17600a(Object obj, Object obj2, Object obj3) {
                    this.f15862a.m7453g4((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f5280A.h(i).E1(i, "p_specialguest_photo_upload");
            if (i == list.size()) {
                this.f5280A.h(i).P1();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public Act m7455a4() {
        return getActivity();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m7456b4() {
        getDialog().requestWindowFeature(1);
        Window window = getDialog().getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        attributes.windowAnimations = v7c0.i;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m7457c4(View view) {
        zvf0.r("e_specialguest_photo_close", "p_specialguest_photo_upload");
        if (NullChecker.a(this.f5285F)) {
            this.f5285F.onCancel();
        }
        this.f5286G = true;
        dismiss();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m7458d4(View view) {
        m7465l4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m7459e4(roj0 roj0Var) {
        this.f5286G = true;
        if (NullChecker.a(this.f5285F)) {
            this.f5285F.m7469a();
        }
        CoreModule.c.e0.H7();
        m7455a4().progressDismiss();
        dismiss();
    }

    /* JADX INFO: renamed from: f2 */
    public void m7460f2(int i, String str) {
        this.f5288I = i;
        startActivityForResult(NewCropperAct.m94F1(m7455a4(), str, true), 24576);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m7461f4(Throwable th) {
        if (NullChecker.a(m7455a4())) {
            m7455a4().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m7462h4(List<Media> list) {
        if (this.f5288I == -1 || !NullChecker.b(this.f5280A) || list.size() <= 0) {
            return;
        }
        m7463i4(list, this.f5288I);
    }

    /* JADX INFO: renamed from: i4 */
    public void m7463i4(List<Media> list, int i) {
        Video video = (Media) list.get(0);
        if (video instanceof Video) {
            this.f5280A.h(i).z1(video);
        } else if (video instanceof Picture) {
            this.f5280A.h(i).w1((Picture) video);
        }
        m7468n4();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f5280A.h(i2).E1(i2, "p_specialguest_photo_upload");
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m7464j4(User user, User user2) {
        User userSubtract = user.subtract(user2);
        if (NullChecker.a(userSubtract)) {
            m7455a4().progress(R.string.J5);
            m7455a4().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.iux
                public final void call(Object obj) {
                    this.f14826a.m7459e4((roj0) obj);
                }
            }, new e30() { // from class: l.jux
                public final void call(Object obj) {
                    this.f15335a.m7461f4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m7465l4() {
        if (NullChecker.a(this.f5280A)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6 && !this.f5280A.h(i).n(); i++) {
                arrayList.add(this.f5280A.h(i).N);
            }
            int size = arrayList.size();
            zvf0.u("e_specialguest_photo_complete", "p_specialguest_photo_upload", new j760[]{vwb.Y("specialguest_photo_upload_type", Integer.valueOf(size))});
            if (size > this.f5283D) {
                User userClone = CoreModule.c.e0.na().clone();
                userClone.pictures = arrayList;
                m7464j4(userClone, CoreModule.c.e0.na());
            }
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m7466m4(InterfaceC0380a interfaceC0380a) {
        this.f5285F = interfaceC0380a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m7467n0(int i, boolean z, boolean z2, boolean z3) {
        this.f5287H = z;
        this.f5288I = i;
        if (z2) {
            startActivityForResult(MediaPickerAct.m9216X1(m7455a4(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), 786);
            m7455a4().overridePendingTransition(rzb0.y, 0);
        } else if (!z3) {
            startActivityForResult(com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct.i2(m7455a4(), 1, false, true, true, (String) null, com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender, "", true), 786);
        } else {
            startActivityForResult(MediaPickerAct.m9216X1(m7455a4(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(m7455a4() instanceof EditProfileAct).build()), 786);
            m7455a4().overridePendingTransition(rzb0.y, 0);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public void m7468n4() {
        if (NullChecker.a(this.f5280A)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6 && !this.f5280A.h(i).n(); i++) {
                if (TEnum.equals(this.f5280A.h(i).N.status, "normal")) {
                    arrayList.add(this.f5280A.h(i).N);
                }
            }
            this.f5282C.setEnabled(arrayList.size() > this.f5283D);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable @org.jetbrains.annotations.Nullable Intent intent) {
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        if (i == 786 && i2 == -1) {
            m7462h4((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h));
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m7456b4();
        View viewInflate = layoutInflater.inflate(f6c0.Ic, (ViewGroup) null);
        viewInflate.findViewById(u4c0.re).getPaint().setFakeBoldText(true);
        Pair<View, MediaReorderCards> pairM20485u = new pj90(m7455a4(), null).m20485u((FrameLayout) viewInflate.findViewById(u4c0.S1), true);
        this.f5289z = pairM20485u;
        ((View) pairM20485u.first).findViewById(u4c0.g2).setVisibility(8);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) this.f5289z.second;
        this.f5280A = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f5280A.setCurPageId("p_specialguest_photo_upload");
        this.f5282C = viewInflate.findViewById(u4c0.d3);
        xdl0.E0(viewInflate.findViewById(u4c0.E1), new View.OnClickListener() { // from class: l.gux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13776a.m7457c4(view);
            }
        });
        xdl0.E0(this.f5282C, new View.OnClickListener() { // from class: l.hux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14260a.m7458d4(view);
            }
        });
        this.f5282C.setEnabled(false);
        User userNa = CoreModule.c.e0.na();
        User userClone = userNa.clone();
        this.f5281B = userClone;
        m7454k4(userClone.pictures);
        cwf0 cwf0VarM16062c = i0e.m16062c("p_specialguest_photo_upload", Dialog.class.getName());
        this.f5284E = cwf0VarM16062c;
        cwf0VarM16062c.p(new j760[]{vwb.Y("specialguest_photo_upload_type", Integer.valueOf(userNa.pictures.size()))});
        i0e.m16065f(this.f5284E);
        return viewInflate;
    }

    public void onDismiss(@NonNull @NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        i0e.m16064e(this.f5284E);
        if (!this.f5286G && NullChecker.a(this.f5285F)) {
            this.f5285F.onCancel();
        }
        this.f5286G = true;
    }

    public void show(@NonNull @NotNull FragmentManager fragmentManager, @Nullable @org.jetbrains.annotations.Nullable String str) {
        k kVarM = fragmentManager.m();
        kVarM.e(this, str);
        kVarM.j();
    }
}
