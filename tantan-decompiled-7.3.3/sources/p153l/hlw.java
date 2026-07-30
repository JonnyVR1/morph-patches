package p153l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class hlw implements wam {

    /* JADX INFO: renamed from: a */
    private Activity f110540a;

    /* JADX INFO: renamed from: b */
    private ValueCallback<Uri> f110541b;

    /* JADX INFO: renamed from: c */
    private ValueCallback<Uri[]> f110542c;

    /* JADX INFO: renamed from: d */
    private wam.C21057a f110543d;

    /* JADX INFO: renamed from: e */
    private int f110544e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f110545f = true;

    public hlw(Activity activity) {
        this.f110540a = activity;
    }

    /* JADX INFO: renamed from: h */
    private String m135777h() {
        if (m135783n()) {
            return "video/*";
        }
        return m135782m() ? "image/*" : "*/*";
    }

    /* JADX INFO: renamed from: i */
    private void m135778i() {
        ValueCallback<Uri> valueCallback = this.f110541b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        ValueCallback<Uri[]> valueCallback2 = this.f110542c;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.f110541b = null;
        this.f110542c = null;
    }

    /* JADX INFO: renamed from: j */
    private boolean m135779j(Activity activity, Intent intent) {
        try {
            if (!this.f110545f || intent == null || intent.getData() == null) {
                return false;
            }
            String strM149874c = kii.m149874c(lv0.m155971a(), intent.getData());
            if (i8g0.m139000b(strM149874c)) {
                strM149874c = intent.getData().getPath();
            }
            String packageName = lv0.m155971a().getPackageName();
            String parent = activity.getFilesDir().getParent();
            String parent2 = activity.getExternalFilesDir(null).getParent();
            jzv.m147732e("WebChooseFileImpl", "originPath=" + strM149874c + " uri=" + intent.getData() + " uriPath=" + intent.getData().getPath() + "     innerPath=" + parent + "     outerPath=" + parent2);
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/Android/data/");
            sb.append(packageName);
            String string = sb.toString();
            if (activity.getFilesDir() == null || !i8g0.m139002d(strM149874c)) {
                return false;
            }
            if (!strM149874c.startsWith(parent) && !strM149874c.startsWith(parent2)) {
                if (!strM149874c.startsWith("/data/data/" + packageName) && !strM149874c.startsWith(string)) {
                    if (!strM149874c.startsWith("/root" + parent2) && !strM149874c.startsWith("/root".concat(string))) {
                        return false;
                    }
                }
            }
            jzv.m147732e("WebChooseFileImpl", "dealForbidPath=".concat(strM149874c));
            m135778i();
            return true;
        } catch (Throwable th) {
            jzv.m147731d("WebChooseFileImpl", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private Activity m135780k() {
        return this.f110540a;
    }

    /* JADX INFO: renamed from: l */
    private void m135781l() {
        wam.C21057a c21057a = this.f110543d;
        String[] strArrM205660a = c21057a != null ? c21057a.m205660a() : null;
        if (strArrM205660a == null || strArrM205660a.length <= 0) {
            return;
        }
        for (String str : strArrM205660a) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("video")) {
                    this.f110544e |= 16;
                } else if (str.contains("image")) {
                    this.f110544e |= 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m135782m() {
        return (this.f110544e & 1) == 1;
    }

    /* JADX INFO: renamed from: n */
    private boolean m135783n() {
        return (this.f110544e & 16) == 16;
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: a */
    public boolean mo135784a(int i, int i2, Intent intent) {
        Activity activityM135780k = m135780k();
        if (activityM135780k == null || activityM135780k.isFinishing() || i != 5429) {
            return false;
        }
        Uri data = (i2 != -1 || intent == null || intent.getData() == null) ? null : intent.getData();
        if (m135779j(activityM135780k, intent)) {
            return false;
        }
        ValueCallback<Uri> valueCallback = this.f110541b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(data);
        }
        ValueCallback<Uri[]> valueCallback2 = this.f110542c;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(data != null ? new Uri[]{data} : null);
        }
        this.f110541b = null;
        this.f110542c = null;
        return true;
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: b */
    public void mo135785b(ValueCallback<Uri> valueCallback, ValueCallback<Uri[]> valueCallback2) {
        this.f110541b = valueCallback;
        this.f110542c = valueCallback2;
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: c */
    public void mo135786c(wam.C21057a c21057a) {
        this.f110543d = c21057a;
        m135781l();
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: d */
    public boolean mo135787d() {
        return (this.f110541b == null && this.f110542c == null) ? false : true;
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: f */
    public void mo135789f() {
        Activity activityM135780k = m135780k();
        if (activityM135780k == null || activityM135780k.isFinishing()) {
            m135778i();
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(m135777h());
        activityM135780k.startActivityForResult(intent, 5429);
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: g */
    public void mo135790g() {
        this.f110540a = null;
        this.f110541b = null;
        this.f110542c = null;
        this.f110543d = null;
    }

    @Override // p153l.wam
    /* JADX INFO: renamed from: e */
    public void mo135788e(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
