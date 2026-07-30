package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import org.greenrobot.greendao.converter.PropertyConverter;

/* JADX INFO: loaded from: classes7.dex */
public class wzf0 implements PropertyConverter<String[], String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String convertToDatabaseValue(String[] strArr) {
        return b0g0.m99773f(strArr, Constants.SEPARATOR_COMMA);
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String[] convertToEntityProperty(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b0g0.m99778k(str, Constants.SEPARATOR_COMMA);
    }
}
