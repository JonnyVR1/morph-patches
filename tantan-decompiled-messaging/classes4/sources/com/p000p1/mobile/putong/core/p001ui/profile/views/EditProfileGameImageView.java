package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.c30;
import l.e30;
import l.mkd0;
import l.n6c0;
import l.ngm;
import l.osi0;
import l.qib0;
import l.roj0;
import l.sle;
import l.tzb0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.ya5;
import l.ym2;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class EditProfileGameImageView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f1920a;

    /* JADX INFO: renamed from: b */
    public VFrame f1921b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1922c;

    /* JADX INFO: renamed from: d */
    public VImage f1923d;

    /* JADX INFO: renamed from: e */
    public Act f1924e;

    /* JADX INFO: renamed from: f */
    public String f1925f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0166b f1926g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView$a */
    public class C0165a extends ym2 {
        public C0165a() {
        }

        /* JADX INFO: renamed from: c */
        public void m3464c(String str, Throwable th) {
            super.c(str, th);
            if (c30.f(EditProfileGameImageView.this.f1924e)) {
                EditProfileGameImageView.this.f1924e.progressDismiss();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m3465h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (c30.f(EditProfileGameImageView.this.f1924e)) {
                EditProfileGameImageView.this.f1924e.progressDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView$b */
    public interface InterfaceC0166b {
        /* JADX INFO: renamed from: a */
        void mo3466a(String str);

        /* JADX INFO: renamed from: b */
        void mo3467b(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditProfileGameImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(n6c0.v0, (ViewGroup) this, true);
        m3459F(getChildAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m3449K(Act act, View view) {
        if (NullChecker.a(this.f1925f)) {
            CoreModule.P().a().a0(act, this.f1925f, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m3450L(View view) {
        xdl0.M(this.f1920a, true);
        xdl0.M(this.f1921b, false);
        qib0.G.o(this.f1922c);
        if (NullChecker.a(this.f1926g)) {
            this.f1926g.mo3467b(this.f1925f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m3451M(String str) {
        if (NullChecker.a(this.f1926g)) {
            this.f1926g.mo3466a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m3452N(Throwable th) {
        if (c30.f(this.f1924e)) {
            this.f1924e.progressDismiss();
        }
        if (NullChecker.a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            osi0.g(th.getMessage());
        } else {
            osi0.g("上传失败");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3453p(Act act, View view) {
        act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(15).build()), 786);
        act.overridePendingTransition(tzb0.h, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ c m3455u(List list) throws IllegalPictureException {
        if (vwb.J(list) || !(list.get(0) instanceof Picture)) {
            throw new IllegalPictureException("上传图片失败");
        }
        return c.just(((Media) ((Media) list.get(0)).cover()).url);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ roj0 m3456v(xaj0 xaj0Var) throws IllegalPictureException {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: F */
    public final void m3459F(View view) {
        sle.a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public void m3460G(final Act act, InterfaceC0166b interfaceC0166b) {
        this.f1924e = act;
        this.f1926g = interfaceC0166b;
        xdl0.E0(this.f1920a, new View.OnClickListener() { // from class: l.ple
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileGameImageView.m3453p(act, view);
            }
        });
        xdl0.E0(this.f1922c, new View.OnClickListener() { // from class: l.qle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18083a.m3449K(act, view);
            }
        });
        xdl0.E0(this.f1923d, new View.OnClickListener() { // from class: l.rle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18600a.m3450L(view);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m3461O(@NonNull Picture picture) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        this.f1924e.progress(R.string.R0);
        this.f1924e.duringCreated(qib0.R.b(Uri.parse(((Media) picture).url).getPath()).map(new w9j() { // from class: l.kle
            public final Object call(Object obj) {
                return EditProfileGameImageView.m3456v((xaj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.lle
            public final Object call(Object obj) {
                return ya5.L(arrayList, "profile", "user-profile", (Map) null, UploadSource.get("profile"));
            }
        }).flatMap(new w9j() { // from class: l.mle
            public final Object call(Object obj) {
                return EditProfileGameImageView.m3455u((List) obj);
            }
        })).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.nle
            public final void call(Object obj) {
                this.f16096a.m3451M((String) obj);
            }
        }, new e30() { // from class: l.ole
            public final void call(Object obj) {
                this.f16691a.m3452N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m3462P(String str) {
        this.f1925f = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            qib0.G.M0(this.f1922c, this.f1925f, new C0165a());
        }
        xdl0.M(this.f1920a, zIsEmpty);
        xdl0.M(this.f1921b, z);
    }

    /* JADX INFO: renamed from: Q */
    public void m3463Q() {
        this.f1920a.performClick();
    }

    public String getImageUrl() {
        return this.f1925f;
    }

    public EditProfileGameImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditProfileGameImageView(Context context) {
        this(context, null);
    }
}
