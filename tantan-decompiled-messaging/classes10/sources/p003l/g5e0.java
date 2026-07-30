package p003l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l.a4g0;
import l.cwf0;
import l.e30;
import l.e51;
import l.f6c0;
import l.i0e;
import l.j760;
import l.jo0;
import l.mkd0;
import l.u4c0;
import l.u59;
import l.upa;
import l.vwb;
import l.xdl0;
import l.z3g0;
import rx.subjects.b;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g5e0 {

    /* JADX INFO: renamed from: j */
    public static final String f4566j = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: k */
    public static final String f4567k = MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: l */
    public static final String[] f4568l = {"_display_name", "_data", "date_added"};

    /* JADX INFO: renamed from: m */
    public static List<String> f4569m = Arrays.asList("screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "截屏", "截图");

    /* JADX INFO: renamed from: a */
    public ContentResolver f4570a;

    /* JADX INFO: renamed from: b */
    public ContentObserver f4571b;

    /* JADX INFO: renamed from: c */
    public int f4572c;

    /* JADX INFO: renamed from: d */
    public b<String> f4573d;

    /* JADX INFO: renamed from: e */
    public List<String> f4574e;

    /* JADX INFO: renamed from: f */
    public boolean f4575f;

    /* JADX INFO: renamed from: g */
    public Dialog f4576g;

    /* JADX INFO: renamed from: h */
    public z3g0 f4577h;

    /* JADX INFO: renamed from: i */
    public boolean f4578i;

    /* JADX INFO: renamed from: l.g5e0$a */
    public class C3333a extends ContentObserver {
        public C3333a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            Uri uri2;
            if (PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE"})) {
                if (uri.toString().startsWith(g5e0.f4567k) || uri.toString().startsWith(g5e0.f4566j)) {
                    Cursor cursorQuery = null;
                    try {
                        try {
                            uri2 = uri;
                            try {
                                cursorQuery = g5e0.this.f4570a.query(uri2, g5e0.f4568l, null, null, "date_added DESC");
                                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("date_added"));
                                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                    if (g5e0.this.f4574e.contains(string)) {
                                        cursorQuery.close();
                                        return;
                                    }
                                    g5e0.this.f4574e.add(string);
                                    if (e51.A(CoreModule.b) && g5e0.m6595s(string) && g5e0.m6596t(jCurrentTimeMillis, j) && g5e0.this.f4575f) {
                                        g5e0.this.f4573d.onNext(string);
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
    public static class C3334b {
        static g5e0 INSTANCE = new g5e0();
    }

    @SuppressLint({"Range"})
    public g5e0() {
        this.f4573d = b.b();
        this.f4574e = new ArrayList();
        this.f4575f = false;
        this.f4578i = false;
        this.f4570a = CoreModule.b.getContentResolver();
        this.f4571b = new C3333a(null);
    }

    /* JADX INFO: renamed from: o */
    public static g5e0 m6594o() {
        return C3334b.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m6595s(String str) {
        Iterator<String> it = f4569m.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m6596t(long j, long j2) {
        return Math.abs(j - j2) <= 10;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m6597u() {
        User userMe_ = CoreModule.K().me_();
        if (NullChecker.a(userMe_) && NullChecker.a(userMe_.settings)) {
            Settings settings = userMe_.settings;
            PhoneNumber phoneNumber = settings.phoneNumber;
            PhoneNumber phoneNumber2 = settings.linkedPhoneNumber;
            if ((NullChecker.a(phoneNumber) && phoneNumber.countryCode == 93) || (NullChecker.a(phoneNumber2) && phoneNumber2.countryCode == 93)) {
                return false;
            }
        }
        boolean zM0 = u59.m0();
        if (zM0 && u59.s(CoreModule.H().userId())) {
            return false;
        }
        if (zM0 || !CoreModule.c.e1.a3()) {
            return upa.w1();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m6598n() {
        this.f4578i = true;
        this.f4572c = 0;
        z3g0 z3g0VarA = a4g0.a();
        this.f4577h = z3g0VarA;
        z3g0VarA.b(Act.foreground().subscribe(mkd0.G(new e30() { // from class: l.c5e0
            public final void call(Object obj) {
                this.f3978a.m6599p((Act.r) obj);
            }
        })));
        this.f4577h.b(this.f4573d.onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.d5e0
            public final void call(Object obj) {
                this.f4113a.m6600q((String) obj);
            }
        })));
        this.f4570a.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f4571b);
        this.f4570a.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f4571b);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6599p(Act.r rVar) {
        if (rVar == null) {
            this.f4575f = false;
        } else {
            Activity activity = (Activity) rVar.a.get();
            this.f4575f = (activity instanceof NewMainAct) || (activity instanceof LikersAct) || (activity instanceof ProfileAct) || CoreModule.N().hr(activity);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m6600q(String str) {
        if (m6597u() && !TextUtils.isEmpty(str)) {
            Activity activity = (Act.foreground_() == null || Act.foreground_().a == null) ? null : (Activity) Act.foreground_().a.get();
            if (activity instanceof NewMainAct) {
                if (((NewMainAct) activity).e6(TabName.Card)) {
                    m6603w((Act) activity, str);
                }
            } else if (activity instanceof ProfileAct) {
                if (((ProfileAct) activity).Y2().P1()) {
                    return;
                }
                m6603w((Act) activity, str);
            } else if (activity instanceof Act) {
                m6603w((Act) activity, str);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m6601r(View view) {
        this.f4576g.dismiss();
        this.f4576g = null;
    }

    /* JADX INFO: renamed from: v */
    public void m6602v() {
        if (this.f4578i) {
            this.f4572c = 0;
            this.f4573d.onNext("");
            if (NullChecker.a(this.f4577h)) {
                this.f4577h.unsubscribe();
            }
            this.f4577h = a4g0.a();
            this.f4570a.unregisterContentObserver(this.f4571b);
            this.f4578i = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6603w(Act act, String str) {
        if (act == null || act.isFinishing() || act.isDestroyed() || TextUtils.isEmpty(str)) {
            return;
        }
        if (NullChecker.a(this.f4576g) && this.f4576g.isShowing()) {
            return;
        }
        this.f4572c++;
        final cwf0 cwf0VarC = i0e.c("p_get_screenshoot_warning", g5e0.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        Dialog dialogZ = act.dialog().u().M(f6c0.Kb).B(false).z();
        this.f4576g = dialogZ;
        View viewP = dialogZ.P();
        VText vTextFindViewById = viewP.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewP.findViewById(u4c0.P1);
        int i = this.f4572c;
        if (i == 1) {
            vTextFindViewById.setText(R.string.Q0);
            vTextFindViewById2.setText(R.string.O0);
        } else {
            vTextFindViewById.setText(act.getString(R.string.P0, String.valueOf(i)));
            vTextFindViewById2.setText(R.string.N0);
        }
        xdl0.E0(viewP.findViewById(u4c0.wa), new View.OnClickListener() { // from class: l.e5e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4258a.m6601r(view);
            }
        });
        this.f4576g.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f5e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
        this.f4576g.show();
    }
}
