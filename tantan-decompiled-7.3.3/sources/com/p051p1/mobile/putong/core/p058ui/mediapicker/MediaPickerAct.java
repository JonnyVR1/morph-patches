package com.p051p1.mobile.putong.core.p058ui.mediapicker;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.ewi;
import p153l.fig0;
import p153l.h9n;
import p153l.i4g0;
import p153l.jyb;
import p153l.kl40;
import p153l.lfc0;
import p153l.lyh0;
import p153l.o1j0;
import p153l.oki;
import p153l.pcj;
import p153l.pri0;
import p153l.qa00;
import p153l.r0y;
import p153l.syx;
import p153l.uqb0;
import p153l.uyh0;
import p153l.y20;
import p153l.yyl;
import p153l.z0y;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPickerAct extends MediaPickerBaseAct implements MediaPickerBaseAct.InterfaceC13290a, y20<uyh0>, yyl {

    /* JADX INFO: renamed from: C */
    public static int f31470C = 1;

    /* JADX INFO: renamed from: D */
    public static int f31471D;

    /* JADX INFO: renamed from: A */
    public r0y f31472A;

    /* JADX INFO: renamed from: B */
    public z0y f31473B;

    /* JADX INFO: renamed from: l */
    public int f31474l;

    /* JADX INFO: renamed from: m */
    public boolean f31475m;

    /* JADX INFO: renamed from: n */
    public boolean f31476n;

    /* JADX INFO: renamed from: o */
    public boolean f31477o;

    /* JADX INFO: renamed from: p */
    public boolean f31478p;

    /* JADX INFO: renamed from: q */
    public boolean f31479q;

    /* JADX INFO: renamed from: r */
    public int f31480r;

    /* JADX INFO: renamed from: s */
    public String f31481s;

    /* JADX INFO: renamed from: t */
    public Gender f31482t;

    /* JADX INFO: renamed from: u */
    public String f31483u;

    /* JADX INFO: renamed from: v */
    public boolean f31484v;

    /* JADX INFO: renamed from: x */
    public VText f31486x;

    /* JADX INFO: renamed from: y */
    public View f31487y;

    /* JADX INFO: renamed from: w */
    public int f31485w = 3;

    /* JADX INFO: renamed from: z */
    public ArrayList<Media> f31488z = new ArrayList<>();

    /* JADX INFO: renamed from: d2 */
    public static Intent m48965d2(Context context, int i, boolean z, boolean z2, boolean z3) {
        return m48967g2(context, i, z, z2, z3, null, f31471D, false);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m48966e2(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        return m48967g2(context, i, z, z2, z3, str, f31471D, false);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m48967g2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return m48968h2(context, i, z, z2, z3, str, i2, z4, false, null);
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m48968h2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender) {
        return m48969i2(context, i, z, z2, z3, str, i2, z4, z5, gender, "");
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m48969i2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2) {
        return m48970k2(context, i, z, z2, z3, str, i2, z4, z5, gender, str2, true);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m48970k2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
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
        if ((i == 1 || !z3) && !(z2 && i2 == f31470C)) {
            return intent;
        }
        fig0.m125680a();
        return null;
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m48971l2(Context context, syx syxVar) {
        if ((syxVar.f171323a != 1 && syxVar.f171326d) || (syxVar.f171325c && syxVar.f171328f == f31470C)) {
            fig0.m125680a();
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        intent.putExtras(syxVar.m188610a());
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    public static void m48972q2(View view, TextView textView, Act act, List<Media> list, boolean z) {
        pri0 pri0Var;
        if (NullChecker.m82486a(textView)) {
            if (list == null || list.size() == 0) {
                view.setEnabled(z);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            view.setEnabled(true);
            if (NullChecker.m82486a(CoreModule.f18264c)) {
                pri0Var = new pri0(list.size() + "", qa00.m175859d(20.0f), qa00.m175859d(14.0f), lyh0.m156283c(3), -1, pri0.f153790i, -2667209);
            } else {
                pri0Var = new pri0(list.size() + "", qa00.m175859d(20.0f), qa00.m175859d(14.0f), lyh0.m156283c(3), CoreModule.f18263b.getResources().getColor(c9c0.f80362O1), pri0.f153790i, -1);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(pri0Var, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(qa00.m175859d(8.0f));
        }
    }

    /* JADX INFO: renamed from: r2 */
    public static boolean m48973r2(Media media, boolean z, ArrayList<Media> arrayList, int i) {
        if (!z) {
            arrayList.remove(media);
            return true;
        }
        if (i == arrayList.size()) {
            if (media instanceof Video) {
                o1j0.m165634h(R$string.f19650si);
            } else {
                o1j0.m165634h(R$string.f19402ki);
            }
            return false;
        }
        if ((media instanceof Video) && arrayList.size() != 0) {
            o1j0.m165634h(R$string.f19650si);
            return false;
        }
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof Video)) {
            arrayList.add(media);
            return true;
        }
        o1j0.m165634h(R$string.f19650si);
        return false;
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: H */
    public int mo48974H() {
        return 0;
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: b */
    public void mo48975b(ewi ewiVar) {
        this.f31472A.m179311E0(ewiVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void cropImage(String str) {
        if (!this.f31479q) {
            super.cropImage(str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            CrashHelper.m82479c(new NullPointerException("image path is null"));
        }
        startActivityForResult(NewCropperAct.m37197J1(this.act, str, true, "from_change_anchor_cover".equals(this.f31481s)), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: f */
    public void mo48950f() {
        m48972q2(this.f31487y, this.f31486x, this, this.f31488z, false);
        this.f31472A.m179318W0(this.f31488z);
        this.f31472A.m179310D0();
    }

    /* JADX INFO: renamed from: i */
    public boolean mo48951i(Media media, boolean z) {
        boolean zM48973r2 = m48973r2(media, z, this.f31488z, this.f31474l);
        mo48950f();
        return zM48973r2;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31473B.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31472A = new r0y(this);
        z0y z0yVar = new z0y(this);
        this.f31473B = z0yVar;
        this.f31472A.mo52715C(z0yVar);
        this.f31472A.m179308A0(MediaPickerBaseAct.f55452i);
        this.f31472A.m179309C0(MediaPickerBaseAct.f55453j);
        this.f31472A.m179318W0(this.f31488z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31472A.mo40473a0();
    }

    /* JADX INFO: renamed from: j */
    public void mo48952j(View view, Media media) {
        if (this.f31480r != f31470C) {
            File file = new File(oki.m168038z(media.url));
            if (!file.canRead() || file.length() == 0) {
                return;
            }
        }
        if (this.f31474l != 1) {
            uyh0 uyh0Var = this.f55457e;
            ewi ewiVar = uyh0Var.f181619c;
            ArrayList<Media> arrayList = ewiVar == null ? (ArrayList) uyh0Var.f181617a.f184001a : (ArrayList) ewiVar.f96163c.f184001a;
            m48982u2(arrayList, this.f31488z, arrayList.indexOf(media));
            return;
        }
        if (!this.f31477o || (media instanceof Video)) {
            m48982u2(jyb.m147482M(media), null, 0);
            return;
        }
        if (this.f31480r == f31470C) {
            uqb0.f180374G.m98793i(media.url, new y20() { // from class: l.myx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139443a.m48978n2((String) obj);
                }
            });
            return;
        }
        if (CoreModule.m30929H().mo29162a().mo105647a() && TextUtils.equals(this.f31481s, "from_sign_up")) {
            CoreModule.m30929H().openLoginUiOptCropAct(this.act, oki.m168038z(media.url), this.f31479q);
        } else if (h9n.m134081c() && TextUtils.equals(this.f31481s, "from_sign_up")) {
            CoreModule.m30929H().openLoginUiOptCropAct(this.act, oki.m168038z(media.url), true);
        } else {
            cropImage(oki.m168038z(media.url));
        }
    }

    @Override // p153l.yyl
    /* JADX INFO: renamed from: k */
    public ArrayList<Media> mo48976k() {
        return this.f31488z;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: m2, reason: merged with bridge method [inline-methods] */
    public void call(uyh0 uyh0Var) {
        this.f55457e = uyh0Var;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m48978n2(String str) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f19636s4);
        } else {
            cropImage(str);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m48979o2(View view) {
        if (this.f31488z.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra(MediaPickerBaseAct.f55451h, this.f31488z);
            setResult(-1, intent);
        }
        m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 292) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.f31488z = (ArrayList) intent.getSerializableExtra("selectedImages");
            if (!intent.getBooleanExtra("isDone", false)) {
                if (this.f31474l > 0) {
                    this.f55455c.f181620d.notifyDataSetChanged();
                }
                if (this.f31476n) {
                    this.f55456d.f181620d.notifyDataSetChanged();
                }
                mo48950f();
                return;
            }
            if (this.f31488z.size() > 0) {
                Intent intent2 = new Intent();
                intent2.putExtra(MediaPickerBaseAct.f55451h, this.f31488z);
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            m68056e2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("force_select_image".equals(this.f31481s)) {
            return;
        }
        if (!CoreModule.m30929H().signedIn_()) {
            i4g0.m138523u("e_picture_albums_back_button", "p_picture_albums_view", jyb.m147494Y("signup_source", CoreModule.m30929H().getSignUpType()), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, CoreModule.m30929H().getSignUpData().phoneNumber));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f31474l <= 1) {
            return false;
        }
        getMenuInflater().inflate(lfc0.f131842e, menu);
        View actionView = menu.findItem(adc0.f70331f3).getActionView();
        this.f31487y = actionView;
        this.f31486x = (VText) actionView.findViewById(adc0.f70505p8);
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            this.f31486x.setTextColor(getResources().getColorStateList(CoreBusinessModule.m30906m0().mo122543c()));
        }
        this.f31487y.setOnClickListener(new View.OnClickListener() { // from class: l.kyx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129368a.m48979o2(view);
            }
        });
        bnl0.m105546b0(findViewById(R.id.content), new pcj() { // from class: l.lyx
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f134146a.m48980p2();
            }
        });
        pendChangeActionButtonTypeface();
        return true;
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
        intent.putExtra(MediaPickerBaseAct.f55451h, jyb.m147507f0(picture));
        intent.putExtra("from", this.f31481s);
        setResult(-1, intent);
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onRecordVideoResult(String str) {
        Video video = new Video();
        video.url = oki.m168011B(str);
        video.status = MediaLocalStatus.get("raw");
        this.f31488z.clear();
        this.f31488z.add(video);
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f55451h, this.f31488z);
        setResult(-1, intent);
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        if ("p_picture_selection_view".equals(pageId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("signup_source", CoreModule.m30929H().getSignUpType());
                this.pageHelper.m152780o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        if (this.f31477o) {
            cropImage(str);
            return;
        }
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get("raw");
        m48982u2(jyb.m147507f0(picture), null, 0);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ Boolean m48980p2() {
        mo48950f();
        return Boolean.TRUE;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        boolean z = this.f31476n;
        if (!z || this.f31474l <= 0) {
            return z ? "p_video_selection_view" : "p_picture_selection_view";
        }
        return "p_media_albums_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f31474l = getIntent().getIntExtra("imageCount", 1);
        this.f31475m = getIntent().getBooleanExtra("hasCamera", false);
        this.f31476n = getIntent().getBooleanExtra("hasVideo", false);
        this.f31477o = getIntent().getBooleanExtra("cropIfSingle", false);
        this.f31478p = getIntent().getBooleanExtra("videoDefault", false);
        this.f31481s = getIntent().getStringExtra("from");
        this.f31480r = getIntent().getIntExtra("source", f31471D);
        this.f31484v = getIntent().getBooleanExtra("isFloatLayerExp", false);
        this.f31482t = (Gender) getIntent().getSerializableExtra("gender");
        this.f31483u = (String) getIntent().getSerializableExtra("title");
        this.f31479q = getIntent().getBooleanExtra("cropNewProfilePicture", false);
        if (this.f31480r != f31470C) {
            super.preCreateView(bundle);
        }
        int i = this.f31474l;
        uyh0 uyh0Var = i > 0 ? this.f55455c : this.f55456d;
        this.f55457e = uyh0Var;
        this.f31472A.m179312F0(i, this.f31475m, this.f31476n, this.f31477o, this.f31478p, this.f31480r, this.f31481s, this.f31482t, this.f31483u, this.f31484v, uyh0Var, this.f31485w);
        this.f31472A.m179319X0(getIntent().getStringExtra("tips_message")).m179320Y0(getIntent().getBooleanExtra("show_simple_avatar", true));
        this.f31473B.m218255T(this.f55455c, this.f55456d, this.f55457e);
        this.f31473B.m218251P(this);
        if (CoreModule.m30929H().mo29162a().mo105647a() && TextUtils.equals(this.f31481s, "from_sign_up")) {
            this.f31473B.m218253R();
        }
        this.pageHelper.m152782q(pageId());
    }

    /* JADX INFO: renamed from: s2 */
    public void m48981s2() {
        ArrayList<Media> arrayList = this.f31488z;
        m48982u2(arrayList, arrayList, 0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        if (CoreModule.m30929H().mo29162a().mo105647a() && TextUtils.equals(this.f31481s, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientActionBar();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (CoreModule.m30929H().mo29162a().mo105647a() && TextUtils.equals(this.f31481s, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }

    /* JADX INFO: renamed from: u2 */
    public void m48982u2(ArrayList<Media> arrayList, ArrayList<Media> arrayList2, int i) {
        int i2 = this.f31474l;
        if (i2 <= 0) {
            i2 = 1;
        }
        startActivityForResult(MediaPreviewAct.m48985Y1(this, arrayList, arrayList2, i, i2), 292);
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo48983x() {
        return this.f55459g;
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: y */
    public void mo48984y(Media media, int i) {
    }
}
