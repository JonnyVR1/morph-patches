package p009l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.fce;
import l.rza;
import l.t100;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class l7k0 {

    /* JADX INFO: renamed from: a */
    public static final int f15980a = Color.parseColor("#2caae6");

    /* JADX INFO: renamed from: c */
    public static int m17719c(Profile profile, User user, List<Tag> list) {
        if (list == null || list.size() == 0 || profile.tags == null) {
            user.isThinProfile();
            return 0;
        }
        int length = Profile.TAG_CATEGORIES.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String[] strArr = Profile.TAG_CATEGORIES;
            final String str = strArr[i2];
            ArrayList arrayListN = vwb.n(list, new w9j() { // from class: l.j7k0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            ArrayList arrayListN2 = vwb.n(profile.tags, new w9j() { // from class: l.k7k0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            int iG = (arrayListN == null || arrayListN2 == null) ? 0 : vwb.g(arrayListN, arrayListN2);
            i += iG;
            int i3 = iG * 10000;
            iArr[i2] = i3;
            int size = i3 + ((arrayListN2 == null ? 0 : arrayListN2.size()) * 100);
            iArr[i2] = size;
            iArr[i2] = size + (strArr.length - i2);
        }
        int i4 = 9999;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            if (i6 > i4) {
                i4 = i6;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static void m17720d(TextView textView, Gender gender, int i, boolean z, User user) {
        if (TEnum.equals(gender, "female")) {
            textView.setBackgroundDrawable(m17722f(z, Color.parseColor("#f3c9f5"), t100.d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(x2c0.Tt), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(gender, "male")) {
            textView.setBackgroundDrawable(m17722f(z, Color.parseColor("#84b9f2"), t100.d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(x2c0.Ut), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (CoreModule.c.E0.z3(user)) {
            textView.setCompoundDrawablePadding(0);
            textView.setText("");
        } else {
            textView.setCompoundDrawablePadding(t100.d(3.0f));
            textView.setText(String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17721e(VText vText, VText vText2, User user, User user2, boolean z) {
        if ((user2 == null || !(TEnum.equals(user2.source, "facebook") || user2.settings.hideMutualContacts().booleanValue())) && !user.profile.contactLookups.lookups.isEmpty()) {
            vText.setText(rza.K0(user.profile.contactLookups));
            vText.setBackgroundDrawable(m17722f(z, CoreModule.b.getResources().getColor(w0c0.A1), t100.d(4.0f)));
            vText.setVisibility(0);
        } else {
            vText.setVisibility(8);
        }
        if (NullChecker.b(user2)) {
            m17723g(user2.profile, vText2, user, z);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m17722f(boolean z, int i, float f) {
        return z ? fce.b(f15980a, f) : fce.b(i, f);
    }

    /* JADX INFO: renamed from: g */
    public static void m17723g(Profile profile, VText vText, User user, boolean z) {
        if (NullChecker.a(user) && NullChecker.a(user.profile)) {
            int iM17719c = m17719c(profile, user, user.profile.tags);
            if (iM17719c == 0) {
                vText.setVisibility(8);
                return;
            }
            vText.setText(iM17719c + "");
            vText.setBackgroundDrawable(m17722f(z, CoreModule.b.getResources().getColor(w0c0.A1), (float) t100.d(4.0f)));
            vText.setVisibility(0);
        }
    }
}
