package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, m87232d2 = {"Ll/unl;", "", "", "c", "()I", Constants.INAPP_DATA_TAG, FirebaseAnalytics.Param.LEVEL, "", "b", "(I)V", BannerFrequencyType.interval, "m", "h", "g", "setExposureCompensation", "fps", "n", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface unl {
    /* JADX INFO: renamed from: b */
    void mo124898b(int level);

    /* JADX INFO: renamed from: c */
    int mo124900c();

    /* JADX INFO: renamed from: d */
    int mo124902d();

    /* JADX INFO: renamed from: g */
    int mo124908g();

    /* JADX INFO: renamed from: h */
    int mo124909h();

    /* JADX INFO: renamed from: m */
    void mo124914m(int interval);

    /* JADX INFO: renamed from: n */
    void mo124915n(int fps);

    void setExposureCompensation(int level);
}
