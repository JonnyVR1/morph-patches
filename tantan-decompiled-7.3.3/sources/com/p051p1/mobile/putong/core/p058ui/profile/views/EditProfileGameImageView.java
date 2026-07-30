package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.bkj0;
import p153l.bnl0;
import p153l.fn2;
import p153l.jyb;
import p153l.psd0;
import p153l.qcj;
import p153l.qim;
import p153l.r1j0;
import p153l.sec0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w20;
import p153l.wme;
import p153l.y20;
import p153l.z7c0;

/* JADX INFO: loaded from: classes4.dex */
public class EditProfileGameImageView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f34946a;

    /* JADX INFO: renamed from: b */
    public VFrame f34947b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f34948c;

    /* JADX INFO: renamed from: d */
    public VImage f34949d;

    /* JADX INFO: renamed from: e */
    public Act f34950e;

    /* JADX INFO: renamed from: f */
    public String f34951f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8904b f34952g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView$a */
    public class C8903a extends fn2 {
        public C8903a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            if (w20.m204491f(EditProfileGameImageView.this.f34950e)) {
                EditProfileGameImageView.this.f34950e.progressDismiss();
            }
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (w20.m204491f(EditProfileGameImageView.this.f34950e)) {
                EditProfileGameImageView.this.f34950e.progressDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView$b */
    public interface InterfaceC8904b {
        /* JADX INFO: renamed from: a */
        void mo54094a(String str);

        /* JADX INFO: renamed from: b */
        void mo54095b(String str);
    }

    public EditProfileGameImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(sec0.f167597v0, (ViewGroup) this, true);
        m54089F(getChildAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m54079K(Act act, View view) {
        if (NullChecker.m82486a(this.f34951f)) {
            CoreModule.m30933P().m143405a().mo180435a0(act, this.f34951f, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m54080L(View view) {
        bnl0.m105524M(this.f34946a, true);
        bnl0.m105524M(this.f34947b, false);
        uqb0.f180374G.m98798o(this.f34948c);
        if (NullChecker.m82486a(this.f34952g)) {
            this.f34952g.mo54095b(this.f34951f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m54081M(String str) {
        if (NullChecker.m82486a(this.f34952g)) {
            this.f34952g.mo54094a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m54082N(Throwable th) {
        if (w20.m204491f(this.f34950e)) {
            this.f34950e.progressDismiss();
        }
        if (NullChecker.m82486a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            r1j0.m179420g(th.getMessage());
        } else {
            r1j0.m179420g("上传失败");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m54083p(Act act, View view) {
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(15).build()), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(z7c0.f203239h, 0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C22421c m54085u(List list) {
        if (jyb.m147479J(list) || !(list.get(0) instanceof Picture)) {
            throw new IllegalPictureException("上传图片失败");
        }
        return C22421c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ uxj0 m54086v(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F */
    public final void m54089F(View view) {
        wme.m207106a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public void m54090G(final Act act, InterfaceC8904b interfaceC8904b) {
        this.f34950e = act;
        this.f34952g = interfaceC8904b;
        bnl0.m105509E0(this.f34946a, new View.OnClickListener() { // from class: l.tme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileGameImageView.m54083p(act, view);
            }
        });
        bnl0.m105509E0(this.f34948c, new View.OnClickListener() { // from class: l.ume
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179619a.m54079K(act, view);
            }
        });
        bnl0.m105509E0(this.f34949d, new View.OnClickListener() { // from class: l.vme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184710a.m54080L(view);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m54091O(@NonNull Picture picture) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        this.f34950e.progress(R$string.f28619R0);
        this.f34950e.duringCreated(uqb0.f180386R.m184739b(Uri.parse(picture.url).getPath()).map(new qcj() { // from class: l.ome
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return EditProfileGameImageView.m54086v((bkj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.pme
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214983L(arrayList, "profile", "user-profile", null, UploadSource.get("profile"));
            }
        }).flatMap(new qcj() { // from class: l.qme
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return EditProfileGameImageView.m54085u((List) obj);
            }
        })).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.rme
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163862a.m54081M((String) obj);
            }
        }, new y20() { // from class: l.sme
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169574a.m54082N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m54092P(String str) {
        this.f34951f = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            uqb0.f180374G.m127117M0(this.f34948c, this.f34951f, new C8903a());
        }
        bnl0.m105524M(this.f34946a, zIsEmpty);
        bnl0.m105524M(this.f34947b, z);
    }

    /* JADX INFO: renamed from: Q */
    public void m54093Q() {
        this.f34946a.performClick();
    }

    public String getImageUrl() {
        return this.f34951f;
    }

    public EditProfileGameImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditProfileGameImageView(Context context) {
        this(context, null);
    }
}
