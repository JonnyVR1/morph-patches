package p153l;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Landroid/app/Activity;", "", "transitionType", "", "c", "(Landroid/app/Activity;Ljava/lang/String;)V", "b", "(Landroid/app/Activity;)V", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "MKBusiness_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class v1r {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Integer m199048a(@NotNull String str) {
        str.getClass();
        if (TextUtils.isEmpty(str) || str.length() != 6) {
            return null;
        }
        if (!C15493d.m94374J(str, "#", false, 2, null)) {
            str = "#".concat(str);
        }
        return Integer.valueOf(Color.parseColor(str));
    }

    /* JADX INFO: renamed from: b */
    public static final void m199049b(@NotNull Activity activity) {
        activity.getClass();
        Object systemService = activity.getApplication().getSystemService("input_method");
        if (systemService == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m199050c(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                int i2 = c8c0.f80197c;
                int i3 = c8c0.f80196b;
                if (i == 1) {
                    i2 = 0;
                } else if (i == 2) {
                    i3 = 0;
                } else if (i == 3) {
                    i2 = 0;
                    i3 = 0;
                }
                activity.overridePendingTransition(i2, i3);
            } catch (Throwable th) {
                jzv.m147730c("initMKPanelAnimation", "", th);
            }
        }
    }
}
