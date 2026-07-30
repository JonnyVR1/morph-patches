package com.p000p1.mobile.putong.account.p002ui.mediapicker.impl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.core.glcore.util.BitmapPrivateProtocolUtil;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.account.AccountNewCropperAct;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.AccountMediaPickerBaseAct;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import l.e30;
import l.iti;
import l.j760;
import l.k9j;
import l.lsi0;
import l.nqh0;
import l.rhi;
import l.t95;
import l.vwb;
import l.x9g0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.C0655du;
import p006l.C0814ht;
import p006l.C0905ju;
import p006l.aml;
import p006l.h7n;
import p006l.qib0;
import p006l.tqx;
import p006l.wc40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMediaPickerAct extends AccountMediaPickerBaseAct implements AccountMediaPickerBaseAct.InterfaceC0097a, e30<nqh0>, aml {

    /* JADX INFO: renamed from: B */
    public static int f1001B = 1;

    /* JADX INFO: renamed from: C */
    public static int f1002C;

    /* JADX INFO: renamed from: A */
    public C0905ju f1003A;

    /* JADX INFO: renamed from: l */
    public int f1004l;

    /* JADX INFO: renamed from: m */
    public boolean f1005m;

    /* JADX INFO: renamed from: n */
    public boolean f1006n;

    /* JADX INFO: renamed from: o */
    public boolean f1007o;

    /* JADX INFO: renamed from: p */
    public boolean f1008p;

    /* JADX INFO: renamed from: q */
    public boolean f1009q;

    /* JADX INFO: renamed from: r */
    public boolean f1010r;

    /* JADX INFO: renamed from: s */
    public int f1011s;

    /* JADX INFO: renamed from: t */
    public String f1012t;

    /* JADX INFO: renamed from: u */
    public Gender f1013u;

    /* JADX INFO: renamed from: v */
    public String f1014v;

    /* JADX INFO: renamed from: w */
    public boolean f1015w;

    /* JADX INFO: renamed from: x */
    public int f1016x = 3;

    /* JADX INFO: renamed from: y */
    public ArrayList<Media> f1017y = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    public C0655du f1018z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.mediapicker.impl.AccountMediaPickerAct$a */
    public static class C0098a implements tqx {
        @Override // p006l.tqx
        /* JADX INFO: renamed from: a */
        public C0125a mo1097a(PutongAct putongAct) {
            return new C0814ht(putongAct);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m1085a2(Context context, int i, boolean z, boolean z2, boolean z3) {
        return m1087c2(context, i, z, z2, z3, null, f1002C, false);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m1086b2(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        return m1087c2(context, i, z, z2, z3, str, f1002C, false);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m1087c2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return m1088d2(context, i, z, z2, z3, str, i2, z4, false, null);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m1088d2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender) {
        return m1089e2(context, i, z, z2, z3, str, i2, z4, z5, gender, "");
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m1089e2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2) {
        return m1090g2(context, i, z, z2, z3, str, i2, z4, z5, gender, str2, h7n.m16063c());
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m1090g2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2, boolean z6) {
        if ((i != 1 && z3) || (z2 && i2 == f1001B)) {
            x9g0.a();
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) AccountMediaPickerAct.class);
        intent.putExtra("imageCount", i);
        intent.putExtra("hasCamera", z);
        intent.putExtra("hasVideo", z2);
        intent.putExtra("cropIfSingle", z3);
        intent.putExtra("videoDefault", z4);
        intent.putExtra("from", str);
        intent.putExtra("source", i2);
        intent.putExtra("isFloatLayerExp", z5);
        intent.putExtra("gender", (Serializable) gender);
        intent.putExtra("title", str2);
        intent.putExtra("cropNewProfilePicture", z6);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.mediapicker.AccountMediaPickerBaseAct.InterfaceC0097a
    /* JADX INFO: renamed from: b */
    public void mo1074b(iti itiVar) {
        this.f1018z.m14269D0(itiVar);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void cropImage(String str) {
        if (this.f1009q) {
            startActivityForResult(AccountNewCropperAct.m278F1(((Act) this).act, str, true), 24576);
        } else {
            super.cropImage(str);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void ensureMediaPickerHandler() {
        if (this.mediaPickerHandler == null) {
            this.mediaPickerHandler = PutongAct.defaultMediaPickerHandlerFactory.mo1097a(this);
        }
    }

    @Override // p006l.aml
    /* JADX INFO: renamed from: f */
    public void mo1091f() {
    }

    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public void call(nqh0 nqh0Var) {
        this.f986e = nqh0Var;
    }

    @Override // p006l.aml
    /* JADX INFO: renamed from: i */
    public boolean mo1093i(Media media, boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m1094i2(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.w(R$string.f131U);
        } else {
            cropImage(str);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1003A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1018z = new C0655du(this);
        C0905ju c0905ju = new C0905ju(this);
        this.f1003A = c0905ju;
        this.f1018z.C(c0905ju);
        this.f1018z.m14267A0(AccountMediaPickerBaseAct.f981i);
        this.f1018z.m14268C0(AccountMediaPickerBaseAct.f982j);
        this.f1018z.m14283V0(this.f1017y);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f1018z.m14286a0();
    }

    @Override // p006l.aml
    /* JADX INFO: renamed from: j */
    public void mo1095j(View view, Media media) {
        if (this.f1004l == 1 && this.f1007o && !(media instanceof Video)) {
            if (this.f1011s == f1001B) {
                qib0.f19782G.i(media.url, new e30() { // from class: l.dt
                    public final void call(Object obj) {
                        this.f10557a.m1094i2((String) obj);
                    }
                });
            } else if (h7n.m16063c() && TextUtils.equals(this.f1012t, "from_sign_up")) {
                AccountModule.m26F().openLoginUiOptCropAct(((Act) this).act, rhi.z(media.url), true);
            } else {
                cropImage(rhi.z(media.url));
            }
        }
    }

    @Override // p006l.aml
    /* JADX INFO: renamed from: k */
    public ArrayList<Media> mo1096k() {
        return this.f1017y;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        if (i != 293) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            return;
        }
        String stringExtra = intent.getStringExtra("select_image_path");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(stringExtra);
        StringBuilder sb = new StringBuilder();
        sb.append(k9j.I());
        String str = File.separator;
        sb.append(str);
        sb.append("signuptemp");
        String string = sb.toString();
        File file = new File(string);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str2 = string + str + "temp.png";
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str2));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                AccountModule.m26F().openLoginUiOptCropAct(((Act) this).act, str2, this.f1009q);
                t95.b(fileOutputStream2);
            } catch (FileNotFoundException unused) {
                fileOutputStream = fileOutputStream2;
                t95.b(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                t95.b(fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void onBackPressed() {
        if ("force_select_image".equals(this.f1012t)) {
            return;
        }
        if (!AccountModule.m26F().signedIn_()) {
            zvf0.u("e_picture_albums_back_button", "p_picture_selection_view", new j760[]{vwb.Y("signup_source", AccountModule.m26F().getSignUpType()), vwb.Y("phone_num", AccountModule.m26F().getSignUpData().phoneNumber)});
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCropImageResult(String str) {
        Picture picture = new Picture();
        ((Media) picture).status = MediaLocalStatus.get("preprocessed");
        ((Media) picture).url = rhi.B(str);
        if (wc40.m26351c()) {
            ((Media) picture).mediaType = "image/webp";
        } else {
            ((Media) picture).mediaType = "image/jpeg";
        }
        Intent intent = new Intent();
        intent.putExtra(AccountMediaPickerBaseAct.f980h, vwb.f0(new Picture[]{picture}));
        intent.putExtra("from", this.f1012t);
        setResult(-1, intent);
        finish();
    }

    public void onStartLifecycle() {
        if ("p_picture_selection_view".equals(pageId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("signup_source", AccountModule.m26F().getSignUpType());
                this.pageHelper.o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_picture_selection_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        this.f1004l = getIntent().getIntExtra("imageCount", 1);
        this.f1005m = getIntent().getBooleanExtra("hasCamera", false);
        this.f1006n = getIntent().getBooleanExtra("hasVideo", false);
        this.f1007o = getIntent().getBooleanExtra("cropIfSingle", false);
        this.f1008p = getIntent().getBooleanExtra("videoDefault", false);
        this.f1012t = getIntent().getStringExtra("from");
        this.f1011s = getIntent().getIntExtra("source", f1002C);
        this.f1015w = getIntent().getBooleanExtra("isFloatLayerExp", false);
        this.f1013u = getIntent().getSerializableExtra("gender");
        this.f1014v = (String) getIntent().getSerializableExtra("title");
        this.f1009q = getIntent().getBooleanExtra("cropNewProfilePicture", false);
        this.f1010r = getIntent().getBooleanExtra("useInnerCamera", false);
        if (this.f1011s != f1001B) {
            super.preCreateView(bundle);
        }
        int i = this.f1004l;
        nqh0 nqh0Var = i > 0 ? this.f984c : this.f985d;
        this.f986e = nqh0Var;
        this.f1018z.m14270E0(i, this.f1005m, this.f1006n, this.f1007o, this.f1008p, this.f1011s, this.f1012t, this.f1013u, this.f1014v, this.f1015w, nqh0Var, this.f1016x, this.f1010r);
        this.f1018z.m14284W0(getIntent().getStringExtra("tips_message")).m14285X0(getIntent().getBooleanExtra("show_simple_avatar", true));
        this.f1003A.m17827O(this.f984c, this.f985d, this.f986e);
        this.f1003A.m17824L(this);
        this.pageHelper.q(pageId());
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        if (AccountModule.m26F().mo58a().mo16297a() && TextUtils.equals(this.f1012t, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientActionBar();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (AccountModule.m26F().mo58a().mo16297a() && TextUtils.equals(this.f1012t, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
