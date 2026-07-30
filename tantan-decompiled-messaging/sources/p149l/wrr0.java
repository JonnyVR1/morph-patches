package p149l;

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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzdyz;
import com.p046p1.mobile.putong.live.base.data.BLiveChatJailedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class wrr0 {

    /* JADX INFO: renamed from: a */
    public final Context f187817a;

    /* JADX INFO: renamed from: b */
    public final dru0 f187818b;

    /* JADX INFO: renamed from: c */
    public String f187819c;

    /* JADX INFO: renamed from: d */
    public String f187820d;

    /* JADX INFO: renamed from: e */
    public String f187821e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f187822f;

    /* JADX INFO: renamed from: g */
    public int f187823g;

    /* JADX INFO: renamed from: h */
    public int f187824h;

    /* JADX INFO: renamed from: i */
    public PointF f187825i;

    /* JADX INFO: renamed from: j */
    public PointF f187826j;

    /* JADX INFO: renamed from: k */
    public Handler f187827k;

    /* JADX INFO: renamed from: l */
    public Runnable f187828l;

    public wrr0(Context context) {
        this.f187823g = 0;
        this.f187828l = new Runnable() { // from class: l.abr0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68743a.m205284g();
            }
        };
        this.f187817a = context;
        this.f187824h = ViewConfiguration.get(context).getScaledTouchSlop();
        vny0.m199084v().m185773b();
        this.f187827k = vny0.m199084v().m185772a();
        this.f187818b = vny0.m199083u().m211388a();
    }

    /* JADX INFO: renamed from: u */
    public static final int m205277u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m205278a() {
        m205296s(this.f187817a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m205279b() {
        m205296s(this.f187817a);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m205280c(rmw0 rmw0Var) {
        if (vny0.m199083u().m211397j(this.f187817a, this.f187820d, this.f187821e)) {
            rmw0Var.execute(new Runnable() { // from class: l.vir0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181637a.m205279b();
                }
            });
        } else {
            vny0.m199083u().m211391d(this.f187817a, this.f187820d, this.f187821e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m205281d(rmw0 rmw0Var) {
        if (vny0.m199083u().m211397j(this.f187817a, this.f187820d, this.f187821e)) {
            rmw0Var.execute(new Runnable() { // from class: l.khr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123204a.m205283f();
                }
            });
        } else {
            vny0.m199083u().m211391d(this.f187817a, this.f187820d, this.f187821e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m205282e() {
        vny0.m199083u().m211390c(this.f187817a);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m205283f() {
        vny0.m199083u().m211390c(this.f187817a);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m205284g() {
        this.f187823g = 4;
        m205295r();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m205285h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.f187818b.m113350l(zzdyz.SHAKE);
            } else {
                int i5 = atomicInteger.get();
                dru0 dru0Var = this.f187818b;
                if (i5 == i3) {
                    dru0Var.m113350l(zzdyz.FLICK);
                } else {
                    dru0Var.m113350l(zzdyz.NONE);
                }
            }
        }
        m205295r();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m205286i(String str, DialogInterface dialogInterface, int i) {
        vny0.m199080r();
        C2075b.m12326s(this.f187817a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(MimeTypes.TEXT_PLAIN).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m205287j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                x2t0.m206864b("Debug mode [Creative Preview] selected.");
                i3t0.f111372a.execute(new Runnable() { // from class: l.ecr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90563a.m205289l();
                    }
                });
                return;
            }
            if (i6 == i3) {
                x2t0.m206864b("Debug mode [Troubleshooting] selected.");
                i3t0.f111372a.execute(new Runnable() { // from class: l.w9r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f185395a.m205288k();
                    }
                });
                return;
            }
            if (i6 == i4) {
                dru0 dru0Var = this.f187818b;
                final rmw0 rmw0Var = i3t0.f111376e;
                rmw0 rmw0Var2 = i3t0.f111372a;
                if (dru0Var.m113354p()) {
                    rmw0Var.execute(new Runnable() { // from class: l.wqr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f187720a.m205282e();
                        }
                    });
                    return;
                } else {
                    rmw0Var2.execute(new Runnable() { // from class: l.q8r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f153213a.m205281d(rmw0Var);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                dru0 dru0Var2 = this.f187818b;
                final rmw0 rmw0Var3 = i3t0.f111376e;
                rmw0 rmw0Var4 = i3t0.f111372a;
                if (dru0Var2.m113354p()) {
                    rmw0Var3.execute(new Runnable() { // from class: l.d7r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f84785a.m205278a();
                        }
                    });
                    return;
                } else {
                    rmw0Var4.execute(new Runnable() { // from class: l.agr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f69392a.m205280c(rmw0Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f187817a instanceof Activity)) {
            x2t0.m206868f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f187819c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            vny0.m199080r();
            Map mapM12322o = C2075b.m12322o(uriBuild);
            for (String str3 : mapM12322o.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapM12322o.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        vny0.m199080r();
        AlertDialog.Builder builderM12317j = C2075b.m12317j(this.f187817a);
        builderM12317j.setMessage(str2);
        builderM12317j.setTitle("Ad Information");
        builderM12317j.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: l.fdr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
                this.f97069a.m205286i(str2, dialogInterface2, i7);
            }
        });
        builderM12317j.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: l.rer0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
            }
        });
        builderM12317j.create().show();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m205288k() {
        xwr0 xwr0VarM199083u = vny0.m199083u();
        String str = this.f187820d;
        String str2 = this.f187821e;
        String str3 = this.f187822f;
        boolean zM211400m = xwr0VarM199083u.m211400m();
        Context context = this.f187817a;
        xwr0VarM199083u.m211395h(xwr0VarM199083u.m211397j(context, str, str2));
        if (!xwr0VarM199083u.m211400m()) {
            xwr0VarM199083u.m211391d(context, str, str2);
            return;
        }
        if (!zM211400m && !TextUtils.isEmpty(str3)) {
            xwr0VarM199083u.m211392e(context, str2, str3, str);
        }
        x2t0.m206864b("Device is linked for debug signals.");
        xwr0VarM199083u.m211396i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m205289l() {
        xwr0 xwr0VarM199083u = vny0.m199083u();
        Context context = this.f187817a;
        String str = this.f187820d;
        String str2 = this.f187821e;
        if (!xwr0VarM199083u.m211398k(context, str, str2)) {
            xwr0VarM199083u.m211396i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(xwr0VarM199083u.f194762f)) {
            x2t0.m206864b("Creative is not pushed for this device.");
            xwr0VarM199083u.m211396i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(xwr0VarM199083u.f194762f)) {
            x2t0.m206864b("The app is not linked for creative preview.");
            xwr0VarM199083u.m211391d(context, str, str2);
        } else if ("0".equals(xwr0VarM199083u.f194762f)) {
            x2t0.m206864b("Device is linked for in app preview.");
            xwr0VarM199083u.m211396i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m205290m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f187823g = 0;
            this.f187825i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f187823g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.f187823g = 5;
                this.f187826j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f187827k.postDelayed(this.f187828l, ((Long) d1s0.m109677c().m144697a(m7s0.f131861B4)).longValue());
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
                    z |= !m205297t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (m205297t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.f187823g = -1;
            this.f187827k.removeCallbacks(this.f187828l);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m205291n(String str) {
        this.f187820d = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m205292o(String str) {
        this.f187821e = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m205293p(String str) {
        this.f187819c = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m205294q(String str) {
        this.f187822f = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m205295r() {
        try {
            if (!(this.f187817a instanceof Activity)) {
                x2t0.m206868f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(vny0.m199083u().m211389b())) {
                str = "Creative preview";
            }
            String str2 = true != vny0.m199083u().m211400m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iM205277u = m205277u(arrayList, "Ad information", true);
            final int iM205277u2 = m205277u(arrayList, str, true);
            final int iM205277u3 = m205277u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue();
            final int iM205277u4 = m205277u(arrayList, "Open ad inspector", zBooleanValue);
            final int iM205277u5 = m205277u(arrayList, "Ad inspector settings", zBooleanValue);
            vny0.m199080r();
            AlertDialog.Builder builderM12317j = C2075b.m12317j(this.f187817a);
            builderM12317j.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l.gkr0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f103220a.m205287j(iM205277u, iM205277u2, iM205277u3, iM205277u4, iM205277u5, dialogInterface, i);
                }
            });
            builderM12317j.create().show();
        } catch (WindowManager.BadTokenException e) {
            xsu0.m210835l("", e);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m205296s(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int iM205277u = m205277u(arrayList, BLiveChatJailedType.None, true);
        final int iM205277u2 = m205277u(arrayList, "Shake", true);
        final int iM205277u3 = m205277u(arrayList, "Flick", true);
        zzdyz zzdyzVar = zzdyz.NONE;
        int iOrdinal = this.f187818b.m113339a().ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iM205277u : iM205277u3;
        } else {
            i = iM205277u2;
        }
        vny0.m199080r();
        AlertDialog.Builder builderM12317j = C2075b.m12317j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderM12317j.setTitle("Setup gesture");
        builderM12317j.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: l.qlr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        builderM12317j.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: l.tmr0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f171168a.m205295r();
            }
        });
        builderM12317j.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: l.dor0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f87190a.m205285h(atomicInteger, i, iM205277u2, iM205277u3, dialogInterface, i2);
            }
        });
        builderM12317j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.lpr0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f129246a.m205295r();
            }
        });
        builderM12317j.create().show();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m205297t(float f, float f2, float f3, float f4) {
        return Math.abs(this.f187825i.x - f) < ((float) this.f187824h) && Math.abs(this.f187825i.y - f2) < ((float) this.f187824h) && Math.abs(this.f187826j.x - f3) < ((float) this.f187824h) && Math.abs(this.f187826j.y - f4) < ((float) this.f187824h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f187819c);
        sb.append(",DebugSignal: ");
        sb.append(this.f187822f);
        sb.append(",AFMA Version: ");
        sb.append(this.f187821e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f187820d);
        sb.append("}");
        return sb.toString();
    }

    public wrr0(Context context, String str) {
        this(context);
        this.f187819c = str;
    }
}
