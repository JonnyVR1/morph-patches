package p149l;

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
public class oqq0 extends rqq0 {

    /* JADX INFO: renamed from: m */
    private Bitmap f145178m;

    /* JADX INFO: renamed from: n */
    private Bitmap f145179n;

    /* JADX INFO: renamed from: o */
    private int f145180o;

    public oqq0(Context context, String str) {
        super(context, str);
        this.f145180o = 16777216;
    }

    /* JADX INFO: renamed from: G */
    public oqq0 m165476G(Bitmap bitmap) {
        if (m180490y() && bitmap != null) {
            if (bitmap.getWidth() == 984 && 184 <= bitmap.getHeight() && bitmap.getHeight() <= 1678) {
                this.f145178m = bitmap;
                return this;
            }
            ilq0.m137040m("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public oqq0 m165477H(String str) {
        if (m180490y() && !TextUtils.isEmpty(str)) {
            try {
                this.f145180o = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                ilq0.m137040m("parse banner notification image text color error");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public oqq0 m165478I(Bitmap bitmap) {
        if (m180490y() && bitmap != null) {
            this.f145179n = bitmap;
        }
        return this;
    }

    @Override // p149l.rqq0, p149l.pqq0
    /* JADX INFO: renamed from: h */
    public void mo165479h() {
        if (!m180490y() || this.f145178m == null) {
            m180489x();
            return;
        }
        super.mo165479h();
        Resources resources = m170930c().getResources();
        String packageName = m170930c().getPackageName();
        int iM170928a = m170928a(resources, Constants.KEY_BG, "id", packageName);
        if (fvq0.m123348b(m170930c()) >= 10) {
            m180481l().setImageViewBitmap(iM170928a, m180480k(this.f145178m, 30.0f));
        } else {
            m180481l().setImageViewBitmap(iM170928a, this.f145178m);
        }
        int iM170928a2 = m170928a(resources, "icon", "id", packageName);
        if (this.f145179n != null) {
            m180481l().setImageViewBitmap(iM170928a2, this.f145179n);
        } else {
            m180485r(iM170928a2);
        }
        int iM170928a3 = m170928a(resources, "title", "id", packageName);
        m180481l().setTextViewText(iM170928a3, this.f160681e);
        Map<String, String> map = this.f160683g;
        if (map != null && this.f145180o == 16777216) {
            m165477H(map.get("notification_image_text_color"));
        }
        RemoteViews remoteViewsM180481l = m180481l();
        int i = this.f145180o;
        remoteViewsM180481l.setTextColor(iM170928a3, (i == 16777216 || !m180487u(i)) ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
        setCustomContentView(m180481l());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // p149l.rqq0
    /* JADX INFO: renamed from: m */
    public String mo165480m() {
        return "notification_banner";
    }

    @Override // p149l.rqq0
    /* JADX INFO: renamed from: t */
    public boolean mo165482t() {
        if (!fvq0.m123355i()) {
            return false;
        }
        Resources resources = m170930c().getResources();
        String packageName = m170930c().getPackageName();
        return (m170928a(m170930c().getResources(), Constants.KEY_BG, "id", m170930c().getPackageName()) == 0 || m170928a(resources, "icon", "id", packageName) == 0 || m170928a(resources, "title", "id", packageName) == 0 || fvq0.m123348b(m170930c()) < 9) ? false : true;
    }

    @Override // p149l.rqq0
    /* JADX INFO: renamed from: v */
    public String mo165483v() {
        return null;
    }

    @Override // p149l.rqq0, android.app.Notification.Builder
    /* JADX INFO: renamed from: p */
    public rqq0 setLargeIcon(Bitmap bitmap) {
        return this;
    }
}
