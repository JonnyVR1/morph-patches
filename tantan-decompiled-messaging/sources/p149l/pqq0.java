package p149l;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class pqq0 extends Notification.Builder {

    /* JADX INFO: renamed from: a */
    private Context f150812a;

    public pqq0(Context context) {
        super(context);
        this.f150812a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m170928a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    /* JADX INFO: renamed from: b */
    public final int m170929b(String str) {
        return m170928a(m170930c().getResources(), str, "id", m170930c().getPackageName());
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo165479h();
        return super.build();
    }

    /* JADX INFO: renamed from: c */
    public Context m170930c() {
        return this.f150812a;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public pqq0 addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public pqq0 setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public pqq0 m170933f(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ikq0.m136882e(this, "setColor", Integer.valueOf(Color.parseColor(str)));
                return this;
            } catch (Exception e) {
                ilq0.m137025B("fail to set color. " + e);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void mo165479h() {
    }

    /* JADX INFO: renamed from: g */
    public pqq0 mo170934g(Map<String, String> map) {
        return this;
    }
}
