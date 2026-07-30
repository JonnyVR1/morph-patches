package bolts;

import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes.dex */
public enum AppLinkNavigation$NavigationResult {
    FAILED("failed", false),
    WEB(SchemeKey.web, true),
    APP("app", true);

    private String code;
    private boolean succeeded;

    AppLinkNavigation$NavigationResult(String str, boolean z) {
        this.code = str;
        this.succeeded = z;
    }

    public String getCode() {
        return this.code;
    }

    public boolean isSucceeded() {
        return this.succeeded;
    }
}
