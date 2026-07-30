package com.p051p1.mobile.putong.core.p058ui.profile.exp;

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
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView;
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
import p153l.kec0;
import p153l.psd0;
import p153l.qcj;
import p153l.qim;
import p153l.r1j0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w20;
import p153l.x7c0;
import p153l.xef;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditProfileUploadImageView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f33990a;

    /* JADX INFO: renamed from: b */
    public VFrame f33991b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33992c;

    /* JADX INFO: renamed from: d */
    public VImage f33993d;

    /* JADX INFO: renamed from: e */
    public Act f33994e;

    /* JADX INFO: renamed from: f */
    public String f33995f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8793b f33996g;

    /* JADX INFO: renamed from: h */
    public boolean f33997h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView$a */
    public class C8792a extends fn2 {
        public C8792a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            if (!ExpEditProfileUploadImageView.this.f33997h && w20.m204491f(ExpEditProfileUploadImageView.this.f33994e)) {
                ExpEditProfileUploadImageView.this.f33994e.progressDismiss();
            }
            ExpEditProfileUploadImageView.this.f33997h = true;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (!ExpEditProfileUploadImageView.this.f33997h && w20.m204491f(ExpEditProfileUploadImageView.this.f33994e)) {
                ExpEditProfileUploadImageView.this.f33994e.progressDismiss();
            }
            ExpEditProfileUploadImageView.this.f33997h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView$b */
    public interface InterfaceC8793b {
        /* JADX INFO: renamed from: a */
        void mo52125a(String str);

        /* JADX INFO: renamed from: b */
        void mo52126b(String str);
    }

    public ExpEditProfileUploadImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(kec0.f125369D2, (ViewGroup) this, true);
        m52117K(getChildAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m52110N(View view) {
        bnl0.m105524M(this.f33990a, true);
        bnl0.m105524M(this.f33991b, false);
        uqb0.f180374G.m98798o(this.f33992c);
        if (NullChecker.m82486a(this.f33996g)) {
            this.f33996g.mo52126b(this.f33995f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ uxj0 m52111p(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C22421c m52115w(List list) {
        if (jyb.m147479J(list) || !(list.get(0) instanceof Picture)) {
            throw new IllegalPictureException("上传图片失败");
        }
        return C22421c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m52116z(Act act, int i, View view) {
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(i).build()), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(x7c0.f192710y, 0);
    }

    /* JADX INFO: renamed from: K */
    public final void m52117K(View view) {
        xef.m210675a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m52118L(final Act act, final int i, InterfaceC8793b interfaceC8793b) {
        this.f33994e = act;
        this.f33996g = interfaceC8793b;
        bnl0.m105509E0(this.f33990a, new View.OnClickListener() { // from class: l.uef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpEditProfileUploadImageView.m52116z(act, i, view);
            }
        });
        bnl0.m105509E0(this.f33992c, new View.OnClickListener() { // from class: l.vef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183761a.m52119M(act, view);
            }
        });
        bnl0.m105509E0(this.f33993d, new View.OnClickListener() { // from class: l.wef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188691a.m52110N(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m52119M(Act act, View view) {
        if (NullChecker.m82486a(this.f33995f)) {
            CoreModule.m30933P().m143405a().mo180435a0(act, this.f33995f, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m52120O(String str) {
        if (NullChecker.m82486a(this.f33996g)) {
            this.f33996g.mo52125a(str);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m52121P(Throwable th) {
        if (w20.m204491f(this.f33994e)) {
            this.f33994e.progressDismiss();
        }
        if (NullChecker.m82486a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            r1j0.m179420g(th.getMessage());
        } else {
            r1j0.m179420g("上传失败");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m52122Q(@NonNull Picture picture) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        this.f33994e.progress(R$string.f18632L5);
        this.f33994e.duringCreated(uqb0.f180386R.m184739b(Uri.parse(picture.url).getPath()).map(new qcj() { // from class: l.pef
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpEditProfileUploadImageView.m52111p((bkj0) obj);
            }
        }).flatMap(new qcj() { // from class: l.qef
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214983L(arrayList, "profile", "user-profile", null, UploadSource.get("profile"));
            }
        }).flatMap(new qcj() { // from class: l.ref
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpEditProfileUploadImageView.m52115w((List) obj);
            }
        })).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.sef
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167611a.m52120O((String) obj);
            }
        }, new y20() { // from class: l.tef
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173808a.m52121P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m52123R(String str) {
        this.f33995f = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        this.f33997h = false;
        if (!zIsEmpty) {
            uqb0.f180374G.m127117M0(this.f33992c, this.f33995f, new C8792a());
        }
        bnl0.m105524M(this.f33990a, zIsEmpty);
        bnl0.m105524M(this.f33991b, z);
    }

    /* JADX INFO: renamed from: S */
    public void m52124S() {
        this.f33990a.performClick();
    }

    public String getImageUrl() {
        return this.f33995f;
    }

    public ExpEditProfileUploadImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpEditProfileUploadImageView(Context context) {
        this(context, null);
    }
}
