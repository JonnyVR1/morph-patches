package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class l7k0 {

    /* JADX INFO: renamed from: a */
    public static final int f126730a = Color.parseColor("#2caae6");

    /* JADX INFO: renamed from: c */
    public static int m148808c(Profile profile, User user, List<Tag> list) {
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
            ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.j7k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            ArrayList arrayListM200339n2 = vwb.m200339n(profile.tags, new w9j() { // from class: l.k7k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            int iM200325g = (arrayListM200339n == null || arrayListM200339n2 == null) ? 0 : vwb.m200325g(arrayListM200339n, arrayListM200339n2);
            i += iM200325g;
            int i3 = iM200325g * 10000;
            iArr[i2] = i3;
            int size = i3 + ((arrayListM200339n2 == null ? 0 : arrayListM200339n2.size()) * 100);
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
    public static void m148809d(TextView textView, Gender gender, int i, boolean z, User user) {
        if (TEnum.equals(gender, "female")) {
            textView.setBackgroundDrawable(m148811f(z, Color.parseColor("#f3c9f5"), t100.m186890d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(x2c0.f189778Tt), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(gender, "male")) {
            textView.setBackgroundDrawable(m148811f(z, Color.parseColor("#84b9f2"), t100.m186890d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(x2c0.f189809Ut), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (CoreModule.f17545c.f19561E0.m203803z3(user)) {
            textView.setCompoundDrawablePadding(0);
            textView.setText("");
        } else {
            textView.setCompoundDrawablePadding(t100.m186890d(3.0f));
            textView.setText(String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m148810e(VText vText, VText vText2, User user, User user2, boolean z) {
        if ((user2 == null || !(TEnum.equals(user2.source, "facebook") || user2.settings.hideMutualContacts().booleanValue())) && !user.profile.contactLookups.lookups.isEmpty()) {
            vText.setText(rza.m181731K0(user.profile.contactLookups));
            vText.setBackgroundDrawable(m148811f(z, CoreModule.f17544b.getResources().getColor(w0c0.f183751A1), t100.m186890d(4.0f)));
            vText.setVisibility(0);
        } else {
            vText.setVisibility(8);
        }
        if (NullChecker.m81304b(user2)) {
            m148812g(user2.profile, vText2, user, z);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m148811f(boolean z, int i, float f) {
        return z ? fce.m120425b(f126730a, f) : fce.m120425b(i, f);
    }

    /* JADX INFO: renamed from: g */
    public static void m148812g(Profile profile, VText vText, User user, boolean z) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile)) {
            int iM148808c = m148808c(profile, user, user.profile.tags);
            if (iM148808c == 0) {
                vText.setVisibility(8);
                return;
            }
            vText.setText(iM148808c + "");
            vText.setBackgroundDrawable(m148811f(z, CoreModule.f17544b.getResources().getColor(w0c0.f183751A1), (float) t100.m186890d(4.0f)));
            vText.setVisibility(0);
        }
    }
}
