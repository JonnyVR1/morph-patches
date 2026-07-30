package com.p051p1.mobile.putong.account.p055ui.mediapicker.impl;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.account.AccountNewCropperAct;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.AccountMediaPickerBaseAct;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.C16112bt;
import p153l.C16621du;
import p153l.C21443xt;
import p153l.ecj;
import p153l.ewi;
import p153l.fig0;
import p153l.h9n;
import p153l.i4g0;
import p153l.jyb;
import p153l.kl40;
import p153l.mol;
import p153l.o1j0;
import p153l.oki;
import p153l.qzx;
import p153l.ua5;
import p153l.uqb0;
import p153l.uyh0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMediaPickerAct extends AccountMediaPickerBaseAct implements AccountMediaPickerBaseAct.InterfaceC4822a, y20<uyh0>, mol {

    /* JADX INFO: renamed from: B */
    public static int f17731B = 1;

    /* JADX INFO: renamed from: C */
    public static int f17732C;

    /* JADX INFO: renamed from: A */
    public C16621du f17733A;

    /* JADX INFO: renamed from: l */
    public int f17734l;

    /* JADX INFO: renamed from: m */
    public boolean f17735m;

    /* JADX INFO: renamed from: n */
    public boolean f17736n;

    /* JADX INFO: renamed from: o */
    public boolean f17737o;

    /* JADX INFO: renamed from: p */
    public boolean f17738p;

    /* JADX INFO: renamed from: q */
    public boolean f17739q;

    /* JADX INFO: renamed from: r */
    public boolean f17740r;

    /* JADX INFO: renamed from: s */
    public int f17741s;

    /* JADX INFO: renamed from: t */
    public String f17742t;

    /* JADX INFO: renamed from: u */
    public Gender f17743u;

    /* JADX INFO: renamed from: v */
    public String f17744v;

    /* JADX INFO: renamed from: w */
    public boolean f17745w;

    /* JADX INFO: renamed from: x */
    public int f17746x = 3;

    /* JADX INFO: renamed from: y */
    public ArrayList<Media> f17747y = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    public C21443xt f17748z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.mediapicker.impl.AccountMediaPickerAct$a */
    public static class C4823a implements qzx {
        @Override // p153l.qzx
        /* JADX INFO: renamed from: a */
        public C4850a mo30189a(PutongAct putongAct) {
            return new C16112bt(putongAct);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m30177b2(Context context, int i, boolean z, boolean z2, boolean z3) {
        return m30179d2(context, i, z, z2, z3, null, f17732C, false);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m30178c2(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        return m30179d2(context, i, z, z2, z3, str, f17732C, false);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m30179d2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return m30180e2(context, i, z, z2, z3, str, i2, z4, false, null);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m30180e2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender) {
        return m30181g2(context, i, z, z2, z3, str, i2, z4, z5, gender, "");
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m30181g2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2) {
        return m30182h2(context, i, z, z2, z3, str, i2, z4, z5, gender, str2, h9n.m134081c());
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m30182h2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2, boolean z6) {
        if ((i != 1 && z3) || (z2 && i2 == f17731B)) {
            fig0.m125680a();
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
        intent.putExtra("gender", gender);
        intent.putExtra("title", str2);
        intent.putExtra("cropNewProfilePicture", z6);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.mediapicker.AccountMediaPickerBaseAct.InterfaceC4822a
    /* JADX INFO: renamed from: b */
    public void mo30166b(ewi ewiVar) {
        this.f17748z.m213023D0(ewiVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void cropImage(String str) {
        if (this.f17739q) {
            startActivityForResult(AccountNewCropperAct.m29382G1(this.act, str, true), Act.CROP_IMAGE);
        } else {
            super.cropImage(str);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void ensureMediaPickerHandler() {
        if (this.mediaPickerHandler == null) {
            this.mediaPickerHandler = PutongAct.defaultMediaPickerHandlerFactory.mo30189a(this);
        }
    }

    @Override // p153l.mol
    /* JADX INFO: renamed from: f */
    public void mo30183f() {
    }

    @Override // p153l.mol
    /* JADX INFO: renamed from: i */
    public boolean mo30184i(Media media, boolean z) {
        return false;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public void call(uyh0 uyh0Var) {
        this.f17716e = uyh0Var;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17733A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17748z = new C21443xt(this);
        C16621du c16621du = new C16621du(this);
        this.f17733A = c16621du;
        this.f17748z.mo52715C(c16621du);
        this.f17748z.m213021A0(AccountMediaPickerBaseAct.f17711i);
        this.f17748z.m213022C0(AccountMediaPickerBaseAct.f17712j);
        this.f17748z.m213037V0(this.f17747y);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17748z.mo40473a0();
    }

    @Override // p153l.mol
    /* JADX INFO: renamed from: j */
    public void mo30186j(View view, Media media) {
        if (this.f17734l == 1 && this.f17737o && !(media instanceof Video)) {
            if (this.f17741s == f17731B) {
                uqb0.f180374G.m98793i(media.url, new y20() { // from class: l.xs
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f196052a.m30188k2((String) obj);
                    }
                });
            } else if (h9n.m134081c() && TextUtils.equals(this.f17742t, "from_sign_up")) {
                AccountModule.m29130F().openLoginUiOptCropAct(this.act, oki.m168038z(media.url), true);
            } else {
                cropImage(oki.m168038z(media.url));
            }
        }
    }

    @Override // p153l.mol
    /* JADX INFO: renamed from: k */
    public ArrayList<Media> mo30187k() {
        return this.f17747y;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m30188k2(String str) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f16861U);
        } else {
            cropImage(str);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
        sb.append(ecj.m120375I());
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
                AccountModule.m29130F().openLoginUiOptCropAct(this.act, str2, this.f17739q);
                ua5.m195158b(fileOutputStream2);
            } catch (FileNotFoundException unused) {
                fileOutputStream = fileOutputStream2;
                ua5.m195158b(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                ua5.m195158b(fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("force_select_image".equals(this.f17742t)) {
            return;
        }
        if (!AccountModule.m29130F().signedIn_()) {
            i4g0.m138523u("e_picture_albums_back_button", "p_picture_selection_view", jyb.m147494Y("signup_source", AccountModule.m29130F().getSignUpType()), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.m29130F().getSignUpData().phoneNumber));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        picture.url = oki.m168011B(str);
        if (kl40.m150345c()) {
            picture.mediaType = "image/webp";
        } else {
            picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        Intent intent = new Intent();
        intent.putExtra(AccountMediaPickerBaseAct.f17710h, jyb.m147507f0(picture));
        intent.putExtra("from", this.f17742t);
        setResult(-1, intent);
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        if ("p_picture_selection_view".equals(pageId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("signup_source", AccountModule.m29130F().getSignUpType());
                this.pageHelper.m152780o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_picture_selection_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f17734l = getIntent().getIntExtra("imageCount", 1);
        this.f17735m = getIntent().getBooleanExtra("hasCamera", false);
        this.f17736n = getIntent().getBooleanExtra("hasVideo", false);
        this.f17737o = getIntent().getBooleanExtra("cropIfSingle", false);
        this.f17738p = getIntent().getBooleanExtra("videoDefault", false);
        this.f17742t = getIntent().getStringExtra("from");
        this.f17741s = getIntent().getIntExtra("source", f17732C);
        this.f17745w = getIntent().getBooleanExtra("isFloatLayerExp", false);
        this.f17743u = (Gender) getIntent().getSerializableExtra("gender");
        this.f17744v = (String) getIntent().getSerializableExtra("title");
        this.f17739q = getIntent().getBooleanExtra("cropNewProfilePicture", false);
        this.f17740r = getIntent().getBooleanExtra("useInnerCamera", false);
        if (this.f17741s != f17731B) {
            super.preCreateView(bundle);
        }
        int i = this.f17734l;
        uyh0 uyh0Var = i > 0 ? this.f17714c : this.f17715d;
        this.f17716e = uyh0Var;
        this.f17748z.m213024E0(i, this.f17735m, this.f17736n, this.f17737o, this.f17738p, this.f17741s, this.f17742t, this.f17743u, this.f17744v, this.f17745w, uyh0Var, this.f17746x, this.f17740r);
        this.f17748z.m213038W0(getIntent().getStringExtra("tips_message")).m213039X0(getIntent().getBooleanExtra("show_simple_avatar", true));
        this.f17733A.m117931O(this.f17714c, this.f17715d, this.f17716e);
        this.f17733A.m117928L(this);
        this.pageHelper.m152782q(pageId());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        if (AccountModule.m29130F().mo29162a().mo105647a() && TextUtils.equals(this.f17742t, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientActionBar();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (AccountModule.m29130F().mo29162a().mo105647a() && TextUtils.equals(this.f17742t, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
