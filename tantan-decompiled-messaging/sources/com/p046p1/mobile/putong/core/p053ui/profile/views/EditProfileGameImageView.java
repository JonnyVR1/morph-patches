package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
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
import p149l.mkd0;
import p149l.n6c0;
import p149l.ngm;
import p149l.osi0;
import p149l.qib0;
import p149l.roj0;
import p149l.sle;
import p149l.tzb0;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes4.dex */
public class EditProfileGameImageView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f34098a;

    /* JADX INFO: renamed from: b */
    public VFrame f34099b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f34100c;

    /* JADX INFO: renamed from: d */
    public VImage f34101d;

    /* JADX INFO: renamed from: e */
    public Act f34102e;

    /* JADX INFO: renamed from: f */
    public String f34103f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8741b f34104g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView$a */
    public class C8740a extends ym2 {
        public C8740a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            if (c30.m104964f(EditProfileGameImageView.this.f34102e)) {
                EditProfileGameImageView.this.f34102e.progressDismiss();
            }
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (c30.m104964f(EditProfileGameImageView.this.f34102e)) {
                EditProfileGameImageView.this.f34102e.progressDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView$b */
    public interface InterfaceC8741b {
        /* JADX INFO: renamed from: a */
        void mo52911a(String str);

        /* JADX INFO: renamed from: b */
        void mo52912b(String str);
    }

    public EditProfileGameImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(n6c0.f137383v0, (ViewGroup) this, true);
        m52906F(getChildAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m52896K(Act act, View view) {
        if (NullChecker.m81303a(this.f34103f)) {
            CoreModule.m29935P().m94651a().mo158343a0(act, this.f34103f, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m52897L(View view) {
        xdl0.m208344M(this.f34098a, true);
        xdl0.m208344M(this.f34099b, false);
        qib0.f154691G.m184725o(this.f34100c);
        if (NullChecker.m81303a(this.f34104g)) {
            this.f34104g.mo52912b(this.f34103f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m52898M(String str) {
        if (NullChecker.m81303a(this.f34104g)) {
            this.f34104g.mo52911a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m52899N(Throwable th) {
        if (c30.m104964f(this.f34102e)) {
            this.f34102e.progressDismiss();
        }
        if (NullChecker.m81303a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            osi0.m165783g(th.getMessage());
        } else {
            osi0.m165783g("上传失败");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m52900p(Act act, View view) {
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(15).build()), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(tzb0.f172721h, 0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C22306c m52902u(List list) {
        if (vwb.m200296J(list) || !(list.get(0) instanceof Picture)) {
            throw new IllegalPictureException("上传图片失败");
        }
        return C22306c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ roj0 m52903v(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: F */
    public final void m52906F(View view) {
        sle.m184799a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public void m52907G(final Act act, InterfaceC8741b interfaceC8741b) {
        this.f34102e = act;
        this.f34104g = interfaceC8741b;
        xdl0.m208329E0(this.f34098a, new View.OnClickListener() { // from class: l.ple
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileGameImageView.m52900p(act, view);
            }
        });
        xdl0.m208329E0(this.f34100c, new View.OnClickListener() { // from class: l.qle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155225a.m52896K(act, view);
            }
        });
        xdl0.m208329E0(this.f34101d, new View.OnClickListener() { // from class: l.rle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159961a.m52897L(view);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m52908O(@NonNull Picture picture) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        this.f34102e.progress(R$string.f27771R0);
        this.f34102e.duringCreated(qib0.f154703R.m94726b(Uri.parse(picture.url).getPath()).map(new w9j() { // from class: l.kle
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return EditProfileGameImageView.m52903v((xaj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.lle
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213796L(arrayList, "profile", "user-profile", null, UploadSource.get("profile"));
            }
        }).flatMap(new w9j() { // from class: l.mle
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return EditProfileGameImageView.m52902u((List) obj);
            }
        })).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.nle
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139521a.m52898M((String) obj);
            }
        }, new e30() { // from class: l.ole
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144494a.m52899N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m52909P(String str) {
        this.f34103f = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            qib0.f154691G.m102333M0(this.f34100c, this.f34103f, new C8740a());
        }
        xdl0.m208344M(this.f34098a, zIsEmpty);
        xdl0.m208344M(this.f34099b, z);
    }

    /* JADX INFO: renamed from: Q */
    public void m52910Q() {
        this.f34098a.performClick();
    }

    public String getImageUrl() {
        return this.f34103f;
    }

    public EditProfileGameImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditProfileGameImageView(Context context) {
        this(context, null);
    }
}
