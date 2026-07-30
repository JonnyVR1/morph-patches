package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p137rx.subjects.C22508b;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class kde0 {

    /* JADX INFO: renamed from: j */
    public static final String f125226j = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: k */
    public static final String f125227k = MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: l */
    public static final String[] f125228l = {"_display_name", "_data", "date_added"};

    /* JADX INFO: renamed from: m */
    public static List<String> f125229m = Arrays.asList("screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "截屏", "截图");

    /* JADX INFO: renamed from: a */
    public ContentResolver f125230a;

    /* JADX INFO: renamed from: b */
    public ContentObserver f125231b;

    /* JADX INFO: renamed from: c */
    public int f125232c;

    /* JADX INFO: renamed from: d */
    public C22508b<String> f125233d;

    /* JADX INFO: renamed from: e */
    public List<String> f125234e;

    /* JADX INFO: renamed from: f */
    public boolean f125235f;

    /* JADX INFO: renamed from: g */
    public Dialog f125236g;

    /* JADX INFO: renamed from: h */
    public gcg0 f125237h;

    /* JADX INFO: renamed from: i */
    public boolean f125238i;

    /* JADX INFO: renamed from: l.kde0$a */
    public class C18138a extends ContentObserver {
        public C18138a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            Uri uri2;
            if (PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE")) {
                if (uri.toString().startsWith(kde0.f125227k) || uri.toString().startsWith(kde0.f125226j)) {
                    Cursor cursorQuery = null;
                    try {
                        try {
                            uri2 = uri;
                            try {
                                cursorQuery = kde0.this.f125230a.query(uri2, kde0.f125228l, null, null, "date_added DESC");
                                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("date_added"));
                                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                    if (kde0.this.f125234e.contains(string)) {
                                        cursorQuery.close();
                                        return;
                                    }
                                    kde0.this.f125234e.add(string);
                                    if (l51.m152881A(CoreModule.f18263b) && kde0.m149193s(string) && kde0.m149194t(jCurrentTimeMillis, j) && kde0.this.f125235f) {
                                        kde0.this.f125233d.m137019l(string);
                                    }
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            } catch (Exception unused) {
                                if (cursorQuery != null) {
                                }
                                super.onChange(z, uri2);
                            }
                        } catch (Throwable th) {
                            if (cursorQuery == null) {
                                throw th;
                            }
                            cursorQuery.close();
                            throw th;
                        }
                    } catch (Exception unused2) {
                        uri2 = uri;
                    }
                    super.onChange(z, uri2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.kde0$b */
    public static class C18139b {
        static kde0 INSTANCE = new kde0();
    }

    @SuppressLint({"Range"})
    public kde0() {
        this.f125233d = C22508b.m222767b();
        this.f125234e = new ArrayList();
        this.f125235f = false;
        this.f125238i = false;
        this.f125230a = CoreModule.f18263b.getContentResolver();
        this.f125231b = new C18138a(null);
    }

    /* JADX INFO: renamed from: o */
    public static kde0 m149192o() {
        return C18139b.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m149193s(String str) {
        Iterator<String> it = f125229m.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m149194t(long j, long j2) {
        return Math.abs(j - j2) <= 10;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m149195u() {
        User userMe_ = CoreModule.m30930K().me_();
        if (NullChecker.m82486a(userMe_) && NullChecker.m82486a(userMe_.settings)) {
            Settings settings = userMe_.settings;
            PhoneNumber phoneNumber = settings.phoneNumber;
            PhoneNumber phoneNumber2 = settings.linkedPhoneNumber;
            if ((NullChecker.m82486a(phoneNumber) && phoneNumber.countryCode == 93) || (NullChecker.m82486a(phoneNumber2) && phoneNumber2.countryCode == 93)) {
                return false;
            }
        }
        boolean zM114699q0 = d79.m114699q0();
        if (zM114699q0 && d79.m114702s(CoreModule.m30929H().userId())) {
            return false;
        }
        if (zM114699q0 || !CoreModule.f18264c.f20382e1.m198338a3()) {
            return gra.m131765w1();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m149196n() {
        this.f125238i = true;
        this.f125232c = 0;
        gcg0 gcg0VarM139434a = icg0.m139434a();
        this.f125237h = gcg0VarM139434a;
        gcg0VarM139434a.m129866b(Act.foreground().subscribe(psd0.m173596G(new y20() { // from class: l.gde0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103704a.m149197p((Act.C4450r) obj);
            }
        })));
        this.f125237h.m129866b(this.f125233d.onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.hde0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108984a.m149198q((String) obj);
            }
        })));
        this.f125230a.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f125231b);
        this.f125230a.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f125231b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m149197p(Act.C4450r c4450r) {
        if (c4450r == null) {
            this.f125235f = false;
        } else {
            Activity activity = c4450r.f16062a.get();
            this.f125235f = (activity instanceof NewMainAct) || (activity instanceof LikersAct) || (activity instanceof ProfileAct) || CoreModule.m30932N().mo61541hr(activity);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m149198q(String str) {
        if (m149195u() && !TextUtils.isEmpty(str)) {
            Activity activity = (Act.foreground_() == null || Act.foreground_().f16062a == null) ? null : Act.foreground_().f16062a.get();
            if (activity instanceof NewMainAct) {
                if (((NewMainAct) activity).m40820i6(TabName.Card)) {
                    m149201w((Act) activity, str);
                }
            } else if (activity instanceof ProfileAct) {
                if (((ProfileAct) activity).m51949a3().mo52258P1()) {
                    return;
                }
                m149201w((Act) activity, str);
            } else if (activity instanceof Act) {
                m149201w((Act) activity, str);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m149199r(View view) {
        this.f125236g.dismiss();
        this.f125236g = null;
    }

    /* JADX INFO: renamed from: v */
    public void m149200v() {
        if (this.f125238i) {
            this.f125232c = 0;
            this.f125233d.m137019l("");
            if (NullChecker.m82486a(this.f125237h)) {
                this.f125237h.unsubscribe();
            }
            this.f125237h = icg0.m139434a();
            this.f125230a.unregisterContentObserver(this.f125231b);
            this.f125238i = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m149201w(Act act, String str) {
        if (act == null || act.isFinishing() || act.isDestroyed() || TextUtils.isEmpty(str)) {
            return;
        }
        if (NullChecker.m82486a(this.f125236g) && this.f125236g.isShowing()) {
            return;
        }
        this.f125232c++;
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_get_screenshoot_warning", kde0.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        Dialog dialogM21566z = act.dialog().m21556u().m21516M(kec0.f125604Rb).m21495B(false).m21566z();
        this.f125236g = dialogM21566z;
        View viewM21457P = dialogM21566z.m21457P();
        VText vText = (VText) viewM21457P.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewM21457P.findViewById(adc0.f70061P1);
        int i = this.f125232c;
        if (i == 1) {
            vText.setText(R$string.f18777Q0);
            vText2.setText(R$string.f18717O0);
        } else {
            vText.setText(act.getString(R$string.f18747P0, String.valueOf(i)));
            vText2.setText(R$string.f18687N0);
        }
        bnl0.m105509E0(viewM21457P.findViewById(adc0.f70660ya), new View.OnClickListener() { // from class: l.ide0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114501a.m149199r(view);
            }
        });
        this.f125236g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jde0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        this.f125236g.show();
    }
}
