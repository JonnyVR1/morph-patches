package p153l;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzdyz;
import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class c1s0 {

    /* JADX INFO: renamed from: a */
    public final Context f79420a;

    /* JADX INFO: renamed from: b */
    public final j0v0 f79421b;

    /* JADX INFO: renamed from: c */
    public String f79422c;

    /* JADX INFO: renamed from: d */
    public String f79423d;

    /* JADX INFO: renamed from: e */
    public String f79424e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f79425f;

    /* JADX INFO: renamed from: g */
    public int f79426g;

    /* JADX INFO: renamed from: h */
    public int f79427h;

    /* JADX INFO: renamed from: i */
    public PointF f79428i;

    /* JADX INFO: renamed from: j */
    public PointF f79429j;

    /* JADX INFO: renamed from: k */
    public Handler f79430k;

    /* JADX INFO: renamed from: l */
    public Runnable f79431l;

    public c1s0(Context context) {
        this.f79426g = 0;
        this.f79431l = new Runnable() { // from class: l.gkr0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104763a.m107644g();
            }
        };
        this.f79420a = context;
        this.f79427h = ViewConfiguration.get(context).getScaledTouchSlop();
        bxy0.m106938v().m213967b();
        this.f79430k = bxy0.m106938v().m213966a();
        this.f79421b = bxy0.m106937u().m114532a();
    }

    /* JADX INFO: renamed from: u */
    public static final int m107637u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m107638a() {
        m107656s(this.f79420a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m107639b() {
        m107656s(this.f79420a);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m107640c(xvw0 xvw0Var) {
        if (bxy0.m106937u().m114541j(this.f79420a, this.f79423d, this.f79424e)) {
            xvw0Var.execute(new Runnable() { // from class: l.bsr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78189a.m107639b();
                }
            });
        } else {
            bxy0.m106937u().m114535d(this.f79420a, this.f79423d, this.f79424e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m107641d(xvw0 xvw0Var) {
        if (bxy0.m106937u().m114541j(this.f79420a, this.f79423d, this.f79424e)) {
            xvw0Var.execute(new Runnable() { // from class: l.qqr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159036a.m107643f();
                }
            });
        } else {
            bxy0.m106937u().m114535d(this.f79420a, this.f79423d, this.f79424e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m107642e() {
        bxy0.m106937u().m114534c(this.f79420a);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m107643f() {
        bxy0.m106937u().m114534c(this.f79420a);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m107644g() {
        this.f79426g = 4;
        m107655r();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m107645h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.f79421b.m143047l(zzdyz.SHAKE);
            } else {
                int i5 = atomicInteger.get();
                j0v0 j0v0Var = this.f79421b;
                if (i5 == i3) {
                    j0v0Var.m143047l(zzdyz.FLICK);
                } else {
                    j0v0Var.m143047l(zzdyz.NONE);
                }
            }
        }
        m107655r();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m107646i(String str, DialogInterface dialogInterface, int i) {
        bxy0.m106934r();
        C2098b.m12380s(this.f79420a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(MimeTypes.TEXT_PLAIN).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m107647j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                dct0.m115293b("Debug mode [Creative Preview] selected.");
                oct0.f146733a.execute(new Runnable() { // from class: l.klr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f127408a.m107649l();
                    }
                });
                return;
            }
            if (i6 == i3) {
                dct0.m115293b("Debug mode [Troubleshooting] selected.");
                oct0.f146733a.execute(new Runnable() { // from class: l.cjr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82210a.m107648k();
                    }
                });
                return;
            }
            if (i6 == i4) {
                j0v0 j0v0Var = this.f79421b;
                final xvw0 xvw0Var = oct0.f146737e;
                xvw0 xvw0Var2 = oct0.f146733a;
                if (j0v0Var.m143051p()) {
                    xvw0Var.execute(new Runnable() { // from class: l.c0s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79295a.m107642e();
                        }
                    });
                    return;
                } else {
                    xvw0Var2.execute(new Runnable() { // from class: l.whr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f189189a.m107641d(xvw0Var);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                j0v0 j0v0Var2 = this.f79421b;
                final xvw0 xvw0Var3 = oct0.f146737e;
                xvw0 xvw0Var4 = oct0.f146733a;
                if (j0v0Var2.m143051p()) {
                    xvw0Var3.execute(new Runnable() { // from class: l.jgr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f120758a.m107638a();
                        }
                    });
                    return;
                } else {
                    xvw0Var4.execute(new Runnable() { // from class: l.gpr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f105476a.m107640c(xvw0Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f79420a instanceof Activity)) {
            dct0.m115297f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f79422c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            bxy0.m106934r();
            Map mapM12376o = C2098b.m12376o(uriBuild);
            for (String str3 : mapM12376o.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapM12376o.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        bxy0.m106934r();
        AlertDialog.Builder builderM12371j = C2098b.m12371j(this.f79420a);
        builderM12371j.setMessage(str2);
        builderM12371j.setTitle("Ad Information");
        builderM12371j.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: l.lmr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
                this.f132714a.m107646i(str2, dialogInterface2, i7);
            }
        });
        builderM12371j.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: l.xnr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
            }
        });
        builderM12371j.create().show();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m107648k() {
        d6s0 d6s0VarM106937u = bxy0.m106937u();
        String str = this.f79423d;
        String str2 = this.f79424e;
        String str3 = this.f79425f;
        boolean zM114544m = d6s0VarM106937u.m114544m();
        Context context = this.f79420a;
        d6s0VarM106937u.m114539h(d6s0VarM106937u.m114541j(context, str, str2));
        if (!d6s0VarM106937u.m114544m()) {
            d6s0VarM106937u.m114535d(context, str, str2);
            return;
        }
        if (!zM114544m && !TextUtils.isEmpty(str3)) {
            d6s0VarM106937u.m114536e(context, str2, str3, str);
        }
        dct0.m115293b("Device is linked for debug signals.");
        d6s0VarM106937u.m114540i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m107649l() {
        d6s0 d6s0VarM106937u = bxy0.m106937u();
        Context context = this.f79420a;
        String str = this.f79423d;
        String str2 = this.f79424e;
        if (!d6s0VarM106937u.m114542k(context, str, str2)) {
            d6s0VarM106937u.m114540i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(d6s0VarM106937u.f85404f)) {
            dct0.m115293b("Creative is not pushed for this device.");
            d6s0VarM106937u.m114540i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(d6s0VarM106937u.f85404f)) {
            dct0.m115293b("The app is not linked for creative preview.");
            d6s0VarM106937u.m114535d(context, str, str2);
        } else if ("0".equals(d6s0VarM106937u.f85404f)) {
            dct0.m115293b("Device is linked for in app preview.");
            d6s0VarM106937u.m114540i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m107650m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f79426g = 0;
            this.f79428i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f79426g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.f79426g = 5;
                this.f79429j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f79430k.postDelayed(this.f79431l, ((Long) jas0.m144075c().m176505a(sgs0.f167932B4)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !m107657t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (m107657t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.f79426g = -1;
            this.f79430k.removeCallbacks(this.f79431l);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m107651n(String str) {
        this.f79423d = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m107652o(String str) {
        this.f79424e = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m107653p(String str) {
        this.f79422c = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m107654q(String str) {
        this.f79425f = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m107655r() {
        try {
            if (!(this.f79420a instanceof Activity)) {
                dct0.m115297f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(bxy0.m106937u().m114533b())) {
                str = "Creative preview";
            }
            String str2 = true != bxy0.m106937u().m114544m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iM107637u = m107637u(arrayList, "Ad information", true);
            final int iM107637u2 = m107637u(arrayList, str, true);
            final int iM107637u3 = m107637u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue();
            final int iM107637u4 = m107637u(arrayList, "Open ad inspector", zBooleanValue);
            final int iM107637u5 = m107637u(arrayList, "Ad inspector settings", zBooleanValue);
            bxy0.m106934r();
            AlertDialog.Builder builderM12371j = C2098b.m12371j(this.f79420a);
            builderM12371j.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l.mtr0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f138658a.m107647j(iM107637u, iM107637u2, iM107637u3, iM107637u4, iM107637u5, dialogInterface, i);
                }
            });
            builderM12371j.create().show();
        } catch (WindowManager.BadTokenException e) {
            d2v0.m113738l("", e);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m107656s(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int iM107637u = m107637u(arrayList, BLiveChatJailedType.None, true);
        final int iM107637u2 = m107637u(arrayList, "Shake", true);
        final int iM107637u3 = m107637u(arrayList, "Flick", true);
        zzdyz zzdyzVar = zzdyz.NONE;
        int iOrdinal = this.f79421b.m143036a().ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iM107637u : iM107637u3;
        } else {
            i = iM107637u2;
        }
        bxy0.m106934r();
        AlertDialog.Builder builderM12371j = C2098b.m12371j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderM12371j.setTitle("Setup gesture");
        builderM12371j.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: l.wur0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        builderM12371j.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: l.zvr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f206281a.m107655r();
            }
        });
        builderM12371j.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: l.jxr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f123071a.m107645h(atomicInteger, i, iM107637u2, iM107637u3, dialogInterface, i2);
            }
        });
        builderM12371j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.ryr0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f165456a.m107655r();
            }
        });
        builderM12371j.create().show();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m107657t(float f, float f2, float f3, float f4) {
        return Math.abs(this.f79428i.x - f) < ((float) this.f79427h) && Math.abs(this.f79428i.y - f2) < ((float) this.f79427h) && Math.abs(this.f79429j.x - f3) < ((float) this.f79427h) && Math.abs(this.f79429j.y - f4) < ((float) this.f79427h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f79422c);
        sb.append(",DebugSignal: ");
        sb.append(this.f79425f);
        sb.append(",AFMA Version: ");
        sb.append(this.f79424e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f79423d);
        sb.append("}");
        return sb.toString();
    }

    public c1s0(Context context, String str) {
        this(context);
        this.f79422c = str;
    }
}
