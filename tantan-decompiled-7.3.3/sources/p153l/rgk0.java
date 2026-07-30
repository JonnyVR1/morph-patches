package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class rgk0 {

    /* JADX INFO: renamed from: a */
    public static final int f163020a = Color.parseColor("#2caae6");

    /* JADX INFO: renamed from: c */
    public static int m181450c(Profile profile, User user, List<Tag> list) {
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
            ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.pgk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            ArrayList arrayListM147522n2 = jyb.m147522n(profile.tags, new qcj() { // from class: l.qgk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            int iM147508g = (arrayListM147522n == null || arrayListM147522n2 == null) ? 0 : jyb.m147508g(arrayListM147522n, arrayListM147522n2);
            i += iM147508g;
            int i3 = iM147508g * 10000;
            iArr[i2] = i3;
            int size = i3 + ((arrayListM147522n2 == null ? 0 : arrayListM147522n2.size()) * 100);
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
    public static void m181451d(TextView textView, Gender gender, int i, boolean z, User user) {
        if (TEnum.equals(gender, "female")) {
            textView.setBackgroundDrawable(m181453f(z, Color.parseColor("#f3c9f5"), qa00.m175859d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(dbc0.f86231Hu), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(gender, "male")) {
            textView.setBackgroundDrawable(m181453f(z, Color.parseColor("#84b9f2"), qa00.m175859d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(dbc0.f86263Iu), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (CoreModule.f18264c.f20303E0.m141091z3(user)) {
            textView.setCompoundDrawablePadding(0);
            textView.setText("");
        } else {
            textView.setCompoundDrawablePadding(qa00.m175859d(3.0f));
            textView.setText(String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m181452e(VText vText, VText vText2, User user, User user2, boolean z) {
        if ((user2 == null || !(TEnum.equals(user2.source, "facebook") || user2.settings.hideMutualContacts().booleanValue())) && !user.profile.contactLookups.lookups.isEmpty()) {
            vText.setText(e1b.m118953K0(user.profile.contactLookups));
            vText.setBackgroundDrawable(m181453f(z, CoreModule.f18263b.getResources().getColor(c9c0.f80323B1), qa00.m175859d(4.0f)));
            vText.setVisibility(0);
        } else {
            vText.setVisibility(8);
        }
        if (NullChecker.m82487b(user2)) {
            m181454g(user2.profile, vText2, user, z);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m181453f(boolean z, int i, float f) {
        return z ? jde.m144406b(f163020a, f) : jde.m144406b(i, f);
    }

    /* JADX INFO: renamed from: g */
    public static void m181454g(Profile profile, VText vText, User user, boolean z) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.profile)) {
            int iM181450c = m181450c(profile, user, user.profile.tags);
            if (iM181450c == 0) {
                vText.setVisibility(8);
                return;
            }
            vText.setText(iM181450c + "");
            vText.setBackgroundDrawable(m181453f(z, CoreModule.f18263b.getResources().getColor(c9c0.f80323B1), (float) qa00.m175859d(4.0f)));
            vText.setVisibility(0);
        }
    }
}
