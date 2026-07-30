package p149l;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ+\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m87232d2 = {"Ll/i100;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "", "b", "(Landroid/view/View;)Ljava/util/List;", "a", "indicators", UserMetadata.KEYDATA_FILENAME, "", "e", "(Ljava/util/List;Ljava/util/List;)Z", "text", Message.RULE, "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "indicator", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/util/List;)Z", "c", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class i100 {

    @NotNull
    public static final i100 INSTANCE = new i100();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<String> m133943a(@NotNull View view) {
        if (lsb.m151554d(i100.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupM106072j = ccl0.m106072j(view);
            if (viewGroupM106072j != null) {
                for (View view2 : ccl0.m106066b(viewGroupM106072j)) {
                    if (view != view2) {
                        arrayList.addAll(INSTANCE.m133947c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lsb.m151552b(th, i100.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<String> m133944b(@NotNull View view) {
        if (lsb.m151554d(i100.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(ccl0.m106071i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    String[] strArr = (String[]) new Regex("/").split(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            lsb.m151552b(th, i100.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m133945e(@NotNull List<String> indicators, @NotNull List<String> keys) {
        if (lsb.m151554d(i100.class)) {
            return false;
        }
        try {
            indicators.getClass();
            keys.getClass();
            Iterator<String> it = indicators.iterator();
            while (it.hasNext()) {
                if (INSTANCE.m133948d(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, i100.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m133946f(@NotNull String text, @NotNull String rule) {
        if (lsb.m151554d(i100.class)) {
            return false;
        }
        try {
            text.getClass();
            rule.getClass();
            return new Regex(rule).matches(text);
        } catch (Throwable th) {
            lsb.m151552b(th, i100.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m133947c(View view) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator<View> it = ccl0.m106066b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m133947c(it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m133948d(String indicator, List<String> keys) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                if (StringsKt.m93412P(indicator, it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}
