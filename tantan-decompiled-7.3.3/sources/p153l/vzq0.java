package p153l;

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
public class vzq0 extends Notification.Builder {

    /* JADX INFO: renamed from: a */
    private Context f186508a;

    public vzq0(Context context) {
        super(context);
        this.f186508a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m204117a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    /* JADX INFO: renamed from: b */
    public final int m204118b(String str) {
        return m204117a(m204119c().getResources(), str, "id", m204119c().getPackageName());
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo198855h();
        return super.build();
    }

    /* JADX INFO: renamed from: c */
    public Context m204119c() {
        return this.f186508a;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public vzq0 addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public vzq0 setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public vzq0 m204122f(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                otq0.m169167e(this, "setColor", Integer.valueOf(Color.parseColor(str)));
                return this;
            } catch (Exception e) {
                ouq0.m169378B("fail to set color. " + e);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void mo198855h() {
    }

    /* JADX INFO: renamed from: g */
    public vzq0 mo204123g(Map<String, String> map) {
        return this;
    }
}
