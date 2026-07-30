package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p133rx.subjects.C22393b;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g5e0 {

    /* JADX INFO: renamed from: j */
    public static final String f101129j = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: k */
    public static final String f101130k = MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: l */
    public static final String[] f101131l = {"_display_name", "_data", "date_added"};

    /* JADX INFO: renamed from: m */
    public static List<String> f101132m = Arrays.asList("screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "截屏", "截图");

    /* JADX INFO: renamed from: a */
    public ContentResolver f101133a;

    /* JADX INFO: renamed from: b */
    public ContentObserver f101134b;

    /* JADX INFO: renamed from: c */
    public int f101135c;

    /* JADX INFO: renamed from: d */
    public C22393b<String> f101136d;

    /* JADX INFO: renamed from: e */
    public List<String> f101137e;

    /* JADX INFO: renamed from: f */
    public boolean f101138f;

    /* JADX INFO: renamed from: g */
    public Dialog f101139g;

    /* JADX INFO: renamed from: h */
    public z3g0 f101140h;

    /* JADX INFO: renamed from: i */
    public boolean f101141i;

    /* JADX INFO: renamed from: l.g5e0$a */
    public class C17008a extends ContentObserver {
        public C17008a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            Uri uri2;
            if (PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE")) {
                if (uri.toString().startsWith(g5e0.f101130k) || uri.toString().startsWith(g5e0.f101129j)) {
                    Cursor cursorQuery = null;
                    try {
                        try {
                            uri2 = uri;
                            try {
                                cursorQuery = g5e0.this.f101133a.query(uri2, g5e0.f101131l, null, null, "date_added DESC");
                                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("date_added"));
                                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                    if (g5e0.this.f101137e.contains(string)) {
                                        cursorQuery.close();
                                        return;
                                    }
                                    g5e0.this.f101137e.add(string);
                                    if (e51.m114736A(CoreModule.f17544b) && g5e0.m124508s(string) && g5e0.m124509t(jCurrentTimeMillis, j) && g5e0.this.f101138f) {
                                        g5e0.this.f101136d.m132487l(string);
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

    /* JADX INFO: renamed from: l.g5e0$b */
    public static class C17009b {
        static g5e0 INSTANCE = new g5e0();
    }

    @SuppressLint({"Range"})
    public g5e0() {
        this.f101136d = C22393b.m221521b();
        this.f101137e = new ArrayList();
        this.f101138f = false;
        this.f101141i = false;
        this.f101133a = CoreModule.f17544b.getContentResolver();
        this.f101134b = new C17008a(null);
    }

    /* JADX INFO: renamed from: o */
    public static g5e0 m124507o() {
        return C17009b.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m124508s(String str) {
        Iterator<String> it = f101132m.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m124509t(long j, long j2) {
        return Math.abs(j - j2) <= 10;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m124510u() {
        User userMe_ = CoreModule.m29932K().me_();
        if (NullChecker.m81303a(userMe_) && NullChecker.m81303a(userMe_.settings)) {
            Settings settings = userMe_.settings;
            PhoneNumber phoneNumber = settings.phoneNumber;
            PhoneNumber phoneNumber2 = settings.linkedPhoneNumber;
            if ((NullChecker.m81303a(phoneNumber) && phoneNumber.countryCode == 93) || (NullChecker.m81303a(phoneNumber2) && phoneNumber2.countryCode == 93)) {
                return false;
            }
        }
        boolean zM191841m0 = u59.m191841m0();
        if (zM191841m0 && u59.m191848s(CoreModule.m29931H().userId())) {
            return false;
        }
        if (zM191841m0 || !CoreModule.f17545c.f19640e1.m138533a3()) {
            return upa.m194834w1();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m124511n() {
        this.f101141i = true;
        this.f101135c = 0;
        z3g0 z3g0VarM94917a = a4g0.m94917a();
        this.f101140h = z3g0VarM94917a;
        z3g0VarM94917a.m217046b(Act.foreground().subscribe(mkd0.m154955G(new e30() { // from class: l.c5e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79373a.m124512p((Act.C4299r) obj);
            }
        })));
        this.f101140h.m217046b(this.f101136d.onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.d5e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84528a.m124513q((String) obj);
            }
        })));
        this.f101133a.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f101134b);
        this.f101133a.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f101134b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m124512p(Act.C4299r c4299r) {
        if (c4299r == null) {
            this.f101138f = false;
        } else {
            Activity activity = c4299r.f15343a.get();
            this.f101138f = (activity instanceof NewMainAct) || (activity instanceof LikersAct) || (activity instanceof ProfileAct) || CoreModule.m29934N().mo60357hr(activity);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m124513q(String str) {
        if (m124510u() && !TextUtils.isEmpty(str)) {
            Activity activity = (Act.foreground_() == null || Act.foreground_().f15343a == null) ? null : Act.foreground_().f15343a.get();
            if (activity instanceof NewMainAct) {
                if (((NewMainAct) activity).m39812e6(TabName.Card)) {
                    m124516w((Act) activity, str);
                }
            } else if (activity instanceof ProfileAct) {
                if (((ProfileAct) activity).m50766Y2().mo51075P1()) {
                    return;
                }
                m124516w((Act) activity, str);
            } else if (activity instanceof Act) {
                m124516w((Act) activity, str);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m124514r(View view) {
        this.f101139g.dismiss();
        this.f101139g = null;
    }

    /* JADX INFO: renamed from: v */
    public void m124515v() {
        if (this.f101141i) {
            this.f101135c = 0;
            this.f101136d.m132487l("");
            if (NullChecker.m81303a(this.f101140h)) {
                this.f101140h.unsubscribe();
            }
            this.f101140h = a4g0.m94917a();
            this.f101133a.unregisterContentObserver(this.f101134b);
            this.f101141i = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m124516w(Act act, String str) {
        if (act == null || act.isFinishing() || act.isDestroyed() || TextUtils.isEmpty(str)) {
            return;
        }
        if (NullChecker.m81303a(this.f101139g) && this.f101139g.isShowing()) {
            return;
        }
        this.f101135c++;
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_get_screenshoot_warning", g5e0.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        Dialog dialogM20567z = act.dialog().m20557u().m20517M(f6c0.f95438Kb).m20496B(false).m20567z();
        this.f101139g = dialogM20567z;
        View viewM20458P = dialogM20567z.m20458P();
        VText vText = (VText) viewM20458P.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewM20458P.findViewById(u4c0.f173973P1);
        int i = this.f101135c;
        if (i == 1) {
            vText.setText(R$string.f18047Q0);
            vText2.setText(R$string.f17987O0);
        } else {
            vText.setText(act.getString(R$string.f18017P0, String.valueOf(i)));
            vText2.setText(R$string.f17957N0);
        }
        xdl0.m208329E0(viewM20458P.findViewById(u4c0.f174535wa), new View.OnClickListener() { // from class: l.e5e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89424a.m124514r(view);
            }
        });
        this.f101139g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f5e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        this.f101139g.show();
    }
}
