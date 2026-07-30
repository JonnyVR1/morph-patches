package p149l;

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
import com.xiaomi.push.C14739g;
import com.xiaomi.push.service.C14835af;
import com.xiaomi.push.service.C14836ag;
import com.xiaomi.push.service.C14883x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rqq0 extends pqq0 {

    /* JADX INFO: renamed from: b */
    private RemoteViews f160678b;

    /* JADX INFO: renamed from: c */
    private boolean f160679c;

    /* JADX INFO: renamed from: d */
    protected Bitmap f160680d;

    /* JADX INFO: renamed from: e */
    protected CharSequence f160681e;

    /* JADX INFO: renamed from: f */
    protected CharSequence f160682f;

    /* JADX INFO: renamed from: g */
    protected Map<String, String> f160683g;

    /* JADX INFO: renamed from: h */
    private int f160684h;

    /* JADX INFO: renamed from: i */
    private String f160685i;

    /* JADX INFO: renamed from: j */
    private boolean f160686j;

    /* JADX INFO: renamed from: k */
    private ArrayList<Notification.Action> f160687k;

    /* JADX INFO: renamed from: l */
    private int f160688l;

    public rqq0(Context context, int i, String str) {
        super(context);
        this.f160687k = new ArrayList<>();
        this.f160688l = 0;
        this.f160685i = str;
        this.f160684h = i;
        m180471A();
    }

    /* JADX INFO: renamed from: A */
    private void m180471A() {
        int iM170928a = m170928a(m170930c().getResources(), m180478z(), "layout", m170930c().getPackageName());
        if (iM170928a == 0) {
            ilq0.m137040m("create RemoteViews failed, no such layout resource was found");
        } else {
            this.f160678b = new RemoteViews(m170930c().getPackageName(), iM170928a);
            this.f160679c = mo165482t();
        }
    }

    /* JADX INFO: renamed from: B */
    private boolean m180472B() {
        Map<String, String> map = this.f160683g;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    /* JADX INFO: renamed from: C */
    private void m180473C() {
        super.setContentTitle(this.f160681e);
        super.setContentText(this.f160682f);
    }

    /* JADX INFO: renamed from: D */
    private boolean m180474D() {
        return (TextUtils.isEmpty(mo165483v()) || TextUtils.isEmpty(this.f160685i)) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    private boolean m180475E() {
        return m180474D() && m180476F();
    }

    /* JADX INFO: renamed from: F */
    private boolean m180476F() {
        List<StatusBarNotification> listM86451b = C14835af.m86428a(m170930c(), this.f160685i).m86451b();
        if (listM86451b != null && !listM86451b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : listM86451b) {
                if (statusBarNotification.getId() == this.f160684h) {
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
    private Bitmap m180477j() {
        return C14883x.m86861a(C14739g.m85584d(m170930c(), this.f160685i));
    }

    /* JADX INFO: renamed from: z */
    private String m180478z() {
        boolean zM180475E = m180475E();
        this.f160686j = zM180475E;
        return zM180475E ? mo165483v() : mo165480m();
    }

    @Override // p149l.pqq0
    /* JADX INFO: renamed from: g */
    public pqq0 mo170934g(Map<String, String> map) {
        this.f160683g = map;
        return this;
    }

    @Override // p149l.pqq0
    /* JADX INFO: renamed from: h */
    public void mo165479h() {
        super.mo165479h();
        Bundle bundle = new Bundle();
        if (m180474D()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f160686j);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", m170929b("large_icon"));
        if (this.f160687k.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f160687k.size()];
            this.f160687k.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m180472B() || !C14836ag.m86470a(m170930c().getContentResolver())) {
            m180473C();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f160681e);
            bundle.putCharSequence("mipush.customContent", this.f160682f);
        }
        addExtras(bundle);
    }

    /* JADX INFO: renamed from: i */
    public int m180479i(float f) {
        return (int) ((f * m170930c().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m180480k(Bitmap bitmap, float f) {
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
    public final RemoteViews m180481l() {
        return this.f160678b;
    }

    /* JADX INFO: renamed from: m */
    public abstract String mo165480m();

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public rqq0 addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public rqq0 addAction(Notification.Action action) {
        if (action != null) {
            this.f160687k.add(action);
        }
        int i = this.f160688l;
        this.f160688l = i + 1;
        m180486s(i, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public rqq0 setLargeIcon(Bitmap bitmap) {
        this.f160680d = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public rqq0 setContentTitle(CharSequence charSequence) {
        this.f160681e = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m180485r(int i) {
        Bitmap bitmapM180477j = m180477j();
        if (bitmapM180477j != null) {
            m180481l().setImageViewBitmap(i, bitmapM180477j);
            return;
        }
        int iM85593m = C14739g.m85593m(m170930c(), this.f160685i);
        if (iM85593m != 0) {
            m180481l().setImageViewResource(i, iM85593m);
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo165482t();

    /* JADX INFO: renamed from: u */
    public final boolean m180487u(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }

    /* JADX INFO: renamed from: v */
    public abstract String mo165483v();

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public rqq0 setContentText(CharSequence charSequence) {
        this.f160682f = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final void m180489x() {
        super.setContentTitle(this.f160681e);
        super.setContentText(this.f160682f);
        Bitmap bitmap = this.f160680d;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m180490y() {
        return this.f160679c;
    }

    public rqq0(Context context, String str) {
        this(context, 0, str);
    }

    /* JADX INFO: renamed from: s */
    public void m180486s(int i, Notification.Action action) {
    }
}
