package p149l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.service.C14883x;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class qqq0 extends rqq0 {

    /* JADX INFO: renamed from: m */
    private int f155925m;

    /* JADX INFO: renamed from: n */
    private Bitmap f155926n;

    /* JADX INFO: renamed from: o */
    private CharSequence f155927o;

    /* JADX INFO: renamed from: p */
    private PendingIntent f155928p;

    /* JADX INFO: renamed from: q */
    private int f155929q;

    /* JADX INFO: renamed from: r */
    private int f155930r;

    public qqq0(Context context, int i, String str) {
        super(context, i, str);
        this.f155925m = 16777216;
        this.f155929q = 16777216;
        this.f155930r = 16777216;
    }

    /* JADX INFO: renamed from: G */
    private Drawable m175953G(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: K */
    private void m175954K(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int iM180479i = m180479i(6.0f);
        remoteViews.setViewPadding(i, iM180479i, 0, iM180479i, 0);
        if (z) {
            remoteViews.setTextColor(i2, -1);
            remoteViews.setTextColor(i3, -1);
        } else {
            remoteViews.setTextColor(i2, RoundedDrawable.DEFAULT_BORDER_COLOR);
            remoteViews.setTextColor(i3, RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: H */
    public qqq0 m175955H(Bitmap bitmap) {
        if (m180490y() && bitmap != null) {
            if (bitmap.getWidth() == 984 && bitmap.getHeight() >= 177 && bitmap.getHeight() <= 207) {
                this.f155926n = bitmap;
                return this;
            }
            ilq0.m137040m("colorful notification bg image resolution error, must [984*177, 984*207]");
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public qqq0 m175956I(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m180490y()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f155927o = charSequence;
            this.f155928p = pendingIntent;
        }
        return this;
    }

    /* JADX INFO: renamed from: J */
    public qqq0 m175957J(String str) {
        if (m180490y() && !TextUtils.isEmpty(str)) {
            try {
                this.f155929q = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ilq0.m137040m("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public qqq0 m175958L(String str) {
        if (m180490y() && !TextUtils.isEmpty(str)) {
            try {
                this.f155925m = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ilq0.m137040m("parse colorful notification bg color error");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public qqq0 m175959M(String str) {
        if (m180490y() && !TextUtils.isEmpty(str)) {
            try {
                this.f155930r = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ilq0.m137040m("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // p149l.rqq0, p149l.pqq0
    /* JADX INFO: renamed from: h */
    public void mo165479h() {
        if (!m180490y()) {
            m180489x();
            return;
        }
        super.mo165479h();
        Resources resources = m170930c().getResources();
        String packageName = m170930c().getPackageName();
        int iM170928a = m170928a(resources, "icon", "id", packageName);
        if (this.f160680d == null) {
            m180485r(iM170928a);
        } else {
            m180481l().setImageViewBitmap(iM170928a, this.f160680d);
        }
        int iM170928a2 = m170928a(resources, "title", "id", packageName);
        int iM170928a3 = m170928a(resources, "content", "id", packageName);
        m180481l().setTextViewText(iM170928a2, this.f160681e);
        m180481l().setTextViewText(iM170928a3, this.f160682f);
        if (!TextUtils.isEmpty(this.f155927o)) {
            int iM170928a4 = m170928a(resources, "buttonContainer", "id", packageName);
            int iM170928a5 = m170928a(resources, "button", "id", packageName);
            int iM170928a6 = m170928a(resources, "buttonBg", "id", packageName);
            m180481l().setViewVisibility(iM170928a4, 0);
            m180481l().setTextViewText(iM170928a5, this.f155927o);
            m180481l().setOnClickPendingIntent(iM170928a4, this.f155928p);
            if (this.f155929q != 16777216) {
                int iM180479i = m180479i(70.0f);
                int iM180479i2 = m180479i(29.0f);
                m180481l().setImageViewBitmap(iM170928a6, C14883x.m86861a(m175953G(this.f155929q, iM180479i, iM180479i2, iM180479i2 / 2.0f)));
                m180481l().setTextColor(iM170928a5, m180487u(this.f155929q) ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
            }
        }
        int iM170928a7 = m170928a(resources, Constants.KEY_BG, "id", packageName);
        int iM170928a8 = m170928a(resources, "container", "id", packageName);
        if (this.f155925m != 16777216) {
            if (fvq0.m123348b(m170930c()) >= 10) {
                m180481l().setImageViewBitmap(iM170928a7, C14883x.m86861a(m175953G(this.f155925m, 984, 192, 30.0f)));
            } else {
                m180481l().setImageViewBitmap(iM170928a7, C14883x.m86861a(m175953G(this.f155925m, 984, 192, 0.0f)));
            }
            m175954K(m180481l(), iM170928a8, iM170928a2, iM170928a3, m180487u(this.f155925m));
        } else if (this.f155926n != null) {
            if (fvq0.m123348b(m170930c()) >= 10) {
                m180481l().setImageViewBitmap(iM170928a7, m180480k(this.f155926n, 30.0f));
            } else {
                m180481l().setImageViewBitmap(iM170928a7, this.f155926n);
            }
            Map<String, String> map = this.f160683g;
            if (map != null && this.f155930r == 16777216) {
                m175959M(map.get("notification_image_text_color"));
            }
            int i = this.f155930r;
            m175954K(m180481l(), iM170928a8, iM170928a2, iM170928a3, i == 16777216 || !m180487u(i));
        } else {
            m180481l().setViewVisibility(iM170928a, 8);
            m180481l().setViewVisibility(iM170928a7, 8);
            try {
                ikq0.m136882e(this, "setStyle", nwq0.m161880c(m170930c(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                ilq0.m137040m("load class DecoratedCustomViewStyle failed");
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
        setCustomContentView(m180481l());
    }

    @Override // p149l.rqq0
    /* JADX INFO: renamed from: m */
    public String mo165480m() {
        return "notification_colorful";
    }

    @Override // p149l.rqq0
    /* JADX INFO: renamed from: t */
    public boolean mo165482t() {
        if (!fvq0.m123355i()) {
            return false;
        }
        Resources resources = m170930c().getResources();
        String packageName = m170930c().getPackageName();
        return (m170928a(resources, "icon", "id", packageName) == 0 || m170928a(resources, "title", "id", packageName) == 0 || m170928a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    @Override // p149l.rqq0
    /* JADX INFO: renamed from: v */
    public String mo165483v() {
        return "notification_colorful_copy";
    }
}
