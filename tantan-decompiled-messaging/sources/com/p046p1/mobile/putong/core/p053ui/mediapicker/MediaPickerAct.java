package com.p046p1.mobile.putong.core.p053ui.mediapicker;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
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
import p147v.VText;
import p149l.csx;
import p149l.e30;
import p149l.eqh0;
import p149l.gwl;
import p149l.h7c0;
import p149l.h7n;
import p149l.iti;
import p149l.lsi0;
import p149l.nqh0;
import p149l.pii0;
import p149l.qib0;
import p149l.rhi;
import p149l.t100;
import p149l.u4c0;
import p149l.urx;
import p149l.v9j;
import p149l.vpx;
import p149l.vwb;
import p149l.w0c0;
import p149l.wc40;
import p149l.x9g0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPickerAct extends MediaPickerBaseAct implements MediaPickerBaseAct.InterfaceC13127a, e30<nqh0>, gwl {

    /* JADX INFO: renamed from: C */
    public static int f30622C = 1;

    /* JADX INFO: renamed from: D */
    public static int f30623D;

    /* JADX INFO: renamed from: A */
    public urx f30624A;

    /* JADX INFO: renamed from: B */
    public csx f30625B;

    /* JADX INFO: renamed from: l */
    public int f30626l;

    /* JADX INFO: renamed from: m */
    public boolean f30627m;

    /* JADX INFO: renamed from: n */
    public boolean f30628n;

    /* JADX INFO: renamed from: o */
    public boolean f30629o;

    /* JADX INFO: renamed from: p */
    public boolean f30630p;

    /* JADX INFO: renamed from: q */
    public boolean f30631q;

    /* JADX INFO: renamed from: r */
    public int f30632r;

    /* JADX INFO: renamed from: s */
    public String f30633s;

    /* JADX INFO: renamed from: t */
    public Gender f30634t;

    /* JADX INFO: renamed from: u */
    public String f30635u;

    /* JADX INFO: renamed from: v */
    public boolean f30636v;

    /* JADX INFO: renamed from: x */
    public VText f30638x;

    /* JADX INFO: renamed from: y */
    public View f30639y;

    /* JADX INFO: renamed from: w */
    public int f30637w = 3;

    /* JADX INFO: renamed from: z */
    public ArrayList<Media> f30640z = new ArrayList<>();

    /* JADX INFO: renamed from: c2 */
    public static Intent m47782c2(Context context, int i, boolean z, boolean z2, boolean z3) {
        return m47784e2(context, i, z, z2, z3, null, f30623D, false);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m47783d2(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        return m47784e2(context, i, z, z2, z3, str, f30623D, false);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m47784e2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return m47785g2(context, i, z, z2, z3, str, i2, z4, false, null);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m47785g2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender) {
        return m47786h2(context, i, z, z2, z3, str, i2, z4, z5, gender, "");
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m47786h2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2) {
        return m47787i2(context, i, z, z2, z3, str, i2, z4, z5, gender, str2, true);
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m47787i2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2, boolean z6) {
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
        if ((i == 1 || !z3) && !(z2 && i2 == f30622C)) {
            return intent;
        }
        x9g0.m207497a();
        return null;
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m47788k2(Context context, vpx vpxVar) {
        if ((vpxVar.f182531a != 1 && vpxVar.f182534d) || (vpxVar.f182533c && vpxVar.f182536f == f30622C)) {
            x9g0.m207497a();
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        intent.putExtras(vpxVar.m199387a());
        return intent;
    }

    /* JADX INFO: renamed from: p2 */
    public static void m47789p2(View view, TextView textView, Act act, List<Media> list, boolean z) {
        pii0 pii0Var;
        if (NullChecker.m81303a(textView)) {
            if (list == null || list.size() == 0) {
                view.setEnabled(z);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            view.setEnabled(true);
            if (NullChecker.m81303a(CoreModule.f17545c)) {
                pii0Var = new pii0(list.size() + "", t100.m186890d(20.0f), t100.m186890d(14.0f), eqh0.m117752c(3), -1, pii0.f149561i, -2667209);
            } else {
                pii0Var = new pii0(list.size() + "", t100.m186890d(20.0f), t100.m186890d(14.0f), eqh0.m117752c(3), CoreModule.f17544b.getResources().getColor(w0c0.f183790N1), pii0.f149561i, -1);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(pii0Var, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(t100.m186890d(8.0f));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static boolean m47790q2(Media media, boolean z, ArrayList<Media> arrayList, int i) {
        if (!z) {
            arrayList.remove(media);
            return true;
        }
        if (i == arrayList.size()) {
            if (media instanceof Video) {
                lsi0.m151578h(R$string.f18274Xh);
            } else {
                lsi0.m151578h(R$string.f18034Ph);
            }
            return false;
        }
        if ((media instanceof Video) && arrayList.size() != 0) {
            lsi0.m151578h(R$string.f18274Xh);
            return false;
        }
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof Video)) {
            arrayList.add(media);
            return true;
        }
        lsi0.m151578h(R$string.f18274Xh);
        return false;
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: G */
    public int mo47791G() {
        return 0;
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: b */
    public void mo47792b(iti itiVar) {
        this.f30624A.m195164E0(itiVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void cropImage(String str) {
        if (!this.f30631q) {
            super.cropImage(str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            CrashHelper.m81296c(new NullPointerException("image path is null"));
        }
        startActivityForResult(NewCropperAct.m36194I1(this.act, str, true, "from_change_anchor_cover".equals(this.f30633s)), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: f */
    public void mo47767f() {
        m47789p2(this.f30639y, this.f30638x, this, this.f30640z, false);
        this.f30624A.m195171W0(this.f30640z);
        this.f30624A.m195163D0();
    }

    /* JADX INFO: renamed from: i */
    public boolean mo47768i(Media media, boolean z) {
        boolean zM47790q2 = m47790q2(media, z, this.f30640z, this.f30626l);
        mo47767f();
        return zM47790q2;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30625B.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30624A = new urx(this);
        csx csxVar = new csx(this);
        this.f30625B = csxVar;
        this.f30624A.mo51532C(csxVar);
        this.f30624A.m195161A0(MediaPickerBaseAct.f54604i);
        this.f30624A.m195162C0(MediaPickerBaseAct.f54605j);
        this.f30624A.m195171W0(this.f30640z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30624A.mo39470a0();
    }

    /* JADX INFO: renamed from: j */
    public void mo47769j(View view, Media media) {
        if (this.f30632r != f30622C) {
            File file = new File(rhi.m179382z(media.url));
            if (!file.canRead() || file.length() == 0) {
                return;
            }
        }
        if (this.f30626l != 1) {
            nqh0 nqh0Var = this.f54609e;
            iti itiVar = nqh0Var.f140068c;
            ArrayList<Media> arrayList = itiVar == null ? (ArrayList) nqh0Var.f140066a.f153135a : (ArrayList) itiVar.f114886c.f153135a;
            m47799s2(arrayList, this.f30640z, arrayList.indexOf(media));
            return;
        }
        if (!this.f30629o || (media instanceof Video)) {
            m47799s2(vwb.m200299M(media), null, 0);
            return;
        }
        if (this.f30632r == f30622C) {
            qib0.f154691G.m184720i(media.url, new e30() { // from class: l.ppx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150730a.m47795m2((String) obj);
                }
            });
            return;
        }
        if (CoreModule.m29931H().mo28163a().mo132031a() && TextUtils.equals(this.f30633s, "from_sign_up")) {
            CoreModule.m29931H().openLoginUiOptCropAct(this.act, rhi.m179382z(media.url), this.f30631q);
        } else if (h7n.m129754c() && TextUtils.equals(this.f30633s, "from_sign_up")) {
            CoreModule.m29931H().openLoginUiOptCropAct(this.act, rhi.m179382z(media.url), true);
        } else {
            cropImage(rhi.m179382z(media.url));
        }
    }

    @Override // p149l.gwl
    /* JADX INFO: renamed from: k */
    public ArrayList<Media> mo47793k() {
        return this.f30640z;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public void call(nqh0 nqh0Var) {
        this.f54609e = nqh0Var;
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m47795m2(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f18843q4);
        } else {
            cropImage(str);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m47796n2(View view) {
        if (this.f30640z.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra(MediaPickerBaseAct.f54603h, this.f30640z);
            setResult(-1, intent);
        }
        m66873d2();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ Boolean m47797o2() {
        mo47767f();
        return Boolean.TRUE;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 292) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.f30640z = (ArrayList) intent.getSerializableExtra("selectedImages");
            if (!intent.getBooleanExtra("isDone", false)) {
                if (this.f30626l > 0) {
                    this.f54607c.f140069d.notifyDataSetChanged();
                }
                if (this.f30628n) {
                    this.f54608d.f140069d.notifyDataSetChanged();
                }
                mo47767f();
                return;
            }
            if (this.f30640z.size() > 0) {
                Intent intent2 = new Intent();
                intent2.putExtra(MediaPickerBaseAct.f54603h, this.f30640z);
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            m66873d2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("force_select_image".equals(this.f30633s)) {
            return;
        }
        if (!CoreModule.m29931H().signedIn_()) {
            zvf0.m220399u("e_picture_albums_back_button", "p_picture_albums_view", vwb.m200311Y("signup_source", CoreModule.m29931H().getSignUpType()), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, CoreModule.m29931H().getSignUpData().phoneNumber));
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f30626l <= 1) {
            return false;
        }
        getMenuInflater().inflate(h7c0.f106223e, menu);
        View actionView = menu.findItem(u4c0.f174206d3).getActionView();
        this.f30639y = actionView;
        this.f30638x = (VText) actionView.findViewById(u4c0.f174380n8);
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            this.f30638x.setTextColor(getResources().getColorStateList(CoreBusinessModule.m29908m0().mo190516c()));
        }
        this.f30639y.setOnClickListener(new View.OnClickListener() { // from class: l.npx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140015a.m47796n2(view);
            }
        });
        xdl0.m208366b0(findViewById(R.id.content), new v9j() { // from class: l.opx
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145059a.m47797o2();
            }
        });
        pendChangeActionButtonTypeface();
        return true;
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
        intent.putExtra(MediaPickerBaseAct.f54603h, vwb.m200324f0(picture));
        intent.putExtra("from", this.f30633s);
        setResult(-1, intent);
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onRecordVideoResult(String str) {
        Video video = new Video();
        video.url = rhi.m179355B(str);
        video.status = MediaLocalStatus.get("raw");
        this.f30640z.clear();
        this.f30640z.add(video);
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f54603h, this.f30640z);
        setResult(-1, intent);
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        if ("p_picture_selection_view".equals(pageId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("signup_source", CoreModule.m29931H().getSignUpType());
                this.pageHelper.m109039o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        if (this.f30629o) {
            cropImage(str);
            return;
        }
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get("raw");
        m47799s2(vwb.m200324f0(picture), null, 0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        boolean z = this.f30628n;
        if (!z || this.f30626l <= 0) {
            return z ? "p_video_selection_view" : "p_picture_selection_view";
        }
        return "p_media_albums_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f30626l = getIntent().getIntExtra("imageCount", 1);
        this.f30627m = getIntent().getBooleanExtra("hasCamera", false);
        this.f30628n = getIntent().getBooleanExtra("hasVideo", false);
        this.f30629o = getIntent().getBooleanExtra("cropIfSingle", false);
        this.f30630p = getIntent().getBooleanExtra("videoDefault", false);
        this.f30633s = getIntent().getStringExtra("from");
        this.f30632r = getIntent().getIntExtra("source", f30623D);
        this.f30636v = getIntent().getBooleanExtra("isFloatLayerExp", false);
        this.f30634t = (Gender) getIntent().getSerializableExtra("gender");
        this.f30635u = (String) getIntent().getSerializableExtra("title");
        this.f30631q = getIntent().getBooleanExtra("cropNewProfilePicture", false);
        if (this.f30632r != f30622C) {
            super.preCreateView(bundle);
        }
        int i = this.f30626l;
        nqh0 nqh0Var = i > 0 ? this.f54607c : this.f54608d;
        this.f54609e = nqh0Var;
        this.f30624A.m195165F0(i, this.f30627m, this.f30628n, this.f30629o, this.f30630p, this.f30632r, this.f30633s, this.f30634t, this.f30635u, this.f30636v, nqh0Var, this.f30637w);
        this.f30624A.m195172X0(getIntent().getStringExtra("tips_message")).m195173Y0(getIntent().getBooleanExtra("show_simple_avatar", true));
        this.f30625B.m108631T(this.f54607c, this.f54608d, this.f54609e);
        this.f30625B.m108627P(this);
        if (CoreModule.m29931H().mo28163a().mo132031a() && TextUtils.equals(this.f30633s, "from_sign_up")) {
            this.f30625B.m108629R();
        }
        this.pageHelper.m109041q(pageId());
    }

    /* JADX INFO: renamed from: r2 */
    public void m47798r2() {
        ArrayList<Media> arrayList = this.f30640z;
        m47799s2(arrayList, arrayList, 0);
    }

    /* JADX INFO: renamed from: s2 */
    public void m47799s2(ArrayList<Media> arrayList, ArrayList<Media> arrayList2, int i) {
        int i2 = this.f30626l;
        if (i2 <= 0) {
            i2 = 1;
        }
        startActivityForResult(MediaPreviewAct.m47802X1(this, arrayList, arrayList2, i, i2), 292);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        if (CoreModule.m29931H().mo28163a().mo132031a() && TextUtils.equals(this.f30633s, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientActionBar();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (CoreModule.m29931H().mo28163a().mo132031a() && TextUtils.equals(this.f30633s, "from_sign_up")) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo47800x() {
        return this.f54611g;
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: y */
    public void mo47801y(Media media, int i) {
    }
}
