package com.p046p1.mobile.putong.core.p053ui.profile.exp;

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
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView;
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
import p149l.f6c0;
import p149l.mkd0;
import p149l.ngm;
import p149l.osi0;
import p149l.qib0;
import p149l.rdf;
import p149l.roj0;
import p149l.rzb0;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditProfileUploadImageView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f33142a;

    /* JADX INFO: renamed from: b */
    public VFrame f33143b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33144c;

    /* JADX INFO: renamed from: d */
    public VImage f33145d;

    /* JADX INFO: renamed from: e */
    public Act f33146e;

    /* JADX INFO: renamed from: f */
    public String f33147f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8630b f33148g;

    /* JADX INFO: renamed from: h */
    public boolean f33149h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView$a */
    public class C8629a extends ym2 {
        public C8629a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            if (!ExpEditProfileUploadImageView.this.f33149h && c30.m104964f(ExpEditProfileUploadImageView.this.f33146e)) {
                ExpEditProfileUploadImageView.this.f33146e.progressDismiss();
            }
            ExpEditProfileUploadImageView.this.f33149h = true;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (!ExpEditProfileUploadImageView.this.f33149h && c30.m104964f(ExpEditProfileUploadImageView.this.f33146e)) {
                ExpEditProfileUploadImageView.this.f33146e.progressDismiss();
            }
            ExpEditProfileUploadImageView.this.f33149h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView$b */
    public interface InterfaceC8630b {
        /* JADX INFO: renamed from: a */
        void mo50942a(String str);

        /* JADX INFO: renamed from: b */
        void mo50943b(String str);
    }

    public ExpEditProfileUploadImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(f6c0.f95317D2, (ViewGroup) this, true);
        m50934K(getChildAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m50927N(View view) {
        xdl0.m208344M(this.f33142a, true);
        xdl0.m208344M(this.f33143b, false);
        qib0.f154691G.m184725o(this.f33144c);
        if (NullChecker.m81303a(this.f33148g)) {
            this.f33148g.mo50943b(this.f33147f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ roj0 m50928p(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C22306c m50932w(List list) {
        if (vwb.m200296J(list) || !(list.get(0) instanceof Picture)) {
            throw new IllegalPictureException("上传图片失败");
        }
        return C22306c.just(((Media) list.get(0)).cover().url);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m50933z(Act act, int i, View view) {
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(i).build()), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(rzb0.f161653y, 0);
    }

    /* JADX INFO: renamed from: K */
    public final void m50934K(View view) {
        rdf.m178961a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m50935L(final Act act, final int i, InterfaceC8630b interfaceC8630b) {
        this.f33146e = act;
        this.f33148g = interfaceC8630b;
        xdl0.m208329E0(this.f33142a, new View.OnClickListener() { // from class: l.odf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpEditProfileUploadImageView.m50933z(act, i, view);
            }
        });
        xdl0.m208329E0(this.f33144c, new View.OnClickListener() { // from class: l.pdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148298a.m50936M(act, view);
            }
        });
        xdl0.m208329E0(this.f33145d, new View.OnClickListener() { // from class: l.qdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153915a.m50927N(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m50936M(Act act, View view) {
        if (NullChecker.m81303a(this.f33147f)) {
            CoreModule.m29935P().m94651a().mo158343a0(act, this.f33147f, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m50937O(String str) {
        if (NullChecker.m81303a(this.f33148g)) {
            this.f33148g.mo50942a(str);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m50938P(Throwable th) {
        if (c30.m104964f(this.f33146e)) {
            this.f33146e.progressDismiss();
        }
        if (NullChecker.m81303a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            osi0.m165783g(th.getMessage());
        } else {
            osi0.m165783g("上传失败");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m50939Q(@NonNull Picture picture) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        this.f33146e.progress(R$string.f17842J5);
        this.f33146e.duringCreated(qib0.f154703R.m94726b(Uri.parse(picture.url).getPath()).map(new w9j() { // from class: l.jdf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpEditProfileUploadImageView.m50928p((xaj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.kdf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213796L(arrayList, "profile", "user-profile", null, UploadSource.get("profile"));
            }
        }).flatMap(new w9j() { // from class: l.ldf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpEditProfileUploadImageView.m50932w((List) obj);
            }
        })).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.mdf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133235a.m50937O((String) obj);
            }
        }, new e30() { // from class: l.ndf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138281a.m50938P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m50940R(String str) {
        this.f33147f = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        this.f33149h = false;
        if (!zIsEmpty) {
            qib0.f154691G.m102333M0(this.f33144c, this.f33147f, new C8629a());
        }
        xdl0.m208344M(this.f33142a, zIsEmpty);
        xdl0.m208344M(this.f33143b, z);
    }

    /* JADX INFO: renamed from: S */
    public void m50941S() {
        this.f33142a.performClick();
    }

    public String getImageUrl() {
        return this.f33147f;
    }

    public ExpEditProfileUploadImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpEditProfileUploadImageView(Context context) {
        this(context, null);
    }
}
