package p153l;

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
import com.xiaomi.push.service.C15031x;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class wzq0 extends xzq0 {

    /* JADX INFO: renamed from: m */
    private int f191820m;

    /* JADX INFO: renamed from: n */
    private Bitmap f191821n;

    /* JADX INFO: renamed from: o */
    private CharSequence f191822o;

    /* JADX INFO: renamed from: p */
    private PendingIntent f191823p;

    /* JADX INFO: renamed from: q */
    private int f191824q;

    /* JADX INFO: renamed from: r */
    private int f191825r;

    public wzq0(Context context, int i, String str) {
        super(context, i, str);
        this.f191820m = 16777216;
        this.f191824q = 16777216;
        this.f191825r = 16777216;
    }

    /* JADX INFO: renamed from: G */
    private Drawable m208741G(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: K */
    private void m208742K(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int iM213793i = m213793i(6.0f);
        remoteViews.setViewPadding(i, iM213793i, 0, iM213793i, 0);
        if (z) {
            remoteViews.setTextColor(i2, -1);
            remoteViews.setTextColor(i3, -1);
        } else {
            remoteViews.setTextColor(i2, RoundedDrawable.DEFAULT_BORDER_COLOR);
            remoteViews.setTextColor(i3, RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: H */
    public wzq0 m208743H(Bitmap bitmap) {
        if (m213804y() && bitmap != null) {
            if (bitmap.getWidth() == 984 && bitmap.getHeight() >= 177 && bitmap.getHeight() <= 207) {
                this.f191821n = bitmap;
                return this;
            }
            ouq0.m169393m("colorful notification bg image resolution error, must [984*177, 984*207]");
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public wzq0 m208744I(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m213804y()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f191822o = charSequence;
            this.f191823p = pendingIntent;
        }
        return this;
    }

    /* JADX INFO: renamed from: J */
    public wzq0 m208745J(String str) {
        if (m213804y() && !TextUtils.isEmpty(str)) {
            try {
                this.f191824q = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ouq0.m169393m("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public wzq0 m208746L(String str) {
        if (m213804y() && !TextUtils.isEmpty(str)) {
            try {
                this.f191820m = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ouq0.m169393m("parse colorful notification bg color error");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public wzq0 m208747M(String str) {
        if (m213804y() && !TextUtils.isEmpty(str)) {
            try {
                this.f191825r = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ouq0.m169393m("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // p153l.xzq0, p153l.vzq0
    /* JADX INFO: renamed from: h */
    public void mo198855h() {
        if (!m213804y()) {
            m213803x();
            return;
        }
        super.mo198855h();
        Resources resources = m204119c().getResources();
        String packageName = m204119c().getPackageName();
        int iM204117a = m204117a(resources, "icon", "id", packageName);
        if (this.f196907d == null) {
            m213799r(iM204117a);
        } else {
            m213795l().setImageViewBitmap(iM204117a, this.f196907d);
        }
        int iM204117a2 = m204117a(resources, "title", "id", packageName);
        int iM204117a3 = m204117a(resources, "content", "id", packageName);
        m213795l().setTextViewText(iM204117a2, this.f196908e);
        m213795l().setTextViewText(iM204117a3, this.f196909f);
        if (!TextUtils.isEmpty(this.f191822o)) {
            int iM204117a4 = m204117a(resources, "buttonContainer", "id", packageName);
            int iM204117a5 = m204117a(resources, "button", "id", packageName);
            int iM204117a6 = m204117a(resources, "buttonBg", "id", packageName);
            m213795l().setViewVisibility(iM204117a4, 0);
            m213795l().setTextViewText(iM204117a5, this.f191822o);
            m213795l().setOnClickPendingIntent(iM204117a4, this.f191823p);
            if (this.f191824q != 16777216) {
                int iM213793i = m213793i(70.0f);
                int iM213793i2 = m213793i(29.0f);
                m213795l().setImageViewBitmap(iM204117a6, C15031x.m88032a(m208741G(this.f191824q, iM213793i, iM213793i2, iM213793i2 / 2.0f)));
                m213795l().setTextColor(iM204117a5, m213801u(this.f191824q) ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
            }
        }
        int iM204117a7 = m204117a(resources, Constants.KEY_BG, "id", packageName);
        int iM204117a8 = m204117a(resources, "container", "id", packageName);
        if (this.f191820m != 16777216) {
            if (l4r0.m152817b(m204119c()) >= 10) {
                m213795l().setImageViewBitmap(iM204117a7, C15031x.m88032a(m208741G(this.f191820m, 984, 192, 30.0f)));
            } else {
                m213795l().setImageViewBitmap(iM204117a7, C15031x.m88032a(m208741G(this.f191820m, 984, 192, 0.0f)));
            }
            m208742K(m213795l(), iM204117a8, iM204117a2, iM204117a3, m213801u(this.f191820m));
        } else if (this.f191821n != null) {
            if (l4r0.m152817b(m204119c()) >= 10) {
                m213795l().setImageViewBitmap(iM204117a7, m213794k(this.f191821n, 30.0f));
            } else {
                m213795l().setImageViewBitmap(iM204117a7, this.f191821n);
            }
            Map<String, String> map = this.f196910g;
            if (map != null && this.f191825r == 16777216) {
                m208747M(map.get("notification_image_text_color"));
            }
            int i = this.f191825r;
            m208742K(m213795l(), iM204117a8, iM204117a2, iM204117a3, i == 16777216 || !m213801u(i));
        } else {
            m213795l().setViewVisibility(iM204117a, 8);
            m213795l().setViewVisibility(iM204117a7, 8);
            try {
                otq0.m169167e(this, "setStyle", t5r0.m189419c(m204119c(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                ouq0.m169393m("load class DecoratedCustomViewStyle failed");
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
        setCustomContentView(m213795l());
    }

    @Override // p153l.xzq0
    /* JADX INFO: renamed from: m */
    public String mo198856m() {
        return "notification_colorful";
    }

    @Override // p153l.xzq0
    /* JADX INFO: renamed from: t */
    public boolean mo198858t() {
        if (!l4r0.m152824i()) {
            return false;
        }
        Resources resources = m204119c().getResources();
        String packageName = m204119c().getPackageName();
        return (m204117a(resources, "icon", "id", packageName) == 0 || m204117a(resources, "title", "id", packageName) == 0 || m204117a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    @Override // p153l.xzq0
    /* JADX INFO: renamed from: v */
    public String mo198859v() {
        return "notification_colorful_copy";
    }
}
