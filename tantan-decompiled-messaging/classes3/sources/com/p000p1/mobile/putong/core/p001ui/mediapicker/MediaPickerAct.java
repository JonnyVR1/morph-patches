package com.p000p1.mobile.putong.core.p001ui.mediapicker;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.h7c0;
import l.h7n;
import l.iti;
import l.j760;
import l.lsi0;
import l.nqh0;
import l.pii0;
import l.qib0;
import l.rhi;
import l.t100;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.wc40;
import l.x9g0;
import l.xdl0;
import l.zvf0;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;
import p003l.csx;
import p003l.e30;
import p003l.eqh0;
import p003l.gwl;
import p003l.urx;
import p003l.v9j;
import p003l.vpx;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MediaPickerAct extends MediaPickerBaseAct implements MediaPickerBaseAct.a, e30<nqh0>, gwl {

    /* JADX INFO: renamed from: C */
    public static int f513C = 1;

    /* JADX INFO: renamed from: D */
    public static int f514D;

    /* JADX INFO: renamed from: A */
    public urx f515A;

    /* JADX INFO: renamed from: B */
    public csx f516B;

    /* JADX INFO: renamed from: l */
    public int f517l;

    /* JADX INFO: renamed from: m */
    public boolean f518m;

    /* JADX INFO: renamed from: n */
    public boolean f519n;

    /* JADX INFO: renamed from: o */
    public boolean f520o;

    /* JADX INFO: renamed from: p */
    public boolean f521p;

    /* JADX INFO: renamed from: q */
    public boolean f522q;

    /* JADX INFO: renamed from: r */
    public int f523r;

    /* JADX INFO: renamed from: s */
    public String f524s;

    /* JADX INFO: renamed from: t */
    public Gender f525t;

    /* JADX INFO: renamed from: u */
    public String f526u;

    /* JADX INFO: renamed from: v */
    public boolean f527v;

    /* JADX INFO: renamed from: x */
    public VText f529x;

    /* JADX INFO: renamed from: y */
    public View f530y;

    /* JADX INFO: renamed from: w */
    public int f528w = 3;

    /* JADX INFO: renamed from: z */
    public ArrayList<Media> f531z = new ArrayList<>();

    /* JADX INFO: renamed from: c2 */
    public static Intent m846c2(Context context, int i, boolean z, boolean z2, boolean z3) {
        return m848e2(context, i, z, z2, z3, null, f514D, false);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m847d2(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        return m848e2(context, i, z, z2, z3, str, f514D, false);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m848e2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4) {
        return m849g2(context, i, z, z2, z3, str, i2, z4, false, null);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m849g2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender) {
        return m850h2(context, i, z, z2, z3, str, i2, z4, z5, gender, "");
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m850h2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2) {
        return m851i2(context, i, z, z2, z3, str, i2, z4, z5, gender, str2, true);
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m851i2(Context context, int i, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, boolean z5, Gender gender, String str2, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        intent.putExtra("imageCount", i);
        intent.putExtra("hasCamera", z);
        intent.putExtra("hasVideo", z2);
        intent.putExtra("cropIfSingle", z3);
        intent.putExtra("videoDefault", z4);
        intent.putExtra("from", str);
        intent.putExtra("source", i2);
        intent.putExtra("isFloatLayerExp", z5);
        intent.putExtra("gender", (Serializable) gender);
        intent.putExtra(MessageBundle.TITLE_ENTRY, str2);
        intent.putExtra("cropNewProfilePicture", z6);
        if ((i == 1 || !z3) && !(z2 && i2 == f513C)) {
            return intent;
        }
        x9g0.a();
        return null;
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m852k2(Context context, vpx vpxVar) {
        if ((vpxVar.f8377a != 1 && vpxVar.f8380d) || (vpxVar.f8379c && vpxVar.f8382f == f513C)) {
            x9g0.a();
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        intent.putExtras(vpxVar.m8399a());
        return intent;
    }

    /* JADX INFO: renamed from: p2 */
    public static void m853p2(View view, TextView textView, Act act, List<Media> list, boolean z) {
        pii0 pii0Var;
        if (NullChecker.a(textView)) {
            if (list == null || list.size() == 0) {
                view.setEnabled(z);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            view.setEnabled(true);
            if (NullChecker.a(CoreModule.c)) {
                pii0Var = new pii0(list.size() + "", t100.d(20.0f), t100.d(14.0f), eqh0.m3924c(3), -1, pii0.i, -2667209);
            } else {
                pii0Var = new pii0(list.size() + "", t100.d(20.0f), t100.d(14.0f), eqh0.m3924c(3), CoreModule.b.getResources().getColor(w0c0.N1), pii0.i, -1);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) pii0Var, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(t100.d(8.0f));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static boolean m854q2(Media media, boolean z, ArrayList<Media> arrayList, int i) {
        if (!z) {
            arrayList.remove(media);
            return true;
        }
        if (i == arrayList.size()) {
            if (media instanceof Video) {
                lsi0.h(R.string.Xh);
            } else {
                lsi0.h(R.string.Ph);
            }
            return false;
        }
        if ((media instanceof Video) && arrayList.size() != 0) {
            lsi0.h(R.string.Xh);
            return false;
        }
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof Video)) {
            arrayList.add(media);
            return true;
        }
        lsi0.h(R.string.Xh);
        return false;
    }

    /* JADX INFO: renamed from: G */
    public int m855G() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m856b(iti itiVar) {
        this.f515A.m8229E0(itiVar);
    }

    public void cropImage(String str) {
        if (!this.f522q) {
            super/*com.p1.mobile.putong.app.PutongAct*/.cropImage(str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            CrashHelper.c(new NullPointerException("image path is null"));
        }
        startActivityForResult(NewCropperAct.I1(((Act) this).act, str, true, "from_change_anchor_cover".equals(this.f524s)), 24576);
    }

    /* JADX INFO: renamed from: f */
    public void mo831f() {
        m853p2(this.f530y, this.f529x, this, this.f531z, false);
        this.f515A.m8236W0(this.f531z);
        this.f515A.m8228D0();
    }

    /* JADX INFO: renamed from: i */
    public boolean mo832i(Media media, boolean z) {
        boolean zM854q2 = m854q2(media, z, this.f531z, this.f517l);
        mo831f();
        return zM854q2;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f516B.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f515A = new urx(this);
        csx csxVar = new csx(this);
        this.f516B = csxVar;
        this.f515A.C(csxVar);
        this.f515A.m8226A0(MediaPickerBaseAct.i);
        this.f515A.m8227C0(MediaPickerBaseAct.j);
        this.f515A.m8236W0(this.f531z);
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f515A.m8239a0();
    }

    /* JADX INFO: renamed from: j */
    public void mo833j(View view, Media media) {
        if (this.f523r != f513C) {
            File file = new File(rhi.z(media.url));
            if (!file.canRead() || file.length() == 0) {
                return;
            }
        }
        if (this.f517l != 1) {
            nqh0 nqh0Var = ((MediaPickerBaseAct) this).e;
            iti itiVar = nqh0Var.c;
            ArrayList<Media> arrayList = itiVar == null ? (ArrayList) nqh0Var.a.a : (ArrayList) itiVar.c.a;
            m863s2(arrayList, this.f531z, arrayList.indexOf(media));
            return;
        }
        if (!this.f520o || (media instanceof Video)) {
            m863s2(vwb.M(media), null, 0);
            return;
        }
        if (this.f523r == f513C) {
            qib0.G.i(media.url, new e30() { // from class: l.ppx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6485a.m859m2((String) obj);
                }
            });
            return;
        }
        if (CoreModule.H().a().a() && TextUtils.equals(this.f524s, "from_sign_up")) {
            CoreModule.H().openLoginUiOptCropAct(((Act) this).act, rhi.z(media.url), this.f522q);
        } else if (h7n.c() && TextUtils.equals(this.f524s, "from_sign_up")) {
            CoreModule.H().openLoginUiOptCropAct(((Act) this).act, rhi.z(media.url), true);
        } else {
            cropImage(rhi.z(media.url));
        }
    }

    @Override // p003l.gwl
    /* JADX INFO: renamed from: k */
    public ArrayList<Media> mo857k() {
        return this.f531z;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public void call(nqh0 nqh0Var) {
        ((MediaPickerBaseAct) this).e = nqh0Var;
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m859m2(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.w(R.string.q4);
        } else {
            cropImage(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m860n2(View view) {
        if (this.f531z.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra(MediaPickerBaseAct.h, this.f531z);
            setResult(-1, intent);
        }
        finish();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ Boolean m861o2() {
        mo831f();
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 292) {
            super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.f531z = (ArrayList) intent.getSerializableExtra("selectedImages");
            if (!intent.getBooleanExtra("isDone", false)) {
                if (this.f517l > 0) {
                    ((MediaPickerBaseAct) this).c.d.notifyDataSetChanged();
                }
                if (this.f519n) {
                    ((MediaPickerBaseAct) this).d.d.notifyDataSetChanged();
                }
                mo831f();
                return;
            }
            if (this.f531z.size() > 0) {
                Intent intent2 = new Intent();
                intent2.putExtra(MediaPickerBaseAct.h, this.f531z);
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    public void onBackPressed() {
        if ("force_select_image".equals(this.f524s)) {
            return;
        }
        if (!CoreModule.H().signedIn_()) {
            zvf0.u("e_picture_albums_back_button", "p_picture_albums_view", new j760[]{vwb.Y("signup_source", CoreModule.H().getSignUpType()), vwb.Y("phone_num", CoreModule.H().getSignUpData().phoneNumber)});
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f517l <= 1) {
            return false;
        }
        getMenuInflater().inflate(h7c0.e, menu);
        View actionView = menu.findItem(u4c0.d3).getActionView();
        this.f530y = actionView;
        this.f529x = (VText) actionView.findViewById(u4c0.n8);
        if (NullChecker.a(CoreModule.c)) {
            this.f529x.setTextColor(getResources().getColorStateList(CoreBusinessModule.m0().c()));
        }
        this.f530y.setOnClickListener(new View.OnClickListener() { // from class: l.npx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5948a.m860n2(view);
            }
        });
        xdl0.b0(findViewById(android.R.id.content), new v9j() { // from class: l.opx
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f6199a.m861o2();
            }
        });
        pendChangeActionButtonTypeface();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCropImageResult(String str) {
        Picture picture = new Picture();
        ((Media) picture).status = MediaLocalStatus.get("preprocessed");
        ((Media) picture).url = rhi.B(str);
        if (wc40.c()) {
            ((Media) picture).mediaType = "image/webp";
        } else {
            ((Media) picture).mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.h, vwb.f0(new Picture[]{picture}));
        intent.putExtra("from", this.f524s);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRecordVideoResult(String str) {
        Media video = new Video();
        video.url = rhi.B(str);
        video.status = MediaLocalStatus.get("raw");
        this.f531z.clear();
        this.f531z.add(video);
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.h, this.f531z);
        setResult(-1, intent);
        finish();
    }

    public void onStartLifecycle() {
        if ("p_picture_selection_view".equals(pageId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("signup_source", CoreModule.H().getSignUpType());
                ((PutongAct) this).pageHelper.o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    public void onTakePictureResult(String str) {
        if (this.f520o) {
            cropImage(str);
            return;
        }
        Media picture = new Picture();
        picture.url = rhi.B(str);
        picture.status = MediaLocalStatus.get("raw");
        m863s2(vwb.f0(new Media[]{picture}), null, 0);
    }

    public String pageId() {
        boolean z = this.f519n;
        if (!z || this.f517l <= 0) {
            return z ? "p_video_selection_view" : "p_picture_selection_view";
        }
        return "p_media_albums_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f517l = getIntent().getIntExtra("imageCount", 1);
        this.f518m = getIntent().getBooleanExtra("hasCamera", false);
        this.f519n = getIntent().getBooleanExtra("hasVideo", false);
        this.f520o = getIntent().getBooleanExtra("cropIfSingle", false);
        this.f521p = getIntent().getBooleanExtra("videoDefault", false);
        this.f524s = getIntent().getStringExtra("from");
        this.f523r = getIntent().getIntExtra("source", f514D);
        this.f527v = getIntent().getBooleanExtra("isFloatLayerExp", false);
        this.f525t = getIntent().getSerializableExtra("gender");
        this.f526u = (String) getIntent().getSerializableExtra(MessageBundle.TITLE_ENTRY);
        this.f522q = getIntent().getBooleanExtra("cropNewProfilePicture", false);
        if (this.f523r != f513C) {
            super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        }
        int i = this.f517l;
        nqh0 nqh0Var = i > 0 ? ((MediaPickerBaseAct) this).c : ((MediaPickerBaseAct) this).d;
        ((MediaPickerBaseAct) this).e = nqh0Var;
        this.f515A.m8230F0(i, this.f518m, this.f519n, this.f520o, this.f521p, this.f523r, this.f524s, this.f525t, this.f526u, this.f527v, nqh0Var, this.f528w);
        this.f515A.m8237X0(getIntent().getStringExtra("tips_message")).m8238Y0(getIntent().getBooleanExtra("show_simple_avatar", true));
        this.f516B.m3455T(((MediaPickerBaseAct) this).c, ((MediaPickerBaseAct) this).d, ((MediaPickerBaseAct) this).e);
        this.f516B.m3451P(this);
        if (CoreModule.H().a().a() && TextUtils.equals(this.f524s, "from_sign_up")) {
            this.f516B.m3453R();
        }
        ((PutongAct) this).pageHelper.q(pageId());
    }

    /* JADX INFO: renamed from: r2 */
    public void m862r2() {
        ArrayList<Media> arrayList = this.f531z;
        m863s2(arrayList, arrayList, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    public void m863s2(ArrayList<Media> arrayList, ArrayList<Media> arrayList2, int i) {
        int i2 = this.f517l;
        if (i2 <= 0) {
            i2 = 1;
        }
        startActivityForResult(MediaPreviewAct.m866X1(this, arrayList, arrayList2, i, i2), 292);
    }

    public boolean shouldShowGradientActionBar() {
        if (CoreModule.H().a().a() && TextUtils.equals(this.f524s, "from_sign_up")) {
            return false;
        }
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldShowGradientActionBar();
    }

    public boolean shouldShowGradientStatusBar() {
        if (CoreModule.H().a().a() && TextUtils.equals(this.f524s, "from_sign_up")) {
            return false;
        }
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldShowGradientStatusBar();
    }

    /* JADX INFO: renamed from: x */
    public Map<String, Integer> m864x() {
        return ((MediaPickerBaseAct) this).g;
    }

    /* JADX INFO: renamed from: y */
    public void m865y(Media media, int i) {
    }
}
