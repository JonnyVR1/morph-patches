package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
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
import l.f6c0;
import l.mkd0;
import l.ngm;
import l.osi0;
import l.qib0;
import l.rdf;
import l.roj0;
import l.rzb0;
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
public class ExpEditProfileUploadImageView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f964a;

    /* JADX INFO: renamed from: b */
    public VFrame f965b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f966c;

    /* JADX INFO: renamed from: d */
    public VImage f967d;

    /* JADX INFO: renamed from: e */
    public Act f968e;

    /* JADX INFO: renamed from: f */
    public String f969f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0055b f970g;

    /* JADX INFO: renamed from: h */
    public boolean f971h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView$a */
    public class C0054a extends ym2 {
        public C0054a() {
        }

        /* JADX INFO: renamed from: c */
        public void m1388c(String str, Throwable th) {
            super.c(str, th);
            if (!ExpEditProfileUploadImageView.this.f971h && c30.f(ExpEditProfileUploadImageView.this.f968e)) {
                ExpEditProfileUploadImageView.this.f968e.progressDismiss();
            }
            ExpEditProfileUploadImageView.this.f971h = true;
        }

        /* JADX INFO: renamed from: h */
        public void m1389h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (!ExpEditProfileUploadImageView.this.f971h && c30.f(ExpEditProfileUploadImageView.this.f968e)) {
                ExpEditProfileUploadImageView.this.f968e.progressDismiss();
            }
            ExpEditProfileUploadImageView.this.f971h = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView$b */
    public interface InterfaceC0055b {
        /* JADX INFO: renamed from: a */
        void mo1390a(String str);

        /* JADX INFO: renamed from: b */
        void mo1391b(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpEditProfileUploadImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(f6c0.D2, (ViewGroup) this, true);
        m1380K(getChildAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m1373N(View view) {
        xdl0.M(this.f964a, true);
        xdl0.M(this.f965b, false);
        qib0.G.o(this.f966c);
        if (NullChecker.a(this.f970g)) {
            this.f970g.mo1391b(this.f969f);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ roj0 m1374p(xaj0 xaj0Var) throws IllegalPictureException {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ c m1378w(List list) throws IllegalPictureException {
        if (vwb.J(list) || !(list.get(0) instanceof Picture)) {
            throw new IllegalPictureException("上传图片失败");
        }
        return c.just(((Media) ((Media) list.get(0)).cover()).url);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m1379z(Act act, int i, View view) {
        act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(i).build()), 786);
        act.overridePendingTransition(rzb0.y, 0);
    }

    /* JADX INFO: renamed from: K */
    public final void m1380K(View view) {
        rdf.a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m1381L(final Act act, final int i, InterfaceC0055b interfaceC0055b) {
        this.f968e = act;
        this.f970g = interfaceC0055b;
        xdl0.E0(this.f964a, new View.OnClickListener() { // from class: l.odf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpEditProfileUploadImageView.m1379z(act, i, view);
            }
        });
        xdl0.E0(this.f966c, new View.OnClickListener() { // from class: l.pdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17207a.m1382M(act, view);
            }
        });
        xdl0.E0(this.f967d, new View.OnClickListener() { // from class: l.qdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17942a.m1373N(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m1382M(Act act, View view) {
        if (NullChecker.a(this.f969f)) {
            CoreModule.P().a().a0(act, this.f969f, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m1383O(String str) {
        if (NullChecker.a(this.f970g)) {
            this.f970g.mo1390a(str);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m1384P(Throwable th) {
        if (c30.f(this.f968e)) {
            this.f968e.progressDismiss();
        }
        if (NullChecker.a(th) && (th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage())) {
            osi0.g(th.getMessage());
        } else {
            osi0.g("上传失败");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m1385Q(@NonNull Picture picture) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        this.f968e.progress(R.string.J5);
        this.f968e.duringCreated(qib0.R.b(Uri.parse(((Media) picture).url).getPath()).map(new w9j() { // from class: l.jdf
            public final Object call(Object obj) {
                return ExpEditProfileUploadImageView.m1374p((xaj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.kdf
            public final Object call(Object obj) {
                return ya5.L(arrayList, "profile", "user-profile", (Map) null, UploadSource.get("profile"));
            }
        }).flatMap(new w9j() { // from class: l.ldf
            public final Object call(Object obj) {
                return ExpEditProfileUploadImageView.m1378w((List) obj);
            }
        })).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.mdf
            public final void call(Object obj) {
                this.f15350a.m1383O((String) obj);
            }
        }, new e30() { // from class: l.ndf
            public final void call(Object obj) {
                this.f15961a.m1384P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m1386R(String str) {
        this.f969f = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        this.f971h = false;
        if (!zIsEmpty) {
            qib0.G.M0(this.f966c, this.f969f, new C0054a());
        }
        xdl0.M(this.f964a, zIsEmpty);
        xdl0.M(this.f965b, z);
    }

    /* JADX INFO: renamed from: S */
    public void m1387S() {
        this.f964a.performClick();
    }

    public String getImageUrl() {
        return this.f969f;
    }

    public ExpEditProfileUploadImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpEditProfileUploadImageView(Context context) {
        this(context, null);
    }
}
