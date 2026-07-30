package p153l;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.service.C14983af;
import com.xiaomi.push.service.C14984ag;
import com.xiaomi.push.service.C15031x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xzq0 extends vzq0 {

    /* JADX INFO: renamed from: b */
    private RemoteViews f196905b;

    /* JADX INFO: renamed from: c */
    private boolean f196906c;

    /* JADX INFO: renamed from: d */
    protected Bitmap f196907d;

    /* JADX INFO: renamed from: e */
    protected CharSequence f196908e;

    /* JADX INFO: renamed from: f */
    protected CharSequence f196909f;

    /* JADX INFO: renamed from: g */
    protected Map<String, String> f196910g;

    /* JADX INFO: renamed from: h */
    private int f196911h;

    /* JADX INFO: renamed from: i */
    private String f196912i;

    /* JADX INFO: renamed from: j */
    private boolean f196913j;

    /* JADX INFO: renamed from: k */
    private ArrayList<Notification.Action> f196914k;

    /* JADX INFO: renamed from: l */
    private int f196915l;

    public xzq0(Context context, int i, String str) {
        super(context);
        this.f196914k = new ArrayList<>();
        this.f196915l = 0;
        this.f196912i = str;
        this.f196911h = i;
        m213785A();
    }

    /* JADX INFO: renamed from: A */
    private void m213785A() {
        int iM204117a = m204117a(m204119c().getResources(), m213792z(), "layout", m204119c().getPackageName());
        if (iM204117a == 0) {
            ouq0.m169393m("create RemoteViews failed, no such layout resource was found");
        } else {
            this.f196905b = new RemoteViews(m204119c().getPackageName(), iM204117a);
            this.f196906c = mo198858t();
        }
    }

    /* JADX INFO: renamed from: B */
    private boolean m213786B() {
        Map<String, String> map = this.f196910g;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    /* JADX INFO: renamed from: C */
    private void m213787C() {
        super.setContentTitle(this.f196908e);
        super.setContentText(this.f196909f);
    }

    /* JADX INFO: renamed from: D */
    private boolean m213788D() {
        return (TextUtils.isEmpty(mo198859v()) || TextUtils.isEmpty(this.f196912i)) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    private boolean m213789E() {
        return m213788D() && m213790F();
    }

    /* JADX INFO: renamed from: F */
    private boolean m213790F() {
        List<StatusBarNotification> listM87622b = C14983af.m87599a(m204119c(), this.f196912i).m87622b();
        if (listM87622b != null && !listM87622b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : listM87622b) {
                if (statusBarNotification.getId() == this.f196911h) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification == null) {
                        return false;
                    }
                    return !notification.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private Bitmap m213791j() {
        return C15031x.m88032a(C14887g.m86755d(m204119c(), this.f196912i));
    }

    /* JADX INFO: renamed from: z */
    private String m213792z() {
        boolean zM213789E = m213789E();
        this.f196913j = zM213789E;
        return zM213789E ? mo198859v() : mo198856m();
    }

    @Override // p153l.vzq0
    /* JADX INFO: renamed from: g */
    public vzq0 mo204123g(Map<String, String> map) {
        this.f196910g = map;
        return this;
    }

    @Override // p153l.vzq0
    /* JADX INFO: renamed from: h */
    public void mo198855h() {
        super.mo198855h();
        Bundle bundle = new Bundle();
        if (m213788D()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f196913j);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", m204118b("large_icon"));
        if (this.f196914k.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f196914k.size()];
            this.f196914k.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m213786B() || !C14984ag.m87641a(m204119c().getContentResolver())) {
            m213787C();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f196908e);
            bundle.putCharSequence("mipush.customContent", this.f196909f);
        }
        addExtras(bundle);
    }

    /* JADX INFO: renamed from: i */
    public int m213793i(float f) {
        return (int) ((f * m204119c().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m213794k(Bitmap bitmap, float f) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public final RemoteViews m213795l() {
        return this.f196905b;
    }

    /* JADX INFO: renamed from: m */
    public abstract String mo198856m();

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public xzq0 addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public xzq0 addAction(Notification.Action action) {
        if (action != null) {
            this.f196914k.add(action);
        }
        int i = this.f196915l;
        this.f196915l = i + 1;
        m213800s(i, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public xzq0 setLargeIcon(Bitmap bitmap) {
        this.f196907d = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public xzq0 setContentTitle(CharSequence charSequence) {
        this.f196908e = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m213799r(int i) {
        Bitmap bitmapM213791j = m213791j();
        if (bitmapM213791j != null) {
            m213795l().setImageViewBitmap(i, bitmapM213791j);
            return;
        }
        int iM86764m = C14887g.m86764m(m204119c(), this.f196912i);
        if (iM86764m != 0) {
            m213795l().setImageViewResource(i, iM86764m);
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo198858t();

    /* JADX INFO: renamed from: u */
    public final boolean m213801u(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }

    /* JADX INFO: renamed from: v */
    public abstract String mo198859v();

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public xzq0 setContentText(CharSequence charSequence) {
        this.f196909f = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final void m213803x() {
        super.setContentTitle(this.f196908e);
        super.setContentText(this.f196909f);
        Bitmap bitmap = this.f196907d;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m213804y() {
        return this.f196906c;
    }

    public xzq0(Context context, String str) {
        this(context, 0, str);
    }

    /* JADX INFO: renamed from: s */
    public void m213800s(int i, Notification.Action action) {
    }
}
