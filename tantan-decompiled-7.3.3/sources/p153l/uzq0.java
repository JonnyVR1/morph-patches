package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class uzq0 extends xzq0 {

    /* JADX INFO: renamed from: m */
    private Bitmap f181801m;

    /* JADX INFO: renamed from: n */
    private Bitmap f181802n;

    /* JADX INFO: renamed from: o */
    private int f181803o;

    public uzq0(Context context, String str) {
        super(context, str);
        this.f181803o = 16777216;
    }

    /* JADX INFO: renamed from: G */
    public uzq0 m198852G(Bitmap bitmap) {
        if (m213804y() && bitmap != null) {
            if (bitmap.getWidth() == 984 && 184 <= bitmap.getHeight() && bitmap.getHeight() <= 1678) {
                this.f181801m = bitmap;
                return this;
            }
            ouq0.m169393m("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public uzq0 m198853H(String str) {
        if (m213804y() && !TextUtils.isEmpty(str)) {
            try {
                this.f181803o = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ouq0.m169393m("parse banner notification image text color error");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public uzq0 m198854I(Bitmap bitmap) {
        if (m213804y() && bitmap != null) {
            this.f181802n = bitmap;
        }
        return this;
    }

    @Override // p153l.xzq0, p153l.vzq0
    /* JADX INFO: renamed from: h */
    public void mo198855h() {
        if (!m213804y() || this.f181801m == null) {
            m213803x();
            return;
        }
        super.mo198855h();
        Resources resources = m204119c().getResources();
        String packageName = m204119c().getPackageName();
        int iM204117a = m204117a(resources, Constants.KEY_BG, "id", packageName);
        if (l4r0.m152817b(m204119c()) >= 10) {
            m213795l().setImageViewBitmap(iM204117a, m213794k(this.f181801m, 30.0f));
        } else {
            m213795l().setImageViewBitmap(iM204117a, this.f181801m);
        }
        int iM204117a2 = m204117a(resources, "icon", "id", packageName);
        if (this.f181802n != null) {
            m213795l().setImageViewBitmap(iM204117a2, this.f181802n);
        } else {
            m213799r(iM204117a2);
        }
        int iM204117a3 = m204117a(resources, "title", "id", packageName);
        m213795l().setTextViewText(iM204117a3, this.f196908e);
        Map<String, String> map = this.f196910g;
        if (map != null && this.f181803o == 16777216) {
            m198853H(map.get("notification_image_text_color"));
        }
        RemoteViews remoteViewsM213795l = m213795l();
        int i = this.f181803o;
        remoteViewsM213795l.setTextColor(iM204117a3, (i == 16777216 || !m213801u(i)) ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
        setCustomContentView(m213795l());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // p153l.xzq0
    /* JADX INFO: renamed from: m */
    public String mo198856m() {
        return "notification_banner";
    }

    @Override // p153l.xzq0
    /* JADX INFO: renamed from: t */
    public boolean mo198858t() {
        if (!l4r0.m152824i()) {
            return false;
        }
        Resources resources = m204119c().getResources();
        String packageName = m204119c().getPackageName();
        return (m204117a(m204119c().getResources(), Constants.KEY_BG, "id", m204119c().getPackageName()) == 0 || m204117a(resources, "icon", "id", packageName) == 0 || m204117a(resources, "title", "id", packageName) == 0 || l4r0.m152817b(m204119c()) < 9) ? false : true;
    }

    @Override // p153l.xzq0
    /* JADX INFO: renamed from: v */
    public String mo198859v() {
        return null;
    }

    @Override // p153l.xzq0, android.app.Notification.Builder
    /* JADX INFO: renamed from: p */
    public xzq0 setLargeIcon(Bitmap bitmap) {
        return this;
    }
}
