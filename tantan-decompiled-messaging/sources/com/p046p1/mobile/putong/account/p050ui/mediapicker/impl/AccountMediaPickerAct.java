package com.p046p1.mobile.putong.account.p050ui.mediapicker.impl;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.account.AccountNewCropperAct;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.AccountMediaPickerBaseAct;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.C16470du;
import p149l.C17387ht;
import p149l.C17860ju;
import p149l.aml;
import p149l.e30;
import p149l.h7n;
import p149l.iti;
import p149l.k9j;
import p149l.lsi0;
import p149l.nqh0;
import p149l.qib0;
import p149l.rhi;
import p149l.t95;
import p149l.tqx;
import p149l.vwb;
import p149l.wc40;
import p149l.x9g0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMediaPickerAct extends AccountMediaPickerBaseAct implements AccountMediaPickerBaseAct.InterfaceC4671a, e30<nqh0>, aml {

    /* JADX INFO: renamed from: B */
    public static int f17012B = 1;

    /* JADX INFO: renamed from: C */
    public static int f17013C;

    /* JADX INFO: renamed from: A */
    public C17860ju f17014A;

    /* JADX INFO: renamed from: l */
    public int f17015l;

    /* JADX INFO: renamed from: m */
    public boolean f17016m;

    /* JADX INFO: renamed from: n */
    public boolean f17017n;

    /* JADX INFO: renamed from: o */
    public boolean f17018o;

    /* JADX INFO: renamed from: p */
    public boolean f17019p;

    /* JADX INFO: renamed from: q */
    public boolean f17020q;

    /* JADX INFO: renamed from: r */
    public boolean f17021r;

    /* JADX INFO: renamed from: s */
    public int f17022s;

    /* JADX INFO: renamed from: t */
    public String f17023t;

    /* JADX INFO: renamed from: u */
    public Gender f17024u;

    /* JADX INFO: renamed from: v */
    public String f17025v;

    /* JADX INFO: renamed from: w */
    public boolean f17026w;

    /* JADX INFO: renamed from: x */
    public int f17027x = 3;

    /* JADX INFO: renamed from: y */
    public ArrayList<Media> f17028y = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    public C16470du f17029z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.mediapicker.impl.AccountMediaPickerAct$a */
    public static class C4672a implements tqx {
        @Override // p149l.tqx
        /* JADX INFO: renamed from: a */
        public C4699a mo29191a(PutongAct putongAct) {
            return new C17387ht(putongAct);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m29179a2(Context context, int i, boolean z, boolean z2, boolean z3) {
        return m29181c2(context, i, z, z2, z3, null, f17013C, false);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m29180b2(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        return m29181c2(context, i, z, z2, z3, str, f17013C, false);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m29181c2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return m29182d2(context, i, z, z2, z3, str, i2, z4, false, null);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m29182d2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender) {
        return m29183e2(context, i, z, z2, z3, str, i2, z4, z5, gender, "");
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m29183e2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2) {
        return m29184g2(context, i, z, z2, z3, str, i2, z4, z5, gender, str2, h7n.m129754c());
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m29184g2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2, boolean z6) {
        if ((i != 1 && z3) || (z2 && i2 == f17012B)) {
            x9g0.m207497a();
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

    @Override // com.p046p1.mobile.putong.account.p050ui.mediapicker.AccountMediaPickerBaseAct.InterfaceC4671a
    /* JADX INFO: renamed from: b */
    public void mo29168b(iti itiVar) {
        this.f17029z.m113642D0(itiVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void cropImage(String str) {
        if (this.f17020q) {
            startActivityForResult(AccountNewCropperAct.m28383F1(this.act, str, true), Act.CROP_IMAGE);
        } else {
            super.cropImage(str);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void ensureMediaPickerHandler() {
        if (this.mediaPickerHandler == null) {
            this.mediaPickerHandler = PutongAct.defaultMediaPickerHandlerFactory.mo29191a(this);
        }
    }

    @Override // p149l.aml
    /* JADX INFO: renamed from: f */
    public void mo29185f() {
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public void call(nqh0 nqh0Var) {
        this.f16997e = nqh0Var;
    }

    @Override // p149l.aml
    /* JADX INFO: renamed from: i */
    public boolean mo29187i(Media media, boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m29188i2(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f16142U);
        } else {
            cropImage(str);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17014A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17029z = new C16470du(this);
        C17860ju c17860ju = new C17860ju(this);
        this.f17014A = c17860ju;
        this.f17029z.mo51532C(c17860ju);
        this.f17029z.m113640A0(AccountMediaPickerBaseAct.f16992i);
        this.f17029z.m113641C0(AccountMediaPickerBaseAct.f16993j);
        this.f17029z.m113656V0(this.f17028y);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17029z.mo39470a0();
    }

    @Override // p149l.aml
    /* JADX INFO: renamed from: j */
    public void mo29189j(View view, Media media) {
        if (this.f17015l == 1 && this.f17018o && !(media instanceof Video)) {
            if (this.f17022s == f17012B) {
                qib0.f154691G.m184720i(media.url, new e30() { // from class: l.dt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f87800a.m29188i2((String) obj);
                    }
                });
            } else if (h7n.m129754c() && TextUtils.equals(this.f17023t, "from_sign_up")) {
                AccountModule.m28131F().openLoginUiOptCropAct(this.act, rhi.m179382z(media.url), true);
            } else {
                cropImage(rhi.m179382z(media.url));
            }
        }
    }

    @Override // p149l.aml
    /* JADX INFO: renamed from: k */
    public ArrayList<Media> mo29190k() {
        return this.f17028y;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
        sb.append(k9j.m145077I());
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
                AccountModule.m28131F().openLoginUiOptCropAct(this.act, str2, this.f17020q);
                t95.m187604b(fileOutputStream2);
            } catch (FileNotFoundException unused) {
                fileOutputStream = fileOutputStream2;
                t95.m187604b(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                t95.m187604b(fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("force_select_image".equals(this.f17023t)) {
            return;
        }
        if (!AccountModule.m28131F().signedIn_()) {
            zvf0.m220399u("e_picture_albums_back_button", "p_picture_selection_view", vwb.m200311Y("signup_source", AccountModule.m28131F().getSignUpType()), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, AccountModule.m28131F().getSignUpData().phoneNumber));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        picture.url = rhi.m179355B(str);
        if (wc40.m202626c()) {
            picture.mediaType = "image/webp";
        } else {
            picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        Intent intent = new Intent();
        intent.putExtra(AccountMediaPickerBaseAct.f16991h, vwb.m200324f0(picture));
        intent.putExtra("from", this.f17023t);
        setResult(-1, intent);
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        if ("p_picture_selection_view".equals(pageId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("signup_source", AccountModule.m28131F().getSignUpType());
                this.pageHelper.m109039o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_picture_selection_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f17015l = getIntent().getIntExtra("imageCount", 1);
        this.f17016m = getIntent().getBooleanExtra("hasCamera", false);
        this.f17017n = getIntent().getBooleanExtra("hasVideo", false);
        this.f17018o = getIntent().getBooleanExtra("cropIfSingle", false);
        this.f17019p = getIntent().getBooleanExtra("videoDefault", false);
        this.f17023t = getIntent().getStringExtra("from");
        this.f17022s = getIntent().getIntExtra("source", f17013C);
        this.f17026w = getIntent().getBooleanExtra("isFloatLayerExp", false);
        this.f17024u = (Gender) getIntent().getSerializableExtra("gender");
        this.f17025v = (String) getIntent().getSerializableExtra("title");
        this.f17020q = getIntent().getBooleanExtra("cropNewProfilePicture", false);
        this.f17021r = getIntent().getBooleanExtra("useInnerCamera", false);
        if (this.f17022s != f17012B) {
            super.preCreateView(bundle);
        }
        int i = this.f17015l;
        nqh0 nqh0Var = i > 0 ? this.f16995c : this.f16996d;
        this.f16997e = nqh0Var;
        this.f17029z.m113643E0(i, this.f17016m, this.f17017n, this.f17018o, this.f17019p, this.f17022s, this.f17023t, this.f17024u, this.f17025v, this.f17026w, nqh0Var, this.f17027x, this.f17021r);
        this.f17029z.m113657W0(getIntent().getStringExtra("tips_message")).m113658X0(getIntent().getBooleanExtra("show_simple_avatar", true));
        this.f17014A.m143199O(this.f16995c, this.f16996d, this.f16997e);
        this.f17014A.m143196L(this);
        this.pageHelper.m109041q(pageId());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        if (AccountModule.m28131F().mo28163a().mo132031a() && TextUtils.equals(this.f17023t, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientActionBar();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (AccountModule.m28131F().mo28163a().mo132031a() && TextUtils.equals(this.f17023t, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
